
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for gasPressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasPressure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="maxPressureUOM" type="{http://www.multispeak.org/Version_4.1_Release}pressureUnits" />
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
