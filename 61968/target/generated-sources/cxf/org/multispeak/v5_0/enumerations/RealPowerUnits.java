
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for realPowerUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="realPowerUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="kW"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="mW"/>
 *     &lt;enumeration value="microW"/>
 *     &lt;enumeration value="PerUnit"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "realPowerUnits")
@XmlEnum
public enum RealPowerUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    W("W"),
    @XmlEnumValue("kW")
    K_W("kW"),
    MW("MW"),
    GW("GW"),
    @XmlEnumValue("mW")
    M_W("mW"),
    @XmlEnumValue("microW")
    MICRO_W("microW"),
    @XmlEnumValue("PerUnit")
    PER_UNIT("PerUnit"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RealPowerUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealPowerUnits fromValue(String v) {
        for (RealPowerUnits c: RealPowerUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
