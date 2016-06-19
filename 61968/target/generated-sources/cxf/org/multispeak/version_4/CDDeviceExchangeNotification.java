
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
 *         &lt;element name="CDDChangeout" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCDDeviceExchange" minOccurs="0"/>
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
    "cddChangeout"
})
@XmlRootElement(name = "CDDeviceExchangeNotification")
public class CDDeviceExchangeNotification {

    @XmlElement(name = "CDDChangeout")
    protected ArrayOfCDDeviceExchange cddChangeout;

    /**
     * Gets the value of the cddChangeout property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCDDeviceExchange }
     *     
     */
    public ArrayOfCDDeviceExchange getCDDChangeout() {
        return cddChangeout;
    }

    /**
     * Sets the value of the cddChangeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCDDeviceExchange }
     *     
     */
    public void setCDDChangeout(ArrayOfCDDeviceExchange value) {
        this.cddChangeout = value;
    }

}
