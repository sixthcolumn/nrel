
package com.epri._2016.dergroupdispatchesmessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.schema.message.HeaderType;
import ch.iec.tc57._2011.schema.message.RequestType;


/**
 * <p>Java class for DERGroupDispatchesRequestMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupDispatchesRequestMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.iec.ch/TC57/2011/schema/message}HeaderType"/>
 *         &lt;element name="Request" type="{http://www.iec.ch/TC57/2011/schema/message}RequestType" minOccurs="0"/>
 *         &lt;element name="Payload" type="{http://www.epri.com/2016/DERGroupDispatchesMessage}DERGroupDispatchesPayloadType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupDispatchesRequestMessageType", propOrder = {
    "header",
    "request",
    "payload"
})
public class DERGroupDispatchesRequestMessageType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Request")
    protected RequestType request;
    @XmlElement(name = "Payload")
    protected DERGroupDispatchesPayloadType payload;

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
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link DERGroupDispatchesPayloadType }
     *     
     */
    public DERGroupDispatchesPayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link DERGroupDispatchesPayloadType }
     *     
     */
    public void setPayload(DERGroupDispatchesPayloadType value) {
        this.payload = value;
    }

}