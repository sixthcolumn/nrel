
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.DomainNameAction;


/**
 * This object is included as a means to publish changed domainName information to a client that previously had subscribed to such changes.  If new information is being published, the new information should be carried in the domainName element and the action element should be set to "Add".  If existing domain name information is to be deleted, then the existing domain name should be carried in the domainName element and the action element should be set to "Delete".  If existing information is to be replaced, then the new name should be carried in the domainName element, the old information should be carried in the oldDomainName elment and the action should be set to be"Modify".
 * 
 * <p>Java class for domainNameChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domainNameChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oldDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.multispeak.org/V5.0/enumerations}domainNameAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainNameChange", propOrder = {
    "domainName",
    "oldDomainName",
    "action"
})
public class DomainNameChange {

    @XmlElement(required = true)
    protected String domainName;
    protected String oldDomainName;
    @XmlElement(required = true)
    protected DomainNameAction action;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the oldDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldDomainName() {
        return oldDomainName;
    }

    /**
     * Sets the value of the oldDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldDomainName(String value) {
        this.oldDomainName = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DomainNameAction }
     *     
     */
    public DomainNameAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainNameAction }
     *     
     */
    public void setAction(DomainNameAction value) {
        this.action = value;
    }

}
