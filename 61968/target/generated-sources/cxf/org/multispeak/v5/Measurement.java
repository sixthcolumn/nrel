
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for measurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="measurementDeviceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="measurementItems" type="{http://www.multispeak.org/V5.0}measurementItems" minOccurs="0"/>
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
@XmlType(name = "measurement", propOrder = {
    "measurementDeviceID",
    "measurementItems"
})
public class Measurement
    extends MspObject
{

    protected ObjectRef measurementDeviceID;
    protected MeasurementItems measurementItems;

    /**
     * Gets the value of the measurementDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getMeasurementDeviceID() {
        return measurementDeviceID;
    }

    /**
     * Sets the value of the measurementDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setMeasurementDeviceID(ObjectRef value) {
        this.measurementDeviceID = value;
    }

    /**
     * Gets the value of the measurementItems property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementItems }
     *     
     */
    public MeasurementItems getMeasurementItems() {
        return measurementItems;
    }

    /**
     * Sets the value of the measurementItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementItems }
     *     
     */
    public void setMeasurementItems(MeasurementItems value) {
        this.measurementItems = value;
    }

}
