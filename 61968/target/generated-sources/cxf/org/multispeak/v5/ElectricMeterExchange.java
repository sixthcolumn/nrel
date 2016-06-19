
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeterExchange">
 *       &lt;sequence>
 *         &lt;element name="existingMeter" type="{http://www.multispeak.org/V5.0}electricMeter" minOccurs="0"/>
 *         &lt;element name="replacementMeter" type="{http://www.multispeak.org/V5.0}electricMeter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricMeterExchange", propOrder = {
    "existingMeter",
    "replacementMeter"
})
public class ElectricMeterExchange
    extends MspMeterExchange
{

    protected ElectricMeter existingMeter;
    protected ElectricMeter replacementMeter;

    /**
     * Gets the value of the existingMeter property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeter }
     *     
     */
    public ElectricMeter getExistingMeter() {
        return existingMeter;
    }

    /**
     * Sets the value of the existingMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeter }
     *     
     */
    public void setExistingMeter(ElectricMeter value) {
        this.existingMeter = value;
    }

    /**
     * Gets the value of the replacementMeter property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeter }
     *     
     */
    public ElectricMeter getReplacementMeter() {
        return replacementMeter;
    }

    /**
     * Sets the value of the replacementMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeter }
     *     
     */
    public void setReplacementMeter(ElectricMeter value) {
        this.replacementMeter = value;
    }

}
