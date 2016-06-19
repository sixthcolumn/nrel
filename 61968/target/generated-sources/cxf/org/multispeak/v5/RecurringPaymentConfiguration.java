
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ServiceType;


/**
 * <p>Java class for recurringPaymentConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recurringPaymentConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/V5.0/enumerations}serviceType" minOccurs="0"/>
 *         &lt;element name="configurationAction" type="{http://www.multispeak.org/V5.0}configurationAction"/>
 *         &lt;element name="paymentMode" type="{http://www.multispeak.org/V5.0}paymentMode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurringPaymentConfiguration", propOrder = {
    "accountID",
    "serviceType",
    "configurationAction",
    "paymentMode"
})
public class RecurringPaymentConfiguration
    extends MspObject
{

    @XmlElement(required = true)
    protected ObjectID accountID;
    protected ServiceType serviceType;
    @XmlElement(required = true)
    protected ConfigurationAction configurationAction;
    protected PaymentMode paymentMode;

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
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the configurationAction property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationAction }
     *     
     */
    public ConfigurationAction getConfigurationAction() {
        return configurationAction;
    }

    /**
     * Sets the value of the configurationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationAction }
     *     
     */
    public void setConfigurationAction(ConfigurationAction value) {
        this.configurationAction = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMode }
     *     
     */
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMode }
     *     
     */
    public void setPaymentMode(PaymentMode value) {
        this.paymentMode = value;
    }

}
