
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consumptionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumptionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingValue" type="{http://www.multispeak.org/Version_4.1_Release}readingValue" minOccurs="0"/>
 *         &lt;element name="periodOfUse" type="{http://www.multispeak.org/Version_4.1_Release}timePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumptionItem", propOrder = {
    "readingValue",
    "periodOfUse"
})
public class ConsumptionItem {

    protected ReadingValue readingValue;
    protected TimePeriod periodOfUse;

    /**
     * Gets the value of the readingValue property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingValue }
     *     
     */
    public ReadingValue getReadingValue() {
        return readingValue;
    }

    /**
     * Sets the value of the readingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingValue }
     *     
     */
    public void setReadingValue(ReadingValue value) {
        this.readingValue = value;
    }

    /**
     * Gets the value of the periodOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getPeriodOfUse() {
        return periodOfUse;
    }

    /**
     * Sets the value of the periodOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setPeriodOfUse(TimePeriod value) {
        this.periodOfUse = value;
    }

}
