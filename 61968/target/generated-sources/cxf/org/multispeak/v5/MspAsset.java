
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.AssetStatus;


/**
 * This is the abstract class from which assets inherit.
 * 
 * <p>Java class for mspAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="assetType" type="{http://www.multispeak.org/V5.0}assetType" minOccurs="0"/>
 *         &lt;element name="assetStatus" type="{http://www.multispeak.org/V5.0/enumerations}assetStatus" minOccurs="0"/>
 *         &lt;element name="assetDetails" type="{http://www.multispeak.org/V5.0}assetDetails" minOccurs="0"/>
 *         &lt;element name="assetAction" type="{http://www.multispeak.org/V5.0}assetHistoryEvent" minOccurs="0"/>
 *         &lt;element name="assetHistoryEvents" type="{http://www.multispeak.org/V5.0}assetHistoryEvents" minOccurs="0"/>
 *         &lt;element name="assetLocation" type="{http://www.multispeak.org/V5.0}assetLocation" minOccurs="0"/>
 *         &lt;element name="assetLocationHistoryItems" type="{http://www.multispeak.org/V5.0}assetLocationHistoryItems" minOccurs="0"/>
 *         &lt;element name="organizationAssociations" type="{http://www.multispeak.org/V5.0}organizationAssociations" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/V5.0}attachments" minOccurs="0"/>
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
@XmlType(name = "mspAsset", propOrder = {
    "assetType",
    "assetStatus",
    "assetDetails",
    "assetAction",
    "assetHistoryEvents",
    "assetLocation",
    "assetLocationHistoryItems",
    "organizationAssociations",
    "attachments"
})
@XmlSeeAlso({
    Asset.class,
    LocationTrackingDevice.class,
    Capacitor.class,
    SurgeArrestor.class,
    Anchor.class,
    Thermostat.class,
    PowerMonitor.class,
    Substation.class,
    MspSwitchingDevice.class,
    Regulator.class,
    PremisesDisplay.class,
    EquipmentItem.class,
    MspDevice.class,
    MeterBase.class,
    Transformer.class
})
public abstract class MspAsset
    extends MspObject
{

    protected AssetType assetType;
    protected AssetStatus assetStatus;
    protected AssetDetails assetDetails;
    protected AssetHistoryEvent assetAction;
    protected AssetHistoryEvents assetHistoryEvents;
    protected AssetLocation assetLocation;
    protected AssetLocationHistoryItems assetLocationHistoryItems;
    protected OrganizationAssociations organizationAssociations;
    protected Attachments attachments;

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAssetType(AssetType value) {
        this.assetType = value;
    }

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssetStatus }
     *     
     */
    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetStatus }
     *     
     */
    public void setAssetStatus(AssetStatus value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the assetDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AssetDetails }
     *     
     */
    public AssetDetails getAssetDetails() {
        return assetDetails;
    }

    /**
     * Sets the value of the assetDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetDetails }
     *     
     */
    public void setAssetDetails(AssetDetails value) {
        this.assetDetails = value;
    }

    /**
     * Gets the value of the assetAction property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHistoryEvent }
     *     
     */
    public AssetHistoryEvent getAssetAction() {
        return assetAction;
    }

    /**
     * Sets the value of the assetAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHistoryEvent }
     *     
     */
    public void setAssetAction(AssetHistoryEvent value) {
        this.assetAction = value;
    }

    /**
     * Gets the value of the assetHistoryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHistoryEvents }
     *     
     */
    public AssetHistoryEvents getAssetHistoryEvents() {
        return assetHistoryEvents;
    }

    /**
     * Sets the value of the assetHistoryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHistoryEvents }
     *     
     */
    public void setAssetHistoryEvents(AssetHistoryEvents value) {
        this.assetHistoryEvents = value;
    }

    /**
     * Gets the value of the assetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLocation }
     *     
     */
    public AssetLocation getAssetLocation() {
        return assetLocation;
    }

    /**
     * Sets the value of the assetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLocation }
     *     
     */
    public void setAssetLocation(AssetLocation value) {
        this.assetLocation = value;
    }

    /**
     * Gets the value of the assetLocationHistoryItems property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLocationHistoryItems }
     *     
     */
    public AssetLocationHistoryItems getAssetLocationHistoryItems() {
        return assetLocationHistoryItems;
    }

    /**
     * Sets the value of the assetLocationHistoryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLocationHistoryItems }
     *     
     */
    public void setAssetLocationHistoryItems(AssetLocationHistoryItems value) {
        this.assetLocationHistoryItems = value;
    }

    /**
     * Gets the value of the organizationAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAssociations }
     *     
     */
    public OrganizationAssociations getOrganizationAssociations() {
        return organizationAssociations;
    }

    /**
     * Sets the value of the organizationAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAssociations }
     *     
     */
    public void setOrganizationAssociations(OrganizationAssociations value) {
        this.organizationAssociations = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

}
