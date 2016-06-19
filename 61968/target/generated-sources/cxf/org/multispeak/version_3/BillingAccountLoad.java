
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billingAccountLoad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingAccountLoad">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_3.0}eaLoc" minOccurs="0"/>
 *         &lt;element name="substation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCd" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="kwhUse" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="demand" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kvarDemand" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stLiteKwh" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revenueClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kwhAdj" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kwAdj" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="xfmrKva" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="gLCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mapLocation" type="{http://www.multispeak.org/Version_3.0}PointType" minOccurs="0"/>
 *         &lt;element name="gridLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "billingAccountLoad", propOrder = {
    "accountNumber",
    "eaLoc",
    "substation",
    "feeder",
    "phaseCd",
    "kwhUse",
    "demand",
    "hp",
    "kvarDemand",
    "stLiteKwh",
    "meterNo",
    "servType",
    "revenueClass",
    "kwhAdj",
    "kwAdj",
    "xfmrKva",
    "glCode",
    "zone",
    "mapLocation",
    "gridLocation"
})
public class BillingAccountLoad
    extends MspObject
{

    protected String accountNumber;
    protected EaLoc eaLoc;
    protected String substation;
    protected String feeder;
    protected PhaseCd phaseCd;
    protected Float kwhUse;
    protected Long demand;
    protected Float hp;
    protected Long kvarDemand;
    protected Long stLiteKwh;
    protected String meterNo;
    protected String servType;
    protected String revenueClass;
    protected Float kwhAdj;
    protected Long kwAdj;
    protected Long xfmrKva;
    @XmlElement(name = "gLCode")
    protected String glCode;
    protected String zone;
    protected PointType mapLocation;
    protected String gridLocation;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the eaLoc property.
     * 
     * @return
     *     possible object is
     *     {@link EaLoc }
     *     
     */
    public EaLoc getEaLoc() {
        return eaLoc;
    }

    /**
     * Sets the value of the eaLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaLoc }
     *     
     */
    public void setEaLoc(EaLoc value) {
        this.eaLoc = value;
    }

    /**
     * Gets the value of the substation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstation() {
        return substation;
    }

    /**
     * Sets the value of the substation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstation(String value) {
        this.substation = value;
    }

    /**
     * Gets the value of the feeder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeder() {
        return feeder;
    }

    /**
     * Sets the value of the feeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeder(String value) {
        this.feeder = value;
    }

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCd }
     *     
     */
    public PhaseCd getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCd }
     *     
     */
    public void setPhaseCd(PhaseCd value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the kwhUse property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwhUse() {
        return kwhUse;
    }

    /**
     * Sets the value of the kwhUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwhUse(Float value) {
        this.kwhUse = value;
    }

    /**
     * Gets the value of the demand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemand() {
        return demand;
    }

    /**
     * Sets the value of the demand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemand(Long value) {
        this.demand = value;
    }

    /**
     * Gets the value of the hp property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHp() {
        return hp;
    }

    /**
     * Sets the value of the hp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHp(Float value) {
        this.hp = value;
    }

    /**
     * Gets the value of the kvarDemand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKvarDemand() {
        return kvarDemand;
    }

    /**
     * Sets the value of the kvarDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKvarDemand(Long value) {
        this.kvarDemand = value;
    }

    /**
     * Gets the value of the stLiteKwh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStLiteKwh() {
        return stLiteKwh;
    }

    /**
     * Sets the value of the stLiteKwh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStLiteKwh(Long value) {
        this.stLiteKwh = value;
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
     * Gets the value of the servType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServType() {
        return servType;
    }

    /**
     * Sets the value of the servType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServType(String value) {
        this.servType = value;
    }

    /**
     * Gets the value of the revenueClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueClass() {
        return revenueClass;
    }

    /**
     * Sets the value of the revenueClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueClass(String value) {
        this.revenueClass = value;
    }

    /**
     * Gets the value of the kwhAdj property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKwhAdj() {
        return kwhAdj;
    }

    /**
     * Sets the value of the kwhAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKwhAdj(Float value) {
        this.kwhAdj = value;
    }

    /**
     * Gets the value of the kwAdj property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKwAdj() {
        return kwAdj;
    }

    /**
     * Sets the value of the kwAdj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKwAdj(Long value) {
        this.kwAdj = value;
    }

    /**
     * Gets the value of the xfmrKva property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getXfmrKva() {
        return xfmrKva;
    }

    /**
     * Sets the value of the xfmrKva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setXfmrKva(Long value) {
        this.xfmrKva = value;
    }

    /**
     * Gets the value of the glCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLCode() {
        return glCode;
    }

    /**
     * Sets the value of the glCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLCode(String value) {
        this.glCode = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the mapLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getMapLocation() {
        return mapLocation;
    }

    /**
     * Sets the value of the mapLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setMapLocation(PointType value) {
        this.mapLocation = value;
    }

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridLocation(String value) {
        this.gridLocation = value;
    }

}
