
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for balanceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="balanceKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PriorityBalance"/>
 *     &lt;enumeration value="TotalBalance"/>
 *     &lt;enumeration value="ArrearsBalance"/>
 *     &lt;enumeration value="PrepaidBalance"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "balanceKind")
@XmlEnum
public enum BalanceKind {

    @XmlEnumValue("PriorityBalance")
    PRIORITY_BALANCE("PriorityBalance"),
    @XmlEnumValue("TotalBalance")
    TOTAL_BALANCE("TotalBalance"),
    @XmlEnumValue("ArrearsBalance")
    ARREARS_BALANCE("ArrearsBalance"),
    @XmlEnumValue("PrepaidBalance")
    PREPAID_BALANCE("PrepaidBalance"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BalanceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BalanceKind fromValue(String v) {
        for (BalanceKind c: BalanceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
