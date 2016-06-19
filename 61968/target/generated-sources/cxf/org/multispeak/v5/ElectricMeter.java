
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is an electric meter. The utility-defined identifier for this meter (often referred to as being the "Company Number") SHALL be used as the primaryIdentifier for this meter.  This is the identifier that was called the meterNo in Versions 3.0 and 4.1. 
 * 
 * <p>Java class for electricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="meterBaseID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="electricNameplate" type="{http://www.multispeak.org/V5.0}electricNameplate" minOccurs="0"/>
 *         &lt;element name="electricLocationFields" type="{http://www.multispeak.org/V5.0}electricLocationFields" minOccurs="0"/>
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
@XmlType(name = "electricMeter", propOrder = {
    "meterBaseID",
    "electricNameplate",
    "electricLocationFields"
})
public class ElectricMeter
    extends MspMeter
{

    protected ObjectID meterBaseID;
    protected ElectricNameplate electricNameplate;
    protected ElectricLocationFields electricLocationFields;

    /**
     * Gets the value of the meterBaseID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMeterBaseID() {
        return meterBaseID;
    }

    /**
     * Sets the value of the meterBaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMeterBaseID(ObjectID value) {
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

}
