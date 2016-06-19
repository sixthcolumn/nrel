
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MeterID;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.commontypes.ServicePointID;
import org.multispeak.v5_0.commontypes.SubstationRef;
import org.multispeak.v5_0.enumerations.PhaseCode;


/**
 * This class shows changes in the connectivity path for an electric meter that is due to a rephasing or back feed operation.
 * 
 * <p>Java class for meterConnectivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConnectivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="outageRef" type="{http://www.multispeak.org/V5.0}outageRef" minOccurs="0"/>
 *         &lt;element name="eventTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.multispeak.org/V5.0/commonTypes}meterID" minOccurs="0"/>
 *         &lt;element name="oldSubstationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="oldFeederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="oldPhase" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *         &lt;element name="newSubstationRef" type="{http://www.multispeak.org/V5.0/commonTypes}substationRef" minOccurs="0"/>
 *         &lt;element name="newFeederRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="newPhase" type="{http://www.multispeak.org/V5.0/enumerations}phaseCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterConnectivity", propOrder = {
    "outageRef",
    "eventTime",
    "serviceLocationID",
    "servicePointID",
    "meterID",
    "oldSubstationRef",
    "oldFeederRef",
    "oldPhase",
    "newSubstationRef",
    "newFeederRef",
    "newPhase"
})
public class MeterConnectivity
    extends MspReferable
{

    protected OutageRef outageRef;
    protected XMLGregorianCalendar eventTime;
    protected ObjectID serviceLocationID;
    protected ServicePointID servicePointID;
    protected MeterID meterID;
    protected SubstationRef oldSubstationRef;
    protected ObjectRef oldFeederRef;
    protected PhaseCode oldPhase;
    protected SubstationRef newSubstationRef;
    protected ObjectRef newFeederRef;
    protected PhaseCode newPhase;

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
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the servicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getServicePointID() {
        return servicePointID;
    }

    /**
     * Sets the value of the servicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setServicePointID(ServicePointID value) {
        this.servicePointID = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link MeterID }
     *     
     */
    public MeterID getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterID }
     *     
     */
    public void setMeterID(MeterID value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the oldSubstationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubstationRef }
     *     
     */
    public SubstationRef getOldSubstationRef() {
        return oldSubstationRef;
    }

    /**
     * Sets the value of the oldSubstationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstationRef }
     *     
     */
    public void setOldSubstationRef(SubstationRef value) {
        this.oldSubstationRef = value;
    }

    /**
     * Gets the value of the oldFeederRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getOldFeederRef() {
        return oldFeederRef;
    }

    /**
     * Sets the value of the oldFeederRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setOldFeederRef(ObjectRef value) {
        this.oldFeederRef = value;
    }

    /**
     * Gets the value of the oldPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getOldPhase() {
        return oldPhase;
    }

    /**
     * Sets the value of the oldPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setOldPhase(PhaseCode value) {
        this.oldPhase = value;
    }

    /**
     * Gets the value of the newSubstationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubstationRef }
     *     
     */
    public SubstationRef getNewSubstationRef() {
        return newSubstationRef;
    }

    /**
     * Sets the value of the newSubstationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstationRef }
     *     
     */
    public void setNewSubstationRef(SubstationRef value) {
        this.newSubstationRef = value;
    }

    /**
     * Gets the value of the newFeederRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getNewFeederRef() {
        return newFeederRef;
    }

    /**
     * Sets the value of the newFeederRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setNewFeederRef(ObjectRef value) {
        this.newFeederRef = value;
    }

    /**
     * Gets the value of the newPhase property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCode }
     *     
     */
    public PhaseCode getNewPhase() {
        return newPhase;
    }

    /**
     * Sets the value of the newPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCode }
     *     
     */
    public void setNewPhase(PhaseCode value) {
        this.newPhase = value;
    }

}
