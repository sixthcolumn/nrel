
package com.epri._2013.dergroupdispatches;

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
 *         &lt;element name="otherCapabilityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otherCapabilitySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherCapabilityValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="otherCapabilityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "otherCapabilityType",
    "otherCapabilitySubType",
    "otherCapabilityValue",
    "otherCapabilityUnits"
})
public class OtherCapability {

    @XmlElement(required = true)
    protected String otherCapabilityType;
    protected String otherCapabilitySubType;
    protected Float otherCapabilityValue;
    protected String otherCapabilityUnits;

    /**
     * Gets the value of the otherCapabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCapabilityType() {
        return otherCapabilityType;
    }

    /**
     * Sets the value of the otherCapabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCapabilityType(String value) {
        this.otherCapabilityType = value;
    }

    /**
     * Gets the value of the otherCapabilitySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCapabilitySubType() {
        return otherCapabilitySubType;
    }

    /**
     * Sets the value of the otherCapabilitySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCapabilitySubType(String value) {
        this.otherCapabilitySubType = value;
    }

    /**
     * Gets the value of the otherCapabilityValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOtherCapabilityValue() {
        return otherCapabilityValue;
    }

    /**
     * Sets the value of the otherCapabilityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOtherCapabilityValue(Float value) {
        this.otherCapabilityValue = value;
    }

    /**
     * Gets the value of the otherCapabilityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCapabilityUnits() {
        return otherCapabilityUnits;
    }

    /**
     * Sets the value of the otherCapabilityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCapabilityUnits(String value) {
        this.otherCapabilityUnits = value;
    }

}
