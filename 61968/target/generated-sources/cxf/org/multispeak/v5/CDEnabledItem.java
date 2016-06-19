
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for CDEnabledItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDEnabledItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="isCDEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDEnabledItem", propOrder = {
    "meterID",
    "isCDEnabled"
})
public class CDEnabledItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected MeterID meterID;
    protected boolean isCDEnabled;

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
     * Gets the value of the isCDEnabled property.
     * 
     */
    public boolean isIsCDEnabled() {
        return isCDEnabled;
    }

    /**
     * Sets the value of the isCDEnabled property.
     * 
     */
    public void setIsCDEnabled(boolean value) {
        this.isCDEnabled = value;
    }

}
