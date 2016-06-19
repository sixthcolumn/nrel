
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
 *         &lt;element name="GetPoleByPoleNumberFromCBResult" type="{http://www.multispeak.org/Version_4.1_Release}pole" minOccurs="0"/>
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
    "getPoleByPoleNumberFromCBResult"
})
@XmlRootElement(name = "GetPoleByPoleNumberFromCBResponse")
public class GetPoleByPoleNumberFromCBResponse {

    @XmlElement(name = "GetPoleByPoleNumberFromCBResult")
    protected Pole getPoleByPoleNumberFromCBResult;

    /**
     * Gets the value of the getPoleByPoleNumberFromCBResult property.
     * 
     * @return
     *     possible object is
     *     {@link Pole }
     *     
     */
    public Pole getGetPoleByPoleNumberFromCBResult() {
        return getPoleByPoleNumberFromCBResult;
    }

    /**
     * Sets the value of the getPoleByPoleNumberFromCBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pole }
     *     
     */
    public void setGetPoleByPoleNumberFromCBResult(Pole value) {
        this.getPoleByPoleNumberFromCBResult = value;
    }

}
