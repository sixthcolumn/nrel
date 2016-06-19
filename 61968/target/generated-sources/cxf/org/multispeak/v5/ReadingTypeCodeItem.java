
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.FieldNameType;


/**
 * <p>Java class for readingTypeCodeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingTypeCodeItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingTypeCode" type="{http://www.multispeak.org/V5.0}readingTypeCode"/>
 *         &lt;element name="readingTypeCodeRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldName" type="{http://www.multispeak.org/V5.0/enumerations}fieldNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingTypeCodeItem", propOrder = {
    "readingTypeCode",
    "readingTypeCodeRef",
    "fieldName"
})
public class ReadingTypeCodeItem {

    @XmlElement(required = true)
    protected ReadingTypeCode readingTypeCode;
    @XmlElement(required = true)
    protected String readingTypeCodeRef;
    protected FieldNameType fieldName;

    /**
     * Gets the value of the readingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypeCode }
     *     
     */
    public ReadingTypeCode getReadingTypeCode() {
        return readingTypeCode;
    }

    /**
     * Sets the value of the readingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypeCode }
     *     
     */
    public void setReadingTypeCode(ReadingTypeCode value) {
        this.readingTypeCode = value;
    }

    /**
     * Gets the value of the readingTypeCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingTypeCodeRef() {
        return readingTypeCodeRef;
    }

    /**
     * Sets the value of the readingTypeCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingTypeCodeRef(String value) {
        this.readingTypeCodeRef = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNameType }
     *     
     */
    public FieldNameType getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNameType }
     *     
     */
    public void setFieldName(FieldNameType value) {
        this.fieldName = value;
    }

}
