
package org.multispeak.version_3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSpeakMsgHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSpeakMsgHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Pwd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AppName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CSUnits" type="{http://www.multispeak.org/Version_3.0}MessageHeaderCSUnits" default="feet" />
 *       &lt;attribute name="CoordinateSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Datum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PreviousSessionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ObjectsRemaining" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSpeakMsgHeader")
public class MultiSpeakMsgHeader {

    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "UserID")
    protected String userID;
    @XmlAttribute(name = "Pwd")
    protected String pwd;
    @XmlAttribute(name = "AppName")
    protected String appName;
    @XmlAttribute(name = "AppVersion")
    protected String appVersion;
    @XmlAttribute(name = "Company")
    protected String company;
    @XmlAttribute(name = "CSUnits")
    protected MessageHeaderCSUnits csUnits;
    @XmlAttribute(name = "CoordinateSystem")
    protected String coordinateSystem;
    @XmlAttribute(name = "Datum")
    protected String datum;
    @XmlAttribute(name = "SessionID")
    protected String sessionID;
    @XmlAttribute(name = "PreviousSessionID")
    protected String previousSessionID;
    @XmlAttribute(name = "ObjectsRemaining")
    protected BigInteger objectsRemaining;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the csUnits property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderCSUnits }
     *     
     */
    public MessageHeaderCSUnits getCSUnits() {
        if (csUnits == null) {
            return MessageHeaderCSUnits.FEET;
        } else {
            return csUnits;
        }
    }

    /**
     * Sets the value of the csUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderCSUnits }
     *     
     */
    public void setCSUnits(MessageHeaderCSUnits value) {
        this.csUnits = value;
    }

    /**
     * Gets the value of the coordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Sets the value of the coordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateSystem(String value) {
        this.coordinateSystem = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the previousSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSessionID() {
        return previousSessionID;
    }

    /**
     * Sets the value of the previousSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSessionID(String value) {
        this.previousSessionID = value;
    }

    /**
     * Gets the value of the objectsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectsRemaining() {
        return objectsRemaining;
    }

    /**
     * Sets the value of the objectsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectsRemaining(BigInteger value) {
        this.objectsRemaining = value;
    }

}
