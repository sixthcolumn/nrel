
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadActionCodeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="loadActionCodeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Connect"/>
 *     &lt;enumeration value="Disconnect"/>
 *     &lt;enumeration value="InitiatePowerLimitation"/>
 *     &lt;enumeration value="CancelPowerLimitation"/>
 *     &lt;enumeration value="Arm"/>
 *     &lt;enumeration value="Enable"/>
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "loadActionCodeKind")
@XmlEnum
public enum LoadActionCodeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * This is the action taken to permit commodity units to flow to the customer.  In an electric system, this is the "Close" switch action. In fluid flow, this is the "Open" valve action.
     * 
     */
    @XmlEnumValue("Connect")
    CONNECT("Connect"),

    /**
     * This is the action taken to prohibit commodity flow to the customer. In an electric system, this would be the "Open" switch action.  In fluid flow, this would be the "Close" valve action.
     * 
     */
    @XmlEnumValue("Disconnect")
    DISCONNECT("Disconnect"),
    @XmlEnumValue("InitiatePowerLimitation")
    INITIATE_POWER_LIMITATION("InitiatePowerLimitation"),
    @XmlEnumValue("CancelPowerLimitation")
    CANCEL_POWER_LIMITATION("CancelPowerLimitation"),
    @XmlEnumValue("Arm")
    ARM("Arm"),
    @XmlEnumValue("Enable")
    ENABLE("Enable"),
    @XmlEnumValue("Disable")
    DISABLE("Disable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LoadActionCodeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadActionCodeKind fromValue(String v) {
        for (LoadActionCodeKind c: LoadActionCodeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
