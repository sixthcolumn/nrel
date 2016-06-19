
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thicknessUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="thicknessUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Mils"/>
 *     &lt;enumeration value="Inches"/>
 *     &lt;enumeration value="Micrometers"/>
 *     &lt;enumeration value="Millimeters"/>
 *     &lt;enumeration value="Centimeters"/>
 *     &lt;enumeration value="Microns"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "thicknessUnits")
@XmlEnum
public enum ThicknessUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Mils")
    MILS("Mils"),
    @XmlEnumValue("Inches")
    INCHES("Inches"),
    @XmlEnumValue("Micrometers")
    MICROMETERS("Micrometers"),
    @XmlEnumValue("Millimeters")
    MILLIMETERS("Millimeters"),
    @XmlEnumValue("Centimeters")
    CENTIMETERS("Centimeters"),
    @XmlEnumValue("Microns")
    MICRONS("Microns"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ThicknessUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThicknessUnits fromValue(String v) {
        for (ThicknessUnits c: ThicknessUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
