
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardIDChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardIDChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="creditCardData" type="{http://www.multispeak.org/V5.0}creditCardData"/>
 *         &lt;element name="authorizedCCData" type="{http://www.multispeak.org/V5.0}authorizedCCData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardIDChoice", propOrder = {
    "creditCardData",
    "authorizedCCData"
})
public class CardIDChoice {

    protected CreditCardData creditCardData;
    protected AuthorizedCCData authorizedCCData;

    /**
     * Gets the value of the creditCardData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardData }
     *     
     */
    public CreditCardData getCreditCardData() {
        return creditCardData;
    }

    /**
     * Sets the value of the creditCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardData }
     *     
     */
    public void setCreditCardData(CreditCardData value) {
        this.creditCardData = value;
    }

    /**
     * Gets the value of the authorizedCCData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedCCData }
     *     
     */
    public AuthorizedCCData getAuthorizedCCData() {
        return authorizedCCData;
    }

    /**
     * Sets the value of the authorizedCCData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedCCData }
     *     
     */
    public void setAuthorizedCCData(AuthorizedCCData value) {
        this.authorizedCCData = value;
    }

}
