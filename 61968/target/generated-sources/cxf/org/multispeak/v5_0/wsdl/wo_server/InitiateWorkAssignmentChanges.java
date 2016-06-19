
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkAssignmentChange;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfWorkAssignmentChange" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkAssignmentChange" minOccurs="0"/>
 *         &lt;element name="mustChangeBy" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrayOfWorkAssignmentChange",
    "mustChangeBy",
    "responseURL",
    "transactionID"
})
@XmlRootElement(name = "InitiateWorkAssignmentChanges")
public class InitiateWorkAssignmentChanges {

    @XmlElement(name = "ArrayOfWorkAssignmentChange")
    protected ArrayOfWorkAssignmentChange arrayOfWorkAssignmentChange;
    protected XMLGregorianCalendar mustChangeBy;
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    protected String transactionID;

    /**
     * Gets the value of the arrayOfWorkAssignmentChange property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkAssignmentChange }
     *     
     */
    public ArrayOfWorkAssignmentChange getArrayOfWorkAssignmentChange() {
        return arrayOfWorkAssignmentChange;
    }

    /**
     * Sets the value of the arrayOfWorkAssignmentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkAssignmentChange }
     *     
     */
    public void setArrayOfWorkAssignmentChange(ArrayOfWorkAssignmentChange value) {
        this.arrayOfWorkAssignmentChange = value;
    }

    /**
     * Gets the value of the mustChangeBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustChangeBy() {
        return mustChangeBy;
    }

    /**
     * Sets the value of the mustChangeBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustChangeBy(XMLGregorianCalendar value) {
        this.mustChangeBy = value;
    }

    /**
     * Gets the value of the responseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseURL() {
        return responseURL;
    }

    /**
     * Sets the value of the responseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseURL(String value) {
        this.responseURL = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}
