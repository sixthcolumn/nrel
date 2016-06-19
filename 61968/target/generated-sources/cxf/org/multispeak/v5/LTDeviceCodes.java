
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * These are location tracking device codes (sometimes referred to as being vehicle modem codes).  These codes give specific information about the status or state of the object being tracked with the location tracking device.  Codes may reflect either trouble conditions, alert conditions or codes that are not specifically defined to be either of trouble or alert type.
 * 
 * <p>Java class for LTDeviceCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LTDeviceCodes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="troubleCodes" type="{http://www.multispeak.org/V5.0}troubleCodes" minOccurs="0"/>
 *         &lt;element name="alertCodes" type="{http://www.multispeak.org/V5.0}alertCodes" minOccurs="0"/>
 *         &lt;element name="otherCodes" type="{http://www.multispeak.org/V5.0}otherCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LTDeviceCodes", propOrder = {
    "troubleCodes",
    "alertCodes",
    "otherCodes"
})
public class LTDeviceCodes
    extends MspExtensible
{

    protected TroubleCodes troubleCodes;
    protected AlertCodes alertCodes;
    protected OtherCodes otherCodes;

    /**
     * Gets the value of the troubleCodes property.
     * 
     * @return
     *     possible object is
     *     {@link TroubleCodes }
     *     
     */
    public TroubleCodes getTroubleCodes() {
        return troubleCodes;
    }

    /**
     * Sets the value of the troubleCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TroubleCodes }
     *     
     */
    public void setTroubleCodes(TroubleCodes value) {
        this.troubleCodes = value;
    }

    /**
     * Gets the value of the alertCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCodes }
     *     
     */
    public AlertCodes getAlertCodes() {
        return alertCodes;
    }

    /**
     * Sets the value of the alertCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCodes }
     *     
     */
    public void setAlertCodes(AlertCodes value) {
        this.alertCodes = value;
    }

    /**
     * Gets the value of the otherCodes property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCodes }
     *     
     */
    public OtherCodes getOtherCodes() {
        return otherCodes;
    }

    /**
     * Sets the value of the otherCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCodes }
     *     
     */
    public void setOtherCodes(OtherCodes value) {
        this.otherCodes = value;
    }

}
