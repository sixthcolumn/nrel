
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermostatFanStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thermostatFanStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Cycle"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thermostatFanStatusKind")
@XmlEnum
public enum ThermostatFanStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Cycle")
    CYCLE("Cycle"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ThermostatFanStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermostatFanStatusKind fromValue(String v) {
        for (ThermostatFanStatusKind c: ThermostatFanStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
