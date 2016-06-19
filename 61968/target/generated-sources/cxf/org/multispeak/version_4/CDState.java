
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CDState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDState">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/Version_4.1_Release}meterID" minOccurs="0"/>
 *         &lt;element name="RCDState" type="{http://www.multispeak.org/Version_4.1_Release}RCDState" minOccurs="0"/>
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
@XmlType(name = "CDState", propOrder = {
    "meterID",
    "rcdState"
})
public class CDState
    extends MspObject
{

    protected MeterID meterID;
    @XmlElement(name = "RCDState")
    protected RCDState rcdState;

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
     * Gets the value of the rcdState property.
     * 
     * @return
     *     possible object is
     *     {@link RCDState }
     *     
     */
    public RCDState getRCDState() {
        return rcdState;
    }

    /**
     * Sets the value of the rcdState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCDState }
     *     
     */
    public void setRCDState(RCDState value) {
        this.rcdState = value;
    }

}
