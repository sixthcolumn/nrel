
package org.multispeak.version_4;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import _1_release.cpsm_v4.IdentifiedObject;


/**
 * <p>Java class for mspObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/Version_4.1_Release}extensions" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfExtensionsItem" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifiedObject" type="{cpsm_V4.1_Release}IdentifiedObject" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objectID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verb" type="{http://www.multispeak.org/Version_4.1_Release}action" default="Change" />
 *       &lt;attribute name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="replaceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="utility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspObject", propOrder = {
    "extensions",
    "comments",
    "extensionsList",
    "objectName",
    "identifiedObject"
})
@XmlSeeAlso({
    Meters.class,
    EndDeviceShipment.class,
    InHomeDisplayGroup.class,
    BilledUsage.class,
    Account.class,
    CDState.class,
    MeterExchanges.class,
    MeterEventList.class,
    Usage.class,
    PpmLocation.class,
    CDStateChange.class,
    MeterGroups.class,
    Project.class,
    PpmBalanceAdjustment.class,
    WaterService.class,
    SubstationLoadControlStatus.class,
    ScadaStatus.class,
    Unassignment.class,
    ChargeableDeviceList.class,
    DemandResponseEvent.class,
    WorkStatus.class,
    ElectricService.class,
    MeterReading.class,
    WorkRequest.class,
    BillingDetail.class,
    ScadaPoints.class,
    ReadingObject.class,
    PropaneService.class,
    Assessment.class,
    MeterReadingC1219 .class,
    ElectricMeterExchange.class,
    Capability.class,
    Vehicle.class,
    CallBackList.class,
    OutageEventStatus.class,
    LoadManagementEvent.class,
    MaterialManagementAssembly.class,
    AVLPosition.class,
    ZigBeePublishPrice.class,
    AssociatedMeters.class,
    MspMultiGeometryObject.class,
    ZigBeeDisplayMessage.class,
    Tender.class,
    MspLoadGroup.class,
    Equipment.class,
    ConnectDisconnectEvent.class,
    ReadingType.class,
    Capacitor.class,
    MspPerson.class,
    Assignment.class,
    ChargeableDevice.class,
    ProfileObject.class,
    CircuitElement.class,
    PayableItem.class,
    WorkOrderSelection.class,
    SwitchingOrder.class,
    OutageDetectionEvent.class,
    FeederObject.class,
    BackgroundGraphics.class,
    LaborCategory.class,
    GasMeterExchange.class,
    ServiceOrder.class,
    CrewActionEvent.class,
    PpmMeterExchange.class,
    GroupAssignment.class,
    CustomersAffectedByOutage.class,
    OutageDurationEvent.class,
    Anchor.class,
    FormattedBlockTemplate.class,
    HistoryLog.class,
    MaterialItem.class,
    InHomeDisplayBillingMessage.class,
    MspPolygonObject.class,
    PowerMonitor.class,
    WorkTask.class,
    OutageDetectionLog.class,
    MaintenanceDataSet.class,
    SwitchingSchedule.class,
    WaterMeterExchange.class,
    LoggedOutageDetectionEvent.class,
    Measurement.class,
    MspAlarm.class,
    AVLState.class,
    PowerFactorManagementEvent.class,
    Substation.class,
    Message.class,
    MeterGroup.class,
    MspSwitchingDevice.class,
    BillingAccountLoad.class,
    OutageReasonContainer.class,
    OtherService.class,
    MaintenanceOrder.class,
    Regulator.class,
    WorkOrder.class,
    PropaneMeterExchange.class,
    Crew.class,
    WorkTicket.class,
    CustomersAttachedToDevice.class,
    CustomerCall.class,
    Design.class,
    OutageLocation.class,
    TaskAggregation.class,
    ZigBeeCancelLoadControlEvent.class,
    Resource.class,
    AccumulatedValue.class,
    OutageReasonCodeList.class,
    Content.class,
    Timesheet.class,
    InHomeDisplayMessage.class,
    ZigBeeLoadControlEvent.class,
    ZigBeeCancelMessage.class,
    BillingData.class,
    Inspection.class,
    ScadaAnalog.class,
    MspResultsBase.class,
    ObservationDefinition.class,
    MspDevice.class,
    Attachment.class,
    GasService.class,
    Schedule.class,
    OtherMeterExchange.class,
    MspLineObject.class,
    EmployeeTimeRecord.class,
    MeterConnectivity.class,
    Transformer.class,
    Work.class,
    ConnectDisconnectList.class,
    AVLLog.class,
    MspPointObject.class,
    MspMeter.class,
    MspElectricalDefinition.class,
    Clearance.class,
    PpmTransaction.class,
    MspDeviceExchange.class
})
public abstract class MspObject {

    protected Extensions extensions;
    protected String comments;
    protected ArrayOfExtensionsItem extensionsList;
    protected String objectName;
    protected IdentifiedObject identifiedObject;
    @XmlAttribute(name = "objectID")
    protected String objectID;
    @XmlAttribute(name = "verb")
    protected Action verb;
    @XmlAttribute(name = "errorString")
    protected String errorString;
    @XmlAttribute(name = "replaceID")
    protected String replaceID;
    @XmlAttribute(name = "utility")
    protected String utility;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public ArrayOfExtensionsItem getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionsItem }
     *     
     */
    public void setExtensionsList(ArrayOfExtensionsItem value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the identifiedObject property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedObject }
     *     
     */
    public IdentifiedObject getIdentifiedObject() {
        return identifiedObject;
    }

    /**
     * Sets the value of the identifiedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedObject }
     *     
     */
    public void setIdentifiedObject(IdentifiedObject value) {
        this.identifiedObject = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getVerb() {
        if (verb == null) {
            return Action.CHANGE;
        } else {
            return verb;
        }
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setVerb(Action value) {
        this.verb = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

    /**
     * Gets the value of the replaceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceID() {
        return replaceID;
    }

    /**
     * Sets the value of the replaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceID(String value) {
        this.replaceID = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
