
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageDetectionDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDetectDeviceType" type="{http://www.multispeak.org/Version_3.0}outageDetectDeviceType" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phaseCd" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDetectDeviceStatus" type="{http://www.multispeak.org/Version_3.0}outageDetectDeviceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
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
    "outageDetectDeviceType",
    "manufacturer",
    "phases",
    "phaseCd",
    "meterNo",
    "outageDetectDeviceStatus"
})
public class OutageDetectionDevice
    extends MspPointObject
{

    protected String serialNumber;
    protected OutageDetectDeviceType outageDetectDeviceType;
    protected String manufacturer;
    protected Long phases;
    protected PhaseCd phaseCd;
    protected String meterNo;
    protected OutageDetectDeviceStatus outageDetectDeviceStatus;

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
     * Gets the value of the outageDetectDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public OutageDetectDeviceType getOutageDetectDeviceType() {
        return outageDetectDeviceType;
    }

    /**
     * Sets the value of the outageDetectDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public void setOutageDetectDeviceType(OutageDetectDeviceType value) {
        this.outageDetectDeviceType = value;
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
     *     {@link Long }
     *     
     */
    public Long getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhases(Long value) {
        this.phases = value;
    }

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhaseCd(PhaseCd value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the meterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * Sets the value of the meterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNo(String value) {
        this.meterNo = value;
    }

    /**
     * Gets the value of the outageDetectDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectDeviceStatus }
     *     
     */
    public OutageDetectDeviceStatus getOutageDetectDeviceStatus() {
        return outageDetectDeviceStatus;
    }

    /**
     * Sets the value of the outageDetectDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectDeviceStatus }
     *     
     */
    public void setOutageDetectDeviceStatus(OutageDetectDeviceStatus value) {
        this.outageDetectDeviceStatus = value;
    }

}
