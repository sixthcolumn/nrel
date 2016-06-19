
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="electricConnectivityModels" type="{http://www.multispeak.org/V5.0}electricConnectivityModels" minOccurs="0"/>
 *         &lt;element name="gasConnectivityModels" type="{http://www.multispeak.org/V5.0}gasConnectivityModels" minOccurs="0"/>
 *         &lt;element name="waterConnectivityModels" type="{http://www.multispeak.org/V5.0}waterConnectivityModels" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectivity", propOrder = {
    "electricConnectivityModels",
    "gasConnectivityModels",
    "waterConnectivityModels"
})
public class Connectivity
    extends MspReferable
{

    protected ElectricConnectivityModels electricConnectivityModels;
    protected GasConnectivityModels gasConnectivityModels;
    protected WaterConnectivityModels waterConnectivityModels;

    /**
     * Gets the value of the electricConnectivityModels property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricConnectivityModels }
     *     
     */
    public ElectricConnectivityModels getElectricConnectivityModels() {
        return electricConnectivityModels;
    }

    /**
     * Sets the value of the electricConnectivityModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricConnectivityModels }
     *     
     */
    public void setElectricConnectivityModels(ElectricConnectivityModels value) {
        this.electricConnectivityModels = value;
    }

    /**
     * Gets the value of the gasConnectivityModels property.
     * 
     * @return
     *     possible object is
     *     {@link GasConnectivityModels }
     *     
     */
    public GasConnectivityModels getGasConnectivityModels() {
        return gasConnectivityModels;
    }

    /**
     * Sets the value of the gasConnectivityModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasConnectivityModels }
     *     
     */
    public void setGasConnectivityModels(GasConnectivityModels value) {
        this.gasConnectivityModels = value;
    }

    /**
     * Gets the value of the waterConnectivityModels property.
     * 
     * @return
     *     possible object is
     *     {@link WaterConnectivityModels }
     *     
     */
    public WaterConnectivityModels getWaterConnectivityModels() {
        return waterConnectivityModels;
    }

    /**
     * Sets the value of the waterConnectivityModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterConnectivityModels }
     *     
     */
    public void setWaterConnectivityModels(WaterConnectivityModels value) {
        this.waterConnectivityModels = value;
    }

}
