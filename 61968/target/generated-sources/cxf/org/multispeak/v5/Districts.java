
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These are text identifiers for polygonal land ares that comprise different districts, such as taxation districts, school districts, etc.
 * 
 * <p>Java class for districts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="districts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="district" type="{http://www.multispeak.org/V5.0}district" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "districts", propOrder = {
    "district"
})
public class Districts {

    @XmlElement(required = true)
    protected List<District> district;

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link District }
     * 
     * 
     */
    public List<District> getDistrict() {
        if (district == null) {
            district = new ArrayList<District>();
        }
        return this.district;
    }

}
