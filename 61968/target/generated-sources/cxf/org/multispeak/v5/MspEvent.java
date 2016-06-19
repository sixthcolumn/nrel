
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is an abstract class that is extended in order to create concrete classes intended to define types of events.
 * 
 * <p>Java class for mspEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplementalNotes" type="{http://www.multispeak.org/V5.0}supplementalNotes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspEvent", propOrder = {
    "timeStamp",
    "eventDescription",
    "eventReason",
    "supplementalNotes"
})
@XmlSeeAlso({
    LocationTrackingEvent.class,
    PricingEvent.class,
    ScadaStatus.class,
    DemandResponseEvent.class,
    ScadaControl.class,
    EndDeviceEvent.class,
    DemandResetCancel.class,
    LoadManagementEvent.class,
    CDStateChange.class,
    EndDeviceEventReset.class,
    ConnectDisconnectEvent.class,
    OutageHistoryEvent.class,
    PaymentTransaction.class,
    DemandResetEvent.class,
    WorkHistoryEvent.class,
    OutageDetectionEvent.class,
    PowerFactorManagementEvent.class,
    WorkItemDeletion.class,
    MspGenericExchange.class,
    MspAssetHistoryEvent.class,
    DemandReset.class,
    MspMeterExchange.class
})
public abstract class MspEvent
    extends MspReferable
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    protected String eventDescription;
    protected String eventReason;
    protected SupplementalNotes supplementalNotes;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the eventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the eventReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventReason() {
        return eventReason;
    }

    /**
     * Sets the value of the eventReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventReason(String value) {
        this.eventReason = value;
    }

    /**
     * Gets the value of the supplementalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalNotes }
     *     
     */
    public SupplementalNotes getSupplementalNotes() {
        return supplementalNotes;
    }

    /**
     * Sets the value of the supplementalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalNotes }
     *     
     */
    public void setSupplementalNotes(SupplementalNotes value) {
        this.supplementalNotes = value;
    }

}
