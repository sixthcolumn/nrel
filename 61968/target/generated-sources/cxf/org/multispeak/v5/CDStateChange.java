
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.enumerations.LoadActionCode;


/**
 * <p>Java class for CDStateChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDStateChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="stateChange" type="{http://www.multispeak.org/V5.0/enumerations}loadActionCode"/>
 *         &lt;element name="endDeviceEventType" type="{http://www.multispeak.org/V5.0}endDeviceEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDStateChange", propOrder = {
    "meterID",
    "stateChange",
    "endDeviceEventType"
})
public class CDStateChange
    extends MspEvent
{

    @XmlElement(required = true)
    protected MeterID meterID;
    @XmlElement(required = true)
    protected LoadActionCode stateChange;
    protected EndDeviceEventType endDeviceEventType;

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the stateChange property.
     * 
     * @return
     *     possible object is
     *     {@link LoadActionCode }
     *     
     */
    public LoadActionCode getStateChange() {
        return stateChange;
    }

    /**
     * Sets the value of the stateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadActionCode }
     *     
     */
    public void setStateChange(LoadActionCode value) {
        this.stateChange = value;
    }

    /**
     * Gets the value of the endDeviceEventType property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEventType }
     *     
     */
    public EndDeviceEventType getEndDeviceEventType() {
        return endDeviceEventType;
    }

    /**
     * Sets the value of the endDeviceEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEventType }
     *     
     */
    public void setEndDeviceEventType(EndDeviceEventType value) {
        this.endDeviceEventType = value;
    }

}
