
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitActionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitActionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Abandon"/>
 *     &lt;enumeration value="Construction"/>
 *     &lt;enumeration value="Existing"/>
 *     &lt;enumeration value="NoAction"/>
 *     &lt;enumeration value="Retire"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="Salvage"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitActionKind")
@XmlEnum
public enum UnitActionKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Abandon - this assembly/object is to be abandoned in place.  It will not be removed, but it will be out of service.
     * 
     */
    @XmlEnumValue("Abandon")
    ABANDON("Abandon"),

    /**
     * Construction - this assembly/object is to be added to this station.
     * 
     */
    @XmlEnumValue("Construction")
    CONSTRUCTION("Construction"),

    /**
     * Existing - this assembly/object currently exists at this station.  No work or change in plant is implied
     * 
     */
    @XmlEnumValue("Existing")
    EXISTING("Existing"),

    /**
     * NoAction - Any units of work that are implied add cost to the job, but are labor only, no CPRs are changed.
     * 
     */
    @XmlEnumValue("NoAction")
    NO_ACTION("NoAction"),

    /**
     * Retire - This assembly/object is to be removed from this station, materials will not be returned to stores for reuse.
     * 
     */
    @XmlEnumValue("Retire")
    RETIRE("Retire"),

    /**
     * Transfer - this assembly/object is to be transferred to another location.  It is expected that this unit will be completely reused as is.  Only labor is involved.
     * 
     */
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),

    /**
     * Salvage - this assembly/object is to be removed from this location and the majority of the material will be returned to stores for reuse.
     * 
     */
    @XmlEnumValue("Salvage")
    SALVAGE("Salvage"),

    /**
     * All implies that all of the other options (Abandon, Construction, Existing, Retire, Transfer, and Salvage) maybe/are included at this station.
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UnitActionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitActionKind fromValue(String v) {
        for (UnitActionKind c: UnitActionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
