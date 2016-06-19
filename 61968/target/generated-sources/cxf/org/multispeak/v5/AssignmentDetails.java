
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for assignmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignmentDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="primaryAssignment" type="{http://www.multispeak.org/V5.0}assignmentDetailItem"/>
 *         &lt;element name="additionalAssignments" type="{http://www.multispeak.org/V5.0}additionalAssignments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignmentDetails", propOrder = {
    "primaryAssignment",
    "additionalAssignments"
})
public class AssignmentDetails
    extends MspExtensible
{

    @XmlElement(required = true)
    protected AssignmentDetailItem primaryAssignment;
    protected AdditionalAssignments additionalAssignments;

    /**
     * Gets the value of the primaryAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentDetailItem }
     *     
     */
    public AssignmentDetailItem getPrimaryAssignment() {
        return primaryAssignment;
    }

    /**
     * Sets the value of the primaryAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentDetailItem }
     *     
     */
    public void setPrimaryAssignment(AssignmentDetailItem value) {
        this.primaryAssignment = value;
    }

    /**
     * Gets the value of the additionalAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalAssignments }
     *     
     */
    public AdditionalAssignments getAdditionalAssignments() {
        return additionalAssignments;
    }

    /**
     * Sets the value of the additionalAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalAssignments }
     *     
     */
    public void setAdditionalAssignments(AdditionalAssignments value) {
        this.additionalAssignments = value;
    }

}
