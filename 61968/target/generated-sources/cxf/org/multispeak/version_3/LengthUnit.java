
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lengthUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lengthUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Meters"/>
 *     &lt;enumeration value="Thousand Feet"/>
 *     &lt;enumeration value="Thousand Meters"/>
 *     &lt;enumeration value="Miles"/>
 *     &lt;enumeration value="Inches"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lengthUnit")
@XmlEnum
public enum LengthUnit {

    @XmlEnumValue("Feet")
    FEET("Feet"),
    @XmlEnumValue("Meters")
    METERS("Meters"),
    @XmlEnumValue("Thousand Feet")
    THOUSAND_FEET("Thousand Feet"),
    @XmlEnumValue("Thousand Meters")
    THOUSAND_METERS("Thousand Meters"),
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Inches")
    INCHES("Inches");
    private final String value;

    LengthUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnit fromValue(String v) {
        for (LengthUnit c: LengthUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
