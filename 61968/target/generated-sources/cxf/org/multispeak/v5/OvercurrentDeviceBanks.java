
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overcurrentDeviceBanks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overcurrentDeviceBanks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overcurrentDeviceBank" type="{http://www.multispeak.org/V5.0}overcurrentDeviceBank" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overcurrentDeviceBanks", propOrder = {
    "overcurrentDeviceBank"
})
public class OvercurrentDeviceBanks {

    @XmlElement(required = true)
    protected List<OvercurrentDeviceBank> overcurrentDeviceBank;

    /**
     * Gets the value of the overcurrentDeviceBank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overcurrentDeviceBank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOvercurrentDeviceBank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvercurrentDeviceBank }
     * 
     * 
     */
    public List<OvercurrentDeviceBank> getOvercurrentDeviceBank() {
        if (overcurrentDeviceBank == null) {
            overcurrentDeviceBank = new ArrayList<OvercurrentDeviceBank>();
        }
        return this.overcurrentDeviceBank;
    }

}
