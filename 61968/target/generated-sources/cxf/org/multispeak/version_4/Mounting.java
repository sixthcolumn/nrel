
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mounting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mounting">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Bus-mounted"/>
 *     &lt;enumeration value="Pole-mounted"/>
 *     &lt;enumeration value="Pad-mounted"/>
 *     &lt;enumeration value="Vault-mounted"/>
 *     &lt;enumeration value="Substation"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mounting")
@XmlEnum
public enum Mounting {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Bus-mounted")
    BUS_MOUNTED("Bus-mounted"),
    @XmlEnumValue("Pole-mounted")
    POLE_MOUNTED("Pole-mounted"),
    @XmlEnumValue("Pad-mounted")
    PAD_MOUNTED("Pad-mounted"),
    @XmlEnumValue("Vault-mounted")
    VAULT_MOUNTED("Vault-mounted"),
    @XmlEnumValue("Substation")
    SUBSTATION("Substation"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    Mounting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Mounting fromValue(String v) {
        for (Mounting c: Mounting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
