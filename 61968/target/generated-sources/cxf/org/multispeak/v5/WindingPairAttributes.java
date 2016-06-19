
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These are attributes of a transformer winding pair that are used in a transformer engineering equipment catalog entry.
 * 
 * <p>Java class for windingPairAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="windingPairAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="windingPair" type="{http://www.multispeak.org/V5.0}windingPair" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "windingPairAttributes", propOrder = {
    "windingPair"
})
public class WindingPairAttributes {

    @XmlElement(required = true)
    protected List<WindingPair> windingPair;

    /**
     * Gets the value of the windingPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windingPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindingPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WindingPair }
     * 
     * 
     */
    public List<WindingPair> getWindingPair() {
        if (windingPair == null) {
            windingPair = new ArrayList<WindingPair>();
        }
        return this.windingPair;
    }

}
