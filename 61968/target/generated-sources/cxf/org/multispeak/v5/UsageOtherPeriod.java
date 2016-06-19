
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for usageOtherPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usageOtherPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayUsage" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="periodDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageOtherPeriod", propOrder = {
    "displayUsage",
    "startTime",
    "endTime",
    "periodDescription"
})
public class UsageOtherPeriod {

    protected DisplayUsage displayUsage;
    protected XMLGregorianCalendar startTime;
    protected XMLGregorianCalendar endTime;
    protected String periodDescription;

    /**
     * Gets the value of the displayUsage property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getDisplayUsage() {
        return displayUsage;
    }

    /**
     * Sets the value of the displayUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setDisplayUsage(DisplayUsage value) {
        this.displayUsage = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the periodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodDescription() {
        return periodDescription;
    }

    /**
     * Sets the value of the periodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodDescription(String value) {
        this.periodDescription = value;
    }

}
