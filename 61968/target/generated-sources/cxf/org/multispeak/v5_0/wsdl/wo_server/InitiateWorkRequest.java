
package org.multispeak.v5_0.wsdl.wo_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.ExpirationTime;
import org.multispeak.v5_0.commonarrays.ArrayOfWorkRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfWorkRequest" type="{http://www.multispeak.org/V5.0/commonArrays}ArrayOfWorkRequest" minOccurs="0"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.multispeak.org/V5.0}expirationTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arrayOfWorkRequest",
    "responseURL",
    "transactionID",
    "expirationTime"
})
@XmlRootElement(name = "InitiateWorkRequest")
public class InitiateWorkRequest {

    @XmlElement(name = "ArrayOfWorkRequest")
    protected ArrayOfWorkRequest arrayOfWorkRequest;
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    protected String transactionID;
    protected ExpirationTime expirationTime;

    /**
     * Gets the value of the arrayOfWorkRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkRequest }
     *     
     */
    public ArrayOfWorkRequest getArrayOfWorkRequest() {
        return arrayOfWorkRequest;
    }

    /**
     * Sets the value of the arrayOfWorkRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkRequest }
     *     
     */
    public void setArrayOfWorkRequest(ArrayOfWorkRequest value) {
        this.arrayOfWorkRequest = value;
    }

    /**
     * Gets the value of the responseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseURL() {
        return responseURL;
    }

    /**
     * Sets the value of the responseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseURL(String value) {
        this.responseURL = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationTime }
     *     
     */
    public ExpirationTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationTime }
     *     
     */
    public void setExpirationTime(ExpirationTime value) {
        this.expirationTime = value;
    }

}
