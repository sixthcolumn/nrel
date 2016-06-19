
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for locationTrackingLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationTrackingLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="resourceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="LTDeviceRef" type="{http://www.multispeak.org/V5.0}locationTrackingDeviceRef" minOccurs="0"/>
 *         &lt;element name="LTEvents" type="{http://www.multispeak.org/V5.0}locationTrackingEvents"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationTrackingLog", propOrder = {
    "resourceID",
    "ltDeviceRef",
    "ltEvents"
})
public class LocationTrackingLog
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID resourceID;
    @XmlElement(name = "LTDeviceRef")
    protected LocationTrackingDeviceRef ltDeviceRef;
    @XmlElement(name = "LTEvents", required = true)
    protected LocationTrackingEvents ltEvents;

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
     * Gets the value of the ltEvents property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTrackingEvents }
     *     
     */
    public LocationTrackingEvents getLTEvents() {
        return ltEvents;
    }

    /**
     * Sets the value of the ltEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTrackingEvents }
     *     
     */
    public void setLTEvents(LocationTrackingEvents value) {
        this.ltEvents = value;
    }

}
