
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * In CIM, a voltageLevel is a collection of equipment at one common system voltage forming a switchgear. The equipment typically consist of breakers, busbars, instrumentation, control, regulationand protection devices as well as assemblies of all these.  VoltageLevels are commonly referred to by the "name" string field, not the nominal voltage in float form.
 * 
 * <p>Java class for VoltageLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoltageLevel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}EquipmentContainer">
 *       &lt;sequence>
 *         &lt;element name="highVoltageLimit" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="lowVoltageLimit" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
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
@XmlType(name = "VoltageLevel", propOrder = {
    "highVoltageLimit",
    "lowVoltageLimit",
    "baseVoltageID"
})
public class VoltageLevel
    extends EquipmentContainer
{

    protected Voltage highVoltageLimit;
    protected Voltage lowVoltageLimit;
    protected ObjectID baseVoltageID;

    /**
     * Gets the value of the highVoltageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getHighVoltageLimit() {
        return highVoltageLimit;
    }

    /**
     * Sets the value of the highVoltageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setHighVoltageLimit(Voltage value) {
        this.highVoltageLimit = value;
    }

    /**
     * Gets the value of the lowVoltageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLowVoltageLimit() {
        return lowVoltageLimit;
    }

    /**
     * Sets the value of the lowVoltageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLowVoltageLimit(Voltage value) {
        this.lowVoltageLimit = value;
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
