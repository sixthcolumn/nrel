
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * This is the payload for methods to delete object instances.  For instance, the CustomerDeletedNotification will carry an array of  objectDeletion.  In that case, the objectRef will point to the customer object that has been deleted.
 * 
 * <p>Java class for objectDeletion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectDeletion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="objectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsiblePerson" type="{http://www.multispeak.org/V5.0}responsiblePerson" minOccurs="0"/>
 *         &lt;element name="responsibleSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "objectDeletion", propOrder = {
    "objectRef",
    "reason",
    "responsiblePerson",
    "responsibleSystem",
    "timeStamp"
})
public class ObjectDeletion
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectRef objectRef;
    protected String reason;
    protected ResponsiblePerson responsiblePerson;
    protected String responsibleSystem;
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
     * Gets the value of the responsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsiblePerson }
     *     
     */
    public ResponsiblePerson getResponsiblePerson() {
        return responsiblePerson;
    }

    /**
     * Sets the value of the responsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiblePerson }
     *     
     */
    public void setResponsiblePerson(ResponsiblePerson value) {
        this.responsiblePerson = value;
    }

    /**
     * Gets the value of the responsibleSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleSystem() {
        return responsibleSystem;
    }

    /**
     * Sets the value of the responsibleSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleSystem(String value) {
        this.responsibleSystem = value;
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
