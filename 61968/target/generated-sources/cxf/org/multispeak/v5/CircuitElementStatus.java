
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.CircuitElementState;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * The outage status for this circuitElement.
 * 
 * <p>Java class for circuitElementStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circuitElementStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageRefs" type="{http://www.multispeak.org/V5.0}outageRefs" minOccurs="0"/>
 *         &lt;element name="outagedPhase" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="circuitElementState" type="{http://www.multispeak.org/V5.0/enumerations}circuitElementState"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circuitElementStatus", propOrder = {
    "outageRefs",
    "outagedPhase",
    "circuitElementState"
})
public class CircuitElementStatus
    extends MspReferable
{

    protected OutageRefs outageRefs;
    protected PhaseCode outagedPhase;
    @XmlElement(required = true)
    protected CircuitElementState circuitElementState;

    /**
     * Gets the value of the outageRefs property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRefs }
     *     
     */
    public OutageRefs getOutageRefs() {
        return outageRefs;
    }

    /**
     * Sets the value of the outageRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRefs }
     *     
     */
    public void setOutageRefs(OutageRefs value) {
        this.outageRefs = value;
    }

    /**
     * Gets the value of the outagedPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getOutagedPhase() {
        return outagedPhase;
    }

    /**
     * Sets the value of the outagedPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setOutagedPhase(PhaseCode value) {
        this.outagedPhase = value;
    }

    /**
     * Gets the value of the circuitElementState property.
     * 
     * @return
     *     possible object is
     *     {@link CircuitElementState }
     *     
     */
    public CircuitElementState getCircuitElementState() {
        return circuitElementState;
    }

    /**
     * Sets the value of the circuitElementState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircuitElementState }
     *     
     */
    public void setCircuitElementState(CircuitElementState value) {
        this.circuitElementState = value;
    }

}
