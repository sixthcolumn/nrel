
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a message payload for adding attachments to an outage data instance.
 * 
 * <p>Java class for outageAttachmentContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageAttachmentContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/V5.0}outageAttachments"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageAttachmentContainer", propOrder = {
    "outageRef",
    "attachments"
})
public class OutageAttachmentContainer
    extends MspReferable
{

    @XmlElement(required = true)
    protected OutageRef outageRef;
    @XmlElement(required = true)
    protected OutageAttachments attachments;

    /**
     * Gets the value of the outageRef property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRef }
     *     
     */
    public OutageRef getOutageRef() {
        return outageRef;
    }

    /**
     * Sets the value of the outageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRef }
     *     
     */
    public void setOutageRef(OutageRef value) {
        this.outageRef = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link OutageAttachments }
     *     
     */
    public OutageAttachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageAttachments }
     *     
     */
    public void setAttachments(OutageAttachments value) {
        this.attachments = value;
    }

}
