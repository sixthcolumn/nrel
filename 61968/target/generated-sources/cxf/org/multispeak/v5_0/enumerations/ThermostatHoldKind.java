
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermostatHoldKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thermostatHoldKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Override"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Vacation"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thermostatHoldKind")
@XmlEnum
public enum ThermostatHoldKind {

    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Override")
    OVERRIDE("Override"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Vacation")
    VACATION("Vacation"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ThermostatHoldKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermostatHoldKind fromValue(String v) {
        for (ThermostatHoldKind c: ThermostatHoldKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
