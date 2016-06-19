
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transformer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="facilityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kva" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="xfmrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phases" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="impedance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nLLoss" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fLLoss" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priVoltsLo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priVoltsHi" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="secVoltsLo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="secVoltsHi" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="mfgDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="pcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eaEquipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcbTestList" type="{http://www.multispeak.org/Version_3.0}pcbTestList" minOccurs="0"/>
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
@XmlType(name = "transformer", propOrder = {
    "facilityID",
    "manufacturer",
    "serialNumber",
    "kva",
    "xfmrType",
    "status",
    "phases",
    "phase",
    "impedance",
    "nlLoss",
    "flLoss",
    "price",
    "priVoltsLo",
    "priVoltsHi",
    "secVoltsLo",
    "secVoltsHi",
    "mfgDate",
    "pcb",
    "eaEquipment",
    "pcbTestList"
})
public class Transformer
    extends MspObject
{

    protected String facilityID;
    protected String manufacturer;
    protected String serialNumber;
    protected Float kva;
    protected String xfmrType;
    protected String status;
    protected Long phases;
    protected PhaseCd phase;
    protected Float impedance;
    @XmlElement(name = "nLLoss")
    protected Float nlLoss;
    @XmlElement(name = "fLLoss")
    protected Float flLoss;
    protected Float price;
    protected Float priVoltsLo;
    protected Float priVoltsHi;
    protected Float secVoltsLo;
    protected Float secVoltsHi;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mfgDate;
    protected String pcb;
    protected String eaEquipment;
    protected PcbTestList pcbTestList;

    /**
     * Gets the value of the facilityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Sets the value of the facilityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the kva property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKva() {
        return kva;
    }

    /**
     * Sets the value of the kva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKva(Float value) {
        this.kva = value;
    }

    /**
     * Gets the value of the xfmrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfmrType() {
        return xfmrType;
    }

    /**
     * Sets the value of the xfmrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfmrType(String value) {
        this.xfmrType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhases(Long value) {
        this.phases = value;
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
     * Gets the value of the impedance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImpedance() {
        return impedance;
    }

    /**
     * Sets the value of the impedance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImpedance(Float value) {
        this.impedance = value;
    }

    /**
     * Gets the value of the nlLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNLLoss() {
        return nlLoss;
    }

    /**
     * Sets the value of the nlLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNLLoss(Float value) {
        this.nlLoss = value;
    }

    /**
     * Gets the value of the flLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFLLoss() {
        return flLoss;
    }

    /**
     * Sets the value of the flLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFLLoss(Float value) {
        this.flLoss = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrice(Float value) {
        this.price = value;
    }

    /**
     * Gets the value of the priVoltsLo property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriVoltsLo() {
        return priVoltsLo;
    }

    /**
     * Sets the value of the priVoltsLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriVoltsLo(Float value) {
        this.priVoltsLo = value;
    }

    /**
     * Gets the value of the priVoltsHi property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPriVoltsHi() {
        return priVoltsHi;
    }

    /**
     * Sets the value of the priVoltsHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPriVoltsHi(Float value) {
        this.priVoltsHi = value;
    }

    /**
     * Gets the value of the secVoltsLo property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecVoltsLo() {
        return secVoltsLo;
    }

    /**
     * Sets the value of the secVoltsLo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecVoltsLo(Float value) {
        this.secVoltsLo = value;
    }

    /**
     * Gets the value of the secVoltsHi property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecVoltsHi() {
        return secVoltsHi;
    }

    /**
     * Sets the value of the secVoltsHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecVoltsHi(Float value) {
        this.secVoltsHi = value;
    }

    /**
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMfgDate(XMLGregorianCalendar value) {
        this.mfgDate = value;
    }

    /**
     * Gets the value of the pcb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcb() {
        return pcb;
    }

    /**
     * Sets the value of the pcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcb(String value) {
        this.pcb = value;
    }

    /**
     * Gets the value of the eaEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEaEquipment() {
        return eaEquipment;
    }

    /**
     * Sets the value of the eaEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEaEquipment(String value) {
        this.eaEquipment = value;
    }

    /**
     * Gets the value of the pcbTestList property.
     * 
     * @return
     *     possible object is
     *     {@link PcbTestList }
     *     
     */
    public PcbTestList getPcbTestList() {
        return pcbTestList;
    }

    /**
     * Sets the value of the pcbTestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcbTestList }
     *     
     */
    public void setPcbTestList(PcbTestList value) {
        this.pcbTestList = value;
    }

}
