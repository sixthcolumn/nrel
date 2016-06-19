
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.cpsm.VoltageLevel;


/**
 * <p>Java class for voltageLevels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voltageLevels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoltageLevel" type="{http://www.multispeak.org/V5.0/cpsm}VoltageLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voltageLevels", propOrder = {
    "voltageLevel"
})
public class VoltageLevels {

    @XmlElement(name = "VoltageLevel")
    protected List<VoltageLevel> voltageLevel;

    /**
     * Gets the value of the voltageLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voltageLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoltageLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoltageLevel }
     * 
     * 
     */
    public List<VoltageLevel> getVoltageLevel() {
        if (voltageLevel == null) {
            voltageLevel = new ArrayList<VoltageLevel>();
        }
        return this.voltageLevel;
    }

}
