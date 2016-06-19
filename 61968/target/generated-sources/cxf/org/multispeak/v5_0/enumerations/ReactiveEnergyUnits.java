
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reactiveEnergyUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reactiveEnergyUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="VArh"/>
 *     &lt;enumeration value="KVArh"/>
 *     &lt;enumeration value="MVArh"/>
 *     &lt;enumeration value="GVArh"/>
 *     &lt;enumeration value="mVArh"/>
 *     &lt;enumeration value="microVArh"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reactiveEnergyUnits")
@XmlEnum
public enum ReactiveEnergyUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VArh")
    V_ARH("VArh"),
    @XmlEnumValue("KVArh")
    KV_ARH("KVArh"),
    @XmlEnumValue("MVArh")
    MV_ARH("MVArh"),
    @XmlEnumValue("GVArh")
    GV_ARH("GVArh"),
    @XmlEnumValue("mVArh")
    M_V_ARH("mVArh"),
    @XmlEnumValue("microVArh")
    MICRO_V_ARH("microVArh"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ReactiveEnergyUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReactiveEnergyUnits fromValue(String v) {
        for (ReactiveEnergyUnits c: ReactiveEnergyUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
