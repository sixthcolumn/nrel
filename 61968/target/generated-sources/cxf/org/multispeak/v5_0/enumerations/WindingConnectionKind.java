
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windingConnectionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="windingConnectionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Delta"/>
 *     &lt;enumeration value="Wye"/>
 *     &lt;enumeration value="Zigzag"/>
 *     &lt;enumeration value="Center tap"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "windingConnectionKind")
@XmlEnum
public enum WindingConnectionKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Delta")
    DELTA("Delta"),
    @XmlEnumValue("Wye")
    WYE("Wye"),
    @XmlEnumValue("Zigzag")
    ZIGZAG("Zigzag"),
    @XmlEnumValue("Center tap")
    CENTER_TAP("Center tap"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    WindingConnectionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WindingConnectionKind fromValue(String v) {
        for (WindingConnectionKind c: WindingConnectionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
