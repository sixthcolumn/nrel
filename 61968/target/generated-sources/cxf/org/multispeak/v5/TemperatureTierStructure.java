
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temperatureTierStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="temperatureTierStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="thermostatID" type="{http://www.multispeak.org/V5.0}PANDeviceID"/>
 *         &lt;element name="temperatureTiers" type="{http://www.multispeak.org/V5.0}temperatureTiers"/>
 *         &lt;element name="fanOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temperatureTierStructure", propOrder = {
    "thermostatID",
    "temperatureTiers",
    "fanOn"
})
public class TemperatureTierStructure
    extends MspReferable
{

    @XmlElement(required = true)
    protected PANDeviceID thermostatID;
    @XmlElement(required = true)
    protected TemperatureTiers temperatureTiers;
    protected Boolean fanOn;

    /**
     * Gets the value of the thermostatID property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceID }
     *     
     */
    public PANDeviceID getThermostatID() {
        return thermostatID;
    }

    /**
     * Sets the value of the thermostatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceID }
     *     
     */
    public void setThermostatID(PANDeviceID value) {
        this.thermostatID = value;
    }

    /**
     * Gets the value of the temperatureTiers property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureTiers }
     *     
     */
    public TemperatureTiers getTemperatureTiers() {
        return temperatureTiers;
    }

    /**
     * Sets the value of the temperatureTiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureTiers }
     *     
     */
    public void setTemperatureTiers(TemperatureTiers value) {
        this.temperatureTiers = value;
    }

    /**
     * Gets the value of the fanOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFanOn() {
        return fanOn;
    }

    /**
     * Sets the value of the fanOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFanOn(Boolean value) {
        this.fanOn = value;
    }

}
