
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPerson">
 *       &lt;sequence>
 *         &lt;element name="dBAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accounts" type="{http://www.multispeak.org/V5.0}accounts" minOccurs="0"/>
 *         &lt;element name="servicePriorities" type="{http://www.multispeak.org/V5.0}servicePriorities" minOccurs="0"/>
 *         &lt;element name="serviceAgreements" type="{http://www.multispeak.org/V5.0}serviceAgreements" minOccurs="0"/>
 *         &lt;element name="customerHazards" type="{http://www.multispeak.org/V5.0}customerHazards" minOccurs="0"/>
 *         &lt;element name="alternateContacts" type="{http://www.multispeak.org/V5.0}alternateContacts" minOccurs="0"/>
 *         &lt;element name="serviceOrderIDs" type="{http://www.multispeak.org/V5.0}serviceOrderIDs" minOccurs="0"/>
 *         &lt;element name="workOrderReferences" type="{http://www.multispeak.org/V5.0}workOrderReferences" minOccurs="0"/>
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
@XmlType(name = "customer", propOrder = {
    "dbaName",
    "accounts",
    "servicePriorities",
    "serviceAgreements",
    "customerHazards",
    "alternateContacts",
    "serviceOrderIDs",
    "workOrderReferences"
})
public class Customer
    extends MspPerson
{

    @XmlElement(name = "dBAName")
    protected String dbaName;
    protected Accounts accounts;
    protected ServicePriorities servicePriorities;
    protected ServiceAgreements serviceAgreements;
    protected CustomerHazards customerHazards;
    protected AlternateContacts alternateContacts;
    protected ServiceOrderIDs serviceOrderIDs;
    protected WorkOrderReferences workOrderReferences;

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBAName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBAName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link Accounts }
     *     
     */
    public Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts }
     *     
     */
    public void setAccounts(Accounts value) {
        this.accounts = value;
    }

    /**
     * Gets the value of the servicePriorities property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePriorities }
     *     
     */
    public ServicePriorities getServicePriorities() {
        return servicePriorities;
    }

    /**
     * Sets the value of the servicePriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePriorities }
     *     
     */
    public void setServicePriorities(ServicePriorities value) {
        this.servicePriorities = value;
    }

    /**
     * Gets the value of the serviceAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAgreements }
     *     
     */
    public ServiceAgreements getServiceAgreements() {
        return serviceAgreements;
    }

    /**
     * Sets the value of the serviceAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAgreements }
     *     
     */
    public void setServiceAgreements(ServiceAgreements value) {
        this.serviceAgreements = value;
    }

    /**
     * Gets the value of the customerHazards property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerHazards }
     *     
     */
    public CustomerHazards getCustomerHazards() {
        return customerHazards;
    }

    /**
     * Sets the value of the customerHazards property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerHazards }
     *     
     */
    public void setCustomerHazards(CustomerHazards value) {
        this.customerHazards = value;
    }

    /**
     * Gets the value of the alternateContacts property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateContacts }
     *     
     */
    public AlternateContacts getAlternateContacts() {
        return alternateContacts;
    }

    /**
     * Sets the value of the alternateContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateContacts }
     *     
     */
    public void setAlternateContacts(AlternateContacts value) {
        this.alternateContacts = value;
    }

    /**
     * Gets the value of the serviceOrderIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOrderIDs }
     *     
     */
    public ServiceOrderIDs getServiceOrderIDs() {
        return serviceOrderIDs;
    }

    /**
     * Sets the value of the serviceOrderIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOrderIDs }
     *     
     */
    public void setServiceOrderIDs(ServiceOrderIDs value) {
        this.serviceOrderIDs = value;
    }

    /**
     * Gets the value of the workOrderReferences property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderReferences }
     *     
     */
    public WorkOrderReferences getWorkOrderReferences() {
        return workOrderReferences;
    }

    /**
     * Sets the value of the workOrderReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderReferences }
     *     
     */
    public void setWorkOrderReferences(WorkOrderReferences value) {
        this.workOrderReferences = value;
    }

}
