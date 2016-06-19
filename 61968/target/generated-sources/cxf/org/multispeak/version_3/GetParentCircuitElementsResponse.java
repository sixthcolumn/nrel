
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
 *         &lt;element name="GetParentCircuitElementsResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfCircuitElement" minOccurs="0"/>
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
    "getParentCircuitElementsResult"
})
@XmlRootElement(name = "GetParentCircuitElementsResponse")
public class GetParentCircuitElementsResponse {

    @XmlElement(name = "GetParentCircuitElementsResult")
    protected ArrayOfCircuitElement getParentCircuitElementsResult;

    /**
     * Gets the value of the getParentCircuitElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCircuitElement }
     *     
     */
    public ArrayOfCircuitElement getGetParentCircuitElementsResult() {
        return getParentCircuitElementsResult;
    }

    /**
     * Sets the value of the getParentCircuitElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCircuitElement }
     *     
     */
    public void setGetParentCircuitElementsResult(ArrayOfCircuitElement value) {
        this.getParentCircuitElementsResult = value;
    }

}
