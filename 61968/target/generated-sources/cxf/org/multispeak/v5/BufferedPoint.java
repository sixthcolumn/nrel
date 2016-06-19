
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.GMLLocation;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.commontypes.LengthUnitValue;


/**
 * This is the location around which objects are to be located within the buffereing distance specified using the radius element.
 * 
 * <p>Java class for bufferedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bufferedPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GMLLocation" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *         &lt;element name="radius" type="{http://www.multispeak.org/V5.0/commonTypes}lengthUnitValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bufferedPoint", propOrder = {
    "gmlLocation",
    "gpsLocation",
    "radius"
})
public class BufferedPoint {

    @XmlElement(name = "GMLLocation")
    protected GMLLocation gmlLocation;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected LengthUnitValue radius;

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLocation }
     *     
     */
    public GMLLocation getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLocation }
     *     
     */
    public void setGMLLocation(GMLLocation value) {
        this.gmlLocation = value;
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
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnitValue }
     *     
     */
    public LengthUnitValue getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitValue }
     *     
     */
    public void setRadius(LengthUnitValue value) {
        this.radius = value;
    }

}
