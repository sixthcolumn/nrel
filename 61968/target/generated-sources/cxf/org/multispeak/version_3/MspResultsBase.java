
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspResultsBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspResultsBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="resultsType" type="{http://www.multispeak.org/Version_3.0}resultsType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_3.0}eaLoc" minOccurs="0"/>
 *         &lt;element name="parentID" type="{http://www.multispeak.org/Version_3.0}objectRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="loadCon" type="{http://www.multispeak.org/Version_3.0}ldCon" minOccurs="0"/>
 *         &lt;element name="equipRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milesFromSrc" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sectionLength" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="baseKvA" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="baseKvB" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="baseKvC" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="baseKvBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="basePower" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "mspResultsBase", propOrder = {
    "resultsType",
    "source",
    "feeder",
    "eaLoc",
    "parentID",
    "phaseCode",
    "loadCon",
    "equipRef",
    "milesFromSrc",
    "sectionLength",
    "baseKvA",
    "baseKvB",
    "baseKvC",
    "baseKvBal",
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
    protected String feeder;
    protected EaLoc eaLoc;
    protected ObjectRef parentID;
    protected PhaseCd phaseCode;
    protected LdCon loadCon;
    protected String equipRef;
    protected Float milesFromSrc;
    protected Float sectionLength;
    protected Float baseKvA;
    protected Float baseKvB;
    protected Float baseKvC;
    protected Float baseKvBal;
    protected Float basePower;

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
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the eaLoc property.
     * 
     * @return
     *     possible object is
     *     {@link EaLoc }
     *     
     */
    public EaLoc getEaLoc() {
        return eaLoc;
    }

    /**
     * Sets the value of the eaLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaLoc }
     *     
     */
    public void setEaLoc(EaLoc value) {
        this.eaLoc = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setParentID(ObjectRef value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhaseCode(PhaseCd value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the loadCon property.
     * 
     * @return
     *     possible object is
     *     {@link LdCon }
     *     
     */
    public LdCon getLoadCon() {
        return loadCon;
    }

    /**
     * Sets the value of the loadCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdCon }
     *     
     */
    public void setLoadCon(LdCon value) {
        this.loadCon = value;
    }

    /**
     * Gets the value of the equipRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipRef() {
        return equipRef;
    }

    /**
     * Sets the value of the equipRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipRef(String value) {
        this.equipRef = value;
    }

    /**
     * Gets the value of the milesFromSrc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMilesFromSrc() {
        return milesFromSrc;
    }

    /**
     * Sets the value of the milesFromSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMilesFromSrc(Float value) {
        this.milesFromSrc = value;
    }

    /**
     * Gets the value of the sectionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSectionLength() {
        return sectionLength;
    }

    /**
     * Sets the value of the sectionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSectionLength(Float value) {
        this.sectionLength = value;
    }

    /**
     * Gets the value of the baseKvA property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseKvA() {
        return baseKvA;
    }

    /**
     * Sets the value of the baseKvA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseKvA(Float value) {
        this.baseKvA = value;
    }

    /**
     * Gets the value of the baseKvB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseKvB() {
        return baseKvB;
    }

    /**
     * Sets the value of the baseKvB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseKvB(Float value) {
        this.baseKvB = value;
    }

    /**
     * Gets the value of the baseKvC property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseKvC() {
        return baseKvC;
    }

    /**
     * Sets the value of the baseKvC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseKvC(Float value) {
        this.baseKvC = value;
    }

    /**
     * Gets the value of the baseKvBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseKvBal() {
        return baseKvBal;
    }

    /**
     * Sets the value of the baseKvBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseKvBal(Float value) {
        this.baseKvBal = value;
    }

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBasePower(Float value) {
        this.basePower = value;
    }

}
