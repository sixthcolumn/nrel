
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for thermostatScheduleDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thermostatScheduleDay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="setPoints" type="{http://www.multispeak.org/V5.0}setPoints"/>
 *         &lt;element name="days" type="{http://www.multispeak.org/V5.0}days"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermostatScheduleDay", propOrder = {
    "setPoints",
    "days"
})
public class ThermostatScheduleDay
    extends MspExtensible
{

    @XmlElement(required = true)
    protected SetPoints setPoints;
    @XmlElement(required = true)
    protected Days days;

    /**
     * Gets the value of the setPoints property.
     * 
     * @return
     *     possible object is
     *     {@link SetPoints }
     *     
     */
    public SetPoints getSetPoints() {
        return setPoints;
    }

    /**
     * Sets the value of the setPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPoints }
     *     
     */
    public void setSetPoints(SetPoints value) {
        this.setPoints = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Days }
     *     
     */
    public Days getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Days }
     *     
     */
    public void setDays(Days value) {
        this.days = value;
    }

}
