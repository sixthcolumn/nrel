
package org.multispeak.version_3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspMotorGenerator">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pf" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="eff" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lgVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="dropout" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nemaTyp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="limitedBy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sftStTyp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sftStR" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sftStX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sftStTap" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sftStWdg" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lrPf" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lrMult" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "motor", propOrder = {
    "model",
    "status",
    "hp",
    "pf",
    "eff",
    "lgVolts",
    "dropout",
    "nemaTyp",
    "limit",
    "limitedBy",
    "sftStTyp",
    "sftStR",
    "sftStX",
    "sftStTap",
    "sftStWdg",
    "lrPf",
    "lrMult"
})
public class Motor
    extends MspMotorGenerator
{

    protected BigInteger model;
    protected Integer status;
    protected Float hp;
    protected Float pf;
    protected Float eff;
    protected Float lgVolts;
    protected Float dropout;
    protected Long nemaTyp;
    protected Float limit;
    protected Long limitedBy;
    protected Long sftStTyp;
    protected Float sftStR;
    protected Float sftStX;
    protected Float sftStTap;
    protected Float sftStWdg;
    protected Float lrPf;
    protected Float lrMult;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModel(BigInteger value) {
        this.model = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHp(Float value) {
        this.hp = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPf() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPf(Float value) {
        this.pf = value;
    }

    /**
     * Gets the value of the eff property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEff() {
        return eff;
    }

    /**
     * Sets the value of the eff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEff(Float value) {
        this.eff = value;
    }

    /**
     * Gets the value of the lgVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLgVolts() {
        return lgVolts;
    }

    /**
     * Sets the value of the lgVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLgVolts(Float value) {
        this.lgVolts = value;
    }

    /**
     * Gets the value of the dropout property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDropout() {
        return dropout;
    }

    /**
     * Sets the value of the dropout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDropout(Float value) {
        this.dropout = value;
    }

    /**
     * Gets the value of the nemaTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNemaTyp() {
        return nemaTyp;
    }

    /**
     * Sets the value of the nemaTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNemaTyp(Long value) {
        this.nemaTyp = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLimit(Float value) {
        this.limit = value;
    }

    /**
     * Gets the value of the limitedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimitedBy() {
        return limitedBy;
    }

    /**
     * Sets the value of the limitedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimitedBy(Long value) {
        this.limitedBy = value;
    }

    /**
     * Gets the value of the sftStTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSftStTyp() {
        return sftStTyp;
    }

    /**
     * Sets the value of the sftStTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSftStTyp(Long value) {
        this.sftStTyp = value;
    }

    /**
     * Gets the value of the sftStR property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSftStR() {
        return sftStR;
    }

    /**
     * Sets the value of the sftStR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSftStR(Float value) {
        this.sftStR = value;
    }

    /**
     * Gets the value of the sftStX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSftStX() {
        return sftStX;
    }

    /**
     * Sets the value of the sftStX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSftStX(Float value) {
        this.sftStX = value;
    }

    /**
     * Gets the value of the sftStTap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSftStTap() {
        return sftStTap;
    }

    /**
     * Sets the value of the sftStTap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSftStTap(Float value) {
        this.sftStTap = value;
    }

    /**
     * Gets the value of the sftStWdg property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSftStWdg() {
        return sftStWdg;
    }

    /**
     * Sets the value of the sftStWdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSftStWdg(Float value) {
        this.sftStWdg = value;
    }

    /**
     * Gets the value of the lrPf property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLrPf() {
        return lrPf;
    }

    /**
     * Sets the value of the lrPf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLrPf(Float value) {
        this.lrPf = value;
    }

    /**
     * Gets the value of the lrMult property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLrMult() {
        return lrMult;
    }

    /**
     * Sets the value of the lrMult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLrMult(Float value) {
        this.lrMult = value;
    }

}
