
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for y1Value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="y1Value">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="y1Units" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "y1Value", propOrder = {
    "value"
})
public class Y1Value {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "y1Units")
    protected String y1Units;

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
     * Gets the value of the y1Units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY1Units() {
        return y1Units;
    }

    /**
     * Sets the value of the y1Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY1Units(String value) {
        this.y1Units = value;
    }

}
