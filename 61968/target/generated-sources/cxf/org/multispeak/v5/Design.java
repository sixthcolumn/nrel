
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.ConstructionGrade;
import org.multispeak.v5_0.enumerations.DesignRole;
import org.multispeak.v5_0.enumerations.LoadingDistrict;


/**
 * A potential design for the anticipated work.
 * 
 * <p>Java class for design complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="design">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;sequence>
 *         &lt;element name="otherSpatialFeatures" type="{http://www.multispeak.org/V5.0}otherSpatialFeatures" minOccurs="0"/>
 *         &lt;element name="designRole" type="{http://www.multispeak.org/V5.0/enumerations}designRole" minOccurs="0"/>
 *         &lt;element name="workflowStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionGrade" type="{http://www.multispeak.org/V5.0/enumerations}constructionGrade" minOccurs="0"/>
 *         &lt;element name="loadingDistrict" type="{http://www.multispeak.org/V5.0/enumerations}loadingDistrict" minOccurs="0"/>
 *         &lt;element name="stations" type="{http://www.multispeak.org/V5.0}stations" minOccurs="0"/>
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
@XmlType(name = "design", propOrder = {
    "otherSpatialFeatures",
    "designRole",
    "workflowStatus",
    "constructionGrade",
    "loadingDistrict",
    "stations"
})
public class Design
    extends MspWork
{

    protected OtherSpatialFeatures otherSpatialFeatures;
    protected DesignRole designRole;
    protected String workflowStatus;
    protected ConstructionGrade constructionGrade;
    protected LoadingDistrict loadingDistrict;
    protected Stations stations;

    /**
     * Gets the value of the otherSpatialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSpatialFeatures }
     *     
     */
    public OtherSpatialFeatures getOtherSpatialFeatures() {
        return otherSpatialFeatures;
    }

    /**
     * Sets the value of the otherSpatialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSpatialFeatures }
     *     
     */
    public void setOtherSpatialFeatures(OtherSpatialFeatures value) {
        this.otherSpatialFeatures = value;
    }

    /**
     * Gets the value of the designRole property.
     * 
     * @return
     *     possible object is
     *     {@link DesignRole }
     *     
     */
    public DesignRole getDesignRole() {
        return designRole;
    }

    /**
     * Sets the value of the designRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignRole }
     *     
     */
    public void setDesignRole(DesignRole value) {
        this.designRole = value;
    }

    /**
     * Gets the value of the workflowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatus() {
        return workflowStatus;
    }

    /**
     * Sets the value of the workflowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatus(String value) {
        this.workflowStatus = value;
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
     * Gets the value of the loadingDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingDistrict }
     *     
     */
    public LoadingDistrict getLoadingDistrict() {
        return loadingDistrict;
    }

    /**
     * Sets the value of the loadingDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingDistrict }
     *     
     */
    public void setLoadingDistrict(LoadingDistrict value) {
        this.loadingDistrict = value;
    }

    /**
     * Gets the value of the stations property.
     * 
     * @return
     *     possible object is
     *     {@link Stations }
     *     
     */
    public Stations getStations() {
        return stations;
    }

    /**
     * Sets the value of the stations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stations }
     *     
     */
    public void setStations(Stations value) {
        this.stations = value;
    }

}
