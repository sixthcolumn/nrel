
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a list of endDeviceEvent types that should be reset on the associated meters.  This object is the payloafd for the InitiateEndDeviceEventsReset method, the purpose of which is to reset the endDeviceEvents that have been previously recorded in associated endDevices.  The asynchronous response to the InitiateEndDeviceEventsReset is the EndDeviceEventsResetNotification that confirms that the reset has occurred or gives information about why the reset action could not be taken.
 * 
 * <p>Java class for endDeviceEventReset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEventReset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="endDeviceRefOptions" type="{http://www.multispeak.org/V5.0}endDeviceRefOptions"/>
 *         &lt;element name="endDeviceEventTypes" type="{http://www.multispeak.org/V5.0}endDeviceEventTypes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEventReset", propOrder = {
    "endDeviceRefOptions",
    "endDeviceEventTypes"
})
public class EndDeviceEventReset
    extends MspEvent
{

    @XmlElement(required = true)
    protected EndDeviceRefOptions endDeviceRefOptions;
    @XmlElement(required = true)
    protected EndDeviceEventTypes endDeviceEventTypes;

    /**
     * Gets the value of the endDeviceRefOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceRefOptions }
     *     
     */
    public EndDeviceRefOptions getEndDeviceRefOptions() {
        return endDeviceRefOptions;
    }

    /**
     * Sets the value of the endDeviceRefOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceRefOptions }
     *     
     */
    public void setEndDeviceRefOptions(EndDeviceRefOptions value) {
        this.endDeviceRefOptions = value;
    }

    /**
     * Gets the value of the endDeviceEventTypes property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEventTypes }
     *     
     */
    public EndDeviceEventTypes getEndDeviceEventTypes() {
        return endDeviceEventTypes;
    }

    /**
     * Sets the value of the endDeviceEventTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEventTypes }
     *     
     */
    public void setEndDeviceEventTypes(EndDeviceEventTypes value) {
        this.endDeviceEventTypes = value;
    }

}
