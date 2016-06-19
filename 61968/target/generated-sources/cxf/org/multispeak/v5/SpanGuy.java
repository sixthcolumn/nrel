
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Height;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.GuyWireType;


/**
 * <p>Java class for spanGuy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spanGuy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspLineObject">
 *       &lt;sequence>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="attachmentHeight" type="{http://www.multispeak.org/V5.0/commonTypes}height" minOccurs="0"/>
 *         &lt;element name="guyWireType" type="{http://www.multispeak.org/V5.0/enumerations}guyWireType" minOccurs="0"/>
 *         &lt;element name="guyWireSize" type="{http://www.multispeak.org/V5.0}guyWireSize" minOccurs="0"/>
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
@XmlType(name = "spanGuy", propOrder = {
    "materialManagementAssemblyID",
    "attachmentHeight",
    "guyWireType",
    "guyWireSize",
    "assetData"
})
public class SpanGuy
    extends MspLineObject
{

    protected ObjectID materialManagementAssemblyID;
    protected Height attachmentHeight;
    protected GuyWireType guyWireType;
    protected GuyWireSize guyWireSize;
    protected AssetData assetData;

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
     * Gets the value of the attachmentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getAttachmentHeight() {
        return attachmentHeight;
    }

    /**
     * Sets the value of the attachmentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setAttachmentHeight(Height value) {
        this.attachmentHeight = value;
    }

    /**
     * Gets the value of the guyWireType property.
     * 
     * @return
     *     possible object is
     *     {@link GuyWireType }
     *     
     */
    public GuyWireType getGuyWireType() {
        return guyWireType;
    }

    /**
     * Sets the value of the guyWireType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyWireType }
     *     
     */
    public void setGuyWireType(GuyWireType value) {
        this.guyWireType = value;
    }

    /**
     * Gets the value of the guyWireSize property.
     * 
     * @return
     *     possible object is
     *     {@link GuyWireSize }
     *     
     */
    public GuyWireSize getGuyWireSize() {
        return guyWireSize;
    }

    /**
     * Sets the value of the guyWireSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyWireSize }
     *     
     */
    public void setGuyWireSize(GuyWireSize value) {
        this.guyWireSize = value;
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
