
package org.multispeak.v5;

import java.math.BigInteger;
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
 * This is the location at which the prepaid meter is installed.  
 * 
 * <p>Java class for ppmLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuelCostAdjCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityBalance" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="sharedArrears" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="initialReading" type="{http://www.multispeak.org/V5.0}meterReading" minOccurs="0"/>
 *         &lt;element name="totalBalance" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="fixedChargeCodes" type="{http://www.multispeak.org/V5.0}fixedChargeCodes" minOccurs="0"/>
 *         &lt;element name="lastMeterReading" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lastReadingDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="depositAmount" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="depositPaid" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="depositInterest" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterSetDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
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
@XmlType(name = "ppmLocation", propOrder = {
    "servicePointID",
    "meterID",
    "serviceLocationID",
    "customerID",
    "rateCode",
    "taxDistrict",
    "fuelCostAdjCode",
    "priorityBalance",
    "sharedArrears",
    "initialReading",
    "totalBalance",
    "fixedChargeCodes",
    "lastMeterReading",
    "lastReadingDate",
    "depositAmount",
    "depositPaid",
    "depositInterest",
    "connectDate",
    "billingCycle",
    "meterSetDate"
})
public class PpmLocation
    extends MspObject
{

    @XmlElement(required = true)
    protected ServicePointID servicePointID;
    @XmlElement(required = true)
    protected MeterID meterID;
    protected ObjectID serviceLocationID;
    protected ObjectID customerID;
    protected String rateCode;
    protected String taxDistrict;
    protected String fuelCostAdjCode;
    protected Money priorityBalance;
    protected Money sharedArrears;
    protected MeterReading initialReading;
    protected Money totalBalance;
    protected FixedChargeCodes fixedChargeCodes;
    protected BigInteger lastMeterReading;
    protected XMLGregorianCalendar lastReadingDate;
    protected Money depositAmount;
    protected Money depositPaid;
    protected Float depositInterest;
    protected XMLGregorianCalendar connectDate;
    protected String billingCycle;
    protected XMLGregorianCalendar meterSetDate;

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
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the taxDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDistrict() {
        return taxDistrict;
    }

    /**
     * Sets the value of the taxDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDistrict(String value) {
        this.taxDistrict = value;
    }

    /**
     * Gets the value of the fuelCostAdjCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelCostAdjCode() {
        return fuelCostAdjCode;
    }

    /**
     * Sets the value of the fuelCostAdjCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelCostAdjCode(String value) {
        this.fuelCostAdjCode = value;
    }

    /**
     * Gets the value of the priorityBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPriorityBalance() {
        return priorityBalance;
    }

    /**
     * Sets the value of the priorityBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPriorityBalance(Money value) {
        this.priorityBalance = value;
    }

    /**
     * Gets the value of the sharedArrears property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSharedArrears() {
        return sharedArrears;
    }

    /**
     * Sets the value of the sharedArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSharedArrears(Money value) {
        this.sharedArrears = value;
    }

    /**
     * Gets the value of the initialReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getInitialReading() {
        return initialReading;
    }

    /**
     * Sets the value of the initialReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setInitialReading(MeterReading value) {
        this.initialReading = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBalance(Money value) {
        this.totalBalance = value;
    }

    /**
     * Gets the value of the fixedChargeCodes property.
     * 
     * @return
     *     possible object is
     *     {@link FixedChargeCodes }
     *     
     */
    public FixedChargeCodes getFixedChargeCodes() {
        return fixedChargeCodes;
    }

    /**
     * Sets the value of the fixedChargeCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedChargeCodes }
     *     
     */
    public void setFixedChargeCodes(FixedChargeCodes value) {
        this.fixedChargeCodes = value;
    }

    /**
     * Gets the value of the lastMeterReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastMeterReading() {
        return lastMeterReading;
    }

    /**
     * Sets the value of the lastMeterReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastMeterReading(BigInteger value) {
        this.lastMeterReading = value;
    }

    /**
     * Gets the value of the lastReadingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReadingDate() {
        return lastReadingDate;
    }

    /**
     * Sets the value of the lastReadingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReadingDate(XMLGregorianCalendar value) {
        this.lastReadingDate = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDepositAmount(Money value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDepositPaid() {
        return depositPaid;
    }

    /**
     * Sets the value of the depositPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDepositPaid(Money value) {
        this.depositPaid = value;
    }

    /**
     * Gets the value of the depositInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositInterest() {
        return depositInterest;
    }

    /**
     * Sets the value of the depositInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositInterest(Float value) {
        this.depositInterest = value;
    }

    /**
     * Gets the value of the connectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectDate() {
        return connectDate;
    }

    /**
     * Sets the value of the connectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectDate(XMLGregorianCalendar value) {
        this.connectDate = value;
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
     * Gets the value of the meterSetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeterSetDate() {
        return meterSetDate;
    }

    /**
     * Sets the value of the meterSetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeterSetDate(XMLGregorianCalendar value) {
        this.meterSetDate = value;
    }

}
