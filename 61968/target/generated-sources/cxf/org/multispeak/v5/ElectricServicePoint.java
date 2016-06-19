
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.PowerStatus;


/**
 * A point of service for receiving electrical utility service.
 * 
 * <p>Java class for electricServicePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricServicePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricUsagePoint">
 *       &lt;sequence>
 *         &lt;element name="serviceSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="electricMeterID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/V5.0/enumerations}powerStatus" minOccurs="0"/>
 *         &lt;element name="isCogenerationSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workOrderIdentifier" type="{http://www.multispeak.org/V5.0}workReference" minOccurs="0"/>
 *         &lt;element name="serviceOrderID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointStatus" type="{http://www.multispeak.org/V5.0}servicePointStatus" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="billingStatusInformation" type="{http://www.multispeak.org/V5.0}billingStatusInformation" minOccurs="0"/>
 *         &lt;element name="electricLocationFields" type="{http://www.multispeak.org/V5.0}electricLocationFields" minOccurs="0"/>
 *         &lt;element name="electricMeter" type="{http://www.multispeak.org/V5.0}electricMeter" minOccurs="0"/>
 *         &lt;element name="electricalRatings" type="{http://www.multispeak.org/V5.0}electricalRatings" minOccurs="0"/>
 *         &lt;element name="premisesDisplays" type="{http://www.multispeak.org/V5.0}premisesDisplays" minOccurs="0"/>
 *         &lt;element name="deviceList" type="{http://www.multispeak.org/V5.0}deviceList" minOccurs="0"/>
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
@XmlType(name = "electricServicePoint", propOrder = {
    "serviceSubType",
    "customerID",
    "accountID",
    "serviceLocationID",
    "electricMeterID",
    "outageStatus",
    "isCogenerationSite",
    "workOrderIdentifier",
    "serviceOrderID",
    "servicePointStatus",
    "billingCycle",
    "route",
    "shutOffDate",
    "connectDate",
    "disconnectDate",
    "billingStatusInformation",
    "electricLocationFields",
    "electricMeter",
    "electricalRatings",
    "premisesDisplays",
    "deviceList"
})
public class ElectricServicePoint
    extends MspElectricUsagePoint
{

    protected String serviceSubType;
    protected ObjectID customerID;
    protected ObjectID accountID;
    protected ObjectID serviceLocationID;
    protected ObjectID electricMeterID;
    protected PowerStatus outageStatus;
    protected Boolean isCogenerationSite;
    protected WorkReference workOrderIdentifier;
    protected ObjectID serviceOrderID;
    protected ServicePointStatus servicePointStatus;
    protected String billingCycle;
    protected String route;
    protected XMLGregorianCalendar shutOffDate;
    protected XMLGregorianCalendar connectDate;
    protected XMLGregorianCalendar disconnectDate;
    protected BillingStatusInformation billingStatusInformation;
    protected ElectricLocationFields electricLocationFields;
    protected ElectricMeter electricMeter;
    protected ElectricalRatings electricalRatings;
    protected PremisesDisplays premisesDisplays;
    protected DeviceList deviceList;

    /**
     * Gets the value of the serviceSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubType() {
        return serviceSubType;
    }

    /**
     * Sets the value of the serviceSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubType(String value) {
        this.serviceSubType = value;
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
     * Gets the value of the electricMeterID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getElectricMeterID() {
        return electricMeterID;
    }

    /**
     * Sets the value of the electricMeterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setElectricMeterID(ObjectID value) {
        this.electricMeterID = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PowerStatus }
     *     
     */
    public PowerStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerStatus }
     *     
     */
    public void setOutageStatus(PowerStatus value) {
        this.outageStatus = value;
    }

    /**
     * Gets the value of the isCogenerationSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCogenerationSite() {
        return isCogenerationSite;
    }

    /**
     * Sets the value of the isCogenerationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCogenerationSite(Boolean value) {
        this.isCogenerationSite = value;
    }

    /**
     * Gets the value of the workOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link WorkReference }
     *     
     */
    public WorkReference getWorkOrderIdentifier() {
        return workOrderIdentifier;
    }

    /**
     * Sets the value of the workOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkReference }
     *     
     */
    public void setWorkOrderIdentifier(WorkReference value) {
        this.workOrderIdentifier = value;
    }

    /**
     * Gets the value of the serviceOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceOrderID() {
        return serviceOrderID;
    }

    /**
     * Sets the value of the serviceOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceOrderID(ObjectID value) {
        this.serviceOrderID = value;
    }

    /**
     * Gets the value of the servicePointStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointStatus }
     *     
     */
    public ServicePointStatus getServicePointStatus() {
        return servicePointStatus;
    }

    /**
     * Sets the value of the servicePointStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointStatus }
     *     
     */
    public void setServicePointStatus(ServicePointStatus value) {
        this.servicePointStatus = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycle(String value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the shutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShutOffDate() {
        return shutOffDate;
    }

    /**
     * Sets the value of the shutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShutOffDate(XMLGregorianCalendar value) {
        this.shutOffDate = value;
    }

    /**
     * Gets the value of the connectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectDate() {
        return connectDate;
    }

    /**
     * Sets the value of the connectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectDate(XMLGregorianCalendar value) {
        this.connectDate = value;
    }

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the billingStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BillingStatusInformation }
     *     
     */
    public BillingStatusInformation getBillingStatusInformation() {
        return billingStatusInformation;
    }

    /**
     * Sets the value of the billingStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingStatusInformation }
     *     
     */
    public void setBillingStatusInformation(BillingStatusInformation value) {
        this.billingStatusInformation = value;
    }

    /**
     * Gets the value of the electricLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricLocationFields }
     *     
     */
    public ElectricLocationFields getElectricLocationFields() {
        return electricLocationFields;
    }

    /**
     * Sets the value of the electricLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricLocationFields }
     *     
     */
    public void setElectricLocationFields(ElectricLocationFields value) {
        this.electricLocationFields = value;
    }

    /**
     * Gets the value of the electricMeter property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeter }
     *     
     */
    public ElectricMeter getElectricMeter() {
        return electricMeter;
    }

    /**
     * Sets the value of the electricMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeter }
     *     
     */
    public void setElectricMeter(ElectricMeter value) {
        this.electricMeter = value;
    }

    /**
     * Gets the value of the electricalRatings property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricalRatings }
     *     
     */
    public ElectricalRatings getElectricalRatings() {
        return electricalRatings;
    }

    /**
     * Sets the value of the electricalRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricalRatings }
     *     
     */
    public void setElectricalRatings(ElectricalRatings value) {
        this.electricalRatings = value;
    }

    /**
     * Gets the value of the premisesDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplays }
     *     
     */
    public PremisesDisplays getPremisesDisplays() {
        return premisesDisplays;
    }

    /**
     * Sets the value of the premisesDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplays }
     *     
     */
    public void setPremisesDisplays(PremisesDisplays value) {
        this.premisesDisplays = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setDeviceList(DeviceList value) {
        this.deviceList = value;
    }

}
