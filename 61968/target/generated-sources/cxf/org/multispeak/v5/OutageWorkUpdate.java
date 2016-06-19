
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageWorkUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageWorkUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef" minOccurs="0"/>
 *         &lt;element name="workProgress" type="{http://www.multispeak.org/V5.0}workProgress" minOccurs="0"/>
 *         &lt;element name="ETOR" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="failedDevices" type="{http://www.multispeak.org/V5.0}failedDevices" minOccurs="0"/>
 *         &lt;element name="predictedDeviceStatus" type="{http://www.multispeak.org/V5.0}predictedDeviceStatus" minOccurs="0"/>
 *         &lt;element name="callBackCustomersThatCalled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCustomerResponsible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outageReasonList" type="{http://www.multispeak.org/V5.0}outageReasonList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageWorkUpdate", propOrder = {
    "workItemRef",
    "outageRef",
    "workProgress",
    "etor",
    "failedDevices",
    "predictedDeviceStatus",
    "callBackCustomersThatCalled",
    "isCustomerResponsible",
    "outageReasonList"
})
public class OutageWorkUpdate
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    protected OutageRef outageRef;
    protected WorkProgress workProgress;
    @XmlElement(name = "ETOR")
    protected XMLGregorianCalendar etor;
    protected FailedDevices failedDevices;
    protected PredictedDeviceStatus predictedDeviceStatus;
    protected Boolean callBackCustomersThatCalled;
    protected Boolean isCustomerResponsible;
    protected OutageReasonList outageReasonList;

    /**
     * Gets the value of the workItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemRef }
     *     
     */
    public WorkItemRef getWorkItemRef() {
        return workItemRef;
    }

    /**
     * Sets the value of the workItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemRef }
     *     
     */
    public void setWorkItemRef(WorkItemRef value) {
        this.workItemRef = value;
    }

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
     * Gets the value of the workProgress property.
     * 
     * @return
     *     possible object is
     *     {@link WorkProgress }
     *     
     */
    public WorkProgress getWorkProgress() {
        return workProgress;
    }

    /**
     * Sets the value of the workProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkProgress }
     *     
     */
    public void setWorkProgress(WorkProgress value) {
        this.workProgress = value;
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
     * Gets the value of the failedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link FailedDevices }
     *     
     */
    public FailedDevices getFailedDevices() {
        return failedDevices;
    }

    /**
     * Sets the value of the failedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedDevices }
     *     
     */
    public void setFailedDevices(FailedDevices value) {
        this.failedDevices = value;
    }

    /**
     * Gets the value of the predictedDeviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PredictedDeviceStatus }
     *     
     */
    public PredictedDeviceStatus getPredictedDeviceStatus() {
        return predictedDeviceStatus;
    }

    /**
     * Sets the value of the predictedDeviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictedDeviceStatus }
     *     
     */
    public void setPredictedDeviceStatus(PredictedDeviceStatus value) {
        this.predictedDeviceStatus = value;
    }

    /**
     * Gets the value of the callBackCustomersThatCalled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallBackCustomersThatCalled() {
        return callBackCustomersThatCalled;
    }

    /**
     * Sets the value of the callBackCustomersThatCalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallBackCustomersThatCalled(Boolean value) {
        this.callBackCustomersThatCalled = value;
    }

    /**
     * Gets the value of the isCustomerResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerResponsible() {
        return isCustomerResponsible;
    }

    /**
     * Sets the value of the isCustomerResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerResponsible(Boolean value) {
        this.isCustomerResponsible = value;
    }

    /**
     * Gets the value of the outageReasonList property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonList }
     *     
     */
    public OutageReasonList getOutageReasonList() {
        return outageReasonList;
    }

    /**
     * Sets the value of the outageReasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonList }
     *     
     */
    public void setOutageReasonList(OutageReasonList value) {
        this.outageReasonList = value;
    }

}
