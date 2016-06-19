
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ApparentPower;
import org.multispeak.v5_0.commontypes.EquipmentCatalogRef;
import org.multispeak.v5_0.commontypes.ReactivePower;
import org.multispeak.v5_0.commontypes.Voltage;


/**
 * This is an electrical equipment catalog entry for a synchronous machine.  The synchronous machine may be operating as either a motor or a generator.
 * 
 * <p>Java class for synchronousMachineEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="synchronousMachineEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspElectricalDefinition">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="ssImpedanceID" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="tranImpedanceID" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="stImpedanceID" type="{http://www.multispeak.org/V5.0/commonTypes}equipmentCatalogRef" minOccurs="0"/>
 *         &lt;element name="maxLeadQ" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="maxLagQ" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="maximumVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="minimumVoltage" type="{http://www.multispeak.org/V5.0/commonTypes}voltage" minOccurs="0"/>
 *         &lt;element name="maxQ" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="minQ" type="{http://www.multispeak.org/V5.0/commonTypes}reactivePower" minOccurs="0"/>
 *         &lt;element name="ratedMVA" type="{http://www.multispeak.org/V5.0/commonTypes}apparentPower" minOccurs="0"/>
 *         &lt;element name="impedances" type="{http://www.multispeak.org/V5.0}synchronousMachineImpedances" minOccurs="0"/>
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
@XmlType(name = "synchronousMachineEntry", propOrder = {
    "ratedVoltage",
    "ssImpedanceID",
    "tranImpedanceID",
    "stImpedanceID",
    "maxLeadQ",
    "maxLagQ",
    "maximumVoltage",
    "minimumVoltage",
    "maxQ",
    "minQ",
    "ratedMVA",
    "impedances"
})
public class SynchronousMachineEntry
    extends MspElectricalDefinition
{

    protected Voltage ratedVoltage;
    protected EquipmentCatalogRef ssImpedanceID;
    protected EquipmentCatalogRef tranImpedanceID;
    protected EquipmentCatalogRef stImpedanceID;
    protected ReactivePower maxLeadQ;
    protected ReactivePower maxLagQ;
    protected Voltage maximumVoltage;
    protected Voltage minimumVoltage;
    protected ReactivePower maxQ;
    protected ReactivePower minQ;
    protected ApparentPower ratedMVA;
    protected SynchronousMachineImpedances impedances;

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
     * Gets the value of the ssImpedanceID property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getSsImpedanceID() {
        return ssImpedanceID;
    }

    /**
     * Sets the value of the ssImpedanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setSsImpedanceID(EquipmentCatalogRef value) {
        this.ssImpedanceID = value;
    }

    /**
     * Gets the value of the tranImpedanceID property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getTranImpedanceID() {
        return tranImpedanceID;
    }

    /**
     * Sets the value of the tranImpedanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setTranImpedanceID(EquipmentCatalogRef value) {
        this.tranImpedanceID = value;
    }

    /**
     * Gets the value of the stImpedanceID property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public EquipmentCatalogRef getStImpedanceID() {
        return stImpedanceID;
    }

    /**
     * Sets the value of the stImpedanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentCatalogRef }
     *     
     */
    public void setStImpedanceID(EquipmentCatalogRef value) {
        this.stImpedanceID = value;
    }

    /**
     * Gets the value of the maxLeadQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxLeadQ() {
        return maxLeadQ;
    }

    /**
     * Sets the value of the maxLeadQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxLeadQ(ReactivePower value) {
        this.maxLeadQ = value;
    }

    /**
     * Gets the value of the maxLagQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxLagQ() {
        return maxLagQ;
    }

    /**
     * Sets the value of the maxLagQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxLagQ(ReactivePower value) {
        this.maxLagQ = value;
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
     * Gets the value of the minimumVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Voltage }
     *     
     */
    public Voltage getMinimumVoltage() {
        return minimumVoltage;
    }

    /**
     * Sets the value of the minimumVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voltage }
     *     
     */
    public void setMinimumVoltage(Voltage value) {
        this.minimumVoltage = value;
    }

    /**
     * Gets the value of the maxQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMaxQ() {
        return maxQ;
    }

    /**
     * Sets the value of the maxQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMaxQ(ReactivePower value) {
        this.maxQ = value;
    }

    /**
     * Gets the value of the minQ property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePower }
     *     
     */
    public ReactivePower getMinQ() {
        return minQ;
    }

    /**
     * Sets the value of the minQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePower }
     *     
     */
    public void setMinQ(ReactivePower value) {
        this.minQ = value;
    }

    /**
     * Gets the value of the ratedMVA property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPower }
     *     
     */
    public ApparentPower getRatedMVA() {
        return ratedMVA;
    }

    /**
     * Sets the value of the ratedMVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPower }
     *     
     */
    public void setRatedMVA(ApparentPower value) {
        this.ratedMVA = value;
    }

    /**
     * Gets the value of the impedances property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronousMachineImpedances }
     *     
     */
    public SynchronousMachineImpedances getImpedances() {
        return impedances;
    }

    /**
     * Sets the value of the impedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronousMachineImpedances }
     *     
     */
    public void setImpedances(SynchronousMachineImpedances value) {
        this.impedances = value;
    }

}
