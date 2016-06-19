
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voltagePerReactivePowerMultiplier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="voltagePerReactivePowerMultiplier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="k/M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "voltagePerReactivePowerMultiplier")
@XmlEnum
public enum VoltagePerReactivePowerMultiplier {

    @XmlEnumValue("k/M")
    K_M("k/M");
    private final String value;

    VoltagePerReactivePowerMultiplier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoltagePerReactivePowerMultiplier fromValue(String v) {
        for (VoltagePerReactivePowerMultiplier c: VoltagePerReactivePowerMultiplier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
