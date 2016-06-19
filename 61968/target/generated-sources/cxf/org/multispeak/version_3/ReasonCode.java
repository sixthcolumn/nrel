
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonPayment"/>
 *     &lt;enumeration value="ServiceInactive"/>
 *     &lt;enumeration value="PaymentAgreement"/>
 *     &lt;enumeration value="PaymentReceived"/>
 *     &lt;enumeration value="NewCustomer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reasonCode")
@XmlEnum
public enum ReasonCode {

    @XmlEnumValue("NonPayment")
    NON_PAYMENT("NonPayment"),
    @XmlEnumValue("ServiceInactive")
    SERVICE_INACTIVE("ServiceInactive"),
    @XmlEnumValue("PaymentAgreement")
    PAYMENT_AGREEMENT("PaymentAgreement"),
    @XmlEnumValue("PaymentReceived")
    PAYMENT_RECEIVED("PaymentReceived"),
    @XmlEnumValue("NewCustomer")
    NEW_CUSTOMER("NewCustomer");
    private final String value;

    ReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonCode fromValue(String v) {
        for (ReasonCode c: ReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
