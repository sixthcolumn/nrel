
package org.multispeak.v5_0.commontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorObjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorObjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorObject" type="{http://www.multispeak.org/V5.0/commonTypes}errorObject" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorObjects", propOrder = {
    "errorObject"
})
public class ErrorObjects {

    @XmlElement(required = true)
    protected List<ErrorObject> errorObject;

    /**
     * Gets the value of the errorObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorObject }
     * 
     * 
     */
    public List<ErrorObject> getErrorObject() {
        if (errorObject == null) {
            errorObject = new ArrayList<ErrorObject>();
        }
        return this.errorObject;
    }

}
