
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Reactance;
import org.multispeak.v5_0.commontypes.Resistance;


/**
 * <p>Java class for EquivalentBranch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentBranch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}EquivalentEquipment">
 *       &lt;sequence>
 *         &lt;element name="r" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.multispeak.org/V5.0/commonTypes}reactance" minOccurs="0"/>
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
@XmlType(name = "EquivalentBranch", propOrder = {
    "r",
    "x",
    "equivalentNetworkID"
})
public class EquivalentBranch
    extends EquivalentEquipment
{

    protected Resistance r;
    protected Reactance x;
    protected ObjectID equivalentNetworkID;

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setR(Resistance value) {
        this.r = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setX(Reactance value) {
        this.x = value;
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
