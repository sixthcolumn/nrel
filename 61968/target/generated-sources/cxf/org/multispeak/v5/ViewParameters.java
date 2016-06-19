
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewParameter" type="{http://www.multispeak.org/V5.0}viewParameter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewParameters", propOrder = {
    "viewParameter"
})
public class ViewParameters {

    @XmlElement(required = true)
    protected List<ViewParameter> viewParameter;

    /**
     * Gets the value of the viewParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewParameter }
     * 
     * 
     */
    public List<ViewParameter> getViewParameter() {
        if (viewParameter == null) {
            viewParameter = new ArrayList<ViewParameter>();
        }
        return this.viewParameter;
    }

}
