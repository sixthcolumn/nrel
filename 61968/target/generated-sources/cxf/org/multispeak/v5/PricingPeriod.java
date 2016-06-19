
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * <p>Java class for pricingPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pricingPeriod">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="charges" type="{http://www.multispeak.org/V5.0}charges"/>
 *         &lt;element name="timePeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricingPeriod", propOrder = {
    "charges",
    "timePeriod"
})
public class PricingPeriod
    extends MspExtensible
{

    @XmlElement(required = true)
    protected Charges charges;
    @XmlElement(required = true)
    protected TimePeriod timePeriod;

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link Charges }
     *     
     */
    public Charges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges }
     *     
     */
    public void setCharges(Charges value) {
        this.charges = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setTimePeriod(TimePeriod value) {
        this.timePeriod = value;
    }

}
