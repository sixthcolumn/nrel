
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premisesDisplayMessageStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="premisesDisplayMessageStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Displayed"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "premisesDisplayMessageStatusKind")
@XmlEnum
public enum PremisesDisplayMessageStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Message has been accepted for display
     * 
     */
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),

    /**
     * Message has been cancelled
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * Message has been displayed
     * 
     */
    @XmlEnumValue("Displayed")
    DISPLAYED("Displayed"),

    /**
     * Message has been removed from the display screen. This will usually indicate that some other message has been displayed.
     * 
     */
    @XmlEnumValue("Off")
    OFF("Off"),

    /**
     * Message duration has expired. The message (if displayed) is removed from the display screen. 
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PremisesDisplayMessageStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PremisesDisplayMessageStatusKind fromValue(String v) {
        for (PremisesDisplayMessageStatusKind c: PremisesDisplayMessageStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
