
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outages">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="electricOutages" type="{http://www.multispeak.org/V5.0}electricOutages" minOccurs="0"/>
 *         &lt;element name="gasOutages" type="{http://www.multispeak.org/V5.0}gasOutages" minOccurs="0"/>
 *         &lt;element name="waterOutages" type="{http://www.multispeak.org/V5.0}waterOutages" minOccurs="0"/>
 *         &lt;element name="telecomOutages" type="{http://www.multispeak.org/V5.0}telecomOutages" minOccurs="0"/>
 *         &lt;element name="cableOutages" type="{http://www.multispeak.org/V5.0}cableOutages" minOccurs="0"/>
 *         &lt;element name="internetOutages" type="{http://www.multispeak.org/V5.0}internetOutages" minOccurs="0"/>
 *         &lt;element name="otherOutages" type="{http://www.multispeak.org/V5.0}otherOutages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outages", propOrder = {
    "electricOutages",
    "gasOutages",
    "waterOutages",
    "telecomOutages",
    "cableOutages",
    "internetOutages",
    "otherOutages"
})
public class Outages
    extends MspReferable
{

    protected ElectricOutages electricOutages;
    protected GasOutages gasOutages;
    protected WaterOutages waterOutages;
    protected TelecomOutages telecomOutages;
    protected CableOutages cableOutages;
    protected InternetOutages internetOutages;
    protected OtherOutages otherOutages;

    /**
     * Gets the value of the electricOutages property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricOutages }
     *     
     */
    public ElectricOutages getElectricOutages() {
        return electricOutages;
    }

    /**
     * Sets the value of the electricOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricOutages }
     *     
     */
    public void setElectricOutages(ElectricOutages value) {
        this.electricOutages = value;
    }

    /**
     * Gets the value of the gasOutages property.
     * 
     * @return
     *     possible object is
     *     {@link GasOutages }
     *     
     */
    public GasOutages getGasOutages() {
        return gasOutages;
    }

    /**
     * Sets the value of the gasOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasOutages }
     *     
     */
    public void setGasOutages(GasOutages value) {
        this.gasOutages = value;
    }

    /**
     * Gets the value of the waterOutages property.
     * 
     * @return
     *     possible object is
     *     {@link WaterOutages }
     *     
     */
    public WaterOutages getWaterOutages() {
        return waterOutages;
    }

    /**
     * Sets the value of the waterOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterOutages }
     *     
     */
    public void setWaterOutages(WaterOutages value) {
        this.waterOutages = value;
    }

    /**
     * Gets the value of the telecomOutages property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomOutages }
     *     
     */
    public TelecomOutages getTelecomOutages() {
        return telecomOutages;
    }

    /**
     * Sets the value of the telecomOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomOutages }
     *     
     */
    public void setTelecomOutages(TelecomOutages value) {
        this.telecomOutages = value;
    }

    /**
     * Gets the value of the cableOutages property.
     * 
     * @return
     *     possible object is
     *     {@link CableOutages }
     *     
     */
    public CableOutages getCableOutages() {
        return cableOutages;
    }

    /**
     * Sets the value of the cableOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CableOutages }
     *     
     */
    public void setCableOutages(CableOutages value) {
        this.cableOutages = value;
    }

    /**
     * Gets the value of the internetOutages property.
     * 
     * @return
     *     possible object is
     *     {@link InternetOutages }
     *     
     */
    public InternetOutages getInternetOutages() {
        return internetOutages;
    }

    /**
     * Sets the value of the internetOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetOutages }
     *     
     */
    public void setInternetOutages(InternetOutages value) {
        this.internetOutages = value;
    }

    /**
     * Gets the value of the otherOutages property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOutages }
     *     
     */
    public OtherOutages getOtherOutages() {
        return otherOutages;
    }

    /**
     * Sets the value of the otherOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOutages }
     *     
     */
    public void setOtherOutages(OtherOutages value) {
        this.otherOutages = value;
    }

}
