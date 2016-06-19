
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for network complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="network">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franchiseDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="substationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phaseCd" type="{http://www.multispeak.org/Version_3.0}phaseCd" minOccurs="0"/>
 *         &lt;element name="eaLoc" type="{http://www.multispeak.org/Version_3.0}eaLoc" minOccurs="0"/>
 *         &lt;element name="poleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="township" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedTransformer" type="{http://www.multispeak.org/Version_3.0}linkedTransformer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "network", propOrder = {
    "boardDist",
    "taxDist",
    "franchiseDist",
    "schoolDist",
    "district",
    "substationCode",
    "feeder",
    "phaseCd",
    "eaLoc",
    "poleNo",
    "section",
    "township",
    "range",
    "linkedTransformer"
})
public class Network {

    protected String boardDist;
    protected String taxDist;
    protected String franchiseDist;
    protected String schoolDist;
    protected String district;
    protected String substationCode;
    protected String feeder;
    protected PhaseCd phaseCd;
    protected EaLoc eaLoc;
    protected String poleNo;
    protected String section;
    protected String township;
    protected String range;
    protected LinkedTransformer linkedTransformer;

    /**
     * Gets the value of the boardDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardDist() {
        return boardDist;
    }

    /**
     * Sets the value of the boardDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardDist(String value) {
        this.boardDist = value;
    }

    /**
     * Gets the value of the taxDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDist() {
        return taxDist;
    }

    /**
     * Sets the value of the taxDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDist(String value) {
        this.taxDist = value;
    }

    /**
     * Gets the value of the franchiseDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchiseDist() {
        return franchiseDist;
    }

    /**
     * Sets the value of the franchiseDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchiseDist(String value) {
        this.franchiseDist = value;
    }

    /**
     * Gets the value of the schoolDist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDist() {
        return schoolDist;
    }

    /**
     * Sets the value of the schoolDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDist(String value) {
        this.schoolDist = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the substationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstationCode() {
        return substationCode;
    }

    /**
     * Sets the value of the substationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstationCode(String value) {
        this.substationCode = value;
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
     * Gets the value of the poleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoleNo() {
        return poleNo;
    }

    /**
     * Sets the value of the poleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoleNo(String value) {
        this.poleNo = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the township property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownship() {
        return township;
    }

    /**
     * Sets the value of the township property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownship(String value) {
        this.township = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the linkedTransformer property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedTransformer }
     *     
     */
    public LinkedTransformer getLinkedTransformer() {
        return linkedTransformer;
    }

    /**
     * Sets the value of the linkedTransformer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedTransformer }
     *     
     */
    public void setLinkedTransformer(LinkedTransformer value) {
        this.linkedTransformer = value;
    }

}
