
package ch.iec.tc57._2011.enddevicecontrols;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndDeviceControls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceControls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDeviceControl" type="{http://iec.ch/TC57/2011/EndDeviceControls#}EndDeviceControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDeviceControlType" type="{http://iec.ch/TC57/2011/EndDeviceControls#}EndDeviceControlType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceControls", propOrder = {
    "endDeviceControl",
    "endDeviceControlType"
})
public class EndDeviceControls {

    @XmlElement(name = "EndDeviceControl")
    protected List<EndDeviceControl> endDeviceControl;
    @XmlElement(name = "EndDeviceControlType")
    protected List<EndDeviceControlType> endDeviceControlType;

    /**
     * Gets the value of the endDeviceControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceControl }
     * 
     * 
     */
    public List<EndDeviceControl> getEndDeviceControl() {
        if (endDeviceControl == null) {
            endDeviceControl = new ArrayList<EndDeviceControl>();
        }
        return this.endDeviceControl;
    }

    /**
     * Gets the value of the endDeviceControlType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceControlType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceControlType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceControlType }
     * 
     * 
     */
    public List<EndDeviceControlType> getEndDeviceControlType() {
        if (endDeviceControlType == null) {
            endDeviceControlType = new ArrayList<EndDeviceControlType>();
        }
        return this.endDeviceControlType;
    }

}
