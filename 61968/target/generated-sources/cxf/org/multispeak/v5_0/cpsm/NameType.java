
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameTypeAuthority" type="{http://www.multispeak.org/V5.0/cpsm}NameTypeAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "nameString",
    "description",
    "nameTypeAuthority"
})
public class NameType {

    protected String nameString;
    protected String description;
    @XmlElement(name = "NameTypeAuthority")
    protected NameTypeAuthority nameTypeAuthority;

    /**
     * Gets the value of the nameString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameString() {
        return nameString;
    }

    /**
     * Sets the value of the nameString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameString(String value) {
        this.nameString = value;
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
     * Gets the value of the nameTypeAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeAuthority }
     *     
     */
    public NameTypeAuthority getNameTypeAuthority() {
        return nameTypeAuthority;
    }

    /**
     * Sets the value of the nameTypeAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeAuthority }
     *     
     */
    public void setNameTypeAuthority(NameTypeAuthority value) {
        this.nameTypeAuthority = value;
    }

}
