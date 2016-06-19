
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for loadCycleTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadCycleTier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="rateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cycleRate" type="{http://www.multispeak.org/V5.0/primitives}percent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadCycleTier", propOrder = {
    "rateIdentifier",
    "cycleRate"
})
public class LoadCycleTier
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String rateIdentifier;
    protected Float cycleRate;

    /**
     * Gets the value of the rateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateIdentifier() {
        return rateIdentifier;
    }

    /**
     * Sets the value of the rateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateIdentifier(String value) {
        this.rateIdentifier = value;
    }

    /**
     * Gets the value of the cycleRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCycleRate() {
        return cycleRate;
    }

    /**
     * Sets the value of the cycleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCycleRate(Float value) {
        this.cycleRate = value;
    }

}
