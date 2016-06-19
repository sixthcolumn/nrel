
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This object implements an accumulator, such as that in a SCADA system.
 * 
 * <p>Java class for accumulatedValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accumulatedValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="countedValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="ceilingValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="latchesAtMaximum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="measurementID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "accumulatedValue", propOrder = {
    "countedValue",
    "timeStamp",
    "ceilingValue",
    "latchesAtMaximum",
    "measurementID"
})
public class AccumulatedValue
    extends MspObject
{

    @XmlElement(required = true)
    protected BigInteger countedValue;
    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    protected BigInteger ceilingValue;
    protected Boolean latchesAtMaximum;
    protected ObjectID measurementID;

    /**
     * Gets the value of the countedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountedValue() {
        return countedValue;
    }

    /**
     * Sets the value of the countedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountedValue(BigInteger value) {
        this.countedValue = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the ceilingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCeilingValue() {
        return ceilingValue;
    }

    /**
     * Sets the value of the ceilingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCeilingValue(BigInteger value) {
        this.ceilingValue = value;
    }

    /**
     * Gets the value of the latchesAtMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatchesAtMaximum() {
        return latchesAtMaximum;
    }

    /**
     * Sets the value of the latchesAtMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatchesAtMaximum(Boolean value) {
        this.latchesAtMaximum = value;
    }

    /**
     * Gets the value of the measurementID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMeasurementID() {
        return measurementID;
    }

    /**
     * Sets the value of the measurementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMeasurementID(ObjectID value) {
        this.measurementID = value;
    }

}
