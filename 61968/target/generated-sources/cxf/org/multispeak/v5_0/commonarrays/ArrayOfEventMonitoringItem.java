
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.EventMonitoringItem;


/**
 * <p>Java class for ArrayOfEventMonitoringItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventMonitoringItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventMonitoringItem" type="{http://www.multispeak.org/V5.0}eventMonitoringItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventMonitoringItem", propOrder = {
    "eventMonitoringItem"
})
public class ArrayOfEventMonitoringItem {

    protected List<EventMonitoringItem> eventMonitoringItem;

    /**
     * Gets the value of the eventMonitoringItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventMonitoringItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventMonitoringItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventMonitoringItem }
     * 
     * 
     */
    public List<EventMonitoringItem> getEventMonitoringItem() {
        if (eventMonitoringItem == null) {
            eventMonitoringItem = new ArrayList<EventMonitoringItem>();
        }
        return this.eventMonitoringItem;
    }

}
