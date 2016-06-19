
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.MspPhase;
import org.multispeak.v5_0.enumerations.PhaseStatusType;


/**
 * <p>Java class for phaseStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phaseStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}mspPhase"/>
 *         &lt;element name="phaseStatus" type="{http://www.multispeak.org/V5.0/enumerations}phaseStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phaseStatusItem", propOrder = {
    "phaseCode",
    "phaseStatus"
})
public class PhaseStatusItem {

    @XmlElement(required = true)
    protected MspPhase phaseCode;
    @XmlElement(required = true)
    protected PhaseStatusType phaseStatus;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setPhaseCode(MspPhase value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the phaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseStatusType }
     *     
     */
    public PhaseStatusType getPhaseStatus() {
        return phaseStatus;
    }

    /**
     * Sets the value of the phaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseStatusType }
     *     
     */
    public void setPhaseStatus(PhaseStatusType value) {
        this.phaseStatus = value;
    }

}
