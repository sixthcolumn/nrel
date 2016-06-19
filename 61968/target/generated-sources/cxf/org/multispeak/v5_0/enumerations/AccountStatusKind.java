
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountStatusKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accountStatusKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="ActiveNotBilled"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="NonPay"/>
 *     &lt;enumeration value="NotFinal"/>
 *     &lt;enumeration value="PendingConnect"/>
 *     &lt;enumeration value="PendingConnectNonPay"/>
 *     &lt;enumeration value="PendingDisconnect"/>
 *     &lt;enumeration value="PendingDisconnectNonPay"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accountStatusKind")
@XmlEnum
public enum AccountStatusKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Normal active account.
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * A new account that is active, but the initial bill has not yet been prepared for the customer.
     * 
     */
    @XmlEnumValue("ActiveNotBilled")
    ACTIVE_NOT_BILLED("ActiveNotBilled"),

    /**
     * The customer account is no longer active.  The customer no longer receives service and has paid the final bill.
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * The customer has failed to pay a bill.
     * 
     */
    @XmlEnumValue("NonPay")
    NON_PAY("NonPay"),

    /**
     * The customer service has been disconnected, subsequent to a customer request (move-out), but the final bill has not yet been prepared.
     * 
     */
    @XmlEnumValue("NotFinal")
    NOT_FINAL("NotFinal"),

    /**
     * A service order has been created to connect a new customer service, but the connection has not yet been performed.  This status applies whether or not service has been provided at this service location for a previous customer or not.
     * 
     */
    @XmlEnumValue("PendingConnect")
    PENDING_CONNECT("PendingConnect"),

    /**
     * A customer account that has previously been disconnected for non-pay, but for which the customer has now paid the arrears; service reconnection has not yet occurred. 
     * 
     */
    @XmlEnumValue("PendingConnectNonPay")
    PENDING_CONNECT_NON_PAY("PendingConnectNonPay"),

    /**
     * A customer account for which the customer has requested a disconnect (move-out), but for which the disconnect has not yet occurred.
     * 
     */
    @XmlEnumValue("PendingDisconnect")
    PENDING_DISCONNECT("PendingDisconnect"),

    /**
     * A customer account on which the customer has not paid a bill, the account has been flagged for disconnect, but the disconnection has not yet occurred. 
     * 
     */
    @XmlEnumValue("PendingDisconnectNonPay")
    PENDING_DISCONNECT_NON_PAY("PendingDisconnectNonPay"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AccountStatusKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountStatusKind fromValue(String v) {
        for (AccountStatusKind c: AccountStatusKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
