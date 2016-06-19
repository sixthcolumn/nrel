
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endDeviceEventTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEventTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDeviceEventTypeItem" type="{http://www.multispeak.org/V5.0}endDeviceEventTypeItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEventTypeList", propOrder = {
    "endDeviceEventTypeItem"
})
public class EndDeviceEventTypeList {

    @XmlElement(required = true)
    protected List<EndDeviceEventTypeItem> endDeviceEventTypeItem;

    /**
     * Gets the value of the endDeviceEventTypeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceEventTypeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceEventTypeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceEventTypeItem }
     * 
     * 
     */
    public List<EndDeviceEventTypeItem> getEndDeviceEventTypeItem() {
        if (endDeviceEventTypeItem == null) {
            endDeviceEventTypeItem = new ArrayList<EndDeviceEventTypeItem>();
        }
        return this.endDeviceEventTypeItem;
    }

}
