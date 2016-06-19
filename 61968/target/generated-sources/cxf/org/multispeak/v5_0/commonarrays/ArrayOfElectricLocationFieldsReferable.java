
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.ElectricLocationFieldsReferable;


/**
 * <p>Java class for ArrayOfElectricLocationFieldsReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfElectricLocationFieldsReferable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="electricLocationFieldsReferable" type="{http://www.multispeak.org/V5.0}electricLocationFieldsReferable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfElectricLocationFieldsReferable", propOrder = {
    "electricLocationFieldsReferable"
})
public class ArrayOfElectricLocationFieldsReferable {

    protected List<ElectricLocationFieldsReferable> electricLocationFieldsReferable;

    /**
     * Gets the value of the electricLocationFieldsReferable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricLocationFieldsReferable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricLocationFieldsReferable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricLocationFieldsReferable }
     * 
     * 
     */
    public List<ElectricLocationFieldsReferable> getElectricLocationFieldsReferable() {
        if (electricLocationFieldsReferable == null) {
            electricLocationFieldsReferable = new ArrayList<ElectricLocationFieldsReferable>();
        }
        return this.electricLocationFieldsReferable;
    }

}
