
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.PANAddressingGroup;


/**
 * <p>Java class for ArrayOfPANAddressingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPANAddressingGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PANAddressingGroup" type="{http://www.multispeak.org/V5.0}PANAddressingGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPANAddressingGroup", propOrder = {
    "panAddressingGroup"
})
public class ArrayOfPANAddressingGroup {

    @XmlElement(name = "PANAddressingGroup")
    protected List<PANAddressingGroup> panAddressingGroup;

    /**
     * Gets the value of the panAddressingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panAddressingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPANAddressingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PANAddressingGroup }
     * 
     * 
     */
    public List<PANAddressingGroup> getPANAddressingGroup() {
        if (panAddressingGroup == null) {
            panAddressingGroup = new ArrayList<PANAddressingGroup>();
        }
        return this.panAddressingGroup;
    }

}
