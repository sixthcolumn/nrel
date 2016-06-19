
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for associatedMetersList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="associatedMetersList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="associatedMeters" type="{http://www.multispeak.org/V5.0}associatedMeters" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "associatedMetersList", propOrder = {
    "associatedMeters"
})
public class AssociatedMetersList
    extends MspReferable
{

    @XmlElement(required = true)
    protected List<AssociatedMeters> associatedMeters;

    /**
     * Gets the value of the associatedMeters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedMeters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedMeters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedMeters }
     * 
     * 
     */
    public List<AssociatedMeters> getAssociatedMeters() {
        if (associatedMeters == null) {
            associatedMeters = new ArrayList<AssociatedMeters>();
        }
        return this.associatedMeters;
    }

}
