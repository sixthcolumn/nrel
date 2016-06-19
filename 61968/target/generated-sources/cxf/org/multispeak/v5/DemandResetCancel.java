
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This object is the payload of an InitiateDemandResetCancel method call, which is used to cancel one or a few specific, previously scheduled demand reset actions. If it is desired to cancel all demand resets on a specific schedule, the DisableSchedule method SHALL be used.  This object is also used as the payload of the DemandResetCancelledNotification, which is the asynchronous return to the InitiateDemandResetCancel method.
 * 
 * <p>Java class for demandResetCancel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandResetCancel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="meterIDs" type="{http://www.multispeak.org/V5.0}meterIDs"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandResetCancel", propOrder = {
    "meterIDs"
})
public class DemandResetCancel
    extends MspEvent
{

    @XmlElement(required = true)
    protected MeterIDs meterIDs;

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

}
