
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Terminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Terminal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}ConductingEquipment">
 *       &lt;sequence>
 *         &lt;element name="MeasurementIDs" type="{http://www.multispeak.org/V5.0/cpsm}MeasurementIDs" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal", propOrder = {
    "measurementIDs"
})
public class Terminal
    extends ConductingEquipment
{

    @XmlElement(name = "MeasurementIDs")
    protected MeasurementIDs measurementIDs;

    /**
     * Gets the value of the measurementIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementIDs }
     *     
     */
    public MeasurementIDs getMeasurementIDs() {
        return measurementIDs;
    }

    /**
     * Sets the value of the measurementIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementIDs }
     *     
     */
    public void setMeasurementIDs(MeasurementIDs value) {
        this.measurementIDs = value;
    }

}
