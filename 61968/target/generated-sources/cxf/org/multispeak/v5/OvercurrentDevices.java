
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overcurrentDevices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overcurrentDevices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overcurrentDevice" type="{http://www.multispeak.org/V5.0}overcurrentDevice" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overcurrentDevices", propOrder = {
    "overcurrentDevice"
})
public class OvercurrentDevices {

    protected List<OvercurrentDevice> overcurrentDevice;

    /**
     * Gets the value of the overcurrentDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overcurrentDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOvercurrentDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvercurrentDevice }
     * 
     * 
     */
    public List<OvercurrentDevice> getOvercurrentDevice() {
        if (overcurrentDevice == null) {
            overcurrentDevice = new ArrayList<OvercurrentDevice>();
        }
        return this.overcurrentDevice;
    }

}
