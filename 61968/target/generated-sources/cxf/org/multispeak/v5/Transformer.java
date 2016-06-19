
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for transformer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="unitRatedPower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="transformerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="pcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="transformerBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="transformerWindings" type="{http://www.multispeak.org/V5.0}transformerWindings" minOccurs="0"/>
 *         &lt;element name="PCBTests" type="{http://www.multispeak.org/V5.0}PCBTests" minOccurs="0"/>
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
@XmlType(name = "transformer", propOrder = {
    "eaEquipment",
    "unitRatedPower",
    "transformerType",
    "status",
    "phases",
    "phaseCode",
    "pcb",
    "materialManagementAssemblyID",
    "transformerBankID",
    "transformerWindings",
    "pcbTests"
})
public class Transformer
    extends MspAsset
{

    protected EquipmentCatalogRef eaEquipment;
    protected ApparentPower unitRatedPower;
    protected String transformerType;
    protected String status;
    protected BigInteger phases;
    protected PhaseCode phaseCode;
    protected String pcb;
    protected ObjectID materialManagementAssemblyID;
    protected ObjectID transformerBankID;
    protected TransformerWindings transformerWindings;
    @XmlElement(name = "PCBTests")
    protected PCBTests pcbTests;

    /**
     * Gets the value of the eaEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getEaEquipment() {
        return eaEquipment;
    }

    /**
     * Sets the value of the eaEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setEaEquipment(EquipmentCatalogRef value) {
        this.eaEquipment = value;
    }

    /**
     * Gets the value of the unitRatedPower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getUnitRatedPower() {
        return unitRatedPower;
    }

    /**
     * Sets the value of the unitRatedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setUnitRatedPower(ApparentPower value) {
        this.unitRatedPower = value;
    }

    /**
     * Gets the value of the transformerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerType() {
        return transformerType;
    }

    /**
     * Sets the value of the transformerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerType(String value) {
        this.transformerType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhases(BigInteger value) {
        this.phases = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the pcb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcb() {
        return pcb;
    }

    /**
     * Sets the value of the pcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcb(String value) {
        this.pcb = value;
    }

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

    /**
     * Gets the value of the transformerBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTransformerBankID() {
        return transformerBankID;
    }

    /**
     * Sets the value of the transformerBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTransformerBankID(ObjectID value) {
        this.transformerBankID = value;
    }

    /**
     * Gets the value of the transformerWindings property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerWindings }
     *     
     */
    public TransformerWindings getTransformerWindings() {
        return transformerWindings;
    }

    /**
     * Sets the value of the transformerWindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerWindings }
     *     
     */
    public void setTransformerWindings(TransformerWindings value) {
        this.transformerWindings = value;
    }

    /**
     * Gets the value of the pcbTests property.
     * 
     * @return
     *     possible object is
     *     {@link PCBTests }
     *     
     */
    public PCBTests getPCBTests() {
        return pcbTests;
    }

    /**
     * Sets the value of the pcbTests property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCBTests }
     *     
     */
    public void setPCBTests(PCBTests value) {
        this.pcbTests = value;
    }

}
