
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ActivePower;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for ControlArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="netInterchnge" type="{http://www.multispeak.org/V5.0/commonTypes}activePower" minOccurs="0"/>
 *         &lt;element name="tieFlow" type="{http://www.multispeak.org/V5.0/cpsm}TieFlow" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.multispeak.org/V5.0/cpsm}ControlAreaType" minOccurs="0"/>
 *         &lt;element name="EnergyAreaID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "ControlArea", propOrder = {
    "netInterchnge",
    "tieFlow",
    "type",
    "energyAreaID"
})
public class ControlArea
    extends MspCIMObject
{

    protected ActivePower netInterchnge;
    protected TieFlow tieFlow;
    protected ControlAreaType type;
    @XmlElement(name = "EnergyAreaID")
    protected ObjectID energyAreaID;

    /**
     * Gets the value of the netInterchnge property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePower }
     *     
     */
    public ActivePower getNetInterchnge() {
        return netInterchnge;
    }

    /**
     * Sets the value of the netInterchnge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePower }
     *     
     */
    public void setNetInterchnge(ActivePower value) {
        this.netInterchnge = value;
    }

    /**
     * Gets the value of the tieFlow property.
     * 
     * @return
     *     possible object is
     *     {@link TieFlow }
     *     
     */
    public TieFlow getTieFlow() {
        return tieFlow;
    }

    /**
     * Sets the value of the tieFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TieFlow }
     *     
     */
    public void setTieFlow(TieFlow value) {
        this.tieFlow = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ControlAreaType }
     *     
     */
    public ControlAreaType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlAreaType }
     *     
     */
    public void setType(ControlAreaType value) {
        this.type = value;
    }

    /**
     * Gets the value of the energyAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getEnergyAreaID() {
        return energyAreaID;
    }

    /**
     * Sets the value of the energyAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setEnergyAreaID(ObjectID value) {
        this.energyAreaID = value;
    }

}
