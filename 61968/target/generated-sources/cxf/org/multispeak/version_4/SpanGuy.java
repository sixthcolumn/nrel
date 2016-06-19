
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spanGuy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spanGuy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspLineObject">
 *       &lt;sequence>
 *         &lt;element name="attachmentHeight" type="{http://www.multispeak.org/Version_4.1_Release}height" minOccurs="0"/>
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
@XmlType(name = "spanGuy", propOrder = {
    "attachmentHeight"
})
public class SpanGuy
    extends MspLineObject
{

    protected Height attachmentHeight;

    /**
     * Gets the value of the attachmentHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getAttachmentHeight() {
        return attachmentHeight;
    }

    /**
     * Sets the value of the attachmentHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setAttachmentHeight(Height value) {
        this.attachmentHeight = value;
    }

}
