
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Resistivity;
import org.multispeak.v5_0.commontypes.ThermalCoefficientOfResistance;


/**
 * This is a catlog entry for material properties.  If the property is a conductor, the resistivity and m entries should be completed. If the material is an insulator then the dielectricConstant and relativityPermeability shoid be completed.
 * 
 * <p>Java class for materialAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialAttributes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="resistivity" type="{http://www.multispeak.org/V5.0/commonTypes}resistivity" minOccurs="0"/>
 *         &lt;element name="m" type="{http://www.multispeak.org/V5.0/commonTypes}thermalCoefficientOfResistance" minOccurs="0"/>
 *         &lt;element name="dielectricConstant" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="relativePermeability" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "materialAttributes", propOrder = {
    "resistivity",
    "m",
    "dielectricConstant",
    "relativePermeability"
})
public class MaterialAttributes
    extends MspElectricalDefinition
{

    protected Resistivity resistivity;
    protected ThermalCoefficientOfResistance m;
    protected Float dielectricConstant;
    protected Float relativePermeability;

    /**
     * Gets the value of the resistivity property.
     * 
     * @return
     *     possible object is
     *     {@link Resistivity }
     *     
     */
    public Resistivity getResistivity() {
        return resistivity;
    }

    /**
     * Sets the value of the resistivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistivity }
     *     
     */
    public void setResistivity(Resistivity value) {
        this.resistivity = value;
    }

    /**
     * Gets the value of the m property.
     * 
     * @return
     *     possible object is
     *     {@link ThermalCoefficientOfResistance }
     *     
     */
    public ThermalCoefficientOfResistance getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermalCoefficientOfResistance }
     *     
     */
    public void setM(ThermalCoefficientOfResistance value) {
        this.m = value;
    }

    /**
     * Gets the value of the dielectricConstant property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDielectricConstant() {
        return dielectricConstant;
    }

    /**
     * Sets the value of the dielectricConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDielectricConstant(Float value) {
        this.dielectricConstant = value;
    }

    /**
     * Gets the value of the relativePermeability property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRelativePermeability() {
        return relativePermeability;
    }

    /**
     * Sets the value of the relativePermeability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRelativePermeability(Float value) {
        this.relativePermeability = value;
    }

}
