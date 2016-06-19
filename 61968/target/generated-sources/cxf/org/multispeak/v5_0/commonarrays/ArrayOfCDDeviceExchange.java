
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.CDDeviceExchange;


/**
 * <p>Java class for ArrayOfCDDeviceExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCDDeviceExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CDDeviceExchange" type="{http://www.multispeak.org/V5.0}CDDeviceExchange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCDDeviceExchange", propOrder = {
    "cdDeviceExchange"
})
public class ArrayOfCDDeviceExchange {

    @XmlElement(name = "CDDeviceExchange", nillable = true)
    protected List<CDDeviceExchange> cdDeviceExchange;

    /**
     * Gets the value of the cdDeviceExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdDeviceExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDDeviceExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDDeviceExchange }
     * 
     * 
     */
    public List<CDDeviceExchange> getCDDeviceExchange() {
        if (cdDeviceExchange == null) {
            cdDeviceExchange = new ArrayList<CDDeviceExchange>();
        }
        return this.cdDeviceExchange;
    }

}
