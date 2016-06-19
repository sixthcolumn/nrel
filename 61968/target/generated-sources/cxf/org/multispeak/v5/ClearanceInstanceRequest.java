
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This object is sent as part of an InitiateClearanceInstanceRequest method call, which is used for the Work Performer application to request a new clearance in response to a request by a field resource.
 * 
 * <p>Java class for clearanceInstanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearanceInstanceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="clearanceCertificateID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedFor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
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
@XmlType(name = "clearanceInstanceRequest", propOrder = {
    "clearanceCertificateID",
    "purpose",
    "requestedFor",
    "requestedDateTime"
})
public class ClearanceInstanceRequest
    extends MspObject
{

    @XmlElement(required = true)
    protected ObjectID clearanceCertificateID;
    protected String purpose;
    @XmlElement(required = true)
    protected String requestedFor;
    @XmlElement(required = true)
    protected XMLGregorianCalendar requestedDateTime;

    /**
     * Gets the value of the clearanceCertificateID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getClearanceCertificateID() {
        return clearanceCertificateID;
    }

    /**
     * Sets the value of the clearanceCertificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setClearanceCertificateID(ObjectID value) {
        this.clearanceCertificateID = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the requestedFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedFor() {
        return requestedFor;
    }

    /**
     * Sets the value of the requestedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedFor(String value) {
        this.requestedFor = value;
    }

    /**
     * Gets the value of the requestedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDateTime() {
        return requestedDateTime;
    }

    /**
     * Sets the value of the requestedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDateTime(XMLGregorianCalendar value) {
        this.requestedDateTime = value;
    }

}
