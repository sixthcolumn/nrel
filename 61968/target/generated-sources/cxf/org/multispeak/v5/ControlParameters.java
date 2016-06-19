
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * Optional parameters that give additional guidelines for the desired control strategy.
 * 
 * <p>Java class for controlParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="controlParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="controlLoad" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="dutyCycle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlParameters", propOrder = {
    "controlLoad",
    "dutyCycle"
})
public class ControlParameters
    extends MspExtensible
{

    protected RealPower controlLoad;
    protected Long dutyCycle;

    /**
     * Gets the value of the controlLoad property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getControlLoad() {
        return controlLoad;
    }

    /**
     * Sets the value of the controlLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setControlLoad(RealPower value) {
        this.controlLoad = value;
    }

    /**
     * Gets the value of the dutyCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDutyCycle() {
        return dutyCycle;
    }

    /**
     * Sets the value of the dutyCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDutyCycle(Long value) {
        this.dutyCycle = value;
    }

}
