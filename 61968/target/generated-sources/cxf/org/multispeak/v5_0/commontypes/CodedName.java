
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an abbreviation for a part of a fully-qualified object identifier of the form GlobalDomain.RegisteredName.SystemName.nounType.objectGUID
 * 
 * <p>Java class for codedName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codedName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codedValue" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString"/>
 *         &lt;element name="namePart" type="{http://www.multispeak.org/V5.0/primitives}alphaNumericRestrictedString"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codedNameType" type="{http://www.multispeak.org/V5.0/commonTypes}codedNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codedName", propOrder = {
    "codedValue",
    "namePart",
    "description"
})
public class CodedName {

    @XmlElement(required = true)
    protected String codedValue;
    @XmlElement(required = true)
    protected String namePart;
    protected String description;
    @XmlAttribute(name = "codedNameType")
    protected CodedNameType codedNameType;

    /**
     * Gets the value of the codedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedValue() {
        return codedValue;
    }

    /**
     * Sets the value of the codedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedValue(String value) {
        this.codedValue = value;
    }

    /**
     * Gets the value of the namePart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePart() {
        return namePart;
    }

    /**
     * Sets the value of the namePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePart(String value) {
        this.namePart = value;
    }

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
     * Gets the value of the codedNameType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedNameType }
     *     
     */
    public CodedNameType getCodedNameType() {
        return codedNameType;
    }

    /**
     * Sets the value of the codedNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedNameType }
     *     
     */
    public void setCodedNameType(CodedNameType value) {
        this.codedNameType = value;
    }

}
