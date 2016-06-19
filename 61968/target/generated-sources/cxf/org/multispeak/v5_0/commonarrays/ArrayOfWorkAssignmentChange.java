
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.WorkAssignmentChange;


/**
 * <p>Java class for ArrayOfWorkAssignmentChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkAssignmentChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workAssignmentChange" type="{http://www.multispeak.org/V5.0}workAssignmentChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkAssignmentChange", propOrder = {
    "workAssignmentChange"
})
public class ArrayOfWorkAssignmentChange {

    protected List<WorkAssignmentChange> workAssignmentChange;

    /**
     * Gets the value of the workAssignmentChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAssignmentChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAssignmentChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAssignmentChange }
     * 
     * 
     */
    public List<WorkAssignmentChange> getWorkAssignmentChange() {
        if (workAssignmentChange == null) {
            workAssignmentChange = new ArrayList<WorkAssignmentChange>();
        }
        return this.workAssignmentChange;
    }

}
