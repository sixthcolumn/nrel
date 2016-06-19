
package ch.iec.tc57._2011.enddeviceevents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDeviceEvent" type="{http://iec.ch/TC57/2011/EndDeviceEvents#}EndDeviceEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDeviceEventType" type="{http://iec.ch/TC57/2011/EndDeviceEvents#}EndDeviceEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceEvents", propOrder = {
    "endDeviceEvent",
    "endDeviceEventType"
})
public class EndDeviceEvents {

    @XmlElement(name = "EndDeviceEvent")
    protected List<EndDeviceEvent> endDeviceEvent;
    @XmlElement(name = "EndDeviceEventType")
    protected List<EndDeviceEventType> endDeviceEventType;

    /**
     * Gets the value of the endDeviceEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceEvent }
     * 
     * 
     */
    public List<EndDeviceEvent> getEndDeviceEvent() {
        if (endDeviceEvent == null) {
            endDeviceEvent = new ArrayList<EndDeviceEvent>();
        }
        return this.endDeviceEvent;
    }

    /**
     * Gets the value of the endDeviceEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceEventType }
     * 
     * 
     */
    public List<EndDeviceEventType> getEndDeviceEventType() {
        if (endDeviceEventType == null) {
            endDeviceEventType = new ArrayList<EndDeviceEventType>();
        }
        return this.endDeviceEventType;
    }

}
