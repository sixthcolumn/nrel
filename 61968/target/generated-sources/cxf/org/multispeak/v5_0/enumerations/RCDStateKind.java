
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RCDStateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RCDStateKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="Armed"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="InTransition"/>
 *     &lt;enumeration value="PowerLimitation"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RCDStateKind")
@XmlEnum
public enum RCDStateKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The meter is connected so that commodity units may flow.  For an electric system, this is the "closed" switch state.  For fluid flow, this is the "opened" valve state.
     * 
     */
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),

    /**
     * The meter has been disconnected from the system and no commodity units may flow to the customer.  In an electric system this is the "Opened" switch state.  In fluid flow, this is the "Closed valve state.
     * 
     */
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Armed")
    ARMED("Armed"),
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("InTransition")
    IN_TRANSITION("InTransition"),
    @XmlEnumValue("PowerLimitation")
    POWER_LIMITATION("PowerLimitation"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RCDStateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RCDStateKind fromValue(String v) {
        for (RCDStateKind c: RCDStateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
