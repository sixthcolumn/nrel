
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allowableTransactionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="allowableTransactionKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACHPayment"/>
 *     &lt;enumeration value="CashPayment"/>
 *     &lt;enumeration value="CreditCardPayment"/>
 *     &lt;enumeration value="ECheckPayment"/>
 *     &lt;enumeration value="SendToOperator"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "allowableTransactionKind")
@XmlEnum
public enum AllowableTransactionKind {

    @XmlEnumValue("ACHPayment")
    ACH_PAYMENT("ACHPayment"),
    @XmlEnumValue("CashPayment")
    CASH_PAYMENT("CashPayment"),
    @XmlEnumValue("CreditCardPayment")
    CREDIT_CARD_PAYMENT("CreditCardPayment"),
    @XmlEnumValue("ECheckPayment")
    E_CHECK_PAYMENT("ECheckPayment"),
    @XmlEnumValue("SendToOperator")
    SEND_TO_OPERATOR("SendToOperator"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AllowableTransactionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllowableTransactionKind fromValue(String v) {
        for (AllowableTransactionKind c: AllowableTransactionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
