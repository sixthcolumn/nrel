
package com.epri._2013.dergroupstatuses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DERGroupStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERGroupStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERGroupStatuses" type="{http://www.epri.com/2013/DERGroupStatuses#}DERGroupStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERGroupStatuses", propOrder = {
    "derGroupStatuses"
})
public class DERGroupStatuses {

    @XmlElement(name = "DERGroupStatuses", required = true)
    protected List<DERGroupStatus> derGroupStatuses;

    /**
     * Gets the value of the derGroupStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derGroupStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERGroupStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERGroupStatus }
     * 
     * 
     */
    public List<DERGroupStatus> getDERGroupStatuses() {
        if (derGroupStatuses == null) {
            derGroupStatuses = new ArrayList<DERGroupStatus>();
        }
        return this.derGroupStatuses;
    }

}
