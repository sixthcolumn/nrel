
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mountingKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mountingKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="BusMounted"/>
 *     &lt;enumeration value="PoleMounted"/>
 *     &lt;enumeration value="PadMounted"/>
 *     &lt;enumeration value="VaultMounted"/>
 *     &lt;enumeration value="Substation"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mountingKind")
@XmlEnum
public enum MountingKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("BusMounted")
    BUS_MOUNTED("BusMounted"),
    @XmlEnumValue("PoleMounted")
    POLE_MOUNTED("PoleMounted"),
    @XmlEnumValue("PadMounted")
    PAD_MOUNTED("PadMounted"),
    @XmlEnumValue("VaultMounted")
    VAULT_MOUNTED("VaultMounted"),
    @XmlEnumValue("Substation")
    SUBSTATION("Substation"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MountingKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MountingKind fromValue(String v) {
        for (MountingKind c: MountingKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
