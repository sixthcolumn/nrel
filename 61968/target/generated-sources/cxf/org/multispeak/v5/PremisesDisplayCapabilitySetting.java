
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for premisesDisplayCapabilitySetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplayCapabilitySetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="capabilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conditionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capabilityActions" type="{http://www.multispeak.org/V5.0}capabilityActions"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premisesDisplayCapabilitySetting", propOrder = {
    "capabilityCode",
    "conditionCode",
    "capabilityActions"
})
public class PremisesDisplayCapabilitySetting
    extends MspReferable
{

    @XmlElement(required = true)
    protected String capabilityCode;
    @XmlElement(required = true)
    protected String conditionCode;
    @XmlElement(required = true)
    protected CapabilityActions capabilityActions;

    /**
     * Gets the value of the capabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityCode() {
        return capabilityCode;
    }

    /**
     * Sets the value of the capabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityCode(String value) {
        this.capabilityCode = value;
    }

    /**
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionCode(String value) {
        this.conditionCode = value;
    }

    /**
     * Gets the value of the capabilityActions property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityActions }
     *     
     */
    public CapabilityActions getCapabilityActions() {
        return capabilityActions;
    }

    /**
     * Sets the value of the capabilityActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityActions }
     *     
     */
    public void setCapabilityActions(CapabilityActions value) {
        this.capabilityActions = value;
    }

}
