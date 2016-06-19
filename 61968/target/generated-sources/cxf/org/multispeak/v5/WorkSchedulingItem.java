
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workSchedulingItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workSchedulingItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItem" type="{http://www.multispeak.org/V5.0}workItem"/>
 *         &lt;element name="scheduleRequests" type="{http://www.multispeak.org/V5.0}scheduleRequests" minOccurs="0"/>
 *         &lt;element name="resourceRequest" type="{http://www.multispeak.org/V5.0}resource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workSchedulingItem", propOrder = {
    "workItem",
    "scheduleRequests",
    "resourceRequest"
})
public class WorkSchedulingItem
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItem workItem;
    protected ScheduleRequests scheduleRequests;
    protected Resource resourceRequest;

    /**
     * Gets the value of the workItem property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItem }
     *     
     */
    public WorkItem getWorkItem() {
        return workItem;
    }

    /**
     * Sets the value of the workItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItem }
     *     
     */
    public void setWorkItem(WorkItem value) {
        this.workItem = value;
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

}
