
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inductionMachines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inductionMachines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inductionMachine" type="{http://www.multispeak.org/V5.0}inductionMachine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inductionMachines", propOrder = {
    "inductionMachine"
})
public class InductionMachines {

    @XmlElement(required = true)
    protected List<InductionMachine> inductionMachine;

    /**
     * Gets the value of the inductionMachine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inductionMachine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInductionMachine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InductionMachine }
     * 
     * 
     */
    public List<InductionMachine> getInductionMachine() {
        if (inductionMachine == null) {
            inductionMachine = new ArrayList<InductionMachine>();
        }
        return this.inductionMachine;
    }

}
