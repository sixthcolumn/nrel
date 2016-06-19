
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.AccountDeposit;
import org.multispeak.v5.AcctsReceivable;
import org.multispeak.v5.AccumulatedEventStatus;
import org.multispeak.v5.AdjustmentItem;
import org.multispeak.v5.AffectedMeter;
import org.multispeak.v5.AggregatedGroup;
import org.multispeak.v5.AlertCodes;
import org.multispeak.v5.AlternateContact;
import org.multispeak.v5.AssemblyAccountingFields;
import org.multispeak.v5.AssetData;
import org.multispeak.v5.AssetDetails;
import org.multispeak.v5.AssetLocation;
import org.multispeak.v5.AssetLocationHistoryItem;
import org.multispeak.v5.AssetRequest;
import org.multispeak.v5.AssignmentDetailItem;
import org.multispeak.v5.AssignmentDetails;
import org.multispeak.v5.AssociatedDate;
import org.multispeak.v5.AssociatedMeters;
import org.multispeak.v5.Authorization;
import org.multispeak.v5.AuthorizedCCData;
import org.multispeak.v5.AuthorizedCheckData;
import org.multispeak.v5.BackSpan;
import org.multispeak.v5.BankRatings;
import org.multispeak.v5.BillingStatusInformation;
import org.multispeak.v5.BillingStatusItem;
import org.multispeak.v5.Bin;
import org.multispeak.v5.CDCustomer;
import org.multispeak.v5.CDEnabledItem;
import org.multispeak.v5.CIMObjectList;
import org.multispeak.v5.CPRAdjustment;
import org.multispeak.v5.CPRAdjustmentList;
import org.multispeak.v5.CPRAllocation;
import org.multispeak.v5.CT;
import org.multispeak.v5.CallBackInformation;
import org.multispeak.v5.CapacitorBankSwitch;
import org.multispeak.v5.CapacitorPhaseUnit;
import org.multispeak.v5.CashPayment;
import org.multispeak.v5.CatalogEntries;
import org.multispeak.v5.ChargeItem;
import org.multispeak.v5.CheckData;
import org.multispeak.v5.Circuit;
import org.multispeak.v5.ClosedLoopStrategy;
import org.multispeak.v5.CoincidentMeterReadingSet;
import org.multispeak.v5.ConductorItem;
import org.multispeak.v5.ConfigurationStatusItem;
import org.multispeak.v5.ConfiguredReadingType;
import org.multispeak.v5.ConstituentUnit;
import org.multispeak.v5.Constraints;
import org.multispeak.v5.ConstructionItem;
import org.multispeak.v5.ConsumptionItem;
import org.multispeak.v5.ConsumptionTier;
import org.multispeak.v5.ControlParameters;
import org.multispeak.v5.ControlledItem;
import org.multispeak.v5.ConvenienceFeeItem;
import org.multispeak.v5.CreditCardData;
import org.multispeak.v5.CreditCardInfo;
import org.multispeak.v5.CreditCardPayment;
import org.multispeak.v5.CustomerHazard;
import org.multispeak.v5.DREventDeviceStatus;
import org.multispeak.v5.DateTimeRequest;
import org.multispeak.v5.DemandCharge;
import org.multispeak.v5.DeviceList;
import org.multispeak.v5.DisplayFormat;
import org.multispeak.v5.DisplayUsage;
import org.multispeak.v5.District;
import org.multispeak.v5.ECheckPayment;
import org.multispeak.v5.ElectricLocationFields;
import org.multispeak.v5.ElectricNameplate;
import org.multispeak.v5.ElectricalRatings;
import org.multispeak.v5.ExistingMeter;
import org.multispeak.v5.ExternalRequest;
import org.multispeak.v5.GasLocationFields;
import org.multispeak.v5.GasNameplate;
import org.multispeak.v5.Geometry;
import org.multispeak.v5.InstrumentTransformers;
import org.multispeak.v5.IntervalChannel;
import org.multispeak.v5.J1939TroubleCode;
import org.multispeak.v5.JointUse;
import org.multispeak.v5.LTDeviceCodes;
import org.multispeak.v5.LaborComponent;
import org.multispeak.v5.LaborItem;
import org.multispeak.v5.LaborItemList;
import org.multispeak.v5.ListItem;
import org.multispeak.v5.LoadCycleTier;
import org.multispeak.v5.LoadManagementDeviceRelay;
import org.multispeak.v5.LoadSection;
import org.multispeak.v5.LocationDetails;
import org.multispeak.v5.LocationHazard;
import org.multispeak.v5.LocationInformation;
import org.multispeak.v5.LocationNote;
import org.multispeak.v5.LocationPriority;
import org.multispeak.v5.LocationReferences;
import org.multispeak.v5.LocationTrackingAddress;
import org.multispeak.v5.MaterialComponent;
import org.multispeak.v5.MeterSeal;
import org.multispeak.v5.MeterStatus;
import org.multispeak.v5.MspLTDeviceCode;
import org.multispeak.v5.MspReferable;
import org.multispeak.v5.OrganizationAssociation;
import org.multispeak.v5.OtherCodes;
import org.multispeak.v5.OtherIdentificationFields;
import org.multispeak.v5.OtherLocationFields;
import org.multispeak.v5.OtherNameplate;
import org.multispeak.v5.OutageDetails;
import org.multispeak.v5.OutageLocation;
import org.multispeak.v5.OutageReason;
import org.multispeak.v5.OutageReasonItem;
import org.multispeak.v5.OutageRemark;
import org.multispeak.v5.OutageStatus;
import org.multispeak.v5.PANDeviceRef;
import org.multispeak.v5.PCBTest;
import org.multispeak.v5.PT;
import org.multispeak.v5.PayableItemsList;
import org.multispeak.v5.PaymentContainer;
import org.multispeak.v5.PaymentExtension;
import org.multispeak.v5.PeriodicSchedule;
import org.multispeak.v5.PickList;
import org.multispeak.v5.PickListItem;
import org.multispeak.v5.PriceBin;
import org.multispeak.v5.PriceTier;
import org.multispeak.v5.PricingEventStatus;
import org.multispeak.v5.PricingPeriod;
import org.multispeak.v5.ProfileType;
import org.multispeak.v5.PropaneLocationFields;
import org.multispeak.v5.RelatedOrganization;
import org.multispeak.v5.RemainingBalance;
import org.multispeak.v5.ReplacementMeter;
import org.multispeak.v5.RequiredAbilityItem;
import org.multispeak.v5.ResourceGroup;
import org.multispeak.v5.ResourceMember;
import org.multispeak.v5.RetryBehavior;
import org.multispeak.v5.ScheduleConstraints;
import org.multispeak.v5.ScheduleRequests;
import org.multispeak.v5.ScheduledItem;
import org.multispeak.v5.ServiceAction;
import org.multispeak.v5.ServiceCharacteristics;
import org.multispeak.v5.ServicePointStatus;
import org.multispeak.v5.ServicePriority;
import org.multispeak.v5.SpatialFeatures;
import org.multispeak.v5.StationAssemblyDetails;
import org.multispeak.v5.Strategy;
import org.multispeak.v5.SubUnit;
import org.multispeak.v5.SupplementalNote;
import org.multispeak.v5.SupportedNotification;
import org.multispeak.v5.SupportedReadingType;
import org.multispeak.v5.SwitchingStep;
import org.multispeak.v5.Telemetry;
import org.multispeak.v5.TemperatureTier;
import org.multispeak.v5.ThermostatScheduleDay;
import org.multispeak.v5.ThermostatScheduleTime;
import org.multispeak.v5.TimePoint;
import org.multispeak.v5.TroubleCodes;
import org.multispeak.v5.UsageDetail;
import org.multispeak.v5.UsageItem;
import org.multispeak.v5.Variant;
import org.multispeak.v5.WarehouseLocation;
import org.multispeak.v5.WaterLocationFields;
import org.multispeak.v5.WaterNameplate;
import org.multispeak.v5.Winding;
import org.multispeak.v5.WindingPair;
import org.multispeak.v5.WorkHistory;
import org.multispeak.v5.WorkItemRelationship;
import org.multispeak.v5.WorkLocation;
import org.multispeak.v5.WorkOrderAccountingFields;
import org.multispeak.v5.WorkPriority;
import org.multispeak.v5.WorkSchedule;
import org.multispeak.v5.WorkScheduleDetail;
import org.multispeak.v5.WorkStatus;
import org.multispeak.v5.WorkStatusDetail;
import org.multispeak.v5.WorkUnassignment;


/**
 * This is an abstract class from which children elements may inherit in order to gain extensibility.
 * 
 * <p>Java class for mspExtensible complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspExtensible">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extensions" type="{http://www.multispeak.org/V5.0/commonTypes}extensions" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.multispeak.org/V5.0/commonTypes}extensionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspExtensible", propOrder = {
    "extensions",
    "extensionsList"
})
@XmlSeeAlso({
    PhoneNumber.class,
    GPSMetadata.class,
    TelephoneNumber.class,
    GraphicSymbol.class,
    ContactInfo.class,
    OtherContactItem.class,
    EMailAddress.class,
    UtilityInfo.class,
    AddressItem.class,
    DetailedAddressFields.class,
    GPSLocation.class,
    Address.class,
    AllocatedLoad.class,
    CreditCardData.class,
    ServicePointStatus.class,
    PANDeviceRef.class,
    AccountDeposit.class,
    ConvenienceFeeItem.class,
    PayableItemsList.class,
    Bin.class,
    CDEnabledItem.class,
    ExistingMeter.class,
    LocationReferences.class,
    BillingStatusItem.class,
    LaborItemList.class,
    ConfigurationStatusItem.class,
    OrganizationAssociation.class,
    TroubleCodes.class,
    WorkItemRelationship.class,
    ECheckPayment.class,
    OtherLocationFields.class,
    UsageDetail.class,
    ConstructionItem.class,
    UsageItem.class,
    AdjustmentItem.class,
    MeterStatus.class,
    CDCustomer.class,
    CreditCardPayment.class,
    WorkStatus.class,
    CT.class,
    TimePoint.class,
    ElectricLocationFields.class,
    ElectricalRatings.class,
    WorkSchedule.class,
    WorkStatusDetail.class,
    LocationHazard.class,
    CoincidentMeterReadingSet.class,
    Authorization.class,
    AssociatedMeters.class,
    LocationTrackingAddress.class,
    AssetData.class,
    J1939TroubleCode.class,
    SupportedReadingType.class,
    ConstituentUnit.class,
    CapacitorPhaseUnit.class,
    WorkOrderAccountingFields.class,
    CIMObjectList.class,
    DisplayFormat.class,
    CustomerHazard.class,
    CatalogEntries.class,
    SpatialFeatures.class,
    ResourceMember.class,
    PaymentExtension.class,
    AssetLocationHistoryItem.class,
    PriceTier.class,
    ServiceCharacteristics.class,
    ElectricNameplate.class,
    ScheduleConstraints.class,
    PT.class,
    WorkHistory.class,
    ConsumptionTier.class,
    SupplementalNote.class,
    AlertCodes.class,
    CreditCardInfo.class,
    OutageReasonItem.class,
    ConsumptionItem.class,
    ScheduleRequests.class,
    IntervalChannel.class,
    BackSpan.class,
    District.class,
    AuthorizedCheckData.class,
    LaborItem.class,
    OtherIdentificationFields.class,
    AuthorizedCCData.class,
    PickListItem.class,
    WorkLocation.class,
    DeviceList.class,
    InstrumentTransformers.class,
    ThermostatScheduleDay.class,
    StationAssemblyDetails.class,
    LoadSection.class,
    CPRAdjustment.class,
    AccumulatedEventStatus.class,
    BankRatings.class,
    PricingEventStatus.class,
    AssociatedDate.class,
    OutageReason.class,
    CPRAllocation.class,
    GasNameplate.class,
    CPRAdjustmentList.class,
    OtherCodes.class,
    GasLocationFields.class,
    PropaneLocationFields.class,
    PCBTest.class,
    BillingStatusInformation.class,
    CashPayment.class,
    ControlledItem.class,
    ClosedLoopStrategy.class,
    AggregatedGroup.class,
    ScheduledItem.class,
    LocationNote.class,
    AssignmentDetailItem.class,
    Winding.class,
    WaterNameplate.class,
    ProfileType.class,
    TemperatureTier.class,
    AffectedMeter.class,
    PeriodicSchedule.class,
    MaterialComponent.class,
    LoadCycleTier.class,
    PaymentContainer.class,
    CallBackInformation.class,
    DREventDeviceStatus.class,
    ServicePriority.class,
    AssignmentDetails.class,
    AssetLocation.class,
    WaterLocationFields.class,
    Geometry.class,
    SwitchingStep.class,
    MeterSeal.class,
    AcctsReceivable.class,
    PriceBin.class,
    Variant.class,
    WindingPair.class,
    DateTimeRequest.class,
    JointUse.class,
    DisplayUsage.class,
    OutageDetails.class,
    OutageLocation.class,
    LaborComponent.class,
    SubUnit.class,
    ControlParameters.class,
    CapacitorBankSwitch.class,
    AssemblyAccountingFields.class,
    ConfiguredReadingType.class,
    WarehouseLocation.class,
    CheckData.class,
    AssetRequest.class,
    Constraints.class,
    LocationPriority.class,
    ThermostatScheduleTime.class,
    ExternalRequest.class,
    OtherNameplate.class,
    Telemetry.class,
    SupportedNotification.class,
    MspLTDeviceCode.class,
    LocationInformation.class,
    AlternateContact.class,
    PricingPeriod.class,
    WorkUnassignment.class,
    ChargeItem.class,
    RequiredAbilityItem.class,
    ListItem.class,
    LTDeviceCodes.class,
    Circuit.class,
    ResourceGroup.class,
    OutageRemark.class,
    ReplacementMeter.class,
    DemandCharge.class,
    LocationDetails.class,
    RelatedOrganization.class,
    PickList.class,
    RemainingBalance.class,
    ConductorItem.class,
    OutageStatus.class,
    LoadManagementDeviceRelay.class,
    ServiceAction.class,
    WorkPriority.class,
    AssetDetails.class,
    RetryBehavior.class,
    Strategy.class,
    MspReferable.class,
    WorkScheduleDetail.class
})
public abstract class MspExtensible {

    protected Extensions extensions;
    protected ExtensionsList extensionsList;

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
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

}
