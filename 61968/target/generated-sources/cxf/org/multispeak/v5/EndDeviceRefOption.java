
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for endDeviceRefOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceRefOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="endDeviceReference" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="meterGroupID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceRefOption", propOrder = {
    "endDeviceReference",
    "meterID",
    "meterGroupID"
})
public class EndDeviceRefOption {

    protected ObjectRef endDeviceReference;
    protected MeterID meterID;
    protected ObjectID meterGroupID;

    /**
     * Gets the value of the endDeviceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEndDeviceReference() {
        return endDeviceReference;
    }

    /**
     * Sets the value of the endDeviceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEndDeviceReference(ObjectRef value) {
        this.endDeviceReference = value;
    }

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
     * Gets the value of the meterGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMeterGroupID() {
        return meterGroupID;
    }

    /**
     * Sets the value of the meterGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMeterGroupID(ObjectID value) {
        this.meterGroupID = value;
    }

}
