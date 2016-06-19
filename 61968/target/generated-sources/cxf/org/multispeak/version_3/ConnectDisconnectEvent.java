
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectDisconnectEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectDisconnectEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadActionCode" type="{http://www.multispeak.org/Version_3.0}loadActionCode" minOccurs="0"/>
 *         &lt;element name="powerLimitationValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="powerLimitationUnits" type="{http://www.multispeak.org/Version_3.0}powerLimitationUnits" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.multispeak.org/Version_3.0}reasonCode" minOccurs="0"/>
 *         &lt;element name="amountDue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    "servLoc",
    "custID",
    "gridLocation",
    "accountNumber",
    "meterID",
    "loadActionCode",
    "powerLimitationValue",
    "powerLimitationUnits",
    "reasonCode",
    "amountDue"
})
public class ConnectDisconnectEvent
    extends MspObject
{

    protected String servLoc;
    protected String custID;
    protected String gridLocation;
    protected String accountNumber;
    protected String meterID;
    protected LoadActionCode loadActionCode;
    protected Float powerLimitationValue;
    protected PowerLimitationUnits powerLimitationUnits;
    protected ReasonCode reasonCode;
    protected Float amountDue;

    /**
     * Gets the value of the servLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServLoc() {
        return servLoc;
    }

    /**
     * Sets the value of the servLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServLoc(String value) {
        this.servLoc = value;
    }

    /**
     * Gets the value of the custID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustID() {
        return custID;
    }

    /**
     * Sets the value of the custID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustID(String value) {
        this.custID = value;
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
     *     {@link String }
     *     
     */
    public String getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterID(String value) {
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
     *     {@link Float }
     *     
     */
    public Float getPowerLimitationValue() {
        return powerLimitationValue;
    }

    /**
     * Sets the value of the powerLimitationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPowerLimitationValue(Float value) {
        this.powerLimitationValue = value;
    }

    /**
     * Gets the value of the powerLimitationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PowerLimitationUnits }
     *     
     */
    public PowerLimitationUnits getPowerLimitationUnits() {
        return powerLimitationUnits;
    }

    /**
     * Sets the value of the powerLimitationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerLimitationUnits }
     *     
     */
    public void setPowerLimitationUnits(PowerLimitationUnits value) {
        this.powerLimitationUnits = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCode }
     *     
     */
    public ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCode }
     *     
     */
    public void setReasonCode(ReasonCode value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmountDue(Float value) {
        this.amountDue = value;
    }

}
