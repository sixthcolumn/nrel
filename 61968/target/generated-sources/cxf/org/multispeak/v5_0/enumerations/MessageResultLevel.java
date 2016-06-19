
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for messageResultLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageResultLevel">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>messageResultLevelKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageResultLevel", propOrder = {
    "value"
})
public class MessageResultLevel {

    @XmlValue
    protected MessageResultLevelKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * It is suggested that the values of replyCode be chosen from those values included in IEC 61968-9, 2nd Ed., Annex B as extended by Appendix A of "Security in MultiSpeak-Enabled Applications: Requirements".  Values of replyCode SHOULD be of the form [category] "." [index].
     * 
     * @return
     *     possible object is
     *     {@link MessageResultLevelKind }
     *     
     */
    public MessageResultLevelKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResultLevelKind }
     *     
     */
    public void setValue(MessageResultLevelKind value) {
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
