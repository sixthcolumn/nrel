
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.AssetStatus;
import org.multispeak.v5_0.enumerations.MeterConnectionStatus;


/**
 * <p>Java class for meterStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="assetStatus" type="{http://www.multispeak.org/V5.0/enumerations}assetStatus"/>
 *         &lt;element name="meterConnectionStatus" type="{http://www.multispeak.org/V5.0/enumerations}meterConnectionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterStatus", propOrder = {
    "assetStatus",
    "meterConnectionStatus"
})
public class MeterStatus
    extends MspExtensible
{

    @XmlElement(required = true)
    protected AssetStatus assetStatus;
    protected MeterConnectionStatus meterConnectionStatus;

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssetStatus }
     *     
     */
    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetStatus }
     *     
     */
    public void setAssetStatus(AssetStatus value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the meterConnectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MeterConnectionStatus }
     *     
     */
    public MeterConnectionStatus getMeterConnectionStatus() {
        return meterConnectionStatus;
    }

    /**
     * Sets the value of the meterConnectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConnectionStatus }
     *     
     */
    public void setMeterConnectionStatus(MeterConnectionStatus value) {
        this.meterConnectionStatus = value;
    }

}
