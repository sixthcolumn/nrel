
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Terminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Terminal">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="measurements" type="{cpsm_V4.1_Release}measurements" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal", propOrder = {
    "measurements"
})
public class Terminal
    extends ConductingEquipment
{

    protected Measurements measurements;

    /**
     * Gets the value of the measurements property.
     * 
     * @return
     *     possible object is
     *     {@link Measurements }
     *     
     */
    public Measurements getMeasurements() {
        return measurements;
    }

    /**
     * Sets the value of the measurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measurements }
     *     
     */
    public void setMeasurements(Measurements value) {
        this.measurements = value;
    }

}
