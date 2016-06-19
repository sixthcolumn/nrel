
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A type name that would specify the purpose of the assembly variant used. The enumeration list includes: Unknown, PoleVar, WireVar, NeutVar, MiscVar, Var1, Var2, Var3, Var4 and Other.  A vendor may use any other value by choosing "Other" from this list and including the optional otherKind attribute, which SHALL be populated with the desired value. Only one variant may be used on a specific materialManagementAssembly.
 * 
 * <p>Java class for variantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variantType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>variantTypeKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variantType", propOrder = {
    "value"
})
public class VariantType {

    @XmlValue
    protected VariantTypeKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * A type name that would specify the purpose of the assembly variant used. The enumeration list includes: Unknown, PoleVar, WireVar, NeutVar, MiscVar, Var1, Var2, Var3, Var4 and Other.  A vendor may use any other value by choosing "Other" from this list and including the optional otherKind attribute, which SHALL be populated with the desired value. Only one variant may be used on a specific materialManagementAssembly.
     * 
     * @return
     *     possible object is
     *     {@link VariantTypeKind }
     *     
     */
    public VariantTypeKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantTypeKind }
     *     
     */
    public void setValue(VariantTypeKind value) {
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
