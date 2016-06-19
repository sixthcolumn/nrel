
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a list of types of end device event types.
 * 
 * <p>Java class for endDeviceEventTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEventTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDeviceEventType" type="{http://www.multispeak.org/V5.0}endDeviceEventType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEventTypes", propOrder = {
    "endDeviceEventType"
})
public class EndDeviceEventTypes {

    @XmlElement(required = true)
    protected List<EndDeviceEventType> endDeviceEventType;

    /**
     * Gets the value of the endDeviceEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceEventType }
     * 
     * 
     */
    public List<EndDeviceEventType> getEndDeviceEventType() {
        if (endDeviceEventType == null) {
            endDeviceEventType = new ArrayList<EndDeviceEventType>();
        }
        return this.endDeviceEventType;
    }

}
