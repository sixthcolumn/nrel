
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Resource is a container object that can include people, vehicles, equipment, and crews to perform work tasks.  The resource.primaryIdentifier is the human-readable identifier for this resource.  Examples might be: (i) if the resource is a crew, the primaryIdentifier might be "Crew 10", (ii) if the resource is a worker, the primaryIdentifier might be the worker's employeeID, (iii) if the resource is an equipmentItem of type "Line Truck", the primaryIdentifier might be "27".
 * 
 * <p>Java class for resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="resourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceGroups" type="{http://www.multispeak.org/V5.0}resourceGroups" minOccurs="0"/>
 *         &lt;element name="resourceCompositionHistory" type="{http://www.multispeak.org/V5.0}resourceCompositionHistory"/>
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
@XmlType(name = "resource", propOrder = {
    "resourceType",
    "resourceGroups",
    "resourceCompositionHistory"
})
public class Resource
    extends MspObject
{

    protected String resourceType;
    protected ResourceGroups resourceGroups;
    @XmlElement(required = true)
    protected ResourceCompositionHistory resourceCompositionHistory;

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the resourceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceGroups }
     *     
     */
    public ResourceGroups getResourceGroups() {
        return resourceGroups;
    }

    /**
     * Sets the value of the resourceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceGroups }
     *     
     */
    public void setResourceGroups(ResourceGroups value) {
        this.resourceGroups = value;
    }

    /**
     * Gets the value of the resourceCompositionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceCompositionHistory }
     *     
     */
    public ResourceCompositionHistory getResourceCompositionHistory() {
        return resourceCompositionHistory;
    }

    /**
     * Sets the value of the resourceCompositionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceCompositionHistory }
     *     
     */
    public void setResourceCompositionHistory(ResourceCompositionHistory value) {
        this.resourceCompositionHistory = value;
    }

}
