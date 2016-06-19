
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weightUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="weightUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Pound"/>
 *     &lt;enumeration value="Kilogram"/>
 *     &lt;enumeration value="Gram"/>
 *     &lt;enumeration value="Centigram"/>
 *     &lt;enumeration value="Milligram"/>
 *     &lt;enumeration value="Microgram"/>
 *     &lt;enumeration value="Tonne"/>
 *     &lt;enumeration value="Grain"/>
 *     &lt;enumeration value="Ounce"/>
 *     &lt;enumeration value="Stone"/>
 *     &lt;enumeration value="LongTon"/>
 *     &lt;enumeration value="ShortTon"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "weightUnits")
@XmlEnum
public enum WeightUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Pound")
    POUND("Pound"),
    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),
    @XmlEnumValue("Gram")
    GRAM("Gram"),
    @XmlEnumValue("Centigram")
    CENTIGRAM("Centigram"),
    @XmlEnumValue("Milligram")
    MILLIGRAM("Milligram"),
    @XmlEnumValue("Microgram")
    MICROGRAM("Microgram"),
    @XmlEnumValue("Tonne")
    TONNE("Tonne"),
    @XmlEnumValue("Grain")
    GRAIN("Grain"),
    @XmlEnumValue("Ounce")
    OUNCE("Ounce"),
    @XmlEnumValue("Stone")
    STONE("Stone"),
    @XmlEnumValue("LongTon")
    LONG_TON("LongTon"),
    @XmlEnumValue("ShortTon")
    SHORT_TON("ShortTon"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    WeightUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightUnits fromValue(String v) {
        for (WeightUnits c: WeightUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
