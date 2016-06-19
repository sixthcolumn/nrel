
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supressLeadingZero" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberOfDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="displayMultiplier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayFormat", propOrder = {
    "supressLeadingZero",
    "numberOfDigits",
    "precision",
    "displayMultiplier"
})
public class DisplayFormat {

    protected Boolean supressLeadingZero;
    @XmlSchemaType(name = "unsignedByte")
    protected Short numberOfDigits;
    @XmlSchemaType(name = "unsignedByte")
    protected Short precision;
    @XmlElement(defaultValue = "1")
    protected Double displayMultiplier;

    /**
     * Gets the value of the supressLeadingZero property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupressLeadingZero() {
        return supressLeadingZero;
    }

    /**
     * Sets the value of the supressLeadingZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupressLeadingZero(Boolean value) {
        this.supressLeadingZero = value;
    }

    /**
     * Gets the value of the numberOfDigits property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfDigits() {
        return numberOfDigits;
    }

    /**
     * Sets the value of the numberOfDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfDigits(Short value) {
        this.numberOfDigits = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrecision(Short value) {
        this.precision = value;
    }

    /**
     * Gets the value of the displayMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDisplayMultiplier() {
        return displayMultiplier;
    }

    /**
     * Sets the value of the displayMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDisplayMultiplier(Double value) {
        this.displayMultiplier = value;
    }

}
