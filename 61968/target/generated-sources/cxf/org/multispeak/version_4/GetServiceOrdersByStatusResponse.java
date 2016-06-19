
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
 *         &lt;element name="GetServiceOrdersByStatusResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfServiceOrder1" minOccurs="0"/>
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
    "getServiceOrdersByStatusResult"
})
@XmlRootElement(name = "GetServiceOrdersByStatusResponse")
public class GetServiceOrdersByStatusResponse {

    @XmlElement(name = "GetServiceOrdersByStatusResult")
    protected ArrayOfServiceOrder1 getServiceOrdersByStatusResult;

    /**
     * Gets the value of the getServiceOrdersByStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceOrder1 }
     *     
     */
    public ArrayOfServiceOrder1 getGetServiceOrdersByStatusResult() {
        return getServiceOrdersByStatusResult;
    }

    /**
     * Sets the value of the getServiceOrdersByStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceOrder1 }
     *     
     */
    public void setGetServiceOrdersByStatusResult(ArrayOfServiceOrder1 value) {
        this.getServiceOrdersByStatusResult = value;
    }

}
