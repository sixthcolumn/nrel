
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for measurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.multispeak.org/Version_3.0}uom" minOccurs="0"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/Version_3.0}qualityDescription" minOccurs="0"/>
 *         &lt;element name="timeSpan" type="{http://www.multispeak.org/Version_3.0}timeSpan" minOccurs="0"/>
 *         &lt;element name="stopTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="durationDescription" type="{http://www.multispeak.org/Version_3.0}durationDescription" minOccurs="0"/>
 *         &lt;element name="unitPrefix" type="{http://www.multispeak.org/Version_3.0}unitPrefix" minOccurs="0"/>
 *         &lt;element name="quadrant" type="{http://www.multispeak.org/Version_3.0}accountability" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="harmonic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measurementType", propOrder = {
    "dateTime",
    "value",
    "uom",
    "quality",
    "timeSpan",
    "stopTime",
    "durationDescription",
    "unitPrefix",
    "quadrant",
    "phase",
    "harmonic"
})
public class MeasurementType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected Float value;
    protected String uom;
    protected QualityDescription quality;
    protected TimeSpan timeSpan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopTime;
    protected DurationDescription durationDescription;
    protected UnitPrefix unitPrefix;
    protected Accountability quadrant;
    protected PhaseCd phase;
    protected Long harmonic;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDescription }
     *     
     */
    public QualityDescription getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDescription }
     *     
     */
    public void setQuality(QualityDescription value) {
        this.quality = value;
    }

    /**
     * Gets the value of the timeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setTimeSpan(TimeSpan value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the stopTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopTime() {
        return stopTime;
    }

    /**
     * Sets the value of the stopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopTime(XMLGregorianCalendar value) {
        this.stopTime = value;
    }

    /**
     * Gets the value of the durationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DurationDescription }
     *     
     */
    public DurationDescription getDurationDescription() {
        return durationDescription;
    }

    /**
     * Sets the value of the durationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationDescription }
     *     
     */
    public void setDurationDescription(DurationDescription value) {
        this.durationDescription = value;
    }

    /**
     * Gets the value of the unitPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrefix }
     *     
     */
    public UnitPrefix getUnitPrefix() {
        return unitPrefix;
    }

    /**
     * Sets the value of the unitPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrefix }
     *     
     */
    public void setUnitPrefix(UnitPrefix value) {
        this.unitPrefix = value;
    }

    /**
     * Gets the value of the quadrant property.
     * 
     * @return
     *     possible object is
     *     {@link Accountability }
     *     
     */
    public Accountability getQuadrant() {
        return quadrant;
    }

    /**
     * Sets the value of the quadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountability }
     *     
     */
    public void setQuadrant(Accountability value) {
        this.quadrant = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhase(PhaseCd value) {
        this.phase = value;
    }

    /**
     * Gets the value of the harmonic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHarmonic() {
        return harmonic;
    }

    /**
     * Sets the value of the harmonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHarmonic(Long value) {
        this.harmonic = value;
    }

}
