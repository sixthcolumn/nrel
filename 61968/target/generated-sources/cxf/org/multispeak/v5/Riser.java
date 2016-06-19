
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Height;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for riser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="constructionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riserHeight" type="{http://www.multispeak.org/V5.0/commonTypes}height" minOccurs="0"/>
 *         &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "riser", propOrder = {
    "constructionType",
    "riserHeight",
    "material",
    "assetData",
    "materialManagementAssemblyID"
})
public class Riser
    extends MspPointObject
{

    protected String constructionType;
    protected Height riserHeight;
    protected String material;
    protected AssetData assetData;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the constructionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionType() {
        return constructionType;
    }

    /**
     * Sets the value of the constructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionType(String value) {
        this.constructionType = value;
    }

    /**
     * Gets the value of the riserHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getRiserHeight() {
        return riserHeight;
    }

    /**
     * Sets the value of the riserHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setRiserHeight(Height value) {
        this.riserHeight = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
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
