
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ErrorObjects;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for configurationStatusItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurationStatusItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID"/>
 *         &lt;element name="configurationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorObjects" type="{http://www.multispeak.org/V5.0/commonTypes}errorObjects" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationStatusItem", propOrder = {
    "meterID",
    "configurationStatus",
    "errorObjects",
    "timeStamp"
})
public class ConfigurationStatusItem
    extends MspExtensible
{

    @XmlElement(required = true)
    protected MeterID meterID;
    @XmlElement(required = true)
    protected String configurationStatus;
    protected ErrorObjects errorObjects;
    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;

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
     * Gets the value of the configurationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationStatus() {
        return configurationStatus;
    }

    /**
     * Sets the value of the configurationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationStatus(String value) {
        this.configurationStatus = value;
    }

    /**
     * Gets the value of the errorObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorObjects }
     *     
     */
    public ErrorObjects getErrorObjects() {
        return errorObjects;
    }

    /**
     * Sets the value of the errorObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorObjects }
     *     
     */
    public void setErrorObjects(ErrorObjects value) {
        this.errorObjects = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
