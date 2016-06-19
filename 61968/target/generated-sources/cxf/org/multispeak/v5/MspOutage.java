
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.enumerations.OutagePriority;
import org.multispeak.v5_0.enumerations.OutageType;


/**
 * This is the abstract class from which all outages inherit.
 * 
 * <p>Java class for mspOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspOutage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="isCustomerResponsible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outageType" type="{http://www.multispeak.org/V5.0/enumerations}outageType"/>
 *         &lt;element name="outagePriority" type="{http://www.multispeak.org/V5.0/enumerations}outagePriority" minOccurs="0"/>
 *         &lt;element name="totalCustomerCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="priorityCustomerCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="outageDetectionEventCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="restoredCustomerCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="outageHistoryEvents" type="{http://www.multispeak.org/V5.0}outageHistoryEvents" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/V5.0}outageStatus" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://www.multispeak.org/V5.0}locationDetails" minOccurs="0"/>
 *         &lt;element name="outageDetails" type="{http://www.multispeak.org/V5.0}outageDetails" minOccurs="0"/>
 *         &lt;element name="outageRemarks" type="{http://www.multispeak.org/V5.0}outageRemarks" minOccurs="0"/>
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
@XmlType(name = "mspOutage", propOrder = {
    "timeStamp",
    "isCustomerResponsible",
    "outageType",
    "outagePriority",
    "totalCustomerCount",
    "priorityCustomerCount",
    "outageDetectionEventCount",
    "restoredCustomerCount",
    "outageHistoryEvents",
    "outageStatus",
    "locationDetails",
    "outageDetails",
    "outageRemarks"
})
@XmlSeeAlso({
    GasOutage.class,
    CableOutage.class,
    WaterOutage.class,
    OtherOutage.class,
    ElectricOutage.class,
    InternetOutage.class,
    TelecomOutage.class
})
public abstract class MspOutage
    extends MspObject
{

    protected XMLGregorianCalendar timeStamp;
    protected Boolean isCustomerResponsible;
    @XmlElement(required = true)
    protected OutageType outageType;
    protected OutagePriority outagePriority;
    protected BigInteger totalCustomerCount;
    protected BigInteger priorityCustomerCount;
    protected BigInteger outageDetectionEventCount;
    protected BigInteger restoredCustomerCount;
    protected OutageHistoryEvents outageHistoryEvents;
    protected OutageStatus outageStatus;
    protected LocationDetails locationDetails;
    protected OutageDetails outageDetails;
    protected OutageRemarks outageRemarks;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the isCustomerResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerResponsible() {
        return isCustomerResponsible;
    }

    /**
     * Sets the value of the isCustomerResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerResponsible(Boolean value) {
        this.isCustomerResponsible = value;
    }

    /**
     * Gets the value of the outageType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageType }
     *     
     */
    public OutageType getOutageType() {
        return outageType;
    }

    /**
     * Sets the value of the outageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageType }
     *     
     */
    public void setOutageType(OutageType value) {
        this.outageType = value;
    }

    /**
     * Gets the value of the outagePriority property.
     * 
     * @return
     *     possible object is
     *     {@link OutagePriority }
     *     
     */
    public OutagePriority getOutagePriority() {
        return outagePriority;
    }

    /**
     * Sets the value of the outagePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutagePriority }
     *     
     */
    public void setOutagePriority(OutagePriority value) {
        this.outagePriority = value;
    }

    /**
     * Gets the value of the totalCustomerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCustomerCount() {
        return totalCustomerCount;
    }

    /**
     * Sets the value of the totalCustomerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCustomerCount(BigInteger value) {
        this.totalCustomerCount = value;
    }

    /**
     * Gets the value of the priorityCustomerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityCustomerCount() {
        return priorityCustomerCount;
    }

    /**
     * Sets the value of the priorityCustomerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityCustomerCount(BigInteger value) {
        this.priorityCustomerCount = value;
    }

    /**
     * Gets the value of the outageDetectionEventCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutageDetectionEventCount() {
        return outageDetectionEventCount;
    }

    /**
     * Sets the value of the outageDetectionEventCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutageDetectionEventCount(BigInteger value) {
        this.outageDetectionEventCount = value;
    }

    /**
     * Gets the value of the restoredCustomerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRestoredCustomerCount() {
        return restoredCustomerCount;
    }

    /**
     * Sets the value of the restoredCustomerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRestoredCustomerCount(BigInteger value) {
        this.restoredCustomerCount = value;
    }

    /**
     * Gets the value of the outageHistoryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link OutageHistoryEvents }
     *     
     */
    public OutageHistoryEvents getOutageHistoryEvents() {
        return outageHistoryEvents;
    }

    /**
     * Sets the value of the outageHistoryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageHistoryEvents }
     *     
     */
    public void setOutageHistoryEvents(OutageHistoryEvents value) {
        this.outageHistoryEvents = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageStatus }
     *     
     */
    public OutageStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageStatus }
     *     
     */
    public void setOutageStatus(OutageStatus value) {
        this.outageStatus = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetails }
     *     
     */
    public LocationDetails getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetails }
     *     
     */
    public void setLocationDetails(LocationDetails value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the outageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetails }
     *     
     */
    public OutageDetails getOutageDetails() {
        return outageDetails;
    }

    /**
     * Sets the value of the outageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetails }
     *     
     */
    public void setOutageDetails(OutageDetails value) {
        this.outageDetails = value;
    }

    /**
     * Gets the value of the outageRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRemarks }
     *     
     */
    public OutageRemarks getOutageRemarks() {
        return outageRemarks;
    }

    /**
     * Sets the value of the outageRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRemarks }
     *     
     */
    public void setOutageRemarks(OutageRemarks value) {
        this.outageRemarks = value;
    }

}
