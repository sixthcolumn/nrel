
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeSpan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeSpan">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="specifiedStartStop"/>
 *     &lt;enumeration value="instantaneous"/>
 *     &lt;enumeration value="perCycle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeSpan")
@XmlEnum
public enum TimeSpan {

    @XmlEnumValue("specifiedStartStop")
    SPECIFIED_START_STOP("specifiedStartStop"),
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("perCycle")
    PER_CYCLE("perCycle");
    private final String value;

    TimeSpan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeSpan fromValue(String v) {
        for (TimeSpan c: TimeSpan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}