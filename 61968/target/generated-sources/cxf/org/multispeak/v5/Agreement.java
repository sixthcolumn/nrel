
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An agreement between organizations.
 * 
 * <p>Java class for agreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedOrganizations" type="{http://www.multispeak.org/V5.0}relatedOrganizations" minOccurs="0"/>
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
@XmlType(name = "agreement", propOrder = {
    "description",
    "relatedOrganizations"
})
@XmlSeeAlso({
    ServiceAgreement.class
})
public class Agreement
    extends MspObject
{

    protected String description;
    protected RelatedOrganizations relatedOrganizations;

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

    /**
     * Gets the value of the relatedOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedOrganizations }
     *     
     */
    public RelatedOrganizations getRelatedOrganizations() {
        return relatedOrganizations;
    }

    /**
     * Sets the value of the relatedOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedOrganizations }
     *     
     */
    public void setRelatedOrganizations(RelatedOrganizations value) {
        this.relatedOrganizations = value;
    }

}
