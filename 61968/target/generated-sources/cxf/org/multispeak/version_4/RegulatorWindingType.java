
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regulatorWindingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regulatorWindingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regulatorWindingType")
@XmlEnum
public enum RegulatorWindingType {

    A("A"),
    B("B"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RegulatorWindingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegulatorWindingType fromValue(String v) {
        for (RegulatorWindingType c: RegulatorWindingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
