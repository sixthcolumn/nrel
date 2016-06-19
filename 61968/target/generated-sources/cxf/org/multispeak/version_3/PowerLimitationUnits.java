
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerLimitationUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="powerLimitationUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kW"/>
 *     &lt;enumeration value="kWh"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "powerLimitationUnits")
@XmlEnum
public enum PowerLimitationUnits {

    @XmlEnumValue("kW")
    K_W("kW"),
    @XmlEnumValue("kWh")
    K_WH("kWh"),
    A("A");
    private final String value;

    PowerLimitationUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerLimitationUnits fromValue(String v) {
        for (PowerLimitationUnits c: PowerLimitationUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
