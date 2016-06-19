
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherMeter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspMeter">
 *       &lt;sequence>
 *         &lt;element name="otherNameplate" type="{http://www.multispeak.org/Version_4.1_Release}otherNameplate" minOccurs="0"/>
 *         &lt;element name="otherLocationFields" type="{http://www.multispeak.org/Version_4.1_Release}otherLocationFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherMeter", propOrder = {
    "otherNameplate",
    "otherLocationFields"
})
public class OtherMeter
    extends MspMeter
{

    protected OtherNameplate otherNameplate;
    protected OtherLocationFields otherLocationFields;

    /**
     * Gets the value of the otherNameplate property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNameplate }
     *     
     */
    public OtherNameplate getOtherNameplate() {
        return otherNameplate;
    }

    /**
     * Sets the value of the otherNameplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNameplate }
     *     
     */
    public void setOtherNameplate(OtherNameplate value) {
        this.otherNameplate = value;
    }

    /**
     * Gets the value of the otherLocationFields property.
     * 
     * @return
     *     possible object is
     *     {@link OtherLocationFields }
     *     
     */
    public OtherLocationFields getOtherLocationFields() {
        return otherLocationFields;
    }

    /**
     * Sets the value of the otherLocationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLocationFields }
     *     
     */
    public void setOtherLocationFields(OtherLocationFields value) {
        this.otherLocationFields = value;
    }

}
