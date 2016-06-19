
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ConnectivityModelGroup;


/**
 * <p>Java class for mspMultiGeometryObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMultiGeometryObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="geometry" type="{http://www.multispeak.org/V5.0}geometry"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rotation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="connectivityModelGroup" type="{http://www.multispeak.org/V5.0/commonTypes}connectivityModelGroup" minOccurs="0"/>
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
@XmlType(name = "mspMultiGeometryObject", propOrder = {
    "geometry",
    "gridLocation",
    "rotation",
    "connectivityModelGroup"
})
@XmlSeeAlso({
    Station.class
})
public abstract class MspMultiGeometryObject
    extends MspObject
{

    @XmlElement(required = true)
    protected Geometry geometry;
    protected String gridLocation;
    protected Float rotation;
    protected ConnectivityModelGroup connectivityModelGroup;

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRotation(Float value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the connectivityModelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityModelGroup }
     *     
     */
    public ConnectivityModelGroup getConnectivityModelGroup() {
        return connectivityModelGroup;
    }

    /**
     * Sets the value of the connectivityModelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityModelGroup }
     *     
     */
    public void setConnectivityModelGroup(ConnectivityModelGroup value) {
        this.connectivityModelGroup = value;
    }

}
