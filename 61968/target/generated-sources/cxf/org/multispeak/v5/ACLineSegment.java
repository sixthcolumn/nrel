
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.ConstructionLevel;
import org.multispeak.v5_0.enumerations.LineRole;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for ACLineSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACLineSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricLine">
 *       &lt;sequence>
 *         &lt;element name="constructionLevel" type="{http://www.multispeak.org/V5.0/enumerations}constructionLevel"/>
 *         &lt;element name="lineRole" type="{http://www.multispeak.org/V5.0/enumerations}lineRole"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="operatingVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="phaseList" type="{http://www.multispeak.org/V5.0}phaseItems" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="cimACLineSegmentClasses" type="{http://www.multispeak.org/V5.0}cimACLineSegmentClasses" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
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
@XmlType(name = "ACLineSegment", propOrder = {
    "constructionLevel",
    "lineRole",
    "phaseCode",
    "operatingVoltage",
    "rating",
    "phaseList",
    "materialManagementAssemblyID",
    "cimACLineSegmentClasses",
    "assetData"
})
public class ACLineSegment
    extends MspElectricLine
{

    @XmlElement(required = true)
    protected ConstructionLevel constructionLevel;
    @XmlElement(required = true)
    protected LineRole lineRole;
    protected PhaseCode phaseCode;
    protected Voltage operatingVoltage;
    protected ApparentPower rating;
    protected PhaseItems phaseList;
    protected ObjectID materialManagementAssemblyID;
    protected CimACLineSegmentClasses cimACLineSegmentClasses;
    protected AssetData assetData;

    /**
     * Gets the value of the constructionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionLevel }
     *     
     */
    public ConstructionLevel getConstructionLevel() {
        return constructionLevel;
    }

    /**
     * Sets the value of the constructionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionLevel }
     *     
     */
    public void setConstructionLevel(ConstructionLevel value) {
        this.constructionLevel = value;
    }

    /**
     * Gets the value of the lineRole property.
     * 
     * @return
     *     possible object is
     *     {@link LineRole }
     *     
     */
    public LineRole getLineRole() {
        return lineRole;
    }

    /**
     * Sets the value of the lineRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRole }
     *     
     */
    public void setLineRole(LineRole value) {
        this.lineRole = value;
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
     * Gets the value of the operatingVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getOperatingVoltage() {
        return operatingVoltage;
    }

    /**
     * Sets the value of the operatingVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setOperatingVoltage(Voltage value) {
        this.operatingVoltage = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRating(ApparentPower value) {
        this.rating = value;
    }

    /**
     * Gets the value of the phaseList property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseItems }
     *     
     */
    public PhaseItems getPhaseList() {
        return phaseList;
    }

    /**
     * Sets the value of the phaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseItems }
     *     
     */
    public void setPhaseList(PhaseItems value) {
        this.phaseList = value;
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
     * Gets the value of the cimACLineSegmentClasses property.
     * 
     * @return
     *     possible object is
     *     {@link CimACLineSegmentClasses }
     *     
     */
    public CimACLineSegmentClasses getCimACLineSegmentClasses() {
        return cimACLineSegmentClasses;
    }

    /**
     * Sets the value of the cimACLineSegmentClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CimACLineSegmentClasses }
     *     
     */
    public void setCimACLineSegmentClasses(CimACLineSegmentClasses value) {
        this.cimACLineSegmentClasses = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
    }

}
