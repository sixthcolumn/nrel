
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.cpsm.Discrete;


/**
 * <p>Java class for measurementItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurementItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="analog" type="{http://www.multispeak.org/V5.0}scadaAnalog" minOccurs="0"/>
 *         &lt;element name="accumulator" type="{http://www.multispeak.org/V5.0}accumulatedValue" minOccurs="0"/>
 *         &lt;element name="discrete" type="{http://www.multispeak.org/V5.0/cpsm}Discrete" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measurementItems", propOrder = {
    "analogAndAccumulatorAndDiscrete"
})
public class MeasurementItems {

    @XmlElements({
        @XmlElement(name = "discrete", type = Discrete.class),
        @XmlElement(name = "accumulator", type = AccumulatedValue.class),
        @XmlElement(name = "analog", type = ScadaAnalog.class)
    })
    protected List<Object> analogAndAccumulatorAndDiscrete;

    /**
     * Gets the value of the analogAndAccumulatorAndDiscrete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogAndAccumulatorAndDiscrete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalogAndAccumulatorAndDiscrete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discrete }
     * {@link AccumulatedValue }
     * {@link ScadaAnalog }
     * 
     * 
     */
    public List<Object> getAnalogAndAccumulatorAndDiscrete() {
        if (analogAndAccumulatorAndDiscrete == null) {
            analogAndAccumulatorAndDiscrete = new ArrayList<Object>();
        }
        return this.analogAndAccumulatorAndDiscrete;
    }

}
