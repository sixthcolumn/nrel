
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricMeteringPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="electricMeteringPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricUsagePoint">
 *       &lt;sequence>
 *         &lt;element name="electricMeters" type="{http://www.multispeak.org/V5.0}electricMeters" minOccurs="0"/>
 *         &lt;element name="instrumentTransformers" type="{http://www.multispeak.org/V5.0}instrumentTransformers" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "electricMeteringPoint", propOrder = {
    "electricMeters",
    "instrumentTransformers"
})
public class ElectricMeteringPoint
    extends MspElectricUsagePoint
{

    protected ElectricMeters electricMeters;
    protected InstrumentTransformers instrumentTransformers;

    /**
     * Gets the value of the electricMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeters }
     *     
     */
    public ElectricMeters getElectricMeters() {
        return electricMeters;
    }

    /**
     * Sets the value of the electricMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeters }
     *     
     */
    public void setElectricMeters(ElectricMeters value) {
        this.electricMeters = value;
    }

    /**
     * Gets the value of the instrumentTransformers property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTransformers }
     *     
     */
    public InstrumentTransformers getInstrumentTransformers() {
        return instrumentTransformers;
    }

    /**
     * Sets the value of the instrumentTransformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTransformers }
     *     
     */
    public void setInstrumentTransformers(InstrumentTransformers value) {
        this.instrumentTransformers = value;
    }

}
