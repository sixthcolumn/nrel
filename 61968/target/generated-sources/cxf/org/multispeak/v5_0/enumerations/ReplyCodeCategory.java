
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * It is suggested that the values of replyCode be chosen from those values included in IEC 61968-9, 2nd Ed., Annex B as extended by Appendix A of "Security in MultiSpeak-Enabled Applications: Requirements".  Values of replyCode SHOULD be of the form [category] "." [index].
 * 
 * <p>Java class for replyCodeCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replyCodeCategory">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>replyCodeCategoryKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replyCodeCategory", propOrder = {
    "value"
})
public class ReplyCodeCategory {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * It is suggested that the values of replyCode be chosen from those values included in IEC 61968-9, 2nd Ed., Annex B as extended by Appendix A of "Security in MultiSpeak-Enabled Applications: Requirements".  Values of replyCode SHOULD be of the form [category] "." [index].
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
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
