
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceID" type="{http://www.multispeak.org/V5.0}PANInterfaceID"/>
 *         &lt;element name="deviceID" type="{http://www.multispeak.org/V5.0}PANDeviceID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationStatus", propOrder = {
    "interfaceID",
    "deviceID"
})
public class RegistrationStatus {

    @XmlElement(required = true)
    protected PANInterfaceID interfaceID;
    @XmlElement(required = true)
    protected PANDeviceID deviceID;

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link PANInterfaceID }
     *     
     */
    public PANInterfaceID getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANInterfaceID }
     *     
     */
    public void setInterfaceID(PANInterfaceID value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceID }
     *     
     */
    public PANDeviceID getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceID }
     *     
     */
    public void setDeviceID(PANDeviceID value) {
        this.deviceID = value;
    }

}
