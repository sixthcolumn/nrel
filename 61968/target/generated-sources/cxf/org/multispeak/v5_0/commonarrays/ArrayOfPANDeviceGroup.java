
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.PANDeviceGroup;


/**
 * <p>Java class for ArrayOfPANDeviceGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPANDeviceGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceGroup" type="{http://www.multispeak.org/V5.0}PANDeviceGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPANDeviceGroup", propOrder = {
    "panDeviceGroup"
})
public class ArrayOfPANDeviceGroup {

    @XmlElement(name = "PANDeviceGroup")
    protected List<PANDeviceGroup> panDeviceGroup;

    /**
     * Gets the value of the panDeviceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panDeviceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPANDeviceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PANDeviceGroup }
     * 
     * 
     */
    public List<PANDeviceGroup> getPANDeviceGroup() {
        if (panDeviceGroup == null) {
            panDeviceGroup = new ArrayList<PANDeviceGroup>();
        }
        return this.panDeviceGroup;
    }

}
