
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
 *         &lt;element name="GetTransformerBankByUnitIDFromCBResult" type="{http://www.multispeak.org/Version_4.1_Release}transformerBank" minOccurs="0"/>
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
    "getTransformerBankByUnitIDFromCBResult"
})
@XmlRootElement(name = "GetTransformerBankByUnitIDFromCBResponse")
public class GetTransformerBankByUnitIDFromCBResponse {

    @XmlElement(name = "GetTransformerBankByUnitIDFromCBResult")
    protected TransformerBank getTransformerBankByUnitIDFromCBResult;

    /**
     * Gets the value of the getTransformerBankByUnitIDFromCBResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerBank }
     *     
     */
    public TransformerBank getGetTransformerBankByUnitIDFromCBResult() {
        return getTransformerBankByUnitIDFromCBResult;
    }

    /**
     * Sets the value of the getTransformerBankByUnitIDFromCBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerBank }
     *     
     */
    public void setGetTransformerBankByUnitIDFromCBResult(TransformerBank value) {
        this.getTransformerBankByUnitIDFromCBResult = value;
    }

}
