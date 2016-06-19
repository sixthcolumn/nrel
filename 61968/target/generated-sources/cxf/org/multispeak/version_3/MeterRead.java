
package org.multispeak.version_3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for meterRead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterRead">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="posKWh" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="negKWh" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="kW" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kVAr" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kWDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="momentaryOutages" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="momentaryEvents" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="sustainedOutages" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TOUReadings" type="{http://www.multispeak.org/Version_3.0}meterReadTOUReadings" minOccurs="0"/>
 *         &lt;element name="readingValues" type="{http://www.multispeak.org/Version_3.0}meterReadReadingValues" minOccurs="0"/>
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
@XmlType(name = "meterRead", propOrder = {
    "meterNo",
    "deviceID",
    "readingDate",
    "posKWh",
    "negKWh",
    "kw",
    "kvAr",
    "kwDateTime",
    "phase",
    "momentaryOutages",
    "momentaryEvents",
    "sustainedOutages",
    "touReadings",
    "readingValues"
})
public class MeterRead
    extends MspObject
{

    protected String meterNo;
    protected String deviceID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readingDate;
    protected BigInteger posKWh;
    protected BigInteger negKWh;
    @XmlElement(name = "kW")
    protected Float kw;
    @XmlElement(name = "kVAr")
    protected Float kvAr;
    @XmlElement(name = "kWDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar kwDateTime;
    protected PhaseCd phase;
    protected BigInteger momentaryOutages;
    protected BigInteger momentaryEvents;
    protected BigInteger sustainedOutages;
    @XmlElement(name = "TOUReadings")
    protected MeterReadTOUReadings touReadings;
    protected MeterReadReadingValues readingValues;

    /**
     * Gets the value of the meterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * Sets the value of the meterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNo(String value) {
        this.meterNo = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the readingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadingDate() {
        return readingDate;
    }

    /**
     * Sets the value of the readingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadingDate(XMLGregorianCalendar value) {
        this.readingDate = value;
    }

    /**
     * Gets the value of the posKWh property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosKWh() {
        return posKWh;
    }

    /**
     * Sets the value of the posKWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosKWh(BigInteger value) {
        this.posKWh = value;
    }

    /**
     * Gets the value of the negKWh property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNegKWh() {
        return negKWh;
    }

    /**
     * Sets the value of the negKWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNegKWh(BigInteger value) {
        this.negKWh = value;
    }

    /**
     * Gets the value of the kw property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKW() {
        return kw;
    }

    /**
     * Sets the value of the kw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKW(Float value) {
        this.kw = value;
    }

    /**
     * Gets the value of the kvAr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKVAr() {
        return kvAr;
    }

    /**
     * Sets the value of the kvAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKVAr(Float value) {
        this.kvAr = value;
    }

    /**
     * Gets the value of the kwDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKWDateTime() {
        return kwDateTime;
    }

    /**
     * Sets the value of the kwDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKWDateTime(XMLGregorianCalendar value) {
        this.kwDateTime = value;
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
     * Gets the value of the momentaryOutages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMomentaryOutages() {
        return momentaryOutages;
    }

    /**
     * Sets the value of the momentaryOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMomentaryOutages(BigInteger value) {
        this.momentaryOutages = value;
    }

    /**
     * Gets the value of the momentaryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMomentaryEvents() {
        return momentaryEvents;
    }

    /**
     * Sets the value of the momentaryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMomentaryEvents(BigInteger value) {
        this.momentaryEvents = value;
    }

    /**
     * Gets the value of the sustainedOutages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSustainedOutages() {
        return sustainedOutages;
    }

    /**
     * Sets the value of the sustainedOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSustainedOutages(BigInteger value) {
        this.sustainedOutages = value;
    }

    /**
     * Gets the value of the touReadings property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadTOUReadings }
     *     
     */
    public MeterReadTOUReadings getTOUReadings() {
        return touReadings;
    }

    /**
     * Sets the value of the touReadings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadTOUReadings }
     *     
     */
    public void setTOUReadings(MeterReadTOUReadings value) {
        this.touReadings = value;
    }

    /**
     * Gets the value of the readingValues property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadReadingValues }
     *     
     */
    public MeterReadReadingValues getReadingValues() {
        return readingValues;
    }

    /**
     * Sets the value of the readingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadReadingValues }
     *     
     */
    public void setReadingValues(MeterReadReadingValues value) {
        this.readingValues = value;
    }

}
