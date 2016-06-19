
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
 *         &lt;element name="meters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterID1" minOccurs="0"/>
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
    "meters"
})
@XmlRootElement(name = "UsageMonitoringNotification")
public class UsageMonitoringNotification {

    protected ArrayOfMeterID1 meters;

    /**
     * Gets the value of the meters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterID1 }
     *     
     */
    public ArrayOfMeterID1 getMeters() {
        return meters;
    }

    /**
     * Sets the value of the meters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterID1 }
     *     
     */
    public void setMeters(ArrayOfMeterID1 value) {
        this.meters = value;
    }

}
