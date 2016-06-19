
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;
import org.multispeak.v5_0.enumerations.DRProgramEnrollmentStatus;


/**
 * <p>Java class for DRProgramEnrollment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DRProgramEnrollment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="DRProgramID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="DRProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="PANDeviceRefs" type="{http://www.multispeak.org/V5.0}PANDeviceRefs" minOccurs="0"/>
 *         &lt;element name="DRProgramEnrollDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="DRProgramParticStartDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="DRProgramParticEndDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="DRProgramEnrollmentStatus" type="{http://www.multispeak.org/V5.0/enumerations}DRProgramEnrollmentStatus" minOccurs="0"/>
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
@XmlType(name = "DRProgramEnrollment", propOrder = {
    "drProgramID",
    "drProgramName",
    "servicePointID",
    "serviceLocationID",
    "customerID",
    "accountID",
    "panDeviceRefs",
    "drProgramEnrollDate",
    "drProgramParticStartDate",
    "drProgramParticEndDate",
    "drProgramEnrollmentStatus"
})
public class DRProgramEnrollment
    extends MspObject
{

    @XmlElement(name = "DRProgramID", required = true)
    protected ObjectID drProgramID;
    @XmlElement(name = "DRProgramName")
    protected String drProgramName;
    @XmlElement(required = true)
    protected ServicePointID servicePointID;
    protected ObjectID serviceLocationID;
    protected ObjectID customerID;
    protected ObjectID accountID;
    @XmlElement(name = "PANDeviceRefs")
    protected PANDeviceRefs panDeviceRefs;
    @XmlElement(name = "DRProgramEnrollDate")
    protected XMLGregorianCalendar drProgramEnrollDate;
    @XmlElement(name = "DRProgramParticStartDate")
    protected XMLGregorianCalendar drProgramParticStartDate;
    @XmlElement(name = "DRProgramParticEndDate")
    protected XMLGregorianCalendar drProgramParticEndDate;
    @XmlElement(name = "DRProgramEnrollmentStatus")
    protected DRProgramEnrollmentStatus drProgramEnrollmentStatus;

    /**
     * Gets the value of the drProgramID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getDRProgramID() {
        return drProgramID;
    }

    /**
     * Sets the value of the drProgramID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setDRProgramID(ObjectID value) {
        this.drProgramID = value;
    }

    /**
     * Gets the value of the drProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRProgramName() {
        return drProgramName;
    }

    /**
     * Sets the value of the drProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRProgramName(String value) {
        this.drProgramName = value;
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
     * Gets the value of the panDeviceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRefs }
     *     
     */
    public PANDeviceRefs getPANDeviceRefs() {
        return panDeviceRefs;
    }

    /**
     * Sets the value of the panDeviceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRefs }
     *     
     */
    public void setPANDeviceRefs(PANDeviceRefs value) {
        this.panDeviceRefs = value;
    }

    /**
     * Gets the value of the drProgramEnrollDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRProgramEnrollDate() {
        return drProgramEnrollDate;
    }

    /**
     * Sets the value of the drProgramEnrollDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRProgramEnrollDate(XMLGregorianCalendar value) {
        this.drProgramEnrollDate = value;
    }

    /**
     * Gets the value of the drProgramParticStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRProgramParticStartDate() {
        return drProgramParticStartDate;
    }

    /**
     * Sets the value of the drProgramParticStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRProgramParticStartDate(XMLGregorianCalendar value) {
        this.drProgramParticStartDate = value;
    }

    /**
     * Gets the value of the drProgramParticEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRProgramParticEndDate() {
        return drProgramParticEndDate;
    }

    /**
     * Sets the value of the drProgramParticEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRProgramParticEndDate(XMLGregorianCalendar value) {
        this.drProgramParticEndDate = value;
    }

    /**
     * Gets the value of the drProgramEnrollmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DRProgramEnrollmentStatus }
     *     
     */
    public DRProgramEnrollmentStatus getDRProgramEnrollmentStatus() {
        return drProgramEnrollmentStatus;
    }

    /**
     * Sets the value of the drProgramEnrollmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DRProgramEnrollmentStatus }
     *     
     */
    public void setDRProgramEnrollmentStatus(DRProgramEnrollmentStatus value) {
        this.drProgramEnrollmentStatus = value;
    }

}
