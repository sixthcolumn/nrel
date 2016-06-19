
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;choice>
 *         &lt;element name="electricMeter" type="{http://www.multispeak.org/V5.0}electricMeter"/>
 *         &lt;element name="gasMeter" type="{http://www.multispeak.org/V5.0}gasMeter"/>
 *         &lt;element name="waterMeter" type="{http://www.multispeak.org/V5.0}waterMeter"/>
 *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/V5.0}propaneMeter"/>
 *         &lt;element name="otherMeter" type="{http://www.multispeak.org/V5.0}otherMeter"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meter", propOrder = {
    "electricMeter",
    "gasMeter",
    "waterMeter",
    "propaneMeter",
    "otherMeter"
})
public class Meter
    extends MspReferable
{

    protected ElectricMeter electricMeter;
    protected GasMeter gasMeter;
    protected WaterMeter waterMeter;
    protected PropaneMeter propaneMeter;
    protected OtherMeter otherMeter;

    /**
     * Gets the value of the electricMeter property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeter }
     *     
     */
    public ElectricMeter getElectricMeter() {
        return electricMeter;
    }

    /**
     * Sets the value of the electricMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeter }
     *     
     */
    public void setElectricMeter(ElectricMeter value) {
        this.electricMeter = value;
    }

    /**
     * Gets the value of the gasMeter property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeter }
     *     
     */
    public GasMeter getGasMeter() {
        return gasMeter;
    }

    /**
     * Sets the value of the gasMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeter }
     *     
     */
    public void setGasMeter(GasMeter value) {
        this.gasMeter = value;
    }

    /**
     * Gets the value of the waterMeter property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeter }
     *     
     */
    public WaterMeter getWaterMeter() {
        return waterMeter;
    }

    /**
     * Sets the value of the waterMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeter }
     *     
     */
    public void setWaterMeter(WaterMeter value) {
        this.waterMeter = value;
    }

    /**
     * Gets the value of the propaneMeter property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeter }
     *     
     */
    public PropaneMeter getPropaneMeter() {
        return propaneMeter;
    }

    /**
     * Sets the value of the propaneMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeter }
     *     
     */
    public void setPropaneMeter(PropaneMeter value) {
        this.propaneMeter = value;
    }

    /**
     * Gets the value of the otherMeter property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeter }
     *     
     */
    public OtherMeter getOtherMeter() {
        return otherMeter;
    }

    /**
     * Sets the value of the otherMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeter }
     *     
     */
    public void setOtherMeter(OtherMeter value) {
        this.otherMeter = value;
    }

}
