
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sVCControlMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sVCControlMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReactivePower"/>
 *     &lt;enumeration value="Voltage"/>
 *     &lt;enumeration value="Off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sVCControlMode")
@XmlEnum
public enum SVCControlMode {

    @XmlEnumValue("ReactivePower")
    REACTIVE_POWER("ReactivePower"),
    @XmlEnumValue("Voltage")
    VOLTAGE("Voltage"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    SVCControlMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SVCControlMode fromValue(String v) {
        for (SVCControlMode c: SVCControlMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
