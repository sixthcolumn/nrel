
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a container class to return any number of an unspecified mix of service points by service types.
 * 
 * <p>Java class for servicePoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePoints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="electricServicePoints" type="{http://www.multispeak.org/V5.0}electricServicePoints" minOccurs="0"/>
 *         &lt;element name="gasServicePoints" type="{http://www.multispeak.org/V5.0}gasServicePoints" minOccurs="0"/>
 *         &lt;element name="waterServicePoints" type="{http://www.multispeak.org/V5.0}waterServicePoints" minOccurs="0"/>
 *         &lt;element name="propaneServicePoints" type="{http://www.multispeak.org/V5.0}propaneServicePoints" minOccurs="0"/>
 *         &lt;element name="otherServicePoints" type="{http://www.multispeak.org/V5.0}otherServicePoints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePoints", propOrder = {
    "electricServicePoints",
    "gasServicePoints",
    "waterServicePoints",
    "propaneServicePoints",
    "otherServicePoints"
})
public class ServicePoints
    extends MspReferable
{

    protected ElectricServicePoints electricServicePoints;
    protected GasServicePoints gasServicePoints;
    protected WaterServicePoints waterServicePoints;
    protected PropaneServicePoints propaneServicePoints;
    protected OtherServicePoints otherServicePoints;

    /**
     * Gets the value of the electricServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricServicePoints }
     *     
     */
    public ElectricServicePoints getElectricServicePoints() {
        return electricServicePoints;
    }

    /**
     * Sets the value of the electricServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricServicePoints }
     *     
     */
    public void setElectricServicePoints(ElectricServicePoints value) {
        this.electricServicePoints = value;
    }

    /**
     * Gets the value of the gasServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link GasServicePoints }
     *     
     */
    public GasServicePoints getGasServicePoints() {
        return gasServicePoints;
    }

    /**
     * Sets the value of the gasServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasServicePoints }
     *     
     */
    public void setGasServicePoints(GasServicePoints value) {
        this.gasServicePoints = value;
    }

    /**
     * Gets the value of the waterServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link WaterServicePoints }
     *     
     */
    public WaterServicePoints getWaterServicePoints() {
        return waterServicePoints;
    }

    /**
     * Sets the value of the waterServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterServicePoints }
     *     
     */
    public void setWaterServicePoints(WaterServicePoints value) {
        this.waterServicePoints = value;
    }

    /**
     * Gets the value of the propaneServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneServicePoints }
     *     
     */
    public PropaneServicePoints getPropaneServicePoints() {
        return propaneServicePoints;
    }

    /**
     * Sets the value of the propaneServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneServicePoints }
     *     
     */
    public void setPropaneServicePoints(PropaneServicePoints value) {
        this.propaneServicePoints = value;
    }

    /**
     * Gets the value of the otherServicePoints property.
     * 
     * @return
     *     possible object is
     *     {@link OtherServicePoints }
     *     
     */
    public OtherServicePoints getOtherServicePoints() {
        return otherServicePoints;
    }

    /**
     * Sets the value of the otherServicePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherServicePoints }
     *     
     */
    public void setOtherServicePoints(OtherServicePoints value) {
        this.otherServicePoints = value;
    }

}
