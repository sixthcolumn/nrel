
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the set of possible work priorities that apply to the work flow incorporated in the work process supported by this profiled use case. 
 * 
 * <p>Java class for possibleWorkPriorities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="possibleWorkPriorities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workPriority" type="{http://www.multispeak.org/V5.0}workPriority" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleWorkPriorities", propOrder = {
    "workPriority"
})
public class PossibleWorkPriorities {

    @XmlElement(required = true)
    protected List<WorkPriority> workPriority;

    /**
     * Gets the value of the workPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkPriority }
     * 
     * 
     */
    public List<WorkPriority> getWorkPriority() {
        if (workPriority == null) {
            workPriority = new ArrayList<WorkPriority>();
        }
        return this.workPriority;
    }

}
