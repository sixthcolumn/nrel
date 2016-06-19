
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.Temperature;


/**
 * <p>Java class for thermostatScheduleTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatScheduleTime">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="coolingSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}temperature"/>
 *         &lt;element name="heatingSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}temperature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatScheduleTime", propOrder = {
    "startTime",
    "coolingSetPoint",
    "heatingSetPoint"
})
public class ThermostatScheduleTime
    extends MspExtensible
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true)
    protected Temperature coolingSetPoint;
    @XmlElement(required = true)
    protected Temperature heatingSetPoint;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
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
