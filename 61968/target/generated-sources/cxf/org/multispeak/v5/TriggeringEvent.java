
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the event that triggered the collection of a set of coincident meter readings or end device events. It is assumed that for the coincientMeterReadingSet the endDeviceEvent.associatedReadingValues SHALL not be used. rather the coincidentMeterReadingSet.associatedReadingValues SHALL be populated.
 * 
 * <p>Java class for triggeringEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="triggeringEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="readingValue" type="{http://www.multispeak.org/V5.0}readingValue"/>
 *         &lt;element name="endDeviceEvent" type="{http://www.multispeak.org/V5.0}endDeviceEvent"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggeringEvent", propOrder = {
    "readingValue",
    "endDeviceEvent"
})
public class TriggeringEvent {

    protected ReadingValue readingValue;
    protected EndDeviceEvent endDeviceEvent;

    /**
     * Gets the value of the readingValue property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingValue }
     *     
     */
    public ReadingValue getReadingValue() {
        return readingValue;
    }

    /**
     * Sets the value of the readingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingValue }
     *     
     */
    public void setReadingValue(ReadingValue value) {
        this.readingValue = value;
    }

    /**
     * Gets the value of the endDeviceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEvent }
     *     
     */
    public EndDeviceEvent getEndDeviceEvent() {
        return endDeviceEvent;
    }

    /**
     * Sets the value of the endDeviceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEvent }
     *     
     */
    public void setEndDeviceEvent(EndDeviceEvent value) {
        this.endDeviceEvent = value;
    }

}
