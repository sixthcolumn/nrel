
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.PANRegistrationStatus;


/**
 * The registration status of the device in the network corresponding with the PANInterfaceID.
 * 
 * <p>Java class for PANRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANRegistration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="registrationStatus" type="{http://www.multispeak.org/V5.0/enumerations}PANRegistrationStatus"/>
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
@XmlType(name = "PANRegistration", propOrder = {
    "panDeviceRef",
    "registrationStatus"
})
public class PANRegistration
    extends MspObject
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    @XmlElement(required = true)
    protected PANRegistrationStatus registrationStatus;

    /**
     * Gets the value of the panDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRef }
     *     
     */
    public PANDeviceRef getPANDeviceRef() {
        return panDeviceRef;
    }

    /**
     * Sets the value of the panDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRef }
     *     
     */
    public void setPANDeviceRef(PANDeviceRef value) {
        this.panDeviceRef = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PANRegistrationStatus }
     *     
     */
    public PANRegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANRegistrationStatus }
     *     
     */
    public void setRegistrationStatus(PANRegistrationStatus value) {
        this.registrationStatus = value;
    }

}
