
package org.multispeak.v5_0.commontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectivitySections complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectivitySections">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentSectionIDs" type="{http://www.multispeak.org/V5.0/commonTypes}networkModelRef" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectivitySections", propOrder = {
    "parentSectionIDs"
})
public class ConnectivitySections {

    @XmlElement(required = true)
    protected List<NetworkModelRef> parentSectionIDs;

    /**
     * Gets the value of the parentSectionIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentSectionIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentSectionIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkModelRef }
     * 
     * 
     */
    public List<NetworkModelRef> getParentSectionIDs() {
        if (parentSectionIDs == null) {
            parentSectionIDs = new ArrayList<NetworkModelRef>();
        }
        return this.parentSectionIDs;
    }

}
