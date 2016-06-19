
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="woNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homeAc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayAc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dayPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="township" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franchiseDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="contractor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrAc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electrician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elecAc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elecPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="woType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cd740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext740c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cwpYr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cwpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetPur" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="engrAsnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfmsCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="acNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="budgetCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="warehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grpCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="crewCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="estDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.multispeak.org/Version_3.0}actionCode" minOccurs="0"/>
 *         &lt;element name="laborCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atc" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="loadDistrict" type="{http://www.multispeak.org/Version_3.0}loadDistrict" minOccurs="0"/>
 *         &lt;element name="constGrade" type="{http://www.multispeak.org/Version_3.0}constGrade" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationList" type="{http://www.multispeak.org/Version_3.0}ArrayOfStation" minOccurs="0"/>
 *         &lt;element name="backgroundGraphics" type="{http://www.multispeak.org/Version_3.0}backgroundGraphics" minOccurs="0"/>
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
@XmlType(name = "workOrder", propOrder = {
    "woNumber",
    "jobNumber",
    "jobDescr",
    "statusCode",
    "designCode",
    "lastName",
    "firstName",
    "mName",
    "homeAc",
    "homePhone",
    "dayAc",
    "dayPhone",
    "billAddr1",
    "billAddr2",
    "billCity",
    "billState",
    "billZip",
    "custID",
    "servAddr1",
    "servAddr2",
    "servCity",
    "servState",
    "servZip",
    "county",
    "section",
    "township",
    "range",
    "townshipName",
    "subdivision",
    "block",
    "lot",
    "boardDist",
    "taxDist",
    "franchiseDist",
    "schoolDist",
    "district",
    "systemVolts",
    "contractor",
    "contrAc",
    "contrPhone",
    "electrician",
    "elecAc",
    "elecPhone",
    "woType",
    "cd740C",
    "ext740C",
    "loanNo",
    "cwpYr",
    "cwpCd",
    "budgetPur",
    "engrAsnd",
    "cfmsCode",
    "acNo",
    "budgetCode",
    "actCode",
    "deptCode",
    "warehouseID",
    "grpCode",
    "crewCode",
    "startDate",
    "clsDate",
    "estDate",
    "actionCode",
    "laborCategoryID",
    "atc",
    "loadDistrict",
    "constGrade",
    "duration",
    "accountNumber",
    "stationList",
    "backgroundGraphics"
})
public class WorkOrder
    extends MspObject
{

    protected String woNumber;
    protected String jobNumber;
    protected String jobDescr;
    protected String statusCode;
    protected String designCode;
    protected String lastName;
    protected String firstName;
    protected String mName;
    protected String homeAc;
    protected String homePhone;
    protected String dayAc;
    protected String dayPhone;
    protected String billAddr1;
    protected String billAddr2;
    protected String billCity;
    protected String billState;
    protected String billZip;
    protected String custID;
    protected String servAddr1;
    protected String servAddr2;
    protected String servCity;
    protected String servState;
    protected String servZip;
    protected String county;
    protected String section;
    protected String township;
    protected String range;
    protected String townshipName;
    protected String subdivision;
    protected String block;
    protected String lot;
    protected String boardDist;
    protected String taxDist;
    protected String franchiseDist;
    protected String schoolDist;
    protected String district;
    protected Float systemVolts;
    protected String contractor;
    protected String contrAc;
    protected String contrPhone;
    protected String electrician;
    protected String elecAc;
    protected String elecPhone;
    protected String woType;
    @XmlElement(name = "cd740c")
    protected String cd740C;
    @XmlElement(name = "ext740c")
    protected String ext740C;
    protected String loanNo;
    protected String cwpYr;
    protected String cwpCd;
    protected Long budgetPur;
    protected String engrAsnd;
    protected Long cfmsCode;
    protected Long acNo;
    protected Long budgetCode;
    protected String actCode;
    protected Long deptCode;
    protected String warehouseID;
    protected Long grpCode;
    protected String crewCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estDate;
    protected ActionCode actionCode;
    protected String laborCategoryID;
    protected Float atc;
    protected LoadDistrict loadDistrict;
    protected ConstGrade constGrade;
    protected Float duration;
    protected String accountNumber;
    protected ArrayOfStation stationList;
    protected BackgroundGraphics backgroundGraphics;

    /**
     * Gets the value of the woNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoNumber() {
        return woNumber;
    }

    /**
     * Sets the value of the woNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoNumber(String value) {
        this.woNumber = value;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the jobDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescr() {
        return jobDescr;
    }

    /**
     * Sets the value of the jobDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescr(String value) {
        this.jobDescr = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the designCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignCode() {
        return designCode;
    }

    /**
     * Sets the value of the designCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignCode(String value) {
        this.designCode = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the mName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMName() {
        return mName;
    }

    /**
     * Sets the value of the mName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMName(String value) {
        this.mName = value;
    }

    /**
     * Gets the value of the homeAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAc() {
        return homeAc;
    }

    /**
     * Sets the value of the homeAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAc(String value) {
        this.homeAc = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the dayAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayAc() {
        return dayAc;
    }

    /**
     * Sets the value of the dayAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayAc(String value) {
        this.dayAc = value;
    }

    /**
     * Gets the value of the dayPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayPhone() {
        return dayPhone;
    }

    /**
     * Sets the value of the dayPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayPhone(String value) {
        this.dayPhone = value;
    }

    /**
     * Gets the value of the billAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddr1() {
        return billAddr1;
    }

    /**
     * Sets the value of the billAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddr1(String value) {
        this.billAddr1 = value;
    }

    /**
     * Gets the value of the billAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddr2() {
        return billAddr2;
    }

    /**
     * Sets the value of the billAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddr2(String value) {
        this.billAddr2 = value;
    }

    /**
     * Gets the value of the billCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCity() {
        return billCity;
    }

    /**
     * Sets the value of the billCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCity(String value) {
        this.billCity = value;
    }

    /**
     * Gets the value of the billState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillState() {
        return billState;
    }

    /**
     * Sets the value of the billState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillState(String value) {
        this.billState = value;
    }

    /**
     * Gets the value of the billZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillZip() {
        return billZip;
    }

    /**
     * Sets the value of the billZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillZip(String value) {
        this.billZip = value;
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the township property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownship() {
        return township;
    }

    /**
     * Sets the value of the township property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownship(String value) {
        this.township = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the townshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownshipName() {
        return townshipName;
    }

    /**
     * Sets the value of the townshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownshipName(String value) {
        this.townshipName = value;
    }

    /**
     * Gets the value of the subdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivision() {
        return subdivision;
    }

    /**
     * Sets the value of the subdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivision(String value) {
        this.subdivision = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLot(String value) {
        this.lot = value;
    }

    /**
     * Gets the value of the boardDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardDist() {
        return boardDist;
    }

    /**
     * Sets the value of the boardDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardDist(String value) {
        this.boardDist = value;
    }

    /**
     * Gets the value of the taxDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDist() {
        return taxDist;
    }

    /**
     * Sets the value of the taxDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDist(String value) {
        this.taxDist = value;
    }

    /**
     * Gets the value of the franchiseDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchiseDist() {
        return franchiseDist;
    }

    /**
     * Sets the value of the franchiseDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchiseDist(String value) {
        this.franchiseDist = value;
    }

    /**
     * Gets the value of the schoolDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDist() {
        return schoolDist;
    }

    /**
     * Sets the value of the schoolDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDist(String value) {
        this.schoolDist = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the systemVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSystemVolts() {
        return systemVolts;
    }

    /**
     * Sets the value of the systemVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSystemVolts(Float value) {
        this.systemVolts = value;
    }

    /**
     * Gets the value of the contractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractor(String value) {
        this.contractor = value;
    }

    /**
     * Gets the value of the contrAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrAc() {
        return contrAc;
    }

    /**
     * Sets the value of the contrAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrAc(String value) {
        this.contrAc = value;
    }

    /**
     * Gets the value of the contrPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrPhone() {
        return contrPhone;
    }

    /**
     * Sets the value of the contrPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrPhone(String value) {
        this.contrPhone = value;
    }

    /**
     * Gets the value of the electrician property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectrician() {
        return electrician;
    }

    /**
     * Sets the value of the electrician property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectrician(String value) {
        this.electrician = value;
    }

    /**
     * Gets the value of the elecAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElecAc() {
        return elecAc;
    }

    /**
     * Sets the value of the elecAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElecAc(String value) {
        this.elecAc = value;
    }

    /**
     * Gets the value of the elecPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElecPhone() {
        return elecPhone;
    }

    /**
     * Sets the value of the elecPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElecPhone(String value) {
        this.elecPhone = value;
    }

    /**
     * Gets the value of the woType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoType() {
        return woType;
    }

    /**
     * Sets the value of the woType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoType(String value) {
        this.woType = value;
    }

    /**
     * Gets the value of the cd740C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd740C() {
        return cd740C;
    }

    /**
     * Sets the value of the cd740C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd740C(String value) {
        this.cd740C = value;
    }

    /**
     * Gets the value of the ext740C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt740C() {
        return ext740C;
    }

    /**
     * Sets the value of the ext740C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt740C(String value) {
        this.ext740C = value;
    }

    /**
     * Gets the value of the loanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * Sets the value of the loanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNo(String value) {
        this.loanNo = value;
    }

    /**
     * Gets the value of the cwpYr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwpYr() {
        return cwpYr;
    }

    /**
     * Sets the value of the cwpYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwpYr(String value) {
        this.cwpYr = value;
    }

    /**
     * Gets the value of the cwpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwpCd() {
        return cwpCd;
    }

    /**
     * Sets the value of the cwpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwpCd(String value) {
        this.cwpCd = value;
    }

    /**
     * Gets the value of the budgetPur property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetPur() {
        return budgetPur;
    }

    /**
     * Sets the value of the budgetPur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetPur(Long value) {
        this.budgetPur = value;
    }

    /**
     * Gets the value of the engrAsnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngrAsnd() {
        return engrAsnd;
    }

    /**
     * Sets the value of the engrAsnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngrAsnd(String value) {
        this.engrAsnd = value;
    }

    /**
     * Gets the value of the cfmsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCfmsCode() {
        return cfmsCode;
    }

    /**
     * Sets the value of the cfmsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCfmsCode(Long value) {
        this.cfmsCode = value;
    }

    /**
     * Gets the value of the acNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcNo() {
        return acNo;
    }

    /**
     * Sets the value of the acNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcNo(Long value) {
        this.acNo = value;
    }

    /**
     * Gets the value of the budgetCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetCode() {
        return budgetCode;
    }

    /**
     * Sets the value of the budgetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetCode(Long value) {
        this.budgetCode = value;
    }

    /**
     * Gets the value of the actCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActCode() {
        return actCode;
    }

    /**
     * Sets the value of the actCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActCode(String value) {
        this.actCode = value;
    }

    /**
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeptCode(Long value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the warehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseID(String value) {
        this.warehouseID = value;
    }

    /**
     * Gets the value of the grpCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrpCode() {
        return grpCode;
    }

    /**
     * Sets the value of the grpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrpCode(Long value) {
        this.grpCode = value;
    }

    /**
     * Gets the value of the crewCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewCode() {
        return crewCode;
    }

    /**
     * Sets the value of the crewCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewCode(String value) {
        this.crewCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the clsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsDate() {
        return clsDate;
    }

    /**
     * Sets the value of the clsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsDate(XMLGregorianCalendar value) {
        this.clsDate = value;
    }

    /**
     * Gets the value of the estDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstDate() {
        return estDate;
    }

    /**
     * Sets the value of the estDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstDate(XMLGregorianCalendar value) {
        this.estDate = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the laborCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaborCategoryID() {
        return laborCategoryID;
    }

    /**
     * Sets the value of the laborCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaborCategoryID(String value) {
        this.laborCategoryID = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAtc(Float value) {
        this.atc = value;
    }

    /**
     * Gets the value of the loadDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDistrict }
     *     
     */
    public LoadDistrict getLoadDistrict() {
        return loadDistrict;
    }

    /**
     * Sets the value of the loadDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDistrict }
     *     
     */
    public void setLoadDistrict(LoadDistrict value) {
        this.loadDistrict = value;
    }

    /**
     * Gets the value of the constGrade property.
     * 
     * @return
     *     possible object is
     *     {@link ConstGrade }
     *     
     */
    public ConstGrade getConstGrade() {
        return constGrade;
    }

    /**
     * Sets the value of the constGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstGrade }
     *     
     */
    public void setConstGrade(ConstGrade value) {
        this.constGrade = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuration(Float value) {
        this.duration = value;
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
     * Gets the value of the stationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStation }
     *     
     */
    public ArrayOfStation getStationList() {
        return stationList;
    }

    /**
     * Sets the value of the stationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStation }
     *     
     */
    public void setStationList(ArrayOfStation value) {
        this.stationList = value;
    }

    /**
     * Gets the value of the backgroundGraphics property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundGraphics }
     *     
     */
    public BackgroundGraphics getBackgroundGraphics() {
        return backgroundGraphics;
    }

    /**
     * Sets the value of the backgroundGraphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundGraphics }
     *     
     */
    public void setBackgroundGraphics(BackgroundGraphics value) {
        this.backgroundGraphics = value;
    }

}
