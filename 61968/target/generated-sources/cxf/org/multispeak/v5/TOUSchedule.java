
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOUSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOUSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="TOUScheduleVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.multispeak.org/V5.0}effectiveDate"/>
 *         &lt;element name="daysOfWeek" type="{http://www.multispeak.org/V5.0}daysOfWeek"/>
 *         &lt;element name="exceptionDays" type="{http://www.multispeak.org/V5.0}exceptionDays" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOUSchedule", propOrder = {
    "touScheduleVersion",
    "effectiveDate",
    "daysOfWeek",
    "exceptionDays"
})
public class TOUSchedule
    extends MspObject
{

    @XmlElement(name = "TOUScheduleVersion")
    protected String touScheduleVersion;
    @XmlElement(required = true)
    protected EffectiveDate effectiveDate;
    @XmlElement(required = true)
    protected DaysOfWeek daysOfWeek;
    protected ExceptionDays exceptionDays;

    /**
     * Gets the value of the touScheduleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOUScheduleVersion() {
        return touScheduleVersion;
    }

    /**
     * Sets the value of the touScheduleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOUScheduleVersion(String value) {
        this.touScheduleVersion = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDate }
     *     
     */
    public EffectiveDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDate }
     *     
     */
    public void setEffectiveDate(EffectiveDate value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DaysOfWeek }
     *     
     */
    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysOfWeek }
     *     
     */
    public void setDaysOfWeek(DaysOfWeek value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the exceptionDays property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionDays }
     *     
     */
    public ExceptionDays getExceptionDays() {
        return exceptionDays;
    }

    /**
     * Sets the value of the exceptionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionDays }
     *     
     */
    public void setExceptionDays(ExceptionDays value) {
        this.exceptionDays = value;
    }

}
