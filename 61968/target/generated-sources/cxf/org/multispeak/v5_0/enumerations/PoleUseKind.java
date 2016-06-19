
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poleUseKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="poleUseKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Distribution"/>
 *     &lt;enumeration value="Transmission"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Guy Stub"/>
 *     &lt;enumeration value="Stub"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "poleUseKind")
@XmlEnum
public enum PoleUseKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
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
    OTHER("Other");
    private final String value;

    PoleUseKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoleUseKind fromValue(String v) {
        for (PoleUseKind c: PoleUseKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
