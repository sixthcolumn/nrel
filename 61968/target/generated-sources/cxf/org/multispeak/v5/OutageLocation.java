
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Address;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.NounUnspecifiedRef;
import org.multispeak.v5_0.commontypes.TelephoneNumber;


/**
 * <p>Java class for outageLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="serviceLocationRef" type="{http://www.multispeak.org/V5.0/commonTypes}nounUnspecifiedRef" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="accountRef" type="{http://www.multispeak.org/V5.0/commonTypes}nounUnspecifiedRef" minOccurs="0"/>
 *         &lt;element name="telephoneNumber" type="{http://www.multispeak.org/V5.0/commonTypes}telephoneNumber" minOccurs="0"/>
 *         &lt;element name="serviceAddress" type="{http://www.multispeak.org/V5.0/commonTypes}address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageLocation", propOrder = {
    "serviceLocationRef",
    "meterID",
    "accountRef",
    "telephoneNumber",
    "serviceAddress"
})
public class OutageLocation
    extends MspExtensible
{

    protected NounUnspecifiedRef serviceLocationRef;
    protected MeterID meterID;
    protected NounUnspecifiedRef accountRef;
    protected TelephoneNumber telephoneNumber;
    protected Address serviceAddress;

    /**
     * Gets the value of the serviceLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public NounUnspecifiedRef getServiceLocationRef() {
        return serviceLocationRef;
    }

    /**
     * Sets the value of the serviceLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public void setServiceLocationRef(NounUnspecifiedRef value) {
        this.serviceLocationRef = value;
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
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public NounUnspecifiedRef getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public void setAccountRef(NounUnspecifiedRef value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(TelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setServiceAddress(Address value) {
        this.serviceAddress = value;
    }

}
