
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These name value pairs identify special priority conditions that could apply to a customer, service location or utility service.  Examples of priorityType entries include "Medical Necessity", "Priority Customer", "Outage Priorities", "Emergency Services", etc.  The prioritySubtype element gives additional options for this class of priorityType.
 * 
 * <p>Java class for usagePointPriorities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usagePointPriorities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usagePointPriority" type="{http://www.multispeak.org/V5.0}locationPriority" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usagePointPriorities", propOrder = {
    "usagePointPriority"
})
public class UsagePointPriorities {

    @XmlElement(required = true)
    protected List<LocationPriority> usagePointPriority;

    /**
     * Gets the value of the usagePointPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usagePointPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsagePointPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationPriority }
     * 
     * 
     */
    public List<LocationPriority> getUsagePointPriority() {
        if (usagePointPriority == null) {
            usagePointPriority = new ArrayList<LocationPriority>();
        }
        return this.usagePointPriority;
    }

}
