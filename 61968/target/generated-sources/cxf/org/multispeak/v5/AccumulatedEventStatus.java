
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for accumulatedEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accumulatedEventStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="eventStatusType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accumulatedEventStatus", propOrder = {
    "eventStatusType",
    "deviceCount"
})
public class AccumulatedEventStatus
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String eventStatusType;
    @XmlElement(required = true)
    protected BigInteger deviceCount;

    /**
     * Gets the value of the eventStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatusType() {
        return eventStatusType;
    }

    /**
     * Sets the value of the eventStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatusType(String value) {
        this.eventStatusType = value;
    }

    /**
     * Gets the value of the deviceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceCount() {
        return deviceCount;
    }

    /**
     * Sets the value of the deviceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceCount(BigInteger value) {
        this.deviceCount = value;
    }

}
