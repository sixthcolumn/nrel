
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poleUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="poleUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Distribution"/>
 *     &lt;enumeration value="Transmission"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Guy Stub"/>
 *     &lt;enumeration value="Stub"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "poleUse")
@XmlEnum
public enum PoleUse {

    @XmlEnumValue("Distribution")
    DISTRIBUTION("Distribution"),
    @XmlEnumValue("Transmission")
    TRANSMISSION("Transmission"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Guy Stub")
    GUY_STUB("Guy Stub"),
    @XmlEnumValue("Stub")
    STUB("Stub"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PoleUse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoleUse fromValue(String v) {
        for (PoleUse c: PoleUse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
