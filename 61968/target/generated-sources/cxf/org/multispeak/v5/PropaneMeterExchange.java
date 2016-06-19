
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propaneMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propaneMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeterExchange">
 *       &lt;sequence>
 *         &lt;element name="existingMeter" type="{http://www.multispeak.org/V5.0}propaneMeter" minOccurs="0"/>
 *         &lt;element name="replacementMeter" type="{http://www.multispeak.org/V5.0}propaneMeter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propaneMeterExchange", propOrder = {
    "existingMeter",
    "replacementMeter"
})
public class PropaneMeterExchange
    extends MspMeterExchange
{

    protected PropaneMeter existingMeter;
    protected PropaneMeter replacementMeter;

    /**
     * Gets the value of the existingMeter property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeter }
     *     
     */
    public PropaneMeter getExistingMeter() {
        return existingMeter;
    }

    /**
     * Sets the value of the existingMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeter }
     *     
     */
    public void setExistingMeter(PropaneMeter value) {
        this.existingMeter = value;
    }

    /**
     * Gets the value of the replacementMeter property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeter }
     *     
     */
    public PropaneMeter getReplacementMeter() {
        return replacementMeter;
    }

    /**
     * Sets the value of the replacementMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeter }
     *     
     */
    public void setReplacementMeter(PropaneMeter value) {
        this.replacementMeter = value;
    }

}
