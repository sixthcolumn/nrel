
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frequencyUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="frequencyUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Hz"/>
 *     &lt;enumeration value="CyclesPerSecond"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "frequencyUnits")
@XmlEnum
public enum FrequencyUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Hz")
    HZ("Hz"),
    @XmlEnumValue("CyclesPerSecond")
    CYCLES_PER_SECOND("CyclesPerSecond"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FrequencyUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrequencyUnits fromValue(String v) {
        for (FrequencyUnits c: FrequencyUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
