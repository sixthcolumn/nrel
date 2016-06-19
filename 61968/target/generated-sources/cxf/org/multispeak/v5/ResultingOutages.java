
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * These are the outages that result from the outageSplit.
 * 
 * <p>Java class for resultingOutages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultingOutages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="2">
 *         &lt;element name="electricOutage" type="{http://www.multispeak.org/V5.0}electricOutage"/>
 *         &lt;element name="gasOutage" type="{http://www.multispeak.org/V5.0}gasOutage"/>
 *         &lt;element name="waterOutage" type="{http://www.multispeak.org/V5.0}waterOutage"/>
 *         &lt;element name="telecomOutage" type="{http://www.multispeak.org/V5.0}telecomOutage"/>
 *         &lt;element name="cableOutage" type="{http://www.multispeak.org/V5.0}cableOutage"/>
 *         &lt;element name="internetOutage" type="{http://www.multispeak.org/V5.0}internetOutage"/>
 *         &lt;element name="otherOutage" type="{http://www.multispeak.org/V5.0}otherOutage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultingOutages", propOrder = {
    "electricOutageOrGasOutageOrWaterOutage"
})
public class ResultingOutages {

    @XmlElements({
        @XmlElement(name = "electricOutage", type = ElectricOutage.class),
        @XmlElement(name = "telecomOutage", type = TelecomOutage.class),
        @XmlElement(name = "gasOutage", type = GasOutage.class),
        @XmlElement(name = "otherOutage", type = OtherOutage.class),
        @XmlElement(name = "internetOutage", type = InternetOutage.class),
        @XmlElement(name = "waterOutage", type = WaterOutage.class),
        @XmlElement(name = "cableOutage", type = CableOutage.class)
    })
    protected List<MspOutage> electricOutageOrGasOutageOrWaterOutage;

    /**
     * Gets the value of the electricOutageOrGasOutageOrWaterOutage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electricOutageOrGasOutageOrWaterOutage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectricOutageOrGasOutageOrWaterOutage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricOutage }
     * {@link TelecomOutage }
     * {@link GasOutage }
     * {@link OtherOutage }
     * {@link InternetOutage }
     * {@link WaterOutage }
     * {@link CableOutage }
     * 
     * 
     */
    public List<MspOutage> getElectricOutageOrGasOutageOrWaterOutage() {
        if (electricOutageOrGasOutageOrWaterOutage == null) {
            electricOutageOrGasOutageOrWaterOutage = new ArrayList<MspOutage>();
        }
        return this.electricOutageOrGasOutageOrWaterOutage;
    }

}
