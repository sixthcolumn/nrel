
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Conductance;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Susceptance;


/**
 * <p>Java class for EquivalentShunt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentShunt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}EquivalentEquipment">
 *       &lt;sequence>
 *         &lt;element name="g" type="{http://www.multispeak.org/V5.0/commonTypes}conductance" minOccurs="0"/>
 *         &lt;element name="b" type="{http://www.multispeak.org/V5.0/commonTypes}susceptance" minOccurs="0"/>
 *         &lt;element name="equivalentNetworkID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "EquivalentShunt", propOrder = {
    "g",
    "b",
    "equivalentNetworkID"
})
public class EquivalentShunt
    extends EquivalentEquipment
{

    protected Conductance g;
    protected Susceptance b;
    protected ObjectID equivalentNetworkID;

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link Conductance }
     *     
     */
    public Conductance getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conductance }
     *     
     */
    public void setG(Conductance value) {
        this.g = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link Susceptance }
     *     
     */
    public Susceptance getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link Susceptance }
     *     
     */
    public void setB(Susceptance value) {
        this.b = value;
    }

    /**
     * Gets the value of the equivalentNetworkID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getEquivalentNetworkID() {
        return equivalentNetworkID;
    }

    /**
     * Sets the value of the equivalentNetworkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setEquivalentNetworkID(ObjectID value) {
        this.equivalentNetworkID = value;
    }

}
