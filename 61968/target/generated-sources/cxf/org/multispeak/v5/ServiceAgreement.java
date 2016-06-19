
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * This is an agreement for service between a utility and one of its customers.  It is intended that this class will map to the IEC CIM concept of CustomerAgreement.
 * 
 * <p>Java class for serviceAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceAgreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}agreement">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tariffID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="budgetBillingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRProgramEnrollmentIDs" type="{http://www.multispeak.org/V5.0}DRProgramEnrollmentIDs" minOccurs="0"/>
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
@XmlType(name = "serviceAgreement", propOrder = {
    "customerID",
    "accountID",
    "serviceLocationID",
    "servicePointID",
    "revenueClass",
    "tariffID",
    "budgetBillingCode",
    "drProgramEnrollmentIDs"
})
public class ServiceAgreement
    extends Agreement
{

    protected ObjectID customerID;
    protected ObjectID accountID;
    protected ObjectID serviceLocationID;
    protected ServicePointID servicePointID;
    protected String revenueClass;
    protected ObjectID tariffID;
    protected String budgetBillingCode;
    @XmlElement(name = "DRProgramEnrollmentIDs")
    protected DRProgramEnrollmentIDs drProgramEnrollmentIDs;

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
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the tariffID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTariffID() {
        return tariffID;
    }

    /**
     * Sets the value of the tariffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTariffID(ObjectID value) {
        this.tariffID = value;
    }

    /**
     * Gets the value of the budgetBillingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetBillingCode() {
        return budgetBillingCode;
    }

    /**
     * Sets the value of the budgetBillingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetBillingCode(String value) {
        this.budgetBillingCode = value;
    }

    /**
     * Gets the value of the drProgramEnrollmentIDs property.
     * 
     * @return
     *     possible object is
     *     {@link DRProgramEnrollmentIDs }
     *     
     */
    public DRProgramEnrollmentIDs getDRProgramEnrollmentIDs() {
        return drProgramEnrollmentIDs;
    }

    /**
     * Sets the value of the drProgramEnrollmentIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DRProgramEnrollmentIDs }
     *     
     */
    public void setDRProgramEnrollmentIDs(DRProgramEnrollmentIDs value) {
        this.drProgramEnrollmentIDs = value;
    }

}
