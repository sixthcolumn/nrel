
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A naming authority for GIS coordinate systems.
 * 
 * <p>Java class for CSAuthority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSAuthority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSAuthorityName" type="{http://www.multispeak.org/V5.0/commonTypes}CSAuthorityName"/>
 *         &lt;element name="CoordinateSystemAuthorityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSAuthority", propOrder = {
    "csAuthorityName",
    "coordinateSystemAuthorityCode",
    "datum"
})
public class CSAuthority {

    @XmlElement(name = "CSAuthorityName", required = true)
    protected CSAuthorityName csAuthorityName;
    @XmlElement(name = "CoordinateSystemAuthorityCode", required = true)
    protected String coordinateSystemAuthorityCode;
    @XmlElement(name = "Datum", required = true)
    protected String datum;

    /**
     * Gets the value of the csAuthorityName property.
     * 
     * @return
     *     possible object is
     *     {@link CSAuthorityName }
     *     
     */
    public CSAuthorityName getCSAuthorityName() {
        return csAuthorityName;
    }

    /**
     * Sets the value of the csAuthorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSAuthorityName }
     *     
     */
    public void setCSAuthorityName(CSAuthorityName value) {
        this.csAuthorityName = value;
    }

    /**
     * Gets the value of the coordinateSystemAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateSystemAuthorityCode() {
        return coordinateSystemAuthorityCode;
    }

    /**
     * Sets the value of the coordinateSystemAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateSystemAuthorityCode(String value) {
        this.coordinateSystemAuthorityCode = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

}
