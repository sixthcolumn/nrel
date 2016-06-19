
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.GuyWireSizeUnitKind;


/**
 * <p>Java class for guyWireSize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guyWireSize">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="sizeUnits" type="{http://www.multispeak.org/V5.0/enumerations}guyWireSizeUnitKind" />
 *       &lt;attribute name="otherSizeUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guyWireSize", propOrder = {
    "value"
})
public class GuyWireSize {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "sizeUnits")
    protected GuyWireSizeUnitKind sizeUnits;
    @XmlAttribute(name = "otherSizeUnit")
    protected String otherSizeUnit;

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
     *     {@link GuyWireSizeUnitKind }
     *     
     */
    public GuyWireSizeUnitKind getSizeUnits() {
        return sizeUnits;
    }

    /**
     * Sets the value of the sizeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyWireSizeUnitKind }
     *     
     */
    public void setSizeUnits(GuyWireSizeUnitKind value) {
        this.sizeUnits = value;
    }

    /**
     * Gets the value of the otherSizeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSizeUnit() {
        return otherSizeUnit;
    }

    /**
     * Sets the value of the otherSizeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSizeUnit(String value) {
        this.otherSizeUnit = value;
    }

}
