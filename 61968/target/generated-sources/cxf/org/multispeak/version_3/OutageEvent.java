
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualFault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/Version_3.0}outageStatus" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outageDefined" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstDispatch" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstETA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ETOR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="completed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.multispeak.org/Version_3.0}message" minOccurs="0"/>
 *         &lt;element name="crewsDispatched" type="{http://www.multispeak.org/Version_3.0}ArrayOfString2" minOccurs="0"/>
 *         &lt;element name="isPlanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "outageEvent", propOrder = {
    "area",
    "problemLocation",
    "deviceID",
    "deviceType",
    "substationCode",
    "feeder",
    "actualFault",
    "faultType",
    "outageDescription",
    "outageStatus",
    "priority",
    "startTime",
    "outageDefined",
    "firstDispatch",
    "firstETA",
    "firstArrival",
    "etor",
    "completed",
    "message",
    "crewsDispatched",
    "isPlanned"
})
public class OutageEvent
    extends MspObject
{

    protected String area;
    protected String problemLocation;
    protected String deviceID;
    protected String deviceType;
    protected String substationCode;
    protected String feeder;
    protected String actualFault;
    protected String faultType;
    protected String outageDescription;
    protected OutageStatus outageStatus;
    protected Long priority;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outageDefined;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstDispatch;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstETA;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstArrival;
    @XmlElement(name = "ETOR")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completed;
    protected Message message;
    protected ArrayOfString2 crewsDispatched;
    protected Boolean isPlanned;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the problemLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemLocation() {
        return problemLocation;
    }

    /**
     * Sets the value of the problemLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemLocation(String value) {
        this.problemLocation = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the substationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationCode() {
        return substationCode;
    }

    /**
     * Sets the value of the substationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationCode(String value) {
        this.substationCode = value;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the actualFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFault() {
        return actualFault;
    }

    /**
     * Sets the value of the actualFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFault(String value) {
        this.actualFault = value;
    }

    /**
     * Gets the value of the faultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * Sets the value of the faultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultType(String value) {
        this.faultType = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the outageDefined property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutageDefined() {
        return outageDefined;
    }

    /**
     * Sets the value of the outageDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutageDefined(XMLGregorianCalendar value) {
        this.outageDefined = value;
    }

    /**
     * Gets the value of the firstDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDispatch() {
        return firstDispatch;
    }

    /**
     * Sets the value of the firstDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDispatch(XMLGregorianCalendar value) {
        this.firstDispatch = value;
    }

    /**
     * Gets the value of the firstETA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstETA() {
        return firstETA;
    }

    /**
     * Sets the value of the firstETA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstETA(XMLGregorianCalendar value) {
        this.firstETA = value;
    }

    /**
     * Gets the value of the firstArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstArrival() {
        return firstArrival;
    }

    /**
     * Sets the value of the firstArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstArrival(XMLGregorianCalendar value) {
        this.firstArrival = value;
    }

    /**
     * Gets the value of the etor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETOR() {
        return etor;
    }

    /**
     * Sets the value of the etor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETOR(XMLGregorianCalendar value) {
        this.etor = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleted(XMLGregorianCalendar value) {
        this.completed = value;
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
     * Gets the value of the crewsDispatched property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getCrewsDispatched() {
        return crewsDispatched;
    }

    /**
     * Sets the value of the crewsDispatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setCrewsDispatched(ArrayOfString2 value) {
        this.crewsDispatched = value;
    }

    /**
     * Gets the value of the isPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlanned() {
        return isPlanned;
    }

    /**
     * Sets the value of the isPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlanned(Boolean value) {
        this.isPlanned = value;
    }

}
