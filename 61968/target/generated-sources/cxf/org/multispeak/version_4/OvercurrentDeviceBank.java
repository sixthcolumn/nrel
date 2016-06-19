
package org.multispeak.version_4;

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
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspSwitchingBank">
 *       &lt;sequence>
 *         &lt;element name="overcurrentDeviceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfOvercurrentDevice" minOccurs="0"/>
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
    "overcurrentDeviceList"
})
public class OvercurrentDeviceBank
    extends MspSwitchingBank
{

    protected ArrayOfOvercurrentDevice overcurrentDeviceList;

    /**
     * Gets the value of the overcurrentDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOvercurrentDevice }
     *     
     */
    public ArrayOfOvercurrentDevice getOvercurrentDeviceList() {
        return overcurrentDeviceList;
    }

    /**
     * Sets the value of the overcurrentDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOvercurrentDevice }
     *     
     */
    public void setOvercurrentDeviceList(ArrayOfOvercurrentDevice value) {
        this.overcurrentDeviceList = value;
    }

}
