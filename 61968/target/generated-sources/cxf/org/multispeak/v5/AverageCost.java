
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.multispeak.v5_0.enumerations.CurrencyCode;


/**
 * This is the average cost of usage during the period of interest, which is to be displayed on the customer's premises display device. The average cost shall be expressed in currency per commodity unit, for instance $/kWh.
 * 
 * <p>Java class for averageCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="averageCost">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="currencyCode" type="{http://www.multispeak.org/V5.0/enumerations}currencyCode" />
 *       &lt;attribute name="units" use="required" type="{http://www.multispeak.org/V5.0/enumerations}uomKind" />
 *       &lt;attribute name="otherUnits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "averageCost", propOrder = {
    "value"
})
public class AverageCost {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "currencyCode")
    protected CurrencyCode currencyCode;
    @XmlAttribute(name = "units", required = true)
    protected String units;
    @XmlAttribute(name = "otherUnits")
    protected String otherUnits;

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the otherUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherUnits() {
        return otherUnits;
    }

    /**
     * Sets the value of the otherUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherUnits(String value) {
        this.otherUnits = value;
    }

}
