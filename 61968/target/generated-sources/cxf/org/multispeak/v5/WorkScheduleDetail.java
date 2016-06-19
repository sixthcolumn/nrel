
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * <p>Java class for workScheduleDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workScheduleDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="estimatedTimePeriod" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="isStartTimeFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEndTimeFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estimatedDuration" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="scheduleConstraints" type="{http://www.multispeak.org/V5.0}scheduleConstraints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workScheduleDetail", propOrder = {
    "estimatedTimePeriod",
    "isStartTimeFixed",
    "isEndTimeFixed",
    "estimatedDuration",
    "scheduleConstraints"
})
@XmlSeeAlso({
    ResourceSchedule.class
})
public class WorkScheduleDetail
    extends MspExtensible
{

    protected TimePeriod estimatedTimePeriod;
    protected Boolean isStartTimeFixed;
    protected Boolean isEndTimeFixed;
    protected Duration estimatedDuration;
    protected ScheduleConstraints scheduleConstraints;

    /**
     * Gets the value of the estimatedTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getEstimatedTimePeriod() {
        return estimatedTimePeriod;
    }

    /**
     * Sets the value of the estimatedTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setEstimatedTimePeriod(TimePeriod value) {
        this.estimatedTimePeriod = value;
    }

    /**
     * Gets the value of the isStartTimeFixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStartTimeFixed() {
        return isStartTimeFixed;
    }

    /**
     * Sets the value of the isStartTimeFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStartTimeFixed(Boolean value) {
        this.isStartTimeFixed = value;
    }

    /**
     * Gets the value of the isEndTimeFixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEndTimeFixed() {
        return isEndTimeFixed;
    }

    /**
     * Sets the value of the isEndTimeFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEndTimeFixed(Boolean value) {
        this.isEndTimeFixed = value;
    }

    /**
     * Gets the value of the estimatedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Sets the value of the estimatedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedDuration(Duration value) {
        this.estimatedDuration = value;
    }

    /**
     * Gets the value of the scheduleConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleConstraints }
     *     
     */
    public ScheduleConstraints getScheduleConstraints() {
        return scheduleConstraints;
    }

    /**
     * Sets the value of the scheduleConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleConstraints }
     *     
     */
    public void setScheduleConstraints(ScheduleConstraints value) {
        this.scheduleConstraints = value;
    }

}
