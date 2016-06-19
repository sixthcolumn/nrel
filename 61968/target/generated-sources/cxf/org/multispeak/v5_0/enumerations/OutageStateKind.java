
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageStateKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Assumed"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Restored"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="UnidentifiedLocation"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageStateKind")
@XmlEnum
public enum OutageStateKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Assumed")
    ASSUMED("Assumed"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Restored")
    RESTORED("Restored"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("UnidentifiedLocation")
    UNIDENTIFIED_LOCATION("UnidentifiedLocation"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageStateKind fromValue(String v) {
        for (OutageStateKind c: OutageStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
