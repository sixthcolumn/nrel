
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The name of the GIS coordinate system naming authority.  Examples include "SPCS" for U.S. State Plane Coordinate System, "EPSG" for the European Petroleum Survey Group, and "UTM" for the Universal Transverse Mercator.
 * 
 * <p>Java class for CSAuthorityName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSAuthorityName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/commonTypes>CSAuthorityNameKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSAuthorityName", propOrder = {
    "value"
})
public class CSAuthorityName {

    @XmlValue
    protected CSAuthorityNameKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CSAuthorityNameKind }
     *     
     */
    public CSAuthorityNameKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSAuthorityNameKind }
     *     
     */
    public void setValue(CSAuthorityNameKind value) {
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
