
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="meterStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="InInventory"/>
 *     &lt;enumeration value="Installed"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="ConnectedOverride"/>
 *     &lt;enumeration value="DisconnectedOverride"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="InForRepair"/>
 *     &lt;enumeration value="InTesting"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "meterStatusKind")
@XmlEnum
public enum MeterStatusKind {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("InInventory")
    IN_INVENTORY("InInventory"),
    @XmlEnumValue("Installed")
    INSTALLED("Installed"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("ConnectedOverride")
    CONNECTED_OVERRIDE("ConnectedOverride"),
    @XmlEnumValue("DisconnectedOverride")
    DISCONNECTED_OVERRIDE("DisconnectedOverride"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("InForRepair")
    IN_FOR_REPAIR("InForRepair"),
    @XmlEnumValue("InTesting")
    IN_TESTING("InTesting"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MeterStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeterStatusKind fromValue(String v) {
        for (MeterStatusKind c: MeterStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
