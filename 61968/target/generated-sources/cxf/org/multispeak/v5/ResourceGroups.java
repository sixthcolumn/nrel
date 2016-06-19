
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Groupings of resources.  For instance a group of workers might"Tree trimmers", a group of crews might be "Force crews" or "Contract crews", etc.
 * 
 * <p>Java class for resourceGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceGroup" type="{http://www.multispeak.org/V5.0}resourceGroup" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceGroups", propOrder = {
    "resourceGroup"
})
public class ResourceGroups {

    @XmlElement(required = true)
    protected List<ResourceGroup> resourceGroup;

    /**
     * Gets the value of the resourceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceGroup }
     * 
     * 
     */
    public List<ResourceGroup> getResourceGroup() {
        if (resourceGroup == null) {
            resourceGroup = new ArrayList<ResourceGroup>();
        }
        return this.resourceGroup;
    }

}
