
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A geographical location as expressed in a geographic coordinate system. The GPSLocation SHALL be expressed using the WGS84 datum. This object SHOULD be used for expressing all types of GPS data. 
 * 
 * <p>Java class for GPSLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPSLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GPSMetadata" type="{http://www.multispeak.org/V5.0/commonTypes}GPSMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GPSValidity" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPSLocation", propOrder = {
    "latitude",
    "longitude",
    "altitude",
    "gpsMetadata"
})
public class GPSLocation
    extends MspExtensible
{

    protected double latitude;
    protected double longitude;
    protected Double altitude;
    @XmlElement(name = "GPSMetadata")
    protected GPSMetadata gpsMetadata;
    @XmlAttribute(name = "GPSValidity")
    protected Boolean gpsValidity;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltitude(Double value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the gpsMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link GPSMetadata }
     *     
     */
    public GPSMetadata getGPSMetadata() {
        return gpsMetadata;
    }

    /**
     * Sets the value of the gpsMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPSMetadata }
     *     
     */
    public void setGPSMetadata(GPSMetadata value) {
        this.gpsMetadata = value;
    }

    /**
     * Gets the value of the gpsValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGPSValidity() {
        return gpsValidity;
    }

    /**
     * Sets the value of the gpsValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGPSValidity(Boolean value) {
        this.gpsValidity = value;
    }

}
