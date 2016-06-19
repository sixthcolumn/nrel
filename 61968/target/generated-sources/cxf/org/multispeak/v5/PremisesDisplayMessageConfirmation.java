
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.PremisesDisplayMessageType;


/**
 * <p>Java class for premisesDisplayMessageConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesDisplayMessageConfirmation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="PANDeviceRef" type="{http://www.multispeak.org/V5.0}PANDeviceRef"/>
 *         &lt;element name="premisesDisplayMessageID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="messageType" type="{http://www.multispeak.org/V5.0/enumerations}premisesDisplayMessageType"/>
 *         &lt;element name="messageConfirmedTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premisesDisplayMessageConfirmation", propOrder = {
    "panDeviceRef",
    "premisesDisplayMessageID",
    "messageType",
    "messageConfirmedTime"
})
public class PremisesDisplayMessageConfirmation
    extends MspReferable
{

    @XmlElement(name = "PANDeviceRef", required = true)
    protected PANDeviceRef panDeviceRef;
    @XmlElement(required = true)
    protected ObjectID premisesDisplayMessageID;
    @XmlElement(required = true)
    protected PremisesDisplayMessageType messageType;
    protected XMLGregorianCalendar messageConfirmedTime;

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
     * Gets the value of the premisesDisplayMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getPremisesDisplayMessageID() {
        return premisesDisplayMessageID;
    }

    /**
     * Sets the value of the premisesDisplayMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setPremisesDisplayMessageID(ObjectID value) {
        this.premisesDisplayMessageID = value;
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
     * Gets the value of the messageConfirmedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageConfirmedTime() {
        return messageConfirmedTime;
    }

    /**
     * Sets the value of the messageConfirmedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageConfirmedTime(XMLGregorianCalendar value) {
        this.messageConfirmedTime = value;
    }

}
