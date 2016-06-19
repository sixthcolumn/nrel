
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for clearance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearanceGivenTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="releasedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "clearance", propOrder = {
    "purpose",
    "clearanceGivenTo",
    "issuedDateTime",
    "releasedDateTime"
})
public class Clearance
    extends MspObject
{

    protected String purpose;
    protected String clearanceGivenTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issuedDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releasedDateTime;

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
