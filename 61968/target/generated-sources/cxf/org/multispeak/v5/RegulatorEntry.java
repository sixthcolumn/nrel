
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.Frequency;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.RegulatorWindingType;


/**
 * This is an electrical equipment catalog entry for a regulator.
 * 
 * <p>Java class for regulatorEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulatorEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ratedPower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="ampacity" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="BIL" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="numberOfSteps" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="stepVoltageIncrement" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="PTRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CTRating" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="windingType" type="{http://www.multispeak.org/V5.0/enumerations}regulatorWindingType" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.multispeak.org/V5.0/commonTypes}frequency" minOccurs="0"/>
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
@XmlType(name = "regulatorEntry", propOrder = {
    "ratedVoltage",
    "ratedPower",
    "ampacity",
    "bil",
    "numberOfSteps",
    "stepVoltageIncrement",
    "ptRatio",
    "ctRating",
    "windingType",
    "frequency"
})
public class RegulatorEntry
    extends MspElectricalDefinition
{

    protected Voltage ratedVoltage;
    protected ApparentPower ratedPower;
    protected Current ampacity;
    @XmlElement(name = "BIL")
    protected Voltage bil;
    protected BigInteger numberOfSteps;
    protected Float stepVoltageIncrement;
    @XmlElement(name = "PTRatio")
    protected Double ptRatio;
    @XmlElement(name = "CTRating")
    protected Current ctRating;
    protected RegulatorWindingType windingType;
    protected Frequency frequency;

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the ratedPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedPower() {
        return ratedPower;
    }

    /**
     * Sets the value of the ratedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedPower(ApparentPower value) {
        this.ratedPower = value;
    }

    /**
     * Gets the value of the ampacity property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getAmpacity() {
        return ampacity;
    }

    /**
     * Sets the value of the ampacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setAmpacity(Current value) {
        this.ampacity = value;
    }

    /**
     * Gets the value of the bil property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBIL() {
        return bil;
    }

    /**
     * Sets the value of the bil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBIL(Voltage value) {
        this.bil = value;
    }

    /**
     * Gets the value of the numberOfSteps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSteps() {
        return numberOfSteps;
    }

    /**
     * Sets the value of the numberOfSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSteps(BigInteger value) {
        this.numberOfSteps = value;
    }

    /**
     * Gets the value of the stepVoltageIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    /**
     * Sets the value of the stepVoltageIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStepVoltageIncrement(Float value) {
        this.stepVoltageIncrement = value;
    }

    /**
     * Gets the value of the ptRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPTRatio() {
        return ptRatio;
    }

    /**
     * Sets the value of the ptRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPTRatio(Double value) {
        this.ptRatio = value;
    }

    /**
     * Gets the value of the ctRating property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getCTRating() {
        return ctRating;
    }

    /**
     * Sets the value of the ctRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setCTRating(Current value) {
        this.ctRating = value;
    }

    /**
     * Gets the value of the windingType property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorWindingType }
     *     
     */
    public RegulatorWindingType getWindingType() {
        return windingType;
    }

    /**
     * Sets the value of the windingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorWindingType }
     *     
     */
    public void setWindingType(RegulatorWindingType value) {
        this.windingType = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequency(Frequency value) {
        this.frequency = value;
    }

}
