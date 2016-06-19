
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialUnitsKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="materialUnitsKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="Inches"/>
 *     &lt;enumeration value="Pounds"/>
 *     &lt;enumeration value="Kilograms"/>
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="ThousandFeet"/>
 *     &lt;enumeration value="Kilometers"/>
 *     &lt;enumeration value="Pair"/>
 *     &lt;enumeration value="Each"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="DoNotChange"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "materialUnitsKind")
@XmlEnum
public enum MaterialUnitsKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Feet")
    FEET("Feet"),
    @XmlEnumValue("Meters")
    METERS("Meters"),
    @XmlEnumValue("Inches")
    INCHES("Inches"),
    @XmlEnumValue("Pounds")
    POUNDS("Pounds"),
    @XmlEnumValue("Kilograms")
    KILOGRAMS("Kilograms"),
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("ThousandFeet")
    THOUSAND_FEET("ThousandFeet"),
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers"),
    @XmlEnumValue("Pair")
    PAIR("Pair"),
    @XmlEnumValue("Each")
    EACH("Each"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("DoNotChange")
    DO_NOT_CHANGE("DoNotChange"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MaterialUnitsKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialUnitsKind fromValue(String v) {
        for (MaterialUnitsKind c: MaterialUnitsKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
