
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for PANDeviceRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANDeviceRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceID" type="{http://www.multispeak.org/V5.0}PANDeviceID"/>
 *         &lt;element name="PANInterfaceID" type="{http://www.multispeak.org/V5.0}PANInterfaceID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANDeviceRef", propOrder = {
    "panDeviceID",
    "panInterfaceID"
})
public class PANDeviceRef
    extends MspExtensible
{

    @XmlElement(name = "PANDeviceID", required = true)
    protected PANDeviceID panDeviceID;
    @XmlElement(name = "PANInterfaceID", required = true)
    protected PANInterfaceID panInterfaceID;

    /**
     * Gets the value of the panDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceID }
     *     
     */
    public PANDeviceID getPANDeviceID() {
        return panDeviceID;
    }

    /**
     * Sets the value of the panDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceID }
     *     
     */
    public void setPANDeviceID(PANDeviceID value) {
        this.panDeviceID = value;
    }

    /**
     * Gets the value of the panInterfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link PANInterfaceID }
     *     
     */
    public PANInterfaceID getPANInterfaceID() {
        return panInterfaceID;
    }

    /**
     * Sets the value of the panInterfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANInterfaceID }
     *     
     */
    public void setPANInterfaceID(PANInterfaceID value) {
        this.panInterfaceID = value;
    }

}
