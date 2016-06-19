
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;


/**
 * <p>Java class for thresholdNotificationItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thresholdNotificationItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="readingValue" type="{http://www.multispeak.org/V5.0}readingValue"/>
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
@XmlType(name = "thresholdNotificationItem", propOrder = {
    "meterID",
    "readingValue"
})
public class ThresholdNotificationItem
    extends MspObject
{

    @XmlElement(required = true)
    protected MeterID meterID;
    @XmlElement(required = true)
    protected ReadingValue readingValue;

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

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

}
