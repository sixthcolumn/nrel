
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Ohms"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="PerUnit"/>
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zUnits")
@XmlEnum
public enum ZUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Ohms")
    OHMS("Ohms"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("PerUnit")
    PER_UNIT("PerUnit"),
    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ZUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZUnits fromValue(String v) {
        for (ZUnits c: ZUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
