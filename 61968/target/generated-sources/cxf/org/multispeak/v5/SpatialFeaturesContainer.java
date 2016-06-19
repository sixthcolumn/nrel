
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a means to exchange a set of spatialFeatures along with the actions that are to be taken on them without knowing explicitly in advance which types of features are to be sent.
 * 
 * <p>Java class for spatialFeaturesContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatialFeaturesContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdSpatialFeatures" type="{http://www.multispeak.org/V5.0}spatialFeatures"/>
 *         &lt;element name="changedSpatialFeatures" type="{http://www.multispeak.org/V5.0}spatialFeatures"/>
 *         &lt;element name="deletedSpatialFeatures" type="{http://www.multispeak.org/V5.0}spatialFeatures"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatialFeaturesContainer", propOrder = {
    "createdSpatialFeatures",
    "changedSpatialFeatures",
    "deletedSpatialFeatures"
})
public class SpatialFeaturesContainer {

    @XmlElement(required = true)
    protected SpatialFeatures createdSpatialFeatures;
    @XmlElement(required = true)
    protected SpatialFeatures changedSpatialFeatures;
    @XmlElement(required = true)
    protected SpatialFeatures deletedSpatialFeatures;

    /**
     * Gets the value of the createdSpatialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatures }
     *     
     */
    public SpatialFeatures getCreatedSpatialFeatures() {
        return createdSpatialFeatures;
    }

    /**
     * Sets the value of the createdSpatialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatures }
     *     
     */
    public void setCreatedSpatialFeatures(SpatialFeatures value) {
        this.createdSpatialFeatures = value;
    }

    /**
     * Gets the value of the changedSpatialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatures }
     *     
     */
    public SpatialFeatures getChangedSpatialFeatures() {
        return changedSpatialFeatures;
    }

    /**
     * Sets the value of the changedSpatialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatures }
     *     
     */
    public void setChangedSpatialFeatures(SpatialFeatures value) {
        this.changedSpatialFeatures = value;
    }

    /**
     * Gets the value of the deletedSpatialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatures }
     *     
     */
    public SpatialFeatures getDeletedSpatialFeatures() {
        return deletedSpatialFeatures;
    }

    /**
     * Sets the value of the deletedSpatialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatures }
     *     
     */
    public void setDeletedSpatialFeatures(SpatialFeatures value) {
        this.deletedSpatialFeatures = value;
    }

}
