
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a list of pointers to ACLineSegments that are carried in this conduit.
 * 
 * <p>Java class for conduitContentsRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conduitContentsRefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conduitContentsRef" type="{http://www.multispeak.org/V5.0}conduitContentsRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conduitContentsRefs", propOrder = {
    "conduitContentsRef"
})
public class ConduitContentsRefs {

    @XmlElement(required = true)
    protected List<ConduitContentsRef> conduitContentsRef;

    /**
     * Gets the value of the conduitContentsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conduitContentsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConduitContentsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConduitContentsRef }
     * 
     * 
     */
    public List<ConduitContentsRef> getConduitContentsRef() {
        if (conduitContentsRef == null) {
            conduitContentsRef = new ArrayList<ConduitContentsRef>();
        }
        return this.conduitContentsRef;
    }

}
