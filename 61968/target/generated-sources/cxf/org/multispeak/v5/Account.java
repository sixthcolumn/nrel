
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.AccountStatus;


/**
 * This is a customer account.  For the account object, the primaryIdentifier is the accountNumber.
 * 
 * <p>Java class for account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountsReceivable" type="{http://www.multispeak.org/V5.0}accountsReceivable" minOccurs="0"/>
 *         &lt;element name="serviceLocations" type="{http://www.multispeak.org/V5.0}serviceLocations" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.multispeak.org/V5.0/enumerations}accountStatus" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDueDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="lastPaymentDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="lastPaymentAmount" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="billDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="isPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculatedCurrentBillAmount" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="calculatedCurrentBillDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="calculatedCurrentBillReadings" type="{http://www.multispeak.org/V5.0}calculatedCurrentBillReadings" minOccurs="0"/>
 *         &lt;element name="lastBillAmount" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="calculatedUsedYesterday" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="serviceAgreements" type="{http://www.multispeak.org/V5.0}serviceAgreements" minOccurs="0"/>
 *         &lt;element name="workOrderReferences" type="{http://www.multispeak.org/V5.0}workOrderReferences" minOccurs="0"/>
 *         &lt;element name="accountPriorities" type="{http://www.multispeak.org/V5.0}accountPriorities" minOccurs="0"/>
 *         &lt;element name="accountDeposits" type="{http://www.multispeak.org/V5.0}accountDeposits" minOccurs="0"/>
 *         &lt;element name="serviceOrderIDs" type="{http://www.multispeak.org/V5.0}serviceOrderIDs" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "customerID",
    "accountsReceivable",
    "serviceLocations",
    "accountStatus",
    "billingCycle",
    "budgetBill",
    "paymentDueDate",
    "lastPaymentDate",
    "lastPaymentAmount",
    "billDate",
    "shutOffDate",
    "isPrePay",
    "billingTerms",
    "calculatedCurrentBillAmount",
    "calculatedCurrentBillDateTime",
    "calculatedCurrentBillReadings",
    "lastBillAmount",
    "calculatedUsedYesterday",
    "serviceAgreements",
    "workOrderReferences",
    "accountPriorities",
    "accountDeposits",
    "serviceOrderIDs"
})
public class Account
    extends MspObject
{

    protected ObjectID customerID;
    protected AccountsReceivable accountsReceivable;
    protected ServiceLocations serviceLocations;
    protected AccountStatus accountStatus;
    protected String billingCycle;
    protected String budgetBill;
    protected XMLGregorianCalendar paymentDueDate;
    protected XMLGregorianCalendar lastPaymentDate;
    protected Money lastPaymentAmount;
    protected XMLGregorianCalendar billDate;
    protected XMLGregorianCalendar shutOffDate;
    protected Boolean isPrePay;
    protected String billingTerms;
    protected Money calculatedCurrentBillAmount;
    protected XMLGregorianCalendar calculatedCurrentBillDateTime;
    protected CalculatedCurrentBillReadings calculatedCurrentBillReadings;
    protected Money lastBillAmount;
    protected Money calculatedUsedYesterday;
    protected ServiceAgreements serviceAgreements;
    protected WorkOrderReferences workOrderReferences;
    protected AccountPriorities accountPriorities;
    protected AccountDeposits accountDeposits;
    protected ServiceOrderIDs serviceOrderIDs;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setCustomerID(ObjectID value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link AccountsReceivable }
     *     
     */
    public AccountsReceivable getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsReceivable }
     *     
     */
    public void setAccountsReceivable(AccountsReceivable value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the serviceLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocations }
     *     
     */
    public ServiceLocations getServiceLocations() {
        return serviceLocations;
    }

    /**
     * Sets the value of the serviceLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocations }
     *     
     */
    public void setServiceLocations(ServiceLocations value) {
        this.serviceLocations = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setAccountStatus(AccountStatus value) {
        this.accountStatus = value;
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
     * Gets the value of the budgetBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetBill() {
        return budgetBill;
    }

    /**
     * Sets the value of the budgetBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetBill(String value) {
        this.budgetBill = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDueDate(XMLGregorianCalendar value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the lastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLastPaymentAmount(Money value) {
        this.lastPaymentAmount = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the shutOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShutOffDate() {
        return shutOffDate;
    }

    /**
     * Sets the value of the shutOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShutOffDate(XMLGregorianCalendar value) {
        this.shutOffDate = value;
    }

    /**
     * Gets the value of the isPrePay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrePay() {
        return isPrePay;
    }

    /**
     * Sets the value of the isPrePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrePay(Boolean value) {
        this.isPrePay = value;
    }

    /**
     * Gets the value of the billingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingTerms() {
        return billingTerms;
    }

    /**
     * Sets the value of the billingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingTerms(String value) {
        this.billingTerms = value;
    }

    /**
     * Gets the value of the calculatedCurrentBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCalculatedCurrentBillAmount() {
        return calculatedCurrentBillAmount;
    }

    /**
     * Sets the value of the calculatedCurrentBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCalculatedCurrentBillAmount(Money value) {
        this.calculatedCurrentBillAmount = value;
    }

    /**
     * Gets the value of the calculatedCurrentBillDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedCurrentBillDateTime() {
        return calculatedCurrentBillDateTime;
    }

    /**
     * Sets the value of the calculatedCurrentBillDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedCurrentBillDateTime(XMLGregorianCalendar value) {
        this.calculatedCurrentBillDateTime = value;
    }

    /**
     * Gets the value of the calculatedCurrentBillReadings property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedCurrentBillReadings }
     *     
     */
    public CalculatedCurrentBillReadings getCalculatedCurrentBillReadings() {
        return calculatedCurrentBillReadings;
    }

    /**
     * Sets the value of the calculatedCurrentBillReadings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedCurrentBillReadings }
     *     
     */
    public void setCalculatedCurrentBillReadings(CalculatedCurrentBillReadings value) {
        this.calculatedCurrentBillReadings = value;
    }

    /**
     * Gets the value of the lastBillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLastBillAmount() {
        return lastBillAmount;
    }

    /**
     * Sets the value of the lastBillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLastBillAmount(Money value) {
        this.lastBillAmount = value;
    }

    /**
     * Gets the value of the calculatedUsedYesterday property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCalculatedUsedYesterday() {
        return calculatedUsedYesterday;
    }

    /**
     * Sets the value of the calculatedUsedYesterday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCalculatedUsedYesterday(Money value) {
        this.calculatedUsedYesterday = value;
    }

    /**
     * Gets the value of the serviceAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAgreements }
     *     
     */
    public ServiceAgreements getServiceAgreements() {
        return serviceAgreements;
    }

    /**
     * Sets the value of the serviceAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAgreements }
     *     
     */
    public void setServiceAgreements(ServiceAgreements value) {
        this.serviceAgreements = value;
    }

    /**
     * Gets the value of the workOrderReferences property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderReferences }
     *     
     */
    public WorkOrderReferences getWorkOrderReferences() {
        return workOrderReferences;
    }

    /**
     * Sets the value of the workOrderReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderReferences }
     *     
     */
    public void setWorkOrderReferences(WorkOrderReferences value) {
        this.workOrderReferences = value;
    }

    /**
     * Gets the value of the accountPriorities property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPriorities }
     *     
     */
    public AccountPriorities getAccountPriorities() {
        return accountPriorities;
    }

    /**
     * Sets the value of the accountPriorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPriorities }
     *     
     */
    public void setAccountPriorities(AccountPriorities value) {
        this.accountPriorities = value;
    }

    /**
     * Gets the value of the accountDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDeposits }
     *     
     */
    public AccountDeposits getAccountDeposits() {
        return accountDeposits;
    }

    /**
     * Sets the value of the accountDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDeposits }
     *     
     */
    public void setAccountDeposits(AccountDeposits value) {
        this.accountDeposits = value;
    }

    /**
     * Gets the value of the serviceOrderIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOrderIDs }
     *     
     */
    public ServiceOrderIDs getServiceOrderIDs() {
        return serviceOrderIDs;
    }

    /**
     * Sets the value of the serviceOrderIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOrderIDs }
     *     
     */
    public void setServiceOrderIDs(ServiceOrderIDs value) {
        this.serviceOrderIDs = value;
    }

}
