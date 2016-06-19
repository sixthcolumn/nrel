
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deviceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="OutofService"/>
 *     &lt;enumeration value="PowerLimitation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deviceStatus")
@XmlEnum
public enum DeviceStatus {

    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("OutofService")
    OUTOF_SERVICE("OutofService"),
    @XmlEnumValue("PowerLimitation")
    POWER_LIMITATION("PowerLimitation");
    private final String value;

    DeviceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceStatus fromValue(String v) {
        for (DeviceStatus c: DeviceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}