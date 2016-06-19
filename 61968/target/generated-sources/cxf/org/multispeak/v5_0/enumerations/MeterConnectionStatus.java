
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for meterConnectionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConnectionStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>meterConnectionStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterConnectionStatus", propOrder = {
    "value"
})
public class MeterConnectionStatus {

    @XmlValue
    protected MeterConnectionStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The connection status of a meter. Connected means that the meter is in the circuit and can receive service, Disconnected means that the meter is out of the circuit and cannot receive service. DisconnectedNonPay means that the meter is disconnected, but the reason for the disconnection is that the account has been disconnected for non-payment.
     * 
     * @return
     *     possible object is
     *     {@link MeterConnectionStatusKind }
     *     
     */
    public MeterConnectionStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConnectionStatusKind }
     *     
     */
    public void setValue(MeterConnectionStatusKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

}
