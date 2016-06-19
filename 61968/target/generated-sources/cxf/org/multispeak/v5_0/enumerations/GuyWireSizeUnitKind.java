
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guyWireSizeUnitKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="guyWireSizeUnitKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Inches"/>
 *     &lt;enumeration value="Millimeters"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "guyWireSizeUnitKind")
@XmlEnum
public enum GuyWireSizeUnitKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Guy wire diameter, measured in inches.  The suggested format is "1/4", "5/16", "3/8", etc.
     * 
     */
    @XmlEnumValue("Inches")
    INCHES("Inches"),

    /**
     * Guy wire diameter measured in millimeters.
     * 
     */
    @XmlEnumValue("Millimeters")
    MILLIMETERS("Millimeters"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    GuyWireSizeUnitKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GuyWireSizeUnitKind fromValue(String v) {
        for (GuyWireSizeUnitKind c: GuyWireSizeUnitKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
