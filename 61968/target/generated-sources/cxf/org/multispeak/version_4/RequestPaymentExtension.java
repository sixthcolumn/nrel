
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="extensionList" type="{http://www.multispeak.org/Version_4.1_Release}paymentExtensionList" minOccurs="0"/>
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
    "extensionList"
})
@XmlRootElement(name = "RequestPaymentExtension")
public class RequestPaymentExtension {

    protected PaymentExtensionList extensionList;

    /**
     * Gets the value of the extensionList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentExtensionList }
     *     
     */
    public PaymentExtensionList getExtensionList() {
        return extensionList;
    }

    /**
     * Sets the value of the extensionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentExtensionList }
     *     
     */
    public void setExtensionList(PaymentExtensionList value) {
        this.extensionList = value;
    }

}
