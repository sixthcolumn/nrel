
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an entry that documents the quality codes for meter readings and intervalData blocks along with their meanings.  For additional information about these reading quality code definitions, see the definitions for QualityCodes in IEC 61968-9, 2nd. Edition,  Annex D. meanings. 
 * 
 * <p>Java class for readingQualityCodeEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingQualityCodeEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="readingQualityCode" type="{http://www.multispeak.org/V5.0}readingQualityCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingQualityCodeEntry", propOrder = {
    "description",
    "readingQualityCode"
})
public class ReadingQualityCodeEntry {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected ReadingQualityCode readingQualityCode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the readingQualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingQualityCode }
     *     
     */
    public ReadingQualityCode getReadingQualityCode() {
        return readingQualityCode;
    }

    /**
     * Sets the value of the readingQualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingQualityCode }
     *     
     */
    public void setReadingQualityCode(ReadingQualityCode value) {
        this.readingQualityCode = value;
    }

}
