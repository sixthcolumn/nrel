
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workAssignmentChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workAssignmentChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="assignmentDetails" type="{http://www.multispeak.org/V5.0}assignmentDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workAssignmentChange", propOrder = {
    "workItemRef",
    "assignmentDetails"
})
public class WorkAssignmentChange
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    @XmlElement(required = true)
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
