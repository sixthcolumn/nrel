
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.CalculationMethod;
import org.multispeak.v5_0.enumerations.VariantType;


/**
 * This is a variable that describes acceptable options for the materialComponents used to create a specific assembly. 
 * 
 * <p>Java class for variant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="variantValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variantType" type="{http://www.multispeak.org/V5.0/enumerations}variantType"/>
 *         &lt;element name="calculationMethod" type="{http://www.multispeak.org/V5.0/enumerations}calculationMethod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variant", propOrder = {
    "variantValue",
    "variantType",
    "calculationMethod"
})
public class Variant
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String variantValue;
    @XmlElement(required = true)
    protected VariantType variantType;
    protected CalculationMethod calculationMethod;

    /**
     * Gets the value of the variantValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantValue() {
        return variantValue;
    }

    /**
     * Sets the value of the variantValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantValue(String value) {
        this.variantValue = value;
    }

    /**
     * Gets the value of the variantType property.
     * 
     * @return
     *     possible object is
     *     {@link VariantType }
     *     
     */
    public VariantType getVariantType() {
        return variantType;
    }

    /**
     * Sets the value of the variantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantType }
     *     
     */
    public void setVariantType(VariantType value) {
        this.variantType = value;
    }

    /**
     * Gets the value of the calculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethod }
     *     
     */
    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

    /**
     * Sets the value of the calculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethod }
     *     
     */
    public void setCalculationMethod(CalculationMethod value) {
        this.calculationMethod = value;
    }

}
