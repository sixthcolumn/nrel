
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This optional container shall be used if it is desired to return a collection of circuit elements objects rather than the features to which these circuit elements point.
 * 
 * <p>Java class for bufferedCircuitElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bufferedCircuitElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bufferedCircuitElement" type="{http://www.multispeak.org/V5.0}bufferedCircuitElement" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bufferedCircuitElements", propOrder = {
    "bufferedCircuitElement"
})
public class BufferedCircuitElements {

    @XmlElement(required = true)
    protected List<BufferedCircuitElement> bufferedCircuitElement;

    /**
     * Gets the value of the bufferedCircuitElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bufferedCircuitElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBufferedCircuitElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BufferedCircuitElement }
     * 
     * 
     */
    public List<BufferedCircuitElement> getBufferedCircuitElement() {
        if (bufferedCircuitElement == null) {
            bufferedCircuitElement = new ArrayList<BufferedCircuitElement>();
        }
        return this.bufferedCircuitElement;
    }

}
