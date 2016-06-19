
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.Impedances;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.commontypes.Voltage;
import org.multispeak.v5_0.enumerations.CapacitorConnectionCode;


/**
 * This is a capacitor bank.  It can be used to model the CPSM SeriesCompensator using the connectionCode = "Series" or a CPSM ShuntCompensator using any other connection code value.  If the reactiveRating and the reactivePerSection values are positive, then the capacitorBank is modeling a ShuntCompensator in capacitive mode; if the reactiveRating and reactivePerSection are negative then the capacitorBank is modeling a ShuntCompensator that is operating in inductive mode. The object ID for this object is that from the mspObject which contains this capacitor bank.
 * 
 * <p>Java class for capacitorBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitorBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="capacitorConnectionCode" type="{http://www.multispeak.org/V5.0/enumerations}capacitorConnectionCode" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="bankRating" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="nominalVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="capacitorPhaseUnits" type="{http://www.multispeak.org/V5.0}capacitorPhaseUnits" minOccurs="0"/>
 *         &lt;element name="impedances" type="{http://www.multispeak.org/V5.0/commonTypes}impedances" minOccurs="0"/>
 *         &lt;element name="regulatingControlID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="capacitorBankSwitches" type="{http://www.multispeak.org/V5.0}capacitorBankSwitches" minOccurs="0"/>
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
@XmlType(name = "capacitorBank", propOrder = {
    "capacitorConnectionCode",
    "materialManagementAssemblyID",
    "bankRating",
    "nominalVoltage",
    "capacitorPhaseUnits",
    "impedances",
    "regulatingControlID",
    "capacitorBankSwitches"
})
public class CapacitorBank
    extends MspBankObject
{

    protected CapacitorConnectionCode capacitorConnectionCode;
    protected ObjectID materialManagementAssemblyID;
    protected ReactivePower bankRating;
    protected Voltage nominalVoltage;
    protected CapacitorPhaseUnits capacitorPhaseUnits;
    protected Impedances impedances;
    protected ObjectID regulatingControlID;
    protected CapacitorBankSwitches capacitorBankSwitches;

    /**
     * Gets the value of the capacitorConnectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorConnectionCode }
     *     
     */
    public CapacitorConnectionCode getCapacitorConnectionCode() {
        return capacitorConnectionCode;
    }

    /**
     * Sets the value of the capacitorConnectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorConnectionCode }
     *     
     */
    public void setCapacitorConnectionCode(CapacitorConnectionCode value) {
        this.capacitorConnectionCode = value;
    }

    /**
     * Gets the value of the materialManagementAssemblyID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMaterialManagementAssemblyID() {
        return materialManagementAssemblyID;
    }

    /**
     * Sets the value of the materialManagementAssemblyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMaterialManagementAssemblyID(ObjectID value) {
        this.materialManagementAssemblyID = value;
    }

    /**
     * Gets the value of the bankRating property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getBankRating() {
        return bankRating;
    }

    /**
     * Sets the value of the bankRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setBankRating(ReactivePower value) {
        this.bankRating = value;
    }

    /**
     * Gets the value of the nominalVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * Sets the value of the nominalVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setNominalVoltage(Voltage value) {
        this.nominalVoltage = value;
    }

    /**
     * Gets the value of the capacitorPhaseUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorPhaseUnits }
     *     
     */
    public CapacitorPhaseUnits getCapacitorPhaseUnits() {
        return capacitorPhaseUnits;
    }

    /**
     * Sets the value of the capacitorPhaseUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorPhaseUnits }
     *     
     */
    public void setCapacitorPhaseUnits(CapacitorPhaseUnits value) {
        this.capacitorPhaseUnits = value;
    }

    /**
     * Gets the value of the impedances property.
     * 
     * @return
     *     possible object is
     *     {@link Impedances }
     *     
     */
    public Impedances getImpedances() {
        return impedances;
    }

    /**
     * Sets the value of the impedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impedances }
     *     
     */
    public void setImpedances(Impedances value) {
        this.impedances = value;
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

    /**
     * Gets the value of the capacitorBankSwitches property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorBankSwitches }
     *     
     */
    public CapacitorBankSwitches getCapacitorBankSwitches() {
        return capacitorBankSwitches;
    }

    /**
     * Sets the value of the capacitorBankSwitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorBankSwitches }
     *     
     */
    public void setCapacitorBankSwitches(CapacitorBankSwitches value) {
        this.capacitorBankSwitches = value;
    }

}
