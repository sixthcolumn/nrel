
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cableOutages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cableOutages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cableOutage" type="{http://www.multispeak.org/V5.0}cableOutage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cableOutages", propOrder = {
    "cableOutage"
})
public class CableOutages {

    @XmlElement(required = true)
    protected List<CableOutage> cableOutage;

    /**
     * Gets the value of the cableOutage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cableOutage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCableOutage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CableOutage }
     * 
     * 
     */
    public List<CableOutage> getCableOutage() {
        if (cableOutage == null) {
            cableOutage = new ArrayList<CableOutage>();
        }
        return this.cableOutage;
    }

}
