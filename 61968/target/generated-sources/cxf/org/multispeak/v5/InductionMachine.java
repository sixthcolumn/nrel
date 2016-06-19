
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Reactance;
import org.multispeak.v5_0.commontypes.Resistance;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.MachineType;
import org.multispeak.v5_0.enumerations.MotorStatus;
import org.multispeak.v5_0.enumerations.NEMAType;


/**
 * This is an induction machine.  This object replaces the Version 3.0 motor object. When the type element is set to motor, slip and power input are positive; when operating as an induction generator the slip and power input are negative. 
 * 
 * <p>Java class for inductionMachine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inductionMachine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspMotorGenerator">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.multispeak.org/V5.0/enumerations}motorStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.multispeak.org/V5.0/enumerations}machineType" minOccurs="0"/>
 *         &lt;element name="operatingSlip" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pf" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="efficiency" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="LGVolts" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="dropout" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="NEMAType" type="{http://www.multispeak.org/V5.0/enumerations}NEMAType" minOccurs="0"/>
 *         &lt;element name="limitVoltage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="softStartType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="softStartR" type="{http://www.multispeak.org/V5.0/commonTypes}resistance" minOccurs="0"/>
 *         &lt;element name="softStartX" type="{http://www.multispeak.org/V5.0/commonTypes}reactance" minOccurs="0"/>
 *         &lt;element name="softStartTap" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "inductionMachine", propOrder = {
    "status",
    "type",
    "operatingSlip",
    "hp",
    "pf",
    "efficiency",
    "lgVolts",
    "dropout",
    "nemaType",
    "limitVoltage",
    "softStartType",
    "softStartR",
    "softStartX",
    "softStartTap",
    "lockedRotorPF",
    "lockedRotorMultiplier",
    "impedances"
})
public class InductionMachine
    extends MspMotorGenerator
{

    protected MotorStatus status;
    protected MachineType type;
    protected Float operatingSlip;
    protected Float hp;
    protected Float pf;
    protected Float efficiency;
    @XmlElement(name = "LGVolts")
    protected Voltage lgVolts;
    protected Float dropout;
    @XmlElement(name = "NEMAType")
    protected NEMAType nemaType;
    protected Float limitVoltage;
    protected BigInteger softStartType;
    protected Resistance softStartR;
    protected Reactance softStartX;
    protected Float softStartTap;
    protected Float lockedRotorPF;
    protected Float lockedRotorMultiplier;
    protected InductionMachineImpedances impedances;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MotorStatus }
     *     
     */
    public MotorStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotorStatus }
     *     
     */
    public void setStatus(MotorStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MachineType }
     *     
     */
    public MachineType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineType }
     *     
     */
    public void setType(MachineType value) {
        this.type = value;
    }

    /**
     * Gets the value of the operatingSlip property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOperatingSlip() {
        return operatingSlip;
    }

    /**
     * Sets the value of the operatingSlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOperatingSlip(Float value) {
        this.operatingSlip = value;
    }

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
     * Gets the value of the nemaType property.
     * 
     * @return
     *     possible object is
     *     {@link NEMAType }
     *     
     */
    public NEMAType getNEMAType() {
        return nemaType;
    }

    /**
     * Sets the value of the nemaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEMAType }
     *     
     */
    public void setNEMAType(NEMAType value) {
        this.nemaType = value;
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
     * Gets the value of the softStartType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSoftStartType() {
        return softStartType;
    }

    /**
     * Sets the value of the softStartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSoftStartType(BigInteger value) {
        this.softStartType = value;
    }

    /**
     * Gets the value of the softStartR property.
     * 
     * @return
     *     possible object is
     *     {@link Resistance }
     *     
     */
    public Resistance getSoftStartR() {
        return softStartR;
    }

    /**
     * Sets the value of the softStartR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resistance }
     *     
     */
    public void setSoftStartR(Resistance value) {
        this.softStartR = value;
    }

    /**
     * Gets the value of the softStartX property.
     * 
     * @return
     *     possible object is
     *     {@link Reactance }
     *     
     */
    public Reactance getSoftStartX() {
        return softStartX;
    }

    /**
     * Sets the value of the softStartX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactance }
     *     
     */
    public void setSoftStartX(Reactance value) {
        this.softStartX = value;
    }

    /**
     * Gets the value of the softStartTap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSoftStartTap() {
        return softStartTap;
    }

    /**
     * Sets the value of the softStartTap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSoftStartTap(Float value) {
        this.softStartTap = value;
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
