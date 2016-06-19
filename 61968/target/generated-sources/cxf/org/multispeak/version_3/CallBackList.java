
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callBackList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callBackList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/Version_3.0}outageStatus" minOccurs="0"/>
 *         &lt;element name="outageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageCustomerList" type="{http://www.multispeak.org/Version_3.0}ArrayOfOutageCustomer" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.multispeak.org/Version_3.0}message" minOccurs="0"/>
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
@XmlType(name = "callBackList", propOrder = {
    "outageEventID",
    "outageStatus",
    "outageDescription",
    "outageCustomerList",
    "message"
})
public class CallBackList
    extends MspObject
{

    protected String outageEventID;
    protected OutageStatus outageStatus;
    protected String outageDescription;
    protected ArrayOfOutageCustomer outageCustomerList;
    protected Message message;

    /**
     * Gets the value of the outageEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageEventID() {
        return outageEventID;
    }

    /**
     * Sets the value of the outageEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageEventID(String value) {
        this.outageEventID = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageStatus }
     *     
     */
    public OutageStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageStatus }
     *     
     */
    public void setOutageStatus(OutageStatus value) {
        this.outageStatus = value;
    }

    /**
     * Gets the value of the outageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageDescription() {
        return outageDescription;
    }

    /**
     * Sets the value of the outageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageDescription(String value) {
        this.outageDescription = value;
    }

    /**
     * Gets the value of the outageCustomerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageCustomer }
     *     
     */
    public ArrayOfOutageCustomer getOutageCustomerList() {
        return outageCustomerList;
    }

    /**
     * Sets the value of the outageCustomerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageCustomer }
     *     
     */
    public void setOutageCustomerList(ArrayOfOutageCustomer value) {
        this.outageCustomerList = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
    }

}
