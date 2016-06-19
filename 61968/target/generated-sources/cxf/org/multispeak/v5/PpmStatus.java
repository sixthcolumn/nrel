
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ppmStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="meterStatus" type="{http://www.multispeak.org/V5.0}meterStatus" minOccurs="0"/>
 *         &lt;element name="remainingBalance" type="{http://www.multispeak.org/V5.0}remainingBalance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ppmStatus", propOrder = {
    "meterStatus",
    "remainingBalance"
})
public class PpmStatus
    extends MspReferable
{

    protected MeterStatus meterStatus;
    protected RemainingBalance remainingBalance;

    /**
     * Gets the value of the meterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MeterStatus }
     *     
     */
    public MeterStatus getMeterStatus() {
        return meterStatus;
    }

    /**
     * Sets the value of the meterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterStatus }
     *     
     */
    public void setMeterStatus(MeterStatus value) {
        this.meterStatus = value;
    }

    /**
     * Gets the value of the remainingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link RemainingBalance }
     *     
     */
    public RemainingBalance getRemainingBalance() {
        return remainingBalance;
    }

    /**
     * Sets the value of the remainingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemainingBalance }
     *     
     */
    public void setRemainingBalance(RemainingBalance value) {
        this.remainingBalance = value;
    }

}
