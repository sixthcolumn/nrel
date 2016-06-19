
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the payload of the DemandResetNotification that is used as the asynchronous return to the InitiateDemandReset method.  The demandReset.timeStamp SHALL be the time at which the demand reset was successfully completed.
 * 
 * <p>Java class for demandReset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandReset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="meterReading" type="{http://www.multispeak.org/V5.0}meterReading"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demandReset", propOrder = {
    "meterReading"
})
public class DemandReset
    extends MspEvent
{

    @XmlElement(required = true)
    protected MeterReading meterReading;

    /**
     * Gets the value of the meterReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getMeterReading() {
        return meterReading;
    }

    /**
     * Sets the value of the meterReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setMeterReading(MeterReading value) {
        this.meterReading = value;
    }

}
