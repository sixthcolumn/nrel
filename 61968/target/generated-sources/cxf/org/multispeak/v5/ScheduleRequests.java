
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for scheduleRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleRequests">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="dateTimeRequests" type="{http://www.multispeak.org/V5.0}dateTimeRequests" minOccurs="0"/>
 *         &lt;element name="durationRequest" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleRequests", propOrder = {
    "dateTimeRequests",
    "durationRequest"
})
public class ScheduleRequests
    extends MspExtensible
{

    protected DateTimeRequests dateTimeRequests;
    protected Duration durationRequest;

    /**
     * Gets the value of the dateTimeRequests property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRequests }
     *     
     */
    public DateTimeRequests getDateTimeRequests() {
        return dateTimeRequests;
    }

    /**
     * Sets the value of the dateTimeRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRequests }
     *     
     */
    public void setDateTimeRequests(DateTimeRequests value) {
        this.dateTimeRequests = value;
    }

    /**
     * Gets the value of the durationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDurationRequest() {
        return durationRequest;
    }

    /**
     * Sets the value of the durationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDurationRequest(Duration value) {
        this.durationRequest = value;
    }

}
