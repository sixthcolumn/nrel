
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="frequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="AC 25Hz"/>
 *     &lt;enumeration value="AC 50Hz"/>
 *     &lt;enumeration value="AC 50-60Hz"/>
 *     &lt;enumeration value="AC 60Hz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "frequency")
@XmlEnum
public enum Frequency {

    DC("DC"),
    @XmlEnumValue("AC 25Hz")
    AC_25_HZ("AC 25Hz"),
    @XmlEnumValue("AC 50Hz")
    AC_50_HZ("AC 50Hz"),
    @XmlEnumValue("AC 50-60Hz")
    AC_50_60_HZ("AC 50-60Hz"),
    @XmlEnumValue("AC 60Hz")
    AC_60_HZ("AC 60Hz");
    private final String value;

    Frequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Frequency fromValue(String v) {
        for (Frequency c: Frequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
