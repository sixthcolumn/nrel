
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for associatedMeters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="associatedMeters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;choice>
 *         &lt;element name="existingMeter" type="{http://www.multispeak.org/V5.0}existingMeter"/>
 *         &lt;element name="meterExchange" type="{http://www.multispeak.org/V5.0}meterExchange"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "associatedMeters", propOrder = {
    "existingMeter",
    "meterExchange"
})
public class AssociatedMeters
    extends MspExtensible
{

    protected ExistingMeter existingMeter;
    protected MeterExchange meterExchange;

    /**
     * Gets the value of the existingMeter property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingMeter }
     *     
     */
    public ExistingMeter getExistingMeter() {
        return existingMeter;
    }

    /**
     * Sets the value of the existingMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingMeter }
     *     
     */
    public void setExistingMeter(ExistingMeter value) {
        this.existingMeter = value;
    }

    /**
     * Gets the value of the meterExchange property.
     * 
     * @return
     *     possible object is
     *     {@link MeterExchange }
     *     
     */
    public MeterExchange getMeterExchange() {
        return meterExchange;
    }

    /**
     * Sets the value of the meterExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterExchange }
     *     
     */
    public void setMeterExchange(MeterExchange value) {
        this.meterExchange = value;
    }

}
