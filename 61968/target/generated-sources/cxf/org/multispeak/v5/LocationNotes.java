
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element gives information that is important for service workers to know about this customer, serviceLocation or service.  Information might include the fact that the meter is inside the residence, there is a bad dog, a special key is required for access, etc.
 * 
 * <p>Java class for locationNotes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationNotes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationNote" type="{http://www.multispeak.org/V5.0}locationNote" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationNotes", propOrder = {
    "locationNote"
})
public class LocationNotes {

    @XmlElement(required = true)
    protected List<LocationNote> locationNote;

    /**
     * Gets the value of the locationNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationNote }
     * 
     * 
     */
    public List<LocationNote> getLocationNote() {
        if (locationNote == null) {
            locationNote = new ArrayList<LocationNote>();
        }
        return this.locationNote;
    }

}
