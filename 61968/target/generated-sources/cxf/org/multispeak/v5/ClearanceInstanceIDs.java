
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * List of clearance instances that are associated with this clearanceCertificate. ClearanceInstances may be referenced using just their clearanceInstanceID (objectID of the clearanceInstance.
 * 
 * <p>Java class for clearanceInstanceIDs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearanceInstanceIDs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearanceInstanceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearanceInstanceIDs", propOrder = {
    "clearanceInstanceID"
})
public class ClearanceInstanceIDs {

    @XmlElement(required = true)
    protected List<ObjectID> clearanceInstanceID;

    /**
     * Gets the value of the clearanceInstanceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearanceInstanceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearanceInstanceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectID }
     * 
     * 
     */
    public List<ObjectID> getClearanceInstanceID() {
        if (clearanceInstanceID == null) {
            clearanceInstanceID = new ArrayList<ObjectID>();
        }
        return this.clearanceInstanceID;
    }

}
