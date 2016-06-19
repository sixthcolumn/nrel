
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conductor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conductor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conductorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}mspPhase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conductor", propOrder = {
    "conductorType",
    "phase"
})
public class Conductor {

    protected String conductorType;
    protected MspPhase phase;

    /**
     * Gets the value of the conductorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductorType() {
        return conductorType;
    }

    /**
     * Sets the value of the conductorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductorType(String value) {
        this.conductorType = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setPhase(MspPhase value) {
        this.phase = value;
    }

}
