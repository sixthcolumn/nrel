
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an optional item that includes all of the premises contained in this GIS parcel.
 * 
 * <p>Java class for premisesObjectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesObjectList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premises" type="{http://www.multispeak.org/V5.0}premises" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premisesObjectList", propOrder = {
    "premises"
})
public class PremisesObjectList {

    @XmlElement(required = true)
    protected List<Premises> premises;

    /**
     * Gets the value of the premises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premises }
     * 
     * 
     */
    public List<Premises> getPremises() {
        if (premises == null) {
            premises = new ArrayList<Premises>();
        }
        return this.premises;
    }

}
