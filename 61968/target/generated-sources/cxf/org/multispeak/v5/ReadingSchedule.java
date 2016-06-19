
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A meter reading schedule.
 * 
 * <p>Java class for readingSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}schedule">
 *       &lt;sequence>
 *         &lt;element name="readingTypes" type="{http://www.multispeak.org/V5.0}readingTypes" minOccurs="0"/>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/V5.0}meterIDs" minOccurs="0"/>
 *         &lt;element name="meterGroupIDs" type="{http://www.multispeak.org/V5.0}meterGroupIDs" minOccurs="0"/>
 *         &lt;element name="configurationGroupIDs" type="{http://www.multispeak.org/V5.0}configurationGroupIDs" minOccurs="0"/>
 *         &lt;element name="retryBehavior" type="{http://www.multispeak.org/V5.0}retryBehavior" minOccurs="0"/>
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
@XmlType(name = "readingSchedule", propOrder = {
    "readingTypes",
    "meterIDs",
    "meterGroupIDs",
    "configurationGroupIDs",
    "retryBehavior"
})
public class ReadingSchedule
    extends Schedule
{

    protected ReadingTypes readingTypes;
    protected MeterIDs meterIDs;
    protected MeterGroupIDs meterGroupIDs;
    protected ConfigurationGroupIDs configurationGroupIDs;
    protected RetryBehavior retryBehavior;

    /**
     * Gets the value of the readingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingTypes }
     *     
     */
    public ReadingTypes getReadingTypes() {
        return readingTypes;
    }

    /**
     * Sets the value of the readingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingTypes }
     *     
     */
    public void setReadingTypes(ReadingTypes value) {
        this.readingTypes = value;
    }

    /**
     * Gets the value of the meterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterIDs }
     *     
     */
    public MeterIDs getMeterIDs() {
        return meterIDs;
    }

    /**
     * Sets the value of the meterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterIDs }
     *     
     */
    public void setMeterIDs(MeterIDs value) {
        this.meterIDs = value;
    }

    /**
     * Gets the value of the meterGroupIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterGroupIDs }
     *     
     */
    public MeterGroupIDs getMeterGroupIDs() {
        return meterGroupIDs;
    }

    /**
     * Sets the value of the meterGroupIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterGroupIDs }
     *     
     */
    public void setMeterGroupIDs(MeterGroupIDs value) {
        this.meterGroupIDs = value;
    }

    /**
     * Gets the value of the configurationGroupIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationGroupIDs }
     *     
     */
    public ConfigurationGroupIDs getConfigurationGroupIDs() {
        return configurationGroupIDs;
    }

    /**
     * Sets the value of the configurationGroupIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationGroupIDs }
     *     
     */
    public void setConfigurationGroupIDs(ConfigurationGroupIDs value) {
        this.configurationGroupIDs = value;
    }

    /**
     * Gets the value of the retryBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link RetryBehavior }
     *     
     */
    public RetryBehavior getRetryBehavior() {
        return retryBehavior;
    }

    /**
     * Sets the value of the retryBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryBehavior }
     *     
     */
    public void setRetryBehavior(RetryBehavior value) {
        this.retryBehavior = value;
    }

}
