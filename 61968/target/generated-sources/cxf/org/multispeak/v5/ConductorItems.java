
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure defines the conductors and their arrangement on the pole/tower, including bundling if any. These entries in the lineConstructionEnty are linked to the phaseList in a data instance of an ACLineSegment using the positionNumber, which refers to the conductor location on a defined framing.
 * 
 * <p>Java class for conductorItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conductorItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conductorItem" type="{http://www.multispeak.org/V5.0}conductorItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conductorItems", propOrder = {
    "conductorItem"
})
public class ConductorItems {

    @XmlElement(required = true)
    protected List<ConductorItem> conductorItem;

    /**
     * Gets the value of the conductorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conductorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConductorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConductorItem }
     * 
     * 
     */
    public List<ConductorItem> getConductorItem() {
        if (conductorItem == null) {
            conductorItem = new ArrayList<ConductorItem>();
        }
        return this.conductorItem;
    }

}
