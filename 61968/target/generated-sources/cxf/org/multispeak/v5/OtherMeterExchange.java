
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMeterExchange">
 *       &lt;sequence>
 *         &lt;element name="existingMeter" type="{http://www.multispeak.org/V5.0}otherMeter" minOccurs="0"/>
 *         &lt;element name="replacementMeter" type="{http://www.multispeak.org/V5.0}otherMeter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherMeterExchange", propOrder = {
    "existingMeter",
    "replacementMeter"
})
public class OtherMeterExchange
    extends MspMeterExchange
{

    protected OtherMeter existingMeter;
    protected OtherMeter replacementMeter;

    /**
     * Gets the value of the existingMeter property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeter }
     *     
     */
    public OtherMeter getExistingMeter() {
        return existingMeter;
    }

    /**
     * Sets the value of the existingMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeter }
     *     
     */
    public void setExistingMeter(OtherMeter value) {
        this.existingMeter = value;
    }

    /**
     * Gets the value of the replacementMeter property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeter }
     *     
     */
    public OtherMeter getReplacementMeter() {
        return replacementMeter;
    }

    /**
     * Sets the value of the replacementMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeter }
     *     
     */
    public void setReplacementMeter(OtherMeter value) {
        this.replacementMeter = value;
    }

}
