
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ppmMeterExchanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ppmMeterExchanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ppmMeterExchange" type="{http://www.multispeak.org/V5.0}ppmMeterExchange" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ppmMeterExchanges", propOrder = {
    "ppmMeterExchange"
})
public class PpmMeterExchanges {

    @XmlElement(required = true)
    protected List<PpmMeterExchange> ppmMeterExchange;

    /**
     * Gets the value of the ppmMeterExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppmMeterExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPpmMeterExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PpmMeterExchange }
     * 
     * 
     */
    public List<PpmMeterExchange> getPpmMeterExchange() {
        if (ppmMeterExchange == null) {
            ppmMeterExchange = new ArrayList<PpmMeterExchange>();
        }
        return this.ppmMeterExchange;
    }

}
