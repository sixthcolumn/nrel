
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
 *         &lt;element name="GetMetersByAccountNumberAndServiceTypeResult" type="{http://www.multispeak.org/Version_4.1_Release}meters" minOccurs="0"/>
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
    "getMetersByAccountNumberAndServiceTypeResult"
})
@XmlRootElement(name = "GetMetersByAccountNumberAndServiceTypeResponse")
public class GetMetersByAccountNumberAndServiceTypeResponse {

    @XmlElement(name = "GetMetersByAccountNumberAndServiceTypeResult")
    protected Meters getMetersByAccountNumberAndServiceTypeResult;

    /**
     * Gets the value of the getMetersByAccountNumberAndServiceTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Meters }
     *     
     */
    public Meters getGetMetersByAccountNumberAndServiceTypeResult() {
        return getMetersByAccountNumberAndServiceTypeResult;
    }

    /**
     * Sets the value of the getMetersByAccountNumberAndServiceTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters }
     *     
     */
    public void setGetMetersByAccountNumberAndServiceTypeResult(Meters value) {
        this.getMetersByAccountNumberAndServiceTypeResult = value;
    }

}
