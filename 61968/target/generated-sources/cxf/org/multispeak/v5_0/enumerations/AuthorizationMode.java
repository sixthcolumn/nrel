
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The means by which the recurring payment authorization was received.
 * 
 * <p>Java class for authorizationMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizationMode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>recurringPaymentAuthorizationModeKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationMode", propOrder = {
    "value"
})
public class AuthorizationMode {

    @XmlValue
    protected RecurringPaymentAuthorizationModeKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The means by which the recurring payment authorization was received.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentAuthorizationModeKind }
     *     
     */
    public RecurringPaymentAuthorizationModeKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentAuthorizationModeKind }
     *     
     */
    public void setValue(RecurringPaymentAuthorizationModeKind value) {
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
