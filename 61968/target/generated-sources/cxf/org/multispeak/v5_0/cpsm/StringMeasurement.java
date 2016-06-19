
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for StringMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringMeasurement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="stringMeasurementValue" type="{http://www.multispeak.org/V5.0/cpsm}StringMeasurementValue" minOccurs="0"/>
 *         &lt;element name="measurementTypeID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="measurementValueSourceID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "StringMeasurement", propOrder = {
    "stringMeasurementValue",
    "measurementTypeID",
    "measurementValueSourceID"
})
public class StringMeasurement
    extends MspCIMObject
{

    protected StringMeasurementValue stringMeasurementValue;
    protected ObjectID measurementTypeID;
    protected ObjectID measurementValueSourceID;

    /**
     * Gets the value of the stringMeasurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link StringMeasurementValue }
     *     
     */
    public StringMeasurementValue getStringMeasurementValue() {
        return stringMeasurementValue;
    }

    /**
     * Sets the value of the stringMeasurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMeasurementValue }
     *     
     */
    public void setStringMeasurementValue(StringMeasurementValue value) {
        this.stringMeasurementValue = value;
    }

    /**
     * Gets the value of the measurementTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMeasurementTypeID() {
        return measurementTypeID;
    }

    /**
     * Sets the value of the measurementTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMeasurementTypeID(ObjectID value) {
        this.measurementTypeID = value;
    }

    /**
     * Gets the value of the measurementValueSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMeasurementValueSourceID() {
        return measurementValueSourceID;
    }

    /**
     * Sets the value of the measurementValueSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMeasurementValueSourceID(ObjectID value) {
        this.measurementValueSourceID = value;
    }

}
