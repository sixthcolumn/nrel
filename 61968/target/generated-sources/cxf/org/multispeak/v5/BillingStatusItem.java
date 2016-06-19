
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.BillingItemsType;


/**
 * <p>Java class for billingStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingStatusItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="billingItemsType" type="{http://www.multispeak.org/V5.0/enumerations}billingItemsType" minOccurs="0"/>
 *         &lt;element name="accountsReceivable" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="accountsReceivableThisPeriod" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingStatusItem", propOrder = {
    "billingItemsType",
    "accountsReceivable",
    "accountsReceivableThisPeriod"
})
public class BillingStatusItem
    extends MspExtensible
{

    protected BillingItemsType billingItemsType;
    protected Money accountsReceivable;
    protected Money accountsReceivableThisPeriod;

    /**
     * Gets the value of the billingItemsType property.
     * 
     * @return
     *     possible object is
     *     {@link BillingItemsType }
     *     
     */
    public BillingItemsType getBillingItemsType() {
        return billingItemsType;
    }

    /**
     * Sets the value of the billingItemsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingItemsType }
     *     
     */
    public void setBillingItemsType(BillingItemsType value) {
        this.billingItemsType = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAccountsReceivable(Money value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the accountsReceivableThisPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAccountsReceivableThisPeriod() {
        return accountsReceivableThisPeriod;
    }

    /**
     * Sets the value of the accountsReceivableThisPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAccountsReceivableThisPeriod(Money value) {
        this.accountsReceivableThisPeriod = value;
    }

}
