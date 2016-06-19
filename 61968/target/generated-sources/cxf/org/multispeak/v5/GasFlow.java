
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Maximum design flow rate.
 * 
 * <p>Java class for gasFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasFlow">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="maxFlowRateUOM" type="{http://www.multispeak.org/V5.0/enumerations}uomKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gasFlow", propOrder = {
    "value"
})
public class GasFlow {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "maxFlowRateUOM")
    protected String maxFlowRateUOM;

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
     * Gets the value of the maxFlowRateUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFlowRateUOM() {
        return maxFlowRateUOM;
    }

    /**
     * Sets the value of the maxFlowRateUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFlowRateUOM(String value) {
        this.maxFlowRateUOM = value;
    }

}
