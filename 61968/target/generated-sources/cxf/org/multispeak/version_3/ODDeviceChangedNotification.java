
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ODDevices" type="{http://www.multispeak.org/Version_3.0}ArrayOfOutageDetectionDevice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "odDevices"
})
@XmlRootElement(name = "ODDeviceChangedNotification")
public class ODDeviceChangedNotification {

    @XmlElement(name = "ODDevices")
    protected ArrayOfOutageDetectionDevice odDevices;

    /**
     * Gets the value of the odDevices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageDetectionDevice }
     *     
     */
    public ArrayOfOutageDetectionDevice getODDevices() {
        return odDevices;
    }

    /**
     * Sets the value of the odDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageDetectionDevice }
     *     
     */
    public void setODDevices(ArrayOfOutageDetectionDevice value) {
        this.odDevices = value;
    }

}
