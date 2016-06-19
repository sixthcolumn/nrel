
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ContactInfo;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This element indicates the composition of a resource during a period of time, the effectivePeriod.  The composition indicates which other resources (workers and equipmentItems (including vehicles) ) are grouped together to compose this resource during the effective period.  It also provides other information about the resource at that point in time, such as contact information, the responsible worker (e.g. crew foreman), and the abilities that the resource has to perform specific types of work when the resource has the defined composition.  
 * 
 * <p>Java class for resourceComposition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceComposition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectivePeriod" type="{http://www.multispeak.org/V5.0}resourceEffectivePeriod"/>
 *         &lt;element name="responsibleWorkerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="baseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.multispeak.org/V5.0/commonTypes}contactInfo" minOccurs="0"/>
 *         &lt;element name="resourceMembers" type="{http://www.multispeak.org/V5.0}resourceMembers"/>
 *         &lt;element name="abilityRefs" type="{http://www.multispeak.org/V5.0}abilityRefs" minOccurs="0"/>
 *         &lt;element name="organizationAssociations" type="{http://www.multispeak.org/V5.0}organizationAssociations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceComposition", propOrder = {
    "effectivePeriod",
    "responsibleWorkerID",
    "baseLocation",
    "contactInfo",
    "resourceMembers",
    "abilityRefs",
    "organizationAssociations"
})
public class ResourceComposition {

    @XmlElement(required = true)
    protected ResourceEffectivePeriod effectivePeriod;
    protected ObjectID responsibleWorkerID;
    protected String baseLocation;
    protected ContactInfo contactInfo;
    @XmlElement(required = true)
    protected ResourceMembers resourceMembers;
    protected AbilityRefs abilityRefs;
    protected OrganizationAssociations organizationAssociations;

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceEffectivePeriod }
     *     
     */
    public ResourceEffectivePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceEffectivePeriod }
     *     
     */
    public void setEffectivePeriod(ResourceEffectivePeriod value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the responsibleWorkerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getResponsibleWorkerID() {
        return responsibleWorkerID;
    }

    /**
     * Sets the value of the responsibleWorkerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setResponsibleWorkerID(ObjectID value) {
        this.responsibleWorkerID = value;
    }

    /**
     * Gets the value of the baseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseLocation() {
        return baseLocation;
    }

    /**
     * Sets the value of the baseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseLocation(String value) {
        this.baseLocation = value;
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

    /**
     * Gets the value of the resourceMembers property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceMembers }
     *     
     */
    public ResourceMembers getResourceMembers() {
        return resourceMembers;
    }

    /**
     * Sets the value of the resourceMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceMembers }
     *     
     */
    public void setResourceMembers(ResourceMembers value) {
        this.resourceMembers = value;
    }

    /**
     * Gets the value of the abilityRefs property.
     * 
     * @return
     *     possible object is
     *     {@link AbilityRefs }
     *     
     */
    public AbilityRefs getAbilityRefs() {
        return abilityRefs;
    }

    /**
     * Sets the value of the abilityRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbilityRefs }
     *     
     */
    public void setAbilityRefs(AbilityRefs value) {
        this.abilityRefs = value;
    }

    /**
     * Gets the value of the organizationAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAssociations }
     *     
     */
    public OrganizationAssociations getOrganizationAssociations() {
        return organizationAssociations;
    }

    /**
     * Sets the value of the organizationAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAssociations }
     *     
     */
    public void setOrganizationAssociations(OrganizationAssociations value) {
        this.organizationAssociations = value;
    }

}
