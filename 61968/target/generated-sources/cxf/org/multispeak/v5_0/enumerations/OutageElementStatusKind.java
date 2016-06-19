
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageElementStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outageElementStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="VerifiedOpen"/>
 *     &lt;enumeration value="VerifiedBreak"/>
 *     &lt;enumeration value="VerifiedClosedNoPower"/>
 *     &lt;enumeration value="VerifiedClosedWithPower"/>
 *     &lt;enumeration value="TempOpen"/>
 *     &lt;enumeration value="TempBreak"/>
 *     &lt;enumeration value="TempClosed"/>
 *     &lt;enumeration value="NormalOrRestored"/>
 *     &lt;enumeration value="NoChange"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outageElementStatusKind")
@XmlEnum
public enum OutageElementStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VerifiedOpen")
    VERIFIED_OPEN("VerifiedOpen"),
    @XmlEnumValue("VerifiedBreak")
    VERIFIED_BREAK("VerifiedBreak"),
    @XmlEnumValue("VerifiedClosedNoPower")
    VERIFIED_CLOSED_NO_POWER("VerifiedClosedNoPower"),
    @XmlEnumValue("VerifiedClosedWithPower")
    VERIFIED_CLOSED_WITH_POWER("VerifiedClosedWithPower"),
    @XmlEnumValue("TempOpen")
    TEMP_OPEN("TempOpen"),
    @XmlEnumValue("TempBreak")
    TEMP_BREAK("TempBreak"),
    @XmlEnumValue("TempClosed")
    TEMP_CLOSED("TempClosed"),
    @XmlEnumValue("NormalOrRestored")
    NORMAL_OR_RESTORED("NormalOrRestored"),
    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OutageElementStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutageElementStatusKind fromValue(String v) {
        for (OutageElementStatusKind c: OutageElementStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
