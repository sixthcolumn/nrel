
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.TimeZone;


/**
 * <p>Java class for endDeviceEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="deviceReference" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="endDeviceEventTypeOption" type="{http://www.multispeak.org/V5.0}endDeviceEventTypeOption"/>
 *         &lt;element name="associatedReadingValues" type="{http://www.multispeak.org/V5.0}readingValues" minOccurs="0"/>
 *         &lt;element name="eventSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="argument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.multispeak.org/V5.0/commonTypes}timeZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEvent", propOrder = {
    "deviceReference",
    "endDeviceEventTypeOption",
    "associatedReadingValues",
    "eventSeverity",
    "userID",
    "argument",
    "timeZone"
})
public class EndDeviceEvent
    extends MspEvent
{

    protected ObjectRef deviceReference;
    @XmlElement(required = true)
    protected EndDeviceEventTypeOption endDeviceEventTypeOption;
    protected ReadingValues associatedReadingValues;
    protected String eventSeverity;
    protected String userID;
    protected String argument;
    protected TimeZone timeZone;

    /**
     * Gets the value of the deviceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getDeviceReference() {
        return deviceReference;
    }

    /**
     * Sets the value of the deviceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setDeviceReference(ObjectRef value) {
        this.deviceReference = value;
    }

    /**
     * Gets the value of the endDeviceEventTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEventTypeOption }
     *     
     */
    public EndDeviceEventTypeOption getEndDeviceEventTypeOption() {
        return endDeviceEventTypeOption;
    }

    /**
     * Sets the value of the endDeviceEventTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEventTypeOption }
     *     
     */
    public void setEndDeviceEventTypeOption(EndDeviceEventTypeOption value) {
        this.endDeviceEventTypeOption = value;
    }

    /**
     * Gets the value of the associatedReadingValues property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingValues }
     *     
     */
    public ReadingValues getAssociatedReadingValues() {
        return associatedReadingValues;
    }

    /**
     * Sets the value of the associatedReadingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingValues }
     *     
     */
    public void setAssociatedReadingValues(ReadingValues value) {
        this.associatedReadingValues = value;
    }

    /**
     * Gets the value of the eventSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSeverity() {
        return eventSeverity;
    }

    /**
     * Sets the value of the eventSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSeverity(String value) {
        this.eventSeverity = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the argument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgument() {
        return argument;
    }

    /**
     * Sets the value of the argument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgument(String value) {
        this.argument = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

}
