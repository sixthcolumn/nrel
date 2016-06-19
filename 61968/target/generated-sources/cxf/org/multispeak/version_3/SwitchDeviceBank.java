
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for switchDeviceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchDeviceBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="mspSwitchDeviceList" type="{http://www.multispeak.org/Version_3.0}mspSwitchDeviceList" minOccurs="0"/>
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
@XmlType(name = "switchDeviceBank", propOrder = {
    "mspSwitchDeviceList"
})
public class SwitchDeviceBank
    extends MspSwitchingBank
{

    protected MspSwitchDeviceList mspSwitchDeviceList;

    /**
     * Gets the value of the mspSwitchDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link MspSwitchDeviceList }
     *     
     */
    public MspSwitchDeviceList getMspSwitchDeviceList() {
        return mspSwitchDeviceList;
    }

    /**
     * Sets the value of the mspSwitchDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspSwitchDeviceList }
     *     
     */
    public void setMspSwitchDeviceList(MspSwitchDeviceList value) {
        this.mspSwitchDeviceList = value;
    }

}
