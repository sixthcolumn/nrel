
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * <p>Java class for securityLight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityLight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="lightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wattage" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformerBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "securityLight", propOrder = {
    "lightType",
    "wattage",
    "brightness",
    "sequence",
    "description",
    "transformerBankID",
    "assetData",
    "materialManagementAssemblyID"
})
public class SecurityLight
    extends MspElectricPoint
{

    protected String lightType;
    protected RealPower wattage;
    protected Float brightness;
    protected String sequence;
    protected String description;
    protected ObjectID transformerBankID;
    protected AssetData assetData;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the lightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightType() {
        return lightType;
    }

    /**
     * Sets the value of the lightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightType(String value) {
        this.lightType = value;
    }

    /**
     * Gets the value of the wattage property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getWattage() {
        return wattage;
    }

    /**
     * Sets the value of the wattage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setWattage(RealPower value) {
        this.wattage = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBrightness(Float value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
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

    /**
     * Gets the value of the transformerBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTransformerBankID() {
        return transformerBankID;
    }

    /**
     * Sets the value of the transformerBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTransformerBankID(ObjectID value) {
        this.transformerBankID = value;
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
