
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.RealPower;


/**
 * This is an electrical equipment catalog entry for transformers.
 * 
 * <p>Java class for transformerEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformerEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="noLoadLoss" type="{http://www.multispeak.org/V5.0/commonTypes}realPower" minOccurs="0"/>
 *         &lt;element name="windingPairAttributes" type="{http://www.multispeak.org/V5.0}windingPairAttributes" minOccurs="0"/>
 *         &lt;element name="windingAttributes" type="{http://www.multispeak.org/V5.0}windingAttributes" minOccurs="0"/>
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
@XmlType(name = "transformerEntry", propOrder = {
    "noLoadLoss",
    "windingPairAttributes",
    "windingAttributes"
})
public class TransformerEntry
    extends MspElectricalDefinition
{

    protected RealPower noLoadLoss;
    protected WindingPairAttributes windingPairAttributes;
    protected WindingAttributes windingAttributes;

    /**
     * Gets the value of the noLoadLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RealPower }
     *     
     */
    public RealPower getNoLoadLoss() {
        return noLoadLoss;
    }

    /**
     * Sets the value of the noLoadLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPower }
     *     
     */
    public void setNoLoadLoss(RealPower value) {
        this.noLoadLoss = value;
    }

    /**
     * Gets the value of the windingPairAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link WindingPairAttributes }
     *     
     */
    public WindingPairAttributes getWindingPairAttributes() {
        return windingPairAttributes;
    }

    /**
     * Sets the value of the windingPairAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingPairAttributes }
     *     
     */
    public void setWindingPairAttributes(WindingPairAttributes value) {
        this.windingPairAttributes = value;
    }

    /**
     * Gets the value of the windingAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link WindingAttributes }
     *     
     */
    public WindingAttributes getWindingAttributes() {
        return windingAttributes;
    }

    /**
     * Sets the value of the windingAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingAttributes }
     *     
     */
    public void setWindingAttributes(WindingAttributes value) {
        this.windingAttributes = value;
    }

}
