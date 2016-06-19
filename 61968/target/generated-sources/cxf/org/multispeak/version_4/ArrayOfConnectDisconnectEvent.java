
package org.multispeak.version_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConnectDisconnectEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConnectDisconnectEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectDisconnectEvent" type="{http://www.multispeak.org/Version_4.1_Release}connectDisconnectEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConnectDisconnectEvent", propOrder = {
    "connectDisconnectEvent"
})
public class ArrayOfConnectDisconnectEvent {

    @XmlElement(nillable = true)
    protected List<ConnectDisconnectEvent> connectDisconnectEvent;

    /**
     * Gets the value of the connectDisconnectEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectDisconnectEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectDisconnectEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectDisconnectEvent }
     * 
     * 
     */
    public List<ConnectDisconnectEvent> getConnectDisconnectEvent() {
        if (connectDisconnectEvent == null) {
            connectDisconnectEvent = new ArrayList<ConnectDisconnectEvent>();
        }
        return this.connectDisconnectEvent;
    }

}
