
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This is typically used when the receiver is authorizing the payment.  The approval will come from the gateway that the receiver uses to authorize the payment. Examples include Authorize.net, Heartland, etc.
 * 
 * <p>Java class for creditCardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCardData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardExpDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardVerificationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardData", propOrder = {
    "creditCardNumber",
    "creditCardExpDate",
    "cardVerificationValue",
    "ccType"
})
public class CreditCardData
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String creditCardNumber;
    @XmlElement(required = true)
    protected String creditCardExpDate;
    protected String cardVerificationValue;
    @XmlElement(name = "CCType", required = true)
    protected String ccType;

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpDate() {
        return creditCardExpDate;
    }

    /**
     * Sets the value of the creditCardExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpDate(String value) {
        this.creditCardExpDate = value;
    }

    /**
     * Gets the value of the cardVerificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerificationValue() {
        return cardVerificationValue;
    }

    /**
     * Sets the value of the cardVerificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerificationValue(String value) {
        this.cardVerificationValue = value;
    }

    /**
     * Gets the value of the ccType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCType() {
        return ccType;
    }

    /**
     * Sets the value of the ccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCType(String value) {
        this.ccType = value;
    }

}
