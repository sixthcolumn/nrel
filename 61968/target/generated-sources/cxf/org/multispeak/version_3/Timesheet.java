
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timesheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timesheet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="timePeriod" type="{http://www.multispeak.org/Version_3.0}timePeriod" minOccurs="0"/>
 *         &lt;element name="employeeTimeRecordList" type="{http://www.multispeak.org/Version_3.0}ArrayOfEmployeeTimeRecord" minOccurs="0"/>
 *         &lt;element name="jobWorkedList" type="{http://www.multispeak.org/Version_3.0}ArrayOfJobWorked" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timesheet", propOrder = {
    "timePeriod",
    "employeeTimeRecordList",
    "jobWorkedList"
})
public class Timesheet
    extends MspObject
{

    protected TimePeriod timePeriod;
    protected ArrayOfEmployeeTimeRecord employeeTimeRecordList;
    protected ArrayOfJobWorked jobWorkedList;

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setTimePeriod(TimePeriod value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the employeeTimeRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeTimeRecord }
     *     
     */
    public ArrayOfEmployeeTimeRecord getEmployeeTimeRecordList() {
        return employeeTimeRecordList;
    }

    /**
     * Sets the value of the employeeTimeRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeTimeRecord }
     *     
     */
    public void setEmployeeTimeRecordList(ArrayOfEmployeeTimeRecord value) {
        this.employeeTimeRecordList = value;
    }

    /**
     * Gets the value of the jobWorkedList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobWorked }
     *     
     */
    public ArrayOfJobWorked getJobWorkedList() {
        return jobWorkedList;
    }

    /**
     * Sets the value of the jobWorkedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobWorked }
     *     
     */
    public void setJobWorkedList(ArrayOfJobWorked value) {
        this.jobWorkedList = value;
    }

}
