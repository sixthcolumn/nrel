
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for balanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="balanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="priorityBalance"/>
 *     &lt;enumeration value="totalBalance"/>
 *     &lt;enumeration value="arrearsBalance"/>
 *     &lt;enumeration value="prepaidBalance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "balanceType")
@XmlEnum
public enum BalanceType {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("priorityBalance")
    PRIORITY_BALANCE("priorityBalance"),
    @XmlEnumValue("totalBalance")
    TOTAL_BALANCE("totalBalance"),
    @XmlEnumValue("arrearsBalance")
    ARREARS_BALANCE("arrearsBalance"),
    @XmlEnumValue("prepaidBalance")
    PREPAID_BALANCE("prepaidBalance");
    private final String value;

    BalanceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BalanceType fromValue(String v) {
        for (BalanceType c: BalanceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
