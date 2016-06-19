
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chargeableDevices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargeableDevices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeableDevice" type="{http://www.multispeak.org/V5.0}chargeableDevice" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargeableDevices", propOrder = {
    "chargeableDevice"
})
public class ChargeableDevices {

    @XmlElement(required = true)
    protected List<ChargeableDevice> chargeableDevice;

    /**
     * Gets the value of the chargeableDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeableDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeableDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeableDevice }
     * 
     * 
     */
    public List<ChargeableDevice> getChargeableDevice() {
        if (chargeableDevice == null) {
            chargeableDevice = new ArrayList<ChargeableDevice>();
        }
        return this.chargeableDevice;
    }

}
