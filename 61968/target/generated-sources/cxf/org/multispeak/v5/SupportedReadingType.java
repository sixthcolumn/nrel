
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.FieldNameType;


/**
 * <p>Java class for supportedReadingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportedReadingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="readingTypeCode" type="{http://www.multispeak.org/V5.0}readingTypeCode"/>
 *         &lt;element name="fieldName" type="{http://www.multispeak.org/V5.0/enumerations}fieldNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedReadingType", propOrder = {
    "readingTypeCode",
    "fieldName"
})
public class SupportedReadingType
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ReadingTypeCode readingTypeCode;
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
