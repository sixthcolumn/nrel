
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This list shall be used to refer to objects that inherit from mspWork. An example of this relationship would be the workOrder that includes a serviceOrder. 
 * 
 * <p>Java class for workItemRelationships complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workItemRelationships">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workItemRelationship" type="{http://www.multispeak.org/V5.0}workItemRelationship" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workItemRelationships", propOrder = {
    "workItemRelationship"
})
public class WorkItemRelationships {

    @XmlElement(required = true)
    protected List<WorkItemRelationship> workItemRelationship;

    /**
     * Gets the value of the workItemRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workItemRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkItemRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkItemRelationship }
     * 
     * 
     */
    public List<WorkItemRelationship> getWorkItemRelationship() {
        if (workItemRelationship == null) {
            workItemRelationship = new ArrayList<WorkItemRelationship>();
        }
        return this.workItemRelationship;
    }

}
