
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for gasNameplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gasNameplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="mechanicalForm" type="{http://www.multispeak.org/V5.0/enumerations}mechanicalForm" minOccurs="0"/>
 *         &lt;element name="measurementSystem" type="{http://www.multispeak.org/V5.0/enumerations}measurementSystem" minOccurs="0"/>
 *         &lt;element name="gasPressure" type="{http://www.multispeak.org/V5.0}gasPressure" minOccurs="0"/>
 *         &lt;element name="gasFlow" type="{http://www.multispeak.org/V5.0}gasFlow" minOccurs="0"/>
 *         &lt;element name="gearDriveSize" type="{http://www.multispeak.org/V5.0/enumerations}gearDriveSize" minOccurs="0"/>
 *         &lt;element name="internalPipeDiameter" type="{http://www.multispeak.org/V5.0/enumerations}internalPipeDiameter" minOccurs="0"/>
 *         &lt;element name="temperatureCompensationType" type="{http://www.multispeak.org/V5.0/enumerations}temperatureCompensationType" minOccurs="0"/>
 *         &lt;element name="pressureCompensationType" type="{http://www.multispeak.org/V5.0/enumerations}pressureCompensationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gasNameplate", propOrder = {
    "mechanicalForm",
    "measurementSystem",
    "gasPressure",
    "gasFlow",
    "gearDriveSize",
    "internalPipeDiameter",
    "temperatureCompensationType",
    "pressureCompensationType"
})
@XmlSeeAlso({
    PropaneNameplate.class
})
public class GasNameplate
    extends MspExtensible
{

    protected String mechanicalForm;
    protected String measurementSystem;
    protected GasPressure gasPressure;
    protected GasFlow gasFlow;
    protected String gearDriveSize;
    protected String internalPipeDiameter;
    protected String temperatureCompensationType;
    protected String pressureCompensationType;

    /**
     * Gets the value of the mechanicalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicalForm() {
        return mechanicalForm;
    }

    /**
     * Sets the value of the mechanicalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicalForm(String value) {
        this.mechanicalForm = value;
    }

    /**
     * Gets the value of the measurementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * Sets the value of the measurementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSystem(String value) {
        this.measurementSystem = value;
    }

    /**
     * Gets the value of the gasPressure property.
     * 
     * @return
     *     possible object is
     *     {@link GasPressure }
     *     
     */
    public GasPressure getGasPressure() {
        return gasPressure;
    }

    /**
     * Sets the value of the gasPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPressure }
     *     
     */
    public void setGasPressure(GasPressure value) {
        this.gasPressure = value;
    }

    /**
     * Gets the value of the gasFlow property.
     * 
     * @return
     *     possible object is
     *     {@link GasFlow }
     *     
     */
    public GasFlow getGasFlow() {
        return gasFlow;
    }

    /**
     * Sets the value of the gasFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasFlow }
     *     
     */
    public void setGasFlow(GasFlow value) {
        this.gasFlow = value;
    }

    /**
     * Gets the value of the gearDriveSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearDriveSize() {
        return gearDriveSize;
    }

    /**
     * Sets the value of the gearDriveSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearDriveSize(String value) {
        this.gearDriveSize = value;
    }

    /**
     * Gets the value of the internalPipeDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalPipeDiameter() {
        return internalPipeDiameter;
    }

    /**
     * Sets the value of the internalPipeDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalPipeDiameter(String value) {
        this.internalPipeDiameter = value;
    }

    /**
     * Gets the value of the temperatureCompensationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureCompensationType() {
        return temperatureCompensationType;
    }

    /**
     * Sets the value of the temperatureCompensationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureCompensationType(String value) {
        this.temperatureCompensationType = value;
    }

    /**
     * Gets the value of the pressureCompensationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressureCompensationType() {
        return pressureCompensationType;
    }

    /**
     * Sets the value of the pressureCompensationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressureCompensationType(String value) {
        this.pressureCompensationType = value;
    }

}
