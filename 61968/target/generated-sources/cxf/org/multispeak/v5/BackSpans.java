
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of back spans from this stations.
 * 
 * <p>Java class for backSpans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="backSpans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backSpan" type="{http://www.multispeak.org/V5.0}backSpan" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "backSpans", propOrder = {
    "backSpan"
})
public class BackSpans {

    @XmlElement(required = true)
    protected List<BackSpan> backSpan;

    /**
     * Gets the value of the backSpan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backSpan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackSpan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackSpan }
     * 
     * 
     */
    public List<BackSpan> getBackSpan() {
        if (backSpan == null) {
            backSpan = new ArrayList<BackSpan>();
        }
        return this.backSpan;
    }

}
