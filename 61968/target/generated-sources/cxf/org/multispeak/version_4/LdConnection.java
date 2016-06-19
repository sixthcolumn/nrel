
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ldConnection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wye"/>
 *     &lt;enumeration value="Delta"/>
 *     &lt;enumeration value="Center tap"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ldConnection")
@XmlEnum
public enum LdConnection {

    @XmlEnumValue("Wye")
    WYE("Wye"),
    @XmlEnumValue("Delta")
    DELTA("Delta"),
    @XmlEnumValue("Center tap")
    CENTER_TAP("Center tap"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LdConnection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LdConnection fromValue(String v) {
        for (LdConnection c: LdConnection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
