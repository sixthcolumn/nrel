
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * These are references to objects for features that are found within the buffer distance from the point identified in the buffered point. The distance from the specified location can be identified using the distance element.
 * 
 * <p>Java class for bufferedObjectRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bufferedObjectRefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="bufferedObjectRef" type="{http://www.multispeak.org/V5.0}bufferedObjectRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bufferedObjectRefs", propOrder = {
    "bufferedObjectRef"
})
public class BufferedObjectRefs {

    protected List<BufferedObjectRef> bufferedObjectRef;

    /**
     * Gets the value of the bufferedObjectRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bufferedObjectRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBufferedObjectRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BufferedObjectRef }
     * 
     * 
     */
    public List<BufferedObjectRef> getBufferedObjectRef() {
        if (bufferedObjectRef == null) {
            bufferedObjectRef = new ArrayList<BufferedObjectRef>();
        }
        return this.bufferedObjectRef;
    }

}
