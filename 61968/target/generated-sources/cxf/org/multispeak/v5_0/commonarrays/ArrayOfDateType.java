
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.AssociatedDateType;


/**
 * <p>Java class for ArrayOfDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateType" type="{http://www.multispeak.org/V5.0/enumerations}associatedDateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDateType", propOrder = {
    "dateType"
})
public class ArrayOfDateType {

    protected List<AssociatedDateType> dateType;

    /**
     * Gets the value of the dateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedDateType }
     * 
     * 
     */
    public List<AssociatedDateType> getDateType() {
        if (dateType == null) {
            dateType = new ArrayList<AssociatedDateType>();
        }
        return this.dateType;
    }

}
