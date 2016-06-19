
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a property parcel as stored in a GIS.  Buildings on this parcel are stored as premises.
 * 
 * <p>Java class for parcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parcel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspPolygonObject">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="township" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premisesIDs" type="{http://www.multispeak.org/V5.0}premisesIDs" minOccurs="0"/>
 *         &lt;element name="premisesObjectList" type="{http://www.multispeak.org/V5.0}premisesObjectList" minOccurs="0"/>
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
@XmlType(name = "parcel", propOrder = {
    "description",
    "owner",
    "section",
    "township",
    "range",
    "legalDescription",
    "premisesIDs",
    "premisesObjectList"
})
public class Parcel
    extends MspPolygonObject
{

    protected String description;
    protected String owner;
    protected String section;
    protected String township;
    protected String range;
    protected String legalDescription;
    protected PremisesIDs premisesIDs;
    protected PremisesObjectList premisesObjectList;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
     * Gets the value of the legalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalDescription() {
        return legalDescription;
    }

    /**
     * Sets the value of the legalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalDescription(String value) {
        this.legalDescription = value;
    }

    /**
     * Gets the value of the premisesIDs property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesIDs }
     *     
     */
    public PremisesIDs getPremisesIDs() {
        return premisesIDs;
    }

    /**
     * Sets the value of the premisesIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesIDs }
     *     
     */
    public void setPremisesIDs(PremisesIDs value) {
        this.premisesIDs = value;
    }

    /**
     * Gets the value of the premisesObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesObjectList }
     *     
     */
    public PremisesObjectList getPremisesObjectList() {
        return premisesObjectList;
    }

    /**
     * Sets the value of the premisesObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesObjectList }
     *     
     */
    public void setPremisesObjectList(PremisesObjectList value) {
        this.premisesObjectList = value;
    }

}
