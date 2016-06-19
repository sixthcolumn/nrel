
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This object is used to communicate unassignments as opposed to an assignment change.  If the primary resource is unassigned, all resources must be unassigned. To unassign the primary resource without unassigning all additional resources, first change the primary resource using InitiateWorkAssignmentChange. 
 * 
 * <p>Java class for workUnassignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workUnassignment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="resourceRefs" type="{http://www.multispeak.org/V5.0}resourceRefs"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="actionBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workUnassignment", propOrder = {
    "workItemRef",
    "resourceRefs",
    "timeStamp",
    "actionBy"
})
public class WorkUnassignment
    extends MspExtensible
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    @XmlElement(required = true)
    protected ResourceRefs resourceRefs;
    protected XMLGregorianCalendar timeStamp;
    protected String actionBy;

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
     * Gets the value of the resourceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceRefs }
     *     
     */
    public ResourceRefs getResourceRefs() {
        return resourceRefs;
    }

    /**
     * Sets the value of the resourceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceRefs }
     *     
     */
    public void setResourceRefs(ResourceRefs value) {
        this.resourceRefs = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the actionBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionBy() {
        return actionBy;
    }

    /**
     * Sets the value of the actionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionBy(String value) {
        this.actionBy = value;
    }

}
