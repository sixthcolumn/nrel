
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANCommissionStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PANCommissionStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Commissioned"/>
 *     &lt;enumeration value="Decommissioned"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PANCommissionStatusKind")
@XmlEnum
public enum PANCommissionStatusKind {


    /**
     * The commissioning state of the HAN is not known
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * The HAN is commissioned and ready to use
     * 
     */
    @XmlEnumValue("Commissioned")
    COMMISSIONED("Commissioned"),

    /**
     * The HAN has been decommissioned. This implies that this HAN was previously known to be commissioned.
     * 
     */
    @XmlEnumValue("Decommissioned")
    DECOMMISSIONED("Decommissioned"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PANCommissionStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PANCommissionStatusKind fromValue(String v) {
        for (PANCommissionStatusKind c: PANCommissionStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
