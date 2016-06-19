
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is a safety clearance issued to a worker or crew as part of a switching order.
 * 
 * <p>Java class for clearanceInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearanceInstance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="clearanceCertificateID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearanceGivenTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issuedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="acknowledgedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="releasedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
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
@XmlType(name = "clearanceInstance", propOrder = {
    "clearanceCertificateID",
    "purpose",
    "clearanceGivenTo",
    "issuedDateTime",
    "acknowledgedDateTime",
    "releasedDateTime"
})
public class ClearanceInstance
    extends MspObject
{

    @XmlElement(required = true)
    protected ObjectID clearanceCertificateID;
    protected String purpose;
    @XmlElement(required = true)
    protected String clearanceGivenTo;
    protected XMLGregorianCalendar issuedDateTime;
    protected XMLGregorianCalendar acknowledgedDateTime;
    protected XMLGregorianCalendar releasedDateTime;

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
     * Gets the value of the clearanceGivenTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceGivenTo() {
        return clearanceGivenTo;
    }

    /**
     * Sets the value of the clearanceGivenTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceGivenTo(String value) {
        this.clearanceGivenTo = value;
    }

    /**
     * Gets the value of the issuedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDateTime() {
        return issuedDateTime;
    }

    /**
     * Sets the value of the issuedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedDateTime(XMLGregorianCalendar value) {
        this.issuedDateTime = value;
    }

    /**
     * Gets the value of the acknowledgedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcknowledgedDateTime() {
        return acknowledgedDateTime;
    }

    /**
     * Sets the value of the acknowledgedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcknowledgedDateTime(XMLGregorianCalendar value) {
        this.acknowledgedDateTime = value;
    }

    /**
     * Gets the value of the releasedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleasedDateTime() {
        return releasedDateTime;
    }

    /**
     * Sets the value of the releasedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleasedDateTime(XMLGregorianCalendar value) {
        this.releasedDateTime = value;
    }

}
