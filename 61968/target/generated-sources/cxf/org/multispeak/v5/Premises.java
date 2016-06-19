
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is a building or portion of a building as stored in the GIS.
 * 
 * <p>Java class for premises complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premises">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcelID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="locationInformation" type="{http://www.multispeak.org/V5.0}locationInformation" minOccurs="0"/>
 *         &lt;element name="serviceLocations" type="{http://www.multispeak.org/V5.0}serviceLocations" minOccurs="0"/>
 *         &lt;element name="premisesServices" type="{http://www.multispeak.org/V5.0}premisesServices" minOccurs="0"/>
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
@XmlType(name = "premises", propOrder = {
    "description",
    "owner",
    "parcelID",
    "locationInformation",
    "serviceLocations",
    "premisesServices"
})
public class Premises
    extends MspPointObject
{

    protected String description;
    protected String owner;
    protected ObjectID parcelID;
    protected LocationInformation locationInformation;
    protected ServiceLocations serviceLocations;
    protected PremisesServices premisesServices;

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

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the parcelID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getParcelID() {
        return parcelID;
    }

    /**
     * Sets the value of the parcelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setParcelID(ObjectID value) {
        this.parcelID = value;
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
     * Gets the value of the serviceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocations }
     *     
     */
    public ServiceLocations getServiceLocations() {
        return serviceLocations;
    }

    /**
     * Sets the value of the serviceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocations }
     *     
     */
    public void setServiceLocations(ServiceLocations value) {
        this.serviceLocations = value;
    }

    /**
     * Gets the value of the premisesServices property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesServices }
     *     
     */
    public PremisesServices getPremisesServices() {
        return premisesServices;
    }

    /**
     * Sets the value of the premisesServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesServices }
     *     
     */
    public void setPremisesServices(PremisesServices value) {
        this.premisesServices = value;
    }

}
