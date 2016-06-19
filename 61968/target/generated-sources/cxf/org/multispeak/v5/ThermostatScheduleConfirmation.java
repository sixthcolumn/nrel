
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermostatScheduleConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatScheduleConfirmation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="isConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatScheduleConfirmation", propOrder = {
    "panDeviceRef",
    "isConfirmed"
})
public class ThermostatScheduleConfirmation
    extends MspReferable
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    protected boolean isConfirmed;

    /**
     * Gets the value of the panDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRef }
     *     
     */
    public PANDeviceRef getPANDeviceRef() {
        return panDeviceRef;
    }

    /**
     * Sets the value of the panDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRef }
     *     
     */
    public void setPANDeviceRef(PANDeviceRef value) {
        this.panDeviceRef = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public boolean isIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(boolean value) {
        this.isConfirmed = value;
    }

}
