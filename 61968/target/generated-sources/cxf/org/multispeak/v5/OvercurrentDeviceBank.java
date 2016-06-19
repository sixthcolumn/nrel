
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for overcurrentDeviceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overcurrentDeviceBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="overcurrentDevices" type="{http://www.multispeak.org/V5.0}overcurrentDevices" minOccurs="0"/>
 *         &lt;element name="materialManagementAssemblyID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "overcurrentDeviceBank", propOrder = {
    "overcurrentDevices",
    "materialManagementAssemblyID"
})
public class OvercurrentDeviceBank
    extends MspSwitchingBank
{

    protected OvercurrentDevices overcurrentDevices;
    protected ObjectID materialManagementAssemblyID;

    /**
     * Gets the value of the overcurrentDevices property.
     * 
     * @return
     *     possible object is
     *     {@link OvercurrentDevices }
     *     
     */
    public OvercurrentDevices getOvercurrentDevices() {
        return overcurrentDevices;
    }

    /**
     * Sets the value of the overcurrentDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvercurrentDevices }
     *     
     */
    public void setOvercurrentDevices(OvercurrentDevices value) {
        this.overcurrentDevices = value;
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
