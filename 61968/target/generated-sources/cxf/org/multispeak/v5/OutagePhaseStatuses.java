
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outagePhaseStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outagePhaseStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outagePhaseStatus" type="{http://www.multispeak.org/V5.0}outagePhaseStatus" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outagePhaseStatuses", propOrder = {
    "outagePhaseStatus"
})
public class OutagePhaseStatuses {

    @XmlElement(required = true)
    protected List<OutagePhaseStatus> outagePhaseStatus;

    /**
     * Gets the value of the outagePhaseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outagePhaseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutagePhaseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutagePhaseStatus }
     * 
     * 
     */
    public List<OutagePhaseStatus> getOutagePhaseStatus() {
        if (outagePhaseStatus == null) {
            outagePhaseStatus = new ArrayList<OutagePhaseStatus>();
        }
        return this.outagePhaseStatus;
    }

}
