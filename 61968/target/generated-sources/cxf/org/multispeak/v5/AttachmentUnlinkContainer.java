
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for attachmentUnlinkContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachmentUnlinkContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="objectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="attachmentIDs" type="{http://www.multispeak.org/V5.0}attachmentIDs"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachmentUnlinkContainer", propOrder = {
    "objectRef",
    "attachmentIDs"
})
public class AttachmentUnlinkContainer
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectRef objectRef;
    @XmlElement(required = true)
    protected AttachmentIDs attachmentIDs;

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setObjectRef(ObjectRef value) {
        this.objectRef = value;
    }

    /**
     * Gets the value of the attachmentIDs property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentIDs }
     *     
     */
    public AttachmentIDs getAttachmentIDs() {
        return attachmentIDs;
    }

    /**
     * Sets the value of the attachmentIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentIDs }
     *     
     */
    public void setAttachmentIDs(AttachmentIDs value) {
        this.attachmentIDs = value;
    }

}
