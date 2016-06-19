
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeToCall" type="{http://www.multispeak.org/Version_3.0}outageCustomerTimeToCall" minOccurs="0"/>
 *         &lt;element name="callBackFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callBackContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackContactMName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackStatus" type="{http://www.multispeak.org/Version_3.0}callBackStatus" minOccurs="0"/>
 *         &lt;element name="callBackCompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="callBackType" type="{http://www.multispeak.org/Version_3.0}callBackType" minOccurs="0"/>
 *         &lt;element name="callRecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageCustomer", propOrder = {
    "custID",
    "callBackAC",
    "callBackPhone",
    "timeToCall",
    "callBackFlag",
    "callBackContactFirstName",
    "callBackContactLastName",
    "callBackContactMName",
    "callBackStatus",
    "callBackCompletedTime",
    "callBackType",
    "callRecordID",
    "outageEventID"
})
public class OutageCustomer {

    protected String custID;
    protected String callBackAC;
    protected String callBackPhone;
    protected OutageCustomerTimeToCall timeToCall;
    protected Boolean callBackFlag;
    protected String callBackContactFirstName;
    protected String callBackContactLastName;
    protected String callBackContactMName;
    protected CallBackStatus callBackStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callBackCompletedTime;
    protected CallBackType callBackType;
    protected String callRecordID;
    protected String outageEventID;

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
    }

    /**
     * Gets the value of the callBackAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackAC() {
        return callBackAC;
    }

    /**
     * Sets the value of the callBackAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackAC(String value) {
        this.callBackAC = value;
    }

    /**
     * Gets the value of the callBackPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackPhone() {
        return callBackPhone;
    }

    /**
     * Sets the value of the callBackPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackPhone(String value) {
        this.callBackPhone = value;
    }

    /**
     * Gets the value of the timeToCall property.
     * 
     * @return
     *     possible object is
     *     {@link OutageCustomerTimeToCall }
     *     
     */
    public OutageCustomerTimeToCall getTimeToCall() {
        return timeToCall;
    }

    /**
     * Sets the value of the timeToCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageCustomerTimeToCall }
     *     
     */
    public void setTimeToCall(OutageCustomerTimeToCall value) {
        this.timeToCall = value;
    }

    /**
     * Gets the value of the callBackFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallBackFlag() {
        return callBackFlag;
    }

    /**
     * Sets the value of the callBackFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallBackFlag(Boolean value) {
        this.callBackFlag = value;
    }

    /**
     * Gets the value of the callBackContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackContactFirstName() {
        return callBackContactFirstName;
    }

    /**
     * Sets the value of the callBackContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackContactFirstName(String value) {
        this.callBackContactFirstName = value;
    }

    /**
     * Gets the value of the callBackContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackContactLastName() {
        return callBackContactLastName;
    }

    /**
     * Sets the value of the callBackContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackContactLastName(String value) {
        this.callBackContactLastName = value;
    }

    /**
     * Gets the value of the callBackContactMName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackContactMName() {
        return callBackContactMName;
    }

    /**
     * Sets the value of the callBackContactMName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackContactMName(String value) {
        this.callBackContactMName = value;
    }

    /**
     * Gets the value of the callBackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallBackStatus }
     *     
     */
    public CallBackStatus getCallBackStatus() {
        return callBackStatus;
    }

    /**
     * Sets the value of the callBackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBackStatus }
     *     
     */
    public void setCallBackStatus(CallBackStatus value) {
        this.callBackStatus = value;
    }

    /**
     * Gets the value of the callBackCompletedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallBackCompletedTime() {
        return callBackCompletedTime;
    }

    /**
     * Sets the value of the callBackCompletedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallBackCompletedTime(XMLGregorianCalendar value) {
        this.callBackCompletedTime = value;
    }

    /**
     * Gets the value of the callBackType property.
     * 
     * @return
     *     possible object is
     *     {@link CallBackType }
     *     
     */
    public CallBackType getCallBackType() {
        return callBackType;
    }

    /**
     * Sets the value of the callBackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBackType }
     *     
     */
    public void setCallBackType(CallBackType value) {
        this.callBackType = value;
    }

    /**
     * Gets the value of the callRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallRecordID() {
        return callRecordID;
    }

    /**
     * Sets the value of the callRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallRecordID(String value) {
        this.callRecordID = value;
    }

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

}
