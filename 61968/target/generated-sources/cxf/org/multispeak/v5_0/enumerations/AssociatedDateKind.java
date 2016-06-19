
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for associatedDateKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="associatedDateKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ManufacturedDate"/>
 *     &lt;enumeration value="EnteredInventoryDate"/>
 *     &lt;enumeration value="LeftInventoryDate"/>
 *     &lt;enumeration value="InstalledDate"/>
 *     &lt;enumeration value="PlacedIntoServiceDate"/>
 *     &lt;enumeration value="ConnectedDate"/>
 *     &lt;enumeration value="DisconnectedDate"/>
 *     &lt;enumeration value="RemovedDate"/>
 *     &lt;enumeration value="InspectedDate"/>
 *     &lt;enumeration value="TestedDate"/>
 *     &lt;enumeration value="RepairedDate"/>
 *     &lt;enumeration value="AdjustedDate"/>
 *     &lt;enumeration value="CalibratedDate"/>
 *     &lt;enumeration value="CheckedDate"/>
 *     &lt;enumeration value="TreatedDate"/>
 *     &lt;enumeration value="ReturnedToInventoryDate"/>
 *     &lt;enumeration value="RetiredDate"/>
 *     &lt;enumeration value="DestroyedDate"/>
 *     &lt;enumeration value="ReplacedDate"/>
 *     &lt;enumeration value="ReadDate"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "associatedDateKind")
@XmlEnum
public enum AssociatedDateKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ManufacturedDate")
    MANUFACTURED_DATE("ManufacturedDate"),
    @XmlEnumValue("EnteredInventoryDate")
    ENTERED_INVENTORY_DATE("EnteredInventoryDate"),
    @XmlEnumValue("LeftInventoryDate")
    LEFT_INVENTORY_DATE("LeftInventoryDate"),
    @XmlEnumValue("InstalledDate")
    INSTALLED_DATE("InstalledDate"),
    @XmlEnumValue("PlacedIntoServiceDate")
    PLACED_INTO_SERVICE_DATE("PlacedIntoServiceDate"),
    @XmlEnumValue("ConnectedDate")
    CONNECTED_DATE("ConnectedDate"),
    @XmlEnumValue("DisconnectedDate")
    DISCONNECTED_DATE("DisconnectedDate"),
    @XmlEnumValue("RemovedDate")
    REMOVED_DATE("RemovedDate"),
    @XmlEnumValue("InspectedDate")
    INSPECTED_DATE("InspectedDate"),
    @XmlEnumValue("TestedDate")
    TESTED_DATE("TestedDate"),
    @XmlEnumValue("RepairedDate")
    REPAIRED_DATE("RepairedDate"),
    @XmlEnumValue("AdjustedDate")
    ADJUSTED_DATE("AdjustedDate"),
    @XmlEnumValue("CalibratedDate")
    CALIBRATED_DATE("CalibratedDate"),
    @XmlEnumValue("CheckedDate")
    CHECKED_DATE("CheckedDate"),
    @XmlEnumValue("TreatedDate")
    TREATED_DATE("TreatedDate"),
    @XmlEnumValue("ReturnedToInventoryDate")
    RETURNED_TO_INVENTORY_DATE("ReturnedToInventoryDate"),
    @XmlEnumValue("RetiredDate")
    RETIRED_DATE("RetiredDate"),
    @XmlEnumValue("DestroyedDate")
    DESTROYED_DATE("DestroyedDate"),
    @XmlEnumValue("ReplacedDate")
    REPLACED_DATE("ReplacedDate"),
    @XmlEnumValue("ReadDate")
    READ_DATE("ReadDate"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AssociatedDateKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssociatedDateKind fromValue(String v) {
        for (AssociatedDateKind c: AssociatedDateKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
