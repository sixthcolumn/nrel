
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for cabinetContentsItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cabinetContentsItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinetContentsItem" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabinetContentsItems", propOrder = {
    "cabinetContentsItem"
})
public class CabinetContentsItems {

    @XmlElement(required = true)
    protected List<ObjectRef> cabinetContentsItem;

    /**
     * Gets the value of the cabinetContentsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinetContentsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinetContentsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectRef }
     * 
     * 
     */
    public List<ObjectRef> getCabinetContentsItem() {
        if (cabinetContentsItem == null) {
            cabinetContentsItem = new ArrayList<ObjectRef>();
        }
        return this.cabinetContentsItem;
    }

}
