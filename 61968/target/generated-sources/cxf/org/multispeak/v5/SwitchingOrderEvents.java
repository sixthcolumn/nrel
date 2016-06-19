
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a list of events that describe the history and progress of completing the switching ordered.
 * 
 * <p>Java class for switchingOrderEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingOrderEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="switchingOrderEvent" type="{http://www.multispeak.org/V5.0}switchingOrderEvent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "switchingOrderEvents", propOrder = {
    "switchingOrderEvent"
})
public class SwitchingOrderEvents {

    @XmlElement(required = true)
    protected List<SwitchingOrderEvent> switchingOrderEvent;

    /**
     * Gets the value of the switchingOrderEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingOrderEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingOrderEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingOrderEvent }
     * 
     * 
     */
    public List<SwitchingOrderEvent> getSwitchingOrderEvent() {
        if (switchingOrderEvent == null) {
            switchingOrderEvent = new ArrayList<SwitchingOrderEvent>();
        }
        return this.switchingOrderEvent;
    }

}
