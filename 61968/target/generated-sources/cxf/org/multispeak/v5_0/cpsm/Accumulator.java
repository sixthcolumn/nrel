
package org.multispeak.v5_0.cpsm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.TimePeriod;
import org.multispeak.v5_0.enumerations.Accountability;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.QualityDescriptionKind;
import org.multispeak.v5_0.enumerations.Uom;


/**
 * Accumulator represents a accumulated (counted) Measurement, e.g. an energy value.
 * 
 * <p>Java class for Accumulator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accumulator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="accumulatorValues" type="{http://www.multispeak.org/V5.0/cpsm}AccumulatorValues" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.multispeak.org/V5.0/enumerations}uom" minOccurs="0"/>
 *         &lt;element name="unitID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/V5.0/enumerations}qualityDescriptionKind" minOccurs="0"/>
 *         &lt;element name="timeSpan" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="harmonic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="quadrant" type="{http://www.multispeak.org/V5.0/enumerations}accountability" minOccurs="0"/>
 *         &lt;element name="measurementTypeID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="terminalID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="powerSystemResourceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
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
@XmlType(name = "Accumulator", propOrder = {
    "maxValue",
    "accumulatorValues",
    "units",
    "unitID",
    "quality",
    "timeSpan",
    "phase",
    "harmonic",
    "quadrant",
    "measurementTypeID",
    "terminalID",
    "powerSystemResourceID"
})
public class Accumulator
    extends MspCIMObject
{

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxValue;
    protected AccumulatorValues accumulatorValues;
    protected Uom units;
    protected ObjectID unitID;
    protected QualityDescriptionKind quality;
    protected TimePeriod timeSpan;
    protected PhaseCode phase;
    protected Boolean harmonic;
    protected Accountability quadrant;
    protected ObjectID measurementTypeID;
    protected ObjectID terminalID;
    protected ObjectRef powerSystemResourceID;

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxValue(BigInteger value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the accumulatorValues property.
     * 
     * @return
     *     possible object is
     *     {@link AccumulatorValues }
     *     
     */
    public AccumulatorValues getAccumulatorValues() {
        return accumulatorValues;
    }

    /**
     * Sets the value of the accumulatorValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccumulatorValues }
     *     
     */
    public void setAccumulatorValues(AccumulatorValues value) {
        this.accumulatorValues = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Uom }
     *     
     */
    public Uom getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uom }
     *     
     */
    public void setUnits(Uom value) {
        this.units = value;
    }

    /**
     * Gets the value of the unitID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getUnitID() {
        return unitID;
    }

    /**
     * Sets the value of the unitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setUnitID(ObjectID value) {
        this.unitID = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDescriptionKind }
     *     
     */
    public QualityDescriptionKind getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDescriptionKind }
     *     
     */
    public void setQuality(QualityDescriptionKind value) {
        this.quality = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setTimeSpan(TimePeriod value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhase(PhaseCode value) {
        this.phase = value;
    }

    /**
     * Gets the value of the harmonic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHarmonic() {
        return harmonic;
    }

    /**
     * Sets the value of the harmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHarmonic(Boolean value) {
        this.harmonic = value;
    }

    /**
     * Gets the value of the quadrant property.
     * 
     * @return
     *     possible object is
     *     {@link Accountability }
     *     
     */
    public Accountability getQuadrant() {
        return quadrant;
    }

    /**
     * Sets the value of the quadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountability }
     *     
     */
    public void setQuadrant(Accountability value) {
        this.quadrant = value;
    }

    /**
     * Gets the value of the measurementTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMeasurementTypeID() {
        return measurementTypeID;
    }

    /**
     * Sets the value of the measurementTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMeasurementTypeID(ObjectID value) {
        this.measurementTypeID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTerminalID(ObjectID value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the powerSystemResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getPowerSystemResourceID() {
        return powerSystemResourceID;
    }

    /**
     * Sets the value of the powerSystemResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setPowerSystemResourceID(ObjectRef value) {
        this.powerSystemResourceID = value;
    }

}
