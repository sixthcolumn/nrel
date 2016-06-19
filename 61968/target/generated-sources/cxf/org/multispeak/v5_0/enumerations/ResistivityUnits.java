
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resistivityUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resistivityUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OhmMeter"/>
 *     &lt;enumeration value="OhmInch"/>
 *     &lt;enumeration value="OhmCentimeter"/>
 *     &lt;enumeration value="MicroOhmCentimeter"/>
 *     &lt;enumeration value="MicroOhmInch"/>
 *     &lt;enumeration value="StatOhmCentimeter"/>
 *     &lt;enumeration value="AbOhmCentimeterCircular"/>
 *     &lt;enumeration value="CircularMilOhmPerFoot"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resistivityUnits")
@XmlEnum
public enum ResistivityUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("OhmMeter")
    OHM_METER("OhmMeter"),
    @XmlEnumValue("OhmInch")
    OHM_INCH("OhmInch"),
    @XmlEnumValue("OhmCentimeter")
    OHM_CENTIMETER("OhmCentimeter"),
    @XmlEnumValue("MicroOhmCentimeter")
    MICRO_OHM_CENTIMETER("MicroOhmCentimeter"),
    @XmlEnumValue("MicroOhmInch")
    MICRO_OHM_INCH("MicroOhmInch"),
    @XmlEnumValue("StatOhmCentimeter")
    STAT_OHM_CENTIMETER("StatOhmCentimeter"),
    @XmlEnumValue("AbOhmCentimeterCircular")
    AB_OHM_CENTIMETER_CIRCULAR("AbOhmCentimeterCircular"),
    @XmlEnumValue("CircularMilOhmPerFoot")
    CIRCULAR_MIL_OHM_PER_FOOT("CircularMilOhmPerFoot"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResistivityUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResistivityUnits fromValue(String v) {
        for (ResistivityUnits c: ResistivityUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
