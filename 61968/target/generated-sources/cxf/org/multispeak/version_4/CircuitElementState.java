
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for circuitElementState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="circuitElementState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PossibleBreak"/>
 *     &lt;enumeration value="PossibleClosed"/>
 *     &lt;enumeration value="PossibleOpen"/>
 *     &lt;enumeration value="PredictedBreak"/>
 *     &lt;enumeration value="PredictedClosed"/>
 *     &lt;enumeration value="PredictedOpen"/>
 *     &lt;enumeration value="TempBreak"/>
 *     &lt;enumeration value="TempClosed"/>
 *     &lt;enumeration value="TempOpen"/>
 *     &lt;enumeration value="UplineTempBreak"/>
 *     &lt;enumeration value="UplineTempClosed"/>
 *     &lt;enumeration value="UplineTempOpen"/>
 *     &lt;enumeration value="UplineVerifiedClosedNoPower"/>
 *     &lt;enumeration value="VerifiedBreak"/>
 *     &lt;enumeration value="VerifiedClosedNoPower"/>
 *     &lt;enumeration value="VerifiedClosedWithPower"/>
 *     &lt;enumeration value="VerifiedOpen"/>
 *     &lt;enumeration value="NormalOrRestored"/>
 *     &lt;enumeration value="NoChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "circuitElementState")
@XmlEnum
public enum CircuitElementState {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("PossibleBreak")
    POSSIBLE_BREAK("PossibleBreak"),
    @XmlEnumValue("PossibleClosed")
    POSSIBLE_CLOSED("PossibleClosed"),
    @XmlEnumValue("PossibleOpen")
    POSSIBLE_OPEN("PossibleOpen"),
    @XmlEnumValue("PredictedBreak")
    PREDICTED_BREAK("PredictedBreak"),
    @XmlEnumValue("PredictedClosed")
    PREDICTED_CLOSED("PredictedClosed"),
    @XmlEnumValue("PredictedOpen")
    PREDICTED_OPEN("PredictedOpen"),
    @XmlEnumValue("TempBreak")
    TEMP_BREAK("TempBreak"),
    @XmlEnumValue("TempClosed")
    TEMP_CLOSED("TempClosed"),
    @XmlEnumValue("TempOpen")
    TEMP_OPEN("TempOpen"),
    @XmlEnumValue("UplineTempBreak")
    UPLINE_TEMP_BREAK("UplineTempBreak"),
    @XmlEnumValue("UplineTempClosed")
    UPLINE_TEMP_CLOSED("UplineTempClosed"),
    @XmlEnumValue("UplineTempOpen")
    UPLINE_TEMP_OPEN("UplineTempOpen"),
    @XmlEnumValue("UplineVerifiedClosedNoPower")
    UPLINE_VERIFIED_CLOSED_NO_POWER("UplineVerifiedClosedNoPower"),
    @XmlEnumValue("VerifiedBreak")
    VERIFIED_BREAK("VerifiedBreak"),
    @XmlEnumValue("VerifiedClosedNoPower")
    VERIFIED_CLOSED_NO_POWER("VerifiedClosedNoPower"),
    @XmlEnumValue("VerifiedClosedWithPower")
    VERIFIED_CLOSED_WITH_POWER("VerifiedClosedWithPower"),
    @XmlEnumValue("VerifiedOpen")
    VERIFIED_OPEN("VerifiedOpen"),
    @XmlEnumValue("NormalOrRestored")
    NORMAL_OR_RESTORED("NormalOrRestored"),
    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange");
    private final String value;

    CircuitElementState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CircuitElementState fromValue(String v) {
        for (CircuitElementState c: CircuitElementState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
