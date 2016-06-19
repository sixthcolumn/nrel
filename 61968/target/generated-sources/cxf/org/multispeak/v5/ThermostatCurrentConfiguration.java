
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Temperature;


/**
 * The current configuration for a programmable thermostat. This consists of all the configurations that can be set plus the current measurements.
 * 
 * <p>Java class for thermostatCurrentConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatCurrentConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}thermostatConfiguration">
 *       &lt;sequence>
 *         &lt;element name="rateLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="insideTemperature" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="outsideTemperature" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="humidity" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="occupancyMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatCurrentConfiguration", propOrder = {
    "rateLabel",
    "insideTemperature",
    "outsideTemperature",
    "humidity",
    "occupancyMode",
    "currentTime"
})
public class ThermostatCurrentConfiguration
    extends ThermostatConfiguration
{

    @XmlElement(required = true)
    protected String rateLabel;
    protected Temperature insideTemperature;
    protected Temperature outsideTemperature;
    protected Float humidity;
    protected String occupancyMode;
    @XmlElement(required = true)
    protected XMLGregorianCalendar currentTime;

    /**
     * Gets the value of the rateLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateLabel() {
        return rateLabel;
    }

    /**
     * Sets the value of the rateLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateLabel(String value) {
        this.rateLabel = value;
    }

    /**
     * Gets the value of the insideTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getInsideTemperature() {
        return insideTemperature;
    }

    /**
     * Sets the value of the insideTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setInsideTemperature(Temperature value) {
        this.insideTemperature = value;
    }

    /**
     * Gets the value of the outsideTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getOutsideTemperature() {
        return outsideTemperature;
    }

    /**
     * Sets the value of the outsideTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setOutsideTemperature(Temperature value) {
        this.outsideTemperature = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHumidity(Float value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the occupancyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupancyMode() {
        return occupancyMode;
    }

    /**
     * Sets the value of the occupancyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupancyMode(String value) {
        this.occupancyMode = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

}
