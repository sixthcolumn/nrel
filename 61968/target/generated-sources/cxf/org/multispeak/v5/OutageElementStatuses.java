
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * The phase statuses of a circuit element.
 * 
 * <p>Java class for outageElementStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageElementStatuses">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="circuitElementID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="eventTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="dispatcherResponsible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outagePhaseStatuses" type="{http://www.multispeak.org/V5.0}outagePhaseStatuses"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageElementStatuses", propOrder = {
    "circuitElementID",
    "eventTime",
    "dispatcherResponsible",
    "outagePhaseStatuses"
})
public class OutageElementStatuses
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID circuitElementID;
    @XmlElement(required = true)
    protected XMLGregorianCalendar eventTime;
    protected String dispatcherResponsible;
    @XmlElement(required = true)
    protected OutagePhaseStatuses outagePhaseStatuses;

    /**
     * Gets the value of the circuitElementID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCircuitElementID() {
        return circuitElementID;
    }

    /**
     * Sets the value of the circuitElementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCircuitElementID(ObjectID value) {
        this.circuitElementID = value;
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
     * Gets the value of the outagePhaseStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link OutagePhaseStatuses }
     *     
     */
    public OutagePhaseStatuses getOutagePhaseStatuses() {
        return outagePhaseStatuses;
    }

    /**
     * Sets the value of the outagePhaseStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutagePhaseStatuses }
     *     
     */
    public void setOutagePhaseStatuses(OutagePhaseStatuses value) {
        this.outagePhaseStatuses = value;
    }

}
