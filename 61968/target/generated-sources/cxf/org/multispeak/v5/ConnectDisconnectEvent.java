
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;
import org.multispeak.v5_0.enumerations.BillingTerms;
import org.multispeak.v5_0.enumerations.CDReasonCode;
import org.multispeak.v5_0.enumerations.LoadActionCode;


/**
 * <p>Java class for connectDisconnectEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectDisconnectEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="accountID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadActionCode" type="{http://www.multispeak.org/V5.0/enumerations}loadActionCode" minOccurs="0"/>
 *         &lt;element name="CDReasonCode" type="{http://www.multispeak.org/V5.0/enumerations}CDReasonCode" minOccurs="0"/>
 *         &lt;element name="powerLimitationValue" type="{http://www.multispeak.org/V5.0}powerLimitationValue" minOccurs="0"/>
 *         &lt;element name="amountDue" type="{http://www.multispeak.org/V5.0/commonTypes}money" minOccurs="0"/>
 *         &lt;element name="billingTerms" type="{http://www.multispeak.org/V5.0/enumerations}billingTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectDisconnectEvent", propOrder = {
    "customerID",
    "accountID",
    "serviceLocationID",
    "servicePointID",
    "meterID",
    "gridLocation",
    "loadActionCode",
    "cdReasonCode",
    "powerLimitationValue",
    "amountDue",
    "billingTerms"
})
public class ConnectDisconnectEvent
    extends MspEvent
{

    protected ObjectID customerID;
    protected ObjectID accountID;
    protected ObjectID serviceLocationID;
    protected ServicePointID servicePointID;
    protected MeterID meterID;
    protected String gridLocation;
    protected LoadActionCode loadActionCode;
    @XmlElement(name = "CDReasonCode")
    protected CDReasonCode cdReasonCode;
    protected PowerLimitationValue powerLimitationValue;
    protected Money amountDue;
    protected BillingTerms billingTerms;

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
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
    }

    /**
     * Gets the value of the loadActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link LoadActionCode }
     *     
     */
    public LoadActionCode getLoadActionCode() {
        return loadActionCode;
    }

    /**
     * Sets the value of the loadActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadActionCode }
     *     
     */
    public void setLoadActionCode(LoadActionCode value) {
        this.loadActionCode = value;
    }

    /**
     * Gets the value of the cdReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CDReasonCode }
     *     
     */
    public CDReasonCode getCDReasonCode() {
        return cdReasonCode;
    }

    /**
     * Sets the value of the cdReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDReasonCode }
     *     
     */
    public void setCDReasonCode(CDReasonCode value) {
        this.cdReasonCode = value;
    }

    /**
     * Gets the value of the powerLimitationValue property.
     * 
     * @return
     *     possible object is
     *     {@link PowerLimitationValue }
     *     
     */
    public PowerLimitationValue getPowerLimitationValue() {
        return powerLimitationValue;
    }

    /**
     * Sets the value of the powerLimitationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerLimitationValue }
     *     
     */
    public void setPowerLimitationValue(PowerLimitationValue value) {
        this.powerLimitationValue = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountDue(Money value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the billingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTerms }
     *     
     */
    public BillingTerms getBillingTerms() {
        return billingTerms;
    }

    /**
     * Sets the value of the billingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTerms }
     *     
     */
    public void setBillingTerms(BillingTerms value) {
        this.billingTerms = value;
    }

}
