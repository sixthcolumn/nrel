
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This is the payload for methods to request deletion of object instances.  For instance, the InitiateWorkItemDeletion method will carry an array of objectDeletionRequest.  In that case, the objectRef will point to the workItem object to be deleted.
 * 
 * <p>Java class for objectDeletionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectDeletionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="objectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestingPerson" type="{http://www.multispeak.org/V5.0}requestingPerson" minOccurs="0"/>
 *         &lt;element name="requestingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectDeletionRequest", propOrder = {
    "objectRef",
    "reason",
    "requestingPerson",
    "requestingSystem",
    "timeStamp"
})
public class ObjectDeletionRequest
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectRef objectRef;
    protected String reason;
    protected RequestingPerson requestingPerson;
    protected String requestingSystem;
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setObjectRef(ObjectRef value) {
        this.objectRef = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the requestingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingPerson }
     *     
     */
    public RequestingPerson getRequestingPerson() {
        return requestingPerson;
    }

    /**
     * Sets the value of the requestingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingPerson }
     *     
     */
    public void setRequestingPerson(RequestingPerson value) {
        this.requestingPerson = value;
    }

    /**
     * Gets the value of the requestingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingSystem() {
        return requestingSystem;
    }

    /**
     * Sets the value of the requestingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingSystem(String value) {
        this.requestingSystem = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
