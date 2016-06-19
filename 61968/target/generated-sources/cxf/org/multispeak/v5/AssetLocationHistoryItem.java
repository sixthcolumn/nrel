
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for assetLocationHistoryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetLocationHistoryItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="assetLocation" type="{http://www.multispeak.org/V5.0}assetLocation"/>
 *         &lt;element name="assetLocationDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="supplementalNotes" type="{http://www.multispeak.org/V5.0}supplementalNotes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetLocationHistoryItem", propOrder = {
    "assetLocation",
    "assetLocationDateTime",
    "supplementalNotes"
})
public class AssetLocationHistoryItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected AssetLocation assetLocation;
    @XmlElement(required = true)
    protected XMLGregorianCalendar assetLocationDateTime;
    protected SupplementalNotes supplementalNotes;

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
     * Gets the value of the assetLocationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssetLocationDateTime() {
        return assetLocationDateTime;
    }

    /**
     * Sets the value of the assetLocationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssetLocationDateTime(XMLGregorianCalendar value) {
        this.assetLocationDateTime = value;
    }

    /**
     * Gets the value of the supplementalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalNotes }
     *     
     */
    public SupplementalNotes getSupplementalNotes() {
        return supplementalNotes;
    }

    /**
     * Sets the value of the supplementalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalNotes }
     *     
     */
    public void setSupplementalNotes(SupplementalNotes value) {
        this.supplementalNotes = value;
    }

}
