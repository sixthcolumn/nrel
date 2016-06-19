
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="guyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="DoubleDown"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "guyType")
@XmlEnum
public enum GuyType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("DoubleDown")
    DOUBLE_DOWN("DoubleDown"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    GuyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuyType fromValue(String v) {
        for (GuyType c: GuyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
