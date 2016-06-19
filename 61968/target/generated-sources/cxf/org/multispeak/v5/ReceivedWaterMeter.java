
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedWaterMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedWaterMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="waterNameplate" type="{http://www.multispeak.org/V5.0}waterNameplate" minOccurs="0"/>
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
@XmlType(name = "receivedWaterMeter", propOrder = {
    "waterNameplate"
})
public class ReceivedWaterMeter
    extends MspMeter
{

    protected WaterNameplate waterNameplate;

    /**
     * Gets the value of the waterNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link WaterNameplate }
     *     
     */
    public WaterNameplate getWaterNameplate() {
        return waterNameplate;
    }

    /**
     * Sets the value of the waterNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterNameplate }
     *     
     */
    public void setWaterNameplate(WaterNameplate value) {
        this.waterNameplate = value;
    }

}
