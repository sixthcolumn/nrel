
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricOutages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricOutages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="electricOutage" type="{http://www.multispeak.org/V5.0}electricOutage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricOutages", propOrder = {
    "electricOutage"
})
public class ElectricOutages {

    @XmlElement(required = true)
    protected List<ElectricOutage> electricOutage;

    /**
     * Gets the value of the electricOutage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricOutage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricOutage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricOutage }
     * 
     * 
     */
    public List<ElectricOutage> getElectricOutage() {
        if (electricOutage == null) {
            electricOutage = new ArrayList<ElectricOutage>();
        }
        return this.electricOutage;
    }

}
