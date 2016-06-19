
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
 *         &lt;element name="GetServiceLocationIDByMeterResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getServiceLocationIDByMeterResult"
})
@XmlRootElement(name = "GetServiceLocationIDByMeterResponse")
public class GetServiceLocationIDByMeterResponse {

    @XmlElement(name = "GetServiceLocationIDByMeterResult")
    protected String getServiceLocationIDByMeterResult;

    /**
     * Gets the value of the getServiceLocationIDByMeterResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetServiceLocationIDByMeterResult() {
        return getServiceLocationIDByMeterResult;
    }

    /**
     * Sets the value of the getServiceLocationIDByMeterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetServiceLocationIDByMeterResult(String value) {
        this.getServiceLocationIDByMeterResult = value;
    }

}
