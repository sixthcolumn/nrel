
package org.multispeak.v5_0.commontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * It is the intention that if there is more than one coordinate system identified here that they SHALL BE multiple identifiers for the same coordinate system.  More than one coordinate system choice Must NOT be implied.
 * 
 * <p>Java class for CSAuthorities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSAuthorities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSAuthority" type="{http://www.multispeak.org/V5.0/commonTypes}CSAuthority" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSAuthorities", propOrder = {
    "csAuthority"
})
public class CSAuthorities {

    @XmlElement(name = "CSAuthority", required = true)
    protected List<CSAuthority> csAuthority;

    /**
     * Gets the value of the csAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSAuthority }
     * 
     * 
     */
    public List<CSAuthority> getCSAuthority() {
        if (csAuthority == null) {
            csAuthority = new ArrayList<CSAuthority>();
        }
        return this.csAuthority;
    }

}
