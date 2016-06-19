
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * RegulatingCondEq is a type of ConductingEquipment that can regulate Measurements and have a RegulationSchedule.
 * 
 * <p>Java class for RegulatingCondEq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatingCondEq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="equipmentContainerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="regulatingControlID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "RegulatingCondEq", propOrder = {
    "equipmentContainerID",
    "regulatingControlID"
})
@XmlSeeAlso({
    StaticVarCompensator.class
})
public abstract class RegulatingCondEq
    extends ConductingEquipment
{

    protected ObjectRef equipmentContainerID;
    protected ObjectID regulatingControlID;

    /**
     * Gets the value of the equipmentContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getEquipmentContainerID() {
        return equipmentContainerID;
    }

    /**
     * Sets the value of the equipmentContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setEquipmentContainerID(ObjectRef value) {
        this.equipmentContainerID = value;
    }

    /**
     * Gets the value of the regulatingControlID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getRegulatingControlID() {
        return regulatingControlID;
    }

    /**
     * Sets the value of the regulatingControlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setRegulatingControlID(ObjectID value) {
        this.regulatingControlID = value;
    }

}
