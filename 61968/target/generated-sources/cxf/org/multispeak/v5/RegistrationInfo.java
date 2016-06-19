
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This object is exchanged between subscriber and publisher to establish a subscription.
 * 
 * <p>Java class for registrationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registrationID" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" minOccurs="0"/>
 *         &lt;element name="responseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="responseUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsePwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodNames" type="{http://www.multispeak.org/V5.0}methodNames" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationInfo", propOrder = {
    "registrationID",
    "responseURL",
    "responseUserID",
    "responsePwd",
    "methodNames"
})
public class RegistrationInfo {

    protected String registrationID;
    @XmlSchemaType(name = "anyURI")
    protected String responseURL;
    protected String responseUserID;
    protected String responsePwd;
    protected MethodNames methodNames;

    /**
     * Gets the value of the registrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the value of the registrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
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
     * Gets the value of the responseUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseUserID() {
        return responseUserID;
    }

    /**
     * Sets the value of the responseUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseUserID(String value) {
        this.responseUserID = value;
    }

    /**
     * Gets the value of the responsePwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsePwd() {
        return responsePwd;
    }

    /**
     * Sets the value of the responsePwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsePwd(String value) {
        this.responsePwd = value;
    }

    /**
     * Gets the value of the methodNames property.
     * 
     * @return
     *     possible object is
     *     {@link MethodNames }
     *     
     */
    public MethodNames getMethodNames() {
        return methodNames;
    }

    /**
     * Sets the value of the methodNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodNames }
     *     
     */
    public void setMethodNames(MethodNames value) {
        this.methodNames = value;
    }

}
