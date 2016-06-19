
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for paymentContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="cashPayments" type="{http://www.multispeak.org/V5.0}cashPayments" minOccurs="0"/>
 *         &lt;element name="eCheckPayments" type="{http://www.multispeak.org/V5.0}eCheckPayments" minOccurs="0"/>
 *         &lt;element name="creditCardPayments" type="{http://www.multispeak.org/V5.0}creditCardPayments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentContainer", propOrder = {
    "cashPayments",
    "eCheckPayments",
    "creditCardPayments"
})
public class PaymentContainer
    extends MspExtensible
{

    protected CashPayments cashPayments;
    protected ECheckPayments eCheckPayments;
    protected CreditCardPayments creditCardPayments;

    /**
     * Gets the value of the cashPayments property.
     * 
     * @return
     *     possible object is
     *     {@link CashPayments }
     *     
     */
    public CashPayments getCashPayments() {
        return cashPayments;
    }

    /**
     * Sets the value of the cashPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPayments }
     *     
     */
    public void setCashPayments(CashPayments value) {
        this.cashPayments = value;
    }

    /**
     * Gets the value of the eCheckPayments property.
     * 
     * @return
     *     possible object is
     *     {@link ECheckPayments }
     *     
     */
    public ECheckPayments getECheckPayments() {
        return eCheckPayments;
    }

    /**
     * Sets the value of the eCheckPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECheckPayments }
     *     
     */
    public void setECheckPayments(ECheckPayments value) {
        this.eCheckPayments = value;
    }

    /**
     * Gets the value of the creditCardPayments property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayments }
     *     
     */
    public CreditCardPayments getCreditCardPayments() {
        return creditCardPayments;
    }

    /**
     * Sets the value of the creditCardPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayments }
     *     
     */
    public void setCreditCardPayments(CreditCardPayments value) {
        this.creditCardPayments = value;
    }

}
