
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.SizeUnits;


/**
 * <p>Java class for conductorSize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conductorSize">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="sizeUnits" use="required" type="{http://www.multispeak.org/V5.0/enumerations}sizeUnits" />
 *       &lt;attribute name="otherSizeUnits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conductorSize", propOrder = {
    "value"
})
public class ConductorSize {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "sizeUnits", required = true)
    protected SizeUnits sizeUnits;
    @XmlAttribute(name = "otherSizeUnits")
    protected String otherSizeUnits;

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
     * Gets the value of the sizeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnits }
     *     
     */
    public SizeUnits getSizeUnits() {
        return sizeUnits;
    }

    /**
     * Sets the value of the sizeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnits }
     *     
     */
    public void setSizeUnits(SizeUnits value) {
        this.sizeUnits = value;
    }

    /**
     * Gets the value of the otherSizeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSizeUnits() {
        return otherSizeUnits;
    }

    /**
     * Sets the value of the otherSizeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSizeUnits(String value) {
        this.otherSizeUnits = value;
    }

}
