
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * List of items to which a customer payment could be applied.
 * 
 * <p>Java class for payableItemsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payableItemsList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="payableItems" type="{http://www.multispeak.org/V5.0}payableItems" minOccurs="0"/>
 *         &lt;element name="allowableTransactionTypes" type="{http://www.multispeak.org/V5.0}allowableTransactionTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payableItemsList", propOrder = {
    "payableItems",
    "allowableTransactionTypes"
})
public class PayableItemsList
    extends MspExtensible
{

    protected PayableItems payableItems;
    protected AllowableTransactionTypes allowableTransactionTypes;

    /**
     * Gets the value of the payableItems property.
     * 
     * @return
     *     possible object is
     *     {@link PayableItems }
     *     
     */
    public PayableItems getPayableItems() {
        return payableItems;
    }

    /**
     * Sets the value of the payableItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableItems }
     *     
     */
    public void setPayableItems(PayableItems value) {
        this.payableItems = value;
    }

    /**
     * Gets the value of the allowableTransactionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link AllowableTransactionTypes }
     *     
     */
    public AllowableTransactionTypes getAllowableTransactionTypes() {
        return allowableTransactionTypes;
    }

    /**
     * Sets the value of the allowableTransactionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowableTransactionTypes }
     *     
     */
    public void setAllowableTransactionTypes(AllowableTransactionTypes value) {
        this.allowableTransactionTypes = value;
    }

}
