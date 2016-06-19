
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premisesDisplayMessageKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="premisesDisplayMessageKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="BillingMessage"/>
 *     &lt;enumeration value="Message"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "premisesDisplayMessageKind")
@XmlEnum
public enum PremisesDisplayMessageKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("BillingMessage")
    BILLING_MESSAGE("BillingMessage"),
    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PremisesDisplayMessageKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PremisesDisplayMessageKind fromValue(String v) {
        for (PremisesDisplayMessageKind c: PremisesDisplayMessageKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
