
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an object that can be used to model a meter of types other than electric, gas, water or propane. The utility-defined identifier for this meter (often referred to as being the "Company Number") SHALL be used as the primaryIdentifier for this meter.  This is the identifier that was called the meterNo in Versions 3.0 and 4.1. 
 * 
 * <p>Java class for otherMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="otherNameplate" type="{http://www.multispeak.org/V5.0}otherNameplate" minOccurs="0"/>
 *         &lt;element name="otherLocationFields" type="{http://www.multispeak.org/V5.0}otherLocationFields" minOccurs="0"/>
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
@XmlType(name = "otherMeter", propOrder = {
    "otherNameplate",
    "otherLocationFields"
})
public class OtherMeter
    extends MspMeter
{

    protected OtherNameplate otherNameplate;
    protected OtherLocationFields otherLocationFields;

    /**
     * Gets the value of the otherNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNameplate }
     *     
     */
    public OtherNameplate getOtherNameplate() {
        return otherNameplate;
    }

    /**
     * Sets the value of the otherNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNameplate }
     *     
     */
    public void setOtherNameplate(OtherNameplate value) {
        this.otherNameplate = value;
    }

    /**
     * Gets the value of the otherLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link OtherLocationFields }
     *     
     */
    public OtherLocationFields getOtherLocationFields() {
        return otherLocationFields;
    }

    /**
     * Sets the value of the otherLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLocationFields }
     *     
     */
    public void setOtherLocationFields(OtherLocationFields value) {
        this.otherLocationFields = value;
    }

}
