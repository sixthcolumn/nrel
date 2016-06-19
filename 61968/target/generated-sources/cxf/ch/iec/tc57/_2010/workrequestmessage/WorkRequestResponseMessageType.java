
package ch.iec.tc57._2010.workrequestmessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2010.schema.message.HeaderType;
import ch.iec.tc57._2010.schema.message.ReplyType;


/**
 * <p>Java class for WorkRequestResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkRequestResponseMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.iec.ch/TC57/2010/schema/message}HeaderType"/>
 *         &lt;element name="Reply" type="{http://www.iec.ch/TC57/2010/schema/message}ReplyType"/>
 *         &lt;element name="Payload" type="{http://www.iec.ch/TC57/2010/WorkRequestMessage}WorkRequestPayloadType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRequestResponseMessageType", propOrder = {
    "header",
    "reply",
    "payload"
})
public class WorkRequestResponseMessageType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Reply", required = true)
    protected ReplyType reply;
    @XmlElement(name = "Payload")
    protected WorkRequestPayloadType payload;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the reply property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyType }
     *     
     */
    public ReplyType getReply() {
        return reply;
    }

    /**
     * Sets the value of the reply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyType }
     *     
     */
    public void setReply(ReplyType value) {
        this.reply = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link WorkRequestPayloadType }
     *     
     */
    public WorkRequestPayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRequestPayloadType }
     *     
     */
    public void setPayload(WorkRequestPayloadType value) {
        this.payload = value;
    }

}