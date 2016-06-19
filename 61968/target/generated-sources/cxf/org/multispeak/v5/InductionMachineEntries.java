
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inductionMachineEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inductionMachineEntries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inductionMachineEntry" type="{http://www.multispeak.org/V5.0}inductionMachineEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inductionMachineEntries", propOrder = {
    "inductionMachineEntry"
})
public class InductionMachineEntries {

    @XmlElement(required = true)
    protected List<InductionMachineEntry> inductionMachineEntry;

    /**
     * Gets the value of the inductionMachineEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inductionMachineEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInductionMachineEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InductionMachineEntry }
     * 
     * 
     */
    public List<InductionMachineEntry> getInductionMachineEntry() {
        if (inductionMachineEntry == null) {
            inductionMachineEntry = new ArrayList<InductionMachineEntry>();
        }
        return this.inductionMachineEntry;
    }

}
