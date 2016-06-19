
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.AssetHistoryEventsReferable;


/**
 * <p>Java class for ArrayOfAssetHistoryEventsReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAssetHistoryEventsReferable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetHistoryEventsReferable" type="{http://www.multispeak.org/V5.0}assetHistoryEventsReferable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetHistoryEventsReferable", propOrder = {
    "assetHistoryEventsReferable"
})
public class ArrayOfAssetHistoryEventsReferable {

    protected List<AssetHistoryEventsReferable> assetHistoryEventsReferable;

    /**
     * Gets the value of the assetHistoryEventsReferable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetHistoryEventsReferable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetHistoryEventsReferable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetHistoryEventsReferable }
     * 
     * 
     */
    public List<AssetHistoryEventsReferable> getAssetHistoryEventsReferable() {
        if (assetHistoryEventsReferable == null) {
            assetHistoryEventsReferable = new ArrayList<AssetHistoryEventsReferable>();
        }
        return this.assetHistoryEventsReferable;
    }

}
