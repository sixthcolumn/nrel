
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTransformerBankByBankIDFromCBResult" type="{http://www.multispeak.org/Version_4.1_Release}transformerBank" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTransformerBankByBankIDFromCBResult"
})
@XmlRootElement(name = "GetTransformerBankByBankIDFromCBResponse")
public class GetTransformerBankByBankIDFromCBResponse {

    @XmlElement(name = "GetTransformerBankByBankIDFromCBResult")
    protected TransformerBank getTransformerBankByBankIDFromCBResult;

    /**
     * Gets the value of the getTransformerBankByBankIDFromCBResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerBank }
     *     
     */
    public TransformerBank getGetTransformerBankByBankIDFromCBResult() {
        return getTransformerBankByBankIDFromCBResult;
    }

    /**
     * Sets the value of the getTransformerBankByBankIDFromCBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerBank }
     *     
     */
    public void setGetTransformerBankByBankIDFromCBResult(TransformerBank value) {
        this.getTransformerBankByBankIDFromCBResult = value;
    }

}
