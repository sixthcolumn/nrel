
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterGroups">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="electricMeterGroups" type="{http://www.multispeak.org/V5.0}electricMeterGroups" minOccurs="0"/>
 *         &lt;element name="gasMeterGroups" type="{http://www.multispeak.org/V5.0}gasMeterGroups" minOccurs="0"/>
 *         &lt;element name="waterMeterGroups" type="{http://www.multispeak.org/V5.0}waterMeterGroups" minOccurs="0"/>
 *         &lt;element name="propaneMeterGroups" type="{http://www.multispeak.org/V5.0}propaneMeterGroups" minOccurs="0"/>
 *         &lt;element name="mixedMeterGroups" type="{http://www.multispeak.org/V5.0}mixedMeterGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterGroups", propOrder = {
    "electricMeterGroups",
    "gasMeterGroups",
    "waterMeterGroups",
    "propaneMeterGroups",
    "mixedMeterGroups"
})
public class MeterGroups
    extends MspReferable
{

    protected ElectricMeterGroups electricMeterGroups;
    protected GasMeterGroups gasMeterGroups;
    protected WaterMeterGroups waterMeterGroups;
    protected PropaneMeterGroups propaneMeterGroups;
    protected MixedMeterGroups mixedMeterGroups;

    /**
     * Gets the value of the electricMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeterGroups }
     *     
     */
    public ElectricMeterGroups getElectricMeterGroups() {
        return electricMeterGroups;
    }

    /**
     * Sets the value of the electricMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeterGroups }
     *     
     */
    public void setElectricMeterGroups(ElectricMeterGroups value) {
        this.electricMeterGroups = value;
    }

    /**
     * Gets the value of the gasMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterGroups }
     *     
     */
    public GasMeterGroups getGasMeterGroups() {
        return gasMeterGroups;
    }

    /**
     * Sets the value of the gasMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterGroups }
     *     
     */
    public void setGasMeterGroups(GasMeterGroups value) {
        this.gasMeterGroups = value;
    }

    /**
     * Gets the value of the waterMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeterGroups }
     *     
     */
    public WaterMeterGroups getWaterMeterGroups() {
        return waterMeterGroups;
    }

    /**
     * Sets the value of the waterMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeterGroups }
     *     
     */
    public void setWaterMeterGroups(WaterMeterGroups value) {
        this.waterMeterGroups = value;
    }

    /**
     * Gets the value of the propaneMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link PropaneMeterGroups }
     *     
     */
    public PropaneMeterGroups getPropaneMeterGroups() {
        return propaneMeterGroups;
    }

    /**
     * Sets the value of the propaneMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropaneMeterGroups }
     *     
     */
    public void setPropaneMeterGroups(PropaneMeterGroups value) {
        this.propaneMeterGroups = value;
    }

    /**
     * Gets the value of the mixedMeterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link MixedMeterGroups }
     *     
     */
    public MixedMeterGroups getMixedMeterGroups() {
        return mixedMeterGroups;
    }

    /**
     * Sets the value of the mixedMeterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixedMeterGroups }
     *     
     */
    public void setMixedMeterGroups(MixedMeterGroups value) {
        this.mixedMeterGroups = value;
    }

}
