
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermostatModeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thermostatModeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Heat"/>
 *     &lt;enumeration value="Cool"/>
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thermostatModeKind")
@XmlEnum
public enum ThermostatModeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Heat")
    HEAT("Heat"),
    @XmlEnumValue("Cool")
    COOL("Cool"),
    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ThermostatModeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermostatModeKind fromValue(String v) {
        for (ThermostatModeKind c: ThermostatModeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
