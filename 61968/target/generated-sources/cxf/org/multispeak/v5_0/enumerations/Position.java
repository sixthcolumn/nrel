
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for position.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="position">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NormallyOpen"/>
 *     &lt;enumeration value="NormallyClosed"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "position")
@XmlEnum
public enum Position {

    @XmlEnumValue("NormallyOpen")
    NORMALLY_OPEN("NormallyOpen"),
    @XmlEnumValue("NormallyClosed")
    NORMALLY_CLOSED("NormallyClosed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    Position(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Position fromValue(String v) {
        for (Position c: Position.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
