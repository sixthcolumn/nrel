
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Money due on a customer account.
 * 
 * <p>Java class for accountsReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountsReceivable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctsReceivable" type="{http://www.multispeak.org/V5.0}acctsReceivable" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountsReceivable", propOrder = {
    "acctsReceivable"
})
public class AccountsReceivable {

    @XmlElement(required = true)
    protected List<AcctsReceivable> acctsReceivable;

    /**
     * Gets the value of the acctsReceivable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctsReceivable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctsReceivable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctsReceivable }
     * 
     * 
     */
    public List<AcctsReceivable> getAcctsReceivable() {
        if (acctsReceivable == null) {
            acctsReceivable = new ArrayList<AcctsReceivable>();
        }
        return this.acctsReceivable;
    }

}
