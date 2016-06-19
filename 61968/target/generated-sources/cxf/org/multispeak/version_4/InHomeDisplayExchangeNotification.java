
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
 *         &lt;element name="IHDChangeout" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfInHomeDisplayExchange" minOccurs="0"/>
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
    "ihdChangeout"
})
@XmlRootElement(name = "InHomeDisplayExchangeNotification")
public class InHomeDisplayExchangeNotification {

    @XmlElement(name = "IHDChangeout")
    protected ArrayOfInHomeDisplayExchange ihdChangeout;

    /**
     * Gets the value of the ihdChangeout property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInHomeDisplayExchange }
     *     
     */
    public ArrayOfInHomeDisplayExchange getIHDChangeout() {
        return ihdChangeout;
    }

    /**
     * Sets the value of the ihdChangeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInHomeDisplayExchange }
     *     
     */
    public void setIHDChangeout(ArrayOfInHomeDisplayExchange value) {
        this.ihdChangeout = value;
    }

}
