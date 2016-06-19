
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for chargeableDevicesReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargeableDevicesReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="chargeableDevices" type="{http://www.multispeak.org/V5.0}chargeableDevices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargeableDevicesReferable", propOrder = {
    "accountID",
    "chargeableDevices"
})
public class ChargeableDevicesReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID accountID;
    protected ChargeableDevices chargeableDevices;

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
     * Gets the value of the chargeableDevices property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeableDevices }
     *     
     */
    public ChargeableDevices getChargeableDevices() {
        return chargeableDevices;
    }

    /**
     * Sets the value of the chargeableDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeableDevices }
     *     
     */
    public void setChargeableDevices(ChargeableDevices value) {
        this.chargeableDevices = value;
    }

}
