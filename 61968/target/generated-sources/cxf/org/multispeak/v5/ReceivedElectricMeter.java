
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedElectricMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedElectricMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="electricNameplate" type="{http://www.multispeak.org/V5.0}electricNameplate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivedElectricMeter", propOrder = {
    "electricNameplate"
})
public class ReceivedElectricMeter
    extends MspMeter
{

    protected ElectricNameplate electricNameplate;

    /**
     * Gets the value of the electricNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricNameplate }
     *     
     */
    public ElectricNameplate getElectricNameplate() {
        return electricNameplate;
    }

    /**
     * Sets the value of the electricNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricNameplate }
     *     
     */
    public void setElectricNameplate(ElectricNameplate value) {
        this.electricNameplate = value;
    }

}
