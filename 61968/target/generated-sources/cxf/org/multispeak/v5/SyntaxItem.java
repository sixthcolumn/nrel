
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.Uom;


/**
 * This describes a single data field in the formatted data block.  For instance, fieldName might be accountNumber, position = 1 would indicate that the accountNumber was carried in the first data field position in each val record that follows, and uom is the units of measure for this item - for accountNumber uom could be omitted since it carries no units.
 * 
 * <p>Java class for syntaxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syntaxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingTypeChoice" type="{http://www.multispeak.org/V5.0}readingTypeChoice"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="uom" type="{http://www.multispeak.org/V5.0/enumerations}uom" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syntaxItem", propOrder = {
    "readingTypeChoice",
    "position",
    "uom"
})
public class SyntaxItem {

    @XmlElement(required = true)
    protected ReadingTypeChoice readingTypeChoice;
    @XmlElement(required = true)
    protected BigInteger position;
    protected Uom uom;

    /**
     * Gets the value of the readingTypeChoice property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypeChoice }
     *     
     */
    public ReadingTypeChoice getReadingTypeChoice() {
        return readingTypeChoice;
    }

    /**
     * Sets the value of the readingTypeChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypeChoice }
     *     
     */
    public void setReadingTypeChoice(ReadingTypeChoice value) {
        this.readingTypeChoice = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link Uom }
     *     
     */
    public Uom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uom }
     *     
     */
    public void setUom(Uom value) {
        this.uom = value;
    }

}
