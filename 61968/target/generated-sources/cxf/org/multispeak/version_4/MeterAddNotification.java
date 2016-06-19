
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
 *         &lt;element name="addedMeters" type="{http://www.multispeak.org/Version_4.1_Release}meters" minOccurs="0"/>
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
    "addedMeters"
})
@XmlRootElement(name = "MeterAddNotification")
public class MeterAddNotification {

    protected Meters addedMeters;

    /**
     * Gets the value of the addedMeters property.
     * 
     * @return
     *     possible object is
     *     {@link Meters }
     *     
     */
    public Meters getAddedMeters() {
        return addedMeters;
    }

    /**
     * Sets the value of the addedMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meters }
     *     
     */
    public void setAddedMeters(Meters value) {
        this.addedMeters = value;
    }

}
