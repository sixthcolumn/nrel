
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ppmMeterExchange" type="{http://www.multispeak.org/V5.0}ppmMeterExchange"/>
 *         &lt;element name="waterMeterExchange" type="{http://www.multispeak.org/V5.0}waterMeterExchange"/>
 *         &lt;element name="otherMeterExchange" type="{http://www.multispeak.org/V5.0}otherMeterExchange"/>
 *         &lt;element name="gasMeterExchange" type="{http://www.multispeak.org/V5.0}gasMeterExchange"/>
 *         &lt;element name="electricMeterExchange" type="{http://www.multispeak.org/V5.0}electricMeterExchange"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterExchange", propOrder = {
    "ppmMeterExchange",
    "waterMeterExchange",
    "otherMeterExchange",
    "gasMeterExchange",
    "electricMeterExchange"
})
public class MeterExchange {

    protected PpmMeterExchange ppmMeterExchange;
    protected WaterMeterExchange waterMeterExchange;
    protected OtherMeterExchange otherMeterExchange;
    protected GasMeterExchange gasMeterExchange;
    protected ElectricMeterExchange electricMeterExchange;

    /**
     * Gets the value of the ppmMeterExchange property.
     * 
     * @return
     *     possible object is
     *     {@link PpmMeterExchange }
     *     
     */
    public PpmMeterExchange getPpmMeterExchange() {
        return ppmMeterExchange;
    }

    /**
     * Sets the value of the ppmMeterExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PpmMeterExchange }
     *     
     */
    public void setPpmMeterExchange(PpmMeterExchange value) {
        this.ppmMeterExchange = value;
    }

    /**
     * Gets the value of the waterMeterExchange property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeterExchange }
     *     
     */
    public WaterMeterExchange getWaterMeterExchange() {
        return waterMeterExchange;
    }

    /**
     * Sets the value of the waterMeterExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeterExchange }
     *     
     */
    public void setWaterMeterExchange(WaterMeterExchange value) {
        this.waterMeterExchange = value;
    }

    /**
     * Gets the value of the otherMeterExchange property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMeterExchange }
     *     
     */
    public OtherMeterExchange getOtherMeterExchange() {
        return otherMeterExchange;
    }

    /**
     * Sets the value of the otherMeterExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMeterExchange }
     *     
     */
    public void setOtherMeterExchange(OtherMeterExchange value) {
        this.otherMeterExchange = value;
    }

    /**
     * Gets the value of the gasMeterExchange property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterExchange }
     *     
     */
    public GasMeterExchange getGasMeterExchange() {
        return gasMeterExchange;
    }

    /**
     * Sets the value of the gasMeterExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterExchange }
     *     
     */
    public void setGasMeterExchange(GasMeterExchange value) {
        this.gasMeterExchange = value;
    }

    /**
     * Gets the value of the electricMeterExchange property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeterExchange }
     *     
     */
    public ElectricMeterExchange getElectricMeterExchange() {
        return electricMeterExchange;
    }

    /**
     * Sets the value of the electricMeterExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeterExchange }
     *     
     */
    public void setElectricMeterExchange(ElectricMeterExchange value) {
        this.electricMeterExchange = value;
    }

}
