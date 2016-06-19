
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pmEventCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pmEventCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="LowBattery"/>
 *     &lt;enumeration value="Event1"/>
 *     &lt;enumeration value="Event2"/>
 *     &lt;enumeration value="Event3"/>
 *     &lt;enumeration value="LockOut"/>
 *     &lt;enumeration value="PowerRestored"/>
 *     &lt;enumeration value="UndeterminedOn"/>
 *     &lt;enumeration value="UndeterminedOff"/>
 *     &lt;enumeration value="BrownOut"/>
 *     &lt;enumeration value="HighVoltage"/>
 *     &lt;enumeration value="NormalVoltage"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pmEventCode")
@XmlEnum
public enum PmEventCode {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("LowBattery")
    LOW_BATTERY("LowBattery"),
    @XmlEnumValue("Event1")
    EVENT_1("Event1"),
    @XmlEnumValue("Event2")
    EVENT_2("Event2"),
    @XmlEnumValue("Event3")
    EVENT_3("Event3"),
    @XmlEnumValue("LockOut")
    LOCK_OUT("LockOut"),
    @XmlEnumValue("PowerRestored")
    POWER_RESTORED("PowerRestored"),
    @XmlEnumValue("UndeterminedOn")
    UNDETERMINED_ON("UndeterminedOn"),
    @XmlEnumValue("UndeterminedOff")
    UNDETERMINED_OFF("UndeterminedOff"),
    @XmlEnumValue("BrownOut")
    BROWN_OUT("BrownOut"),
    @XmlEnumValue("HighVoltage")
    HIGH_VOLTAGE("HighVoltage"),
    @XmlEnumValue("NormalVoltage")
    NORMAL_VOLTAGE("NormalVoltage"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PmEventCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PmEventCode fromValue(String v) {
        for (PmEventCode c: PmEventCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
