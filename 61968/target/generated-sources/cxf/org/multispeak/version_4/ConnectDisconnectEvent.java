
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectDisconnectEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectDisconnectEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="serviceLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="loadActionCode" type="{http://www.multispeak.org/Version_4.1_Release}loadActionCode" minOccurs="0"/>
 *         &lt;element name="powerLimitationValue" type="{http://www.multispeak.org/Version_4.1_Release}powerLimitationValue" minOccurs="0"/>
 *         &lt;element name="CDReasonCode" type="{http://www.multispeak.org/Version_4.1_Release}CDReasonCode" minOccurs="0"/>
 *         &lt;element name="amountDue" type="{http://www.multispeak.org/Version_4.1_Release}money" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/Version_4.1_Release}serviceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectDisconnectEvent", propOrder = {
    "serviceLocationID",
    "customerID",
    "gridLocation",
    "accountNumber",
    "meterID",
    "loadActionCode",
    "powerLimitationValue",
    "cdReasonCode",
    "amountDue",
    "serviceType"
})
public class ConnectDisconnectEvent
    extends MspObject
{

    protected String serviceLocationID;
    protected String customerID;
    protected String gridLocation;
    protected String accountNumber;
    protected MeterID meterID;
    protected LoadActionCode loadActionCode;
    protected PowerLimitationValue powerLimitationValue;
    @XmlElement(name = "CDReasonCode")
    protected CDReasonCode cdReasonCode;
    protected Money amountDue;
    protected ServiceType serviceType;

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocationID(String value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

}
