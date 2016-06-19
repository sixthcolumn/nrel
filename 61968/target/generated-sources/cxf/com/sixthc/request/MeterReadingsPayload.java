
package com.sixthc.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.meterreadingsmessage.MeterReadingsEventMessageType;


/**
 * <p>Java class for MeterReadingsPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReadingsPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Reply"/>
 *               &lt;enumeration value="Send"/>
 *               &lt;enumeration value="Request"/>
 *               &lt;enumeration value="Get"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Command">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Create"/>
 *               &lt;enumeration value="Change"/>
 *               &lt;enumeration value="Close"/>
 *               &lt;enumeration value="Cancel"/>
 *               &lt;enumeration value="Delete"/>
 *               &lt;enumeration value="Created"/>
 *               &lt;enumeration value="Changed"/>
 *               &lt;enumeration value="Closed"/>
 *               &lt;enumeration value="Canceled"/>
 *               &lt;enumeration value="Deleted"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payload" type="{http://www.iec.ch/TC57/2011/MeterReadingsMessage}MeterReadingsEventMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingsPayload", propOrder = {
    "service",
    "command",
    "address",
    "payload"
})
public class MeterReadingsPayload {

    @XmlElement(name = "Service", required = true)
    protected String service;
    @XmlElement(name = "Command", required = true)
    protected String command;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Payload", required = true)
    protected MeterReadingsEventMessageType payload;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingsEventMessageType }
     *     
     */
    public MeterReadingsEventMessageType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingsEventMessageType }
     *     
     */
    public void setPayload(MeterReadingsEventMessageType value) {
        this.payload = value;
    }

}
