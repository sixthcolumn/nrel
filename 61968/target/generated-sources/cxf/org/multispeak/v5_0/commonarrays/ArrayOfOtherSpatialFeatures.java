
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.OtherSpatialFeatures;


/**
 * <p>Java class for ArrayOfOtherSpatialFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOtherSpatialFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherSpatialFeatures" type="{http://www.multispeak.org/V5.0}otherSpatialFeatures" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOtherSpatialFeatures", propOrder = {
    "otherSpatialFeatures"
})
public class ArrayOfOtherSpatialFeatures {

    protected List<OtherSpatialFeatures> otherSpatialFeatures;

    /**
     * Gets the value of the otherSpatialFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSpatialFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSpatialFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSpatialFeatures }
     * 
     * 
     */
    public List<OtherSpatialFeatures> getOtherSpatialFeatures() {
        if (otherSpatialFeatures == null) {
            otherSpatialFeatures = new ArrayList<OtherSpatialFeatures>();
        }
        return this.otherSpatialFeatures;
    }

}
