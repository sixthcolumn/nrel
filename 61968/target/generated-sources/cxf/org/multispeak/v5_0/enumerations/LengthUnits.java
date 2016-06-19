
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lengthUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lengthUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Mils"/>
 *     &lt;enumeration value="Inches"/>
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Yards"/>
 *     &lt;enumeration value="ThousandFeet"/>
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="Micrometers"/>
 *     &lt;enumeration value="Millimeters"/>
 *     &lt;enumeration value="Decimeters"/>
 *     &lt;enumeration value="Centimeters"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="HundredMeters"/>
 *     &lt;enumeration value="Kilometers"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lengthUnits")
@XmlEnum
public enum LengthUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Mils")
    MILS("Mils"),
    @XmlEnumValue("Inches")
    INCHES("Inches"),
    @XmlEnumValue("Feet")
    FEET("Feet"),
    @XmlEnumValue("Yards")
    YARDS("Yards"),
    @XmlEnumValue("ThousandFeet")
    THOUSAND_FEET("ThousandFeet"),
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Micrometers")
    MICROMETERS("Micrometers"),
    @XmlEnumValue("Millimeters")
    MILLIMETERS("Millimeters"),
    @XmlEnumValue("Decimeters")
    DECIMETERS("Decimeters"),
    @XmlEnumValue("Centimeters")
    CENTIMETERS("Centimeters"),
    @XmlEnumValue("Meters")
    METERS("Meters"),
    @XmlEnumValue("HundredMeters")
    HUNDRED_METERS("HundredMeters"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LengthUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnits fromValue(String v) {
        for (LengthUnits c: LengthUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
