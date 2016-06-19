
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for workRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="workTypeRef" type="{http://www.multispeak.org/V5.0}workTypeRef"/>
 *         &lt;element name="createdDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="requestingPerson" type="{http://www.multispeak.org/V5.0}requestingPerson" minOccurs="0"/>
 *         &lt;element name="requestingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedWorkPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workLocation" type="{http://www.multispeak.org/V5.0}workLocation" minOccurs="0"/>
 *         &lt;element name="scheduleRequests" type="{http://www.multispeak.org/V5.0}scheduleRequests" minOccurs="0"/>
 *         &lt;element name="resourceRequest" type="{http://www.multispeak.org/V5.0}resource" minOccurs="0"/>
 *         &lt;element name="primaryReference" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="workItemRelationships" type="{http://www.multispeak.org/V5.0}workItemRelationships" minOccurs="0"/>
 *         &lt;element name="requiredObjectRefs" type="{http://www.multispeak.org/V5.0}requiredObjectRefs" minOccurs="0"/>
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
@XmlType(name = "workRequest", propOrder = {
    "workTypeRef",
    "createdDate",
    "requestingPerson",
    "requestingSystem",
    "description",
    "title",
    "requestedWorkPriority",
    "workLocation",
    "scheduleRequests",
    "resourceRequest",
    "primaryReference",
    "workItemRelationships",
    "requiredObjectRefs",
    "attachments"
})
public class WorkRequest
    extends MspObject
{

    @XmlElement(required = true)
    protected WorkTypeRef workTypeRef;
    protected XMLGregorianCalendar createdDate;
    protected RequestingPerson requestingPerson;
    protected String requestingSystem;
    protected String description;
    protected String title;
    protected String requestedWorkPriority;
    protected WorkLocation workLocation;
    protected ScheduleRequests scheduleRequests;
    protected Resource resourceRequest;
    protected ObjectRef primaryReference;
    protected WorkItemRelationships workItemRelationships;
    protected RequiredObjectRefs requiredObjectRefs;
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
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the requestedWorkPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedWorkPriority() {
        return requestedWorkPriority;
    }

    /**
     * Sets the value of the requestedWorkPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedWorkPriority(String value) {
        this.requestedWorkPriority = value;
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
     * Gets the value of the scheduleRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleRequests }
     *     
     */
    public ScheduleRequests getScheduleRequests() {
        return scheduleRequests;
    }

    /**
     * Sets the value of the scheduleRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleRequests }
     *     
     */
    public void setScheduleRequests(ScheduleRequests value) {
        this.scheduleRequests = value;
    }

    /**
     * Gets the value of the resourceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResourceRequest() {
        return resourceRequest;
    }

    /**
     * Sets the value of the resourceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResourceRequest(Resource value) {
        this.resourceRequest = value;
    }

    /**
     * Gets the value of the primaryReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getPrimaryReference() {
        return primaryReference;
    }

    /**
     * Sets the value of the primaryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setPrimaryReference(ObjectRef value) {
        this.primaryReference = value;
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
     * Gets the value of the requiredObjectRefs property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredObjectRefs }
     *     
     */
    public RequiredObjectRefs getRequiredObjectRefs() {
        return requiredObjectRefs;
    }

    /**
     * Sets the value of the requiredObjectRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredObjectRefs }
     *     
     */
    public void setRequiredObjectRefs(RequiredObjectRefs value) {
        this.requiredObjectRefs = value;
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
