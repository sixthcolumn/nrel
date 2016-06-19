
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.ResponseCodeKind;


/**
 * <p>Java class for convenienceFeeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convenienceFeeItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="convenienceFee" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="utilityFee" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.multispeak.org/V5.0/enumerations}responseCodeKind" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convenienceFeeItem", propOrder = {
    "transactionID",
    "convenienceFee",
    "utilityFee",
    "responseCode"
})
public class ConvenienceFeeItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String transactionID;
    protected Money convenienceFee;
    protected Money utilityFee;
    protected ResponseCodeKind responseCode;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the convenienceFee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getConvenienceFee() {
        return convenienceFee;
    }

    /**
     * Sets the value of the convenienceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setConvenienceFee(Money value) {
        this.convenienceFee = value;
    }

    /**
     * Gets the value of the utilityFee property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUtilityFee() {
        return utilityFee;
    }

    /**
     * Sets the value of the utilityFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUtilityFee(Money value) {
        this.utilityFee = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeKind }
     *     
     */
    public ResponseCodeKind getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeKind }
     *     
     */
    public void setResponseCode(ResponseCodeKind value) {
        this.responseCode = value;
    }

}
