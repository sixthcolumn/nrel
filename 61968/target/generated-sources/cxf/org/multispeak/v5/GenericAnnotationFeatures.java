
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an array of genericAnnotationFeatures.
 * 
 * <p>Java class for genericAnnotationFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericAnnotationFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericAnnotationFeature" type="{http://www.multispeak.org/V5.0}genericAnnotationFeature" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericAnnotationFeatures", propOrder = {
    "genericAnnotationFeature"
})
public class GenericAnnotationFeatures {

    @XmlElement(required = true)
    protected List<GenericAnnotationFeature> genericAnnotationFeature;

    /**
     * Gets the value of the genericAnnotationFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericAnnotationFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericAnnotationFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericAnnotationFeature }
     * 
     * 
     */
    public List<GenericAnnotationFeature> getGenericAnnotationFeature() {
        if (genericAnnotationFeature == null) {
            genericAnnotationFeature = new ArrayList<GenericAnnotationFeature>();
        }
        return this.genericAnnotationFeature;
    }

}
