
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.AssignmentStatus;


/**
 * Detailed information pertaining to an assignment.
 * 
 * <p>Java class for assignmentDetailItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignmentDetailItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="resourceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="actionBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeToLive" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="assignmentStatus" type="{http://www.multispeak.org/V5.0/enumerations}assignmentStatus" minOccurs="0"/>
 *         &lt;element name="acceptedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignmentDetailItem", propOrder = {
    "resourceRef",
    "actionBy",
    "timeToLive",
    "assignmentStatus",
    "acceptedBy",
    "remarks"
})
public class AssignmentDetailItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectRef resourceRef;
    protected String actionBy;
    protected Duration timeToLive;
    protected AssignmentStatus assignmentStatus;
    protected String acceptedBy;
    protected String remarks;

    /**
     * Gets the value of the resourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getResourceRef() {
        return resourceRef;
    }

    /**
     * Sets the value of the resourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setResourceRef(ObjectRef value) {
        this.resourceRef = value;
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

    /**
     * Gets the value of the timeToLive property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToLive() {
        return timeToLive;
    }

    /**
     * Sets the value of the timeToLive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToLive(Duration value) {
        this.timeToLive = value;
    }

    /**
     * Gets the value of the assignmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentStatus }
     *     
     */
    public AssignmentStatus getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * Sets the value of the assignmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentStatus }
     *     
     */
    public void setAssignmentStatus(AssignmentStatus value) {
        this.assignmentStatus = value;
    }

    /**
     * Gets the value of the acceptedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedBy() {
        return acceptedBy;
    }

    /**
     * Sets the value of the acceptedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedBy(String value) {
        this.acceptedBy = value;
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

}
