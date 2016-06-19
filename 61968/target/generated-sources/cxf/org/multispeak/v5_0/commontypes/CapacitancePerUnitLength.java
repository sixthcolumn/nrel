
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.CapacitanceUnits;
import org.multispeak.v5_0.enumerations.LengthUnits;


/**
 * <p>Java class for capacitancePerUnitLength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitancePerUnitLength">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="capacitanceUnits" type="{http://www.multispeak.org/V5.0/enumerations}capacitanceUnits" />
 *       &lt;attribute name="lengthUnits" type="{http://www.multispeak.org/V5.0/enumerations}lengthUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capacitancePerUnitLength", propOrder = {
    "value"
})
public class CapacitancePerUnitLength {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "capacitanceUnits")
    protected CapacitanceUnits capacitanceUnits;
    @XmlAttribute(name = "lengthUnits")
    protected LengthUnits lengthUnits;

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
     * Gets the value of the capacitanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitanceUnits }
     *     
     */
    public CapacitanceUnits getCapacitanceUnits() {
        return capacitanceUnits;
    }

    /**
     * Sets the value of the capacitanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitanceUnits }
     *     
     */
    public void setCapacitanceUnits(CapacitanceUnits value) {
        this.capacitanceUnits = value;
    }

    /**
     * Gets the value of the lengthUnits property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnits }
     *     
     */
    public LengthUnits getLengthUnits() {
        return lengthUnits;
    }

    /**
     * Sets the value of the lengthUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnits }
     *     
     */
    public void setLengthUnits(LengthUnits value) {
        this.lengthUnits = value;
    }

}
