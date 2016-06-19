
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shortCircuitAnalysisResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shortCircuitAnalysisResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspResultsBase">
 *       &lt;sequence>
 *         &lt;element name="faultZ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minLg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxLg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxLl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxLlg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxLllg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="posSeqR" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="posSeqX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="negSeqR" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="negSeqX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="zeroSeqR" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="zeroSeqX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "shortCircuitAnalysisResult", propOrder = {
    "faultZ",
    "minLg",
    "maxLg",
    "maxLl",
    "maxLlg",
    "maxLllg",
    "posSeqR",
    "posSeqX",
    "negSeqR",
    "negSeqX",
    "zeroSeqR",
    "zeroSeqX"
})
public class ShortCircuitAnalysisResult
    extends MspResultsBase
{

    protected Long faultZ;
    protected Long minLg;
    protected Long maxLg;
    protected Long maxLl;
    protected Long maxLlg;
    protected Long maxLllg;
    protected Float posSeqR;
    protected Float posSeqX;
    protected Float negSeqR;
    protected Float negSeqX;
    protected Float zeroSeqR;
    protected Float zeroSeqX;

    /**
     * Gets the value of the faultZ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFaultZ() {
        return faultZ;
    }

    /**
     * Sets the value of the faultZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFaultZ(Long value) {
        this.faultZ = value;
    }

    /**
     * Gets the value of the minLg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinLg() {
        return minLg;
    }

    /**
     * Sets the value of the minLg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinLg(Long value) {
        this.minLg = value;
    }

    /**
     * Gets the value of the maxLg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLg() {
        return maxLg;
    }

    /**
     * Sets the value of the maxLg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLg(Long value) {
        this.maxLg = value;
    }

    /**
     * Gets the value of the maxLl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLl() {
        return maxLl;
    }

    /**
     * Sets the value of the maxLl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLl(Long value) {
        this.maxLl = value;
    }

    /**
     * Gets the value of the maxLlg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLlg() {
        return maxLlg;
    }

    /**
     * Sets the value of the maxLlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLlg(Long value) {
        this.maxLlg = value;
    }

    /**
     * Gets the value of the maxLllg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLllg() {
        return maxLllg;
    }

    /**
     * Sets the value of the maxLllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLllg(Long value) {
        this.maxLllg = value;
    }

    /**
     * Gets the value of the posSeqR property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPosSeqR() {
        return posSeqR;
    }

    /**
     * Sets the value of the posSeqR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPosSeqR(Float value) {
        this.posSeqR = value;
    }

    /**
     * Gets the value of the posSeqX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPosSeqX() {
        return posSeqX;
    }

    /**
     * Sets the value of the posSeqX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPosSeqX(Float value) {
        this.posSeqX = value;
    }

    /**
     * Gets the value of the negSeqR property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNegSeqR() {
        return negSeqR;
    }

    /**
     * Sets the value of the negSeqR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNegSeqR(Float value) {
        this.negSeqR = value;
    }

    /**
     * Gets the value of the negSeqX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNegSeqX() {
        return negSeqX;
    }

    /**
     * Sets the value of the negSeqX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNegSeqX(Float value) {
        this.negSeqX = value;
    }

    /**
     * Gets the value of the zeroSeqR property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZeroSeqR() {
        return zeroSeqR;
    }

    /**
     * Sets the value of the zeroSeqR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZeroSeqR(Float value) {
        this.zeroSeqR = value;
    }

    /**
     * Gets the value of the zeroSeqX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZeroSeqX() {
        return zeroSeqX;
    }

    /**
     * Sets the value of the zeroSeqX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZeroSeqX(Float value) {
        this.zeroSeqX = value;
    }

}
