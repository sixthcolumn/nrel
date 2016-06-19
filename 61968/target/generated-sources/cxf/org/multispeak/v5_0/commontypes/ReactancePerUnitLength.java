
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.LengthUnits;
import org.multispeak.v5_0.enumerations.ZUnits;


/**
 * <p>Java class for reactancePerUnitLength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reactancePerUnitLength">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="reactanceUnits" type="{http://www.multispeak.org/V5.0/enumerations}zUnits" />
 *       &lt;attribute name="lengthUnits" type="{http://www.multispeak.org/V5.0/enumerations}lengthUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reactancePerUnitLength", propOrder = {
    "value"
})
public class ReactancePerUnitLength {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "reactanceUnits")
    protected ZUnits reactanceUnits;
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
     * Gets the value of the reactanceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ZUnits }
     *     
     */
    public ZUnits getReactanceUnits() {
        return reactanceUnits;
    }

    /**
     * Sets the value of the reactanceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZUnits }
     *     
     */
    public void setReactanceUnits(ZUnits value) {
        this.reactanceUnits = value;
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
