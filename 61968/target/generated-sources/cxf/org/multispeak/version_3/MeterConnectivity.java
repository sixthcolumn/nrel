
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for meterConnectivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConnectivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageRecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="servLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSubstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldFeeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPhase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="newSubstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newFeeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPhase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
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
@XmlType(name = "meterConnectivity", propOrder = {
    "outageRecordID",
    "eventTime",
    "servLoc",
    "meterNo",
    "oldSubstation",
    "oldFeeder",
    "oldPhase",
    "newSubstation",
    "newFeeder",
    "newPhase"
})
public class MeterConnectivity
    extends MspObject
{

    protected String outageRecordID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    protected String servLoc;
    protected String meterNo;
    protected String oldSubstation;
    protected String oldFeeder;
    protected PhaseCd oldPhase;
    protected String newSubstation;
    protected String newFeeder;
    protected PhaseCd newPhase;

    /**
     * Gets the value of the outageRecordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageRecordID() {
        return outageRecordID;
    }

    /**
     * Sets the value of the outageRecordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageRecordID(String value) {
        this.outageRecordID = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the servLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServLoc() {
        return servLoc;
    }

    /**
     * Sets the value of the servLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServLoc(String value) {
        this.servLoc = value;
    }

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
     * Gets the value of the oldSubstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSubstation() {
        return oldSubstation;
    }

    /**
     * Sets the value of the oldSubstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSubstation(String value) {
        this.oldSubstation = value;
    }

    /**
     * Gets the value of the oldFeeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldFeeder() {
        return oldFeeder;
    }

    /**
     * Sets the value of the oldFeeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldFeeder(String value) {
        this.oldFeeder = value;
    }

    /**
     * Gets the value of the oldPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getOldPhase() {
        return oldPhase;
    }

    /**
     * Sets the value of the oldPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setOldPhase(PhaseCd value) {
        this.oldPhase = value;
    }

    /**
     * Gets the value of the newSubstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSubstation() {
        return newSubstation;
    }

    /**
     * Sets the value of the newSubstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSubstation(String value) {
        this.newSubstation = value;
    }

    /**
     * Gets the value of the newFeeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFeeder() {
        return newFeeder;
    }

    /**
     * Sets the value of the newFeeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFeeder(String value) {
        this.newFeeder = value;
    }

    /**
     * Gets the value of the newPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getNewPhase() {
        return newPhase;
    }

    /**
     * Sets the value of the newPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setNewPhase(PhaseCd value) {
        this.newPhase = value;
    }

}
