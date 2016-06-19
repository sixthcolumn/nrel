
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="poleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aluminum"/>
 *     &lt;enumeration value="Concrete"/>
 *     &lt;enumeration value="Fiberglass"/>
 *     &lt;enumeration value="Galvanized"/>
 *     &lt;enumeration value="Steel"/>
 *     &lt;enumeration value="Wood"/>
 *     &lt;enumeration value="WoodTreated"/>
 *     &lt;enumeration value="WoodUntreated"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "poleType")
@XmlEnum
public enum PoleType {

    @XmlEnumValue("Aluminum")
    ALUMINUM("Aluminum"),
    @XmlEnumValue("Concrete")
    CONCRETE("Concrete"),
    @XmlEnumValue("Fiberglass")
    FIBERGLASS("Fiberglass"),
    @XmlEnumValue("Galvanized")
    GALVANIZED("Galvanized"),
    @XmlEnumValue("Steel")
    STEEL("Steel"),
    @XmlEnumValue("Wood")
    WOOD("Wood"),
    @XmlEnumValue("WoodTreated")
    WOOD_TREATED("WoodTreated"),
    @XmlEnumValue("WoodUntreated")
    WOOD_UNTREATED("WoodUntreated"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoleType fromValue(String v) {
        for (PoleType c: PoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
