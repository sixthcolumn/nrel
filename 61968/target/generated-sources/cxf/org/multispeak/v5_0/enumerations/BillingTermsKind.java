
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billingTermsKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="billingTermsKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cycle"/>
 *     &lt;enumeration value="Budget"/>
 *     &lt;enumeration value="Prepay"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "billingTermsKind")
@XmlEnum
public enum BillingTermsKind {

    @XmlEnumValue("Cycle")
    CYCLE("Cycle"),
    @XmlEnumValue("Budget")
    BUDGET("Budget"),
    @XmlEnumValue("Prepay")
    PREPAY("Prepay"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BillingTermsKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingTermsKind fromValue(String v) {
        for (BillingTermsKind c: BillingTermsKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
