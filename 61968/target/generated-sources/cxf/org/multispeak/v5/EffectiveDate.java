
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for effectiveDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="effectiveDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveMonth" type="{http://www.multispeak.org/V5.0/enumerations}monthNumber"/>
 *         &lt;element name="effectiveDay" type="{http://www.multispeak.org/V5.0/enumerations}dayNumber"/>
 *         &lt;element name="isCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "effectiveDate", propOrder = {
    "effectiveMonth",
    "effectiveDay",
    "isCalendar"
})
public class EffectiveDate {

    @XmlElement(required = true)
    protected String effectiveMonth;
    @XmlElement(required = true)
    protected String effectiveDay;
    protected Boolean isCalendar;

    /**
     * Gets the value of the effectiveMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveMonth() {
        return effectiveMonth;
    }

    /**
     * Sets the value of the effectiveMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveMonth(String value) {
        this.effectiveMonth = value;
    }

    /**
     * Gets the value of the effectiveDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDay() {
        return effectiveDay;
    }

    /**
     * Sets the value of the effectiveDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDay(String value) {
        this.effectiveDay = value;
    }

    /**
     * Gets the value of the isCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCalendar() {
        return isCalendar;
    }

    /**
     * Sets the value of the isCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCalendar(Boolean value) {
        this.isCalendar = value;
    }

}
