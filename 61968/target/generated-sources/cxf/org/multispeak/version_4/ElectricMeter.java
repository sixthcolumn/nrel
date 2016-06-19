
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="meterBaseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electricNameplate" type="{http://www.multispeak.org/Version_4.1_Release}electricNameplate" minOccurs="0"/>
 *         &lt;element name="electricLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}electricLocationFields" minOccurs="0"/>
 *         &lt;element name="sealNumberList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString6" minOccurs="0"/>
 *         &lt;element name="parentMeterList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterID" minOccurs="0"/>
 *         &lt;element name="subMeterList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterID" minOccurs="0"/>
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
@XmlType(name = "electricMeter", propOrder = {
    "meterBaseID",
    "electricNameplate",
    "electricLocationFields",
    "sealNumberList",
    "parentMeterList",
    "subMeterList"
})
public class ElectricMeter
    extends MspMeter
{

    protected String meterBaseID;
    protected ElectricNameplate electricNameplate;
    protected ElectricLocationFields electricLocationFields;
    protected ArrayOfString6 sealNumberList;
    protected ArrayOfMeterID parentMeterList;
    protected ArrayOfMeterID subMeterList;

    /**
     * Gets the value of the meterBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterBaseID() {
        return meterBaseID;
    }

    /**
     * Sets the value of the meterBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterBaseID(String value) {
        this.meterBaseID = value;
    }

    /**
     * Gets the value of the electricNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricNameplate }
     *     
     */
    public ElectricNameplate getElectricNameplate() {
        return electricNameplate;
    }

    /**
     * Sets the value of the electricNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricNameplate }
     *     
     */
    public void setElectricNameplate(ElectricNameplate value) {
        this.electricNameplate = value;
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
     * Gets the value of the sealNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString6 }
     *     
     */
    public ArrayOfString6 getSealNumberList() {
        return sealNumberList;
    }

    /**
     * Sets the value of the sealNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString6 }
     *     
     */
    public void setSealNumberList(ArrayOfString6 value) {
        this.sealNumberList = value;
    }

    /**
     * Gets the value of the parentMeterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public ArrayOfMeterID getParentMeterList() {
        return parentMeterList;
    }

    /**
     * Sets the value of the parentMeterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public void setParentMeterList(ArrayOfMeterID value) {
        this.parentMeterList = value;
    }

    /**
     * Gets the value of the subMeterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public ArrayOfMeterID getSubMeterList() {
        return subMeterList;
    }

    /**
     * Sets the value of the subMeterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public void setSubMeterList(ArrayOfMeterID value) {
        this.subMeterList = value;
    }

}
