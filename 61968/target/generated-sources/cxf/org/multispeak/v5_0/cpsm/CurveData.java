
package org.multispeak.v5_0.cpsm;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The curveData class is used to represent points for various curves.  The curves defined in the CPSM profile are "GrossToNetActivePowerCurve" and "ReactiveCapabilityCurve".
 * 
 * <p>Java class for CurveData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurveData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xValue" type="{http://www.multispeak.org/V5.0/cpsm}xValue" minOccurs="0"/>
 *         &lt;element name="y1Value" type="{http://www.multispeak.org/V5.0/cpsm}y1Value" minOccurs="0"/>
 *         &lt;element name="y2Value" type="{http://www.multispeak.org/V5.0/cpsm}y2Value" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveData", propOrder = {
    "xValue",
    "y1Value",
    "y2Value"
})
public class CurveData {

    protected XValue xValue;
    protected Y1Value y1Value;
    protected Y2Value y2Value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the xValue property.
     * 
     * @return
     *     possible object is
     *     {@link XValue }
     *     
     */
    public XValue getXValue() {
        return xValue;
    }

    /**
     * Sets the value of the xValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XValue }
     *     
     */
    public void setXValue(XValue value) {
        this.xValue = value;
    }

    /**
     * Gets the value of the y1Value property.
     * 
     * @return
     *     possible object is
     *     {@link Y1Value }
     *     
     */
    public Y1Value getY1Value() {
        return y1Value;
    }

    /**
     * Sets the value of the y1Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Y1Value }
     *     
     */
    public void setY1Value(Y1Value value) {
        this.y1Value = value;
    }

    /**
     * Gets the value of the y2Value property.
     * 
     * @return
     *     possible object is
     *     {@link Y2Value }
     *     
     */
    public Y2Value getY2Value() {
        return y2Value;
    }

    /**
     * Sets the value of the y2Value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Y2Value }
     *     
     */
    public void setY2Value(Y2Value value) {
        this.y2Value = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
