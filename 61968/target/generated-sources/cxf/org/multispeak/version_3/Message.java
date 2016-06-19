
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="recordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="wavPointer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listenedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listenedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "message", propOrder = {
    "recordID",
    "eventTime",
    "wavPointer",
    "listenedOn",
    "listenedBy"
})
public class Message
    extends MspObject
{

    protected String recordID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String wavPointer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listenedOn;
    protected String listenedBy;

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
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
     * Gets the value of the wavPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWavPointer() {
        return wavPointer;
    }

    /**
     * Sets the value of the wavPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWavPointer(String value) {
        this.wavPointer = value;
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

}
