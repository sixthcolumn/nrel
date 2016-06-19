
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for scheduledItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduledItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="workSchedule" type="{http://www.multispeak.org/V5.0}workSchedule" minOccurs="0"/>
 *         &lt;element name="assignmentDetails" type="{http://www.multispeak.org/V5.0}assignmentDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduledItem", propOrder = {
    "workItemRef",
    "workSchedule",
    "assignmentDetails"
})
public class ScheduledItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    protected WorkSchedule workSchedule;
    protected AssignmentDetails assignmentDetails;

    /**
     * Gets the value of the workItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemRef }
     *     
     */
    public WorkItemRef getWorkItemRef() {
        return workItemRef;
    }

    /**
     * Sets the value of the workItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemRef }
     *     
     */
    public void setWorkItemRef(WorkItemRef value) {
        this.workItemRef = value;
    }

    /**
     * Gets the value of the workSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link WorkSchedule }
     *     
     */
    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    /**
     * Sets the value of the workSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSchedule }
     *     
     */
    public void setWorkSchedule(WorkSchedule value) {
        this.workSchedule = value;
    }

    /**
     * Gets the value of the assignmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentDetails }
     *     
     */
    public AssignmentDetails getAssignmentDetails() {
        return assignmentDetails;
    }

    /**
     * Sets the value of the assignmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentDetails }
     *     
     */
    public void setAssignmentDetails(AssignmentDetails value) {
        this.assignmentDetails = value;
    }

}
