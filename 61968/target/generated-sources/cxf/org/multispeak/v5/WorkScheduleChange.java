
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workScheduleChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workScheduleChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workItemRef" type="{http://www.multispeak.org/V5.0}workItemRef"/>
 *         &lt;element name="workSchedule" type="{http://www.multispeak.org/V5.0}workSchedule"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workScheduleChange", propOrder = {
    "workItemRef",
    "workSchedule"
})
public class WorkScheduleChange
    extends MspReferable
{

    @XmlElement(required = true)
    protected WorkItemRef workItemRef;
    @XmlElement(required = true)
    protected WorkSchedule workSchedule;

    /**
     * Gets the value of the workItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemRef }
     *     
     */
    public WorkItemRef getWorkItemRef() {
        return workItemRef;
    }

    /**
     * Sets the value of the workItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemRef }
     *     
     */
    public void setWorkItemRef(WorkItemRef value) {
        this.workItemRef = value;
    }

    /**
     * Gets the value of the workSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link WorkSchedule }
     *     
     */
    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    /**
     * Sets the value of the workSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSchedule }
     *     
     */
    public void setWorkSchedule(WorkSchedule value) {
        this.workSchedule = value;
    }

}
