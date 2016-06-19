
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
 *         &lt;element name="newOutages" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfCustomersAffectedByOutage" minOccurs="0"/>
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
    "newOutages"
})
@XmlRootElement(name = "CustomersAffectedByOutageNotification")
public class CustomersAffectedByOutageNotification {

    protected ArrayOfCustomersAffectedByOutage newOutages;

    /**
     * Gets the value of the newOutages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomersAffectedByOutage }
     *     
     */
    public ArrayOfCustomersAffectedByOutage getNewOutages() {
        return newOutages;
    }

    /**
     * Sets the value of the newOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomersAffectedByOutage }
     *     
     */
    public void setNewOutages(ArrayOfCustomersAffectedByOutage value) {
        this.newOutages = value;
    }

}
