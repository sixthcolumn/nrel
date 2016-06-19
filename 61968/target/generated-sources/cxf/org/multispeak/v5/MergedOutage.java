
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This could be either an update to an existing outage or could be a new merged outage that was created from the constituant outages.
 * 
 * <p>Java class for mergedOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergedOutage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="electricOutage" type="{http://www.multispeak.org/V5.0}electricOutage"/>
 *         &lt;element name="gasOutage" type="{http://www.multispeak.org/V5.0}gasOutage"/>
 *         &lt;element name="waterOutage" type="{http://www.multispeak.org/V5.0}waterOutage"/>
 *         &lt;element name="telecomOutage" type="{http://www.multispeak.org/V5.0}telecomOutage"/>
 *         &lt;element name="cableOutage" type="{http://www.multispeak.org/V5.0}cableOutage"/>
 *         &lt;element name="internetOutage" type="{http://www.multispeak.org/V5.0}internetOutage"/>
 *         &lt;element name="otherOutage" type="{http://www.multispeak.org/V5.0}otherOutage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergedOutage", propOrder = {
    "electricOutage",
    "gasOutage",
    "waterOutage",
    "telecomOutage",
    "cableOutage",
    "internetOutage",
    "otherOutage"
})
public class MergedOutage {

    protected ElectricOutage electricOutage;
    protected GasOutage gasOutage;
    protected WaterOutage waterOutage;
    protected TelecomOutage telecomOutage;
    protected CableOutage cableOutage;
    protected InternetOutage internetOutage;
    protected OtherOutage otherOutage;

    /**
     * Gets the value of the electricOutage property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricOutage }
     *     
     */
    public ElectricOutage getElectricOutage() {
        return electricOutage;
    }

    /**
     * Sets the value of the electricOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricOutage }
     *     
     */
    public void setElectricOutage(ElectricOutage value) {
        this.electricOutage = value;
    }

    /**
     * Gets the value of the gasOutage property.
     * 
     * @return
     *     possible object is
     *     {@link GasOutage }
     *     
     */
    public GasOutage getGasOutage() {
        return gasOutage;
    }

    /**
     * Sets the value of the gasOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasOutage }
     *     
     */
    public void setGasOutage(GasOutage value) {
        this.gasOutage = value;
    }

    /**
     * Gets the value of the waterOutage property.
     * 
     * @return
     *     possible object is
     *     {@link WaterOutage }
     *     
     */
    public WaterOutage getWaterOutage() {
        return waterOutage;
    }

    /**
     * Sets the value of the waterOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterOutage }
     *     
     */
    public void setWaterOutage(WaterOutage value) {
        this.waterOutage = value;
    }

    /**
     * Gets the value of the telecomOutage property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomOutage }
     *     
     */
    public TelecomOutage getTelecomOutage() {
        return telecomOutage;
    }

    /**
     * Sets the value of the telecomOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomOutage }
     *     
     */
    public void setTelecomOutage(TelecomOutage value) {
        this.telecomOutage = value;
    }

    /**
     * Gets the value of the cableOutage property.
     * 
     * @return
     *     possible object is
     *     {@link CableOutage }
     *     
     */
    public CableOutage getCableOutage() {
        return cableOutage;
    }

    /**
     * Sets the value of the cableOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CableOutage }
     *     
     */
    public void setCableOutage(CableOutage value) {
        this.cableOutage = value;
    }

    /**
     * Gets the value of the internetOutage property.
     * 
     * @return
     *     possible object is
     *     {@link InternetOutage }
     *     
     */
    public InternetOutage getInternetOutage() {
        return internetOutage;
    }

    /**
     * Sets the value of the internetOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetOutage }
     *     
     */
    public void setInternetOutage(InternetOutage value) {
        this.internetOutage = value;
    }

    /**
     * Gets the value of the otherOutage property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOutage }
     *     
     */
    public OtherOutage getOtherOutage() {
        return otherOutage;
    }

    /**
     * Sets the value of the otherOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOutage }
     *     
     */
    public void setOtherOutage(OtherOutage value) {
        this.otherOutage = value;
    }

}
