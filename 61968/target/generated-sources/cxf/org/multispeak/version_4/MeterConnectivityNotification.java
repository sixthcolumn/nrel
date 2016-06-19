
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="newConnectivity" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterConnectivity" minOccurs="0"/>
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
    "newConnectivity"
})
@XmlRootElement(name = "MeterConnectivityNotification")
public class MeterConnectivityNotification {

    protected ArrayOfMeterConnectivity newConnectivity;

    /**
     * Gets the value of the newConnectivity property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterConnectivity }
     *     
     */
    public ArrayOfMeterConnectivity getNewConnectivity() {
        return newConnectivity;
    }

    /**
     * Sets the value of the newConnectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterConnectivity }
     *     
     */
    public void setNewConnectivity(ArrayOfMeterConnectivity value) {
        this.newConnectivity = value;
    }

}
