
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.Frequency;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.BaseType;


/**
 * <p>Java class for electricNameplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricNameplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="kh" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kr" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.multispeak.org/V5.0/commonTypes}frequency" minOccurs="0"/>
 *         &lt;element name="numberOfElements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseType" type="{http://www.multispeak.org/V5.0/enumerations}baseType" minOccurs="0"/>
 *         &lt;element name="accuracyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementsVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="supplyVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="maxAmperage" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="testAmperage" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="registerRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="wires" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dials" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="form" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="demandMultiplier" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="supportedReadingTypes" type="{http://www.multispeak.org/V5.0}supportedReadingTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricNameplate", propOrder = {
    "kh",
    "kr",
    "frequency",
    "numberOfElements",
    "baseType",
    "accuracyClass",
    "elementsVoltage",
    "supplyVoltage",
    "maxAmperage",
    "testAmperage",
    "registerRatio",
    "phases",
    "wires",
    "dials",
    "form",
    "multiplier",
    "demandMultiplier",
    "supportedReadingTypes"
})
public class ElectricNameplate
    extends MspExtensible
{

    protected Float kh;
    protected Float kr;
    protected Frequency frequency;
    protected String numberOfElements;
    protected BaseType baseType;
    protected String accuracyClass;
    protected Voltage elementsVoltage;
    protected Voltage supplyVoltage;
    protected Current maxAmperage;
    protected Current testAmperage;
    protected Float registerRatio;
    protected BigInteger phases;
    protected BigInteger wires;
    protected BigInteger dials;
    protected String form;
    protected Float multiplier;
    protected Float demandMultiplier;
    protected SupportedReadingTypes supportedReadingTypes;

    /**
     * Gets the value of the kh property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKh() {
        return kh;
    }

    /**
     * Sets the value of the kh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKh(Float value) {
        this.kh = value;
    }

    /**
     * Gets the value of the kr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKr() {
        return kr;
    }

    /**
     * Sets the value of the kr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKr(Float value) {
        this.kr = value;
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

    /**
     * Gets the value of the numberOfElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfElements() {
        return numberOfElements;
    }

    /**
     * Sets the value of the numberOfElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfElements(String value) {
        this.numberOfElements = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link BaseType }
     *     
     */
    public BaseType getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseType }
     *     
     */
    public void setBaseType(BaseType value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the accuracyClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracyClass() {
        return accuracyClass;
    }

    /**
     * Sets the value of the accuracyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracyClass(String value) {
        this.accuracyClass = value;
    }

    /**
     * Gets the value of the elementsVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getElementsVoltage() {
        return elementsVoltage;
    }

    /**
     * Sets the value of the elementsVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setElementsVoltage(Voltage value) {
        this.elementsVoltage = value;
    }

    /**
     * Gets the value of the supplyVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getSupplyVoltage() {
        return supplyVoltage;
    }

    /**
     * Sets the value of the supplyVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setSupplyVoltage(Voltage value) {
        this.supplyVoltage = value;
    }

    /**
     * Gets the value of the maxAmperage property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getMaxAmperage() {
        return maxAmperage;
    }

    /**
     * Sets the value of the maxAmperage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setMaxAmperage(Current value) {
        this.maxAmperage = value;
    }

    /**
     * Gets the value of the testAmperage property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getTestAmperage() {
        return testAmperage;
    }

    /**
     * Sets the value of the testAmperage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setTestAmperage(Current value) {
        this.testAmperage = value;
    }

    /**
     * Gets the value of the registerRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRegisterRatio() {
        return registerRatio;
    }

    /**
     * Sets the value of the registerRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRegisterRatio(Float value) {
        this.registerRatio = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhases(BigInteger value) {
        this.phases = value;
    }

    /**
     * Gets the value of the wires property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWires() {
        return wires;
    }

    /**
     * Sets the value of the wires property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWires(BigInteger value) {
        this.wires = value;
    }

    /**
     * Gets the value of the dials property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDials() {
        return dials;
    }

    /**
     * Sets the value of the dials property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDials(BigInteger value) {
        this.dials = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMultiplier(Float value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the demandMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDemandMultiplier() {
        return demandMultiplier;
    }

    /**
     * Sets the value of the demandMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDemandMultiplier(Float value) {
        this.demandMultiplier = value;
    }

    /**
     * Gets the value of the supportedReadingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedReadingTypes }
     *     
     */
    public SupportedReadingTypes getSupportedReadingTypes() {
        return supportedReadingTypes;
    }

    /**
     * Sets the value of the supportedReadingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedReadingTypes }
     *     
     */
    public void setSupportedReadingTypes(SupportedReadingTypes value) {
        this.supportedReadingTypes = value;
    }

}
