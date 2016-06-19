
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationOutageStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="locationOutageStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Assumed"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Restored"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="StillOut"/>
 *     &lt;enumeration value="NonPay"/>
 *     &lt;enumeration value="NoOutage"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "locationOutageStatusKind")
@XmlEnum
public enum LocationOutageStatusKind {

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
    @XmlEnumValue("StillOut")
    STILL_OUT("StillOut"),
    @XmlEnumValue("NonPay")
    NON_PAY("NonPay"),
    @XmlEnumValue("NoOutage")
    NO_OUTAGE("NoOutage"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LocationOutageStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationOutageStatusKind fromValue(String v) {
        for (LocationOutageStatusKind c: LocationOutageStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
