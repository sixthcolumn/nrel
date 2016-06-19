
package com.epri._2013.dergroupstatuses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherCapability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capabilityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capabilitySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capabilityValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="capabilityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherCapability", propOrder = {
    "capabilityType",
    "capabilitySubType",
    "capabilityValue",
    "capabilityUnits"
})
public class OtherCapability {

    @XmlElement(required = true)
    protected String capabilityType;
    protected String capabilitySubType;
    protected Float capabilityValue;
    protected String capabilityUnits;

    /**
     * Gets the value of the capabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityType() {
        return capabilityType;
    }

    /**
     * Sets the value of the capabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityType(String value) {
        this.capabilityType = value;
    }

    /**
     * Gets the value of the capabilitySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilitySubType() {
        return capabilitySubType;
    }

    /**
     * Sets the value of the capabilitySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilitySubType(String value) {
        this.capabilitySubType = value;
    }

    /**
     * Gets the value of the capabilityValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCapabilityValue() {
        return capabilityValue;
    }

    /**
     * Sets the value of the capabilityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCapabilityValue(Float value) {
        this.capabilityValue = value;
    }

    /**
     * Gets the value of the capabilityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityUnits() {
        return capabilityUnits;
    }

    /**
     * Sets the value of the capabilityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityUnits(String value) {
        this.capabilityUnits = value;
    }

}
