
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.ExtType;


/**
 * This is an optional means to add self-describing extensions to any class that inherits from the mspObject.
 * 
 * <p>Java class for extensionsItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extensionsItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extValue" type="{http://www.multispeak.org/V5.0/commonTypes}extValue"/>
 *         &lt;element name="extType" type="{http://www.multispeak.org/V5.0/enumerations}extType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extensionsItem", propOrder = {
    "extName",
    "extValue",
    "extType"
})
public class ExtensionsItem {

    @XmlElement(required = true)
    protected String extName;
    @XmlElement(required = true)
    protected ExtValue extValue;
    protected ExtType extType;

    /**
     * Gets the value of the extName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtName() {
        return extName;
    }

    /**
     * Sets the value of the extName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtName(String value) {
        this.extName = value;
    }

    /**
     * Gets the value of the extValue property.
     * 
     * @return
     *     possible object is
     *     {@link ExtValue }
     *     
     */
    public ExtValue getExtValue() {
        return extValue;
    }

    /**
     * Sets the value of the extValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtValue }
     *     
     */
    public void setExtValue(ExtValue value) {
        this.extValue = value;
    }

    /**
     * Gets the value of the extType property.
     * 
     * @return
     *     possible object is
     *     {@link ExtType }
     *     
     */
    public ExtType getExtType() {
        return extType;
    }

    /**
     * Sets the value of the extType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtType }
     *     
     */
    public void setExtType(ExtType value) {
        this.extType = value;
    }

}
