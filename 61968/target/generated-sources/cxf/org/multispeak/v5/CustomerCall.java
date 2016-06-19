
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.CallType;
import org.multispeak.v5_0.enumerations.PriorityType;
import org.multispeak.v5_0.enumerations.ResolvedLevel;


/**
 * <p>Java class for customerCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerCall">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callType" type="{http://www.multispeak.org/V5.0/enumerations}callType" minOccurs="0"/>
 *         &lt;element name="takenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callPriority" type="{http://www.multispeak.org/V5.0/enumerations}priorityType" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.multispeak.org/V5.0}messages" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.multispeak.org/V5.0}outageLocation" minOccurs="0"/>
 *         &lt;element name="resolvedLevel" type="{http://www.multispeak.org/V5.0/enumerations}resolvedLevel" minOccurs="0"/>
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
@XmlType(name = "customerCall", propOrder = {
    "customerID",
    "eventTime",
    "description",
    "problemCode",
    "callType",
    "takenBy",
    "callPriority",
    "messages",
    "location",
    "resolvedLevel"
})
public class CustomerCall
    extends MspObject
{

    protected ObjectID customerID;
    protected XMLGregorianCalendar eventTime;
    protected String description;
    protected String problemCode;
    protected CallType callType;
    protected String takenBy;
    protected PriorityType callPriority;
    protected Messages messages;
    protected OutageLocation location;
    protected ResolvedLevel resolvedLevel;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCustomerID(ObjectID value) {
        this.customerID = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the problemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemCode() {
        return problemCode;
    }

    /**
     * Sets the value of the problemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemCode(String value) {
        this.problemCode = value;
    }

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link CallType }
     *     
     */
    public CallType getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallType }
     *     
     */
    public void setCallType(CallType value) {
        this.callType = value;
    }

    /**
     * Gets the value of the takenBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakenBy() {
        return takenBy;
    }

    /**
     * Sets the value of the takenBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakenBy(String value) {
        this.takenBy = value;
    }

    /**
     * Gets the value of the callPriority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getCallPriority() {
        return callPriority;
    }

    /**
     * Sets the value of the callPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setCallPriority(PriorityType value) {
        this.callPriority = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link OutageLocation }
     *     
     */
    public OutageLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageLocation }
     *     
     */
    public void setLocation(OutageLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the resolvedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ResolvedLevel }
     *     
     */
    public ResolvedLevel getResolvedLevel() {
        return resolvedLevel;
    }

    /**
     * Sets the value of the resolvedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolvedLevel }
     *     
     */
    public void setResolvedLevel(ResolvedLevel value) {
        this.resolvedLevel = value;
    }

}
