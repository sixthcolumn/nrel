
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for durationDescription.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="durationDescription">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cycle"/>
 *     &lt;enumeration value="minute"/>
 *     &lt;enumeration value="hour"/>
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="week"/>
 *     &lt;enumeration value="month"/>
 *     &lt;enumeration value="year"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "durationDescription")
@XmlEnum
public enum DurationDescription {

    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("minute")
    MINUTE("minute"),
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("week")
    WEEK("week"),
    @XmlEnumValue("month")
    MONTH("month"),
    @XmlEnumValue("year")
    YEAR("year");
    private final String value;

    DurationDescription(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DurationDescription fromValue(String v) {
        for (DurationDescription c: DurationDescription.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
