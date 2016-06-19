
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The eventMonitoringItems is part of the payload of an InitiateMeterEventMonitoring method. The eventMonitoringItems is an array of eventMonitoringItem, which establishes a set of types of end device (meter) events for which monitoring is to be established and a set meters to be monitored for those events.  The set of meters can be provided in the form of a list of meterIDs, a list of meterGroupIDs, both or neither.  If no list of meters is provided, then it is assumed that monitoring is to be provided on all meters.
 * 
 * <p>Java class for eventMonitoringItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventMonitoringItems">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="eventMonitoringItem" type="{http://www.multispeak.org/V5.0}eventMonitoringItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventMonitoringItems", propOrder = {
    "eventMonitoringItem"
})
public class EventMonitoringItems
    extends MspReferable
{

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
