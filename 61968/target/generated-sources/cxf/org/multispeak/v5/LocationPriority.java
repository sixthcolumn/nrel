
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.LocationPriorityType;


/**
 * <p>Java class for locationPriority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationPriority">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="locationPriorityType" type="{http://www.multispeak.org/V5.0/enumerations}locationPriorityType"/>
 *         &lt;element name="locationPrioritySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationPriority", propOrder = {
    "locationPriorityType",
    "locationPrioritySubType",
    "priorityText"
})
public class LocationPriority
    extends MspExtensible
{

    @XmlElement(required = true)
    protected LocationPriorityType locationPriorityType;
    protected String locationPrioritySubType;
    protected String priorityText;

    /**
     * Gets the value of the locationPriorityType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationPriorityType }
     *     
     */
    public LocationPriorityType getLocationPriorityType() {
        return locationPriorityType;
    }

    /**
     * Sets the value of the locationPriorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationPriorityType }
     *     
     */
    public void setLocationPriorityType(LocationPriorityType value) {
        this.locationPriorityType = value;
    }

    /**
     * Gets the value of the locationPrioritySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationPrioritySubType() {
        return locationPrioritySubType;
    }

    /**
     * Sets the value of the locationPrioritySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationPrioritySubType(String value) {
        this.locationPrioritySubType = value;
    }

    /**
     * Gets the value of the priorityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityText() {
        return priorityText;
    }

    /**
     * Sets the value of the priorityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityText(String value) {
        this.priorityText = value;
    }

}
