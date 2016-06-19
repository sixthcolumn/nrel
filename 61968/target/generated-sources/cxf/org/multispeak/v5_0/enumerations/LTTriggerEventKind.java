
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LTTriggerEventKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LTTriggerEventKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PowerOn"/>
 *     &lt;enumeration value="PowerOff"/>
 *     &lt;enumeration value="Moving"/>
 *     &lt;enumeration value="Stop"/>
 *     &lt;enumeration value="PTOOn"/>
 *     &lt;enumeration value="PTOOff"/>
 *     &lt;enumeration value="Alert"/>
 *     &lt;enumeration value="TroubleLight"/>
 *     &lt;enumeration value="Diagnostic"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LTTriggerEventKind")
@XmlEnum
public enum LTTriggerEventKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("PowerOn")
    POWER_ON("PowerOn"),
    @XmlEnumValue("PowerOff")
    POWER_OFF("PowerOff"),
    @XmlEnumValue("Moving")
    MOVING("Moving"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("PTOOn")
    PTO_ON("PTOOn"),
    @XmlEnumValue("PTOOff")
    PTO_OFF("PTOOff"),
    @XmlEnumValue("Alert")
    ALERT("Alert"),
    @XmlEnumValue("TroubleLight")
    TROUBLE_LIGHT("TroubleLight"),
    @XmlEnumValue("Diagnostic")
    DIAGNOSTIC("Diagnostic"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LTTriggerEventKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LTTriggerEventKind fromValue(String v) {
        for (LTTriggerEventKind c: LTTriggerEventKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
