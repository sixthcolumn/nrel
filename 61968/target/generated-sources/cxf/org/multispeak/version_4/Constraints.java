
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for constraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="constraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantStartUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mustBeDoneBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constraints", propOrder = {
    "cantStartUntil",
    "mustBeDoneBy"
})
public class Constraints {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cantStartUntil;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mustBeDoneBy;

    /**
     * Gets the value of the cantStartUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCantStartUntil() {
        return cantStartUntil;
    }

    /**
     * Sets the value of the cantStartUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCantStartUntil(XMLGregorianCalendar value) {
        this.cantStartUntil = value;
    }

    /**
     * Gets the value of the mustBeDoneBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustBeDoneBy() {
        return mustBeDoneBy;
    }

    /**
     * Sets the value of the mustBeDoneBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustBeDoneBy(XMLGregorianCalendar value) {
        this.mustBeDoneBy = value;
    }

}
