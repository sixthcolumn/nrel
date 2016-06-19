
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.AnalogCondition;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.QualityDescription;
import org.multispeak.v5_0.enumerations.UnitPrefixType;


/**
 * <p>Java class for scadaAnalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaAnalog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="scadaPointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="value" type="{http://www.multispeak.org/V5.0}value"/>
 *         &lt;element name="unitPrefixType" type="{http://www.multispeak.org/V5.0/enumerations}unitPrefixType" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/V5.0/enumerations}qualityDescription" minOccurs="0"/>
 *         &lt;element name="analogCondition" type="{http://www.multispeak.org/V5.0/enumerations}analogCondition" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="scadaAnalogValues" type="{http://www.multispeak.org/V5.0}scadaAnalogValues" minOccurs="0"/>
 *         &lt;element name="unitID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="positiveFlowIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="analogLimitSetID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="measurementTypeID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="powerSystemResourceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nominalValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "scadaAnalog", propOrder = {
    "scadaPointID",
    "timeStamp",
    "value",
    "unitPrefixType",
    "quality",
    "analogCondition",
    "phaseCode",
    "scadaAnalogValues",
    "unitID",
    "positiveFlowIn",
    "analogLimitSetID",
    "measurementTypeID",
    "powerSystemResourceID",
    "maxValue",
    "minValue",
    "nominalValue"
})
public class ScadaAnalog
    extends MspObject
{

    @XmlElement(required = true)
    protected ObjectID scadaPointID;
    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(required = true)
    protected Value value;
    protected UnitPrefixType unitPrefixType;
    protected QualityDescription quality;
    protected AnalogCondition analogCondition;
    protected PhaseCode phaseCode;
    protected ScadaAnalogValues scadaAnalogValues;
    protected ObjectID unitID;
    protected Boolean positiveFlowIn;
    protected ObjectID analogLimitSetID;
    protected ObjectID measurementTypeID;
    protected ObjectRef powerSystemResourceID;
    protected Float maxValue;
    protected Float minValue;
    protected Float nominalValue;

    /**
     * Gets the value of the scadaPointID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getScadaPointID() {
        return scadaPointID;
    }

    /**
     * Sets the value of the scadaPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setScadaPointID(ObjectID value) {
        this.scadaPointID = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitPrefixType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrefixType }
     *     
     */
    public UnitPrefixType getUnitPrefixType() {
        return unitPrefixType;
    }

    /**
     * Sets the value of the unitPrefixType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrefixType }
     *     
     */
    public void setUnitPrefixType(UnitPrefixType value) {
        this.unitPrefixType = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDescription }
     *     
     */
    public QualityDescription getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDescription }
     *     
     */
    public void setQuality(QualityDescription value) {
        this.quality = value;
    }

    /**
     * Gets the value of the analogCondition property.
     * 
     * @return
     *     possible object is
     *     {@link AnalogCondition }
     *     
     */
    public AnalogCondition getAnalogCondition() {
        return analogCondition;
    }

    /**
     * Sets the value of the analogCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalogCondition }
     *     
     */
    public void setAnalogCondition(AnalogCondition value) {
        this.analogCondition = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the scadaAnalogValues property.
     * 
     * @return
     *     possible object is
     *     {@link ScadaAnalogValues }
     *     
     */
    public ScadaAnalogValues getScadaAnalogValues() {
        return scadaAnalogValues;
    }

    /**
     * Sets the value of the scadaAnalogValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScadaAnalogValues }
     *     
     */
    public void setScadaAnalogValues(ScadaAnalogValues value) {
        this.scadaAnalogValues = value;
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
     * Gets the value of the positiveFlowIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPositiveFlowIn() {
        return positiveFlowIn;
    }

    /**
     * Sets the value of the positiveFlowIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPositiveFlowIn(Boolean value) {
        this.positiveFlowIn = value;
    }

    /**
     * Gets the value of the analogLimitSetID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getAnalogLimitSetID() {
        return analogLimitSetID;
    }

    /**
     * Sets the value of the analogLimitSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setAnalogLimitSetID(ObjectID value) {
        this.analogLimitSetID = value;
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

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxValue(Float value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinValue(Float value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the nominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominalValue() {
        return nominalValue;
    }

    /**
     * Sets the value of the nominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNominalValue(Float value) {
        this.nominalValue = value;
    }

}
