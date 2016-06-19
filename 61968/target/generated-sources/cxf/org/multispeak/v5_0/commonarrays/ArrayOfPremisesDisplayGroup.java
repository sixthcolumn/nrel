
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.PremisesDisplayGroup;


/**
 * <p>Java class for ArrayOfPremisesDisplayGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPremisesDisplayGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premisesDisplayGroup" type="{http://www.multispeak.org/V5.0}premisesDisplayGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPremisesDisplayGroup", propOrder = {
    "premisesDisplayGroup"
})
public class ArrayOfPremisesDisplayGroup {

    protected List<PremisesDisplayGroup> premisesDisplayGroup;

    /**
     * Gets the value of the premisesDisplayGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesDisplayGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesDisplayGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesDisplayGroup }
     * 
     * 
     */
    public List<PremisesDisplayGroup> getPremisesDisplayGroup() {
        if (premisesDisplayGroup == null) {
            premisesDisplayGroup = new ArrayList<PremisesDisplayGroup>();
        }
        return this.premisesDisplayGroup;
    }

}
