
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.enumerations.LocationTrackingTriggerEvent;


/**
 * locationTrackingEvent contains information about a location tracking system (AVL)-generated event.  This is a general purpose location tracking information object that can carry detailed telemetry data.  This is the tracking and telemetry information for one location tracking device at one specific time.
 * 
 * <p>Java class for locationTrackingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationTrackingEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="triggerEvent" type="{http://www.multispeak.org/V5.0/enumerations}locationTrackingTriggerEvent" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *         &lt;element name="LTAddress" type="{http://www.multispeak.org/V5.0}locationTrackingAddress" minOccurs="0"/>
 *         &lt;element name="telemetry" type="{http://www.multispeak.org/V5.0}telemetry" minOccurs="0"/>
 *         &lt;element name="LTDeviceCodes" type="{http://www.multispeak.org/V5.0}LTDeviceCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationTrackingEvent", propOrder = {
    "triggerEvent",
    "gpsLocation",
    "ltAddress",
    "telemetry",
    "ltDeviceCodes"
})
public class LocationTrackingEvent
    extends MspEvent
{

    protected LocationTrackingTriggerEvent triggerEvent;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    @XmlElement(name = "LTAddress")
    protected LocationTrackingAddress ltAddress;
    protected Telemetry telemetry;
    @XmlElement(name = "LTDeviceCodes")
    protected LTDeviceCodes ltDeviceCodes;

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTrackingTriggerEvent }
     *     
     */
    public LocationTrackingTriggerEvent getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTrackingTriggerEvent }
     *     
     */
    public void setTriggerEvent(LocationTrackingTriggerEvent value) {
        this.triggerEvent = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GPSLocation }
     *     
     */
    public GPSLocation getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSLocation }
     *     
     */
    public void setGPSLocation(GPSLocation value) {
        this.gpsLocation = value;
    }

    /**
     * Gets the value of the ltAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTrackingAddress }
     *     
     */
    public LocationTrackingAddress getLTAddress() {
        return ltAddress;
    }

    /**
     * Sets the value of the ltAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTrackingAddress }
     *     
     */
    public void setLTAddress(LocationTrackingAddress value) {
        this.ltAddress = value;
    }

    /**
     * Gets the value of the telemetry property.
     * 
     * @return
     *     possible object is
     *     {@link Telemetry }
     *     
     */
    public Telemetry getTelemetry() {
        return telemetry;
    }

    /**
     * Sets the value of the telemetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telemetry }
     *     
     */
    public void setTelemetry(Telemetry value) {
        this.telemetry = value;
    }

    /**
     * Gets the value of the ltDeviceCodes property.
     * 
     * @return
     *     possible object is
     *     {@link LTDeviceCodes }
     *     
     */
    public LTDeviceCodes getLTDeviceCodes() {
        return ltDeviceCodes;
    }

    /**
     * Sets the value of the ltDeviceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LTDeviceCodes }
     *     
     */
    public void setLTDeviceCodes(LTDeviceCodes value) {
        this.ltDeviceCodes = value;
    }

}
