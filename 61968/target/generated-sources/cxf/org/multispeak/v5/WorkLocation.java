
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Address;
import org.multispeak.v5_0.commontypes.GPSLocation;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for workLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.multispeak.org/V5.0/commonTypes}address" minOccurs="0"/>
 *         &lt;element name="GPSLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GPSLocation" minOccurs="0"/>
 *         &lt;element name="geometry" type="{http://www.multispeak.org/V5.0}geometry" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplementalNotes" type="{http://www.multispeak.org/V5.0}supplementalNotes" minOccurs="0"/>
 *         &lt;element name="locationInformation" type="{http://www.multispeak.org/V5.0}locationInformation" minOccurs="0"/>
 *         &lt;element name="locationReferences" type="{http://www.multispeak.org/V5.0}locationReferences" minOccurs="0"/>
 *         &lt;element name="locationContact" type="{http://www.multispeak.org/V5.0}locationContact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workLocation", propOrder = {
    "address",
    "gpsLocation",
    "geometry",
    "gridLocation",
    "locationComment",
    "supplementalNotes",
    "locationInformation",
    "locationReferences",
    "locationContact"
})
public class WorkLocation
    extends MspExtensible
{

    protected Address address;
    @XmlElement(name = "GPSLocation")
    protected GPSLocation gpsLocation;
    protected Geometry geometry;
    protected String gridLocation;
    protected String locationComment;
    protected SupplementalNotes supplementalNotes;
    protected LocationInformation locationInformation;
    protected LocationReferences locationReferences;
    protected LocationContact locationContact;

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
     * Gets the value of the locationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationComment() {
        return locationComment;
    }

    /**
     * Sets the value of the locationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationComment(String value) {
        this.locationComment = value;
    }

    /**
     * Gets the value of the supplementalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalNotes }
     *     
     */
    public SupplementalNotes getSupplementalNotes() {
        return supplementalNotes;
    }

    /**
     * Sets the value of the supplementalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalNotes }
     *     
     */
    public void setSupplementalNotes(SupplementalNotes value) {
        this.supplementalNotes = value;
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

    /**
     * Gets the value of the locationContact property.
     * 
     * @return
     *     possible object is
     *     {@link LocationContact }
     *     
     */
    public LocationContact getLocationContact() {
        return locationContact;
    }

    /**
     * Sets the value of the locationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationContact }
     *     
     */
    public void setLocationContact(LocationContact value) {
        this.locationContact = value;
    }

}
