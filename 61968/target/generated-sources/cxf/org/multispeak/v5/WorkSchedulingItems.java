
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workSchedulingItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workSchedulingItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workSchedulingItem" type="{http://www.multispeak.org/V5.0}workSchedulingItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workSchedulingItems", propOrder = {
    "workSchedulingItem"
})
public class WorkSchedulingItems {

    @XmlElement(required = true)
    protected List<WorkSchedulingItem> workSchedulingItem;

    /**
     * Gets the value of the workSchedulingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workSchedulingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkSchedulingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkSchedulingItem }
     * 
     * 
     */
    public List<WorkSchedulingItem> getWorkSchedulingItem() {
        if (workSchedulingItem == null) {
            workSchedulingItem = new ArrayList<WorkSchedulingItem>();
        }
        return this.workSchedulingItem;
    }

}
