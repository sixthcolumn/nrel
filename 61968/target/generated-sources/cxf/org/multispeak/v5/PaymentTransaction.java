
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * <p>Java class for paymentTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="paymentContainer" type="{http://www.multispeak.org/V5.0}paymentContainer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentTransaction", propOrder = {
    "accountID",
    "servicePointID",
    "paymentContainer"
})
public class PaymentTransaction
    extends MspEvent
{

    @XmlElement(required = true)
    protected ObjectID accountID;
    protected ServicePointID servicePointID;
    @XmlElement(required = true)
    protected PaymentContainer paymentContainer;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setAccountID(ObjectID value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the servicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getServicePointID() {
        return servicePointID;
    }

    /**
     * Sets the value of the servicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setServicePointID(ServicePointID value) {
        this.servicePointID = value;
    }

    /**
     * Gets the value of the paymentContainer property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContainer }
     *     
     */
    public PaymentContainer getPaymentContainer() {
        return paymentContainer;
    }

    /**
     * Sets the value of the paymentContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContainer }
     *     
     */
    public void setPaymentContainer(PaymentContainer value) {
        this.paymentContainer = value;
    }

}
