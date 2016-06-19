
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the definition of a piece of equipment that can be associated with a crew (resource).  The equipment ID is contained in the object ID for each piece of equipment.  The human-readable name for this equipmentItem is included in the equipmentItem.primaryIdentifier. Note that vehicles are included in the definition of equipmentItems. Thus a truck might be an equipmentItem with equipmentType "Line Truck" and a primaryIdentifier (truck number) of "27".
 * 
 * <p>Java class for equipmentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipmentItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="equipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCompanyOwned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LTDeviceRef" type="{http://www.multispeak.org/V5.0}locationTrackingDeviceRef" minOccurs="0"/>
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
@XmlType(name = "equipmentItem", propOrder = {
    "equipmentType",
    "isCompanyOwned",
    "ltDeviceRef"
})
public class EquipmentItem
    extends MspAsset
{

    protected String equipmentType;
    protected Boolean isCompanyOwned;
    @XmlElement(name = "LTDeviceRef")
    protected LocationTrackingDeviceRef ltDeviceRef;

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the isCompanyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompanyOwned() {
        return isCompanyOwned;
    }

    /**
     * Sets the value of the isCompanyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompanyOwned(Boolean value) {
        this.isCompanyOwned = value;
    }

    /**
     * Gets the value of the ltDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTrackingDeviceRef }
     *     
     */
    public LocationTrackingDeviceRef getLTDeviceRef() {
        return ltDeviceRef;
    }

    /**
     * Sets the value of the ltDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTrackingDeviceRef }
     *     
     */
    public void setLTDeviceRef(LocationTrackingDeviceRef value) {
        this.ltDeviceRef = value;
    }

}
