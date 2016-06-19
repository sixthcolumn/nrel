
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ScadaPointType;
import org.multispeak.v5_0.enumerations.SpatialFeatureType;


/**
 * <p>Java class for scadaPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="scadaPointType" type="{http://www.multispeak.org/V5.0/enumerations}scadaPointType"/>
 *         &lt;element name="spatialFeatureID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="spatialFeatureType" type="{http://www.multispeak.org/V5.0/enumerations}spatialFeatureType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "scadaPoint", propOrder = {
    "scadaPointType",
    "spatialFeatureID",
    "spatialFeatureType",
    "description"
})
public class ScadaPoint
    extends MspPointObject
{

    @XmlElement(required = true)
    protected ScadaPointType scadaPointType;
    protected ObjectID spatialFeatureID;
    protected SpatialFeatureType spatialFeatureType;
    protected String description;

    /**
     * Gets the value of the scadaPointType property.
     * 
     * @return
     *     possible object is
     *     {@link ScadaPointType }
     *     
     */
    public ScadaPointType getScadaPointType() {
        return scadaPointType;
    }

    /**
     * Sets the value of the scadaPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScadaPointType }
     *     
     */
    public void setScadaPointType(ScadaPointType value) {
        this.scadaPointType = value;
    }

    /**
     * Gets the value of the spatialFeatureID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSpatialFeatureID() {
        return spatialFeatureID;
    }

    /**
     * Sets the value of the spatialFeatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSpatialFeatureID(ObjectID value) {
        this.spatialFeatureID = value;
    }

    /**
     * Gets the value of the spatialFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialFeatureType }
     *     
     */
    public SpatialFeatureType getSpatialFeatureType() {
        return spatialFeatureType;
    }

    /**
     * Sets the value of the spatialFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialFeatureType }
     *     
     */
    public void setSpatialFeatureType(SpatialFeatureType value) {
        this.spatialFeatureType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
