
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Temperature;
import org.multispeak.v5_0.enumerations.ThermostatFanStatus;
import org.multispeak.v5_0.enumerations.ThermostatMode;


/**
 * The settable configuration for a programmable thermostat
 * 
 * <p>Java class for thermostatConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="thermostatMode" type="{http://www.multispeak.org/V5.0/enumerations}thermostatMode" minOccurs="0"/>
 *         &lt;element name="thermostatFan" type="{http://www.multispeak.org/V5.0/enumerations}thermostatFanStatus" minOccurs="0"/>
 *         &lt;element name="thermostatHold" type="{http://www.multispeak.org/V5.0}thermostatHoldType" minOccurs="0"/>
 *         &lt;element name="coolingSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="heatingSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatConfiguration", propOrder = {
    "thermostatMode",
    "thermostatFan",
    "thermostatHold",
    "coolingSetPoint",
    "heatingSetPoint"
})
@XmlSeeAlso({
    ThermostatCurrentConfiguration.class
})
public class ThermostatConfiguration
    extends MspReferable
{

    protected ThermostatMode thermostatMode;
    protected ThermostatFanStatus thermostatFan;
    protected ThermostatHoldType thermostatHold;
    protected Temperature coolingSetPoint;
    protected Temperature heatingSetPoint;

    /**
     * Gets the value of the thermostatMode property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatMode }
     *     
     */
    public ThermostatMode getThermostatMode() {
        return thermostatMode;
    }

    /**
     * Sets the value of the thermostatMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatMode }
     *     
     */
    public void setThermostatMode(ThermostatMode value) {
        this.thermostatMode = value;
    }

    /**
     * Gets the value of the thermostatFan property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatFanStatus }
     *     
     */
    public ThermostatFanStatus getThermostatFan() {
        return thermostatFan;
    }

    /**
     * Sets the value of the thermostatFan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatFanStatus }
     *     
     */
    public void setThermostatFan(ThermostatFanStatus value) {
        this.thermostatFan = value;
    }

    /**
     * Gets the value of the thermostatHold property.
     * 
     * @return
     *     possible object is
     *     {@link ThermostatHoldType }
     *     
     */
    public ThermostatHoldType getThermostatHold() {
        return thermostatHold;
    }

    /**
     * Sets the value of the thermostatHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermostatHoldType }
     *     
     */
    public void setThermostatHold(ThermostatHoldType value) {
        this.thermostatHold = value;
    }

    /**
     * Gets the value of the coolingSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getCoolingSetPoint() {
        return coolingSetPoint;
    }

    /**
     * Sets the value of the coolingSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setCoolingSetPoint(Temperature value) {
        this.coolingSetPoint = value;
    }

    /**
     * Gets the value of the heatingSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getHeatingSetPoint() {
        return heatingSetPoint;
    }

    /**
     * Sets the value of the heatingSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setHeatingSetPoint(Temperature value) {
        this.heatingSetPoint = value;
    }

}
