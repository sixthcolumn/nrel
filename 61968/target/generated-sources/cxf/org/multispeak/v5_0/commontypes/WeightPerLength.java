
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.LengthUnits;
import org.multispeak.v5_0.enumerations.WeightUnits;


/**
 * <p>Java class for weightPerLength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weightPerLength">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="weightUnits" type="{http://www.multispeak.org/V5.0/enumerations}weightUnits" />
 *       &lt;attribute name="lengthUnits" type="{http://www.multispeak.org/V5.0/enumerations}lengthUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weightPerLength", propOrder = {
    "value"
})
public class WeightPerLength {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "weightUnits")
    protected WeightUnits weightUnits;
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
     * Gets the value of the weightUnits property.
     * 
     * @return
     *     possible object is
     *     {@link WeightUnits }
     *     
     */
    public WeightUnits getWeightUnits() {
        return weightUnits;
    }

    /**
     * Sets the value of the weightUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnits }
     *     
     */
    public void setWeightUnits(WeightUnits value) {
        this.weightUnits = value;
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
