
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.enumerations.ControlEventKind;


/**
 * A load management event.  The timestamp is the date and time that the loadManagementEvent should become effective.  If no date is specified, or the date/time is in the past, the loadManagementEvent should become effective immediately.
 * 
 * <p>Java class for loadManagementEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagementEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="strategyChoices" type="{http://www.multispeak.org/V5.0}strategyChoices" minOccurs="0"/>
 *         &lt;element name="controlParameters" type="{http://www.multispeak.org/V5.0}controlParameters" minOccurs="0"/>
 *         &lt;element name="controlEventType" type="{http://www.multispeak.org/V5.0/enumerations}controlEventKind" minOccurs="0"/>
 *         &lt;element name="applicationRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="cycleTime" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadManagementEvent", propOrder = {
    "strategyChoices",
    "controlParameters",
    "controlEventType",
    "applicationRate",
    "duration",
    "cycleTime"
})
public class LoadManagementEvent
    extends MspEvent
{

    protected StrategyChoices strategyChoices;
    protected ControlParameters controlParameters;
    protected ControlEventKind controlEventType;
    protected Float applicationRate;
    protected Duration duration;
    protected Duration cycleTime;

    /**
     * Gets the value of the strategyChoices property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyChoices }
     *     
     */
    public StrategyChoices getStrategyChoices() {
        return strategyChoices;
    }

    /**
     * Sets the value of the strategyChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyChoices }
     *     
     */
    public void setStrategyChoices(StrategyChoices value) {
        this.strategyChoices = value;
    }

    /**
     * Gets the value of the controlParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ControlParameters }
     *     
     */
    public ControlParameters getControlParameters() {
        return controlParameters;
    }

    /**
     * Sets the value of the controlParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlParameters }
     *     
     */
    public void setControlParameters(ControlParameters value) {
        this.controlParameters = value;
    }

    /**
     * Gets the value of the controlEventType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlEventKind }
     *     
     */
    public ControlEventKind getControlEventType() {
        return controlEventType;
    }

    /**
     * Sets the value of the controlEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlEventKind }
     *     
     */
    public void setControlEventType(ControlEventKind value) {
        this.controlEventType = value;
    }

    /**
     * Gets the value of the applicationRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setApplicationRate(Float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the cycleTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCycleTime() {
        return cycleTime;
    }

    /**
     * Sets the value of the cycleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCycleTime(Duration value) {
        this.cycleTime = value;
    }

}
