
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
 *         &lt;element name="GetAccountsByCustomerIDResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAccount1" minOccurs="0"/>
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
    "getAccountsByCustomerIDResult"
})
@XmlRootElement(name = "GetAccountsByCustomerIDResponse")
public class GetAccountsByCustomerIDResponse {

    @XmlElement(name = "GetAccountsByCustomerIDResult")
    protected ArrayOfAccount1 getAccountsByCustomerIDResult;

    /**
     * Gets the value of the getAccountsByCustomerIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccount1 }
     *     
     */
    public ArrayOfAccount1 getGetAccountsByCustomerIDResult() {
        return getAccountsByCustomerIDResult;
    }

    /**
     * Sets the value of the getAccountsByCustomerIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccount1 }
     *     
     */
    public void setGetAccountsByCustomerIDResult(ArrayOfAccount1 value) {
        this.getAccountsByCustomerIDResult = value;
    }

}
