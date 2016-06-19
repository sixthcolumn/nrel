
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.WorkHistoryReferable;


/**
 * <p>Java class for ArrayOfWorkHistoryReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkHistoryReferable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workHistoryReferable" type="{http://www.multispeak.org/V5.0}workHistoryReferable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkHistoryReferable", propOrder = {
    "workHistoryReferable"
})
public class ArrayOfWorkHistoryReferable {

    protected List<WorkHistoryReferable> workHistoryReferable;

    /**
     * Gets the value of the workHistoryReferable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workHistoryReferable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkHistoryReferable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkHistoryReferable }
     * 
     * 
     */
    public List<WorkHistoryReferable> getWorkHistoryReferable() {
        if (workHistoryReferable == null) {
            workHistoryReferable = new ArrayList<WorkHistoryReferable>();
        }
        return this.workHistoryReferable;
    }

}
