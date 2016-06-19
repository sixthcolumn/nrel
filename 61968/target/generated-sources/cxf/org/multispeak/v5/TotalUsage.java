
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is the commodity usage for the period of interest, to be displayed to the customer on his premises display device.  The usage numeric value should be within the totalUsage tag set and the units in which the usage is displayed should be chosen enumerated list and displayed in the "units" attribute.  Should no acceptable value be listed in the enumerated list, the "otherUnits" attribute can carry the necessary string describing the units. 
 * 
 * <p>Java class for totalUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="totalUsage">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="units" use="required" type="{http://www.multispeak.org/V5.0/enumerations}uomKind" />
 *       &lt;attribute name="otherUnits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalUsage", propOrder = {
    "value"
})
public class TotalUsage {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "units", required = true)
    protected String units;
    @XmlAttribute(name = "otherUnits")
    protected String otherUnits;

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
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the otherUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherUnits() {
        return otherUnits;
    }

    /**
     * Sets the value of the otherUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherUnits(String value) {
        this.otherUnits = value;
    }

}
