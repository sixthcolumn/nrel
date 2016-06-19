
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a gas meter. The utility-defined identifier for this meter (often referred to as being the "Company Number") SHALL be used as the primaryIdentifier for this meter.  This is the identifier that was called the meterNo in Versions 3.0 and 4.1. 
 * 
 * <p>Java class for gasMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="gasNameplate" type="{http://www.multispeak.org/V5.0}gasNameplate" minOccurs="0"/>
 *         &lt;element name="gasLocationFields" type="{http://www.multispeak.org/V5.0}gasLocationFields" minOccurs="0"/>
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
@XmlType(name = "gasMeter", propOrder = {
    "gasNameplate",
    "gasLocationFields"
})
public class GasMeter
    extends MspMeter
{

    protected GasNameplate gasNameplate;
    protected GasLocationFields gasLocationFields;

    /**
     * Gets the value of the gasNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link GasNameplate }
     *     
     */
    public GasNameplate getGasNameplate() {
        return gasNameplate;
    }

    /**
     * Sets the value of the gasNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasNameplate }
     *     
     */
    public void setGasNameplate(GasNameplate value) {
        this.gasNameplate = value;
    }

    /**
     * Gets the value of the gasLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link GasLocationFields }
     *     
     */
    public GasLocationFields getGasLocationFields() {
        return gasLocationFields;
    }

    /**
     * Sets the value of the gasLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasLocationFields }
     *     
     */
    public void setGasLocationFields(GasLocationFields value) {
        this.gasLocationFields = value;
    }

}
