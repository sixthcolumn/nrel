
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This is a tariff component that charges for a commodity based on the amount of usage during a billing period.  This is sometimes called a block in a block rate.
 * 
 * <p>Java class for consumptionTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consumptionTier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="tierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tierSize" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="charge" type="{http://www.multispeak.org/V5.0}charge"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consumptionTier", propOrder = {
    "tierIdentifier",
    "tierSize",
    "charge"
})
public class ConsumptionTier
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String tierIdentifier;
    @XmlElement(required = true)
    protected BigInteger tierSize;
    @XmlElement(required = true)
    protected Charge charge;
    @XmlAttribute(name = "sequenceNumber")
    protected BigInteger sequenceNumber;

    /**
     * Gets the value of the tierIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierIdentifier() {
        return tierIdentifier;
    }

    /**
     * Sets the value of the tierIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierIdentifier(String value) {
        this.tierIdentifier = value;
    }

    /**
     * Gets the value of the tierSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTierSize() {
        return tierSize;
    }

    /**
     * Sets the value of the tierSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTierSize(BigInteger value) {
        this.tierSize = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link Charge }
     *     
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge }
     *     
     */
    public void setCharge(Charge value) {
        this.charge = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

}
