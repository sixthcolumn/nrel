
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waterMeterExchanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waterMeterExchanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="waterMeterExchange" type="{http://www.multispeak.org/V5.0}waterMeterExchange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waterMeterExchanges", propOrder = {
    "waterMeterExchange"
})
public class WaterMeterExchanges {

    @XmlElement(required = true)
    protected List<WaterMeterExchange> waterMeterExchange;

    /**
     * Gets the value of the waterMeterExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterMeterExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterMeterExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterMeterExchange }
     * 
     * 
     */
    public List<WaterMeterExchange> getWaterMeterExchange() {
        if (waterMeterExchange == null) {
            waterMeterExchange = new ArrayList<WaterMeterExchange>();
        }
        return this.waterMeterExchange;
    }

}
