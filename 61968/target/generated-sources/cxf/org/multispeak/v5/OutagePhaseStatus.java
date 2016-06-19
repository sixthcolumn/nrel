
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.MspPhase;
import org.multispeak.v5_0.enumerations.OutageElementStatus;


/**
 * <p>Java class for outagePhaseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outagePhaseStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{http://www.multispeak.org/V5.0/enumerations}mspPhase"/>
 *         &lt;element name="outageElementStatus" type="{http://www.multispeak.org/V5.0/enumerations}outageElementStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outagePhaseStatus", propOrder = {
    "phase",
    "outageElementStatus"
})
public class OutagePhaseStatus {

    @XmlElement(required = true)
    protected MspPhase phase;
    @XmlElement(required = true)
    protected OutageElementStatus outageElementStatus;

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

    /**
     * Gets the value of the outageElementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageElementStatus }
     *     
     */
    public OutageElementStatus getOutageElementStatus() {
        return outageElementStatus;
    }

    /**
     * Sets the value of the outageElementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageElementStatus }
     *     
     */
    public void setOutageElementStatus(OutageElementStatus value) {
        this.outageElementStatus = value;
    }

}
