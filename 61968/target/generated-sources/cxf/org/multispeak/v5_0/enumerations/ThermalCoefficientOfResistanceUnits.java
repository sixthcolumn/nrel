
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermalCoefficientOfResistanceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thermalCoefficientOfResistanceUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ReciprocalDegreesC"/>
 *     &lt;enumeration value="ReciprocalDegreesK"/>
 *     &lt;enumeration value="ReciprocalDegreesF"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thermalCoefficientOfResistanceUnits")
@XmlEnum
public enum ThermalCoefficientOfResistanceUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ReciprocalDegreesC")
    RECIPROCAL_DEGREES_C("ReciprocalDegreesC"),
    @XmlEnumValue("ReciprocalDegreesK")
    RECIPROCAL_DEGREES_K("ReciprocalDegreesK"),
    @XmlEnumValue("ReciprocalDegreesF")
    RECIPROCAL_DEGREES_F("ReciprocalDegreesF"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ThermalCoefficientOfResistanceUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalCoefficientOfResistanceUnits fromValue(String v) {
        for (ThermalCoefficientOfResistanceUnits c: ThermalCoefficientOfResistanceUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
