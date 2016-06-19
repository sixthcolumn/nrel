
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billingItemsKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="billingItemsKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Cycle"/>
 *     &lt;enumeration value="BudgetBilled"/>
 *     &lt;enumeration value="AnnualOrSeasonal"/>
 *     &lt;enumeration value="PrePaid"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "billingItemsKind")
@XmlEnum
public enum BillingItemsKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Cycle")
    CYCLE("Cycle"),
    @XmlEnumValue("BudgetBilled")
    BUDGET_BILLED("BudgetBilled"),
    @XmlEnumValue("AnnualOrSeasonal")
    ANNUAL_OR_SEASONAL("AnnualOrSeasonal"),
    @XmlEnumValue("PrePaid")
    PRE_PAID("PrePaid"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BillingItemsKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingItemsKind fromValue(String v) {
        for (BillingItemsKind c: BillingItemsKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
