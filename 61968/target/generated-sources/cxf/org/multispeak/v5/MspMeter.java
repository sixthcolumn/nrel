
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.UtilityInfo;
import org.multispeak.v5_0.enumerations.MeterConnectionStatus;


/**
 * This is an abstract class from which all meter device classes inherit.
 * 
 * <p>Java class for mspMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspDevice">
 *       &lt;sequence>
 *         &lt;element name="meterConnectionStatus" type="{http://www.multispeak.org/V5.0/enumerations}meterConnectionStatus" minOccurs="0"/>
 *         &lt;element name="metrologyFirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metrologyFirmwareRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMIDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMIVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configuredReadingTypes" type="{http://www.multispeak.org/V5.0}configuredReadingTypes" minOccurs="0"/>
 *         &lt;element name="parentMeters" type="{http://www.multispeak.org/V5.0}parentMeters" minOccurs="0"/>
 *         &lt;element name="subMeters" type="{http://www.multispeak.org/V5.0}subMeters" minOccurs="0"/>
 *         &lt;element name="modules" type="{http://www.multispeak.org/V5.0}modules" minOccurs="0"/>
 *         &lt;element name="utilityInfo" type="{http://www.multispeak.org/V5.0/commonTypes}utilityInfo" minOccurs="0"/>
 *         &lt;element name="meterInstallationHistory" type="{http://www.multispeak.org/V5.0}meterInstallationHistory" minOccurs="0"/>
 *         &lt;element name="communicationsAddress" type="{http://www.multispeak.org/V5.0}communicationsAddress" minOccurs="0"/>
 *         &lt;element name="meterSeals" type="{http://www.multispeak.org/V5.0}meterSeals" minOccurs="0"/>
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
@XmlType(name = "mspMeter", propOrder = {
    "meterConnectionStatus",
    "metrologyFirmwareVersion",
    "metrologyFirmwareRevision",
    "meterType",
    "amiDeviceType",
    "amiVendor",
    "billingCycle",
    "configuredReadingTypes",
    "parentMeters",
    "subMeters",
    "modules",
    "utilityInfo",
    "meterInstallationHistory",
    "communicationsAddress",
    "meterSeals",
    "materialManagementAssemblyID"
})
@XmlSeeAlso({
    ReceivedWaterMeter.class,
    ReceivedPropaneMeter.class,
    ReceivedElectricMeter.class,
    WaterMeter.class,
    GasMeter.class,
    ElectricMeter.class,
    PropaneMeter.class,
    ReceivedGasMeter.class,
    OtherMeter.class
})
public abstract class MspMeter
    extends MspDevice
{

    protected MeterConnectionStatus meterConnectionStatus;
    protected String metrologyFirmwareVersion;
    protected String metrologyFirmwareRevision;
    protected String meterType;
    @XmlElement(name = "AMIDeviceType")
    protected String amiDeviceType;
    @XmlElement(name = "AMIVendor")
    protected String amiVendor;
    protected String billingCycle;
    protected ConfiguredReadingTypes configuredReadingTypes;
    protected ParentMeters parentMeters;
    protected SubMeters subMeters;
    protected Modules modules;
    protected UtilityInfo utilityInfo;
    protected MeterInstallationHistory meterInstallationHistory;
    protected CommunicationsAddress communicationsAddress;
    protected MeterSeals meterSeals;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the meterConnectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MeterConnectionStatus }
     *     
     */
    public MeterConnectionStatus getMeterConnectionStatus() {
        return meterConnectionStatus;
    }

    /**
     * Sets the value of the meterConnectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConnectionStatus }
     *     
     */
    public void setMeterConnectionStatus(MeterConnectionStatus value) {
        this.meterConnectionStatus = value;
    }

    /**
     * Gets the value of the metrologyFirmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetrologyFirmwareVersion() {
        return metrologyFirmwareVersion;
    }

    /**
     * Sets the value of the metrologyFirmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetrologyFirmwareVersion(String value) {
        this.metrologyFirmwareVersion = value;
    }

    /**
     * Gets the value of the metrologyFirmwareRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetrologyFirmwareRevision() {
        return metrologyFirmwareRevision;
    }

    /**
     * Sets the value of the metrologyFirmwareRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetrologyFirmwareRevision(String value) {
        this.metrologyFirmwareRevision = value;
    }

    /**
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterType(String value) {
        this.meterType = value;
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
     * Gets the value of the configuredReadingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguredReadingTypes }
     *     
     */
    public ConfiguredReadingTypes getConfiguredReadingTypes() {
        return configuredReadingTypes;
    }

    /**
     * Sets the value of the configuredReadingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguredReadingTypes }
     *     
     */
    public void setConfiguredReadingTypes(ConfiguredReadingTypes value) {
        this.configuredReadingTypes = value;
    }

    /**
     * Gets the value of the parentMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ParentMeters }
     *     
     */
    public ParentMeters getParentMeters() {
        return parentMeters;
    }

    /**
     * Sets the value of the parentMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentMeters }
     *     
     */
    public void setParentMeters(ParentMeters value) {
        this.parentMeters = value;
    }

    /**
     * Gets the value of the subMeters property.
     * 
     * @return
     *     possible object is
     *     {@link SubMeters }
     *     
     */
    public SubMeters getSubMeters() {
        return subMeters;
    }

    /**
     * Sets the value of the subMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMeters }
     *     
     */
    public void setSubMeters(SubMeters value) {
        this.subMeters = value;
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
     * Gets the value of the meterInstallationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MeterInstallationHistory }
     *     
     */
    public MeterInstallationHistory getMeterInstallationHistory() {
        return meterInstallationHistory;
    }

    /**
     * Sets the value of the meterInstallationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterInstallationHistory }
     *     
     */
    public void setMeterInstallationHistory(MeterInstallationHistory value) {
        this.meterInstallationHistory = value;
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
     * Gets the value of the meterSeals property.
     * 
     * @return
     *     possible object is
     *     {@link MeterSeals }
     *     
     */
    public MeterSeals getMeterSeals() {
        return meterSeals;
    }

    /**
     * Sets the value of the meterSeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterSeals }
     *     
     */
    public void setMeterSeals(MeterSeals value) {
        this.meterSeals = value;
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
