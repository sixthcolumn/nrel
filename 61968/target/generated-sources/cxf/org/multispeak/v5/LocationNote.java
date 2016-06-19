
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * These name value pairs identify notes that could apply to a service location or utility service.  Examples of locationNoteType entries include "Access Condition", "Meter Location", "Safety hazard" etc. The locationNoteSubtype  element gives additional options for this class of locationNoteType.
 * 
 * <p>Java class for locationNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationNote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="locationNoteType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locationNoteSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationNote", propOrder = {
    "locationNoteType",
    "locationNoteSubtype",
    "description"
})
public class LocationNote
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String locationNoteType;
    protected String locationNoteSubtype;
    protected String description;

    /**
     * Gets the value of the locationNoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNoteType() {
        return locationNoteType;
    }

    /**
     * Sets the value of the locationNoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNoteType(String value) {
        this.locationNoteType = value;
    }

    /**
     * Gets the value of the locationNoteSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNoteSubtype() {
        return locationNoteSubtype;
    }

    /**
     * Sets the value of the locationNoteSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNoteSubtype(String value) {
        this.locationNoteSubtype = value;
    }

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

}
