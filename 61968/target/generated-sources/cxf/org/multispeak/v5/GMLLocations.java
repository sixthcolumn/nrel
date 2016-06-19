
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.GMLLocation;


/**
 * <p>Java class for GMLLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLLocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GMLLocation" type="{http://www.multispeak.org/V5.0/commonTypes}GMLLocation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLLocations", propOrder = {
    "gmlLocation"
})
public class GMLLocations {

    @XmlElement(name = "GMLLocation", required = true)
    protected List<GMLLocation> gmlLocation;

    /**
     * Gets the value of the gmlLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gmlLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGMLLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMLLocation }
     * 
     * 
     */
    public List<GMLLocation> getGMLLocation() {
        if (gmlLocation == null) {
            gmlLocation = new ArrayList<GMLLocation>();
        }
        return this.gmlLocation;
    }

}
