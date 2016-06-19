
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Milliseconds"/>
 *     &lt;enumeration value="Seconds"/>
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Weeks"/>
 *     &lt;enumeration value="Months"/>
 *     &lt;enumeration value="Years"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeUnits")
@XmlEnum
public enum TimeUnits {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Milliseconds")
    MILLISECONDS("Milliseconds"),
    @XmlEnumValue("Seconds")
    SECONDS("Seconds"),
    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Years")
    YEARS("Years"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TimeUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnits fromValue(String v) {
        for (TimeUnits c: TimeUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
