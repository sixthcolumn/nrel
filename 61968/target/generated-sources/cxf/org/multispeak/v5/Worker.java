
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for worker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="worker">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPerson">
 *       &lt;sequence>
 *         &lt;element name="isEmployee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="skillIDs" type="{http://www.multispeak.org/V5.0}skillIDs" minOccurs="0"/>
 *         &lt;element name="organizationAssociations" type="{http://www.multispeak.org/V5.0}organizationAssociations" minOccurs="0"/>
 *         &lt;element name="LTDeviceRefs" type="{http://www.multispeak.org/V5.0}LTDeviceRefs" minOccurs="0"/>
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
@XmlType(name = "worker", propOrder = {
    "isEmployee",
    "skillIDs",
    "organizationAssociations",
    "ltDeviceRefs"
})
public class Worker
    extends MspPerson
{

    protected Boolean isEmployee;
    protected SkillIDs skillIDs;
    protected OrganizationAssociations organizationAssociations;
    @XmlElement(name = "LTDeviceRefs")
    protected LTDeviceRefs ltDeviceRefs;

    /**
     * Gets the value of the isEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmployee() {
        return isEmployee;
    }

    /**
     * Sets the value of the isEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmployee(Boolean value) {
        this.isEmployee = value;
    }

    /**
     * Gets the value of the skillIDs property.
     * 
     * @return
     *     possible object is
     *     {@link SkillIDs }
     *     
     */
    public SkillIDs getSkillIDs() {
        return skillIDs;
    }

    /**
     * Sets the value of the skillIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillIDs }
     *     
     */
    public void setSkillIDs(SkillIDs value) {
        this.skillIDs = value;
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

    /**
     * Gets the value of the ltDeviceRefs property.
     * 
     * @return
     *     possible object is
     *     {@link LTDeviceRefs }
     *     
     */
    public LTDeviceRefs getLTDeviceRefs() {
        return ltDeviceRefs;
    }

    /**
     * Sets the value of the ltDeviceRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LTDeviceRefs }
     *     
     */
    public void setLTDeviceRefs(LTDeviceRefs value) {
        this.ltDeviceRefs = value;
    }

}
