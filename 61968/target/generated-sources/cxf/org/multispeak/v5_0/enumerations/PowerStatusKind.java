
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="powerStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StatusUnknown"/>
 *     &lt;enumeration value="PowerOff"/>
 *     &lt;enumeration value="PowerOn"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "powerStatusKind")
@XmlEnum
public enum PowerStatusKind {

    @XmlEnumValue("StatusUnknown")
    STATUS_UNKNOWN("StatusUnknown"),
    @XmlEnumValue("PowerOff")
    POWER_OFF("PowerOff"),
    @XmlEnumValue("PowerOn")
    POWER_ON("PowerOn"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PowerStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerStatusKind fromValue(String v) {
        for (PowerStatusKind c: PowerStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
