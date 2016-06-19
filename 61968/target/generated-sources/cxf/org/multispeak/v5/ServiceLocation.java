
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContactInfo;
import org.multispeak.v5_0.commontypes.GraphicSymbols;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is a location at which a customer can receive service.  A serviceLocation can have utilitiy services of several different serviceTypes.
 * 
 * <p>Java class for serviceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.multispeak.org/V5.0/commonTypes}contactInfo" minOccurs="0"/>
 *         &lt;element name="locationInformation" type="{http://www.multispeak.org/V5.0}locationInformation" minOccurs="0"/>
 *         &lt;element name="serviceAgreements" type="{http://www.multispeak.org/V5.0}serviceAgreements" minOccurs="0"/>
 *         &lt;element name="serviceHazards" type="{http://www.multispeak.org/V5.0}serviceHazards" minOccurs="0"/>
 *         &lt;element name="serviceNotes" type="{http://www.multispeak.org/V5.0}supplementalNotes" minOccurs="0"/>
 *         &lt;element name="servicePriorities" type="{http://www.multispeak.org/V5.0}servicePriorities" minOccurs="0"/>
 *         &lt;element name="electricServicePoints" type="{http://www.multispeak.org/V5.0}electricServicePoints" minOccurs="0"/>
 *         &lt;element name="gasServicePoints" type="{http://www.multispeak.org/V5.0}gasServicePoints" minOccurs="0"/>
 *         &lt;element name="waterServicePoints" type="{http://www.multispeak.org/V5.0}waterServicePoints" minOccurs="0"/>
 *         &lt;element name="propaneServicePoints" type="{http://www.multispeak.org/V5.0}propaneServicePoints" minOccurs="0"/>
 *         &lt;element name="otherServicePoints" type="{http://www.multispeak.org/V5.0}otherServicePoints" minOccurs="0"/>
 *         &lt;element name="serviceOrderIDs" type="{http://www.multispeak.org/V5.0}serviceOrderIDs" minOccurs="0"/>
 *         &lt;element name="workOrderReferences" type="{http://www.multispeak.org/V5.0}workOrderReferences" minOccurs="0"/>
 *         &lt;element name="graphicSymbols" type="{http://www.multispeak.org/V5.0/commonTypes}graphicSymbols" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/V5.0}genericAnnotationFeatures" minOccurs="0"/>
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
@XmlType(name = "serviceLocation", propOrder = {
    "customerID",
    "accountID",
    "description",
    "facilityName",
    "sic",
    "siteID",
    "contactInfo",
    "locationInformation",
    "serviceAgreements",
    "serviceHazards",
    "serviceNotes",
    "servicePriorities",
    "electricServicePoints",
    "gasServicePoints",
    "waterServicePoints",
    "propaneServicePoints",
    "otherServicePoints",
    "serviceOrderIDs",
    "workOrderReferences",
    "graphicSymbols",
    "annotationList"
})
public class ServiceLocation
    extends MspPointObject
{

    protected ObjectID customerID;
    protected ObjectID accountID;
    protected String description;
    protected String facilityName;
    @XmlElement(name = "SIC")
    protected String sic;
    protected String siteID;
    protected ContactInfo contactInfo;
    protected LocationInformation locationInformation;
    protected ServiceAgreements serviceAgreements;
    protected ServiceHazards serviceHazards;
    protected SupplementalNotes serviceNotes;
    protected ServicePriorities servicePriorities;
    protected ElectricServicePoints electricServicePoints;
    protected GasServicePoints gasServicePoints;
    protected WaterServicePoints waterServicePoints;
    protected PropaneServicePoints propaneServicePoints;
    protected OtherServicePoints otherServicePoints;
    protected ServiceOrderIDs serviceOrderIDs;
    protected WorkOrderReferences workOrderReferences;
    protected GraphicSymbols graphicSymbols;
    protected GenericAnnotationFeatures annotationList;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Gets the value of the sic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the locationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInformation }
     *     
     */
    public LocationInformation getLocationInformation() {
        return locationInformation;
    }

    /**
     * Sets the value of the locationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInformation }
     *     
     */
    public void setLocationInformation(LocationInformation value) {
        this.locationInformation = value;
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
     * Gets the value of the serviceHazards property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHazards }
     *     
     */
    public ServiceHazards getServiceHazards() {
        return serviceHazards;
    }

    /**
     * Sets the value of the serviceHazards property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHazards }
     *     
     */
    public void setServiceHazards(ServiceHazards value) {
        this.serviceHazards = value;
    }

    /**
     * Gets the value of the serviceNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalNotes }
     *     
     */
    public SupplementalNotes getServiceNotes() {
        return serviceNotes;
    }

    /**
     * Sets the value of the serviceNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalNotes }
     *     
     */
    public void setServiceNotes(SupplementalNotes value) {
        this.serviceNotes = value;
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
     * Gets the value of the electricServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricServicePoints }
     *     
     */
    public ElectricServicePoints getElectricServicePoints() {
        return electricServicePoints;
    }

    /**
     * Sets the value of the electricServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricServicePoints }
     *     
     */
    public void setElectricServicePoints(ElectricServicePoints value) {
        this.electricServicePoints = value;
    }

    /**
     * Gets the value of the gasServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link GasServicePoints }
     *     
     */
    public GasServicePoints getGasServicePoints() {
        return gasServicePoints;
    }

    /**
     * Sets the value of the gasServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasServicePoints }
     *     
     */
    public void setGasServicePoints(GasServicePoints value) {
        this.gasServicePoints = value;
    }

    /**
     * Gets the value of the waterServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link WaterServicePoints }
     *     
     */
    public WaterServicePoints getWaterServicePoints() {
        return waterServicePoints;
    }

    /**
     * Sets the value of the waterServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterServicePoints }
     *     
     */
    public void setWaterServicePoints(WaterServicePoints value) {
        this.waterServicePoints = value;
    }

    /**
     * Gets the value of the propaneServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneServicePoints }
     *     
     */
    public PropaneServicePoints getPropaneServicePoints() {
        return propaneServicePoints;
    }

    /**
     * Sets the value of the propaneServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneServicePoints }
     *     
     */
    public void setPropaneServicePoints(PropaneServicePoints value) {
        this.propaneServicePoints = value;
    }

    /**
     * Gets the value of the otherServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link OtherServicePoints }
     *     
     */
    public OtherServicePoints getOtherServicePoints() {
        return otherServicePoints;
    }

    /**
     * Sets the value of the otherServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherServicePoints }
     *     
     */
    public void setOtherServicePoints(OtherServicePoints value) {
        this.otherServicePoints = value;
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

    /**
     * Gets the value of the graphicSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicSymbols }
     *     
     */
    public GraphicSymbols getGraphicSymbols() {
        return graphicSymbols;
    }

    /**
     * Sets the value of the graphicSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicSymbols }
     *     
     */
    public void setGraphicSymbols(GraphicSymbols value) {
        this.graphicSymbols = value;
    }

    /**
     * Gets the value of the annotationList property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public GenericAnnotationFeatures getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public void setAnnotationList(GenericAnnotationFeatures value) {
        this.annotationList = value;
    }

}
