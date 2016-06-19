
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermostatConfigurationReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatConfigurationReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="thermostatCurrentConfiguration" type="{http://www.multispeak.org/V5.0}thermostatCurrentConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatConfigurationReferable", propOrder = {
    "panDeviceRef",
    "thermostatCurrentConfiguration"
})
public class ThermostatConfigurationReferable
    extends MspReferable
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    protected ThermostatCurrentConfiguration thermostatCurrentConfiguration;

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
     * Gets the value of the thermostatCurrentConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatCurrentConfiguration }
     *     
     */
    public ThermostatCurrentConfiguration getThermostatCurrentConfiguration() {
        return thermostatCurrentConfiguration;
    }

    /**
     * Sets the value of the thermostatCurrentConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatCurrentConfiguration }
     *     
     */
    public void setThermostatCurrentConfiguration(ThermostatCurrentConfiguration value) {
        this.thermostatCurrentConfiguration = value;
    }

}
