
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * <p>Java class for consumptionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumptionItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="readingValue" type="{http://www.multispeak.org/V5.0}readingValue"/>
 *         &lt;element name="periodOfUse" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
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
public class ConsumptionItem
    extends MspExtensible
{

    @XmlElement(required = true)
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
