
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.Uom;


/**
 * A price tier represents the cost of energy consumption.
 * 
 * <p>Java class for priceTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priceTier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="rateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rateLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.multispeak.org/V5.0/enumerations}uom" minOccurs="0"/>
 *         &lt;element name="register" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceTier", propOrder = {
    "rateIdentifier",
    "rateLabel",
    "price",
    "units",
    "register"
})
public class PriceTier
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String rateIdentifier;
    protected String rateLabel;
    protected Money price;
    protected Uom units;
    protected BigInteger register;

    /**
     * Gets the value of the rateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateIdentifier() {
        return rateIdentifier;
    }

    /**
     * Sets the value of the rateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateIdentifier(String value) {
        this.rateIdentifier = value;
    }

    /**
     * Gets the value of the rateLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateLabel() {
        return rateLabel;
    }

    /**
     * Sets the value of the rateLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateLabel(String value) {
        this.rateLabel = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
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
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegister(BigInteger value) {
        this.register = value;
    }

}
