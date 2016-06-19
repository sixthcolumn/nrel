
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element indicates the history of the composition of a resource during various periods of time, the effectivePeriods.  The composition indicates which other resources (workers and equipmentItems (including vehicles) ) are grouped together to compose this resource during the effective period.  It also provides other information about the resource at that point in time, such as contact information, the responsible worker (e.g. crew foreman), and the abilities that the resource has to perform specific types of work when the resource has the defined composition.  
 * 
 * <p>Java class for resourceCompositionHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceCompositionHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceComposition" type="{http://www.multispeak.org/V5.0}resourceComposition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceCompositionHistory", propOrder = {
    "resourceComposition"
})
public class ResourceCompositionHistory {

    @XmlElement(required = true)
    protected List<ResourceComposition> resourceComposition;

    /**
     * Gets the value of the resourceComposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceComposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceComposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceComposition }
     * 
     * 
     */
    public List<ResourceComposition> getResourceComposition() {
        if (resourceComposition == null) {
            resourceComposition = new ArrayList<ResourceComposition>();
        }
        return this.resourceComposition;
    }

}
