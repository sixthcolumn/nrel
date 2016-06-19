
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Temperature;
import org.multispeak.v5_0.enumerations.RequestedAccumulationMode;


/**
 * This is the class representing the DR Event. The class is strongly influenced by the SEP specification, but does not need to map one-to-one to a ZigBee Load Control message. The primaryIdentifier of this object maps to the SEP eventID .
 * 
 * <p>Java class for demandResponseEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandResponseEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="DRProgramID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="deviceClasses" type="{http://www.multispeak.org/V5.0}deviceClasses" minOccurs="0"/>
 *         &lt;element name="eventDuration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="randomizeEventStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="randomizeEventEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="heatingSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="coolingSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="heatingOffset" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="coolingOffset" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="averageLoadAdjustment" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="dutyCycle" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="criticality" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedAccumulationMode" type="{http://www.multispeak.org/V5.0/enumerations}requestedAccumulationMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandResponseEvent", propOrder = {
    "drProgramID",
    "deviceClasses",
    "eventDuration",
    "randomizeEventStart",
    "randomizeEventEnd",
    "heatingSetPoint",
    "coolingSetPoint",
    "heatingOffset",
    "coolingOffset",
    "averageLoadAdjustment",
    "dutyCycle",
    "criticality",
    "modificationNumber",
    "requestedAccumulationMode"
})
public class DemandResponseEvent
    extends MspEvent
{

    @XmlElement(name = "DRProgramID", required = true)
    protected ObjectID drProgramID;
    protected DeviceClasses deviceClasses;
    protected Duration eventDuration;
    protected Boolean randomizeEventStart;
    @XmlElement(defaultValue = "true")
    protected Boolean randomizeEventEnd;
    protected Temperature heatingSetPoint;
    protected Temperature coolingSetPoint;
    protected Temperature heatingOffset;
    protected Temperature coolingOffset;
    protected Float averageLoadAdjustment;
    protected Float dutyCycle;
    protected BigInteger criticality;
    protected String modificationNumber;
    protected RequestedAccumulationMode requestedAccumulationMode;

    /**
     * Gets the value of the drProgramID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getDRProgramID() {
        return drProgramID;
    }

    /**
     * Sets the value of the drProgramID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setDRProgramID(ObjectID value) {
        this.drProgramID = value;
    }

    /**
     * Gets the value of the deviceClasses property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceClasses }
     *     
     */
    public DeviceClasses getDeviceClasses() {
        return deviceClasses;
    }

    /**
     * Sets the value of the deviceClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceClasses }
     *     
     */
    public void setDeviceClasses(DeviceClasses value) {
        this.deviceClasses = value;
    }

    /**
     * Gets the value of the eventDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEventDuration() {
        return eventDuration;
    }

    /**
     * Sets the value of the eventDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEventDuration(Duration value) {
        this.eventDuration = value;
    }

    /**
     * Gets the value of the randomizeEventStart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRandomizeEventStart() {
        return randomizeEventStart;
    }

    /**
     * Sets the value of the randomizeEventStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRandomizeEventStart(Boolean value) {
        this.randomizeEventStart = value;
    }

    /**
     * Gets the value of the randomizeEventEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRandomizeEventEnd() {
        return randomizeEventEnd;
    }

    /**
     * Sets the value of the randomizeEventEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRandomizeEventEnd(Boolean value) {
        this.randomizeEventEnd = value;
    }

    /**
     * Gets the value of the heatingSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getHeatingSetPoint() {
        return heatingSetPoint;
    }

    /**
     * Sets the value of the heatingSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setHeatingSetPoint(Temperature value) {
        this.heatingSetPoint = value;
    }

    /**
     * Gets the value of the coolingSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getCoolingSetPoint() {
        return coolingSetPoint;
    }

    /**
     * Sets the value of the coolingSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setCoolingSetPoint(Temperature value) {
        this.coolingSetPoint = value;
    }

    /**
     * Gets the value of the heatingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getHeatingOffset() {
        return heatingOffset;
    }

    /**
     * Sets the value of the heatingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setHeatingOffset(Temperature value) {
        this.heatingOffset = value;
    }

    /**
     * Gets the value of the coolingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getCoolingOffset() {
        return coolingOffset;
    }

    /**
     * Sets the value of the coolingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setCoolingOffset(Temperature value) {
        this.coolingOffset = value;
    }

    /**
     * Gets the value of the averageLoadAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageLoadAdjustment() {
        return averageLoadAdjustment;
    }

    /**
     * Sets the value of the averageLoadAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageLoadAdjustment(Float value) {
        this.averageLoadAdjustment = value;
    }

    /**
     * Gets the value of the dutyCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDutyCycle() {
        return dutyCycle;
    }

    /**
     * Sets the value of the dutyCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDutyCycle(Float value) {
        this.dutyCycle = value;
    }

    /**
     * Gets the value of the criticality property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCriticality() {
        return criticality;
    }

    /**
     * Sets the value of the criticality property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCriticality(BigInteger value) {
        this.criticality = value;
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationNumber(String value) {
        this.modificationNumber = value;
    }

    /**
     * Gets the value of the requestedAccumulationMode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAccumulationMode }
     *     
     */
    public RequestedAccumulationMode getRequestedAccumulationMode() {
        return requestedAccumulationMode;
    }

    /**
     * Sets the value of the requestedAccumulationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAccumulationMode }
     *     
     */
    public void setRequestedAccumulationMode(RequestedAccumulationMode value) {
        this.requestedAccumulationMode = value;
    }

}
