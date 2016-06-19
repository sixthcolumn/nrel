
package ch.iec.tc57._2011.enddevicecontrols;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * PAN action/command used to issue the displaying of
 * 				text messages on PAN devices.
 * 
 * <p>Java class for PanDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanDisplay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iec.ch/TC57/2011/EndDeviceControls#}EndDeviceAction">
 *       &lt;sequence>
 *         &lt;element name="confirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transmissionMode" type="{http://iec.ch/TC57/2011/EndDeviceControls#}TransmissionModeKind" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanDisplay", propOrder = {
    "confirmationRequired",
    "priority",
    "textMessage",
    "transmissionMode"
})
public class PanDisplay
    extends EndDeviceAction
{

    protected Boolean confirmationRequired;
    protected String priority;
    protected String textMessage;
    protected TransmissionModeKind transmissionMode;

    /**
     * Gets the value of the confirmationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * Sets the value of the confirmationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmationRequired(Boolean value) {
        this.confirmationRequired = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the textMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextMessage() {
        return textMessage;
    }

    /**
     * Sets the value of the textMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextMessage(String value) {
        this.textMessage = value;
    }

    /**
     * Gets the value of the transmissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link TransmissionModeKind }
     *     
     */
    public TransmissionModeKind getTransmissionMode() {
        return transmissionMode;
    }

    /**
     * Sets the value of the transmissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionModeKind }
     *     
     */
    public void setTransmissionMode(TransmissionModeKind value) {
        this.transmissionMode = value;
    }

}
