
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.ActionTaken;


/**
 * This abstract class models an event where an asset is acted upon or moved.
 * 
 * <p>Java class for mspAssetHistoryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspAssetHistoryEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="expectedAction" type="{http://www.multispeak.org/V5.0/enumerations}actionTaken" minOccurs="0"/>
 *         &lt;element name="actionTaken" type="{http://www.multispeak.org/V5.0/enumerations}actionTaken" minOccurs="0"/>
 *         &lt;element name="actionTakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetLocation" type="{http://www.multispeak.org/V5.0}assetLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspAssetHistoryEvent", propOrder = {
    "expectedAction",
    "actionTaken",
    "actionTakenBy",
    "assetLocation"
})
@XmlSeeAlso({
    AssetHistoryEvent.class,
    MeterHistoryEvent.class
})
public abstract class MspAssetHistoryEvent
    extends MspEvent
{

    protected ActionTaken expectedAction;
    protected ActionTaken actionTaken;
    protected String actionTakenBy;
    protected AssetLocation assetLocation;

    /**
     * Gets the value of the expectedAction property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaken }
     *     
     */
    public ActionTaken getExpectedAction() {
        return expectedAction;
    }

    /**
     * Sets the value of the expectedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaken }
     *     
     */
    public void setExpectedAction(ActionTaken value) {
        this.expectedAction = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaken }
     *     
     */
    public ActionTaken getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaken }
     *     
     */
    public void setActionTaken(ActionTaken value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the actionTakenBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTakenBy() {
        return actionTakenBy;
    }

    /**
     * Sets the value of the actionTakenBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTakenBy(String value) {
        this.actionTakenBy = value;
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
