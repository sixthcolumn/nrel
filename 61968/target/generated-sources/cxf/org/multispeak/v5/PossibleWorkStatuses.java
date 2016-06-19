
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the set of possible work statuses that apply to the work flow incorporated in the work process supported by this profiled use case. 
 * 
 * <p>Java class for possibleWorkStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="possibleWorkStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workStatus" type="{http://www.multispeak.org/V5.0}workStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleWorkStatuses", propOrder = {
    "workStatus"
})
public class PossibleWorkStatuses {

    @XmlElement(required = true)
    protected List<WorkStatus> workStatus;

    /**
     * Gets the value of the workStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkStatus }
     * 
     * 
     */
    public List<WorkStatus> getWorkStatus() {
        if (workStatus == null) {
            workStatus = new ArrayList<WorkStatus>();
        }
        return this.workStatus;
    }

}
