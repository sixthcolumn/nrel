
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
 *         &lt;element name="GetAllAccountsResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAccount1" minOccurs="0"/>
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
    "getAllAccountsResult"
})
@XmlRootElement(name = "GetAllAccountsResponse")
public class GetAllAccountsResponse {

    @XmlElement(name = "GetAllAccountsResult")
    protected ArrayOfAccount1 getAllAccountsResult;

    /**
     * Gets the value of the getAllAccountsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccount1 }
     *     
     */
    public ArrayOfAccount1 getGetAllAccountsResult() {
        return getAllAccountsResult;
    }

    /**
     * Sets the value of the getAllAccountsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccount1 }
     *     
     */
    public void setGetAllAccountsResult(ArrayOfAccount1 value) {
        this.getAllAccountsResult = value;
    }

}
