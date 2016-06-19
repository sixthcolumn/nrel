
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Overhead"/>
 *     &lt;enumeration value="Underground"/>
 *     &lt;enumeration value="ZsmConductor"/>
 *     &lt;enumeration value="ZabcConductor"/>
 *     &lt;enumeration value="Transformer"/>
 *     &lt;enumeration value="Regulator"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deviceType")
@XmlEnum
public enum DeviceType {

    @XmlEnumValue("Overhead")
    OVERHEAD("Overhead"),
    @XmlEnumValue("Underground")
    UNDERGROUND("Underground"),
    @XmlEnumValue("ZsmConductor")
    ZSM_CONDUCTOR("ZsmConductor"),
    @XmlEnumValue("ZabcConductor")
    ZABC_CONDUCTOR("ZabcConductor"),
    @XmlEnumValue("Transformer")
    TRANSFORMER("Transformer"),
    @XmlEnumValue("Regulator")
    REGULATOR("Regulator"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
