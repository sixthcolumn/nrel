
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.LMDeviceExchange;


/**
 * <p>Java class for ArrayOfLMDeviceExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLMDeviceExchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LMDeviceExchange" type="{http://www.multispeak.org/V5.0}LMDeviceExchange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLMDeviceExchange", propOrder = {
    "lmDeviceExchange"
})
public class ArrayOfLMDeviceExchange {

    @XmlElement(name = "LMDeviceExchange", nillable = true)
    protected List<LMDeviceExchange> lmDeviceExchange;

    /**
     * Gets the value of the lmDeviceExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lmDeviceExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLMDeviceExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LMDeviceExchange }
     * 
     * 
     */
    public List<LMDeviceExchange> getLMDeviceExchange() {
        if (lmDeviceExchange == null) {
            lmDeviceExchange = new ArrayList<LMDeviceExchange>();
        }
        return this.lmDeviceExchange;
    }

}
