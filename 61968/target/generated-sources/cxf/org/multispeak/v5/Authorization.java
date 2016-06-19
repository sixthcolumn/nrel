
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.AuthorizationType;


/**
 * <p>Java class for authorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="authorizationType" type="{http://www.multispeak.org/V5.0/enumerations}authorizationType"/>
 *         &lt;element name="authorizedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authorizationDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorization", propOrder = {
    "authorizationType",
    "authorizedBy",
    "authorizationDateTime"
})
@XmlSeeAlso({
    SwitchingOrderEvent.class
})
public class Authorization
    extends MspExtensible
{

    @XmlElement(required = true)
    protected AuthorizationType authorizationType;
    @XmlElement(required = true)
    protected String authorizedBy;
    @XmlElement(required = true)
    protected XMLGregorianCalendar authorizationDateTime;

    /**
     * Gets the value of the authorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType }
     *     
     */
    public AuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    /**
     * Sets the value of the authorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType }
     *     
     */
    public void setAuthorizationType(AuthorizationType value) {
        this.authorizationType = value;
    }

    /**
     * Gets the value of the authorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedBy(String value) {
        this.authorizedBy = value;
    }

    /**
     * Gets the value of the authorizationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDateTime() {
        return authorizationDateTime;
    }

    /**
     * Sets the value of the authorizationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDateTime(XMLGregorianCalendar value) {
        this.authorizationDateTime = value;
    }

}
