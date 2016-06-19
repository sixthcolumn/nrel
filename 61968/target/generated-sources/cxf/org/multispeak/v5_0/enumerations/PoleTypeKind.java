
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poleTypeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="poleTypeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Aluminum"/>
 *     &lt;enumeration value="Concrete"/>
 *     &lt;enumeration value="Fiberglass"/>
 *     &lt;enumeration value="Galvanized"/>
 *     &lt;enumeration value="Steel"/>
 *     &lt;enumeration value="Wood"/>
 *     &lt;enumeration value="WoodTreated"/>
 *     &lt;enumeration value="WoodUntreated"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "poleTypeKind")
@XmlEnum
public enum PoleTypeKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
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
    OTHER("Other");
    private final String value;

    PoleTypeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoleTypeKind fromValue(String v) {
        for (PoleTypeKind c: PoleTypeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
