
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterEventList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterEventList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="eventInstances" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfEventInstance" minOccurs="0"/>
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
@XmlType(name = "meterEventList", propOrder = {
    "eventInstances"
})
public class MeterEventList
    extends MspObject
{

    protected ArrayOfEventInstance eventInstances;

    /**
     * Gets the value of the eventInstances property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventInstance }
     *     
     */
    public ArrayOfEventInstance getEventInstances() {
        return eventInstances;
    }

    /**
     * Sets the value of the eventInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventInstance }
     *     
     */
    public void setEventInstances(ArrayOfEventInstance value) {
        this.eventInstances = value;
    }

}
