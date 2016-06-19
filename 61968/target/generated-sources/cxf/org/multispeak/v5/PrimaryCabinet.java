
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This object is a primary voltage pad-mounted or vault mounted enclosure.  It may be just a junction box or it may be a manufactured structure, such as a piece of PMH-9 switchgear.  The primaryCabinet object lists information about the enclosure or object along with links to pieces of equipment that are contained in this object.  For instance for a piece of switchgear, there would be links in the cabinetContentsList to the switchingDeviceBanks that make up each switch.  For a transclosure, the cabinetContentsList owuld include a link to one or more transformerBanks contained in the transclosure.
 * 
 * <p>Java class for primaryCabinet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primaryCabinet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="structureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabinetContentsItems" type="{http://www.multispeak.org/V5.0}cabinetContentsItems" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "primaryCabinet", propOrder = {
    "structureType",
    "cabinetContentsItems",
    "assetData",
    "materialManagementAssemblyID"
})
public class PrimaryCabinet
    extends MspPointObject
{

    protected String structureType;
    protected CabinetContentsItems cabinetContentsItems;
    protected AssetData assetData;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureType(String value) {
        this.structureType = value;
    }

    /**
     * Gets the value of the cabinetContentsItems property.
     * 
     * @return
     *     possible object is
     *     {@link CabinetContentsItems }
     *     
     */
    public CabinetContentsItems getCabinetContentsItems() {
        return cabinetContentsItems;
    }

    /**
     * Sets the value of the cabinetContentsItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinetContentsItems }
     *     
     */
    public void setCabinetContentsItems(CabinetContentsItems value) {
        this.cabinetContentsItems = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
    }

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

}
