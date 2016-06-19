
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.OutageDetectionDeviceStatus;
import org.multispeak.v5_0.enumerations.OutageDetectionSource;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for outageDetectionDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDetectionSource" type="{http://www.multispeak.org/V5.0/enumerations}outageDetectionSource" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="outageDetectionDeviceStatus" type="{http://www.multispeak.org/V5.0/enumerations}outageDetectionDeviceStatus" minOccurs="0"/>
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
@XmlType(name = "outageDetectionDevice", propOrder = {
    "serialNumber",
    "outageDetectionSource",
    "manufacturer",
    "phases",
    "phaseCode",
    "meterID",
    "outageDetectionDeviceStatus",
    "assetData",
    "communicationsAddress",
    "materialManagementAssemblyID"
})
public class OutageDetectionDevice
    extends MspPointObject
{

    protected String serialNumber;
    protected OutageDetectionSource outageDetectionSource;
    protected String manufacturer;
    protected BigInteger phases;
    protected PhaseCode phaseCode;
    protected MeterID meterID;
    protected OutageDetectionDeviceStatus outageDetectionDeviceStatus;
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
     * Gets the value of the outageDetectionSource property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectionSource }
     *     
     */
    public OutageDetectionSource getOutageDetectionSource() {
        return outageDetectionSource;
    }

    /**
     * Sets the value of the outageDetectionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectionSource }
     *     
     */
    public void setOutageDetectionSource(OutageDetectionSource value) {
        this.outageDetectionSource = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
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
     * Gets the value of the outageDetectionDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectionDeviceStatus }
     *     
     */
    public OutageDetectionDeviceStatus getOutageDetectionDeviceStatus() {
        return outageDetectionDeviceStatus;
    }

    /**
     * Sets the value of the outageDetectionDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectionDeviceStatus }
     *     
     */
    public void setOutageDetectionDeviceStatus(OutageDetectionDeviceStatus value) {
        this.outageDetectionDeviceStatus = value;
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
