
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
 *         &lt;element name="GetAllCustomersByServiceTypeResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCustomer" minOccurs="0"/>
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
    "getAllCustomersByServiceTypeResult"
})
@XmlRootElement(name = "GetAllCustomersByServiceTypeResponse")
public class GetAllCustomersByServiceTypeResponse {

    @XmlElement(name = "GetAllCustomersByServiceTypeResult")
    protected ArrayOfCustomer getAllCustomersByServiceTypeResult;

    /**
     * Gets the value of the getAllCustomersByServiceTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public ArrayOfCustomer getGetAllCustomersByServiceTypeResult() {
        return getAllCustomersByServiceTypeResult;
    }

    /**
     * Sets the value of the getAllCustomersByServiceTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public void setGetAllCustomersByServiceTypeResult(ArrayOfCustomer value) {
        this.getAllCustomersByServiceTypeResult = value;
    }

}
