
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Angle;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.commontypes.GraphicSymbol;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.enumerations.ConstructionGrade;
import org.multispeak.v5_0.enumerations.ConstructionType;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.PoleUse;
import org.multispeak.v5_0.enumerations.StationStatus;


/**
 * This is a location where work will be done or equipment installed.  The human-readable name for this station, previously called stationName, SHALL be carried in the station.primaryIdentifier. This identifier MUST be unique within the job.
 * 
 * <p>Java class for station complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="station">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMultiGeometryObject">
 *       &lt;sequence>
 *         &lt;element name="stationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="feederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="poleUse" type="{http://www.multispeak.org/V5.0/enumerations}poleUse" minOccurs="0"/>
 *         &lt;element name="graphicSymbol" type="{http://www.multispeak.org/V5.0/commonTypes}graphicSymbol" minOccurs="0"/>
 *         &lt;element name="constructionType" type="{http://www.multispeak.org/V5.0/enumerations}constructionType" minOccurs="0"/>
 *         &lt;element name="stationStatus" type="{http://www.multispeak.org/V5.0/enumerations}stationStatus" minOccurs="0"/>
 *         &lt;element name="constructionGrade" type="{http://www.multispeak.org/V5.0/enumerations}constructionGrade" minOccurs="0"/>
 *         &lt;element name="angle" type="{http://www.multispeak.org/V5.0/commonTypes}angle" minOccurs="0"/>
 *         &lt;element name="isTap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="terrain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annotationList" type="{http://www.multispeak.org/V5.0}genericAnnotationFeatures" minOccurs="0"/>
 *         &lt;element name="backSpans" type="{http://www.multispeak.org/V5.0}backSpans" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/V5.0}attachments" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *         &lt;element name="CPRs" type="{http://www.multispeak.org/V5.0}CPRs" minOccurs="0"/>
 *         &lt;element name="assemblySource" type="{http://www.multispeak.org/V5.0}assemblySource" minOccurs="0"/>
 *         &lt;element name="spatialFeatures" type="{http://www.multispeak.org/V5.0}spatialFeatures" minOccurs="0"/>
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
@XmlType(name = "station", propOrder = {
    "stationTypeName",
    "substationRef",
    "feederRef",
    "phaseCode",
    "poleUse",
    "graphicSymbol",
    "constructionType",
    "stationStatus",
    "constructionGrade",
    "angle",
    "isTap",
    "terrain",
    "annotationList",
    "backSpans",
    "attachments",
    "gpsLocation",
    "cpRs",
    "assemblySource",
    "spatialFeatures"
})
public class Station
    extends MspMultiGeometryObject
{

    protected String stationTypeName;
    protected SubstationRef substationRef;
    protected ObjectRef feederRef;
    protected PhaseCode phaseCode;
    protected PoleUse poleUse;
    protected GraphicSymbol graphicSymbol;
    protected ConstructionType constructionType;
    protected StationStatus stationStatus;
    protected ConstructionGrade constructionGrade;
    protected Angle angle;
    protected Boolean isTap;
    protected String terrain;
    protected GenericAnnotationFeatures annotationList;
    protected BackSpans backSpans;
    protected Attachments attachments;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    @XmlElement(name = "CPRs")
    protected CPRs cpRs;
    protected AssemblySource assemblySource;
    protected SpatialFeatures spatialFeatures;

    /**
     * Gets the value of the stationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTypeName() {
        return stationTypeName;
    }

    /**
     * Sets the value of the stationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTypeName(String value) {
        this.stationTypeName = value;
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
     * Gets the value of the poleUse property.
     * 
     * @return
     *     possible object is
     *     {@link PoleUse }
     *     
     */
    public PoleUse getPoleUse() {
        return poleUse;
    }

    /**
     * Sets the value of the poleUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoleUse }
     *     
     */
    public void setPoleUse(PoleUse value) {
        this.poleUse = value;
    }

    /**
     * Gets the value of the graphicSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link GraphicSymbol }
     *     
     */
    public GraphicSymbol getGraphicSymbol() {
        return graphicSymbol;
    }

    /**
     * Sets the value of the graphicSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphicSymbol }
     *     
     */
    public void setGraphicSymbol(GraphicSymbol value) {
        this.graphicSymbol = value;
    }

    /**
     * Gets the value of the constructionType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionType }
     *     
     */
    public ConstructionType getConstructionType() {
        return constructionType;
    }

    /**
     * Sets the value of the constructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionType }
     *     
     */
    public void setConstructionType(ConstructionType value) {
        this.constructionType = value;
    }

    /**
     * Gets the value of the stationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StationStatus }
     *     
     */
    public StationStatus getStationStatus() {
        return stationStatus;
    }

    /**
     * Sets the value of the stationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationStatus }
     *     
     */
    public void setStationStatus(StationStatus value) {
        this.stationStatus = value;
    }

    /**
     * Gets the value of the constructionGrade property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionGrade }
     *     
     */
    public ConstructionGrade getConstructionGrade() {
        return constructionGrade;
    }

    /**
     * Sets the value of the constructionGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionGrade }
     *     
     */
    public void setConstructionGrade(ConstructionGrade value) {
        this.constructionGrade = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link Angle }
     *     
     */
    public Angle getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angle }
     *     
     */
    public void setAngle(Angle value) {
        this.angle = value;
    }

    /**
     * Gets the value of the isTap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTap() {
        return isTap;
    }

    /**
     * Sets the value of the isTap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTap(Boolean value) {
        this.isTap = value;
    }

    /**
     * Gets the value of the terrain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * Sets the value of the terrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerrain(String value) {
        this.terrain = value;
    }

    /**
     * Gets the value of the annotationList property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public GenericAnnotationFeatures getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAnnotationFeatures }
     *     
     */
    public void setAnnotationList(GenericAnnotationFeatures value) {
        this.annotationList = value;
    }

    /**
     * Gets the value of the backSpans property.
     * 
     * @return
     *     possible object is
     *     {@link BackSpans }
     *     
     */
    public BackSpans getBackSpans() {
        return backSpans;
    }

    /**
     * Sets the value of the backSpans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackSpans }
     *     
     */
    public void setBackSpans(BackSpans value) {
        this.backSpans = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GPSLocation }
     *     
     */
    public GPSLocation getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSLocation }
     *     
     */
    public void setGPSLocation(GPSLocation value) {
        this.gpsLocation = value;
    }

    /**
     * Gets the value of the cpRs property.
     * 
     * @return
     *     possible object is
     *     {@link CPRs }
     *     
     */
    public CPRs getCPRs() {
        return cpRs;
    }

    /**
     * Sets the value of the cpRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPRs }
     *     
     */
    public void setCPRs(CPRs value) {
        this.cpRs = value;
    }

    /**
     * Gets the value of the assemblySource property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblySource }
     *     
     */
    public AssemblySource getAssemblySource() {
        return assemblySource;
    }

    /**
     * Sets the value of the assemblySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblySource }
     *     
     */
    public void setAssemblySource(AssemblySource value) {
        this.assemblySource = value;
    }

    /**
     * Gets the value of the spatialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatures }
     *     
     */
    public SpatialFeatures getSpatialFeatures() {
        return spatialFeatures;
    }

    /**
     * Sets the value of the spatialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatures }
     *     
     */
    public void setSpatialFeatures(SpatialFeatures value) {
        this.spatialFeatures = value;
    }

}
