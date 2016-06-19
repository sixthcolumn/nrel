
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherMeterExchanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherMeterExchanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherMeterExchange" type="{http://www.multispeak.org/V5.0}otherMeterExchange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherMeterExchanges", propOrder = {
    "otherMeterExchange"
})
public class OtherMeterExchanges {

    @XmlElement(required = true)
    protected List<OtherMeterExchange> otherMeterExchange;

    /**
     * Gets the value of the otherMeterExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMeterExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMeterExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherMeterExchange }
     * 
     * 
     */
    public List<OtherMeterExchange> getOtherMeterExchange() {
        if (otherMeterExchange == null) {
            otherMeterExchange = new ArrayList<OtherMeterExchange>();
        }
        return this.otherMeterExchange;
    }

}
