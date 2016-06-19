
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dayLabelKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dayLabelKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="Th"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="Sa"/>
 *     &lt;enumeration value="Su"/>
 *     &lt;enumeration value="Weekdays"/>
 *     &lt;enumeration value="WeekendDays"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dayLabelKind")
@XmlEnum
public enum DayLabelKind {


    /**
     * Monday
     * 
     */
    M("M"),

    /**
     * Tuesday
     * 
     */
    T("T"),

    /**
     * Wednesday
     * 
     */
    W("W"),

    /**
     * Thursday
     * 
     */
    @XmlEnumValue("Th")
    TH("Th"),

    /**
     * Friday
     * 
     */
    F("F"),

    /**
     * Saturday
     * 
     */
    @XmlEnumValue("Sa")
    SA("Sa"),

    /**
     * Sunday
     * 
     */
    @XmlEnumValue("Su")
    SU("Su"),
    @XmlEnumValue("Weekdays")
    WEEKDAYS("Weekdays"),
    @XmlEnumValue("WeekendDays")
    WEEKEND_DAYS("WeekendDays"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DayLabelKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayLabelKind fromValue(String v) {
        for (DayLabelKind c: DayLabelKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
