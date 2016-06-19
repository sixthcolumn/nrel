
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This container is used to return engineering catalog entries using the GetCatalogEntries web service method.
 * 
 * <p>Java class for returnedCatalogEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnedCatalogEntries">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="conductorEntries" type="{http://www.multispeak.org/V5.0}conductorEntries" minOccurs="0"/>
 *         &lt;element name="concentricNeutralCableEntries" type="{http://www.multispeak.org/V5.0}concentricNeutralCableEntries" minOccurs="0"/>
 *         &lt;element name="tapeShieldCableEntries" type="{http://www.multispeak.org/V5.0}tapeShieldCableEntries" minOccurs="0"/>
 *         &lt;element name="lineConstructionEntries" type="{http://www.multispeak.org/V5.0}lineConstructionEntries" minOccurs="0"/>
 *         &lt;element name="secondaryConductorEntries" type="{http://www.multispeak.org/V5.0}secondaryConductorEntries" minOccurs="0"/>
 *         &lt;element name="materialAttributesEntries" type="{http://www.multispeak.org/V5.0}materialAttributesEntries" minOccurs="0"/>
 *         &lt;element name="lineEnvironmentalAttributesEntries" type="{http://www.multispeak.org/V5.0}lineEnvironmentalAttributesEntries" minOccurs="0"/>
 *         &lt;element name="ROWAttributesEntries" type="{http://www.multispeak.org/V5.0}ROWAttributesEntries" minOccurs="0"/>
 *         &lt;element name="materialEntries" type="{http://www.multispeak.org/V5.0}materialEntries" minOccurs="0"/>
 *         &lt;element name="transformerEntries" type="{http://www.multispeak.org/V5.0}transformerEntries" minOccurs="0"/>
 *         &lt;element name="regulatorEntries" type="{http://www.multispeak.org/V5.0}regulatorEntries" minOccurs="0"/>
 *         &lt;element name="breakerEntries" type="{http://www.multispeak.org/V5.0}breakerEntries" minOccurs="0"/>
 *         &lt;element name="fuseEntries" type="{http://www.multispeak.org/V5.0}fuseEntries" minOccurs="0"/>
 *         &lt;element name="recloserEntries" type="{http://www.multispeak.org/V5.0}recloserEntries" minOccurs="0"/>
 *         &lt;element name="sectionalizerEntries" type="{http://www.multispeak.org/V5.0}sectionalizerEntries" minOccurs="0"/>
 *         &lt;element name="switchEntries" type="{http://www.multispeak.org/V5.0}switchEntries" minOccurs="0"/>
 *         &lt;element name="loadMixEntries" type="{http://www.multispeak.org/V5.0}loadMixEntries" minOccurs="0"/>
 *         &lt;element name="ZsmImpedanceEntries" type="{http://www.multispeak.org/V5.0}ZsmImpedanceEntries" minOccurs="0"/>
 *         &lt;element name="inductionMachineEntries" type="{http://www.multispeak.org/V5.0}inductionMachineEntries" minOccurs="0"/>
 *         &lt;element name="synchronousMachineEntries" type="{http://www.multispeak.org/V5.0}synchronousMachineEntries" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnedCatalogEntries", propOrder = {
    "conductorEntries",
    "concentricNeutralCableEntries",
    "tapeShieldCableEntries",
    "lineConstructionEntries",
    "secondaryConductorEntries",
    "materialAttributesEntries",
    "lineEnvironmentalAttributesEntries",
    "rowAttributesEntries",
    "materialEntries",
    "transformerEntries",
    "regulatorEntries",
    "breakerEntries",
    "fuseEntries",
    "recloserEntries",
    "sectionalizerEntries",
    "switchEntries",
    "loadMixEntries",
    "zsmImpedanceEntries",
    "inductionMachineEntries",
    "synchronousMachineEntries"
})
public class ReturnedCatalogEntries
    extends MspReferable
{

    protected ConductorEntries conductorEntries;
    protected ConcentricNeutralCableEntries concentricNeutralCableEntries;
    protected TapeShieldCableEntries tapeShieldCableEntries;
    protected LineConstructionEntries lineConstructionEntries;
    protected SecondaryConductorEntries secondaryConductorEntries;
    protected MaterialAttributesEntries materialAttributesEntries;
    protected LineEnvironmentalAttributesEntries lineEnvironmentalAttributesEntries;
    @XmlElement(name = "ROWAttributesEntries")
    protected ROWAttributesEntries rowAttributesEntries;
    protected MaterialEntries materialEntries;
    protected TransformerEntries transformerEntries;
    protected RegulatorEntries regulatorEntries;
    protected BreakerEntries breakerEntries;
    protected FuseEntries fuseEntries;
    protected RecloserEntries recloserEntries;
    protected SectionalizerEntries sectionalizerEntries;
    protected SwitchEntries switchEntries;
    protected LoadMixEntries loadMixEntries;
    @XmlElement(name = "ZsmImpedanceEntries")
    protected ZsmImpedanceEntries zsmImpedanceEntries;
    protected InductionMachineEntries inductionMachineEntries;
    protected SynchronousMachineEntries synchronousMachineEntries;

    /**
     * Gets the value of the conductorEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorEntries }
     *     
     */
    public ConductorEntries getConductorEntries() {
        return conductorEntries;
    }

    /**
     * Sets the value of the conductorEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorEntries }
     *     
     */
    public void setConductorEntries(ConductorEntries value) {
        this.conductorEntries = value;
    }

    /**
     * Gets the value of the concentricNeutralCableEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ConcentricNeutralCableEntries }
     *     
     */
    public ConcentricNeutralCableEntries getConcentricNeutralCableEntries() {
        return concentricNeutralCableEntries;
    }

    /**
     * Sets the value of the concentricNeutralCableEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcentricNeutralCableEntries }
     *     
     */
    public void setConcentricNeutralCableEntries(ConcentricNeutralCableEntries value) {
        this.concentricNeutralCableEntries = value;
    }

    /**
     * Gets the value of the tapeShieldCableEntries property.
     * 
     * @return
     *     possible object is
     *     {@link TapeShieldCableEntries }
     *     
     */
    public TapeShieldCableEntries getTapeShieldCableEntries() {
        return tapeShieldCableEntries;
    }

    /**
     * Sets the value of the tapeShieldCableEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapeShieldCableEntries }
     *     
     */
    public void setTapeShieldCableEntries(TapeShieldCableEntries value) {
        this.tapeShieldCableEntries = value;
    }

    /**
     * Gets the value of the lineConstructionEntries property.
     * 
     * @return
     *     possible object is
     *     {@link LineConstructionEntries }
     *     
     */
    public LineConstructionEntries getLineConstructionEntries() {
        return lineConstructionEntries;
    }

    /**
     * Sets the value of the lineConstructionEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineConstructionEntries }
     *     
     */
    public void setLineConstructionEntries(LineConstructionEntries value) {
        this.lineConstructionEntries = value;
    }

    /**
     * Gets the value of the secondaryConductorEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryConductorEntries }
     *     
     */
    public SecondaryConductorEntries getSecondaryConductorEntries() {
        return secondaryConductorEntries;
    }

    /**
     * Sets the value of the secondaryConductorEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryConductorEntries }
     *     
     */
    public void setSecondaryConductorEntries(SecondaryConductorEntries value) {
        this.secondaryConductorEntries = value;
    }

    /**
     * Gets the value of the materialAttributesEntries property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialAttributesEntries }
     *     
     */
    public MaterialAttributesEntries getMaterialAttributesEntries() {
        return materialAttributesEntries;
    }

    /**
     * Sets the value of the materialAttributesEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialAttributesEntries }
     *     
     */
    public void setMaterialAttributesEntries(MaterialAttributesEntries value) {
        this.materialAttributesEntries = value;
    }

    /**
     * Gets the value of the lineEnvironmentalAttributesEntries property.
     * 
     * @return
     *     possible object is
     *     {@link LineEnvironmentalAttributesEntries }
     *     
     */
    public LineEnvironmentalAttributesEntries getLineEnvironmentalAttributesEntries() {
        return lineEnvironmentalAttributesEntries;
    }

    /**
     * Sets the value of the lineEnvironmentalAttributesEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineEnvironmentalAttributesEntries }
     *     
     */
    public void setLineEnvironmentalAttributesEntries(LineEnvironmentalAttributesEntries value) {
        this.lineEnvironmentalAttributesEntries = value;
    }

    /**
     * Gets the value of the rowAttributesEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ROWAttributesEntries }
     *     
     */
    public ROWAttributesEntries getROWAttributesEntries() {
        return rowAttributesEntries;
    }

    /**
     * Sets the value of the rowAttributesEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROWAttributesEntries }
     *     
     */
    public void setROWAttributesEntries(ROWAttributesEntries value) {
        this.rowAttributesEntries = value;
    }

    /**
     * Gets the value of the materialEntries property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialEntries }
     *     
     */
    public MaterialEntries getMaterialEntries() {
        return materialEntries;
    }

    /**
     * Sets the value of the materialEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialEntries }
     *     
     */
    public void setMaterialEntries(MaterialEntries value) {
        this.materialEntries = value;
    }

    /**
     * Gets the value of the transformerEntries property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerEntries }
     *     
     */
    public TransformerEntries getTransformerEntries() {
        return transformerEntries;
    }

    /**
     * Sets the value of the transformerEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerEntries }
     *     
     */
    public void setTransformerEntries(TransformerEntries value) {
        this.transformerEntries = value;
    }

    /**
     * Gets the value of the regulatorEntries property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorEntries }
     *     
     */
    public RegulatorEntries getRegulatorEntries() {
        return regulatorEntries;
    }

    /**
     * Sets the value of the regulatorEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorEntries }
     *     
     */
    public void setRegulatorEntries(RegulatorEntries value) {
        this.regulatorEntries = value;
    }

    /**
     * Gets the value of the breakerEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BreakerEntries }
     *     
     */
    public BreakerEntries getBreakerEntries() {
        return breakerEntries;
    }

    /**
     * Sets the value of the breakerEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakerEntries }
     *     
     */
    public void setBreakerEntries(BreakerEntries value) {
        this.breakerEntries = value;
    }

    /**
     * Gets the value of the fuseEntries property.
     * 
     * @return
     *     possible object is
     *     {@link FuseEntries }
     *     
     */
    public FuseEntries getFuseEntries() {
        return fuseEntries;
    }

    /**
     * Sets the value of the fuseEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuseEntries }
     *     
     */
    public void setFuseEntries(FuseEntries value) {
        this.fuseEntries = value;
    }

    /**
     * Gets the value of the recloserEntries property.
     * 
     * @return
     *     possible object is
     *     {@link RecloserEntries }
     *     
     */
    public RecloserEntries getRecloserEntries() {
        return recloserEntries;
    }

    /**
     * Sets the value of the recloserEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecloserEntries }
     *     
     */
    public void setRecloserEntries(RecloserEntries value) {
        this.recloserEntries = value;
    }

    /**
     * Gets the value of the sectionalizerEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SectionalizerEntries }
     *     
     */
    public SectionalizerEntries getSectionalizerEntries() {
        return sectionalizerEntries;
    }

    /**
     * Sets the value of the sectionalizerEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionalizerEntries }
     *     
     */
    public void setSectionalizerEntries(SectionalizerEntries value) {
        this.sectionalizerEntries = value;
    }

    /**
     * Gets the value of the switchEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchEntries }
     *     
     */
    public SwitchEntries getSwitchEntries() {
        return switchEntries;
    }

    /**
     * Sets the value of the switchEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchEntries }
     *     
     */
    public void setSwitchEntries(SwitchEntries value) {
        this.switchEntries = value;
    }

    /**
     * Gets the value of the loadMixEntries property.
     * 
     * @return
     *     possible object is
     *     {@link LoadMixEntries }
     *     
     */
    public LoadMixEntries getLoadMixEntries() {
        return loadMixEntries;
    }

    /**
     * Sets the value of the loadMixEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadMixEntries }
     *     
     */
    public void setLoadMixEntries(LoadMixEntries value) {
        this.loadMixEntries = value;
    }

    /**
     * Gets the value of the zsmImpedanceEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ZsmImpedanceEntries }
     *     
     */
    public ZsmImpedanceEntries getZsmImpedanceEntries() {
        return zsmImpedanceEntries;
    }

    /**
     * Sets the value of the zsmImpedanceEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZsmImpedanceEntries }
     *     
     */
    public void setZsmImpedanceEntries(ZsmImpedanceEntries value) {
        this.zsmImpedanceEntries = value;
    }

    /**
     * Gets the value of the inductionMachineEntries property.
     * 
     * @return
     *     possible object is
     *     {@link InductionMachineEntries }
     *     
     */
    public InductionMachineEntries getInductionMachineEntries() {
        return inductionMachineEntries;
    }

    /**
     * Sets the value of the inductionMachineEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link InductionMachineEntries }
     *     
     */
    public void setInductionMachineEntries(InductionMachineEntries value) {
        this.inductionMachineEntries = value;
    }

    /**
     * Gets the value of the synchronousMachineEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronousMachineEntries }
     *     
     */
    public SynchronousMachineEntries getSynchronousMachineEntries() {
        return synchronousMachineEntries;
    }

    /**
     * Sets the value of the synchronousMachineEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronousMachineEntries }
     *     
     */
    public void setSynchronousMachineEntries(SynchronousMachineEntries value) {
        this.synchronousMachineEntries = value;
    }

}
