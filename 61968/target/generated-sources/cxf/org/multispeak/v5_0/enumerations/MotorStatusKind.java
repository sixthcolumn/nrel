
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motorStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="motorStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="LockedRotor"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="SoftStart"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "motorStatusKind")
@XmlEnum
public enum MotorStatusKind {

    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("LockedRotor")
    LOCKED_ROTOR("LockedRotor"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("SoftStart")
    SOFT_START("SoftStart"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MotorStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MotorStatusKind fromValue(String v) {
        for (MotorStatusKind c: MotorStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
