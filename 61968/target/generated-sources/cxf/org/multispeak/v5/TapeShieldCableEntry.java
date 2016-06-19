
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.CapacitancePerUnitLength;
import org.multispeak.v5_0.commontypes.Current;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ResistancePerUnitLength;
import org.multispeak.v5_0.commontypes.Thickness;
import org.multispeak.v5_0.commontypes.Weight;
import org.multispeak.v5_0.commontypes.WeightPerLength;


/**
 * This object is used to define an entry in the tape shield (TS) cable catalog.
 * 
 * <p>Java class for tapeShieldCableEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tapeShieldCableEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="conductorSize" type="{http://www.multispeak.org/V5.0}conductorSize" minOccurs="0"/>
 *         &lt;element name="ampacity" type="{http://www.multispeak.org/V5.0/commonTypes}current" minOccurs="0"/>
 *         &lt;element name="coreStranding" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="coreMaterial" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="phaseGMR" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="insulationMaterial" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="insulationThickness" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="shieldMaterial" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="ODInsulation" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="ODScreen" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="ODCore" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="tapeThickness" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="lap" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *         &lt;element name="isJacketed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ODJacket" type="{http://www.multispeak.org/V5.0/commonTypes}thickness" minOccurs="0"/>
 *         &lt;element name="rAC" type="{http://www.multispeak.org/V5.0/commonTypes}resistancePerUnitLength" minOccurs="0"/>
 *         &lt;element name="capacitance" type="{http://www.multispeak.org/V5.0/commonTypes}capacitancePerUnitLength" minOccurs="0"/>
 *         &lt;element name="coefficientOfFriction" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="weightPerLength" type="{http://www.multispeak.org/V5.0/commonTypes}weightPerLength" minOccurs="0"/>
 *         &lt;element name="minimumBendingRadius" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="maximumPullingTension" type="{http://www.multispeak.org/V5.0/commonTypes}weight" minOccurs="0"/>
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
@XmlType(name = "tapeShieldCableEntry", propOrder = {
    "conductorSize",
    "ampacity",
    "coreStranding",
    "coreMaterial",
    "phaseGMR",
    "insulationMaterial",
    "insulationThickness",
    "shieldMaterial",
    "odInsulation",
    "odScreen",
    "odCore",
    "tapeThickness",
    "lap",
    "isJacketed",
    "odJacket",
    "rac",
    "capacitance",
    "coefficientOfFriction",
    "weightPerLength",
    "minimumBendingRadius",
    "maximumPullingTension"
})
public class TapeShieldCableEntry
    extends MspElectricalDefinition
{

    protected ConductorSize conductorSize;
    protected Current ampacity;
    protected BigInteger coreStranding;
    protected EquipmentCatalogRef coreMaterial;
    protected Length phaseGMR;
    protected EquipmentCatalogRef insulationMaterial;
    protected Thickness insulationThickness;
    protected EquipmentCatalogRef shieldMaterial;
    @XmlElement(name = "ODInsulation")
    protected Thickness odInsulation;
    @XmlElement(name = "ODScreen")
    protected Thickness odScreen;
    @XmlElement(name = "ODCore")
    protected Thickness odCore;
    protected Thickness tapeThickness;
    protected Float lap;
    protected Boolean isJacketed;
    @XmlElement(name = "ODJacket")
    protected Thickness odJacket;
    @XmlElement(name = "rAC")
    protected ResistancePerUnitLength rac;
    protected CapacitancePerUnitLength capacitance;
    protected Float coefficientOfFriction;
    protected WeightPerLength weightPerLength;
    protected Length minimumBendingRadius;
    protected Weight maximumPullingTension;

    /**
     * Gets the value of the conductorSize property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorSize }
     *     
     */
    public ConductorSize getConductorSize() {
        return conductorSize;
    }

    /**
     * Sets the value of the conductorSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorSize }
     *     
     */
    public void setConductorSize(ConductorSize value) {
        this.conductorSize = value;
    }

    /**
     * Gets the value of the ampacity property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getAmpacity() {
        return ampacity;
    }

    /**
     * Sets the value of the ampacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setAmpacity(Current value) {
        this.ampacity = value;
    }

    /**
     * Gets the value of the coreStranding property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoreStranding() {
        return coreStranding;
    }

    /**
     * Sets the value of the coreStranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoreStranding(BigInteger value) {
        this.coreStranding = value;
    }

    /**
     * Gets the value of the coreMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getCoreMaterial() {
        return coreMaterial;
    }

    /**
     * Sets the value of the coreMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setCoreMaterial(EquipmentCatalogRef value) {
        this.coreMaterial = value;
    }

    /**
     * Gets the value of the phaseGMR property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getPhaseGMR() {
        return phaseGMR;
    }

    /**
     * Sets the value of the phaseGMR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setPhaseGMR(Length value) {
        this.phaseGMR = value;
    }

    /**
     * Gets the value of the insulationMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getInsulationMaterial() {
        return insulationMaterial;
    }

    /**
     * Sets the value of the insulationMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setInsulationMaterial(EquipmentCatalogRef value) {
        this.insulationMaterial = value;
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
     * Gets the value of the shieldMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getShieldMaterial() {
        return shieldMaterial;
    }

    /**
     * Sets the value of the shieldMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setShieldMaterial(EquipmentCatalogRef value) {
        this.shieldMaterial = value;
    }

    /**
     * Gets the value of the odInsulation property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getODInsulation() {
        return odInsulation;
    }

    /**
     * Sets the value of the odInsulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setODInsulation(Thickness value) {
        this.odInsulation = value;
    }

    /**
     * Gets the value of the odScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getODScreen() {
        return odScreen;
    }

    /**
     * Sets the value of the odScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setODScreen(Thickness value) {
        this.odScreen = value;
    }

    /**
     * Gets the value of the odCore property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getODCore() {
        return odCore;
    }

    /**
     * Sets the value of the odCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setODCore(Thickness value) {
        this.odCore = value;
    }

    /**
     * Gets the value of the tapeThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getTapeThickness() {
        return tapeThickness;
    }

    /**
     * Sets the value of the tapeThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setTapeThickness(Thickness value) {
        this.tapeThickness = value;
    }

    /**
     * Gets the value of the lap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLap() {
        return lap;
    }

    /**
     * Sets the value of the lap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLap(Float value) {
        this.lap = value;
    }

    /**
     * Gets the value of the isJacketed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJacketed() {
        return isJacketed;
    }

    /**
     * Sets the value of the isJacketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJacketed(Boolean value) {
        this.isJacketed = value;
    }

    /**
     * Gets the value of the odJacket property.
     * 
     * @return
     *     possible object is
     *     {@link Thickness }
     *     
     */
    public Thickness getODJacket() {
        return odJacket;
    }

    /**
     * Sets the value of the odJacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thickness }
     *     
     */
    public void setODJacket(Thickness value) {
        this.odJacket = value;
    }

    /**
     * Gets the value of the rac property.
     * 
     * @return
     *     possible object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public ResistancePerUnitLength getRAC() {
        return rac;
    }

    /**
     * Sets the value of the rac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResistancePerUnitLength }
     *     
     */
    public void setRAC(ResistancePerUnitLength value) {
        this.rac = value;
    }

    /**
     * Gets the value of the capacitance property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitancePerUnitLength }
     *     
     */
    public CapacitancePerUnitLength getCapacitance() {
        return capacitance;
    }

    /**
     * Sets the value of the capacitance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitancePerUnitLength }
     *     
     */
    public void setCapacitance(CapacitancePerUnitLength value) {
        this.capacitance = value;
    }

    /**
     * Gets the value of the coefficientOfFriction property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoefficientOfFriction() {
        return coefficientOfFriction;
    }

    /**
     * Sets the value of the coefficientOfFriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoefficientOfFriction(Float value) {
        this.coefficientOfFriction = value;
    }

    /**
     * Gets the value of the weightPerLength property.
     * 
     * @return
     *     possible object is
     *     {@link WeightPerLength }
     *     
     */
    public WeightPerLength getWeightPerLength() {
        return weightPerLength;
    }

    /**
     * Sets the value of the weightPerLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightPerLength }
     *     
     */
    public void setWeightPerLength(WeightPerLength value) {
        this.weightPerLength = value;
    }

    /**
     * Gets the value of the minimumBendingRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getMinimumBendingRadius() {
        return minimumBendingRadius;
    }

    /**
     * Sets the value of the minimumBendingRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setMinimumBendingRadius(Length value) {
        this.minimumBendingRadius = value;
    }

    /**
     * Gets the value of the maximumPullingTension property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getMaximumPullingTension() {
        return maximumPullingTension;
    }

    /**
     * Sets the value of the maximumPullingTension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setMaximumPullingTension(Weight value) {
        this.maximumPullingTension = value;
    }

}
