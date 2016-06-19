
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDStateChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDStateChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="stateChange" type="{http://www.multispeak.org/Version_4.1_Release}loadActionCode" minOccurs="0"/>
 *         &lt;element name="meterEvent" type="{http://www.multispeak.org/Version_4.1_Release}meterEvent" minOccurs="0"/>
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
@XmlType(name = "CDStateChange", propOrder = {
    "meterID",
    "stateChange",
    "meterEvent"
})
public class CDStateChange
    extends MspObject
{

    protected MeterID meterID;
    protected LoadActionCode stateChange;
    protected MeterEvent meterEvent;

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
     * Gets the value of the meterEvent property.
     * 
     * @return
     *     possible object is
     *     {@link MeterEvent }
     *     
     */
    public MeterEvent getMeterEvent() {
        return meterEvent;
    }

    /**
     * Sets the value of the meterEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterEvent }
     *     
     */
    public void setMeterEvent(MeterEvent value) {
        this.meterEvent = value;
    }

}
