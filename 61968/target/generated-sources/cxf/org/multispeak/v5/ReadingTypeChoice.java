
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.FieldNameType;


/**
 * This is a choice between a CIM readingTypeCode and a MultiSpeak fieldName.  Note that the CIM readingTypeCode may carry an optional fieldName attribute.
 * 
 * <p>Java class for readingTypeChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingTypeChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="fieldName" type="{http://www.multispeak.org/V5.0/enumerations}fieldNameType"/>
 *         &lt;element name="readingTypeCode" type="{http://www.multispeak.org/V5.0}readingTypeCode"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingTypeChoice", propOrder = {
    "fieldName",
    "readingTypeCode"
})
public class ReadingTypeChoice {

    protected FieldNameType fieldName;
    protected ReadingTypeCode readingTypeCode;

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

}
