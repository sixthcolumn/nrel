
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The assignment for additional resources.
 * 
 * <p>Java class for additionalAssignments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalAssignments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalAssignment" type="{http://www.multispeak.org/V5.0}assignmentDetailItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalAssignments", propOrder = {
    "additionalAssignment"
})
public class AdditionalAssignments {

    @XmlElement(required = true)
    protected List<AssignmentDetailItem> additionalAssignment;

    /**
     * Gets the value of the additionalAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentDetailItem }
     * 
     * 
     */
    public List<AssignmentDetailItem> getAdditionalAssignment() {
        if (additionalAssignment == null) {
            additionalAssignment = new ArrayList<AssignmentDetailItem>();
        }
        return this.additionalAssignment;
    }

}
