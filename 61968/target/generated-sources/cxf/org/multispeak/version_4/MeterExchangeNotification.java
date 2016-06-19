
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="meterChangeout" type="{http://www.multispeak.org/Version_4.1_Release}meterExchanges" minOccurs="0"/>
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
    "meterChangeout"
})
@XmlRootElement(name = "MeterExchangeNotification")
public class MeterExchangeNotification {

    protected MeterExchanges meterChangeout;

    /**
     * Gets the value of the meterChangeout property.
     * 
     * @return
     *     possible object is
     *     {@link MeterExchanges }
     *     
     */
    public MeterExchanges getMeterChangeout() {
        return meterChangeout;
    }

    /**
     * Sets the value of the meterChangeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterExchanges }
     *     
     */
    public void setMeterChangeout(MeterExchanges value) {
        this.meterChangeout = value;
    }

}
