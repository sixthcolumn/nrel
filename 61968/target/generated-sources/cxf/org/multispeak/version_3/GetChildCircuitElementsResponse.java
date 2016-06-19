
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
 *         &lt;element name="GetChildCircuitElementsResult" type="{http://www.multispeak.org/Version_3.0}ArrayOfCircuitElement" minOccurs="0"/>
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
    "getChildCircuitElementsResult"
})
@XmlRootElement(name = "GetChildCircuitElementsResponse")
public class GetChildCircuitElementsResponse {

    @XmlElement(name = "GetChildCircuitElementsResult")
    protected ArrayOfCircuitElement getChildCircuitElementsResult;

    /**
     * Gets the value of the getChildCircuitElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCircuitElement }
     *     
     */
    public ArrayOfCircuitElement getGetChildCircuitElementsResult() {
        return getChildCircuitElementsResult;
    }

    /**
     * Sets the value of the getChildCircuitElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCircuitElement }
     *     
     */
    public void setGetChildCircuitElementsResult(ArrayOfCircuitElement value) {
        this.getChildCircuitElementsResult = value;
    }

}
