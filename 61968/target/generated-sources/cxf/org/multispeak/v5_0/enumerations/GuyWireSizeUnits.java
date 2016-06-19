
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Guy wire diameter units.
 * 
 * <p>Java class for guyWireSizeUnits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guyWireSizeUnits">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>guyWireSizeUnitKind">
 *       &lt;attribute name="otherKind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guyWireSizeUnits", propOrder = {
    "value"
})
public class GuyWireSizeUnits {

    @XmlValue
    protected GuyWireSizeUnitKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The units for measuring guy wire diameter.
     * 
     * @return
     *     possible object is
     *     {@link GuyWireSizeUnitKind }
     *     
     */
    public GuyWireSizeUnitKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuyWireSizeUnitKind }
     *     
     */
    public void setValue(GuyWireSizeUnitKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

}
