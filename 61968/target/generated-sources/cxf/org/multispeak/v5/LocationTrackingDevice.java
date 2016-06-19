
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a device that can return locations of objects associated with it.  An example of such a device is an AVL modem, which might be associated with a vehicle.
 * 
 * <p>Java class for locationTrackingDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationTrackingDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="LTDID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceSystemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LTCommunicationsAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "locationTrackingDevice", propOrder = {
    "ltdid",
    "sourceSystemID",
    "ltCommunicationsAddress"
})
public class LocationTrackingDevice
    extends MspAsset
{

    @XmlElement(name = "LTDID", required = true)
    protected String ltdid;
    protected String sourceSystemID;
    @XmlElement(name = "LTCommunicationsAddress")
    protected String ltCommunicationsAddress;

    /**
     * Gets the value of the ltdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDID() {
        return ltdid;
    }

    /**
     * Sets the value of the ltdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDID(String value) {
        this.ltdid = value;
    }

    /**
     * Gets the value of the sourceSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemID() {
        return sourceSystemID;
    }

    /**
     * Sets the value of the sourceSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemID(String value) {
        this.sourceSystemID = value;
    }

    /**
     * Gets the value of the ltCommunicationsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTCommunicationsAddress() {
        return ltCommunicationsAddress;
    }

    /**
     * Sets the value of the ltCommunicationsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTCommunicationsAddress(String value) {
        this.ltCommunicationsAddress = value;
    }

}
