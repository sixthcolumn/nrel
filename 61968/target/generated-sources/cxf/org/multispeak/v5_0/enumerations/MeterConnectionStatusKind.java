
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterConnectionStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="meterConnectionStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="ConnectedOverride"/>
 *     &lt;enumeration value="DisconnectedOverride"/>
 *     &lt;enumeration value="DisconnectedNonPay"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "meterConnectionStatusKind")
@XmlEnum
public enum MeterConnectionStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("ConnectedOverride")
    CONNECTED_OVERRIDE("ConnectedOverride"),
    @XmlEnumValue("DisconnectedOverride")
    DISCONNECTED_OVERRIDE("DisconnectedOverride"),
    @XmlEnumValue("DisconnectedNonPay")
    DISCONNECTED_NON_PAY("DisconnectedNonPay"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MeterConnectionStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeterConnectionStatusKind fromValue(String v) {
        for (MeterConnectionStatusKind c: MeterConnectionStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
