
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
 *         &lt;element name="addedMBs" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterBase" minOccurs="0"/>
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
    "addedMBs"
})
@XmlRootElement(name = "MeterBaseInstalledNotification")
public class MeterBaseInstalledNotification {

    protected ArrayOfMeterBase addedMBs;

    /**
     * Gets the value of the addedMBs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterBase }
     *     
     */
    public ArrayOfMeterBase getAddedMBs() {
        return addedMBs;
    }

    /**
     * Sets the value of the addedMBs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterBase }
     *     
     */
    public void setAddedMBs(ArrayOfMeterBase value) {
        this.addedMBs = value;
    }

}
