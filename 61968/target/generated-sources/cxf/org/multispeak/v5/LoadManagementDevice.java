
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.RealPower;
import org.multispeak.v5_0.commontypes.UtilityInfo;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.DeviceStatus;


/**
 * This is a device that permits utility control of customer load.  The device ID is contained in the object ID for each device.
 * 
 * <p>Java class for loadManagementDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagementDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.multispeak.org/V5.0/enumerations}deviceStatus" minOccurs="0"/>
 *         &lt;element name="powerLimit" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="numberOfRelays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ratedCurrent" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="modules" type="{http://www.multispeak.org/V5.0}modules" minOccurs="0"/>
 *         &lt;element name="loadManagementDeviceRelays" type="{http://www.multispeak.org/V5.0}loadManagementDeviceRelays" minOccurs="0"/>
 *         &lt;element name="AMIDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMIVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utilityInfo" type="{http://www.multispeak.org/V5.0/commonTypes}utilityInfo" minOccurs="0"/>
 *         &lt;element name="associatedDevices" type="{http://www.multispeak.org/V5.0}associatedDevices" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
 *         &lt;element name="communicationsAddress" type="{http://www.multispeak.org/V5.0}communicationsAddress" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "loadManagementDevice", propOrder = {
    "serialNumber",
    "deviceType",
    "phases",
    "status",
    "powerLimit",
    "meterID",
    "numberOfRelays",
    "ratedVoltage",
    "ratedCurrent",
    "modules",
    "loadManagementDeviceRelays",
    "amiDeviceType",
    "amiVendor",
    "utilityInfo",
    "associatedDevices",
    "assetData",
    "communicationsAddress",
    "materialManagementAssemblyID"
})
public class LoadManagementDevice
    extends MspPointObject
{

    protected String serialNumber;
    protected String deviceType;
    protected BigInteger phases;
    protected DeviceStatus status;
    protected RealPower powerLimit;
    protected MeterID meterID;
    protected BigInteger numberOfRelays;
    protected Voltage ratedVoltage;
    protected Current ratedCurrent;
    protected Modules modules;
    protected LoadManagementDeviceRelays loadManagementDeviceRelays;
    @XmlElement(name = "AMIDeviceType")
    protected String amiDeviceType;
    @XmlElement(name = "AMIVendor")
    protected String amiVendor;
    protected UtilityInfo utilityInfo;
    protected AssociatedDevices associatedDevices;
    protected AssetData assetData;
    protected CommunicationsAddress communicationsAddress;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhases(BigInteger value) {
        this.phases = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatus }
     *     
     */
    public DeviceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatus }
     *     
     */
    public void setStatus(DeviceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the powerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getPowerLimit() {
        return powerLimit;
    }

    /**
     * Sets the value of the powerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setPowerLimit(RealPower value) {
        this.powerLimit = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the numberOfRelays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRelays() {
        return numberOfRelays;
    }

    /**
     * Sets the value of the numberOfRelays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRelays(BigInteger value) {
        this.numberOfRelays = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the ratedCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * Sets the value of the ratedCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setRatedCurrent(Current value) {
        this.ratedCurrent = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Modules }
     *     
     */
    public Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modules }
     *     
     */
    public void setModules(Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the loadManagementDeviceRelays property.
     * 
     * @return
     *     possible object is
     *     {@link LoadManagementDeviceRelays }
     *     
     */
    public LoadManagementDeviceRelays getLoadManagementDeviceRelays() {
        return loadManagementDeviceRelays;
    }

    /**
     * Sets the value of the loadManagementDeviceRelays property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadManagementDeviceRelays }
     *     
     */
    public void setLoadManagementDeviceRelays(LoadManagementDeviceRelays value) {
        this.loadManagementDeviceRelays = value;
    }

    /**
     * Gets the value of the amiDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMIDeviceType() {
        return amiDeviceType;
    }

    /**
     * Sets the value of the amiDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMIDeviceType(String value) {
        this.amiDeviceType = value;
    }

    /**
     * Gets the value of the amiVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMIVendor() {
        return amiVendor;
    }

    /**
     * Sets the value of the amiVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMIVendor(String value) {
        this.amiVendor = value;
    }

    /**
     * Gets the value of the utilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityInfo }
     *     
     */
    public UtilityInfo getUtilityInfo() {
        return utilityInfo;
    }

    /**
     * Sets the value of the utilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityInfo }
     *     
     */
    public void setUtilityInfo(UtilityInfo value) {
        this.utilityInfo = value;
    }

    /**
     * Gets the value of the associatedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedDevices }
     *     
     */
    public AssociatedDevices getAssociatedDevices() {
        return associatedDevices;
    }

    /**
     * Sets the value of the associatedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedDevices }
     *     
     */
    public void setAssociatedDevices(AssociatedDevices value) {
        this.associatedDevices = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
    }

    /**
     * Gets the value of the communicationsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsAddress }
     *     
     */
    public CommunicationsAddress getCommunicationsAddress() {
        return communicationsAddress;
    }

    /**
     * Sets the value of the communicationsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsAddress }
     *     
     */
    public void setCommunicationsAddress(CommunicationsAddress value) {
        this.communicationsAddress = value;
    }

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

}
