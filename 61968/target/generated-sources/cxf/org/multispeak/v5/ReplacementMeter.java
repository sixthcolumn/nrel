
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.ActionTaken;
import org.multispeak.v5_0.enumerations.ServiceType;


/**
 * <p>Java class for replacementMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replacementMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="meterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/V5.0/enumerations}serviceType" minOccurs="0"/>
 *         &lt;element name="readingValues" type="{http://www.multispeak.org/V5.0}readingValues" minOccurs="0"/>
 *         &lt;element name="actionTaken" type="{http://www.multispeak.org/V5.0/enumerations}actionTaken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replacementMeter", propOrder = {
    "meterID",
    "meterType",
    "serviceType",
    "readingValues",
    "actionTaken"
})
public class ReplacementMeter
    extends MspExtensible
{

    protected MeterID meterID;
    protected String meterType;
    protected ServiceType serviceType;
    protected ReadingValues readingValues;
    protected ActionTaken actionTaken;

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
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterType(String value) {
        this.meterType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the readingValues property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingValues }
     *     
     */
    public ReadingValues getReadingValues() {
        return readingValues;
    }

    /**
     * Sets the value of the readingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingValues }
     *     
     */
    public void setReadingValues(ReadingValues value) {
        this.readingValues = value;
    }

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

}
