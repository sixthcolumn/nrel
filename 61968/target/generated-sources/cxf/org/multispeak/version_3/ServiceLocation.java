
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for serviceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspElectricPoint">
 *       &lt;sequence>
 *         &lt;element name="custID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outageStatus" type="{http://www.multispeak.org/Version_3.0}powerStatus" minOccurs="0"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialNeeds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadMgmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgBill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acRecvBal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="acRecvCur" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="acRecv30" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="acRecv60" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="acRecv90" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="paymentDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="billDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shutOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="disconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="network" type="{http://www.multispeak.org/Version_3.0}network" minOccurs="0"/>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCogenerationSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "serviceLocation", propOrder = {
    "custID",
    "accountNumber",
    "facilityName",
    "siteID",
    "servAddr1",
    "servAddr2",
    "servCity",
    "servState",
    "servZip",
    "servType",
    "revenueClass",
    "servStatus",
    "outageStatus",
    "billingCycle",
    "route",
    "specialNeeds",
    "loadMgmt",
    "budgBill",
    "acRecvBal",
    "acRecvCur",
    "acRecv30",
    "acRecv60",
    "acRecv90",
    "paymentDueDate",
    "lastPaymentDate",
    "lastPaymentAmount",
    "billDate",
    "shutOffDate",
    "connection",
    "connectDate",
    "disconnectDate",
    "network",
    "sic",
    "isCogenerationSite"
})
public class ServiceLocation
    extends MspElectricPoint
{

    protected String custID;
    protected String accountNumber;
    protected String facilityName;
    protected String siteID;
    protected String servAddr1;
    protected String servAddr2;
    protected String servCity;
    protected String servState;
    protected String servZip;
    protected String servType;
    protected String revenueClass;
    protected String servStatus;
    protected PowerStatus outageStatus;
    protected String billingCycle;
    protected String route;
    protected String specialNeeds;
    protected String loadMgmt;
    protected String budgBill;
    protected Float acRecvBal;
    protected Float acRecvCur;
    protected Float acRecv30;
    protected Float acRecv60;
    protected Float acRecv90;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;
    protected Float lastPaymentAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shutOffDate;
    protected String connection;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar connectDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disconnectDate;
    protected Network network;
    @XmlElement(name = "SIC")
    protected String sic;
    protected Boolean isCogenerationSite;

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
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the servAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServAddr1() {
        return servAddr1;
    }

    /**
     * Sets the value of the servAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServAddr1(String value) {
        this.servAddr1 = value;
    }

    /**
     * Gets the value of the servAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServAddr2() {
        return servAddr2;
    }

    /**
     * Sets the value of the servAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServAddr2(String value) {
        this.servAddr2 = value;
    }

    /**
     * Gets the value of the servCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServCity() {
        return servCity;
    }

    /**
     * Sets the value of the servCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServCity(String value) {
        this.servCity = value;
    }

    /**
     * Gets the value of the servState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServState() {
        return servState;
    }

    /**
     * Sets the value of the servState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServState(String value) {
        this.servState = value;
    }

    /**
     * Gets the value of the servZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServZip() {
        return servZip;
    }

    /**
     * Sets the value of the servZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServZip(String value) {
        this.servZip = value;
    }

    /**
     * Gets the value of the servType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServType() {
        return servType;
    }

    /**
     * Sets the value of the servType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServType(String value) {
        this.servType = value;
    }

    /**
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the servStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServStatus() {
        return servStatus;
    }

    /**
     * Sets the value of the servStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServStatus(String value) {
        this.servStatus = value;
    }

    /**
     * Gets the value of the outageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PowerStatus }
     *     
     */
    public PowerStatus getOutageStatus() {
        return outageStatus;
    }

    /**
     * Sets the value of the outageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerStatus }
     *     
     */
    public void setOutageStatus(PowerStatus value) {
        this.outageStatus = value;
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
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the specialNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * Sets the value of the specialNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialNeeds(String value) {
        this.specialNeeds = value;
    }

    /**
     * Gets the value of the loadMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadMgmt() {
        return loadMgmt;
    }

    /**
     * Sets the value of the loadMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadMgmt(String value) {
        this.loadMgmt = value;
    }

    /**
     * Gets the value of the budgBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgBill() {
        return budgBill;
    }

    /**
     * Sets the value of the budgBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgBill(String value) {
        this.budgBill = value;
    }

    /**
     * Gets the value of the acRecvBal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAcRecvBal() {
        return acRecvBal;
    }

    /**
     * Sets the value of the acRecvBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAcRecvBal(Float value) {
        this.acRecvBal = value;
    }

    /**
     * Gets the value of the acRecvCur property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAcRecvCur() {
        return acRecvCur;
    }

    /**
     * Sets the value of the acRecvCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAcRecvCur(Float value) {
        this.acRecvCur = value;
    }

    /**
     * Gets the value of the acRecv30 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAcRecv30() {
        return acRecv30;
    }

    /**
     * Sets the value of the acRecv30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAcRecv30(Float value) {
        this.acRecv30 = value;
    }

    /**
     * Gets the value of the acRecv60 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAcRecv60() {
        return acRecv60;
    }

    /**
     * Sets the value of the acRecv60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAcRecv60(Float value) {
        this.acRecv60 = value;
    }

    /**
     * Gets the value of the acRecv90 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAcRecv90() {
        return acRecv90;
    }

    /**
     * Sets the value of the acRecv90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAcRecv90(Float value) {
        this.acRecv90 = value;
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
     *     {@link Float }
     *     
     */
    public Float getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLastPaymentAmount(Float value) {
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
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
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
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the sic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the isCogenerationSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCogenerationSite() {
        return isCogenerationSite;
    }

    /**
     * Sets the value of the isCogenerationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCogenerationSite(Boolean value) {
        this.isCogenerationSite = value;
    }

}
