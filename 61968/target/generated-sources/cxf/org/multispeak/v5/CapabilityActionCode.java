
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These values are expected to be implementation specific. It is suggested that the values for these fields be discovered using the GetDomainValues method.
 * 
 * <p>Java class for capabilityActionCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capabilityActionCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capabilityActionCodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capabilityActionCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capabilityActionCode", propOrder = {
    "capabilityActionCodeName",
    "capabilityActionCodeValue"
})
public class CapabilityActionCode {

    @XmlElement(required = true)
    protected String capabilityActionCodeName;
    @XmlElement(required = true)
    protected String capabilityActionCodeValue;

    /**
     * Gets the value of the capabilityActionCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityActionCodeName() {
        return capabilityActionCodeName;
    }

    /**
     * Sets the value of the capabilityActionCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityActionCodeName(String value) {
        this.capabilityActionCodeName = value;
    }

    /**
     * Gets the value of the capabilityActionCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityActionCodeValue() {
        return capabilityActionCodeValue;
    }

    /**
     * Sets the value of the capabilityActionCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityActionCodeValue(String value) {
        this.capabilityActionCodeValue = value;
    }

}
