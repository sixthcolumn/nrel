
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
 *         &lt;element name="GetAllPolesFromCBResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPole" minOccurs="0"/>
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
    "getAllPolesFromCBResult"
})
@XmlRootElement(name = "GetAllPolesFromCBResponse")
public class GetAllPolesFromCBResponse {

    @XmlElement(name = "GetAllPolesFromCBResult")
    protected ArrayOfPole getAllPolesFromCBResult;

    /**
     * Gets the value of the getAllPolesFromCBResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPole }
     *     
     */
    public ArrayOfPole getGetAllPolesFromCBResult() {
        return getAllPolesFromCBResult;
    }

    /**
     * Sets the value of the getAllPolesFromCBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPole }
     *     
     */
    public void setGetAllPolesFromCBResult(ArrayOfPole value) {
        this.getAllPolesFromCBResult = value;
    }

}
