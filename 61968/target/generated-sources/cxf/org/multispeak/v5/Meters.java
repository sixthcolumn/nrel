
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="electricMeters" type="{http://www.multispeak.org/V5.0}electricMeters" minOccurs="0"/>
 *         &lt;element name="gasMeters" type="{http://www.multispeak.org/V5.0}gasMeters" minOccurs="0"/>
 *         &lt;element name="waterMeters" type="{http://www.multispeak.org/V5.0}waterMeters" minOccurs="0"/>
 *         &lt;element name="propaneMeters" type="{http://www.multispeak.org/V5.0}propaneMeters" minOccurs="0"/>
 *         &lt;element name="otherMeters" type="{http://www.multispeak.org/V5.0}otherMeters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meters", propOrder = {
    "electricMeters",
    "gasMeters",
    "waterMeters",
    "propaneMeters",
    "otherMeters"
})
public class Meters
    extends MspReferable
{

    protected ElectricMeters electricMeters;
    protected GasMeters gasMeters;
    protected WaterMeters waterMeters;
    protected PropaneMeters propaneMeters;
    protected OtherMeters otherMeters;

    /**
     * Gets the value of the electricMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeters }
     *     
     */
    public ElectricMeters getElectricMeters() {
        return electricMeters;
    }

    /**
     * Sets the value of the electricMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeters }
     *     
     */
    public void setElectricMeters(ElectricMeters value) {
        this.electricMeters = value;
    }

    /**
     * Gets the value of the gasMeters property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeters }
     *     
     */
    public GasMeters getGasMeters() {
        return gasMeters;
    }

    /**
     * Sets the value of the gasMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeters }
     *     
     */
    public void setGasMeters(GasMeters value) {
        this.gasMeters = value;
    }

    /**
     * Gets the value of the waterMeters property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeters }
     *     
     */
    public WaterMeters getWaterMeters() {
        return waterMeters;
    }

    /**
     * Sets the value of the waterMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeters }
     *     
     */
    public void setWaterMeters(WaterMeters value) {
        this.waterMeters = value;
    }

    /**
     * Gets the value of the propaneMeters property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeters }
     *     
     */
    public PropaneMeters getPropaneMeters() {
        return propaneMeters;
    }

    /**
     * Sets the value of the propaneMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeters }
     *     
     */
    public void setPropaneMeters(PropaneMeters value) {
        this.propaneMeters = value;
    }

    /**
     * Gets the value of the otherMeters property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeters }
     *     
     */
    public OtherMeters getOtherMeters() {
        return otherMeters;
    }

    /**
     * Sets the value of the otherMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeters }
     *     
     */
    public void setOtherMeters(OtherMeters value) {
        this.otherMeters = value;
    }

}
