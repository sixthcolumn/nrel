
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * <p>Java class for billingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="ppmLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="revenueMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CISBillDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorBalance" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="creditCharge" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="debitCharge" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="CISBalanceAfterBilling" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="chargeItems" type="{http://www.multispeak.org/V5.0}chargeItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingDetail", propOrder = {
    "accountID",
    "serviceLocationID",
    "servicePointID",
    "ppmLocationID",
    "meterID",
    "revenueMonth",
    "revenueYear",
    "cisBillDate",
    "billingCycle",
    "priorBalance",
    "payment",
    "creditCharge",
    "debitCharge",
    "cisBalanceAfterBilling",
    "chargeItems"
})
public class BillingDetail
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID accountID;
    protected ObjectID serviceLocationID;
    protected ServicePointID servicePointID;
    protected ServicePointID ppmLocationID;
    protected MeterID meterID;
    protected String revenueMonth;
    protected String revenueYear;
    @XmlElement(name = "CISBillDate")
    protected XMLGregorianCalendar cisBillDate;
    protected String billingCycle;
    protected Money priorBalance;
    protected Money payment;
    protected Money creditCharge;
    protected Money debitCharge;
    @XmlElement(name = "CISBalanceAfterBilling")
    protected Money cisBalanceAfterBilling;
    protected ChargeItems chargeItems;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setAccountID(ObjectID value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the servicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getServicePointID() {
        return servicePointID;
    }

    /**
     * Sets the value of the servicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setServicePointID(ServicePointID value) {
        this.servicePointID = value;
    }

    /**
     * Gets the value of the ppmLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getPpmLocationID() {
        return ppmLocationID;
    }

    /**
     * Sets the value of the ppmLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setPpmLocationID(ServicePointID value) {
        this.ppmLocationID = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the revenueMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueMonth() {
        return revenueMonth;
    }

    /**
     * Sets the value of the revenueMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueMonth(String value) {
        this.revenueMonth = value;
    }

    /**
     * Gets the value of the revenueYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueYear() {
        return revenueYear;
    }

    /**
     * Sets the value of the revenueYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueYear(String value) {
        this.revenueYear = value;
    }

    /**
     * Gets the value of the cisBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCISBillDate() {
        return cisBillDate;
    }

    /**
     * Sets the value of the cisBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCISBillDate(XMLGregorianCalendar value) {
        this.cisBillDate = value;
    }

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycle(String value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the priorBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPriorBalance() {
        return priorBalance;
    }

    /**
     * Sets the value of the priorBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPriorBalance(Money value) {
        this.priorBalance = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPayment(Money value) {
        this.payment = value;
    }

    /**
     * Gets the value of the creditCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCreditCharge() {
        return creditCharge;
    }

    /**
     * Sets the value of the creditCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCreditCharge(Money value) {
        this.creditCharge = value;
    }

    /**
     * Gets the value of the debitCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDebitCharge() {
        return debitCharge;
    }

    /**
     * Sets the value of the debitCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDebitCharge(Money value) {
        this.debitCharge = value;
    }

    /**
     * Gets the value of the cisBalanceAfterBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCISBalanceAfterBilling() {
        return cisBalanceAfterBilling;
    }

    /**
     * Sets the value of the cisBalanceAfterBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCISBalanceAfterBilling(Money value) {
        this.cisBalanceAfterBilling = value;
    }

    /**
     * Gets the value of the chargeItems property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeItems }
     *     
     */
    public ChargeItems getChargeItems() {
        return chargeItems;
    }

    /**
     * Sets the value of the chargeItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeItems }
     *     
     */
    public void setChargeItems(ChargeItems value) {
        this.chargeItems = value;
    }

}
