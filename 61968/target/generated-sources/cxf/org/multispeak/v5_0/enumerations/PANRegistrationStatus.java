
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PANRegistrationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANRegistrationStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>PANRegistrationStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANRegistrationStatus", propOrder = {
    "value"
})
public class PANRegistrationStatus {

    @XmlValue
    protected PANRegistrationStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The status of a device's registration in a Premises Area Network. The set of states represent the progression of a device's pairing in the PAN. Note that the specific states supported is implementation dependent. For e.g. one implementation may only support "Registered" and "Disconnected" while another may support the full set of states.
     * 
     * @return
     *     possible object is
     *     {@link PANRegistrationStatusKind }
     *     
     */
    public PANRegistrationStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANRegistrationStatusKind }
     *     
     */
    public void setValue(PANRegistrationStatusKind value) {
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
