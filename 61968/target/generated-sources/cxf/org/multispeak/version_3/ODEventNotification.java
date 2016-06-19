
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
 *         &lt;element name="ODEvents" type="{http://www.multispeak.org/Version_3.0}ArrayOfOutageDetectionEvent" minOccurs="0"/>
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
    "odEvents"
})
@XmlRootElement(name = "ODEventNotification")
public class ODEventNotification {

    @XmlElement(name = "ODEvents")
    protected ArrayOfOutageDetectionEvent odEvents;

    /**
     * Gets the value of the odEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutageDetectionEvent }
     *     
     */
    public ArrayOfOutageDetectionEvent getODEvents() {
        return odEvents;
    }

    /**
     * Sets the value of the odEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutageDetectionEvent }
     *     
     */
    public void setODEvents(ArrayOfOutageDetectionEvent value) {
        this.odEvents = value;
    }

}
