
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspDevice">
 *       &lt;sequence>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sealNumberList" type="{http://www.multispeak.org/Version_3.0}ArrayOfString1" minOccurs="0"/>
 *         &lt;element name="AMRType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameplate" type="{http://www.multispeak.org/Version_3.0}nameplate" minOccurs="0"/>
 *         &lt;element name="utilityInfo" type="{http://www.multispeak.org/Version_3.0}utilityInfo" minOccurs="0"/>
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
@XmlType(name = "meter", propOrder = {
    "meterNo",
    "serialNumber",
    "meterType",
    "manufacturer",
    "sealNumberList",
    "amrType",
    "nameplate",
    "utilityInfo"
})
public class Meter
    extends MspDevice
{

    protected String meterNo;
    protected String serialNumber;
    protected String meterType;
    protected String manufacturer;
    protected ArrayOfString1 sealNumberList;
    @XmlElement(name = "AMRType")
    protected String amrType;
    protected Nameplate nameplate;
    protected UtilityInfo utilityInfo;

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
     * Gets the value of the sealNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getSealNumberList() {
        return sealNumberList;
    }

    /**
     * Sets the value of the sealNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setSealNumberList(ArrayOfString1 value) {
        this.sealNumberList = value;
    }

    /**
     * Gets the value of the amrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMRType() {
        return amrType;
    }

    /**
     * Sets the value of the amrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMRType(String value) {
        this.amrType = value;
    }

    /**
     * Gets the value of the nameplate property.
     * 
     * @return
     *     possible object is
     *     {@link Nameplate }
     *     
     */
    public Nameplate getNameplate() {
        return nameplate;
    }

    /**
     * Sets the value of the nameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nameplate }
     *     
     */
    public void setNameplate(Nameplate value) {
        this.nameplate = value;
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

}
