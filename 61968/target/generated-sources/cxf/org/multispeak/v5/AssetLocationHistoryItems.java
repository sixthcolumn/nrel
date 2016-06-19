
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the history of all locations of this asset.  It is expected that this element SHALL include all asset location history items.  This element SHALL NOT be used to carry only current asset location history items, that SHALL be carried in assetLocation.
 * 
 * <p>Java class for assetLocationHistoryItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetLocationHistoryItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetLocationHistoryItem" type="{http://www.multispeak.org/V5.0}assetLocationHistoryItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetLocationHistoryItems", propOrder = {
    "assetLocationHistoryItem"
})
public class AssetLocationHistoryItems {

    @XmlElement(required = true)
    protected List<AssetLocationHistoryItem> assetLocationHistoryItem;

    /**
     * Gets the value of the assetLocationHistoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetLocationHistoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetLocationHistoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLocationHistoryItem }
     * 
     * 
     */
    public List<AssetLocationHistoryItem> getAssetLocationHistoryItem() {
        if (assetLocationHistoryItem == null) {
            assetLocationHistoryItem = new ArrayList<AssetLocationHistoryItem>();
        }
        return this.assetLocationHistoryItem;
    }

}
