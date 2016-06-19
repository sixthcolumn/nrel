
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secondaryConductorEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondaryConductorEntries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="secondaryConductorEntry" type="{http://www.multispeak.org/V5.0}secondaryConductorEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "secondaryConductorEntries", propOrder = {
    "secondaryConductorEntry"
})
public class SecondaryConductorEntries {

    @XmlElement(required = true)
    protected List<SecondaryConductorEntry> secondaryConductorEntry;

    /**
     * Gets the value of the secondaryConductorEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryConductorEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryConductorEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryConductorEntry }
     * 
     * 
     */
    public List<SecondaryConductorEntry> getSecondaryConductorEntry() {
        if (secondaryConductorEntry == null) {
            secondaryConductorEntry = new ArrayList<SecondaryConductorEntry>();
        }
        return this.secondaryConductorEntry;
    }

}
