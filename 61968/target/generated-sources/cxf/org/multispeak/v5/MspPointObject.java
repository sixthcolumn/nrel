
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.gml.PointType;


/**
 * This is an abstract class for objects that exhibit point geometry.
 * 
 * <p>Java class for mspPointObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspPointObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/V5.0/gml}PointType" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rotation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "mspPointObject", propOrder = {
    "gmlLocation",
    "gpsLocation",
    "gridLocation",
    "rotation"
})
@XmlSeeAlso({
    ServiceLocation.class,
    LoadManagementDevice.class,
    PrimaryCabinet.class,
    MeasurementDevice.class,
    PowerSystemDevice.class,
    SecondaryJunctionBox.class,
    Pole.class,
    ScadaPoint.class,
    Premises.class,
    OutageDetectionDevice.class,
    GenericPointFeature.class,
    DownGuy.class,
    Riser.class,
    GenericAnnotationFeature.class,
    MspConnectivityPoint.class
})
public abstract class MspPointObject
    extends MspObject
{

    @XmlElement(name = "GMLLocation")
    protected PointType gmlLocation;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected String gridLocation;
    protected Float rotation;

    /**
     * Gets the value of the gmlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getGMLLocation() {
        return gmlLocation;
    }

    /**
     * Sets the value of the gmlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setGMLLocation(PointType value) {
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

}
