
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for workOrderAccountingFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrderAccountingFields">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="loanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPlanYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfmsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atc" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workOrderAccountingFields", propOrder = {
    "accountID",
    "loanNumber",
    "workPlanYear",
    "workPlanCode",
    "budgetPurpose",
    "cfmsCode",
    "atc"
})
public class WorkOrderAccountingFields
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID accountID;
    protected String loanNumber;
    protected String workPlanYear;
    protected String workPlanCode;
    protected String budgetPurpose;
    protected String cfmsCode;
    protected Money atc;

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
     * Gets the value of the loanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNumber() {
        return loanNumber;
    }

    /**
     * Sets the value of the loanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNumber(String value) {
        this.loanNumber = value;
    }

    /**
     * Gets the value of the workPlanYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlanYear() {
        return workPlanYear;
    }

    /**
     * Sets the value of the workPlanYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPlanYear(String value) {
        this.workPlanYear = value;
    }

    /**
     * Gets the value of the workPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlanCode() {
        return workPlanCode;
    }

    /**
     * Sets the value of the workPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPlanCode(String value) {
        this.workPlanCode = value;
    }

    /**
     * Gets the value of the budgetPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetPurpose() {
        return budgetPurpose;
    }

    /**
     * Sets the value of the budgetPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetPurpose(String value) {
        this.budgetPurpose = value;
    }

    /**
     * Gets the value of the cfmsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfmsCode() {
        return cfmsCode;
    }

    /**
     * Sets the value of the cfmsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfmsCode(String value) {
        this.cfmsCode = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAtc(Money value) {
        this.atc = value;
    }

}
