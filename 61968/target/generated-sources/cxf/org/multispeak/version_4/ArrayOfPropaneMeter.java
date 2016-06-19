
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPropaneMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPropaneMeter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propaneMeter" type="{http://www.multispeak.org/Version_4.1_Release}propaneMeter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropaneMeter", propOrder = {
    "propaneMeter"
})
public class ArrayOfPropaneMeter {

    protected List<PropaneMeter> propaneMeter;

    /**
     * Gets the value of the propaneMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propaneMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropaneMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropaneMeter }
     * 
     * 
     */
    public List<PropaneMeter> getPropaneMeter() {
        if (propaneMeter == null) {
            propaneMeter = new ArrayList<PropaneMeter>();
        }
        return this.propaneMeter;
    }

}
