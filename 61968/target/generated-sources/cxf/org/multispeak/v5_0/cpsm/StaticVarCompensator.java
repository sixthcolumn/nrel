
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * <p>Java class for StaticVarCompensator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaticVarCompensator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}RegulatingCondEq">
 *       &lt;sequence>
 *         &lt;element name="capacitiveRating" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="inductiveRating" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="sVCControlMode" type="{http://www.multispeak.org/V5.0/cpsm}sVCControlMode" minOccurs="0"/>
 *         &lt;element name="slope" type="{http://www.multispeak.org/V5.0/cpsm}Slope" minOccurs="0"/>
 *         &lt;element name="voltageSetPoint" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
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
@XmlType(name = "StaticVarCompensator", propOrder = {
    "capacitiveRating",
    "inductiveRating",
    "svcControlMode",
    "slope",
    "voltageSetPoint"
})
public class StaticVarCompensator
    extends RegulatingCondEq
{

    protected ReactivePower capacitiveRating;
    protected ReactivePower inductiveRating;
    @XmlElement(name = "sVCControlMode")
    protected SVCControlMode svcControlMode;
    protected Slope slope;
    protected Voltage voltageSetPoint;

    /**
     * Gets the value of the capacitiveRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getCapacitiveRating() {
        return capacitiveRating;
    }

    /**
     * Sets the value of the capacitiveRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setCapacitiveRating(ReactivePower value) {
        this.capacitiveRating = value;
    }

    /**
     * Gets the value of the inductiveRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getInductiveRating() {
        return inductiveRating;
    }

    /**
     * Sets the value of the inductiveRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setInductiveRating(ReactivePower value) {
        this.inductiveRating = value;
    }

    /**
     * Gets the value of the svcControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link SVCControlMode }
     *     
     */
    public SVCControlMode getSVCControlMode() {
        return svcControlMode;
    }

    /**
     * Sets the value of the svcControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SVCControlMode }
     *     
     */
    public void setSVCControlMode(SVCControlMode value) {
        this.svcControlMode = value;
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link Slope }
     *     
     */
    public Slope getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slope }
     *     
     */
    public void setSlope(Slope value) {
        this.slope = value;
    }

    /**
     * Gets the value of the voltageSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageSetPoint() {
        return voltageSetPoint;
    }

    /**
     * Sets the value of the voltageSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageSetPoint(Voltage value) {
        this.voltageSetPoint = value;
    }

}
