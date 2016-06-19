
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A recorded voice message.  The objectID is the ID for this message.
 * 
 * <p>Java class for message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="identifierChoice" type="{http://www.multispeak.org/V5.0}identifierChoice"/>
 *         &lt;element name="eventTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="listenedOn" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="listenedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transcription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/V5.0}attachments" minOccurs="0"/>
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
@XmlType(name = "message", propOrder = {
    "identifierChoice",
    "eventTime",
    "listenedOn",
    "listenedBy",
    "transcription",
    "attachments"
})
public class Message
    extends MspObject
{

    @XmlElement(required = true)
    protected IdentifierChoice identifierChoice;
    protected XMLGregorianCalendar eventTime;
    protected XMLGregorianCalendar listenedOn;
    protected String listenedBy;
    protected String transcription;
    protected Attachments attachments;

    /**
     * Gets the value of the identifierChoice property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierChoice }
     *     
     */
    public IdentifierChoice getIdentifierChoice() {
        return identifierChoice;
    }

    /**
     * Sets the value of the identifierChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierChoice }
     *     
     */
    public void setIdentifierChoice(IdentifierChoice value) {
        this.identifierChoice = value;
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
     * Gets the value of the listenedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListenedOn() {
        return listenedOn;
    }

    /**
     * Sets the value of the listenedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListenedOn(XMLGregorianCalendar value) {
        this.listenedOn = value;
    }

    /**
     * Gets the value of the listenedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenedBy() {
        return listenedBy;
    }

    /**
     * Sets the value of the listenedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenedBy(String value) {
        this.listenedBy = value;
    }

    /**
     * Gets the value of the transcription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscription() {
        return transcription;
    }

    /**
     * Sets the value of the transcription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscription(String value) {
        this.transcription = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

}
