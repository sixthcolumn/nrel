
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.cpsm.AnalogValue;


/**
 * This structure permits the transfer of multiple values from different measurement sources, as is required in the CIM CPSM profile.  This is not required for MultiSpeak data transfers.
 * 
 * <p>Java class for scadaAnalogValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaAnalogValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalogValue" type="{http://www.multispeak.org/V5.0/cpsm}AnalogValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scadaAnalogValues", propOrder = {
    "analogValue"
})
public class ScadaAnalogValues {

    @XmlElement(name = "AnalogValue")
    protected List<AnalogValue> analogValue;

    /**
     * Gets the value of the analogValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalogValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalogValue }
     * 
     * 
     */
    public List<AnalogValue> getAnalogValue() {
        if (analogValue == null) {
            analogValue = new ArrayList<AnalogValue>();
        }
        return this.analogValue;
    }

}
