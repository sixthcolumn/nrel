
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.PressureUnits;


/**
 * Maximum design pressure of meter.
 * 
 * <p>Java class for gasPressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasPressure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="maxPressureUOM" type="{http://www.multispeak.org/V5.0/enumerations}pressureUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gasPressure", propOrder = {
    "value"
})
public class GasPressure {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "maxPressureUOM")
    protected PressureUnits maxPressureUOM;

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the maxPressureUOM property.
     * 
     * @return
     *     possible object is
     *     {@link PressureUnits }
     *     
     */
    public PressureUnits getMaxPressureUOM() {
        return maxPressureUOM;
    }

    /**
     * Sets the value of the maxPressureUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureUnits }
     *     
     */
    public void setMaxPressureUOM(PressureUnits value) {
        this.maxPressureUOM = value;
    }

}
