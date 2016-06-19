
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="materialUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="Inches"/>
 *     &lt;enumeration value="Pounds"/>
 *     &lt;enumeration value="Kilograms"/>
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="ThousandFeet"/>
 *     &lt;enumeration value="Pair"/>
 *     &lt;enumeration value="Each"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "materialUnits")
@XmlEnum
public enum MaterialUnits {

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
    @XmlEnumValue("Pair")
    PAIR("Pair"),
    @XmlEnumValue("Each")
    EACH("Each"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MaterialUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialUnits fromValue(String v) {
        for (MaterialUnits c: MaterialUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
