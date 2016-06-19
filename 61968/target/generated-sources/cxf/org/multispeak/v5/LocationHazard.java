
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.LocationHazardType;


/**
 * <p>Java class for locationHazard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationHazard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="locationHazardType" type="{http://www.multispeak.org/V5.0/enumerations}locationHazardType"/>
 *         &lt;element name="locationHazardSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazardText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationHazard", propOrder = {
    "locationHazardType",
    "locationHazardSubType",
    "hazardText"
})
public class LocationHazard
    extends MspExtensible
{

    @XmlElement(required = true)
    protected LocationHazardType locationHazardType;
    protected String locationHazardSubType;
    protected String hazardText;

    /**
     * Gets the value of the locationHazardType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationHazardType }
     *     
     */
    public LocationHazardType getLocationHazardType() {
        return locationHazardType;
    }

    /**
     * Sets the value of the locationHazardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationHazardType }
     *     
     */
    public void setLocationHazardType(LocationHazardType value) {
        this.locationHazardType = value;
    }

    /**
     * Gets the value of the locationHazardSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationHazardSubType() {
        return locationHazardSubType;
    }

    /**
     * Sets the value of the locationHazardSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationHazardSubType(String value) {
        this.locationHazardSubType = value;
    }

    /**
     * Gets the value of the hazardText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardText() {
        return hazardText;
    }

    /**
     * Sets the value of the hazardText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardText(String value) {
        this.hazardText = value;
    }

}
