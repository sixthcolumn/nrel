
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.NEMAFrameKind;


/**
 * This is an entry in the electrical equipment catalog for an imduction machine.  The induction machine may be operating as either a generator or a motor.
 * 
 * <p>Java class for inductionMachineEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inductionMachineEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pf" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="efficiency" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="LGVolts" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="dropout" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="NEMAFrameKind" type="{http://www.multispeak.org/V5.0/enumerations}NEMAFrameKind" minOccurs="0"/>
 *         &lt;element name="limitVoltage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lockedRotorPF" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lockedRotorMultiplier" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="impedances" type="{http://www.multispeak.org/V5.0}inductionMachineImpedances" minOccurs="0"/>
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
@XmlType(name = "inductionMachineEntry", propOrder = {
    "hp",
    "pf",
    "efficiency",
    "ratedVoltage",
    "lgVolts",
    "dropout",
    "nemaFrameKind",
    "limitVoltage",
    "lockedRotorPF",
    "lockedRotorMultiplier",
    "impedances"
})
public class InductionMachineEntry
    extends MspElectricalDefinition
{

    protected Float hp;
    protected Float pf;
    protected Float efficiency;
    protected Voltage ratedVoltage;
    @XmlElement(name = "LGVolts")
    protected Voltage lgVolts;
    protected Float dropout;
    @XmlElement(name = "NEMAFrameKind")
    protected NEMAFrameKind nemaFrameKind;
    protected Float limitVoltage;
    protected Float lockedRotorPF;
    protected Float lockedRotorMultiplier;
    protected InductionMachineImpedances impedances;

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHp(Float value) {
        this.hp = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPf() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPf(Float value) {
        this.pf = value;
    }

    /**
     * Gets the value of the efficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEfficiency() {
        return efficiency;
    }

    /**
     * Sets the value of the efficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEfficiency(Float value) {
        this.efficiency = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setRatedVoltage(Voltage value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the lgVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getLGVolts() {
        return lgVolts;
    }

    /**
     * Sets the value of the lgVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setLGVolts(Voltage value) {
        this.lgVolts = value;
    }

    /**
     * Gets the value of the dropout property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDropout() {
        return dropout;
    }

    /**
     * Sets the value of the dropout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDropout(Float value) {
        this.dropout = value;
    }

    /**
     * Gets the value of the nemaFrameKind property.
     * 
     * @return
     *     possible object is
     *     {@link NEMAFrameKind }
     *     
     */
    public NEMAFrameKind getNEMAFrameKind() {
        return nemaFrameKind;
    }

    /**
     * Sets the value of the nemaFrameKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEMAFrameKind }
     *     
     */
    public void setNEMAFrameKind(NEMAFrameKind value) {
        this.nemaFrameKind = value;
    }

    /**
     * Gets the value of the limitVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLimitVoltage() {
        return limitVoltage;
    }

    /**
     * Sets the value of the limitVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLimitVoltage(Float value) {
        this.limitVoltage = value;
    }

    /**
     * Gets the value of the lockedRotorPF property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLockedRotorPF() {
        return lockedRotorPF;
    }

    /**
     * Sets the value of the lockedRotorPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLockedRotorPF(Float value) {
        this.lockedRotorPF = value;
    }

    /**
     * Gets the value of the lockedRotorMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLockedRotorMultiplier() {
        return lockedRotorMultiplier;
    }

    /**
     * Sets the value of the lockedRotorMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLockedRotorMultiplier(Float value) {
        this.lockedRotorMultiplier = value;
    }

    /**
     * Gets the value of the impedances property.
     * 
     * @return
     *     possible object is
     *     {@link InductionMachineImpedances }
     *     
     */
    public InductionMachineImpedances getImpedances() {
        return impedances;
    }

    /**
     * Sets the value of the impedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link InductionMachineImpedances }
     *     
     */
    public void setImpedances(InductionMachineImpedances value) {
        this.impedances = value;
    }

}
