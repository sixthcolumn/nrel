
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.PriorityType;
import org.multispeak.v5_0.enumerations.ResolvedLevelKind;


/**
 * Contains the outage detection events that have been processed by the Outage Management System for a specific service location and outage.  The objectID is the unique outageDetectionRecordID for all outage detection events at a given service location.
 * 
 * <p>Java class for outageDetectionLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionLog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="outageLocation" type="{http://www.multispeak.org/V5.0}outageLocation" minOccurs="0"/>
 *         &lt;element name="outageCustomer" type="{http://www.multispeak.org/V5.0}outageCustomer" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.multispeak.org/V5.0}messages" minOccurs="0"/>
 *         &lt;element name="loggedOutageDetectionEvents" type="{http://www.multispeak.org/V5.0}loggedOutageDetectionEvents" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.multispeak.org/V5.0/enumerations}priorityType" minOccurs="0"/>
 *         &lt;element name="resolvedLevel" type="{http://www.multispeak.org/V5.0/enumerations}resolvedLevelKind" minOccurs="0"/>
 *         &lt;element name="timeTroubleBegan" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="timeOfInitialEvent" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="timeOfLastEvent" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="eventsLogged" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageDetectionLog", propOrder = {
    "phaseCode",
    "outageLocation",
    "outageCustomer",
    "messages",
    "loggedOutageDetectionEvents",
    "priority",
    "resolvedLevel",
    "timeTroubleBegan",
    "timeOfInitialEvent",
    "timeOfLastEvent",
    "eventsLogged"
})
public class OutageDetectionLog
    extends MspObject
{

    protected PhaseCode phaseCode;
    protected OutageLocation outageLocation;
    protected OutageCustomer outageCustomer;
    protected Messages messages;
    protected LoggedOutageDetectionEvents loggedOutageDetectionEvents;
    protected PriorityType priority;
    protected ResolvedLevelKind resolvedLevel;
    protected XMLGregorianCalendar timeTroubleBegan;
    protected XMLGregorianCalendar timeOfInitialEvent;
    protected XMLGregorianCalendar timeOfLastEvent;
    protected Long eventsLogged;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
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
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the loggedOutageDetectionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link LoggedOutageDetectionEvents }
     *     
     */
    public LoggedOutageDetectionEvents getLoggedOutageDetectionEvents() {
        return loggedOutageDetectionEvents;
    }

    /**
     * Sets the value of the loggedOutageDetectionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggedOutageDetectionEvents }
     *     
     */
    public void setLoggedOutageDetectionEvents(LoggedOutageDetectionEvents value) {
        this.loggedOutageDetectionEvents = value;
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
     * Gets the value of the resolvedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ResolvedLevelKind }
     *     
     */
    public ResolvedLevelKind getResolvedLevel() {
        return resolvedLevel;
    }

    /**
     * Sets the value of the resolvedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolvedLevelKind }
     *     
     */
    public void setResolvedLevel(ResolvedLevelKind value) {
        this.resolvedLevel = value;
    }

    /**
     * Gets the value of the timeTroubleBegan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeTroubleBegan() {
        return timeTroubleBegan;
    }

    /**
     * Sets the value of the timeTroubleBegan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeTroubleBegan(XMLGregorianCalendar value) {
        this.timeTroubleBegan = value;
    }

    /**
     * Gets the value of the timeOfInitialEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfInitialEvent() {
        return timeOfInitialEvent;
    }

    /**
     * Sets the value of the timeOfInitialEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfInitialEvent(XMLGregorianCalendar value) {
        this.timeOfInitialEvent = value;
    }

    /**
     * Gets the value of the timeOfLastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfLastEvent() {
        return timeOfLastEvent;
    }

    /**
     * Sets the value of the timeOfLastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfLastEvent(XMLGregorianCalendar value) {
        this.timeOfLastEvent = value;
    }

    /**
     * Gets the value of the eventsLogged property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventsLogged() {
        return eventsLogged;
    }

    /**
     * Sets the value of the eventsLogged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventsLogged(Long value) {
        this.eventsLogged = value;
    }

}
