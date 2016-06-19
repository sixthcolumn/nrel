
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.ReplyCodeCategory;


/**
 * <p>Java class for replyCodeIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replyCodeIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replyCodeCategory" type="{http://www.multispeak.org/V5.0/enumerations}replyCodeCategory"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replyCodeIdentifier", propOrder = {
    "replyCodeCategory",
    "index"
})
public class ReplyCodeIdentifier {

    @XmlElement(required = true)
    protected ReplyCodeCategory replyCodeCategory;
    @XmlElement(required = true)
    protected String index;

    /**
     * Gets the value of the replyCodeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyCodeCategory }
     *     
     */
    public ReplyCodeCategory getReplyCodeCategory() {
        return replyCodeCategory;
    }

    /**
     * Sets the value of the replyCodeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyCodeCategory }
     *     
     */
    public void setReplyCodeCategory(ReplyCodeCategory value) {
        this.replyCodeCategory = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
