
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.NetworkModelRef;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.CutAction;


/**
 * This is an intentional separation in a primary distribution line that is typically used to sectionalize the line to partially restore an outage or as part of a switching procedure.
 * 
 * <p>Java class for cut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspSwitchingDevice">
 *       &lt;sequence>
 *         &lt;element name="lineSectionAffected" type="{http://www.multispeak.org/V5.0/commonTypes}networkModelRef" minOccurs="0"/>
 *         &lt;element name="cutAction" type="{http://www.multispeak.org/V5.0/enumerations}cutAction" minOccurs="0"/>
 *         &lt;element name="timeOfAction" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="switchingDeviceBankID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cut", propOrder = {
    "lineSectionAffected",
    "cutAction",
    "timeOfAction",
    "switchingDeviceBankID"
})
public class Cut
    extends MspSwitchingDevice
{

    protected NetworkModelRef lineSectionAffected;
    protected CutAction cutAction;
    protected XMLGregorianCalendar timeOfAction;
    protected ObjectID switchingDeviceBankID;

    /**
     * Gets the value of the lineSectionAffected property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkModelRef }
     *     
     */
    public NetworkModelRef getLineSectionAffected() {
        return lineSectionAffected;
    }

    /**
     * Sets the value of the lineSectionAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkModelRef }
     *     
     */
    public void setLineSectionAffected(NetworkModelRef value) {
        this.lineSectionAffected = value;
    }

    /**
     * Gets the value of the cutAction property.
     * 
     * @return
     *     possible object is
     *     {@link CutAction }
     *     
     */
    public CutAction getCutAction() {
        return cutAction;
    }

    /**
     * Sets the value of the cutAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutAction }
     *     
     */
    public void setCutAction(CutAction value) {
        this.cutAction = value;
    }

    /**
     * Gets the value of the timeOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfAction() {
        return timeOfAction;
    }

    /**
     * Sets the value of the timeOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfAction(XMLGregorianCalendar value) {
        this.timeOfAction = value;
    }

    /**
     * Gets the value of the switchingDeviceBankID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getSwitchingDeviceBankID() {
        return switchingDeviceBankID;
    }

    /**
     * Sets the value of the switchingDeviceBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setSwitchingDeviceBankID(ObjectID value) {
        this.switchingDeviceBankID = value;
    }

}
