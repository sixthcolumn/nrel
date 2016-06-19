
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.SwitchingEndStateType;
import org.multispeak.v5_0.enumerations.SwitchingStepOperationType;
import org.multispeak.v5_0.enumerations.SwitchingStepStatusType;


/**
 * This is the work that needs to be performed in order to accomplish a manual switching step.
 * 
 * <p>Java class for switchingStepWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingStepWork">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{http://www.multispeak.org/V5.0/enumerations}switchingStepOperationType"/>
 *         &lt;element name="deviceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="desiredEndState" type="{http://www.multispeak.org/V5.0/enumerations}switchingEndStateType"/>
 *         &lt;element name="instructedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="completedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="stepStatus" type="{http://www.multispeak.org/V5.0/enumerations}switchingStepStatusType" minOccurs="0"/>
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
@XmlType(name = "switchingStepWork", propOrder = {
    "operation",
    "deviceDescription",
    "deviceRef",
    "desiredEndState",
    "instructedBy",
    "instructedDateTime",
    "completedBy",
    "completedDateTime",
    "stepStatus"
})
public class SwitchingStepWork
    extends MspWork
{

    @XmlElement(required = true)
    protected SwitchingStepOperationType operation;
    protected String deviceDescription;
    @XmlElement(required = true)
    protected ObjectRef deviceRef;
    @XmlElement(required = true)
    protected SwitchingEndStateType desiredEndState;
    protected String instructedBy;
    protected XMLGregorianCalendar instructedDateTime;
    protected String completedBy;
    protected XMLGregorianCalendar completedDateTime;
    protected SwitchingStepStatusType stepStatus;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingStepOperationType }
     *     
     */
    public SwitchingStepOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingStepOperationType }
     *     
     */
    public void setOperation(SwitchingStepOperationType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the deviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getDeviceRef() {
        return deviceRef;
    }

    /**
     * Sets the value of the deviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setDeviceRef(ObjectRef value) {
        this.deviceRef = value;
    }

    /**
     * Gets the value of the desiredEndState property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingEndStateType }
     *     
     */
    public SwitchingEndStateType getDesiredEndState() {
        return desiredEndState;
    }

    /**
     * Sets the value of the desiredEndState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingEndStateType }
     *     
     */
    public void setDesiredEndState(SwitchingEndStateType value) {
        this.desiredEndState = value;
    }

    /**
     * Gets the value of the instructedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructedBy() {
        return instructedBy;
    }

    /**
     * Sets the value of the instructedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructedBy(String value) {
        this.instructedBy = value;
    }

    /**
     * Gets the value of the instructedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstructedDateTime() {
        return instructedDateTime;
    }

    /**
     * Sets the value of the instructedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstructedDateTime(XMLGregorianCalendar value) {
        this.instructedDateTime = value;
    }

    /**
     * Gets the value of the completedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedBy() {
        return completedBy;
    }

    /**
     * Sets the value of the completedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedBy(String value) {
        this.completedBy = value;
    }

    /**
     * Gets the value of the completedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the value of the completedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDateTime(XMLGregorianCalendar value) {
        this.completedDateTime = value;
    }

    /**
     * Gets the value of the stepStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingStepStatusType }
     *     
     */
    public SwitchingStepStatusType getStepStatus() {
        return stepStatus;
    }

    /**
     * Sets the value of the stepStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingStepStatusType }
     *     
     */
    public void setStepStatus(SwitchingStepStatusType value) {
        this.stepStatus = value;
    }

}
