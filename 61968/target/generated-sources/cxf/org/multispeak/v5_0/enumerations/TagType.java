
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The type of clearanceTag placed as part of a clearanceCertificate.
 * 
 * <p>Java class for tagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tagType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>tagKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagType", propOrder = {
    "value"
})
public class TagType {

    @XmlValue
    protected TagKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The kind of clearanceTag.  Enumerated values include: HoldOpen - this means that the device shall be maintained in the open position while the tag is in effect; HoldClosed - this means that the device shall be maintained in the closed position while the tag is in effect; Full - this means that no action is permitted to be taken on this device and no reporting is to be made; Information - this tag type is attached to include information on the device state, but that no inhibition is placed on the operation or reporting on the device; Control - this means that no control action is to be taken on the device, but reporting may be performed; Alarm - this means that alarming is to be suppressed while the tag is in effect; Scan - this means that scanning is to be inhibited while the tag is in effect; Other - system will provide a vendor-specific tagKind.
     * 
     * @return
     *     possible object is
     *     {@link TagKind }
     *     
     */
    public TagKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagKind }
     *     
     */
    public void setValue(TagKind value) {
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
