
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Extensions;
import org.multispeak.v5_0.commontypes.ExtensionsList;


/**
 * <p>Java class for TOUReading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOUReading">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/V5.0/commonTypes}extensionsList" minOccurs="0"/>
 *         &lt;element name="ratePeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="kWh" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kW" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="kWDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOUReading", propOrder = {
    "extensions",
    "extensionsList",
    "ratePeriod",
    "kWh",
    "kw",
    "kwDateTime"
})
public class TOUReading {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;
    protected BigInteger ratePeriod;
    protected Float kWh;
    @XmlElement(name = "kW")
    protected Float kw;
    @XmlElement(name = "kWDateTime")
    protected XMLGregorianCalendar kwDateTime;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRatePeriod(BigInteger value) {
        this.ratePeriod = value;
    }

    /**
     * Gets the value of the kWh property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getKWh() {
        return kWh;
    }

    /**
     * Sets the value of the kWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setKWh(Float value) {
        this.kWh = value;
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

}
