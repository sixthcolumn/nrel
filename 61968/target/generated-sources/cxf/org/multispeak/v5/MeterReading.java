
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;


/**
 * This is one or more readings made on a single meter.  The meter could be a revenue meter or some other type of meter.  The readings can be any type of value that can be measured by the meter.
 * 
 * <p>Java class for meterReading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterReading">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="deviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readingTypeCodeItems" type="{http://www.multispeak.org/V5.0}readingTypeCodeItems" minOccurs="0"/>
 *         &lt;element name="readingValues" type="{http://www.multispeak.org/V5.0}readingValues"/>
 *         &lt;element name="coincidentMeterReadingSet" type="{http://www.multispeak.org/V5.0}coincidentMeterReadingSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterReading", propOrder = {
    "meterID",
    "deviceID",
    "readingTypeCodeItems",
    "readingValues",
    "coincidentMeterReadingSet"
})
public class MeterReading
    extends MspReferable
{

    @XmlElement(required = true)
    protected MeterID meterID;
    protected String deviceID;
    protected ReadingTypeCodeItems readingTypeCodeItems;
    @XmlElement(required = true)
    protected ReadingValues readingValues;
    protected CoincidentMeterReadingSet coincidentMeterReadingSet;

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
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the readingTypeCodeItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypeCodeItems }
     *     
     */
    public ReadingTypeCodeItems getReadingTypeCodeItems() {
        return readingTypeCodeItems;
    }

    /**
     * Sets the value of the readingTypeCodeItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypeCodeItems }
     *     
     */
    public void setReadingTypeCodeItems(ReadingTypeCodeItems value) {
        this.readingTypeCodeItems = value;
    }

    /**
     * Gets the value of the readingValues property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingValues }
     *     
     */
    public ReadingValues getReadingValues() {
        return readingValues;
    }

    /**
     * Sets the value of the readingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingValues }
     *     
     */
    public void setReadingValues(ReadingValues value) {
        this.readingValues = value;
    }

    /**
     * Gets the value of the coincidentMeterReadingSet property.
     * 
     * @return
     *     possible object is
     *     {@link CoincidentMeterReadingSet }
     *     
     */
    public CoincidentMeterReadingSet getCoincidentMeterReadingSet() {
        return coincidentMeterReadingSet;
    }

    /**
     * Sets the value of the coincidentMeterReadingSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoincidentMeterReadingSet }
     *     
     */
    public void setCoincidentMeterReadingSet(CoincidentMeterReadingSet value) {
        this.coincidentMeterReadingSet = value;
    }

}
