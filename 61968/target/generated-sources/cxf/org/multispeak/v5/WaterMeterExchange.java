
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waterMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeterExchange">
 *       &lt;sequence>
 *         &lt;element name="existingMeter" type="{http://www.multispeak.org/V5.0}waterMeter" minOccurs="0"/>
 *         &lt;element name="replacementMeter" type="{http://www.multispeak.org/V5.0}waterMeter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waterMeterExchange", propOrder = {
    "existingMeter",
    "replacementMeter"
})
public class WaterMeterExchange
    extends MspMeterExchange
{

    protected WaterMeter existingMeter;
    protected WaterMeter replacementMeter;

    /**
     * Gets the value of the existingMeter property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeter }
     *     
     */
    public WaterMeter getExistingMeter() {
        return existingMeter;
    }

    /**
     * Sets the value of the existingMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeter }
     *     
     */
    public void setExistingMeter(WaterMeter value) {
        this.existingMeter = value;
    }

    /**
     * Gets the value of the replacementMeter property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeter }
     *     
     */
    public WaterMeter getReplacementMeter() {
        return replacementMeter;
    }

    /**
     * Sets the value of the replacementMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeter }
     *     
     */
    public void setReplacementMeter(WaterMeter value) {
        this.replacementMeter = value;
    }

}
