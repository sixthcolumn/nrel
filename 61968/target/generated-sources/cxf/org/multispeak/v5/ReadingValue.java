
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Extensions;
import org.multispeak.v5_0.commontypes.ExtensionsList;


/**
 * A reading taken by a meter.
 * 
 * <p>Java class for readingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/V5.0/commonTypes}extensionsList" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="readingQualityCode" type="{http://www.multispeak.org/V5.0}readingQualityCode" minOccurs="0"/>
 *         &lt;element name="readingTypeCodeOption" type="{http://www.multispeak.org/V5.0}readingTypeCodeOption"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingValue", propOrder = {
    "extensions",
    "extensionsList",
    "value",
    "timeStamp",
    "readingQualityCode",
    "readingTypeCodeOption"
})
public class ReadingValue {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;
    @XmlElement(required = true, nillable = true)
    protected String value;
    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    protected ReadingQualityCode readingQualityCode;
    @XmlElement(required = true)
    protected ReadingTypeCodeOption readingTypeCodeOption;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
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

    /**
     * Gets the value of the readingTypeCodeOption property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypeCodeOption }
     *     
     */
    public ReadingTypeCodeOption getReadingTypeCodeOption() {
        return readingTypeCodeOption;
    }

    /**
     * Sets the value of the readingTypeCodeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypeCodeOption }
     *     
     */
    public void setReadingTypeCodeOption(ReadingTypeCodeOption value) {
        this.readingTypeCodeOption = value;
    }

}
