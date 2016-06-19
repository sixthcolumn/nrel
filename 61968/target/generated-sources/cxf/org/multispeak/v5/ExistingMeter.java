
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.ActionTaken;


/**
 * <p>Java class for existingMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="existingMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="actionTaken" type="{http://www.multispeak.org/V5.0/enumerations}actionTaken"/>
 *         &lt;element name="meter" type="{http://www.multispeak.org/V5.0}meter"/>
 *         &lt;element name="meterReading" type="{http://www.multispeak.org/V5.0}meterReading" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existingMeter", propOrder = {
    "actionTaken",
    "meter",
    "meterReading"
})
public class ExistingMeter
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ActionTaken actionTaken;
    @XmlElement(required = true)
    protected Meter meter;
    protected MeterReading meterReading;

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaken }
     *     
     */
    public ActionTaken getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaken }
     *     
     */
    public void setActionTaken(ActionTaken value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the meter property.
     * 
     * @return
     *     possible object is
     *     {@link Meter }
     *     
     */
    public Meter getMeter() {
        return meter;
    }

    /**
     * Sets the value of the meter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meter }
     *     
     */
    public void setMeter(Meter value) {
        this.meter = value;
    }

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
