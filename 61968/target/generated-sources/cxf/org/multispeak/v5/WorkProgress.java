
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the current work progress status.
 * 
 * <p>Java class for workProgress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workProgress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workStatusDetail" type="{http://www.multispeak.org/V5.0}workStatusDetail"/>
 *         &lt;element name="previousWorkStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "workProgress", propOrder = {
    "workStatusDetail",
    "previousWorkStatusCode",
    "remarks",
    "workSchedule",
    "assignmentDetails"
})
public class WorkProgress
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkStatusDetail workStatusDetail;
    protected String previousWorkStatusCode;
    protected String remarks;
    protected WorkSchedule workSchedule;
    protected AssignmentDetails assignmentDetails;

    /**
     * Gets the value of the workStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusDetail }
     *     
     */
    public WorkStatusDetail getWorkStatusDetail() {
        return workStatusDetail;
    }

    /**
     * Sets the value of the workStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusDetail }
     *     
     */
    public void setWorkStatusDetail(WorkStatusDetail value) {
        this.workStatusDetail = value;
    }

    /**
     * Gets the value of the previousWorkStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousWorkStatusCode() {
        return previousWorkStatusCode;
    }

    /**
     * Sets the value of the previousWorkStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousWorkStatusCode(String value) {
        this.previousWorkStatusCode = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
