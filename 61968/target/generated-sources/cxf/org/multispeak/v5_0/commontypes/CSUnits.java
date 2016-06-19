
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This attribute carries the unit of measure for the defined coordinate system. Possible values are "Feet", "Meters", "USSurveyFeet", and "Other".  If the value "Other" is given, the units MUST be specified using the "otherKind" attribute.
 * 
 * <p>Java class for CSUnits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSUnits">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/commonTypes>CSUnitsKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSUnits", propOrder = {
    "value"
})
public class CSUnits {

    @XmlValue
    protected CSUnitsKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CSUnitsKind }
     *     
     */
    public CSUnitsKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSUnitsKind }
     *     
     */
    public void setValue(CSUnitsKind value) {
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
