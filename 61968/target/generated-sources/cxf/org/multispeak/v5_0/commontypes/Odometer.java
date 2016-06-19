
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.LengthUnits;
import org.multispeak.v5_0.enumerations.OdometerReadingType;


/**
 * Odometer reading.
 * 
 * <p>Java class for odometer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odometer">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="odometerReadingType" type="{http://www.multispeak.org/V5.0/enumerations}odometerReadingType" />
 *       &lt;attribute name="otherOdometerReadingType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="units" type="{http://www.multispeak.org/V5.0/enumerations}lengthUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odometer", propOrder = {
    "value"
})
public class Odometer {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "odometerReadingType")
    protected OdometerReadingType odometerReadingType;
    @XmlAttribute(name = "otherOdometerReadingType")
    protected String otherOdometerReadingType;
    @XmlAttribute(name = "units")
    protected LengthUnits units;

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the odometerReadingType property.
     * 
     * @return
     *     possible object is
     *     {@link OdometerReadingType }
     *     
     */
    public OdometerReadingType getOdometerReadingType() {
        return odometerReadingType;
    }

    /**
     * Sets the value of the odometerReadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdometerReadingType }
     *     
     */
    public void setOdometerReadingType(OdometerReadingType value) {
        this.odometerReadingType = value;
    }

    /**
     * Gets the value of the otherOdometerReadingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOdometerReadingType() {
        return otherOdometerReadingType;
    }

    /**
     * Sets the value of the otherOdometerReadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOdometerReadingType(String value) {
        this.otherOdometerReadingType = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnits }
     *     
     */
    public LengthUnits getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnits }
     *     
     */
    public void setUnits(LengthUnits value) {
        this.units = value;
    }

}
