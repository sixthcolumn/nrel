
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This is the predicted status of the device that is believed to be opened causing the outage.
 * 
 * <p>Java class for predictedDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predictedDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="deviceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="phaseStatusItems" type="{http://www.multispeak.org/V5.0}phaseStatusItems"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predictedDeviceStatus", propOrder = {
    "deviceRef",
    "phaseStatusItems"
})
public class PredictedDeviceStatus {

    protected ObjectRef deviceRef;
    protected PhaseStatusItems phaseStatusItems;

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setDeviceRef(ObjectRef value) {
        this.deviceRef = value;
    }

    /**
     * Gets the value of the phaseStatusItems property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseStatusItems }
     *     
     */
    public PhaseStatusItems getPhaseStatusItems() {
        return phaseStatusItems;
    }

    /**
     * Sets the value of the phaseStatusItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseStatusItems }
     *     
     */
    public void setPhaseStatusItems(PhaseStatusItems value) {
        this.phaseStatusItems = value;
    }

}
