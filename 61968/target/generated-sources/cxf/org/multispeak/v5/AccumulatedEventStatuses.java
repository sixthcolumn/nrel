
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accumulatedEventStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accumulatedEventStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accumulatedEventStatus" type="{http://www.multispeak.org/V5.0}accumulatedEventStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accumulatedEventStatuses", propOrder = {
    "accumulatedEventStatus"
})
public class AccumulatedEventStatuses {

    @XmlElement(required = true)
    protected List<AccumulatedEventStatus> accumulatedEventStatus;

    /**
     * Gets the value of the accumulatedEventStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulatedEventStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulatedEventStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccumulatedEventStatus }
     * 
     * 
     */
    public List<AccumulatedEventStatus> getAccumulatedEventStatus() {
        if (accumulatedEventStatus == null) {
            accumulatedEventStatus = new ArrayList<AccumulatedEventStatus>();
        }
        return this.accumulatedEventStatus;
    }

}
