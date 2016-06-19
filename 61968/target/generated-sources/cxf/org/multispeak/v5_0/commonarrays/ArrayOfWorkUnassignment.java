
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.WorkUnassignment;


/**
 * <p>Java class for ArrayOfWorkUnassignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkUnassignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workUnassignment" type="{http://www.multispeak.org/V5.0}workUnassignment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkUnassignment", propOrder = {
    "workUnassignment"
})
public class ArrayOfWorkUnassignment {

    protected List<WorkUnassignment> workUnassignment;

    /**
     * Gets the value of the workUnassignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workUnassignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkUnassignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkUnassignment }
     * 
     * 
     */
    public List<WorkUnassignment> getWorkUnassignment() {
        if (workUnassignment == null) {
            workUnassignment = new ArrayList<WorkUnassignment>();
        }
        return this.workUnassignment;
    }

}
