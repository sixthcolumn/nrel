
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measurementPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="measurementPeriod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Previous"/>
 *     &lt;enumeration value="Previous Season"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "measurementPeriod")
@XmlEnum
public enum MeasurementPeriod {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),
    @XmlEnumValue("Previous Season")
    PREVIOUS_SEASON("Previous Season");
    private final String value;

    MeasurementPeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementPeriod fromValue(String v) {
        for (MeasurementPeriod c: MeasurementPeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
