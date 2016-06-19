
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is an order to work that may be location-specific, but does not include capital construction.
 * 
 * <p>Java class for serviceOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="associatedMetersList" type="{http://www.multispeak.org/V5.0}associatedMetersList" minOccurs="0"/>
 *         &lt;element name="securityLights" type="{http://www.multispeak.org/V5.0}securityLights" minOccurs="0"/>
 *         &lt;element name="associatedAssets" type="{http://www.multispeak.org/V5.0}associatedAssets" minOccurs="0"/>
 *         &lt;element name="serviceActions" type="{http://www.multispeak.org/V5.0}serviceActions" minOccurs="0"/>
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
@XmlType(name = "serviceOrder", propOrder = {
    "customerID",
    "accountID",
    "serviceLocationID",
    "associatedMetersList",
    "securityLights",
    "associatedAssets",
    "serviceActions"
})
public class ServiceOrder
    extends MspWork
{

    protected ObjectID customerID;
    protected ObjectID accountID;
    protected ObjectID serviceLocationID;
    protected AssociatedMetersList associatedMetersList;
    protected SecurityLights securityLights;
    protected AssociatedAssets associatedAssets;
    protected ServiceActions serviceActions;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCustomerID(ObjectID value) {
        this.customerID = value;
    }

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
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the associatedMetersList property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedMetersList }
     *     
     */
    public AssociatedMetersList getAssociatedMetersList() {
        return associatedMetersList;
    }

    /**
     * Sets the value of the associatedMetersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedMetersList }
     *     
     */
    public void setAssociatedMetersList(AssociatedMetersList value) {
        this.associatedMetersList = value;
    }

    /**
     * Gets the value of the securityLights property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityLights }
     *     
     */
    public SecurityLights getSecurityLights() {
        return securityLights;
    }

    /**
     * Sets the value of the securityLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityLights }
     *     
     */
    public void setSecurityLights(SecurityLights value) {
        this.securityLights = value;
    }

    /**
     * Gets the value of the associatedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedAssets }
     *     
     */
    public AssociatedAssets getAssociatedAssets() {
        return associatedAssets;
    }

    /**
     * Sets the value of the associatedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedAssets }
     *     
     */
    public void setAssociatedAssets(AssociatedAssets value) {
        this.associatedAssets = value;
    }

    /**
     * Gets the value of the serviceActions property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceActions }
     *     
     */
    public ServiceActions getServiceActions() {
        return serviceActions;
    }

    /**
     * Sets the value of the serviceActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceActions }
     *     
     */
    public void setServiceActions(ServiceActions value) {
        this.serviceActions = value;
    }

}
