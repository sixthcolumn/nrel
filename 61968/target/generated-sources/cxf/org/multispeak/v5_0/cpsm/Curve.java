
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * Relationship between an independent variable (X-axis) and one or two dependent variables (Y1-axis and Y2-axis). Curves can also serve as schedules.  For the purposes of the CPSM profile, the only acceptable types of curves are GrossToNetMWCurve or MVArCapabilityCurve.
 * 
 * <p>Java class for Curve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Curve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="curveStyle" type="{http://www.multispeak.org/V5.0/cpsm}CurveStyle" minOccurs="0"/>
 *         &lt;element name="dataPoints" type="{http://www.multispeak.org/V5.0/cpsm}DataPoints" minOccurs="0"/>
 *         &lt;element name="xUnit" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="y1Unit" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="y2Unit" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curve", propOrder = {
    "curveStyle",
    "dataPoints",
    "xUnit",
    "y1Unit",
    "y2Unit"
})
@XmlSeeAlso({
    ReactiveCapabilityCurve.class,
    GrossToNetActivePowerCurve.class
})
public class Curve
    extends MspCIMObject
{

    protected CurveStyle curveStyle;
    protected DataPoints dataPoints;
    protected ObjectID xUnit;
    protected ObjectID y1Unit;
    protected ObjectID y2Unit;

    /**
     * Gets the value of the curveStyle property.
     * 
     * @return
     *     possible object is
     *     {@link CurveStyle }
     *     
     */
    public CurveStyle getCurveStyle() {
        return curveStyle;
    }

    /**
     * Sets the value of the curveStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveStyle }
     *     
     */
    public void setCurveStyle(CurveStyle value) {
        this.curveStyle = value;
    }

    /**
     * Gets the value of the dataPoints property.
     * 
     * @return
     *     possible object is
     *     {@link DataPoints }
     *     
     */
    public DataPoints getDataPoints() {
        return dataPoints;
    }

    /**
     * Sets the value of the dataPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPoints }
     *     
     */
    public void setDataPoints(DataPoints value) {
        this.dataPoints = value;
    }

    /**
     * Gets the value of the xUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getXUnit() {
        return xUnit;
    }

    /**
     * Sets the value of the xUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setXUnit(ObjectID value) {
        this.xUnit = value;
    }

    /**
     * Gets the value of the y1Unit property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getY1Unit() {
        return y1Unit;
    }

    /**
     * Sets the value of the y1Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setY1Unit(ObjectID value) {
        this.y1Unit = value;
    }

    /**
     * Gets the value of the y2Unit property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getY2Unit() {
        return y2Unit;
    }

    /**
     * Sets the value of the y2Unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setY2Unit(ObjectID value) {
        this.y2Unit = value;
    }

}
