
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for angleUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="angleUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Degrees"/>
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Seconds"/>
 *     &lt;enumeration value="Radians"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "angleUnits")
@XmlEnum
public enum AngleUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Degrees")
    DEGREES("Degrees"),
    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("Seconds")
    SECONDS("Seconds"),
    @XmlEnumValue("Radians")
    RADIANS("Radians"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AngleUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AngleUnits fromValue(String v) {
        for (AngleUnits c: AngleUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
