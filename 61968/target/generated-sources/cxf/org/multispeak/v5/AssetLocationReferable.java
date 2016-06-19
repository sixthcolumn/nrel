
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for assetLocationReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetLocationReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="assetRef" type="{http://www.multispeak.org/V5.0}assetRef"/>
 *         &lt;element name="objectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="assetLocation" type="{http://www.multispeak.org/V5.0}assetLocation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetLocationReferable", propOrder = {
    "assetRef",
    "objectRef",
    "assetLocation"
})
public class AssetLocationReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected AssetRef assetRef;
    @XmlElement(required = true)
    protected ObjectRef objectRef;
    @XmlElement(required = true)
    protected AssetLocation assetLocation;

    /**
     * Gets the value of the assetRef property.
     * 
     * @return
     *     possible object is
     *     {@link AssetRef }
     *     
     */
    public AssetRef getAssetRef() {
        return assetRef;
    }

    /**
     * Sets the value of the assetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetRef }
     *     
     */
    public void setAssetRef(AssetRef value) {
        this.assetRef = value;
    }

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setObjectRef(ObjectRef value) {
        this.objectRef = value;
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

}
