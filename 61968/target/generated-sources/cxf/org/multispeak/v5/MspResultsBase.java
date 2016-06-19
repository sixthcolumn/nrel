
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.NetworkModelRef;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.LoadConnection;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.ResultsType;


/**
 * <p>Java class for mspResultsBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspResultsBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="resultsType" type="{http://www.multispeak.org/V5.0/enumerations}resultsType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="networkModelRef" type="{http://www.multispeak.org/V5.0/commonTypes}networkModelRef" minOccurs="0"/>
 *         &lt;element name="parentID" type="{http://www.multispeak.org/V5.0/commonTypes}networkModelRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="loadConnection" type="{http://www.multispeak.org/V5.0/enumerations}loadConnection" minOccurs="0"/>
 *         &lt;element name="equipmentRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="distanceFromSource" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="sectionLength" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="baseVoltageA" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="baseVoltageB" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="baseVoltageC" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="baseVoltageBalanced" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="basePower" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
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
@XmlType(name = "mspResultsBase", propOrder = {
    "resultsType",
    "source",
    "substationRef",
    "feederRef",
    "networkModelRef",
    "parentID",
    "phaseCode",
    "loadConnection",
    "equipmentRef",
    "distanceFromSource",
    "sectionLength",
    "baseVoltageA",
    "baseVoltageB",
    "baseVoltageC",
    "baseVoltageBalanced",
    "basePower"
})
@XmlSeeAlso({
    LoadFlowResult.class,
    ShortCircuitAnalysisResult.class
})
public abstract class MspResultsBase
    extends MspObject
{

    protected ResultsType resultsType;
    protected String source;
    protected SubstationRef substationRef;
    protected ObjectRef feederRef;
    protected NetworkModelRef networkModelRef;
    protected NetworkModelRef parentID;
    protected PhaseCode phaseCode;
    protected LoadConnection loadConnection;
    protected ObjectRef equipmentRef;
    protected Length distanceFromSource;
    protected Length sectionLength;
    protected Voltage baseVoltageA;
    protected Voltage baseVoltageB;
    protected Voltage baseVoltageC;
    protected Voltage baseVoltageBalanced;
    protected ApparentPower basePower;

    /**
     * Gets the value of the resultsType property.
     * 
     * @return
     *     possible object is
     *     {@link ResultsType }
     *     
     */
    public ResultsType getResultsType() {
        return resultsType;
    }

    /**
     * Sets the value of the resultsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsType }
     *     
     */
    public void setResultsType(ResultsType value) {
        this.resultsType = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the substationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubstationRef }
     *     
     */
    public SubstationRef getSubstationRef() {
        return substationRef;
    }

    /**
     * Sets the value of the substationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstationRef }
     *     
     */
    public void setSubstationRef(SubstationRef value) {
        this.substationRef = value;
    }

    /**
     * Gets the value of the feederRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getFeederRef() {
        return feederRef;
    }

    /**
     * Sets the value of the feederRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setFeederRef(ObjectRef value) {
        this.feederRef = value;
    }

    /**
     * Gets the value of the networkModelRef property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkModelRef }
     *     
     */
    public NetworkModelRef getNetworkModelRef() {
        return networkModelRef;
    }

    /**
     * Sets the value of the networkModelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkModelRef }
     *     
     */
    public void setNetworkModelRef(NetworkModelRef value) {
        this.networkModelRef = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkModelRef }
     *     
     */
    public NetworkModelRef getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkModelRef }
     *     
     */
    public void setParentID(NetworkModelRef value) {
        this.parentID = value;
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
     * Gets the value of the loadConnection property.
     * 
     * @return
     *     possible object is
     *     {@link LoadConnection }
     *     
     */
    public LoadConnection getLoadConnection() {
        return loadConnection;
    }

    /**
     * Sets the value of the loadConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadConnection }
     *     
     */
    public void setLoadConnection(LoadConnection value) {
        this.loadConnection = value;
    }

    /**
     * Gets the value of the equipmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Sets the value of the equipmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEquipmentRef(ObjectRef value) {
        this.equipmentRef = value;
    }

    /**
     * Gets the value of the distanceFromSource property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getDistanceFromSource() {
        return distanceFromSource;
    }

    /**
     * Sets the value of the distanceFromSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setDistanceFromSource(Length value) {
        this.distanceFromSource = value;
    }

    /**
     * Gets the value of the sectionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getSectionLength() {
        return sectionLength;
    }

    /**
     * Sets the value of the sectionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setSectionLength(Length value) {
        this.sectionLength = value;
    }

    /**
     * Gets the value of the baseVoltageA property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageA() {
        return baseVoltageA;
    }

    /**
     * Sets the value of the baseVoltageA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageA(Voltage value) {
        this.baseVoltageA = value;
    }

    /**
     * Gets the value of the baseVoltageB property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageB() {
        return baseVoltageB;
    }

    /**
     * Sets the value of the baseVoltageB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageB(Voltage value) {
        this.baseVoltageB = value;
    }

    /**
     * Gets the value of the baseVoltageC property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageC() {
        return baseVoltageC;
    }

    /**
     * Sets the value of the baseVoltageC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageC(Voltage value) {
        this.baseVoltageC = value;
    }

    /**
     * Gets the value of the baseVoltageBalanced property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getBaseVoltageBalanced() {
        return baseVoltageBalanced;
    }

    /**
     * Sets the value of the baseVoltageBalanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setBaseVoltageBalanced(Voltage value) {
        this.baseVoltageBalanced = value;
    }

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setBasePower(ApparentPower value) {
        this.basePower = value;
    }

}
