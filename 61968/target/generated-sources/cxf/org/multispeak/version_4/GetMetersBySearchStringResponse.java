
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
 *         &lt;element name="GetMetersBySearchStringResult" type="{http://www.multispeak.org/Version_4.1_Release}meters" minOccurs="0"/>
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
    "getMetersBySearchStringResult"
})
@XmlRootElement(name = "GetMetersBySearchStringResponse")
public class GetMetersBySearchStringResponse {

    @XmlElement(name = "GetMetersBySearchStringResult")
    protected Meters getMetersBySearchStringResult;

    /**
     * Gets the value of the getMetersBySearchStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link Meters }
     *     
     */
    public Meters getGetMetersBySearchStringResult() {
        return getMetersBySearchStringResult;
    }

    /**
     * Sets the value of the getMetersBySearchStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters }
     *     
     */
    public void setGetMetersBySearchStringResult(Meters value) {
        this.getMetersBySearchStringResult = value;
    }

}
