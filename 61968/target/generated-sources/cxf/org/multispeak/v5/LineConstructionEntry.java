
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.Length;
import org.multispeak.v5_0.commontypes.Resistance;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.LineConstructionEntryType;


/**
 * This object is used to define an entry in the  line construction catalog.  These entries are referred to by the "construction" attribute of all objects that inherit from the mspElectricLine abstract class.
 * 
 * <p>Java class for lineConstructionEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lineConstructionEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.multispeak.org/V5.0/enumerations}lineConstructionEntryType" minOccurs="0"/>
 *         &lt;element name="maximumVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="conductorItems" type="{http://www.multispeak.org/V5.0}conductorItems" minOccurs="0"/>
 *         &lt;element name="downleadConductorID" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="downleadLength" type="{http://www.multispeak.org/V5.0/commonTypes}length" minOccurs="0"/>
 *         &lt;element name="groundResistance" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
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
@XmlType(name = "lineConstructionEntry", propOrder = {
    "type",
    "maximumVoltage",
    "conductorItems",
    "downleadConductorID",
    "downleadLength",
    "groundResistance"
})
public class LineConstructionEntry
    extends MspElectricalDefinition
{

    protected LineConstructionEntryType type;
    protected Voltage maximumVoltage;
    protected ConductorItems conductorItems;
    protected EquipmentCatalogRef downleadConductorID;
    protected Length downleadLength;
    protected Resistance groundResistance;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LineConstructionEntryType }
     *     
     */
    public LineConstructionEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineConstructionEntryType }
     *     
     */
    public void setType(LineConstructionEntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the maximumVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getMaximumVoltage() {
        return maximumVoltage;
    }

    /**
     * Sets the value of the maximumVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setMaximumVoltage(Voltage value) {
        this.maximumVoltage = value;
    }

    /**
     * Gets the value of the conductorItems property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorItems }
     *     
     */
    public ConductorItems getConductorItems() {
        return conductorItems;
    }

    /**
     * Sets the value of the conductorItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorItems }
     *     
     */
    public void setConductorItems(ConductorItems value) {
        this.conductorItems = value;
    }

    /**
     * Gets the value of the downleadConductorID property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getDownleadConductorID() {
        return downleadConductorID;
    }

    /**
     * Sets the value of the downleadConductorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setDownleadConductorID(EquipmentCatalogRef value) {
        this.downleadConductorID = value;
    }

    /**
     * Gets the value of the downleadLength property.
     * 
     * @return
     *     possible object is
     *     {@link Length }
     *     
     */
    public Length getDownleadLength() {
        return downleadLength;
    }

    /**
     * Sets the value of the downleadLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Length }
     *     
     */
    public void setDownleadLength(Length value) {
        this.downleadLength = value;
    }

    /**
     * Gets the value of the groundResistance property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getGroundResistance() {
        return groundResistance;
    }

    /**
     * Sets the value of the groundResistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setGroundResistance(Resistance value) {
        this.groundResistance = value;
    }

}
