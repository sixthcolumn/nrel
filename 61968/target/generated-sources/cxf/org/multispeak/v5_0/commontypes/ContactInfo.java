
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This class contains ways to contact an entity.
 * 
 * <p>Java class for contactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="phoneNumbers" type="{http://www.multispeak.org/V5.0/commonTypes}phoneNumbers" minOccurs="0"/>
 *         &lt;element name="addressItems" type="{http://www.multispeak.org/V5.0/commonTypes}addressItems" minOccurs="0"/>
 *         &lt;element name="eMailAddresses" type="{http://www.multispeak.org/V5.0/commonTypes}eMailAddresses" minOccurs="0"/>
 *         &lt;element name="otherContactInformation" type="{http://www.multispeak.org/V5.0/commonTypes}otherContactInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfo", propOrder = {
    "phoneNumbers",
    "addressItems",
    "eMailAddresses",
    "otherContactInformation"
})
public class ContactInfo
    extends MspExtensible
{

    protected PhoneNumbers phoneNumbers;
    protected AddressItems addressItems;
    protected EMailAddresses eMailAddresses;
    protected OtherContactInformation otherContactInformation;

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumbers }
     *     
     */
    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumbers }
     *     
     */
    public void setPhoneNumbers(PhoneNumbers value) {
        this.phoneNumbers = value;
    }

    /**
     * Gets the value of the addressItems property.
     * 
     * @return
     *     possible object is
     *     {@link AddressItems }
     *     
     */
    public AddressItems getAddressItems() {
        return addressItems;
    }

    /**
     * Sets the value of the addressItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressItems }
     *     
     */
    public void setAddressItems(AddressItems value) {
        this.addressItems = value;
    }

    /**
     * Gets the value of the eMailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link EMailAddresses }
     *     
     */
    public EMailAddresses getEMailAddresses() {
        return eMailAddresses;
    }

    /**
     * Sets the value of the eMailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailAddresses }
     *     
     */
    public void setEMailAddresses(EMailAddresses value) {
        this.eMailAddresses = value;
    }

    /**
     * Gets the value of the otherContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherContactInformation }
     *     
     */
    public OtherContactInformation getOtherContactInformation() {
        return otherContactInformation;
    }

    /**
     * Sets the value of the otherContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherContactInformation }
     *     
     */
    public void setOtherContactInformation(OtherContactInformation value) {
        this.otherContactInformation = value;
    }

}
