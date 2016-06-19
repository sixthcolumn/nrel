
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContactInfo;
import org.multispeak.v5_0.enumerations.OrganizationRole;


/**
 * Any entity that might enter into agreements or play a role in a business relationship with a utility.  Examples of organizations include: utilities, power suppliers, material suppliers, customers, market aggregators, etc.
 * 
 * <p>Java class for organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="contactInfo" type="{http://www.multispeak.org/V5.0/commonTypes}contactInfo" minOccurs="0"/>
 *         &lt;element name="marketRole" type="{http://www.multispeak.org/V5.0/enumerations}organizationRole" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organization", propOrder = {
    "contactInfo",
    "marketRole"
})
public class Organization
    extends MspObject
{

    protected ContactInfo contactInfo;
    protected OrganizationRole marketRole;

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

    /**
     * Gets the value of the marketRole property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRole }
     *     
     */
    public OrganizationRole getMarketRole() {
        return marketRole;
    }

    /**
     * Sets the value of the marketRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRole }
     *     
     */
    public void setMarketRole(OrganizationRole value) {
        this.marketRole = value;
    }

}
