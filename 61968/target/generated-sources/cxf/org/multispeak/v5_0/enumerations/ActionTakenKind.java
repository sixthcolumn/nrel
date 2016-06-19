
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionTakenKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionTakenKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="PlacedIntoInventory"/>
 *     &lt;enumeration value="CheckedOut"/>
 *     &lt;enumeration value="Installed"/>
 *     &lt;enumeration value="PlacedIntoService"/>
 *     &lt;enumeration value="Connected"/>
 *     &lt;enumeration value="Disconnected"/>
 *     &lt;enumeration value="Removed"/>
 *     &lt;enumeration value="Inspected"/>
 *     &lt;enumeration value="Tested"/>
 *     &lt;enumeration value="Repaired"/>
 *     &lt;enumeration value="Adjusted"/>
 *     &lt;enumeration value="Calibrated"/>
 *     &lt;enumeration value="Checked"/>
 *     &lt;enumeration value="Treated"/>
 *     &lt;enumeration value="ReturnedToInventory"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="Destroyed"/>
 *     &lt;enumeration value="Replaced"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionTakenKind")
@XmlEnum
public enum ActionTakenKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("PlacedIntoInventory")
    PLACED_INTO_INVENTORY("PlacedIntoInventory"),
    @XmlEnumValue("CheckedOut")
    CHECKED_OUT("CheckedOut"),
    @XmlEnumValue("Installed")
    INSTALLED("Installed"),
    @XmlEnumValue("PlacedIntoService")
    PLACED_INTO_SERVICE("PlacedIntoService"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Removed")
    REMOVED("Removed"),
    @XmlEnumValue("Inspected")
    INSPECTED("Inspected"),
    @XmlEnumValue("Tested")
    TESTED("Tested"),
    @XmlEnumValue("Repaired")
    REPAIRED("Repaired"),
    @XmlEnumValue("Adjusted")
    ADJUSTED("Adjusted"),
    @XmlEnumValue("Calibrated")
    CALIBRATED("Calibrated"),
    @XmlEnumValue("Checked")
    CHECKED("Checked"),
    @XmlEnumValue("Treated")
    TREATED("Treated"),
    @XmlEnumValue("ReturnedToInventory")
    RETURNED_TO_INVENTORY("ReturnedToInventory"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    @XmlEnumValue("Destroyed")
    DESTROYED("Destroyed"),
    @XmlEnumValue("Replaced")
    REPLACED("Replaced"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ActionTakenKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTakenKind fromValue(String v) {
        for (ActionTakenKind c: ActionTakenKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
