
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switchingDeviceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingDeviceBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="switchingDeviceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSwitchingDevice" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "switchingDeviceBank", propOrder = {
    "switchingDeviceList"
})
public class SwitchingDeviceBank
    extends MspSwitchingBank
{

    protected ArrayOfSwitchingDevice switchingDeviceList;

    /**
     * Gets the value of the switchingDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwitchingDevice }
     *     
     */
    public ArrayOfSwitchingDevice getSwitchingDeviceList() {
        return switchingDeviceList;
    }

    /**
     * Sets the value of the switchingDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwitchingDevice }
     *     
     */
    public void setSwitchingDeviceList(ArrayOfSwitchingDevice value) {
        this.switchingDeviceList = value;
    }

}
