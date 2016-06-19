
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.OutageDetectionDeviceStatus;


/**
 * <p>Java class for ArrayOfOutageDetectionDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutageDetectionDeviceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageDetectionDeviceStatus" type="{http://www.multispeak.org/V5.0/enumerations}outageDetectionDeviceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutageDetectionDeviceStatus", propOrder = {
    "outageDetectionDeviceStatus"
})
public class ArrayOfOutageDetectionDeviceStatus {

    protected List<OutageDetectionDeviceStatus> outageDetectionDeviceStatus;

    /**
     * Gets the value of the outageDetectionDeviceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageDetectionDeviceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageDetectionDeviceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageDetectionDeviceStatus }
     * 
     * 
     */
    public List<OutageDetectionDeviceStatus> getOutageDetectionDeviceStatus() {
        if (outageDetectionDeviceStatus == null) {
            outageDetectionDeviceStatus = new ArrayList<OutageDetectionDeviceStatus>();
        }
        return this.outageDetectionDeviceStatus;
    }

}
