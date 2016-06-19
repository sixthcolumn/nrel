
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.DomainMember;


/**
 * <p>Java class for ArrayOfDomainMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDomainMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domainMember" type="{http://www.multispeak.org/V5.0}domainMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDomainMember", propOrder = {
    "domainMember"
})
public class ArrayOfDomainMember {

    @XmlElement(nillable = true)
    protected List<DomainMember> domainMember;

    /**
     * Gets the value of the domainMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainMember }
     * 
     * 
     */
    public List<DomainMember> getDomainMember() {
        if (domainMember == null) {
            domainMember = new ArrayList<DomainMember>();
        }
        return this.domainMember;
    }

}