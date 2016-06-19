
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.PremisesDisplayMessageStatusType;
import org.multispeak.v5_0.enumerations.PremisesDisplayMessageType;


/**
 * <p>Java class for premisesDisplayMessageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplayMessageStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="messageID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="messageType" type="{http://www.multispeak.org/V5.0/enumerations}premisesDisplayMessageType"/>
 *         &lt;element name="messageStatus" type="{http://www.multispeak.org/V5.0/enumerations}premisesDisplayMessageStatusType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premisesDisplayMessageStatus", propOrder = {
    "panDeviceRef",
    "messageID",
    "messageType",
    "messageStatus"
})
public class PremisesDisplayMessageStatus
    extends MspReferable
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    @XmlElement(required = true)
    protected ObjectID messageID;
    @XmlElement(required = true)
    protected PremisesDisplayMessageType messageType;
    @XmlElement(required = true)
    protected PremisesDisplayMessageStatusType messageStatus;

    /**
     * Gets the value of the panDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link PANDeviceRef }
     *     
     */
    public PANDeviceRef getPANDeviceRef() {
        return panDeviceRef;
    }

    /**
     * Sets the value of the panDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PANDeviceRef }
     *     
     */
    public void setPANDeviceRef(PANDeviceRef value) {
        this.panDeviceRef = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setMessageID(ObjectID value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplayMessageType }
     *     
     */
    public PremisesDisplayMessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplayMessageType }
     *     
     */
    public void setMessageType(PremisesDisplayMessageType value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PremisesDisplayMessageStatusType }
     *     
     */
    public PremisesDisplayMessageStatusType getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremisesDisplayMessageStatusType }
     *     
     */
    public void setMessageStatus(PremisesDisplayMessageStatusType value) {
        this.messageStatus = value;
    }

}
