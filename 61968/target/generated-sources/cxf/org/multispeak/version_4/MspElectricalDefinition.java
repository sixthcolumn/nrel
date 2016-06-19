
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspElectricalDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspElectricalDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="entryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipmentType" type="{http://www.multispeak.org/Version_4.1_Release}equipmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspElectricalDefinition", propOrder = {
    "entryName",
    "equipmentType"
})
@XmlSeeAlso({
    TapeShieldCableEntry.class,
    SecondaryConductorEntry.class,
    ZsmImpedanceEntry.class,
    RegulatorEntry.class,
    LineEnvironmentalAttributes.class,
    SwitchEntry.class,
    RecloserEntry.class,
    LoadMixEntry.class,
    ServiceDropEntry.class,
    LineConstructionEntry.class,
    ROWAttributes.class,
    ConcentricNeutralCableEntry.class,
    InductionMachineEntry.class,
    TransformerEntry.class,
    MaterialAttributes.class,
    ConductorEntry.class,
    FuseEntry.class,
    SynchronousMachineEntry.class,
    SectionalizerEntry.class,
    BreakerEntry.class
})
public abstract class MspElectricalDefinition
    extends MspObject
{

    protected String entryName;
    protected EquipmentType equipmentType;

    /**
     * Gets the value of the entryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryName() {
        return entryName;
    }

    /**
     * Sets the value of the entryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryName(String value) {
        this.entryName = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEquipmentType(EquipmentType value) {
        this.equipmentType = value;
    }

}
