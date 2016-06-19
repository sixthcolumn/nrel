
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the abstract class from which all types of work inherit.
 * 
 * <p>Java class for mspWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspWork">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="workTypeRef" type="{http://www.multispeak.org/V5.0}workTypeRef"/>
 *         &lt;element name="workProgress" type="{http://www.multispeak.org/V5.0}workProgress" minOccurs="0"/>
 *         &lt;element name="workHistory" type="{http://www.multispeak.org/V5.0}workHistory" minOccurs="0"/>
 *         &lt;element name="workLocation" type="{http://www.multispeak.org/V5.0}workLocation" minOccurs="0"/>
 *         &lt;element name="workItemRelationships" type="{http://www.multispeak.org/V5.0}workItemRelationships" minOccurs="0"/>
 *         &lt;element name="workPriority" type="{http://www.multispeak.org/V5.0}workPriority" minOccurs="0"/>
 *         &lt;element name="permissionsGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherIdentificationFields" type="{http://www.multispeak.org/V5.0}otherIdentificationFields" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/V5.0}attachments" minOccurs="0"/>
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
@XmlType(name = "mspWork", propOrder = {
    "workTypeRef",
    "workProgress",
    "workHistory",
    "workLocation",
    "workItemRelationships",
    "workPriority",
    "permissionsGroup",
    "otherIdentificationFields",
    "description",
    "attachments"
})
@XmlSeeAlso({
    OutageWork.class,
    ServiceOrder.class,
    WorkOrder.class,
    Design.class,
    SwitchingStepWork.class,
    WorkItem.class
})
public abstract class MspWork
    extends MspObject
{

    @XmlElement(required = true)
    protected WorkTypeRef workTypeRef;
    protected WorkProgress workProgress;
    protected WorkHistory workHistory;
    protected WorkLocation workLocation;
    protected WorkItemRelationships workItemRelationships;
    protected WorkPriority workPriority;
    protected String permissionsGroup;
    protected OtherIdentificationFields otherIdentificationFields;
    protected String description;
    protected Attachments attachments;

    /**
     * Gets the value of the workTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTypeRef }
     *     
     */
    public WorkTypeRef getWorkTypeRef() {
        return workTypeRef;
    }

    /**
     * Sets the value of the workTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTypeRef }
     *     
     */
    public void setWorkTypeRef(WorkTypeRef value) {
        this.workTypeRef = value;
    }

    /**
     * Gets the value of the workProgress property.
     * 
     * @return
     *     possible object is
     *     {@link WorkProgress }
     *     
     */
    public WorkProgress getWorkProgress() {
        return workProgress;
    }

    /**
     * Sets the value of the workProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkProgress }
     *     
     */
    public void setWorkProgress(WorkProgress value) {
        this.workProgress = value;
    }

    /**
     * Gets the value of the workHistory property.
     * 
     * @return
     *     possible object is
     *     {@link WorkHistory }
     *     
     */
    public WorkHistory getWorkHistory() {
        return workHistory;
    }

    /**
     * Sets the value of the workHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkHistory }
     *     
     */
    public void setWorkHistory(WorkHistory value) {
        this.workHistory = value;
    }

    /**
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocation }
     *     
     */
    public WorkLocation getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocation }
     *     
     */
    public void setWorkLocation(WorkLocation value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the workItemRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemRelationships }
     *     
     */
    public WorkItemRelationships getWorkItemRelationships() {
        return workItemRelationships;
    }

    /**
     * Sets the value of the workItemRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemRelationships }
     *     
     */
    public void setWorkItemRelationships(WorkItemRelationships value) {
        this.workItemRelationships = value;
    }

    /**
     * Gets the value of the workPriority property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPriority }
     *     
     */
    public WorkPriority getWorkPriority() {
        return workPriority;
    }

    /**
     * Sets the value of the workPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPriority }
     *     
     */
    public void setWorkPriority(WorkPriority value) {
        this.workPriority = value;
    }

    /**
     * Gets the value of the permissionsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionsGroup() {
        return permissionsGroup;
    }

    /**
     * Sets the value of the permissionsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionsGroup(String value) {
        this.permissionsGroup = value;
    }

    /**
     * Gets the value of the otherIdentificationFields property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentificationFields }
     *     
     */
    public OtherIdentificationFields getOtherIdentificationFields() {
        return otherIdentificationFields;
    }

    /**
     * Sets the value of the otherIdentificationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentificationFields }
     *     
     */
    public void setOtherIdentificationFields(OtherIdentificationFields value) {
        this.otherIdentificationFields = value;
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

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

}
