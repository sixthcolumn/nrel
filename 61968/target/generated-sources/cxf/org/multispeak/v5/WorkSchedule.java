
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for workSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="workItemSchedule" type="{http://www.multispeak.org/V5.0}workScheduleDetail"/>
 *         &lt;element name="resourceSchedules" type="{http://www.multispeak.org/V5.0}resourceSchedules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workSchedule", propOrder = {
    "workItemSchedule",
    "resourceSchedules"
})
public class WorkSchedule
    extends MspExtensible
{

    @XmlElement(required = true)
    protected WorkScheduleDetail workItemSchedule;
    protected ResourceSchedules resourceSchedules;

    /**
     * Gets the value of the workItemSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link WorkScheduleDetail }
     *     
     */
    public WorkScheduleDetail getWorkItemSchedule() {
        return workItemSchedule;
    }

    /**
     * Sets the value of the workItemSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkScheduleDetail }
     *     
     */
    public void setWorkItemSchedule(WorkScheduleDetail value) {
        this.workItemSchedule = value;
    }

    /**
     * Gets the value of the resourceSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSchedules }
     *     
     */
    public ResourceSchedules getResourceSchedules() {
        return resourceSchedules;
    }

    /**
     * Sets the value of the resourceSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSchedules }
     *     
     */
    public void setResourceSchedules(ResourceSchedules value) {
        this.resourceSchedules = value;
    }

}
