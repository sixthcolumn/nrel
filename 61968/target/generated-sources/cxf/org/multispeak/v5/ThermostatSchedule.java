
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains the heating and cooling setpoints for all the days of the week
 * 
 * <p>Java class for thermostatSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="thermostatScheduleDays" type="{http://www.multispeak.org/V5.0}thermostatScheduleDays" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatSchedule", propOrder = {
    "panDeviceRef",
    "thermostatScheduleDays"
})
public class ThermostatSchedule
    extends MspReferable
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    protected ThermostatScheduleDays thermostatScheduleDays;

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
     * Gets the value of the thermostatScheduleDays property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatScheduleDays }
     *     
     */
    public ThermostatScheduleDays getThermostatScheduleDays() {
        return thermostatScheduleDays;
    }

    /**
     * Sets the value of the thermostatScheduleDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatScheduleDays }
     *     
     */
    public void setThermostatScheduleDays(ThermostatScheduleDays value) {
        this.thermostatScheduleDays = value;
    }

}
