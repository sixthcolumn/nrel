
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Seconds;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for regulator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regulator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="vOut" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="voltageBandwidth" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="initialDelay" type="{http://www.multispeak.org/V5.0/commonTypes}seconds" minOccurs="0"/>
 *         &lt;element name="subsequentDelay" type="{http://www.multispeak.org/V5.0/commonTypes}seconds" minOccurs="0"/>
 *         &lt;element name="ldcR" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ldcX" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="fhHi" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="fhLo" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="reverseFlowR" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="reverseFlowX" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="regulatorBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "regulator", propOrder = {
    "eaEquipment",
    "phaseCode",
    "vOut",
    "voltageBandwidth",
    "initialDelay",
    "subsequentDelay",
    "ldcR",
    "ldcX",
    "fhHi",
    "fhLo",
    "reverseFlowR",
    "reverseFlowX",
    "materialManagementAssemblyID",
    "regulatorBankID"
})
public class Regulator
    extends MspAsset
{

    protected EquipmentCatalogRef eaEquipment;
    protected PhaseCode phaseCode;
    protected Voltage vOut;
    protected Voltage voltageBandwidth;
    protected Seconds initialDelay;
    protected Seconds subsequentDelay;
    protected Voltage ldcR;
    protected Voltage ldcX;
    protected Voltage fhHi;
    protected Voltage fhLo;
    protected Voltage reverseFlowR;
    protected Voltage reverseFlowX;
    protected ObjectID materialManagementAssemblyID;
    protected ObjectID regulatorBankID;

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
     * Gets the value of the vOut property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVOut() {
        return vOut;
    }

    /**
     * Sets the value of the vOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVOut(Voltage value) {
        this.vOut = value;
    }

    /**
     * Gets the value of the voltageBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getVoltageBandwidth() {
        return voltageBandwidth;
    }

    /**
     * Sets the value of the voltageBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setVoltageBandwidth(Voltage value) {
        this.voltageBandwidth = value;
    }

    /**
     * Gets the value of the initialDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getInitialDelay() {
        return initialDelay;
    }

    /**
     * Sets the value of the initialDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setInitialDelay(Seconds value) {
        this.initialDelay = value;
    }

    /**
     * Gets the value of the subsequentDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getSubsequentDelay() {
        return subsequentDelay;
    }

    /**
     * Sets the value of the subsequentDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setSubsequentDelay(Seconds value) {
        this.subsequentDelay = value;
    }

    /**
     * Gets the value of the ldcR property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLdcR() {
        return ldcR;
    }

    /**
     * Sets the value of the ldcR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLdcR(Voltage value) {
        this.ldcR = value;
    }

    /**
     * Gets the value of the ldcX property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLdcX() {
        return ldcX;
    }

    /**
     * Sets the value of the ldcX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLdcX(Voltage value) {
        this.ldcX = value;
    }

    /**
     * Gets the value of the fhHi property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getFhHi() {
        return fhHi;
    }

    /**
     * Sets the value of the fhHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setFhHi(Voltage value) {
        this.fhHi = value;
    }

    /**
     * Gets the value of the fhLo property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getFhLo() {
        return fhLo;
    }

    /**
     * Sets the value of the fhLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setFhLo(Voltage value) {
        this.fhLo = value;
    }

    /**
     * Gets the value of the reverseFlowR property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getReverseFlowR() {
        return reverseFlowR;
    }

    /**
     * Sets the value of the reverseFlowR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setReverseFlowR(Voltage value) {
        this.reverseFlowR = value;
    }

    /**
     * Gets the value of the reverseFlowX property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getReverseFlowX() {
        return reverseFlowX;
    }

    /**
     * Sets the value of the reverseFlowX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setReverseFlowX(Voltage value) {
        this.reverseFlowX = value;
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
     * Gets the value of the regulatorBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getRegulatorBankID() {
        return regulatorBankID;
    }

    /**
     * Sets the value of the regulatorBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setRegulatorBankID(ObjectID value) {
        this.regulatorBankID = value;
    }

}
