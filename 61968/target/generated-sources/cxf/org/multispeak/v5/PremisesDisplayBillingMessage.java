
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Money;


/**
 * <p>Java class for premisesDisplayBillingMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplayBillingMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="currentBalance" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="currentRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="priorityOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="averageDailyUsage" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="usedYesterday" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="usedThisMonth" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="usedLastMonth" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="usedFourWeeksAgo" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="usedThisMonthLastYear" type="{http://www.multispeak.org/V5.0}displayUsage" minOccurs="0"/>
 *         &lt;element name="daysRemaining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="usageOtherPeriods" type="{http://www.multispeak.org/V5.0}usageOtherPeriods" minOccurs="0"/>
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
@XmlType(name = "premisesDisplayBillingMessage", propOrder = {
    "panDeviceRef",
    "currentBalance",
    "currentRate",
    "dateTime",
    "priorityOrder",
    "averageDailyUsage",
    "usedYesterday",
    "usedThisMonth",
    "usedLastMonth",
    "usedFourWeeksAgo",
    "usedThisMonthLastYear",
    "daysRemaining",
    "usageOtherPeriods"
})
public class PremisesDisplayBillingMessage
    extends MspObject
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    protected Money currentBalance;
    protected String currentRate;
    protected XMLGregorianCalendar dateTime;
    protected BigInteger priorityOrder;
    protected DisplayUsage averageDailyUsage;
    protected DisplayUsage usedYesterday;
    protected DisplayUsage usedThisMonth;
    protected DisplayUsage usedLastMonth;
    protected DisplayUsage usedFourWeeksAgo;
    protected DisplayUsage usedThisMonthLastYear;
    protected BigInteger daysRemaining;
    protected UsageOtherPeriods usageOtherPeriods;

    /**
     * Gets the value of the panDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRef }
     *     
     */
    public PANDeviceRef getPANDeviceRef() {
        return panDeviceRef;
    }

    /**
     * Sets the value of the panDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRef }
     *     
     */
    public void setPANDeviceRef(PANDeviceRef value) {
        this.panDeviceRef = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCurrentBalance(Money value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the currentRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRate() {
        return currentRate;
    }

    /**
     * Sets the value of the currentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRate(String value) {
        this.currentRate = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the priorityOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityOrder() {
        return priorityOrder;
    }

    /**
     * Sets the value of the priorityOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityOrder(BigInteger value) {
        this.priorityOrder = value;
    }

    /**
     * Gets the value of the averageDailyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getAverageDailyUsage() {
        return averageDailyUsage;
    }

    /**
     * Sets the value of the averageDailyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setAverageDailyUsage(DisplayUsage value) {
        this.averageDailyUsage = value;
    }

    /**
     * Gets the value of the usedYesterday property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getUsedYesterday() {
        return usedYesterday;
    }

    /**
     * Sets the value of the usedYesterday property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setUsedYesterday(DisplayUsage value) {
        this.usedYesterday = value;
    }

    /**
     * Gets the value of the usedThisMonth property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getUsedThisMonth() {
        return usedThisMonth;
    }

    /**
     * Sets the value of the usedThisMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setUsedThisMonth(DisplayUsage value) {
        this.usedThisMonth = value;
    }

    /**
     * Gets the value of the usedLastMonth property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getUsedLastMonth() {
        return usedLastMonth;
    }

    /**
     * Sets the value of the usedLastMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setUsedLastMonth(DisplayUsage value) {
        this.usedLastMonth = value;
    }

    /**
     * Gets the value of the usedFourWeeksAgo property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getUsedFourWeeksAgo() {
        return usedFourWeeksAgo;
    }

    /**
     * Sets the value of the usedFourWeeksAgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setUsedFourWeeksAgo(DisplayUsage value) {
        this.usedFourWeeksAgo = value;
    }

    /**
     * Gets the value of the usedThisMonthLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayUsage }
     *     
     */
    public DisplayUsage getUsedThisMonthLastYear() {
        return usedThisMonthLastYear;
    }

    /**
     * Sets the value of the usedThisMonthLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayUsage }
     *     
     */
    public void setUsedThisMonthLastYear(DisplayUsage value) {
        this.usedThisMonthLastYear = value;
    }

    /**
     * Gets the value of the daysRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysRemaining() {
        return daysRemaining;
    }

    /**
     * Sets the value of the daysRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysRemaining(BigInteger value) {
        this.daysRemaining = value;
    }

    /**
     * Gets the value of the usageOtherPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link UsageOtherPeriods }
     *     
     */
    public UsageOtherPeriods getUsageOtherPeriods() {
        return usageOtherPeriods;
    }

    /**
     * Sets the value of the usageOtherPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageOtherPeriods }
     *     
     */
    public void setUsageOtherPeriods(UsageOtherPeriods value) {
        this.usageOtherPeriods = value;
    }

}
