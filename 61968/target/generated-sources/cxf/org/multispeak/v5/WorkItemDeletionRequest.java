
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workItemDeletionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workItemDeletionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemDeletion" type="{http://www.multispeak.org/V5.0}workItemDeletion"/>
 *         &lt;element name="requestingPerson" type="{http://www.multispeak.org/V5.0}requestingPerson" minOccurs="0"/>
 *         &lt;element name="requestingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workItemDeletionRequest", propOrder = {
    "workItemDeletion",
    "requestingPerson",
    "requestingSystem"
})
public class WorkItemDeletionRequest
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemDeletion workItemDeletion;
    protected RequestingPerson requestingPerson;
    protected String requestingSystem;

    /**
     * Gets the value of the workItemDeletion property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemDeletion }
     *     
     */
    public WorkItemDeletion getWorkItemDeletion() {
        return workItemDeletion;
    }

    /**
     * Sets the value of the workItemDeletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemDeletion }
     *     
     */
    public void setWorkItemDeletion(WorkItemDeletion value) {
        this.workItemDeletion = value;
    }

    /**
     * Gets the value of the requestingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingPerson }
     *     
     */
    public RequestingPerson getRequestingPerson() {
        return requestingPerson;
    }

    /**
     * Sets the value of the requestingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingPerson }
     *     
     */
    public void setRequestingPerson(RequestingPerson value) {
        this.requestingPerson = value;
    }

    /**
     * Gets the value of the requestingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingSystem() {
        return requestingSystem;
    }

    /**
     * Sets the value of the requestingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingSystem(String value) {
        this.requestingSystem = value;
    }

}
