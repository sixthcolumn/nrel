
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventMonitoringItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventMonitoringItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="meterGroupIDs" type="{http://www.multispeak.org/V5.0}meterGroupIDs" minOccurs="0"/>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/V5.0}meterIDs" minOccurs="0"/>
 *         &lt;element name="endDeviceEventTypes" type="{http://www.multispeak.org/V5.0}endDeviceEventTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventMonitoringItem", propOrder = {
    "meterGroupIDs",
    "meterIDs",
    "endDeviceEventTypes"
})
public class EventMonitoringItem
    extends MspReferable
{

    protected MeterGroupIDs meterGroupIDs;
    protected MeterIDs meterIDs;
    protected EndDeviceEventTypes endDeviceEventTypes;

    /**
     * Gets the value of the meterGroupIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterGroupIDs }
     *     
     */
    public MeterGroupIDs getMeterGroupIDs() {
        return meterGroupIDs;
    }

    /**
     * Sets the value of the meterGroupIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterGroupIDs }
     *     
     */
    public void setMeterGroupIDs(MeterGroupIDs value) {
        this.meterGroupIDs = value;
    }

    /**
     * Gets the value of the meterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterIDs }
     *     
     */
    public MeterIDs getMeterIDs() {
        return meterIDs;
    }

    /**
     * Sets the value of the meterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterIDs }
     *     
     */
    public void setMeterIDs(MeterIDs value) {
        this.meterIDs = value;
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
