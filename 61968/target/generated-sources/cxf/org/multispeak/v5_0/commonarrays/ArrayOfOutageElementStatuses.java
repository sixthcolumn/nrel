
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.OutageElementStatuses;


/**
 * <p>Java class for ArrayOfOutageElementStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageElementStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageElementStatuses" type="{http://www.multispeak.org/V5.0}outageElementStatuses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutageElementStatuses", propOrder = {
    "outageElementStatuses"
})
public class ArrayOfOutageElementStatuses {

    protected List<OutageElementStatuses> outageElementStatuses;

    /**
     * Gets the value of the outageElementStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageElementStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageElementStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageElementStatuses }
     * 
     * 
     */
    public List<OutageElementStatuses> getOutageElementStatuses() {
        if (outageElementStatuses == null) {
            outageElementStatuses = new ArrayList<OutageElementStatuses>();
        }
        return this.outageElementStatuses;
    }

}
