
package org.multispeak.version_3;

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
 *         &lt;element name="GetModifiedCircuitElementsResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfCircuitElement" minOccurs="0"/>
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
    "getModifiedCircuitElementsResult"
})
@XmlRootElement(name = "GetModifiedCircuitElementsResponse")
public class GetModifiedCircuitElementsResponse {

    @XmlElement(name = "GetModifiedCircuitElementsResult")
    protected ArrayOfCircuitElement getModifiedCircuitElementsResult;

    /**
     * Gets the value of the getModifiedCircuitElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCircuitElement }
     *     
     */
    public ArrayOfCircuitElement getGetModifiedCircuitElementsResult() {
        return getModifiedCircuitElementsResult;
    }

    /**
     * Sets the value of the getModifiedCircuitElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCircuitElement }
     *     
     */
    public void setGetModifiedCircuitElementsResult(ArrayOfCircuitElement value) {
        this.getModifiedCircuitElementsResult = value;
    }

}
