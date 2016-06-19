
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.AllowableTransactionType;


/**
 * <p>Java class for allowableTransactionTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allowableTransactionTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowableTransactionType" type="{http://www.multispeak.org/V5.0/enumerations}allowableTransactionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allowableTransactionTypes", propOrder = {
    "allowableTransactionType"
})
public class AllowableTransactionTypes {

    @XmlElement(required = true)
    protected List<AllowableTransactionType> allowableTransactionType;

    /**
     * Gets the value of the allowableTransactionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowableTransactionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowableTransactionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowableTransactionType }
     * 
     * 
     */
    public List<AllowableTransactionType> getAllowableTransactionType() {
        if (allowableTransactionType == null) {
            allowableTransactionType = new ArrayList<AllowableTransactionType>();
        }
        return this.allowableTransactionType;
    }

}
