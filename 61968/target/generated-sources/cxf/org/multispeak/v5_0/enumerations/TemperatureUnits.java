
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temperatureUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="temperatureUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="degreesC"/>
 *     &lt;enumeration value="degreesK"/>
 *     &lt;enumeration value="degreesF"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "temperatureUnits")
@XmlEnum
public enum TemperatureUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("degreesC")
    DEGREES_C("degreesC"),
    @XmlEnumValue("degreesK")
    DEGREES_K("degreesK"),
    @XmlEnumValue("degreesF")
    DEGREES_F("degreesF"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TemperatureUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureUnits fromValue(String v) {
        for (TemperatureUnits c: TemperatureUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
