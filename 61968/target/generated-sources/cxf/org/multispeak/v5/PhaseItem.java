
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.enumerations.MspPhase;


/**
 * <p>Java class for phaseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phaseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phase" type="{http://www.multispeak.org/V5.0/enumerations}mspPhase"/>
 *         &lt;element name="conductorType" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef"/>
 *         &lt;element name="positionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phaseItem", propOrder = {
    "phase",
    "conductorType",
    "positionNumber"
})
public class PhaseItem {

    @XmlElement(required = true)
    protected MspPhase phase;
    @XmlElement(required = true)
    protected EquipmentCatalogRef conductorType;
    @XmlElement(required = true)
    protected String positionNumber;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link MspPhase }
     *     
     */
    public MspPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspPhase }
     *     
     */
    public void setPhase(MspPhase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the conductorType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getConductorType() {
        return conductorType;
    }

    /**
     * Sets the value of the conductorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setConductorType(EquipmentCatalogRef value) {
        this.conductorType = value;
    }

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

}
