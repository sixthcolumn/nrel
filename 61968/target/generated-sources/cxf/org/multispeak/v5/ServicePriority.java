
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.ServicePriorityType;


/**
 * These name value pairs identify special priority conditions that could apply to a customer, service location or utility service.  Examples of priorityType entries include "Medical Necessity", "Priority Customer", "Outage Priorities", "Emergency Services", etc.  The prioritySubtype element gives additional options for this class of priorityType.
 * 
 * <p>Java class for servicePriority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePriority">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="servicePriorityType" type="{http://www.multispeak.org/V5.0/enumerations}servicePriorityType"/>
 *         &lt;element name="servicePrioritySubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "servicePriority", propOrder = {
    "servicePriorityType",
    "servicePrioritySubtype",
    "description"
})
public class ServicePriority
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ServicePriorityType servicePriorityType;
    protected String servicePrioritySubtype;
    protected String description;

    /**
     * Gets the value of the servicePriorityType property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePriorityType }
     *     
     */
    public ServicePriorityType getServicePriorityType() {
        return servicePriorityType;
    }

    /**
     * Sets the value of the servicePriorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePriorityType }
     *     
     */
    public void setServicePriorityType(ServicePriorityType value) {
        this.servicePriorityType = value;
    }

    /**
     * Gets the value of the servicePrioritySubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePrioritySubtype() {
        return servicePrioritySubtype;
    }

    /**
     * Sets the value of the servicePrioritySubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePrioritySubtype(String value) {
        this.servicePrioritySubtype = value;
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
