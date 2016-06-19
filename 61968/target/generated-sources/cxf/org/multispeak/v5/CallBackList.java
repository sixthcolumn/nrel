
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.OutageState;


/**
 * <p>Java class for callBackList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callBackList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/V5.0/enumerations}outageState" minOccurs="0"/>
 *         &lt;element name="outageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.multispeak.org/V5.0}message" minOccurs="0"/>
 *         &lt;element name="outageCustomers" type="{http://www.multispeak.org/V5.0}outageCustomers" minOccurs="0"/>
 *         &lt;element name="callBackListType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "callBackList", propOrder = {
    "outageRef",
    "outageStatus",
    "outageDescription",
    "message",
    "outageCustomers",
    "callBackListType"
})
public class CallBackList
    extends MspObject
{

    protected OutageRef outageRef;
    protected OutageState outageStatus;
    protected String outageDescription;
    protected Message message;
    protected OutageCustomers outageCustomers;
    protected String callBackListType;

    /**
     * Gets the value of the outageRef property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRef }
     *     
     */
    public OutageRef getOutageRef() {
        return outageRef;
    }

    /**
     * Sets the value of the outageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRef }
     *     
     */
    public void setOutageRef(OutageRef value) {
        this.outageRef = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OutageState }
     *     
     */
    public OutageState getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageState }
     *     
     */
    public void setOutageStatus(OutageState value) {
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

    /**
     * Gets the value of the outageCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link OutageCustomers }
     *     
     */
    public OutageCustomers getOutageCustomers() {
        return outageCustomers;
    }

    /**
     * Sets the value of the outageCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageCustomers }
     *     
     */
    public void setOutageCustomers(OutageCustomers value) {
        this.outageCustomers = value;
    }

    /**
     * Gets the value of the callBackListType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackListType() {
        return callBackListType;
    }

    /**
     * Sets the value of the callBackListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackListType(String value) {
        this.callBackListType = value;
    }

}
