
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.OrganizationRole;


/**
 * <p>Java class for relatedOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedOrganization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="organizationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="organizationRole" type="{http://www.multispeak.org/V5.0/enumerations}organizationRole"/>
 *         &lt;element name="organizationRoleSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedOrganization", propOrder = {
    "organizationID",
    "organizationRole",
    "organizationRoleSubtype",
    "description"
})
public class RelatedOrganization
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID organizationID;
    @XmlElement(required = true)
    protected OrganizationRole organizationRole;
    protected String organizationRoleSubtype;
    protected String description;

    /**
     * Gets the value of the organizationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setOrganizationID(ObjectID value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the organizationRole property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRole }
     *     
     */
    public OrganizationRole getOrganizationRole() {
        return organizationRole;
    }

    /**
     * Sets the value of the organizationRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRole }
     *     
     */
    public void setOrganizationRole(OrganizationRole value) {
        this.organizationRole = value;
    }

    /**
     * Gets the value of the organizationRoleSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationRoleSubtype() {
        return organizationRoleSubtype;
    }

    /**
     * Sets the value of the organizationRoleSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationRoleSubtype(String value) {
        this.organizationRoleSubtype = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
