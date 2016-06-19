
package org.multispeak.version_3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageDetectionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="phaseCd" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outageEventType" type="{http://www.multispeak.org/Version_3.0}outageEventType" minOccurs="0"/>
 *         &lt;element name="outageDetectDeviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDetectDeviceType" type="{http://www.multispeak.org/Version_3.0}outageDetectDeviceType" minOccurs="0"/>
 *         &lt;element name="outageLocation" type="{http://www.multispeak.org/Version_3.0}outageLocation" minOccurs="0"/>
 *         &lt;element name="messageList" type="{http://www.multispeak.org/Version_3.0}messageList" minOccurs="0"/>
 *         &lt;element name="outageCustomer" type="{http://www.multispeak.org/Version_3.0}outageCustomer" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.multispeak.org/Version_3.0}priorityType" minOccurs="0"/>
 *         &lt;element name="percentConfident" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageDetectionEvent", propOrder = {
    "phaseCd",
    "eventTime",
    "outageEventType",
    "outageDetectDeviceID",
    "outageDetectDeviceType",
    "outageLocation",
    "messageList",
    "outageCustomer",
    "priority",
    "percentConfident"
})
public class OutageDetectionEvent
    extends MspObject
{

    protected PhaseCd phaseCd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected OutageEventType outageEventType;
    protected String outageDetectDeviceID;
    protected OutageDetectDeviceType outageDetectDeviceType;
    protected OutageLocation outageLocation;
    protected MessageList messageList;
    protected OutageCustomer outageCustomer;
    @XmlElement(defaultValue = "Normal")
    protected PriorityType priority;
    protected BigInteger percentConfident;

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhaseCd(PhaseCd value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the outageEventType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageEventType }
     *     
     */
    public OutageEventType getOutageEventType() {
        return outageEventType;
    }

    /**
     * Sets the value of the outageEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageEventType }
     *     
     */
    public void setOutageEventType(OutageEventType value) {
        this.outageEventType = value;
    }

    /**
     * Gets the value of the outageDetectDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDetectDeviceID() {
        return outageDetectDeviceID;
    }

    /**
     * Sets the value of the outageDetectDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDetectDeviceID(String value) {
        this.outageDetectDeviceID = value;
    }

    /**
     * Gets the value of the outageDetectDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public OutageDetectDeviceType getOutageDetectDeviceType() {
        return outageDetectDeviceType;
    }

    /**
     * Sets the value of the outageDetectDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectDeviceType }
     *     
     */
    public void setOutageDetectDeviceType(OutageDetectDeviceType value) {
        this.outageDetectDeviceType = value;
    }

    /**
     * Gets the value of the outageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OutageLocation }
     *     
     */
    public OutageLocation getOutageLocation() {
        return outageLocation;
    }

    /**
     * Sets the value of the outageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageLocation }
     *     
     */
    public void setOutageLocation(OutageLocation value) {
        this.outageLocation = value;
    }

    /**
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link MessageList }
     *     
     */
    public MessageList getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageList }
     *     
     */
    public void setMessageList(MessageList value) {
        this.messageList = value;
    }

    /**
     * Gets the value of the outageCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link OutageCustomer }
     *     
     */
    public OutageCustomer getOutageCustomer() {
        return outageCustomer;
    }

    /**
     * Sets the value of the outageCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageCustomer }
     *     
     */
    public void setOutageCustomer(OutageCustomer value) {
        this.outageCustomer = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the percentConfident property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentConfident() {
        return percentConfident;
    }

    /**
     * Sets the value of the percentConfident property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentConfident(BigInteger value) {
        this.percentConfident = value;
    }

}
