
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.TelephoneNumber;
import org.multispeak.v5_0.enumerations.CallBackStatus;
import org.multispeak.v5_0.enumerations.CallBackType;


/**
 * <p>Java class for callBackInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callBackInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="callRecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerID" type="{http://www.multispeak.org/V5.0/commonTypes}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="callBackType" type="{http://www.multispeak.org/V5.0/enumerations}callBackType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.multispeak.org/V5.0/commonTypes}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="timeToCall" type="{http://www.multispeak.org/V5.0}timeToCall" minOccurs="0"/>
 *         &lt;element name="contactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callBackStatus" type="{http://www.multispeak.org/V5.0/enumerations}callBackStatus" minOccurs="0"/>
 *         &lt;element name="callBackCompletedTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callBackInformation", propOrder = {
    "callRecordID",
    "callerID",
    "callBackType",
    "phoneNumber",
    "timeToCall",
    "contactFirstName",
    "contactLastName",
    "contactMiddleName",
    "callBackStatus",
    "callBackCompletedTime"
})
public class CallBackInformation
    extends MspExtensible
{

    protected String callRecordID;
    protected TelephoneNumber callerID;
    protected CallBackType callBackType;
    protected TelephoneNumber phoneNumber;
    protected TimeToCall timeToCall;
    protected String contactFirstName;
    protected String contactLastName;
    protected String contactMiddleName;
    protected CallBackStatus callBackStatus;
    protected XMLGregorianCalendar callBackCompletedTime;

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
     * Gets the value of the callerID property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getCallerID() {
        return callerID;
    }

    /**
     * Sets the value of the callerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setCallerID(TelephoneNumber value) {
        this.callerID = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setPhoneNumber(TelephoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the timeToCall property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToCall }
     *     
     */
    public TimeToCall getTimeToCall() {
        return timeToCall;
    }

    /**
     * Sets the value of the timeToCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToCall }
     *     
     */
    public void setTimeToCall(TimeToCall value) {
        this.timeToCall = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the contactMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiddleName() {
        return contactMiddleName;
    }

    /**
     * Sets the value of the contactMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiddleName(String value) {
        this.contactMiddleName = value;
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

}
