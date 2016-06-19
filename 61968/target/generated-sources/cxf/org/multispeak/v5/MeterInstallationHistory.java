
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterInstallationHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterInstallationHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterHistoryEvent" type="{http://www.multispeak.org/V5.0}meterHistoryEvent" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterInstallationHistory", propOrder = {
    "meterHistoryEvent"
})
public class MeterInstallationHistory {

    @XmlElement(required = true)
    protected List<MeterHistoryEvent> meterHistoryEvent;

    /**
     * Gets the value of the meterHistoryEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterHistoryEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterHistoryEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterHistoryEvent }
     * 
     * 
     */
    public List<MeterHistoryEvent> getMeterHistoryEvent() {
        if (meterHistoryEvent == null) {
            meterHistoryEvent = new ArrayList<MeterHistoryEvent>();
        }
        return this.meterHistoryEvent;
    }

}
