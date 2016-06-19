
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.ThresholdMonitoringItem;


/**
 * <p>Java class for ArrayOfThresholdMonitoringItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfThresholdMonitoringItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thresholdMonitoringItem" type="{http://www.multispeak.org/V5.0}thresholdMonitoringItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfThresholdMonitoringItem", propOrder = {
    "thresholdMonitoringItem"
})
public class ArrayOfThresholdMonitoringItem {

    protected List<ThresholdMonitoringItem> thresholdMonitoringItem;

    /**
     * Gets the value of the thresholdMonitoringItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thresholdMonitoringItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThresholdMonitoringItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThresholdMonitoringItem }
     * 
     * 
     */
    public List<ThresholdMonitoringItem> getThresholdMonitoringItem() {
        if (thresholdMonitoringItem == null) {
            thresholdMonitoringItem = new ArrayList<ThresholdMonitoringItem>();
        }
        return this.thresholdMonitoringItem;
    }

}
