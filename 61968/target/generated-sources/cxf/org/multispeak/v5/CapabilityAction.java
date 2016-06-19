
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a capability that the IHD has to respond to specific conditions. For instance, this can describe behavior like "For a High price tier, set the background color to white, the foreground color to red". It is suggested that the values for these fields be discovered using the GetDomainValues method.
 * 
 * <p>Java class for capabilityAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capabilityAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capabilityActionCodes" type="{http://www.multispeak.org/V5.0}capabilityActionCodes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capabilityAction", propOrder = {
    "conditionIdentifier",
    "capabilityActionCodes"
})
public class CapabilityAction {

    @XmlElement(required = true)
    protected String conditionIdentifier;
    @XmlElement(required = true)
    protected CapabilityActionCodes capabilityActionCodes;

    /**
     * Gets the value of the conditionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionIdentifier() {
        return conditionIdentifier;
    }

    /**
     * Sets the value of the conditionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionIdentifier(String value) {
        this.conditionIdentifier = value;
    }

    /**
     * Gets the value of the capabilityActionCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityActionCodes }
     *     
     */
    public CapabilityActionCodes getCapabilityActionCodes() {
        return capabilityActionCodes;
    }

    /**
     * Sets the value of the capabilityActionCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityActionCodes }
     *     
     */
    public void setCapabilityActionCodes(CapabilityActionCodes value) {
        this.capabilityActionCodes = value;
    }

}
