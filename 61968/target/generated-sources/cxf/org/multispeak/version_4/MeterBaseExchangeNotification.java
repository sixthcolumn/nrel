
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
 *         &lt;element name="MBChangeout" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterBaseExchange" minOccurs="0"/>
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
    "mbChangeout"
})
@XmlRootElement(name = "MeterBaseExchangeNotification")
public class MeterBaseExchangeNotification {

    @XmlElement(name = "MBChangeout")
    protected ArrayOfMeterBaseExchange mbChangeout;

    /**
     * Gets the value of the mbChangeout property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterBaseExchange }
     *     
     */
    public ArrayOfMeterBaseExchange getMBChangeout() {
        return mbChangeout;
    }

    /**
     * Sets the value of the mbChangeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterBaseExchange }
     *     
     */
    public void setMBChangeout(ArrayOfMeterBaseExchange value) {
        this.mbChangeout = value;
    }

}
