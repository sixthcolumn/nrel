
package org.multispeak.v5;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.multispeak.v5_0.enumerations.CurrencyCode;


/**
 * This is the rate for sale of a commodity. For instance, if the current rate for electrical energy is $0.10/kWh, then the float value 0.10 is carried in the rate base element and the optional attributes currency code would carry "USD" for dollars, the commodityUnits would carry "kWh", and the rateDescription would carry "Current".
 * 
 * <p>Java class for rateComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateComponent">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>floatType">
 *       &lt;attribute name="currencyCode" type="{http://www.multispeak.org/V5.0/enumerations}currencyCode" />
 *       &lt;attribute name="commodityUnits" type="{http://www.multispeak.org/V5.0/enumerations}uomKind" />
 *       &lt;attribute name="rateComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateComponent", propOrder = {
    "value"
})
@XmlSeeAlso({
    Charge.class
})
public class RateComponent {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "currencyCode")
    protected CurrencyCode currencyCode;
    @XmlAttribute(name = "commodityUnits")
    protected String commodityUnits;
    @XmlAttribute(name = "rateComponentDescription")
    protected String rateComponentDescription;
    @XmlAttribute(name = "rateCode")
    protected String rateCode;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the commodityUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityUnits() {
        return commodityUnits;
    }

    /**
     * Sets the value of the commodityUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityUnits(String value) {
        this.commodityUnits = value;
    }

    /**
     * Gets the value of the rateComponentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateComponentDescription() {
        return rateComponentDescription;
    }

    /**
     * Sets the value of the rateComponentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateComponentDescription(String value) {
        this.rateComponentDescription = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
