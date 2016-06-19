
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The outages that have been deleted as a result of the merger of consitutent outages.
 * 
 * <p>Java class for deletedOutages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletedOutages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletedOutage" type="{http://www.multispeak.org/V5.0}outageRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletedOutages", propOrder = {
    "deletedOutage"
})
public class DeletedOutages {

    @XmlElement(required = true)
    protected List<OutageRef> deletedOutage;

    /**
     * Gets the value of the deletedOutage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedOutage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedOutage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageRef }
     * 
     * 
     */
    public List<OutageRef> getDeletedOutage() {
        if (deletedOutage == null) {
            deletedOutage = new ArrayList<OutageRef>();
        }
        return this.deletedOutage;
    }

}
