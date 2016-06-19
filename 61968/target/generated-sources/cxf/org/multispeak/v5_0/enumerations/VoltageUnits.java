
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voltageUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="voltageUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="kV"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="GV"/>
 *     &lt;enumeration value="mV"/>
 *     &lt;enumeration value="microV"/>
 *     &lt;enumeration value="PerUnit"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "voltageUnits")
@XmlEnum
public enum VoltageUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    V("V"),
    @XmlEnumValue("kV")
    K_V("kV"),
    MV("MV"),
    GV("GV"),
    @XmlEnumValue("mV")
    M_V("mV"),
    @XmlEnumValue("microV")
    MICRO_V("microV"),
    @XmlEnumValue("PerUnit")
    PER_UNIT("PerUnit"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VoltageUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoltageUnits fromValue(String v) {
        for (VoltageUnits c: VoltageUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
