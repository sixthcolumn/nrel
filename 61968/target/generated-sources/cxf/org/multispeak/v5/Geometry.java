
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.GMLLines;
import org.multispeak.v5_0.commontypes.GMLPolygons;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geometry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="GMLPolygons" type="{http://www.multispeak.org/V5.0/commonTypes}GMLPolygons" minOccurs="0"/>
 *         &lt;element name="GMLLines" type="{http://www.multispeak.org/V5.0/commonTypes}GMLLines" minOccurs="0"/>
 *         &lt;element name="GMLLocations" type="{http://www.multispeak.org/V5.0}GMLLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geometry", propOrder = {
    "gmlPolygons",
    "gmlLines",
    "gmlLocations"
})
public class Geometry
    extends MspExtensible
{

    @XmlElement(name = "GMLPolygons")
    protected GMLPolygons gmlPolygons;
    @XmlElement(name = "GMLLines")
    protected GMLLines gmlLines;
    @XmlElement(name = "GMLLocations")
    protected GMLLocations gmlLocations;

    /**
     * Gets the value of the gmlPolygons property.
     * 
     * @return
     *     possible object is
     *     {@link GMLPolygons }
     *     
     */
    public GMLPolygons getGMLPolygons() {
        return gmlPolygons;
    }

    /**
     * Sets the value of the gmlPolygons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLPolygons }
     *     
     */
    public void setGMLPolygons(GMLPolygons value) {
        this.gmlPolygons = value;
    }

    /**
     * Gets the value of the gmlLines property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLines }
     *     
     */
    public GMLLines getGMLLines() {
        return gmlLines;
    }

    /**
     * Sets the value of the gmlLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLines }
     *     
     */
    public void setGMLLines(GMLLines value) {
        this.gmlLines = value;
    }

    /**
     * Gets the value of the gmlLocations property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLocations }
     *     
     */
    public GMLLocations getGMLLocations() {
        return gmlLocations;
    }

    /**
     * Sets the value of the gmlLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLocations }
     *     
     */
    public void setGMLLocations(GMLLocations value) {
        this.gmlLocations = value;
    }

}
