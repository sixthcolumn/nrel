
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loadActionCode" type="{http://www.multispeak.org/Version_3.0}loadActionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDCustomer", propOrder = {
    "custID",
    "servLoc",
    "meterID",
    "loadActionCode"
})
public class CDCustomer {

    protected String custID;
    protected String servLoc;
    protected String meterID;
    protected LoadActionCode loadActionCode;

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

}
