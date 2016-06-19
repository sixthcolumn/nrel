
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.PressureUnits;


/**
 * <p>Java class for pressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pressure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="units" type="{http://www.multispeak.org/V5.0/enumerations}pressureUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pressure", propOrder = {
    "value"
})
public class Pressure {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "units")
    protected PressureUnits units;

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
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link PressureUnits }
     *     
     */
    public PressureUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureUnits }
     *     
     */
    public void setUnits(PressureUnits value) {
        this.units = value;
    }

}
