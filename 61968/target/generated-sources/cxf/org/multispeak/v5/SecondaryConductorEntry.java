
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.Thickness;


/**
 * This object is used to define an entry in the secondary conductor catalog.
 * 
 * <p>Java class for secondaryConductorEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondaryConductorEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="numberPhaseConductors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="conductorMaterial" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="phaseSize" type="{http://www.multispeak.org/V5.0}conductorSize" minOccurs="0"/>
 *         &lt;element name="phaseStranding" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="insulationThickness" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="insulatorMaterial" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="neutralMaterial" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="neutralSize" type="{http://www.multispeak.org/V5.0}conductorSize" minOccurs="0"/>
 *         &lt;element name="neutralStranding" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "secondaryConductorEntry", propOrder = {
    "numberPhaseConductors",
    "conductorMaterial",
    "phaseSize",
    "phaseStranding",
    "insulationThickness",
    "insulatorMaterial",
    "neutralMaterial",
    "neutralSize",
    "neutralStranding"
})
@XmlSeeAlso({
    ServiceDropEntry.class
})
public class SecondaryConductorEntry
    extends MspElectricalDefinition
{

    protected BigInteger numberPhaseConductors;
    protected EquipmentCatalogRef conductorMaterial;
    protected ConductorSize phaseSize;
    protected BigInteger phaseStranding;
    protected Thickness insulationThickness;
    protected EquipmentCatalogRef insulatorMaterial;
    protected EquipmentCatalogRef neutralMaterial;
    protected ConductorSize neutralSize;
    protected BigInteger neutralStranding;

    /**
     * Gets the value of the numberPhaseConductors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberPhaseConductors() {
        return numberPhaseConductors;
    }

    /**
     * Sets the value of the numberPhaseConductors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberPhaseConductors(BigInteger value) {
        this.numberPhaseConductors = value;
    }

    /**
     * Gets the value of the conductorMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getConductorMaterial() {
        return conductorMaterial;
    }

    /**
     * Sets the value of the conductorMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setConductorMaterial(EquipmentCatalogRef value) {
        this.conductorMaterial = value;
    }

    /**
     * Gets the value of the phaseSize property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorSize }
     *     
     */
    public ConductorSize getPhaseSize() {
        return phaseSize;
    }

    /**
     * Sets the value of the phaseSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorSize }
     *     
     */
    public void setPhaseSize(ConductorSize value) {
        this.phaseSize = value;
    }

    /**
     * Gets the value of the phaseStranding property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhaseStranding() {
        return phaseStranding;
    }

    /**
     * Sets the value of the phaseStranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhaseStranding(BigInteger value) {
        this.phaseStranding = value;
    }

    /**
     * Gets the value of the insulationThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getInsulationThickness() {
        return insulationThickness;
    }

    /**
     * Sets the value of the insulationThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setInsulationThickness(Thickness value) {
        this.insulationThickness = value;
    }

    /**
     * Gets the value of the insulatorMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getInsulatorMaterial() {
        return insulatorMaterial;
    }

    /**
     * Sets the value of the insulatorMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setInsulatorMaterial(EquipmentCatalogRef value) {
        this.insulatorMaterial = value;
    }

    /**
     * Gets the value of the neutralMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getNeutralMaterial() {
        return neutralMaterial;
    }

    /**
     * Sets the value of the neutralMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setNeutralMaterial(EquipmentCatalogRef value) {
        this.neutralMaterial = value;
    }

    /**
     * Gets the value of the neutralSize property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorSize }
     *     
     */
    public ConductorSize getNeutralSize() {
        return neutralSize;
    }

    /**
     * Sets the value of the neutralSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorSize }
     *     
     */
    public void setNeutralSize(ConductorSize value) {
        this.neutralSize = value;
    }

    /**
     * Gets the value of the neutralStranding property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeutralStranding() {
        return neutralStranding;
    }

    /**
     * Sets the value of the neutralStranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeutralStranding(BigInteger value) {
        this.neutralStranding = value;
    }

}
