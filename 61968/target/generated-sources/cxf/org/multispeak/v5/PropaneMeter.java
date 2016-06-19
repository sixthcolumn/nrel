
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an propane meter. The utility-defined identifier for this meter (often referred to as being the "Company Number") SHALL be used as the primaryIdentifier for this meter.  This is the identifier that was called the meterNo in Versions 3.0 and 4.1. 
 * 
 * <p>Java class for propaneMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propaneMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="propaneNameplate" type="{http://www.multispeak.org/V5.0}propaneNameplate" minOccurs="0"/>
 *         &lt;element name="propaneLocationFields" type="{http://www.multispeak.org/V5.0}propaneLocationFields" minOccurs="0"/>
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
@XmlType(name = "propaneMeter", propOrder = {
    "propaneNameplate",
    "propaneLocationFields"
})
public class PropaneMeter
    extends MspMeter
{

    protected PropaneNameplate propaneNameplate;
    protected PropaneLocationFields propaneLocationFields;

    /**
     * Gets the value of the propaneNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneNameplate }
     *     
     */
    public PropaneNameplate getPropaneNameplate() {
        return propaneNameplate;
    }

    /**
     * Sets the value of the propaneNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneNameplate }
     *     
     */
    public void setPropaneNameplate(PropaneNameplate value) {
        this.propaneNameplate = value;
    }

    /**
     * Gets the value of the propaneLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneLocationFields }
     *     
     */
    public PropaneLocationFields getPropaneLocationFields() {
        return propaneLocationFields;
    }

    /**
     * Sets the value of the propaneLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneLocationFields }
     *     
     */
    public void setPropaneLocationFields(PropaneLocationFields value) {
        this.propaneLocationFields = value;
    }

}
