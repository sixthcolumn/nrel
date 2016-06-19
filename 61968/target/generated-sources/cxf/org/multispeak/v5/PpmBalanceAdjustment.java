
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * ObjectID is the transaction verification for this specific balance adjustment.
 * 
 * <p>Java class for ppmBalanceAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmBalanceAdjustment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="ppmLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjustmentItems" type="{http://www.multispeak.org/V5.0}adjustmentItems"/>
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
@XmlType(name = "ppmBalanceAdjustment", propOrder = {
    "accountID",
    "ppmLocationID",
    "meterID",
    "description",
    "adjustmentItems"
})
public class PpmBalanceAdjustment
    extends MspObject
{

    @XmlElement(required = true)
    protected ObjectID accountID;
    @XmlElement(required = true)
    protected ServicePointID ppmLocationID;
    @XmlElement(required = true)
    protected MeterID meterID;
    protected String description;
    @XmlElement(required = true)
    protected AdjustmentItems adjustmentItems;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setAccountID(ObjectID value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the ppmLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getPpmLocationID() {
        return ppmLocationID;
    }

    /**
     * Sets the value of the ppmLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setPpmLocationID(ServicePointID value) {
        this.ppmLocationID = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
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
     * Gets the value of the adjustmentItems property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentItems }
     *     
     */
    public AdjustmentItems getAdjustmentItems() {
        return adjustmentItems;
    }

    /**
     * Sets the value of the adjustmentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentItems }
     *     
     */
    public void setAdjustmentItems(AdjustmentItems value) {
        this.adjustmentItems = value;
    }

}
