
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * <p>Java class for mspElectricPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspElectricPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspConnectivityPoint">
 *       &lt;sequence>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="load" type="{http://www.multispeak.org/V5.0}loadGroup" minOccurs="0"/>
 *         &lt;element name="equipmentContainerID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "mspElectricPoint", propOrder = {
    "phaseCode",
    "load",
    "equipmentContainerID"
})
@XmlSeeAlso({
    SecurityLight.class,
    StreetLight.class,
    FakeNodeSection.class,
    EquivalentSource.class,
    TrafficLight.class,
    MspMotorGenerator.class,
    MspBankObject.class
})
public abstract class MspElectricPoint
    extends MspConnectivityPoint
{

    protected PhaseCode phaseCode;
    protected LoadGroup load;
    protected ObjectID equipmentContainerID;

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setPhaseCode(PhaseCode value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the load property.
     * 
     * @return
     *     possible object is
     *     {@link LoadGroup }
     *     
     */
    public LoadGroup getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadGroup }
     *     
     */
    public void setLoad(LoadGroup value) {
        this.load = value;
    }

    /**
     * Gets the value of the equipmentContainerID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getEquipmentContainerID() {
        return equipmentContainerID;
    }

    /**
     * Sets the value of the equipmentContainerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setEquipmentContainerID(ObjectID value) {
        this.equipmentContainerID = value;
    }

}
