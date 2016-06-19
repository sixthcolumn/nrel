
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatialDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spatialDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="geometry" type="{http://www.multispeak.org/V5.0}geometry"/>
 *         &lt;element name="locationInformation" type="{http://www.multispeak.org/V5.0}locationInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spatialDetails", propOrder = {
    "geometry",
    "locationInformation"
})
public class SpatialDetails
    extends MspReferable
{

    @XmlElement(required = true)
    protected Geometry geometry;
    protected LocationInformation locationInformation;

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
     * Gets the value of the locationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInformation }
     *     
     */
    public LocationInformation getLocationInformation() {
        return locationInformation;
    }

    /**
     * Sets the value of the locationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInformation }
     *     
     */
    public void setLocationInformation(LocationInformation value) {
        this.locationInformation = value;
    }

}
