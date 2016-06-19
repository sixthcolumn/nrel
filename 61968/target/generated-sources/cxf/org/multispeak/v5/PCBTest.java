
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for PCBTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCBTest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="testDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="pcbClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCBTest", propOrder = {
    "testDate",
    "pcbClass",
    "sampleNumber",
    "comment"
})
public class PCBTest
    extends MspExtensible
{

    protected XMLGregorianCalendar testDate;
    protected String pcbClass;
    protected String sampleNumber;
    protected String comment;

    /**
     * Gets the value of the testDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestDate() {
        return testDate;
    }

    /**
     * Sets the value of the testDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestDate(XMLGregorianCalendar value) {
        this.testDate = value;
    }

    /**
     * Gets the value of the pcbClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcbClass() {
        return pcbClass;
    }

    /**
     * Sets the value of the pcbClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcbClass(String value) {
        this.pcbClass = value;
    }

    /**
     * Gets the value of the sampleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleNumber() {
        return sampleNumber;
    }

    /**
     * Sets the value of the sampleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleNumber(String value) {
        this.sampleNumber = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
