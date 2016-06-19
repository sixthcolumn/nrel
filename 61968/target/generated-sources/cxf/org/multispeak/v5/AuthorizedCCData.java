
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This is used when the receiver is receiving a pre-authorized payment. This would be the case if approval had been received from a gateway (such as Heartland, authorized.net, etc.).
 * 
 * <p>Java class for authorizedCCData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizedCCData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="maskedCreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizedCCData", propOrder = {
    "maskedCreditCardNumber",
    "creditCardExpDate",
    "pnRef",
    "ccType"
})
public class AuthorizedCCData
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String maskedCreditCardNumber;
    protected String creditCardExpDate;
    @XmlElement(name = "PNRef")
    protected String pnRef;
    @XmlElement(name = "CCType")
    protected String ccType;

    /**
     * Gets the value of the maskedCreditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCreditCardNumber() {
        return maskedCreditCardNumber;
    }

    /**
     * Sets the value of the maskedCreditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCreditCardNumber(String value) {
        this.maskedCreditCardNumber = value;
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
     * Gets the value of the pnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRef() {
        return pnRef;
    }

    /**
     * Sets the value of the pnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRef(String value) {
        this.pnRef = value;
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
