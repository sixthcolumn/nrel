
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="powerStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PowerOff"/>
 *     &lt;enumeration value="PowerOn"/>
 *     &lt;enumeration value="StatusUnknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "powerStatus")
@XmlEnum
public enum PowerStatus {

    @XmlEnumValue("PowerOff")
    POWER_OFF("PowerOff"),
    @XmlEnumValue("PowerOn")
    POWER_ON("PowerOn"),
    @XmlEnumValue("StatusUnknown")
    STATUS_UNKNOWN("StatusUnknown");
    private final String value;

    PowerStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerStatus fromValue(String v) {
        for (PowerStatus c: PowerStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
