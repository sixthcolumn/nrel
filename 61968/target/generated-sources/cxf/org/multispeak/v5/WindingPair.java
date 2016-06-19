
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ComplexImpedance;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * These are attributes of a transformer winding pair that are used in a transformer engineering equipment catalog entry.
 * 
 * <p>Java class for windingPair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="windingPair">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="firstWindingNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="secondWindingNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="loadLoss" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="positiveSeqImpedance" type="{http://www.multispeak.org/V5.0/commonTypes}complexImpedance" minOccurs="0"/>
 *         &lt;element name="zeroSeqImpedance" type="{http://www.multispeak.org/V5.0/commonTypes}complexImpedance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "windingPair", propOrder = {
    "firstWindingNumber",
    "secondWindingNumber",
    "loadLoss",
    "positiveSeqImpedance",
    "zeroSeqImpedance"
})
public class WindingPair
    extends MspExtensible
{

    protected BigInteger firstWindingNumber;
    protected BigInteger secondWindingNumber;
    protected RealPower loadLoss;
    protected ComplexImpedance positiveSeqImpedance;
    protected ComplexImpedance zeroSeqImpedance;

    /**
     * Gets the value of the firstWindingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstWindingNumber() {
        return firstWindingNumber;
    }

    /**
     * Sets the value of the firstWindingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstWindingNumber(BigInteger value) {
        this.firstWindingNumber = value;
    }

    /**
     * Gets the value of the secondWindingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondWindingNumber() {
        return secondWindingNumber;
    }

    /**
     * Sets the value of the secondWindingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondWindingNumber(BigInteger value) {
        this.secondWindingNumber = value;
    }

    /**
     * Gets the value of the loadLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getLoadLoss() {
        return loadLoss;
    }

    /**
     * Sets the value of the loadLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setLoadLoss(RealPower value) {
        this.loadLoss = value;
    }

    /**
     * Gets the value of the positiveSeqImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getPositiveSeqImpedance() {
        return positiveSeqImpedance;
    }

    /**
     * Sets the value of the positiveSeqImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setPositiveSeqImpedance(ComplexImpedance value) {
        this.positiveSeqImpedance = value;
    }

    /**
     * Gets the value of the zeroSeqImpedance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexImpedance }
     *     
     */
    public ComplexImpedance getZeroSeqImpedance() {
        return zeroSeqImpedance;
    }

    /**
     * Sets the value of the zeroSeqImpedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexImpedance }
     *     
     */
    public void setZeroSeqImpedance(ComplexImpedance value) {
        this.zeroSeqImpedance = value;
    }

}
