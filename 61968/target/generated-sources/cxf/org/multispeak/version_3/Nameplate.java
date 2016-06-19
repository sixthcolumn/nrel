
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nameplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kh" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kr" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.multispeak.org/Version_3.0}frequency" minOccurs="0"/>
 *         &lt;element name="numberOfElements" type="{http://www.multispeak.org/Version_3.0}numberOfElement" minOccurs="0"/>
 *         &lt;element name="baseType" type="{http://www.multispeak.org/Version_3.0}baseType" minOccurs="0"/>
 *         &lt;element name="accuracyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementsVoltage" type="{http://www.multispeak.org/Version_3.0}elementsVoltage" minOccurs="0"/>
 *         &lt;element name="supplyVoltage" type="{http://www.multispeak.org/Version_3.0}supplyVoltage" minOccurs="0"/>
 *         &lt;element name="maxAmperage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="testAmperage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="regRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="wires" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dials" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="form" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="demandMult" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="transformerRatio" type="{http://www.multispeak.org/Version_3.0}transformerRatio" minOccurs="0"/>
 *         &lt;element name="transponderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameplate", propOrder = {
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
    "regRatio",
    "phases",
    "wires",
    "dials",
    "form",
    "multiplier",
    "demandMult",
    "transformerRatio",
    "transponderID"
})
public class Nameplate {

    protected Float kh;
    protected Float kr;
    protected Frequency frequency;
    protected NumberOfElement numberOfElements;
    protected BaseType baseType;
    protected String accuracyClass;
    protected ElementsVoltage elementsVoltage;
    protected SupplyVoltage supplyVoltage;
    protected Float maxAmperage;
    protected Float testAmperage;
    protected Float regRatio;
    protected Long phases;
    protected Long wires;
    protected Long dials;
    protected String form;
    protected Long multiplier;
    protected Float demandMult;
    protected TransformerRatio transformerRatio;
    protected String transponderID;

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
     *     {@link NumberOfElement }
     *     
     */
    public NumberOfElement getNumberOfElements() {
        return numberOfElements;
    }

    /**
     * Sets the value of the numberOfElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfElement }
     *     
     */
    public void setNumberOfElements(NumberOfElement value) {
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
     *     {@link ElementsVoltage }
     *     
     */
    public ElementsVoltage getElementsVoltage() {
        return elementsVoltage;
    }

    /**
     * Sets the value of the elementsVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementsVoltage }
     *     
     */
    public void setElementsVoltage(ElementsVoltage value) {
        this.elementsVoltage = value;
    }

    /**
     * Gets the value of the supplyVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyVoltage }
     *     
     */
    public SupplyVoltage getSupplyVoltage() {
        return supplyVoltage;
    }

    /**
     * Sets the value of the supplyVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyVoltage }
     *     
     */
    public void setSupplyVoltage(SupplyVoltage value) {
        this.supplyVoltage = value;
    }

    /**
     * Gets the value of the maxAmperage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxAmperage() {
        return maxAmperage;
    }

    /**
     * Sets the value of the maxAmperage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxAmperage(Float value) {
        this.maxAmperage = value;
    }

    /**
     * Gets the value of the testAmperage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTestAmperage() {
        return testAmperage;
    }

    /**
     * Sets the value of the testAmperage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTestAmperage(Float value) {
        this.testAmperage = value;
    }

    /**
     * Gets the value of the regRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRegRatio() {
        return regRatio;
    }

    /**
     * Sets the value of the regRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRegRatio(Float value) {
        this.regRatio = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhases(Long value) {
        this.phases = value;
    }

    /**
     * Gets the value of the wires property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWires() {
        return wires;
    }

    /**
     * Sets the value of the wires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWires(Long value) {
        this.wires = value;
    }

    /**
     * Gets the value of the dials property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDials() {
        return dials;
    }

    /**
     * Sets the value of the dials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDials(Long value) {
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
     *     {@link Long }
     *     
     */
    public Long getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMultiplier(Long value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the demandMult property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDemandMult() {
        return demandMult;
    }

    /**
     * Sets the value of the demandMult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDemandMult(Float value) {
        this.demandMult = value;
    }

    /**
     * Gets the value of the transformerRatio property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerRatio }
     *     
     */
    public TransformerRatio getTransformerRatio() {
        return transformerRatio;
    }

    /**
     * Sets the value of the transformerRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerRatio }
     *     
     */
    public void setTransformerRatio(TransformerRatio value) {
        this.transformerRatio = value;
    }

    /**
     * Gets the value of the transponderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransponderID() {
        return transponderID;
    }

    /**
     * Sets the value of the transponderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransponderID(String value) {
        this.transponderID = value;
    }

}
