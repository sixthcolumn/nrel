
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the history of all actions  that have been taken on this asset.  It is expected that this element SHALL include all asset history events.  This element SHALL NOT be used to carry ONLY the current asset history event, that SHALL be carried in assetAction.
 * 
 * <p>Java class for assetHistoryEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetHistoryEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetHistoryEvent" type="{http://www.multispeak.org/V5.0}assetHistoryEvent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetHistoryEvents", propOrder = {
    "assetHistoryEvent"
})
public class AssetHistoryEvents {

    @XmlElement(required = true)
    protected List<AssetHistoryEvent> assetHistoryEvent;

    /**
     * Gets the value of the assetHistoryEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetHistoryEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetHistoryEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetHistoryEvent }
     * 
     * 
     */
    public List<AssetHistoryEvent> getAssetHistoryEvent() {
        if (assetHistoryEvent == null) {
            assetHistoryEvent = new ArrayList<AssetHistoryEvent>();
        }
        return this.assetHistoryEvent;
    }

}
