
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overcurrentDeviceBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overcurrentDeviceBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="mspOverCurrentDeviceList" type="{http://www.multispeak.org/Version_3.0}mspOverCurrentDeviceList" minOccurs="0"/>
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
@XmlType(name = "overcurrentDeviceBank", propOrder = {
    "mspOverCurrentDeviceList"
})
public class OvercurrentDeviceBank
    extends MspSwitchingBank
{

    protected MspOverCurrentDeviceList mspOverCurrentDeviceList;

    /**
     * Gets the value of the mspOverCurrentDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link MspOverCurrentDeviceList }
     *     
     */
    public MspOverCurrentDeviceList getMspOverCurrentDeviceList() {
        return mspOverCurrentDeviceList;
    }

    /**
     * Sets the value of the mspOverCurrentDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MspOverCurrentDeviceList }
     *     
     */
    public void setMspOverCurrentDeviceList(MspOverCurrentDeviceList value) {
        this.mspOverCurrentDeviceList = value;
    }

}
