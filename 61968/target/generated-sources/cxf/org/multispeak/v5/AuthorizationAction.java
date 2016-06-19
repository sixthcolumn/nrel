
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.enumerations.AuthorizationMode;


/**
 * <p>Java class for authorizationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizationMode" type="{http://www.multispeak.org/V5.0/enumerations}authorizationMode"/>
 *         &lt;element name="authorizationDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="dateInEffect" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationAction", propOrder = {
    "authorizationMode",
    "authorizationDate",
    "dateInEffect"
})
public class AuthorizationAction {

    @XmlElement(required = true)
    protected AuthorizationMode authorizationMode;
    @XmlElement(required = true)
    protected XMLGregorianCalendar authorizationDate;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dateInEffect;

    /**
     * Gets the value of the authorizationMode property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationMode }
     *     
     */
    public AuthorizationMode getAuthorizationMode() {
        return authorizationMode;
    }

    /**
     * Sets the value of the authorizationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationMode }
     *     
     */
    public void setAuthorizationMode(AuthorizationMode value) {
        this.authorizationMode = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the dateInEffect property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInEffect() {
        return dateInEffect;
    }

    /**
     * Sets the value of the dateInEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInEffect(XMLGregorianCalendar value) {
        this.dateInEffect = value;
    }

}
