
package com.epri._2013.dergroupdispatches;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestedCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedCapability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capabilityType" type="{http://www.epri.com/2013/DERGroupDispatches#}capabilityType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="capabilityUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capabilityMultiplier" type="{http://www.epri.com/2013/DERGroupDispatches#}UnitMultiplier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedCapability", propOrder = {
    "capabilityType",
    "value",
    "capabilityUnits",
    "capabilityMultiplier"
})
public class RequestedCapability {

    @XmlElement(required = true)
    protected CapabilityType capabilityType;
    protected float value;
    @XmlElement(required = true)
    protected String capabilityUnits;
    @XmlElement(required = true)
    protected String capabilityMultiplier;

    /**
     * Gets the value of the capabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityType }
     *     
     */
    public CapabilityType getCapabilityType() {
        return capabilityType;
    }

    /**
     * Sets the value of the capabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityType }
     *     
     */
    public void setCapabilityType(CapabilityType value) {
        this.capabilityType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
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

    /**
     * Gets the value of the capabilityMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityMultiplier() {
        return capabilityMultiplier;
    }

    /**
     * Sets the value of the capabilityMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityMultiplier(String value) {
        this.capabilityMultiplier = value;
    }

}
