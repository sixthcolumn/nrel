
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pressureUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pressureUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Pascal"/>
 *     &lt;enumeration value="NewtonPerSquareMeter"/>
 *     &lt;enumeration value="PSI"/>
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="Barye"/>
 *     &lt;enumeration value="Atmosphere"/>
 *     &lt;enumeration value="Millibar"/>
 *     &lt;enumeration value="InchOfHg"/>
 *     &lt;enumeration value="MillimeterOfHg"/>
 *     &lt;enumeration value="InchOfWater"/>
 *     &lt;enumeration value="MillimeterOfWater"/>
 *     &lt;enumeration value="Kip"/>
 *     &lt;enumeration value="PoundForce"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pressureUnits")
@XmlEnum
public enum PressureUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Pascal")
    PASCAL("Pascal"),
    @XmlEnumValue("NewtonPerSquareMeter")
    NEWTON_PER_SQUARE_METER("NewtonPerSquareMeter"),
    PSI("PSI"),
    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("Barye")
    BARYE("Barye"),
    @XmlEnumValue("Atmosphere")
    ATMOSPHERE("Atmosphere"),
    @XmlEnumValue("Millibar")
    MILLIBAR("Millibar"),
    @XmlEnumValue("InchOfHg")
    INCH_OF_HG("InchOfHg"),
    @XmlEnumValue("MillimeterOfHg")
    MILLIMETER_OF_HG("MillimeterOfHg"),
    @XmlEnumValue("InchOfWater")
    INCH_OF_WATER("InchOfWater"),
    @XmlEnumValue("MillimeterOfWater")
    MILLIMETER_OF_WATER("MillimeterOfWater"),
    @XmlEnumValue("Kip")
    KIP("Kip"),
    @XmlEnumValue("PoundForce")
    POUND_FORCE("PoundForce"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PressureUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureUnits fromValue(String v) {
        for (PressureUnits c: PressureUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
