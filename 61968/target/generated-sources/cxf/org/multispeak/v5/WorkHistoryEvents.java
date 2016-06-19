
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workHistoryEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workHistoryEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workHistoryEvent" type="{http://www.multispeak.org/V5.0}workHistoryEvent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workHistoryEvents", propOrder = {
    "workHistoryEvent"
})
public class WorkHistoryEvents {

    @XmlElement(required = true)
    protected List<WorkHistoryEvent> workHistoryEvent;

    /**
     * Gets the value of the workHistoryEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workHistoryEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkHistoryEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkHistoryEvent }
     * 
     * 
     */
    public List<WorkHistoryEvent> getWorkHistoryEvent() {
        if (workHistoryEvent == null) {
            workHistoryEvent = new ArrayList<WorkHistoryEvent>();
        }
        return this.workHistoryEvent;
    }

}
