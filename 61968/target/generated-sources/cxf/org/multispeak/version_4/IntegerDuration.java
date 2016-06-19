
package org.multispeak.version_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for integerDuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="integerDuration">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *       &lt;attribute name="timeUnits" type="{http://www.multispeak.org/Version_4.1_Release}timeUnits" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "integerDuration", propOrder = {
    "value"
})
public class IntegerDuration {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "timeUnits")
    protected TimeUnits timeUnits;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the timeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnits }
     *     
     */
    public TimeUnits getTimeUnits() {
        return timeUnits;
    }

    /**
     * Sets the value of the timeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnits }
     *     
     */
    public void setTimeUnits(TimeUnits value) {
        this.timeUnits = value;
    }

}
