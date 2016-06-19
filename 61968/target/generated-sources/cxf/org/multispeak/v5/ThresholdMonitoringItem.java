
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;


/**
 * <p>Java class for thresholdMonitoringItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thresholdMonitoringItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="readingTypeCode" type="{http://www.multispeak.org/V5.0}readingTypeCode"/>
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
@XmlType(name = "thresholdMonitoringItem", propOrder = {
    "meterID",
    "value",
    "readingTypeCode"
})
public class ThresholdMonitoringItem
    extends MspObject
{

    @XmlElement(required = true)
    protected MeterID meterID;
    protected float value;
    @XmlElement(required = true)
    protected ReadingTypeCode readingTypeCode;

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
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the readingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypeCode }
     *     
     */
    public ReadingTypeCode getReadingTypeCode() {
        return readingTypeCode;
    }

    /**
     * Sets the value of the readingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypeCode }
     *     
     */
    public void setReadingTypeCode(ReadingTypeCode value) {
        this.readingTypeCode = value;
    }

}
