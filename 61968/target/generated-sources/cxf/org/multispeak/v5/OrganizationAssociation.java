
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContactInfo;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for organizationAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="organizationRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="organizationRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactInfo" type="{http://www.multispeak.org/V5.0/commonTypes}contactInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationAssociation", propOrder = {
    "organizationRef",
    "organizationRole",
    "contactInfo"
})
public class OrganizationAssociation
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectRef organizationRef;
    @XmlElement(required = true)
    protected String organizationRole;
    protected ContactInfo contactInfo;

    /**
     * Gets the value of the organizationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getOrganizationRef() {
        return organizationRef;
    }

    /**
     * Sets the value of the organizationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setOrganizationRef(ObjectRef value) {
        this.organizationRef = value;
    }

    /**
     * Gets the value of the organizationRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationRole() {
        return organizationRole;
    }

    /**
     * Sets the value of the organizationRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationRole(String value) {
        this.organizationRole = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

}
