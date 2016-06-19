
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for resourceSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}workScheduleDetail">
 *       &lt;sequence>
 *         &lt;element name="resourceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="estimatedDriveTime" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="estimatedTimeOfArrival" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceSchedule", propOrder = {
    "resourceRef",
    "estimatedDriveTime",
    "estimatedTimeOfArrival"
})
public class ResourceSchedule
    extends WorkScheduleDetail
{

    @XmlElement(required = true)
    protected ObjectRef resourceRef;
    protected Duration estimatedDriveTime;
    protected XMLGregorianCalendar estimatedTimeOfArrival;

    /**
     * Gets the value of the resourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getResourceRef() {
        return resourceRef;
    }

    /**
     * Sets the value of the resourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setResourceRef(ObjectRef value) {
        this.resourceRef = value;
    }

    /**
     * Gets the value of the estimatedDriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedDriveTime() {
        return estimatedDriveTime;
    }

    /**
     * Sets the value of the estimatedDriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedDriveTime(Duration value) {
        this.estimatedDriveTime = value;
    }

    /**
     * Gets the value of the estimatedTimeOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    /**
     * Sets the value of the estimatedTimeOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedTimeOfArrival(XMLGregorianCalendar value) {
        this.estimatedTimeOfArrival = value;
    }

}
