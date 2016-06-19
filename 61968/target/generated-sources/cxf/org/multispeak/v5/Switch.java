
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for switch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspSwitchingDevice">
 *       &lt;sequence>
 *         &lt;element name="switchImpedances" type="{http://www.multispeak.org/V5.0}switchImpedances" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="switchingDeviceBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "switch", propOrder = {
    "switchImpedances",
    "materialManagementAssemblyID",
    "switchingDeviceBankID"
})
public class Switch
    extends MspSwitchingDevice
{

    protected SwitchImpedances switchImpedances;
    protected ObjectID materialManagementAssemblyID;
    protected ObjectID switchingDeviceBankID;

    /**
     * Gets the value of the switchImpedances property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchImpedances }
     *     
     */
    public SwitchImpedances getSwitchImpedances() {
        return switchImpedances;
    }

    /**
     * Sets the value of the switchImpedances property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchImpedances }
     *     
     */
    public void setSwitchImpedances(SwitchImpedances value) {
        this.switchImpedances = value;
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
     * Gets the value of the switchingDeviceBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSwitchingDeviceBankID() {
        return switchingDeviceBankID;
    }

    /**
     * Sets the value of the switchingDeviceBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSwitchingDeviceBankID(ObjectID value) {
        this.switchingDeviceBankID = value;
    }

}
