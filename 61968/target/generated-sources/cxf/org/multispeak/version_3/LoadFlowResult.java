
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadFlowResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadFlowResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspResultsBase">
 *       &lt;sequence>
 *         &lt;element name="priKvA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priKvB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priKvC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priKvBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectionDropA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectionDropB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectionDropC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectionDropBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cumulativeDropA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cumulativeDropB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cumulativeDropC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="cumulativeDropBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruCurrentA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruCurrentB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruCurrentC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruCurrentBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctCapBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKwA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKwB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKwC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKwBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKvarA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKvarB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKvarC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="thruKvarBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctPfBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pctLoss" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectKwA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sectKwB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sectKwC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sectKwBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="secKvarA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="secKvarB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="secKvarC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="secKvarBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="consOnA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consOnB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consOnC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consOnBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consThruBal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseKvCalc" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadFlowResult", propOrder = {
    "priKvA",
    "priKvB",
    "priKvC",
    "priKvBal",
    "sectionDropA",
    "sectionDropB",
    "sectionDropC",
    "sectionDropBal",
    "cumulativeDropA",
    "cumulativeDropB",
    "cumulativeDropC",
    "cumulativeDropBal",
    "thruCurrentA",
    "thruCurrentB",
    "thruCurrentC",
    "thruCurrentBal",
    "pctCapA",
    "pctCapB",
    "pctCapC",
    "pctCapBal",
    "thruKwA",
    "thruKwB",
    "thruKwC",
    "thruKwBal",
    "thruKvarA",
    "thruKvarB",
    "thruKvarC",
    "thruKvarBal",
    "pctPfA",
    "pctPfB",
    "pctPfC",
    "pctPfBal",
    "pctLoss",
    "sectKwA",
    "sectKwB",
    "sectKwC",
    "sectKwBal",
    "secKvarA",
    "secKvarB",
    "secKvarC",
    "secKvarBal",
    "consOnA",
    "consOnB",
    "consOnC",
    "consOnBal",
    "consThruA",
    "consThruB",
    "consThruC",
    "consThruBal",
    "baseKvCalc"
})
public class LoadFlowResult
    extends MspResultsBase
{

    protected Float priKvA;
    protected Float priKvB;
    protected Float priKvC;
    protected Float priKvBal;
    protected Float sectionDropA;
    protected Float sectionDropB;
    protected Float sectionDropC;
    protected Float sectionDropBal;
    protected Float cumulativeDropA;
    protected Float cumulativeDropB;
    protected Float cumulativeDropC;
    protected Float cumulativeDropBal;
    protected Float thruCurrentA;
    protected Float thruCurrentB;
    protected Float thruCurrentC;
    protected Float thruCurrentBal;
    protected Float pctCapA;
    protected Float pctCapB;
    protected Float pctCapC;
    protected Float pctCapBal;
    protected Float thruKwA;
    protected Float thruKwB;
    protected Float thruKwC;
    protected Float thruKwBal;
    protected Float thruKvarA;
    protected Float thruKvarB;
    protected Float thruKvarC;
    protected Float thruKvarBal;
    protected Float pctPfA;
    protected Float pctPfB;
    protected Float pctPfC;
    protected Float pctPfBal;
    protected Float pctLoss;
    protected Long sectKwA;
    protected Long sectKwB;
    protected Long sectKwC;
    protected Long sectKwBal;
    protected Float secKvarA;
    protected Float secKvarB;
    protected Float secKvarC;
    protected Float secKvarBal;
    protected Long consOnA;
    protected Long consOnB;
    protected Long consOnC;
    protected Long consOnBal;
    protected Long consThruA;
    protected Long consThruB;
    protected Long consThruC;
    protected Long consThruBal;
    protected Float baseKvCalc;

    /**
     * Gets the value of the priKvA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriKvA() {
        return priKvA;
    }

    /**
     * Sets the value of the priKvA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriKvA(Float value) {
        this.priKvA = value;
    }

    /**
     * Gets the value of the priKvB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriKvB() {
        return priKvB;
    }

    /**
     * Sets the value of the priKvB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriKvB(Float value) {
        this.priKvB = value;
    }

    /**
     * Gets the value of the priKvC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriKvC() {
        return priKvC;
    }

    /**
     * Sets the value of the priKvC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriKvC(Float value) {
        this.priKvC = value;
    }

    /**
     * Gets the value of the priKvBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriKvBal() {
        return priKvBal;
    }

    /**
     * Sets the value of the priKvBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriKvBal(Float value) {
        this.priKvBal = value;
    }

    /**
     * Gets the value of the sectionDropA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSectionDropA() {
        return sectionDropA;
    }

    /**
     * Sets the value of the sectionDropA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSectionDropA(Float value) {
        this.sectionDropA = value;
    }

    /**
     * Gets the value of the sectionDropB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSectionDropB() {
        return sectionDropB;
    }

    /**
     * Sets the value of the sectionDropB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSectionDropB(Float value) {
        this.sectionDropB = value;
    }

    /**
     * Gets the value of the sectionDropC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSectionDropC() {
        return sectionDropC;
    }

    /**
     * Sets the value of the sectionDropC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSectionDropC(Float value) {
        this.sectionDropC = value;
    }

    /**
     * Gets the value of the sectionDropBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSectionDropBal() {
        return sectionDropBal;
    }

    /**
     * Sets the value of the sectionDropBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSectionDropBal(Float value) {
        this.sectionDropBal = value;
    }

    /**
     * Gets the value of the cumulativeDropA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCumulativeDropA() {
        return cumulativeDropA;
    }

    /**
     * Sets the value of the cumulativeDropA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCumulativeDropA(Float value) {
        this.cumulativeDropA = value;
    }

    /**
     * Gets the value of the cumulativeDropB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCumulativeDropB() {
        return cumulativeDropB;
    }

    /**
     * Sets the value of the cumulativeDropB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCumulativeDropB(Float value) {
        this.cumulativeDropB = value;
    }

    /**
     * Gets the value of the cumulativeDropC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCumulativeDropC() {
        return cumulativeDropC;
    }

    /**
     * Sets the value of the cumulativeDropC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCumulativeDropC(Float value) {
        this.cumulativeDropC = value;
    }

    /**
     * Gets the value of the cumulativeDropBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCumulativeDropBal() {
        return cumulativeDropBal;
    }

    /**
     * Sets the value of the cumulativeDropBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCumulativeDropBal(Float value) {
        this.cumulativeDropBal = value;
    }

    /**
     * Gets the value of the thruCurrentA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruCurrentA() {
        return thruCurrentA;
    }

    /**
     * Sets the value of the thruCurrentA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruCurrentA(Float value) {
        this.thruCurrentA = value;
    }

    /**
     * Gets the value of the thruCurrentB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruCurrentB() {
        return thruCurrentB;
    }

    /**
     * Sets the value of the thruCurrentB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruCurrentB(Float value) {
        this.thruCurrentB = value;
    }

    /**
     * Gets the value of the thruCurrentC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruCurrentC() {
        return thruCurrentC;
    }

    /**
     * Sets the value of the thruCurrentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruCurrentC(Float value) {
        this.thruCurrentC = value;
    }

    /**
     * Gets the value of the thruCurrentBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruCurrentBal() {
        return thruCurrentBal;
    }

    /**
     * Sets the value of the thruCurrentBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruCurrentBal(Float value) {
        this.thruCurrentBal = value;
    }

    /**
     * Gets the value of the pctCapA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapA() {
        return pctCapA;
    }

    /**
     * Sets the value of the pctCapA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapA(Float value) {
        this.pctCapA = value;
    }

    /**
     * Gets the value of the pctCapB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapB() {
        return pctCapB;
    }

    /**
     * Sets the value of the pctCapB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapB(Float value) {
        this.pctCapB = value;
    }

    /**
     * Gets the value of the pctCapC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapC() {
        return pctCapC;
    }

    /**
     * Sets the value of the pctCapC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapC(Float value) {
        this.pctCapC = value;
    }

    /**
     * Gets the value of the pctCapBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctCapBal() {
        return pctCapBal;
    }

    /**
     * Sets the value of the pctCapBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctCapBal(Float value) {
        this.pctCapBal = value;
    }

    /**
     * Gets the value of the thruKwA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKwA() {
        return thruKwA;
    }

    /**
     * Sets the value of the thruKwA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKwA(Float value) {
        this.thruKwA = value;
    }

    /**
     * Gets the value of the thruKwB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKwB() {
        return thruKwB;
    }

    /**
     * Sets the value of the thruKwB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKwB(Float value) {
        this.thruKwB = value;
    }

    /**
     * Gets the value of the thruKwC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKwC() {
        return thruKwC;
    }

    /**
     * Sets the value of the thruKwC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKwC(Float value) {
        this.thruKwC = value;
    }

    /**
     * Gets the value of the thruKwBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKwBal() {
        return thruKwBal;
    }

    /**
     * Sets the value of the thruKwBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKwBal(Float value) {
        this.thruKwBal = value;
    }

    /**
     * Gets the value of the thruKvarA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKvarA() {
        return thruKvarA;
    }

    /**
     * Sets the value of the thruKvarA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKvarA(Float value) {
        this.thruKvarA = value;
    }

    /**
     * Gets the value of the thruKvarB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKvarB() {
        return thruKvarB;
    }

    /**
     * Sets the value of the thruKvarB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKvarB(Float value) {
        this.thruKvarB = value;
    }

    /**
     * Gets the value of the thruKvarC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKvarC() {
        return thruKvarC;
    }

    /**
     * Sets the value of the thruKvarC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKvarC(Float value) {
        this.thruKvarC = value;
    }

    /**
     * Gets the value of the thruKvarBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThruKvarBal() {
        return thruKvarBal;
    }

    /**
     * Sets the value of the thruKvarBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThruKvarBal(Float value) {
        this.thruKvarBal = value;
    }

    /**
     * Gets the value of the pctPfA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfA() {
        return pctPfA;
    }

    /**
     * Sets the value of the pctPfA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfA(Float value) {
        this.pctPfA = value;
    }

    /**
     * Gets the value of the pctPfB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfB() {
        return pctPfB;
    }

    /**
     * Sets the value of the pctPfB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfB(Float value) {
        this.pctPfB = value;
    }

    /**
     * Gets the value of the pctPfC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfC() {
        return pctPfC;
    }

    /**
     * Sets the value of the pctPfC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfC(Float value) {
        this.pctPfC = value;
    }

    /**
     * Gets the value of the pctPfBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctPfBal() {
        return pctPfBal;
    }

    /**
     * Sets the value of the pctPfBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctPfBal(Float value) {
        this.pctPfBal = value;
    }

    /**
     * Gets the value of the pctLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPctLoss() {
        return pctLoss;
    }

    /**
     * Sets the value of the pctLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPctLoss(Float value) {
        this.pctLoss = value;
    }

    /**
     * Gets the value of the sectKwA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSectKwA() {
        return sectKwA;
    }

    /**
     * Sets the value of the sectKwA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSectKwA(Long value) {
        this.sectKwA = value;
    }

    /**
     * Gets the value of the sectKwB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSectKwB() {
        return sectKwB;
    }

    /**
     * Sets the value of the sectKwB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSectKwB(Long value) {
        this.sectKwB = value;
    }

    /**
     * Gets the value of the sectKwC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSectKwC() {
        return sectKwC;
    }

    /**
     * Sets the value of the sectKwC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSectKwC(Long value) {
        this.sectKwC = value;
    }

    /**
     * Gets the value of the sectKwBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSectKwBal() {
        return sectKwBal;
    }

    /**
     * Sets the value of the sectKwBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSectKwBal(Long value) {
        this.sectKwBal = value;
    }

    /**
     * Gets the value of the secKvarA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecKvarA() {
        return secKvarA;
    }

    /**
     * Sets the value of the secKvarA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecKvarA(Float value) {
        this.secKvarA = value;
    }

    /**
     * Gets the value of the secKvarB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecKvarB() {
        return secKvarB;
    }

    /**
     * Sets the value of the secKvarB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecKvarB(Float value) {
        this.secKvarB = value;
    }

    /**
     * Gets the value of the secKvarC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecKvarC() {
        return secKvarC;
    }

    /**
     * Sets the value of the secKvarC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecKvarC(Float value) {
        this.secKvarC = value;
    }

    /**
     * Gets the value of the secKvarBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecKvarBal() {
        return secKvarBal;
    }

    /**
     * Sets the value of the secKvarBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecKvarBal(Float value) {
        this.secKvarBal = value;
    }

    /**
     * Gets the value of the consOnA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnA() {
        return consOnA;
    }

    /**
     * Sets the value of the consOnA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnA(Long value) {
        this.consOnA = value;
    }

    /**
     * Gets the value of the consOnB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnB() {
        return consOnB;
    }

    /**
     * Sets the value of the consOnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnB(Long value) {
        this.consOnB = value;
    }

    /**
     * Gets the value of the consOnC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnC() {
        return consOnC;
    }

    /**
     * Sets the value of the consOnC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnC(Long value) {
        this.consOnC = value;
    }

    /**
     * Gets the value of the consOnBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsOnBal() {
        return consOnBal;
    }

    /**
     * Sets the value of the consOnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsOnBal(Long value) {
        this.consOnBal = value;
    }

    /**
     * Gets the value of the consThruA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruA() {
        return consThruA;
    }

    /**
     * Sets the value of the consThruA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruA(Long value) {
        this.consThruA = value;
    }

    /**
     * Gets the value of the consThruB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruB() {
        return consThruB;
    }

    /**
     * Sets the value of the consThruB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruB(Long value) {
        this.consThruB = value;
    }

    /**
     * Gets the value of the consThruC property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruC() {
        return consThruC;
    }

    /**
     * Sets the value of the consThruC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruC(Long value) {
        this.consThruC = value;
    }

    /**
     * Gets the value of the consThruBal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsThruBal() {
        return consThruBal;
    }

    /**
     * Sets the value of the consThruBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsThruBal(Long value) {
        this.consThruBal = value;
    }

    /**
     * Gets the value of the baseKvCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseKvCalc() {
        return baseKvCalc;
    }

    /**
     * Sets the value of the baseKvCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseKvCalc(Float value) {
        this.baseKvCalc = value;
    }

}
