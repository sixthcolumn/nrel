
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for receivedLoadManagementDevices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivedLoadManagementDevices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadManagementDevice" type="{http://www.multispeak.org/V5.0}loadManagementDevice" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivedLoadManagementDevices", propOrder = {
    "loadManagementDevice"
})
public class ReceivedLoadManagementDevices {

    @XmlElement(required = true)
    protected List<LoadManagementDevice> loadManagementDevice;

    /**
     * Gets the value of the loadManagementDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadManagementDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadManagementDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadManagementDevice }
     * 
     * 
     */
    public List<LoadManagementDevice> getLoadManagementDevice() {
        if (loadManagementDevice == null) {
            loadManagementDevice = new ArrayList<LoadManagementDevice>();
        }
        return this.loadManagementDevice;
    }

}
