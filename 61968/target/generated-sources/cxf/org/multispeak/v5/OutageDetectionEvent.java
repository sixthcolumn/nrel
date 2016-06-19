
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.OutageDetectionSource;
import org.multispeak.v5_0.enumerations.OutageEventType;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.PriorityType;
import org.multispeak.v5_0.enumerations.ResolvedLevel;


/**
 * <p>Java class for outageDetectionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="outageEventType" type="{http://www.multispeak.org/V5.0/enumerations}outageEventType" minOccurs="0"/>
 *         &lt;element name="outageDetectionDeviceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="outageDetectionSource" type="{http://www.multispeak.org/V5.0/enumerations}outageDetectionSource" minOccurs="0"/>
 *         &lt;element name="outageLocation" type="{http://www.multispeak.org/V5.0}outageLocation" minOccurs="0"/>
 *         &lt;element name="outageCustomer" type="{http://www.multispeak.org/V5.0}outageCustomer" minOccurs="0"/>
 *         &lt;element name="messages" type="{http://www.multispeak.org/V5.0}messages" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.multispeak.org/V5.0/enumerations}priorityType" minOccurs="0"/>
 *         &lt;element name="problemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolvedLevel" type="{http://www.multispeak.org/V5.0/enumerations}resolvedLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageDetectionEvent", propOrder = {
    "phaseCode",
    "outageEventType",
    "outageDetectionDeviceRef",
    "outageDetectionSource",
    "outageLocation",
    "outageCustomer",
    "messages",
    "priority",
    "problemCode",
    "resolvedLevel"
})
@XmlSeeAlso({
    LoggedOutageDetectionEvent.class
})
public class OutageDetectionEvent
    extends MspEvent
{

    protected PhaseCode phaseCode;
    protected OutageEventType outageEventType;
    protected ObjectRef outageDetectionDeviceRef;
    protected OutageDetectionSource outageDetectionSource;
    protected OutageLocation outageLocation;
    protected OutageCustomer outageCustomer;
    protected Messages messages;
    protected PriorityType priority;
    protected String problemCode;
    protected ResolvedLevel resolvedLevel;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the outageEventType property.
     * 
     * @return
     *     possible object is
     *     {@link OutageEventType }
     *     
     */
    public OutageEventType getOutageEventType() {
        return outageEventType;
    }

    /**
     * Sets the value of the outageEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageEventType }
     *     
     */
    public void setOutageEventType(OutageEventType value) {
        this.outageEventType = value;
    }

    /**
     * Gets the value of the outageDetectionDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getOutageDetectionDeviceRef() {
        return outageDetectionDeviceRef;
    }

    /**
     * Sets the value of the outageDetectionDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setOutageDetectionDeviceRef(ObjectRef value) {
        this.outageDetectionDeviceRef = value;
    }

    /**
     * Gets the value of the outageDetectionSource property.
     * 
     * @return
     *     possible object is
     *     {@link OutageDetectionSource }
     *     
     */
    public OutageDetectionSource getOutageDetectionSource() {
        return outageDetectionSource;
    }

    /**
     * Sets the value of the outageDetectionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageDetectionSource }
     *     
     */
    public void setOutageDetectionSource(OutageDetectionSource value) {
        this.outageDetectionSource = value;
    }

    /**
     * Gets the value of the outageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link OutageLocation }
     *     
     */
    public OutageLocation getOutageLocation() {
        return outageLocation;
    }

    /**
     * Sets the value of the outageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageLocation }
     *     
     */
    public void setOutageLocation(OutageLocation value) {
        this.outageLocation = value;
    }

    /**
     * Gets the value of the outageCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link OutageCustomer }
     *     
     */
    public OutageCustomer getOutageCustomer() {
        return outageCustomer;
    }

    /**
     * Sets the value of the outageCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageCustomer }
     *     
     */
    public void setOutageCustomer(OutageCustomer value) {
        this.outageCustomer = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the problemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemCode() {
        return problemCode;
    }

    /**
     * Sets the value of the problemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemCode(String value) {
        this.problemCode = value;
    }

    /**
     * Gets the value of the resolvedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ResolvedLevel }
     *     
     */
    public ResolvedLevel getResolvedLevel() {
        return resolvedLevel;
    }

    /**
     * Sets the value of the resolvedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolvedLevel }
     *     
     */
    public void setResolvedLevel(ResolvedLevel value) {
        this.resolvedLevel = value;
    }

}
