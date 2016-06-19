
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.cpsm.Bay;


/**
 * Bays are containers that can be used to designate collections of equipment associated with a substation bay.  Bays are required in CIM but not necessary in MultiSpeak.
 * 
 * <p>Java class for bays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bay" type="{http://www.multispeak.org/V5.0/cpsm}Bay" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bays", propOrder = {
    "bay"
})
public class Bays {

    @XmlElement(name = "Bay", required = true)
    protected List<Bay> bay;

    /**
     * Gets the value of the bay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bay }
     * 
     * 
     */
    public List<Bay> getBay() {
        if (bay == null) {
            bay = new ArrayList<Bay>();
        }
        return this.bay;
    }

}
