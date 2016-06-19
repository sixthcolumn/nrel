
package com.epri._2013.dergroupdispatches;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DERGroupDispatches complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupDispatches">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupDispatch" type="{http://www.epri.com/2013/DERGroupDispatches#}DERGroupDispatch" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupDispatches", propOrder = {
    "derGroupDispatch"
})
public class DERGroupDispatches {

    @XmlElement(name = "DERGroupDispatch", required = true)
    protected List<DERGroupDispatch> derGroupDispatch;

    /**
     * Gets the value of the derGroupDispatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroupDispatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroupDispatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroupDispatch }
     * 
     * 
     */
    public List<DERGroupDispatch> getDERGroupDispatch() {
        if (derGroupDispatch == null) {
            derGroupDispatch = new ArrayList<DERGroupDispatch>();
        }
        return this.derGroupDispatch;
    }

}
