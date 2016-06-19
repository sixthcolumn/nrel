
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assetStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assetStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Quarantined"/>
 *     &lt;enumeration value="InInventory"/>
 *     &lt;enumeration value="CheckedOut"/>
 *     &lt;enumeration value="Installed"/>
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="OutOfService"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="Destroyed"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assetStatusKind")
@XmlEnum
public enum AssetStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The asset has been separated from stock and will not be issued. This might for instance occur following receiving, such as with meters, when a subset of each shipment must be tested prior to acceptance of the shipment of meters.
     * 
     */
    @XmlEnumValue("Quarantined")
    QUARANTINED("Quarantined"),

    /**
     * The asset has been received and placed into inventory
     * 
     */
    @XmlEnumValue("InInventory")
    IN_INVENTORY("InInventory"),

    /**
     * The asset has been issued to a worker or crew.  This might occur so that the asset can be installed or might be for maintenance of truck stock.
     * 
     */
    @XmlEnumValue("CheckedOut")
    CHECKED_OUT("CheckedOut"),

    /**
     * This asset has been installed.
     * 
     */
    @XmlEnumValue("Installed")
    INSTALLED("Installed"),

    /**
     * This asset has been installed and has been placed into active service.
     * 
     */
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),

    /**
     * This asset has been removed from active service, but remains installed.
     * 
     */
    @XmlEnumValue("OutOfService")
    OUT_OF_SERVICE("OutOfService"),

    /**
     * This asset has been retired and will not be reused by its current owner.
     * 
     */
    @XmlEnumValue("Retired")
    RETIRED("Retired"),

    /**
     * The asset has been destroyed or otherwise disposed of.
     * 
     */
    @XmlEnumValue("Destroyed")
    DESTROYED("Destroyed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AssetStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetStatusKind fromValue(String v) {
        for (AssetStatusKind c: AssetStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
