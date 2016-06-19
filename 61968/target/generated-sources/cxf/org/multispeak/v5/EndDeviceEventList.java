
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endDeviceEventList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEventList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="endDeviceEvents" type="{http://www.multispeak.org/V5.0}endDeviceEvents"/>
 *         &lt;element name="endDeviceEventTypeList" type="{http://www.multispeak.org/V5.0}endDeviceEventTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEventList", propOrder = {
    "endDeviceEvents",
    "endDeviceEventTypeList"
})
public class EndDeviceEventList
    extends MspReferable
{

    @XmlElement(required = true)
    protected EndDeviceEvents endDeviceEvents;
    protected EndDeviceEventTypeList endDeviceEventTypeList;

    /**
     * Gets the value of the endDeviceEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEvents }
     *     
     */
    public EndDeviceEvents getEndDeviceEvents() {
        return endDeviceEvents;
    }

    /**
     * Sets the value of the endDeviceEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEvents }
     *     
     */
    public void setEndDeviceEvents(EndDeviceEvents value) {
        this.endDeviceEvents = value;
    }

    /**
     * Gets the value of the endDeviceEventTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceEventTypeList }
     *     
     */
    public EndDeviceEventTypeList getEndDeviceEventTypeList() {
        return endDeviceEventTypeList;
    }

    /**
     * Sets the value of the endDeviceEventTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceEventTypeList }
     *     
     */
    public void setEndDeviceEventTypeList(EndDeviceEventTypeList value) {
        this.endDeviceEventTypeList = value;
    }

}
