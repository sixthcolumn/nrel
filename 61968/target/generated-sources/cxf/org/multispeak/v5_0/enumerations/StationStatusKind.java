
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stationStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stationStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Construction"/>
 *     &lt;enumeration value="Retire"/>
 *     &lt;enumeration value="Existing"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stationStatusKind")
@XmlEnum
public enum StationStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Construction - It is expected that assemblies/objects are to be added to this station.
     * 
     */
    @XmlEnumValue("Construction")
    CONSTRUCTION("Construction"),

    /**
     * Retire - Assemblies/objects are to be removed from this station.
     * 
     */
    @XmlEnumValue("Retire")
    RETIRE("Retire"),

    /**
     * Existing - All assemblies/objects currently exist at this station.  No work or change in plant is implied.
     * 
     */
    @XmlEnumValue("Existing")
    EXISTING("Existing"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    StationStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StationStatusKind fromValue(String v) {
        for (StationStatusKind c: StationStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
