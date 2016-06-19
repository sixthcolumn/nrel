
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assetHistoryEventsReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetHistoryEventsReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="assetRef" type="{http://www.multispeak.org/V5.0}assetRef"/>
 *         &lt;element name="assetHistoryEvents" type="{http://www.multispeak.org/V5.0}assetHistoryEvents"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetHistoryEventsReferable", propOrder = {
    "assetRef",
    "assetHistoryEvents"
})
public class AssetHistoryEventsReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected AssetRef assetRef;
    @XmlElement(required = true)
    protected AssetHistoryEvents assetHistoryEvents;

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
     * Gets the value of the assetHistoryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link AssetHistoryEvents }
     *     
     */
    public AssetHistoryEvents getAssetHistoryEvents() {
        return assetHistoryEvents;
    }

    /**
     * Sets the value of the assetHistoryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetHistoryEvents }
     *     
     */
    public void setAssetHistoryEvents(AssetHistoryEvents value) {
        this.assetHistoryEvents = value;
    }

}
