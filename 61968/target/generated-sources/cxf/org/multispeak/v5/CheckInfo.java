
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.StandardEntryClass;


/**
 * <p>Java class for checkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameOnCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardEntryClass" type="{http://www.multispeak.org/V5.0/enumerations}standardEntryClass"/>
 *         &lt;element name="checkIDChoice" type="{http://www.multispeak.org/V5.0}checkIDChoice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkInfo", propOrder = {
    "nameOnCheck",
    "checkNumber",
    "city",
    "state",
    "postalCode",
    "standardEntryClass",
    "checkIDChoice"
})
public class CheckInfo {

    protected String nameOnCheck;
    protected String checkNumber;
    protected String city;
    protected String state;
    protected String postalCode;
    @XmlElement(required = true)
    protected StandardEntryClass standardEntryClass;
    @XmlElement(required = true)
    protected CheckIDChoice checkIDChoice;

    /**
     * Gets the value of the nameOnCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCheck() {
        return nameOnCheck;
    }

    /**
     * Sets the value of the nameOnCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCheck(String value) {
        this.nameOnCheck = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the standardEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link StandardEntryClass }
     *     
     */
    public StandardEntryClass getStandardEntryClass() {
        return standardEntryClass;
    }

    /**
     * Sets the value of the standardEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardEntryClass }
     *     
     */
    public void setStandardEntryClass(StandardEntryClass value) {
        this.standardEntryClass = value;
    }

    /**
     * Gets the value of the checkIDChoice property.
     * 
     * @return
     *     possible object is
     *     {@link CheckIDChoice }
     *     
     */
    public CheckIDChoice getCheckIDChoice() {
        return checkIDChoice;
    }

    /**
     * Sets the value of the checkIDChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckIDChoice }
     *     
     */
    public void setCheckIDChoice(CheckIDChoice value) {
        this.checkIDChoice = value;
    }

}
