
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.enumerations.UnitType;


/**
 * This object is the accounting representation for the definition of a construction unit.  That is to say, this is the list of material and labor that is required to construct a physical assembly of plant (that is to say, an assembly that will become a continuing property record (CPR) when put into plant.).  The materialManagementAssembly includes a list of inventory items and labor components necessary to construct the physical assembly. These elements can be used to calculate the cost to construct a physical assembly.
 * 
 * <p>Java class for materialManagementAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialManagementAssembly">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitMaterialCost" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="unitType" type="{http://www.multispeak.org/V5.0/enumerations}unitType" minOccurs="0"/>
 *         &lt;element name="materialComponents" type="{http://www.multispeak.org/V5.0}materialComponents" minOccurs="0"/>
 *         &lt;element name="laborComponents" type="{http://www.multispeak.org/V5.0}laborComponents" minOccurs="0"/>
 *         &lt;element name="subUnits" type="{http://www.multispeak.org/V5.0}subUnits" minOccurs="0"/>
 *         &lt;element name="constituentUnits" type="{http://www.multispeak.org/V5.0}constituentUnits" minOccurs="0"/>
 *         &lt;element name="CPRAllocations" type="{http://www.multispeak.org/V5.0}CPRAllocations" minOccurs="0"/>
 *         &lt;element name="requiredAbilities" type="{http://www.multispeak.org/V5.0}requiredAbilities" minOccurs="0"/>
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
@XmlType(name = "materialManagementAssembly", propOrder = {
    "unitCode",
    "unitDescription",
    "unitMaterialCost",
    "unitType",
    "materialComponents",
    "laborComponents",
    "subUnits",
    "constituentUnits",
    "cprAllocations",
    "requiredAbilities"
})
public class MaterialManagementAssembly
    extends MspObject
{

    protected String unitCode;
    protected String unitDescription;
    protected Money unitMaterialCost;
    protected UnitType unitType;
    protected MaterialComponents materialComponents;
    protected LaborComponents laborComponents;
    protected SubUnits subUnits;
    protected ConstituentUnits constituentUnits;
    @XmlElement(name = "CPRAllocations")
    protected CPRAllocations cprAllocations;
    protected RequiredAbilities requiredAbilities;

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDescription() {
        return unitDescription;
    }

    /**
     * Sets the value of the unitDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDescription(String value) {
        this.unitDescription = value;
    }

    /**
     * Gets the value of the unitMaterialCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitMaterialCost() {
        return unitMaterialCost;
    }

    /**
     * Sets the value of the unitMaterialCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitMaterialCost(Money value) {
        this.unitMaterialCost = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnitType(UnitType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the materialComponents property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialComponents }
     *     
     */
    public MaterialComponents getMaterialComponents() {
        return materialComponents;
    }

    /**
     * Sets the value of the materialComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialComponents }
     *     
     */
    public void setMaterialComponents(MaterialComponents value) {
        this.materialComponents = value;
    }

    /**
     * Gets the value of the laborComponents property.
     * 
     * @return
     *     possible object is
     *     {@link LaborComponents }
     *     
     */
    public LaborComponents getLaborComponents() {
        return laborComponents;
    }

    /**
     * Sets the value of the laborComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborComponents }
     *     
     */
    public void setLaborComponents(LaborComponents value) {
        this.laborComponents = value;
    }

    /**
     * Gets the value of the subUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SubUnits }
     *     
     */
    public SubUnits getSubUnits() {
        return subUnits;
    }

    /**
     * Sets the value of the subUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubUnits }
     *     
     */
    public void setSubUnits(SubUnits value) {
        this.subUnits = value;
    }

    /**
     * Gets the value of the constituentUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ConstituentUnits }
     *     
     */
    public ConstituentUnits getConstituentUnits() {
        return constituentUnits;
    }

    /**
     * Sets the value of the constituentUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstituentUnits }
     *     
     */
    public void setConstituentUnits(ConstituentUnits value) {
        this.constituentUnits = value;
    }

    /**
     * Gets the value of the cprAllocations property.
     * 
     * @return
     *     possible object is
     *     {@link CPRAllocations }
     *     
     */
    public CPRAllocations getCPRAllocations() {
        return cprAllocations;
    }

    /**
     * Sets the value of the cprAllocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPRAllocations }
     *     
     */
    public void setCPRAllocations(CPRAllocations value) {
        this.cprAllocations = value;
    }

    /**
     * Gets the value of the requiredAbilities property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredAbilities }
     *     
     */
    public RequiredAbilities getRequiredAbilities() {
        return requiredAbilities;
    }

    /**
     * Sets the value of the requiredAbilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredAbilities }
     *     
     */
    public void setRequiredAbilities(RequiredAbilities value) {
        this.requiredAbilities = value;
    }

}
