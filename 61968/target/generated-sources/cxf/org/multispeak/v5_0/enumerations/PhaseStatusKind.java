
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phaseStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phaseStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="VerifiedOpen"/>
 *     &lt;enumeration value="VerifiedClosedWithPower"/>
 *     &lt;enumeration value="VerifiedClosedNoPower"/>
 *     &lt;enumeration value="VerifiedBreak"/>
 *     &lt;enumeration value="NormalOrRestored"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phaseStatusKind")
@XmlEnum
public enum PhaseStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VerifiedOpen")
    VERIFIED_OPEN("VerifiedOpen"),
    @XmlEnumValue("VerifiedClosedWithPower")
    VERIFIED_CLOSED_WITH_POWER("VerifiedClosedWithPower"),
    @XmlEnumValue("VerifiedClosedNoPower")
    VERIFIED_CLOSED_NO_POWER("VerifiedClosedNoPower"),
    @XmlEnumValue("VerifiedBreak")
    VERIFIED_BREAK("VerifiedBreak"),
    @XmlEnumValue("NormalOrRestored")
    NORMAL_OR_RESTORED("NormalOrRestored"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PhaseStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhaseStatusKind fromValue(String v) {
        for (PhaseStatusKind c: PhaseStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
