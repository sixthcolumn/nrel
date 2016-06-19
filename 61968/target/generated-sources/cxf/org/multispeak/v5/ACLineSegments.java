
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACLineSegments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACLineSegments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACLineSegment" type="{http://www.multispeak.org/V5.0}ACLineSegment" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACLineSegments", propOrder = {
    "acLineSegment"
})
public class ACLineSegments {

    @XmlElement(name = "ACLineSegment", required = true)
    protected List<ACLineSegment> acLineSegment;

    /**
     * Gets the value of the acLineSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acLineSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACLineSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACLineSegment }
     * 
     * 
     */
    public List<ACLineSegment> getACLineSegment() {
        if (acLineSegment == null) {
            acLineSegment = new ArrayList<ACLineSegment>();
        }
        return this.acLineSegment;
    }

}
