
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.Temperature;


/**
 * <p>Java class for temperatureTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="temperatureTier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="rateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heatingOffset" type="{http://www.multispeak.org/V5.0/commonTypes}temperature"/>
 *         &lt;element name="coolingOffset" type="{http://www.multispeak.org/V5.0/commonTypes}temperature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temperatureTier", propOrder = {
    "rateIdentifier",
    "heatingOffset",
    "coolingOffset"
})
public class TemperatureTier
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String rateIdentifier;
    @XmlElement(required = true)
    protected Temperature heatingOffset;
    @XmlElement(required = true)
    protected Temperature coolingOffset;

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
     * Gets the value of the heatingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getHeatingOffset() {
        return heatingOffset;
    }

    /**
     * Sets the value of the heatingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setHeatingOffset(Temperature value) {
        this.heatingOffset = value;
    }

    /**
     * Gets the value of the coolingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getCoolingOffset() {
        return coolingOffset;
    }

    /**
     * Sets the value of the coolingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setCoolingOffset(Temperature value) {
        this.coolingOffset = value;
    }

}
