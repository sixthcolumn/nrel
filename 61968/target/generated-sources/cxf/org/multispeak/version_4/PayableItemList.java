
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payableItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payableItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payableItem" type="{http://www.multispeak.org/Version_4.1_Release}payableItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowableTransactionTypes" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payableItemList", propOrder = {
    "payableItem",
    "allowableTransactionTypes"
})
public class PayableItemList {

    protected List<PayableItem> payableItem;
    protected ArrayOfString17 allowableTransactionTypes;

    /**
     * Gets the value of the payableItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payableItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayableItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayableItem }
     * 
     * 
     */
    public List<PayableItem> getPayableItem() {
        if (payableItem == null) {
            payableItem = new ArrayList<PayableItem>();
        }
        return this.payableItem;
    }

    /**
     * Gets the value of the allowableTransactionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString17 }
     *     
     */
    public ArrayOfString17 getAllowableTransactionTypes() {
        return allowableTransactionTypes;
    }

    /**
     * Sets the value of the allowableTransactionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString17 }
     *     
     */
    public void setAllowableTransactionTypes(ArrayOfString17 value) {
        this.allowableTransactionTypes = value;
    }

}
