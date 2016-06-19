
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.PANCommission;


/**
 * <p>Java class for ArrayOfPANCommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPANCommission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PANCommission" type="{http://www.multispeak.org/V5.0}PANCommission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPANCommission", propOrder = {
    "panCommission"
})
public class ArrayOfPANCommission {

    @XmlElement(name = "PANCommission", nillable = true)
    protected List<PANCommission> panCommission;

    /**
     * Gets the value of the panCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPANCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PANCommission }
     * 
     * 
     */
    public List<PANCommission> getPANCommission() {
        if (panCommission == null) {
            panCommission = new ArrayList<PANCommission>();
        }
        return this.panCommission;
    }

}
