
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Address;
import org.multispeak.v5_0.commontypes.GMLLocation;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * The location of the asset.  Depending on the context, this might be the current location or the location at the time that an assetHistoryEvent occurred.
 * 
 * <p>Java class for assetLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.multispeak.org/V5.0/commonTypes}address" minOccurs="0"/>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GMLLocation" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationInformation" type="{http://www.multispeak.org/V5.0}locationInformation" minOccurs="0"/>
 *         &lt;element name="locationReferences" type="{http://www.multispeak.org/V5.0}locationReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetLocation", propOrder = {
    "address",
    "gmlLocation",
    "gpsLocation",
    "gridLocation",
    "locationInformation",
    "locationReferences"
})
public class AssetLocation
    extends MspExtensible
{

    protected Address address;
    @XmlElement(name = "GMLLocation")
    protected GMLLocation gmlLocation;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected String gridLocation;
    protected LocationInformation locationInformation;
    protected LocationReferences locationReferences;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

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

    /**
     * Gets the value of the locationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReferences }
     *     
     */
    public LocationReferences getLocationReferences() {
        return locationReferences;
    }

    /**
     * Sets the value of the locationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReferences }
     *     
     */
    public void setLocationReferences(LocationReferences value) {
        this.locationReferences = value;
    }

}
