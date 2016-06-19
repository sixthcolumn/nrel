
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
 *         &lt;element name="switchingOrders" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSwitchingOrder" minOccurs="0"/>
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
    "switchingOrders"
})
@XmlRootElement(name = "SwitchingOrderChangedNotification")
public class SwitchingOrderChangedNotification {

    protected ArrayOfSwitchingOrder switchingOrders;

    /**
     * Gets the value of the switchingOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchingOrder }
     *     
     */
    public ArrayOfSwitchingOrder getSwitchingOrders() {
        return switchingOrders;
    }

    /**
     * Sets the value of the switchingOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchingOrder }
     *     
     */
    public void setSwitchingOrders(ArrayOfSwitchingOrder value) {
        this.switchingOrders = value;
    }

}
