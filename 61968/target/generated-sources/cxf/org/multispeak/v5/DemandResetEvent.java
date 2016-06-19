
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This is the payload of the InitiateDemandReset method that is used as the Initiate part of an asynchronous method pair.  The asynchronous response is included in the DemandResetNotification method, the payload of which is the demandReset object.
 * 
 * <p>Java class for demandResetEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandResetEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="scheduleID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/V5.0}meterIDs" minOccurs="0"/>
 *         &lt;element name="meterGroups" type="{http://www.multispeak.org/V5.0}meterGroups" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandResetEvent", propOrder = {
    "scheduleID",
    "meterIDs",
    "meterGroups"
})
public class DemandResetEvent
    extends MspEvent
{

    protected ObjectID scheduleID;
    protected MeterIDs meterIDs;
    protected MeterGroups meterGroups;

    /**
     * Gets the value of the scheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setScheduleID(ObjectID value) {
        this.scheduleID = value;
    }

    /**
     * Gets the value of the meterIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeterIDs }
     *     
     */
    public MeterIDs getMeterIDs() {
        return meterIDs;
    }

    /**
     * Sets the value of the meterIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterIDs }
     *     
     */
    public void setMeterIDs(MeterIDs value) {
        this.meterIDs = value;
    }

    /**
     * Gets the value of the meterGroups property.
     * 
     * @return
     *     possible object is
     *     {@link MeterGroups }
     *     
     */
    public MeterGroups getMeterGroups() {
        return meterGroups;
    }

    /**
     * Sets the value of the meterGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterGroups }
     *     
     */
    public void setMeterGroups(MeterGroups value) {
        this.meterGroups = value;
    }

}
