
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.MountingType;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.Position;


/**
 * This is the abstract class from which all switching devices inherit.
 * 
 * <p>Java class for mspSwitchingDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspSwitchingDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspAsset">
 *       &lt;sequence>
 *         &lt;element name="eaEquipment" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="normalPosition" type="{http://www.multispeak.org/V5.0/enumerations}position" minOccurs="0"/>
 *         &lt;element name="operatingVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="mounting" type="{http://www.multispeak.org/V5.0/enumerations}mountingType" minOccurs="0"/>
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
@XmlType(name = "mspSwitchingDevice", propOrder = {
    "eaEquipment",
    "phaseCode",
    "normalPosition",
    "operatingVoltage",
    "mounting"
})
@XmlSeeAlso({
    Cut.class,
    Switch.class,
    Jumper.class,
    MspOverCurrentDevice.class,
    Elbow.class
})
public abstract class MspSwitchingDevice
    extends MspAsset
{

    protected EquipmentCatalogRef eaEquipment;
    protected PhaseCode phaseCode;
    protected Position normalPosition;
    protected Voltage operatingVoltage;
    protected MountingType mounting;

    /**
     * Gets the value of the eaEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getEaEquipment() {
        return eaEquipment;
    }

    /**
     * Sets the value of the eaEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setEaEquipment(EquipmentCatalogRef value) {
        this.eaEquipment = value;
    }

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
     * Gets the value of the normalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getNormalPosition() {
        return normalPosition;
    }

    /**
     * Sets the value of the normalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setNormalPosition(Position value) {
        this.normalPosition = value;
    }

    /**
     * Gets the value of the operatingVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getOperatingVoltage() {
        return operatingVoltage;
    }

    /**
     * Sets the value of the operatingVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setOperatingVoltage(Voltage value) {
        this.operatingVoltage = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link MountingType }
     *     
     */
    public MountingType getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MountingType }
     *     
     */
    public void setMounting(MountingType value) {
        this.mounting = value;
    }

}
