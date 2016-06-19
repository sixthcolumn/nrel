
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Duration;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.CapacitorSwitchStatus;
import org.multispeak.v5_0.enumerations.PhaseCode;
import org.multispeak.v5_0.enumerations.SwitchType;


/**
 * <p>Java class for capacitorBankSwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="capacitorBankSwitch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="switchID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="phaseCode" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode"/>
 *         &lt;element name="capacitorSwitchStatus" type="{http://www.multispeak.org/V5.0/enumerations}capacitorSwitchStatus"/>
 *         &lt;element name="switchType" type="{http://www.multispeak.org/V5.0/enumerations}switchType" minOccurs="0"/>
 *         &lt;element name="switchOnValue" type="{http://www.multispeak.org/V5.0}switchOnValue" minOccurs="0"/>
 *         &lt;element name="switchOffValue" type="{http://www.multispeak.org/V5.0}switchOffValue" minOccurs="0"/>
 *         &lt;element name="switchTimeDelay" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="controlCircuitRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="lastControlDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="assetData" type="{http://www.multispeak.org/V5.0}assetData" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capacitorBankSwitch", propOrder = {
    "switchID",
    "phaseCode",
    "capacitorSwitchStatus",
    "switchType",
    "switchOnValue",
    "switchOffValue",
    "switchTimeDelay",
    "controlCircuitRef",
    "lastControlDateTime",
    "assetData",
    "materialManagementAssemblyID"
})
public class CapacitorBankSwitch
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID switchID;
    @XmlElement(required = true)
    protected PhaseCode phaseCode;
    @XmlElement(required = true)
    protected CapacitorSwitchStatus capacitorSwitchStatus;
    protected SwitchType switchType;
    protected SwitchOnValue switchOnValue;
    protected SwitchOffValue switchOffValue;
    protected Duration switchTimeDelay;
    protected ObjectRef controlCircuitRef;
    protected XMLGregorianCalendar lastControlDateTime;
    protected AssetData assetData;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the switchID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSwitchID() {
        return switchID;
    }

    /**
     * Sets the value of the switchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSwitchID(ObjectID value) {
        this.switchID = value;
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
     * Gets the value of the capacitorSwitchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CapacitorSwitchStatus }
     *     
     */
    public CapacitorSwitchStatus getCapacitorSwitchStatus() {
        return capacitorSwitchStatus;
    }

    /**
     * Sets the value of the capacitorSwitchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacitorSwitchStatus }
     *     
     */
    public void setCapacitorSwitchStatus(CapacitorSwitchStatus value) {
        this.capacitorSwitchStatus = value;
    }

    /**
     * Gets the value of the switchType property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchType }
     *     
     */
    public SwitchType getSwitchType() {
        return switchType;
    }

    /**
     * Sets the value of the switchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchType }
     *     
     */
    public void setSwitchType(SwitchType value) {
        this.switchType = value;
    }

    /**
     * Gets the value of the switchOnValue property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOnValue }
     *     
     */
    public SwitchOnValue getSwitchOnValue() {
        return switchOnValue;
    }

    /**
     * Sets the value of the switchOnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOnValue }
     *     
     */
    public void setSwitchOnValue(SwitchOnValue value) {
        this.switchOnValue = value;
    }

    /**
     * Gets the value of the switchOffValue property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOffValue }
     *     
     */
    public SwitchOffValue getSwitchOffValue() {
        return switchOffValue;
    }

    /**
     * Sets the value of the switchOffValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOffValue }
     *     
     */
    public void setSwitchOffValue(SwitchOffValue value) {
        this.switchOffValue = value;
    }

    /**
     * Gets the value of the switchTimeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSwitchTimeDelay() {
        return switchTimeDelay;
    }

    /**
     * Sets the value of the switchTimeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSwitchTimeDelay(Duration value) {
        this.switchTimeDelay = value;
    }

    /**
     * Gets the value of the controlCircuitRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getControlCircuitRef() {
        return controlCircuitRef;
    }

    /**
     * Sets the value of the controlCircuitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setControlCircuitRef(ObjectRef value) {
        this.controlCircuitRef = value;
    }

    /**
     * Gets the value of the lastControlDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastControlDateTime() {
        return lastControlDateTime;
    }

    /**
     * Sets the value of the lastControlDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastControlDateTime(XMLGregorianCalendar value) {
        this.lastControlDateTime = value;
    }

    /**
     * Gets the value of the assetData property.
     * 
     * @return
     *     possible object is
     *     {@link AssetData }
     *     
     */
    public AssetData getAssetData() {
        return assetData;
    }

    /**
     * Sets the value of the assetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetData }
     *     
     */
    public void setAssetData(AssetData value) {
        this.assetData = value;
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

}
