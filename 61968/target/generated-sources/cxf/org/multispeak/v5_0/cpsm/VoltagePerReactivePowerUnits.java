
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voltagePerReactivePowerUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="voltagePerReactivePowerUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="V/VAr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "voltagePerReactivePowerUnits")
@XmlEnum
public enum VoltagePerReactivePowerUnits {

    @XmlEnumValue("V/VAr")
    V_V_AR("V/VAr");
    private final String value;

    VoltagePerReactivePowerUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoltagePerReactivePowerUnits fromValue(String v) {
        for (VoltagePerReactivePowerUnits c: VoltagePerReactivePowerUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
