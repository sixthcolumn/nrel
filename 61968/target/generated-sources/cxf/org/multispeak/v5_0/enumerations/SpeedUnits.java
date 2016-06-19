
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speedUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="speedUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="mph"/>
 *     &lt;enumeration value="feetPerSecond"/>
 *     &lt;enumeration value="kmPerHour"/>
 *     &lt;enumeration value="kmPerSecond"/>
 *     &lt;enumeration value="mPerSecond"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "speedUnits")
@XmlEnum
public enum SpeedUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("mph")
    MPH("mph"),
    @XmlEnumValue("feetPerSecond")
    FEET_PER_SECOND("feetPerSecond"),
    @XmlEnumValue("kmPerHour")
    KM_PER_HOUR("kmPerHour"),
    @XmlEnumValue("kmPerSecond")
    KM_PER_SECOND("kmPerSecond"),
    @XmlEnumValue("mPerSecond")
    M_PER_SECOND("mPerSecond"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SpeedUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedUnits fromValue(String v) {
        for (SpeedUnits c: SpeedUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
