
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is a class of string identifer.  The identifier value for a data instance goes in the element that inherits from this complexType.  The identifierName is the commonly used MultiSpeak field name that would contain this identifier and the identifierLabel is the string value that would be displayed to a user.
 * 
 * <p>Java class for singleIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleIdentifier">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="identifierName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identifierLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleIdentifier", propOrder = {
    "value"
})
public class SingleIdentifier {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "identifierName", required = true)
    protected String identifierName;
    @XmlAttribute(name = "identifierLabel")
    protected String identifierLabel;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the identifierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierName() {
        return identifierName;
    }

    /**
     * Sets the value of the identifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierName(String value) {
        this.identifierName = value;
    }

    /**
     * Gets the value of the identifierLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierLabel() {
        return identifierLabel;
    }

    /**
     * Sets the value of the identifierLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierLabel(String value) {
        this.identifierLabel = value;
    }

}
