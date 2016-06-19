
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The data value of the second Y-axis variable (if present), depending on the Y-axis units
 * 
 * <p>Java class for y2Value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="y2Value">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="y2Units" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "y2Value", propOrder = {
    "value"
})
public class Y2Value {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "y2Units")
    protected String y2Units;

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
     * Gets the value of the y2Units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY2Units() {
        return y2Units;
    }

    /**
     * Sets the value of the y2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY2Units(String value) {
        this.y2Units = value;
    }

}
