
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an optional list that specifies the abilities that a resource needs to have in order to perform the work necessary on this materialManagementAssembly.
 * 
 * <p>Java class for requiredAbilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requiredAbilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requiredAbilityItem" type="{http://www.multispeak.org/V5.0}requiredAbilityItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requiredAbilities", propOrder = {
    "requiredAbilityItem"
})
public class RequiredAbilities {

    @XmlElement(required = true)
    protected List<RequiredAbilityItem> requiredAbilityItem;

    /**
     * Gets the value of the requiredAbilityItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredAbilityItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredAbilityItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredAbilityItem }
     * 
     * 
     */
    public List<RequiredAbilityItem> getRequiredAbilityItem() {
        if (requiredAbilityItem == null) {
            requiredAbilityItem = new ArrayList<RequiredAbilityItem>();
        }
        return this.requiredAbilityItem;
    }

}
