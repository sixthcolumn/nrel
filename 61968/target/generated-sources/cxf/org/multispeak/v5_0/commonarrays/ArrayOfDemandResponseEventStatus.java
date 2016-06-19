
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.DemandResponseEventStatus;


/**
 * <p>Java class for ArrayOfDemandResponseEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDemandResponseEventStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="demandResponseEventStatus" type="{http://www.multispeak.org/V5.0}demandResponseEventStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDemandResponseEventStatus", propOrder = {
    "demandResponseEventStatus"
})
public class ArrayOfDemandResponseEventStatus {

    @XmlElement(nillable = true)
    protected List<DemandResponseEventStatus> demandResponseEventStatus;

    /**
     * Gets the value of the demandResponseEventStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandResponseEventStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandResponseEventStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemandResponseEventStatus }
     * 
     * 
     */
    public List<DemandResponseEventStatus> getDemandResponseEventStatus() {
        if (demandResponseEventStatus == null) {
            demandResponseEventStatus = new ArrayList<DemandResponseEventStatus>();
        }
        return this.demandResponseEventStatus;
    }

}
