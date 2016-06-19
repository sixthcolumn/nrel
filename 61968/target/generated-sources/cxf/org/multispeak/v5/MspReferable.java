
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ErrorObjects;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * This is an abstract class from which all objects will inherit that are not persisted objects, but need to be identifiable once used in a message payload. It is expected that items that inherit from mspReferable live for the lifetime of a business transaction.
 * 
 * <p>Java class for mspReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="errorObjects" type="{http://www.multispeak.org/V5.0/commonTypes}errorObjects" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referableID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspReferable", propOrder = {
    "errorObjects"
})
@XmlSeeAlso({
    ElectricConnectivityModel.class,
    EventMonitoringItem.class,
    OutageReasonReferable.class,
    SubstationLoadControlStatus.class,
    Connectivity.class,
    ThermostatScheduleConfirmation.class,
    OutageRefReferable.class,
    LoadCycleTierStructure.class,
    MeterReading.class,
    BillingDetail.class,
    CustomerCallStatus.class,
    OutageRemarkReferable.class,
    ReadingObject.class,
    SpatialFeaturesReferable.class,
    ChargeableDevicesReferable.class,
    LocationTrackingLog.class,
    PremisesDisplayMessageConfirmation.class,
    OutagePriorityLocation.class,
    AssociatedMetersList.class,
    AttachmentContainer.class,
    ElectricLocationFieldsReferable.class,
    ServicePointStatusReferable.class,
    WorkItemDeletionRequest.class,
    AssetsReferable.class,
    DiscardedOutage.class,
    ThermostatConfiguration.class,
    EndDeviceEventList.class,
    Meter.class,
    HistoryComment.class,
    OutageETOR.class,
    ViewDefinition.class,
    ReadingScheduleResult.class,
    WorkItemAttachmentContainer.class,
    ProfileObject.class,
    PayableItem.class,
    OutageContact.class,
    PANAddressingGroup.class,
    WorkSchedulingItem.class,
    WorkOrderSelection.class,
    ReturnedCatalogEntries.class,
    Usage.class,
    AssetHistoryEventsReferable.class,
    WorkHistoryReferable.class,
    Assembly.class,
    MeterConfigurationStatus.class,
    PremisesDisplayCapabilitySetting.class,
    OutageWorkUpdate.class,
    LocationOutageStatusReferable.class,
    OutageAttachmentContainer.class,
    AssetContainer.class,
    RestoredOutage.class,
    CDState.class,
    RequestedNumber.class,
    ServicePoints.class,
    ThermostatConfigurationReferable.class,
    CapacitorBankSwitchesReferable.class,
    GasConnectivityModel.class,
    WorkRequestStatusReferable.class,
    BufferedObjectCollection.class,
    WorkScheduleChange.class,
    MeterGroups.class,
    BillingAccountLoad.class,
    OutageCustomer.class,
    SystemState.class,
    SpatialDetails.class,
    LocationTrackingPosition.class,
    WorkRequestResult.class,
    ObjectDeletion.class,
    PriceTierStructure.class,
    BilledUsage.class,
    PpmStatus.class,
    ObjectDeletionRequest.class,
    TemperatureTierStructure.class,
    AssetLocationReferable.class,
    DesignSubmission.class,
    WorkOrderUpdate.class,
    OutageReasonList.class,
    OutageReasonCodeList.class,
    HighlightDisplayObject.class,
    WorkProgressItem.class,
    WorkItemSummary.class,
    PointSubscriptionList.class,
    BillingData.class,
    ObjectRefChange.class,
    ThermostatSchedule.class,
    WorkProgress.class,
    OutageStatusReferable.class,
    Meters.class,
    EventMonitoringItems.class,
    OtherSpatialFeatures.class,
    WaterConnectivityModel.class,
    SchedulingResult.class,
    MeterConnectivity.class,
    MspEvent.class,
    Outages.class,
    AttachmentUnlinkContainer.class,
    ConnectDisconnectList.class,
    WorkAssignmentChange.class,
    CircuitElementStatus.class,
    OutageElementStatuses.class,
    PremisesDisplayMessageStatus.class
})
public abstract class MspReferable
    extends MspExtensible
{

    protected ErrorObjects errorObjects;
    @XmlAttribute(name = "referableID")
    protected String referableID;

    /**
     * Gets the value of the errorObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorObjects }
     *     
     */
    public ErrorObjects getErrorObjects() {
        return errorObjects;
    }

    /**
     * Sets the value of the errorObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorObjects }
     *     
     */
    public void setErrorObjects(ErrorObjects value) {
        this.errorObjects = value;
    }

    /**
     * Gets the value of the referableID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferableID() {
        return referableID;
    }

    /**
     * Sets the value of the referableID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferableID(String value) {
        this.referableID = value;
    }

}
