
package org.multispeak.v5_0.commontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is here for future CIM harmonization.  It is not expeted that this schedule structure will be used in MultiSpeak scheduling applications
 * 
 * <p>Java class for cimTimePoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cimTimePoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absoluteTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="relativeTimeInterval" type="{http://www.multispeak.org/V5.0/commonTypes}duration" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="window" type="{http://www.multispeak.org/V5.0/commonTypes}timePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cimTimePoints", propOrder = {
    "absoluteTime",
    "relativeTimeInterval",
    "sequenceNumber",
    "window"
})
public class CimTimePoints {

    protected XMLGregorianCalendar absoluteTime;
    protected Duration relativeTimeInterval;
    protected BigInteger sequenceNumber;
    protected TimePeriod window;

    /**
     * Gets the value of the absoluteTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteTime() {
        return absoluteTime;
    }

    /**
     * Sets the value of the absoluteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteTime(XMLGregorianCalendar value) {
        this.absoluteTime = value;
    }

    /**
     * Gets the value of the relativeTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRelativeTimeInterval() {
        return relativeTimeInterval;
    }

    /**
     * Sets the value of the relativeTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRelativeTimeInterval(Duration value) {
        this.relativeTimeInterval = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setWindow(TimePeriod value) {
        this.window = value;
    }

}
