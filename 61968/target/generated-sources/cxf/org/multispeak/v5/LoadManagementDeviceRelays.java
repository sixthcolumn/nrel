
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadManagementDeviceRelays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagementDeviceRelays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadManagementDeviceRelay" type="{http://www.multispeak.org/V5.0}loadManagementDeviceRelay" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadManagementDeviceRelays", propOrder = {
    "loadManagementDeviceRelay"
})
public class LoadManagementDeviceRelays {

    @XmlElement(required = true)
    protected List<LoadManagementDeviceRelay> loadManagementDeviceRelay;

    /**
     * Gets the value of the loadManagementDeviceRelay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadManagementDeviceRelay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadManagementDeviceRelay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadManagementDeviceRelay }
     * 
     * 
     */
    public List<LoadManagementDeviceRelay> getLoadManagementDeviceRelay() {
        if (loadManagementDeviceRelay == null) {
            loadManagementDeviceRelay = new ArrayList<LoadManagementDeviceRelay>();
        }
        return this.loadManagementDeviceRelay;
    }

}
