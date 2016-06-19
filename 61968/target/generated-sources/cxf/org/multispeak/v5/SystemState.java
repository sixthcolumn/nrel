
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ReplyCodeIdentifier;
import org.multispeak.v5_0.enumerations.MessageResultLevel;


/**
 * This is the payload of the unsolicited SystemStateNotification that can be used by an application to send system state or unsolicited errors to other systems.
 * 
 * <p>Java class for systemState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemState">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="resultIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}replyCodeIdentifier"/>
 *         &lt;element name="resultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.multispeak.org/V5.0/enumerations}messageResultLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemState", propOrder = {
    "resultIdentifier",
    "resultDescription",
    "level"
})
public class SystemState
    extends MspReferable
{

    @XmlElement(required = true)
    protected ReplyCodeIdentifier resultIdentifier;
    protected String resultDescription;
    protected MessageResultLevel level;

    /**
     * Gets the value of the resultIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyCodeIdentifier }
     *     
     */
    public ReplyCodeIdentifier getResultIdentifier() {
        return resultIdentifier;
    }

    /**
     * Sets the value of the resultIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyCodeIdentifier }
     *     
     */
    public void setResultIdentifier(ReplyCodeIdentifier value) {
        this.resultIdentifier = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MessageResultLevel }
     *     
     */
    public MessageResultLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResultLevel }
     *     
     */
    public void setLevel(MessageResultLevel value) {
        this.level = value;
    }

}
