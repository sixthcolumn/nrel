
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The means by which payment will be made.
 * 
 * <p>Java class for paymentMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="checkOption" type="{http://www.multispeak.org/V5.0}checkOption"/>
 *         &lt;element name="creditCardOption" type="{http://www.multispeak.org/V5.0}creditCardOption"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentMode", propOrder = {
    "checkOption",
    "creditCardOption"
})
public class PaymentMode {

    protected CheckOption checkOption;
    protected CreditCardOption creditCardOption;

    /**
     * Gets the value of the checkOption property.
     * 
     * @return
     *     possible object is
     *     {@link CheckOption }
     *     
     */
    public CheckOption getCheckOption() {
        return checkOption;
    }

    /**
     * Sets the value of the checkOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckOption }
     *     
     */
    public void setCheckOption(CheckOption value) {
        this.checkOption = value;
    }

    /**
     * Gets the value of the creditCardOption property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardOption }
     *     
     */
    public CreditCardOption getCreditCardOption() {
        return creditCardOption;
    }

    /**
     * Sets the value of the creditCardOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardOption }
     *     
     */
    public void setCreditCardOption(CreditCardOption value) {
        this.creditCardOption = value;
    }

}
