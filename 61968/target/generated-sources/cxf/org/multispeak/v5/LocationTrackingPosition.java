
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Speed;


/**
 * This is an object that can carry a "lightweight" location tracking (AVL) information object.  This version cannot carry telemetry data.  For the heavyweight object see a locationTrackingState.  This is the location of one location tracking device at one specific time.
 * 
 * <p>Java class for locationTrackingPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationTrackingPosition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="resourceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="LTDeviceRef" type="{http://www.multispeak.org/V5.0}locationTrackingDeviceRef" minOccurs="0"/>
 *         &lt;element name="GMTTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="speed" type="{http://www.multispeak.org/V5.0/commonTypes}speed" minOccurs="0"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cardinalHeading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationTrackingPosition", propOrder = {
    "resourceID",
    "ltDeviceRef",
    "gmtTime",
    "speed",
    "heading",
    "cardinalHeading",
    "gpsLocation"
})
public class LocationTrackingPosition
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID resourceID;
    @XmlElement(name = "LTDeviceRef")
    protected LocationTrackingDeviceRef ltDeviceRef;
    @XmlElement(name = "GMTTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gmtTime;
    protected Speed speed;
    protected Float heading;
    protected String cardinalHeading;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setResourceID(ObjectID value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the ltDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTrackingDeviceRef }
     *     
     */
    public LocationTrackingDeviceRef getLTDeviceRef() {
        return ltDeviceRef;
    }

    /**
     * Sets the value of the ltDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTrackingDeviceRef }
     *     
     */
    public void setLTDeviceRef(LocationTrackingDeviceRef value) {
        this.ltDeviceRef = value;
    }

    /**
     * Gets the value of the gmtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGMTTime() {
        return gmtTime;
    }

    /**
     * Sets the value of the gmtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGMTTime(XMLGregorianCalendar value) {
        this.gmtTime = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Speed }
     *     
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speed }
     *     
     */
    public void setSpeed(Speed value) {
        this.speed = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeading(Float value) {
        this.heading = value;
    }

    /**
     * Gets the value of the cardinalHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalHeading() {
        return cardinalHeading;
    }

    /**
     * Sets the value of the cardinalHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalHeading(String value) {
        this.cardinalHeading = value;
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

}
