
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterExchanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterExchanges">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="electricMeterExchanges" type="{http://www.multispeak.org/V5.0}electricMeterExchanges" minOccurs="0"/>
 *         &lt;element name="gasMeterExchanges" type="{http://www.multispeak.org/V5.0}gasMeterExchanges" minOccurs="0"/>
 *         &lt;element name="waterMeterExchanges" type="{http://www.multispeak.org/V5.0}waterMeterExchanges" minOccurs="0"/>
 *         &lt;element name="propaneMeterExchanges" type="{http://www.multispeak.org/V5.0}propaneMeterExchanges" minOccurs="0"/>
 *         &lt;element name="otherMeterExchanges" type="{http://www.multispeak.org/V5.0}otherMeterExchanges" minOccurs="0"/>
 *         &lt;element name="ppmMeterExchanges" type="{http://www.multispeak.org/V5.0}ppmMeterExchanges" minOccurs="0"/>
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
@XmlType(name = "meterExchanges", propOrder = {
    "electricMeterExchanges",
    "gasMeterExchanges",
    "waterMeterExchanges",
    "propaneMeterExchanges",
    "otherMeterExchanges",
    "ppmMeterExchanges"
})
public class MeterExchanges
    extends MspObject
{

    protected ElectricMeterExchanges electricMeterExchanges;
    protected GasMeterExchanges gasMeterExchanges;
    protected WaterMeterExchanges waterMeterExchanges;
    protected PropaneMeterExchanges propaneMeterExchanges;
    protected OtherMeterExchanges otherMeterExchanges;
    protected PpmMeterExchanges ppmMeterExchanges;

    /**
     * Gets the value of the electricMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeterExchanges }
     *     
     */
    public ElectricMeterExchanges getElectricMeterExchanges() {
        return electricMeterExchanges;
    }

    /**
     * Sets the value of the electricMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeterExchanges }
     *     
     */
    public void setElectricMeterExchanges(ElectricMeterExchanges value) {
        this.electricMeterExchanges = value;
    }

    /**
     * Gets the value of the gasMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterExchanges }
     *     
     */
    public GasMeterExchanges getGasMeterExchanges() {
        return gasMeterExchanges;
    }

    /**
     * Sets the value of the gasMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterExchanges }
     *     
     */
    public void setGasMeterExchanges(GasMeterExchanges value) {
        this.gasMeterExchanges = value;
    }

    /**
     * Gets the value of the waterMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeterExchanges }
     *     
     */
    public WaterMeterExchanges getWaterMeterExchanges() {
        return waterMeterExchanges;
    }

    /**
     * Sets the value of the waterMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeterExchanges }
     *     
     */
    public void setWaterMeterExchanges(WaterMeterExchanges value) {
        this.waterMeterExchanges = value;
    }

    /**
     * Gets the value of the propaneMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeterExchanges }
     *     
     */
    public PropaneMeterExchanges getPropaneMeterExchanges() {
        return propaneMeterExchanges;
    }

    /**
     * Sets the value of the propaneMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeterExchanges }
     *     
     */
    public void setPropaneMeterExchanges(PropaneMeterExchanges value) {
        this.propaneMeterExchanges = value;
    }

    /**
     * Gets the value of the otherMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeterExchanges }
     *     
     */
    public OtherMeterExchanges getOtherMeterExchanges() {
        return otherMeterExchanges;
    }

    /**
     * Sets the value of the otherMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeterExchanges }
     *     
     */
    public void setOtherMeterExchanges(OtherMeterExchanges value) {
        this.otherMeterExchanges = value;
    }

    /**
     * Gets the value of the ppmMeterExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link PpmMeterExchanges }
     *     
     */
    public PpmMeterExchanges getPpmMeterExchanges() {
        return ppmMeterExchanges;
    }

    /**
     * Sets the value of the ppmMeterExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PpmMeterExchanges }
     *     
     */
    public void setPpmMeterExchanges(PpmMeterExchanges value) {
        this.ppmMeterExchanges = value;
    }

}
