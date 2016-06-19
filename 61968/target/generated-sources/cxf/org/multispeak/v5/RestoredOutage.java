
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for restoredOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restoredOutage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef"/>
 *         &lt;element name="eventTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="callBackCustomersThatCalled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="outageCause" type="{http://www.multispeak.org/V5.0}outageReasonList" minOccurs="0"/>
 *         &lt;element name="dispatcherResponsible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplementalNotes" type="{http://www.multispeak.org/V5.0}supplementalNotes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restoredOutage", propOrder = {
    "outageRef",
    "eventTime",
    "callBackCustomersThatCalled",
    "outageCause",
    "dispatcherResponsible",
    "supplementalNotes"
})
public class RestoredOutage
    extends MspReferable
{

    @XmlElement(required = true)
    protected OutageRef outageRef;
    @XmlElement(required = true)
    protected XMLGregorianCalendar eventTime;
    protected boolean callBackCustomersThatCalled;
    protected OutageReasonList outageCause;
    protected String dispatcherResponsible;
    protected SupplementalNotes supplementalNotes;

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
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the callBackCustomersThatCalled property.
     * 
     */
    public boolean isCallBackCustomersThatCalled() {
        return callBackCustomersThatCalled;
    }

    /**
     * Sets the value of the callBackCustomersThatCalled property.
     * 
     */
    public void setCallBackCustomersThatCalled(boolean value) {
        this.callBackCustomersThatCalled = value;
    }

    /**
     * Gets the value of the outageCause property.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonList }
     *     
     */
    public OutageReasonList getOutageCause() {
        return outageCause;
    }

    /**
     * Sets the value of the outageCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonList }
     *     
     */
    public void setOutageCause(OutageReasonList value) {
        this.outageCause = value;
    }

    /**
     * Gets the value of the dispatcherResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatcherResponsible() {
        return dispatcherResponsible;
    }

    /**
     * Sets the value of the dispatcherResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatcherResponsible(String value) {
        this.dispatcherResponsible = value;
    }

    /**
     * Gets the value of the supplementalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalNotes }
     *     
     */
    public SupplementalNotes getSupplementalNotes() {
        return supplementalNotes;
    }

    /**
     * Sets the value of the supplementalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalNotes }
     *     
     */
    public void setSupplementalNotes(SupplementalNotes value) {
        this.supplementalNotes = value;
    }

}
