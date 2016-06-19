
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.Resistance;
import org.multispeak.v5_0.commontypes.Resistivity;
import org.multispeak.v5_0.commontypes.Temperature;


/**
 * This is the electrical catalog entry for line environmental characteristics.
 * 
 * <p>Java class for lineEnvironmentalAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineEnvironmentalAttributes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="soilResistivity" type="{http://www.multispeak.org/V5.0/commonTypes}resistivity" minOccurs="0"/>
 *         &lt;element name="defaultPoleGroundResistance" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
 *         &lt;element name="temperature" type="{http://www.multispeak.org/V5.0/commonTypes}temperature" minOccurs="0"/>
 *         &lt;element name="groundSpacing" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="spanLength" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
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
@XmlType(name = "lineEnvironmentalAttributes", propOrder = {
    "soilResistivity",
    "defaultPoleGroundResistance",
    "temperature",
    "groundSpacing",
    "spanLength"
})
public class LineEnvironmentalAttributes
    extends MspElectricalDefinition
{

    protected Resistivity soilResistivity;
    protected Resistance defaultPoleGroundResistance;
    protected Temperature temperature;
    protected BigInteger groundSpacing;
    protected Length spanLength;

    /**
     * Gets the value of the soilResistivity property.
     * 
     * @return
     *     possible object is
     *     {@link Resistivity }
     *     
     */
    public Resistivity getSoilResistivity() {
        return soilResistivity;
    }

    /**
     * Sets the value of the soilResistivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistivity }
     *     
     */
    public void setSoilResistivity(Resistivity value) {
        this.soilResistivity = value;
    }

    /**
     * Gets the value of the defaultPoleGroundResistance property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getDefaultPoleGroundResistance() {
        return defaultPoleGroundResistance;
    }

    /**
     * Sets the value of the defaultPoleGroundResistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setDefaultPoleGroundResistance(Resistance value) {
        this.defaultPoleGroundResistance = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the groundSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroundSpacing() {
        return groundSpacing;
    }

    /**
     * Sets the value of the groundSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroundSpacing(BigInteger value) {
        this.groundSpacing = value;
    }

    /**
     * Gets the value of the spanLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getSpanLength() {
        return spanLength;
    }

    /**
     * Sets the value of the spanLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setSpanLength(Length value) {
        this.spanLength = value;
    }

}
