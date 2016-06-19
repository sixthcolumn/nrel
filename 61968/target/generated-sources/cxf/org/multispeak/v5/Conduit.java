
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ConduitMaterial;


/**
 * <p>Java class for conduit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conduit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspLineObject">
 *       &lt;sequence>
 *         &lt;element name="conduitDepth" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="conduitDiameter" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="conduitMaterial" type="{http://www.multispeak.org/V5.0/enumerations}conduitMaterial" minOccurs="0"/>
 *         &lt;element name="isEncased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conduitContentsRefs" type="{http://www.multispeak.org/V5.0}conduitContentsRefs" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
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
@XmlType(name = "conduit", propOrder = {
    "conduitDepth",
    "conduitDiameter",
    "conduitMaterial",
    "isEncased",
    "conduitContentsRefs",
    "materialManagementAssemblyID",
    "assetData"
})
public class Conduit
    extends MspLineObject
{

    protected Length conduitDepth;
    protected Length conduitDiameter;
    protected ConduitMaterial conduitMaterial;
    protected Boolean isEncased;
    protected ConduitContentsRefs conduitContentsRefs;
    protected ObjectID materialManagementAssemblyID;
    protected AssetData assetData;

    /**
     * Gets the value of the conduitDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getConduitDepth() {
        return conduitDepth;
    }

    /**
     * Sets the value of the conduitDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setConduitDepth(Length value) {
        this.conduitDepth = value;
    }

    /**
     * Gets the value of the conduitDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getConduitDiameter() {
        return conduitDiameter;
    }

    /**
     * Sets the value of the conduitDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setConduitDiameter(Length value) {
        this.conduitDiameter = value;
    }

    /**
     * Gets the value of the conduitMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link ConduitMaterial }
     *     
     */
    public ConduitMaterial getConduitMaterial() {
        return conduitMaterial;
    }

    /**
     * Sets the value of the conduitMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConduitMaterial }
     *     
     */
    public void setConduitMaterial(ConduitMaterial value) {
        this.conduitMaterial = value;
    }

    /**
     * Gets the value of the isEncased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEncased() {
        return isEncased;
    }

    /**
     * Sets the value of the isEncased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEncased(Boolean value) {
        this.isEncased = value;
    }

    /**
     * Gets the value of the conduitContentsRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ConduitContentsRefs }
     *     
     */
    public ConduitContentsRefs getConduitContentsRefs() {
        return conduitContentsRefs;
    }

    /**
     * Sets the value of the conduitContentsRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConduitContentsRefs }
     *     
     */
    public void setConduitContentsRefs(ConduitContentsRefs value) {
        this.conduitContentsRefs = value;
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

}
