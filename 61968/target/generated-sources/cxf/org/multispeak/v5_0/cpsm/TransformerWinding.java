
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * A winding is associated with each defined terminal of a transformer (or phase shifter)
 * 
 * <p>Java class for TransformerWinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformerWinding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="windingNativeAttributes" type="{http://www.multispeak.org/V5.0/cpsm}WindingNativeAttributes" minOccurs="0"/>
 *         &lt;element name="terminals" type="{http://www.multispeak.org/V5.0/cpsm}Terminals" minOccurs="0"/>
 *         &lt;element name="tapChangers" type="{http://www.multispeak.org/V5.0/cpsm}TapChangers" minOccurs="0"/>
 *         &lt;element name="baseVoltageID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "TransformerWinding", propOrder = {
    "windingNativeAttributes",
    "terminals",
    "tapChangers",
    "baseVoltageID"
})
public class TransformerWinding
    extends ConductingEquipment
{

    protected WindingNativeAttributes windingNativeAttributes;
    protected Terminals terminals;
    protected TapChangers tapChangers;
    protected ObjectID baseVoltageID;

    /**
     * Gets the value of the windingNativeAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link WindingNativeAttributes }
     *     
     */
    public WindingNativeAttributes getWindingNativeAttributes() {
        return windingNativeAttributes;
    }

    /**
     * Sets the value of the windingNativeAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindingNativeAttributes }
     *     
     */
    public void setWindingNativeAttributes(WindingNativeAttributes value) {
        this.windingNativeAttributes = value;
    }

    /**
     * Gets the value of the terminals property.
     * 
     * @return
     *     possible object is
     *     {@link Terminals }
     *     
     */
    public Terminals getTerminals() {
        return terminals;
    }

    /**
     * Sets the value of the terminals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminals }
     *     
     */
    public void setTerminals(Terminals value) {
        this.terminals = value;
    }

    /**
     * Gets the value of the tapChangers property.
     * 
     * @return
     *     possible object is
     *     {@link TapChangers }
     *     
     */
    public TapChangers getTapChangers() {
        return tapChangers;
    }

    /**
     * Sets the value of the tapChangers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapChangers }
     *     
     */
    public void setTapChangers(TapChangers value) {
        this.tapChangers = value;
    }

    /**
     * Gets the value of the baseVoltageID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getBaseVoltageID() {
        return baseVoltageID;
    }

    /**
     * Sets the value of the baseVoltageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setBaseVoltageID(ObjectID value) {
        this.baseVoltageID = value;
    }

}
