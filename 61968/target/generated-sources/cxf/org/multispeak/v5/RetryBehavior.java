
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.TimePeriod;


/**
 * This object describes the behavior of a meter reading schedule in the face of failed meter reading attempts.
 * 
 * <p>Java class for retryBehavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retryBehavior">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="maxNumberRetries" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="retryInterval" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *         &lt;element name="retryThreshold" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retryBehavior", propOrder = {
    "maxNumberRetries",
    "retryInterval",
    "retryThreshold"
})
public class RetryBehavior
    extends MspExtensible
{

    protected BigInteger maxNumberRetries;
    protected TimePeriod retryInterval;
    protected Float retryThreshold;

    /**
     * Gets the value of the maxNumberRetries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberRetries() {
        return maxNumberRetries;
    }

    /**
     * Sets the value of the maxNumberRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberRetries(BigInteger value) {
        this.maxNumberRetries = value;
    }

    /**
     * Gets the value of the retryInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getRetryInterval() {
        return retryInterval;
    }

    /**
     * Sets the value of the retryInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setRetryInterval(TimePeriod value) {
        this.retryInterval = value;
    }

    /**
     * Gets the value of the retryThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetryThreshold() {
        return retryThreshold;
    }

    /**
     * Sets the value of the retryThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetryThreshold(Float value) {
        this.retryThreshold = value;
    }

}
