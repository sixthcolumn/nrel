
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for assetRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="assetType" type="{http://www.multispeak.org/V5.0}assetType"/>
 *         &lt;element name="assetRequestFields" type="{http://www.multispeak.org/V5.0}assetRequestFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetRequest", propOrder = {
    "assetType",
    "assetRequestFields"
})
public class AssetRequest
    extends MspExtensible
{

    @XmlElement(required = true)
    protected AssetType assetType;
    protected AssetRequestFields assetRequestFields;

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
     * Gets the value of the assetRequestFields property.
     * 
     * @return
     *     possible object is
     *     {@link AssetRequestFields }
     *     
     */
    public AssetRequestFields getAssetRequestFields() {
        return assetRequestFields;
    }

    /**
     * Sets the value of the assetRequestFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetRequestFields }
     *     
     */
    public void setAssetRequestFields(AssetRequestFields value) {
        this.assetRequestFields = value;
    }

}
