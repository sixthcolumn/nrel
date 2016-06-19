
package org.multispeak.v5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.multispeak.v5 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BlockStatusClockBackward_QNAME = new QName("http://www.multispeak.org/V5.0", "clockBackward");
    private final static QName _BlockStatusManuallyModified_QNAME = new QName("http://www.multispeak.org/V5.0", "manuallyModified");
    private final static QName _BlockStatusLongInterval_QNAME = new QName("http://www.multispeak.org/V5.0", "longInterval");
    private final static QName _BlockStatusClockForward_QNAME = new QName("http://www.multispeak.org/V5.0", "clockForward");
    private final static QName _BlockStatusOverflow_QNAME = new QName("http://www.multispeak.org/V5.0", "overflow");
    private final static QName _BlockStatusInvalid_QNAME = new QName("http://www.multispeak.org/V5.0", "invalid");
    private final static QName _BlockStatusConfigChanged_QNAME = new QName("http://www.multispeak.org/V5.0", "configChanged");
    private final static QName _BlockStatusManuallyEntered_QNAME = new QName("http://www.multispeak.org/V5.0", "manuallyEntered");
    private final static QName _BlockStatusDSTinEffect_QNAME = new QName("http://www.multispeak.org/V5.0", "DSTinEffect");
    private final static QName _BlockStatusTestData_QNAME = new QName("http://www.multispeak.org/V5.0", "testData");
    private final static QName _BlockStatusRecorderStopped_QNAME = new QName("http://www.multispeak.org/V5.0", "recorderStopped");
    private final static QName _BlockStatusPartialInterval_QNAME = new QName("http://www.multispeak.org/V5.0", "partialInterval");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.multispeak.v5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequiredObjectRefs }
     * 
     */
    public RequiredObjectRefs createRequiredObjectRefs() {
        return new RequiredObjectRefs();
    }

    /**
     * Create an instance of {@link ScadaStatus }
     * 
     */
    public ScadaStatus createScadaStatus() {
        return new ScadaStatus();
    }

    /**
     * Create an instance of {@link SynchronousMachineEntry }
     * 
     */
    public SynchronousMachineEntry createSynchronousMachineEntry() {
        return new SynchronousMachineEntry();
    }

    /**
     * Create an instance of {@link ServiceAgreements }
     * 
     */
    public ServiceAgreements createServiceAgreements() {
        return new ServiceAgreements();
    }

    /**
     * Create an instance of {@link PremisesDisplayIDs }
     * 
     */
    public PremisesDisplayIDs createPremisesDisplayIDs() {
        return new PremisesDisplayIDs();
    }

    /**
     * Create an instance of {@link RegulatorBanks }
     * 
     */
    public RegulatorBanks createRegulatorBanks() {
        return new RegulatorBanks();
    }

    /**
     * Create an instance of {@link AssetData }
     * 
     */
    public AssetData createAssetData() {
        return new AssetData();
    }

    /**
     * Create an instance of {@link OutageLocation }
     * 
     */
    public OutageLocation createOutageLocation() {
        return new OutageLocation();
    }

    /**
     * Create an instance of {@link DemandReset }
     * 
     */
    public DemandReset createDemandReset() {
        return new DemandReset();
    }

    /**
     * Create an instance of {@link CancellationAction }
     * 
     */
    public CancellationAction createCancellationAction() {
        return new CancellationAction();
    }

    /**
     * Create an instance of {@link BillingStatusInformation }
     * 
     */
    public BillingStatusInformation createBillingStatusInformation() {
        return new BillingStatusInformation();
    }

    /**
     * Create an instance of {@link GasOutages }
     * 
     */
    public GasOutages createGasOutages() {
        return new GasOutages();
    }

    /**
     * Create an instance of {@link ConstructionItem }
     * 
     */
    public ConstructionItem createConstructionItem() {
        return new ConstructionItem();
    }

    /**
     * Create an instance of {@link Summation }
     * 
     */
    public Summation createSummation() {
        return new Summation();
    }

    /**
     * Create an instance of {@link OrganizationAssociations }
     * 
     */
    public OrganizationAssociations createOrganizationAssociations() {
        return new OrganizationAssociations();
    }

    /**
     * Create an instance of {@link BufferedCircuitElement }
     * 
     */
    public BufferedCircuitElement createBufferedCircuitElement() {
        return new BufferedCircuitElement();
    }

    /**
     * Create an instance of {@link WorkAssignmentChange }
     * 
     */
    public WorkAssignmentChange createWorkAssignmentChange() {
        return new WorkAssignmentChange();
    }

    /**
     * Create an instance of {@link Resources }
     * 
     */
    public Resources createResources() {
        return new Resources();
    }

    /**
     * Create an instance of {@link Breakers }
     * 
     */
    public Breakers createBreakers() {
        return new Breakers();
    }

    /**
     * Create an instance of {@link ReceivedWaterMeters }
     * 
     */
    public ReceivedWaterMeters createReceivedWaterMeters() {
        return new ReceivedWaterMeters();
    }

    /**
     * Create an instance of {@link DomainMemberChange }
     * 
     */
    public DomainMemberChange createDomainMemberChange() {
        return new DomainMemberChange();
    }

    /**
     * Create an instance of {@link EndDeviceEventTypes }
     * 
     */
    public EndDeviceEventTypes createEndDeviceEventTypes() {
        return new EndDeviceEventTypes();
    }

    /**
     * Create an instance of {@link LaborItem }
     * 
     */
    public LaborItem createLaborItem() {
        return new LaborItem();
    }

    /**
     * Create an instance of {@link PANDeviceIDs }
     * 
     */
    public PANDeviceIDs createPANDeviceIDs() {
        return new PANDeviceIDs();
    }

    /**
     * Create an instance of {@link RequiredAbilities }
     * 
     */
    public RequiredAbilities createRequiredAbilities() {
        return new RequiredAbilities();
    }

    /**
     * Create an instance of {@link OutagePhaseStatus }
     * 
     */
    public OutagePhaseStatus createOutagePhaseStatus() {
        return new OutagePhaseStatus();
    }

    /**
     * Create an instance of {@link TimePeriods }
     * 
     */
    public TimePeriods createTimePeriods() {
        return new TimePeriods();
    }

    /**
     * Create an instance of {@link Premises }
     * 
     */
    public Premises createPremises() {
        return new Premises();
    }

    /**
     * Create an instance of {@link AssetType }
     * 
     */
    public AssetType createAssetType() {
        return new AssetType();
    }

    /**
     * Create an instance of {@link RelatedOrganization }
     * 
     */
    public RelatedOrganization createRelatedOrganization() {
        return new RelatedOrganization();
    }

    /**
     * Create an instance of {@link MeterBaseExchange }
     * 
     */
    public MeterBaseExchange createMeterBaseExchange() {
        return new MeterBaseExchange();
    }

    /**
     * Create an instance of {@link WindingPairAttributes }
     * 
     */
    public WindingPairAttributes createWindingPairAttributes() {
        return new WindingPairAttributes();
    }

    /**
     * Create an instance of {@link BillingData }
     * 
     */
    public BillingData createBillingData() {
        return new BillingData();
    }

    /**
     * Create an instance of {@link PropaneServicePoint }
     * 
     */
    public PropaneServicePoint createPropaneServicePoint() {
        return new PropaneServicePoint();
    }

    /**
     * Create an instance of {@link LoadManagementDeviceIDs }
     * 
     */
    public LoadManagementDeviceIDs createLoadManagementDeviceIDs() {
        return new LoadManagementDeviceIDs();
    }

    /**
     * Create an instance of {@link BlockStatus }
     * 
     */
    public BlockStatus createBlockStatus() {
        return new BlockStatus();
    }

    /**
     * Create an instance of {@link ReadingQualityCode }
     * 
     */
    public ReadingQualityCode createReadingQualityCode() {
        return new ReadingQualityCode();
    }

    /**
     * Create an instance of {@link BreakerImpedances }
     * 
     */
    public BreakerImpedances createBreakerImpedances() {
        return new BreakerImpedances();
    }

    /**
     * Create an instance of {@link ReadingTypeCode }
     * 
     */
    public ReadingTypeCode createReadingTypeCode() {
        return new ReadingTypeCode();
    }

    /**
     * Create an instance of {@link WorkReference }
     * 
     */
    public WorkReference createWorkReference() {
        return new WorkReference();
    }

    /**
     * Create an instance of {@link PropaneMeterExchanges }
     * 
     */
    public PropaneMeterExchanges createPropaneMeterExchanges() {
        return new PropaneMeterExchanges();
    }

    /**
     * Create an instance of {@link District }
     * 
     */
    public District createDistrict() {
        return new District();
    }

    /**
     * Create an instance of {@link LaborComponent }
     * 
     */
    public LaborComponent createLaborComponent() {
        return new LaborComponent();
    }

    /**
     * Create an instance of {@link MultiSpeak }
     * 
     */
    public MultiSpeak createMultiSpeak() {
        return new MultiSpeak();
    }

    /**
     * Create an instance of {@link SwitchingOrder }
     * 
     */
    public SwitchingOrder createSwitchingOrder() {
        return new SwitchingOrder();
    }

    /**
     * Create an instance of {@link FormattedBlock }
     * 
     */
    public FormattedBlock createFormattedBlock() {
        return new FormattedBlock();
    }

    /**
     * Create an instance of {@link ScadaAnalogValues }
     * 
     */
    public ScadaAnalogValues createScadaAnalogValues() {
        return new ScadaAnalogValues();
    }

    /**
     * Create an instance of {@link PriceTierStructure }
     * 
     */
    public PriceTierStructure createPriceTierStructure() {
        return new PriceTierStructure();
    }

    /**
     * Create an instance of {@link OutageETOR }
     * 
     */
    public OutageETOR createOutageETOR() {
        return new OutageETOR();
    }

    /**
     * Create an instance of {@link ServicePointIDs }
     * 
     */
    public ServicePointIDs createServicePointIDs() {
        return new ServicePointIDs();
    }

    /**
     * Create an instance of {@link ClearanceCertificate }
     * 
     */
    public ClearanceCertificate createClearanceCertificate() {
        return new ClearanceCertificate();
    }

    /**
     * Create an instance of {@link UsageDetail }
     * 
     */
    public UsageDetail createUsageDetail() {
        return new UsageDetail();
    }

    /**
     * Create an instance of {@link WorkRequestResult }
     * 
     */
    public WorkRequestResult createWorkRequestResult() {
        return new WorkRequestResult();
    }

    /**
     * Create an instance of {@link Designs }
     * 
     */
    public Designs createDesigns() {
        return new Designs();
    }

    /**
     * Create an instance of {@link AssetRefs }
     * 
     */
    public AssetRefs createAssetRefs() {
        return new AssetRefs();
    }

    /**
     * Create an instance of {@link PpmBalanceAdjustment }
     * 
     */
    public PpmBalanceAdjustment createPpmBalanceAdjustment() {
        return new PpmBalanceAdjustment();
    }

    /**
     * Create an instance of {@link ScadaPoint }
     * 
     */
    public ScadaPoint createScadaPoint() {
        return new ScadaPoint();
    }

    /**
     * Create an instance of {@link GenericPointFeature }
     * 
     */
    public GenericPointFeature createGenericPointFeature() {
        return new GenericPointFeature();
    }

    /**
     * Create an instance of {@link ServiceActions }
     * 
     */
    public ServiceActions createServiceActions() {
        return new ServiceActions();
    }

    /**
     * Create an instance of {@link Connectivity }
     * 
     */
    public Connectivity createConnectivity() {
        return new Connectivity();
    }

    /**
     * Create an instance of {@link PrimaryCabinets }
     * 
     */
    public PrimaryCabinets createPrimaryCabinets() {
        return new PrimaryCabinets();
    }

    /**
     * Create an instance of {@link Modules }
     * 
     */
    public Modules createModules() {
        return new Modules();
    }

    /**
     * Create an instance of {@link AccumulatedEventStatus }
     * 
     */
    public AccumulatedEventStatus createAccumulatedEventStatus() {
        return new AccumulatedEventStatus();
    }

    /**
     * Create an instance of {@link EffectiveDate }
     * 
     */
    public EffectiveDate createEffectiveDate() {
        return new EffectiveDate();
    }

    /**
     * Create an instance of {@link OutageStatus }
     * 
     */
    public OutageStatus createOutageStatus() {
        return new OutageStatus();
    }

    /**
     * Create an instance of {@link ObjectDeletion }
     * 
     */
    public ObjectDeletion createObjectDeletion() {
        return new ObjectDeletion();
    }

    /**
     * Create an instance of {@link LoadCycleTier }
     * 
     */
    public LoadCycleTier createLoadCycleTier() {
        return new LoadCycleTier();
    }

    /**
     * Create an instance of {@link PremisesArray }
     * 
     */
    public PremisesArray createPremisesArray() {
        return new PremisesArray();
    }

    /**
     * Create an instance of {@link ServiceOrderIDs }
     * 
     */
    public ServiceOrderIDs createServiceOrderIDs() {
        return new ServiceOrderIDs();
    }

    /**
     * Create an instance of {@link CDDevice }
     * 
     */
    public CDDevice createCDDevice() {
        return new CDDevice();
    }

    /**
     * Create an instance of {@link ModificationAction }
     * 
     */
    public ModificationAction createModificationAction() {
        return new ModificationAction();
    }

    /**
     * Create an instance of {@link CheckInfo }
     * 
     */
    public CheckInfo createCheckInfo() {
        return new CheckInfo();
    }

    /**
     * Create an instance of {@link CDEnabledResponse }
     * 
     */
    public CDEnabledResponse createCDEnabledResponse() {
        return new CDEnabledResponse();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItem();
    }

    /**
     * Create an instance of {@link TotalCost }
     * 
     */
    public TotalCost createTotalCost() {
        return new TotalCost();
    }

    /**
     * Create an instance of {@link BufferedCircuitElements }
     * 
     */
    public BufferedCircuitElements createBufferedCircuitElements() {
        return new BufferedCircuitElements();
    }

    /**
     * Create an instance of {@link Telemetry }
     * 
     */
    public Telemetry createTelemetry() {
        return new Telemetry();
    }

    /**
     * Create an instance of {@link AttachmentIDs }
     * 
     */
    public AttachmentIDs createAttachmentIDs() {
        return new AttachmentIDs();
    }

    /**
     * Create an instance of {@link WorkRequestStatusReferable }
     * 
     */
    public WorkRequestStatusReferable createWorkRequestStatusReferable() {
        return new WorkRequestStatusReferable();
    }

    /**
     * Create an instance of {@link SourceList }
     * 
     */
    public SourceList createSourceList() {
        return new SourceList();
    }

    /**
     * Create an instance of {@link CreditCardData }
     * 
     */
    public CreditCardData createCreditCardData() {
        return new CreditCardData();
    }

    /**
     * Create an instance of {@link ConfiguredReadingType }
     * 
     */
    public ConfiguredReadingType createConfiguredReadingType() {
        return new ConfiguredReadingType();
    }

    /**
     * Create an instance of {@link DemandResetCancel }
     * 
     */
    public DemandResetCancel createDemandResetCancel() {
        return new DemandResetCancel();
    }

    /**
     * Create an instance of {@link ThresholdNotificationItems }
     * 
     */
    public ThresholdNotificationItems createThresholdNotificationItems() {
        return new ThresholdNotificationItems();
    }

    /**
     * Create an instance of {@link ResourceSchedule }
     * 
     */
    public ResourceSchedule createResourceSchedule() {
        return new ResourceSchedule();
    }

    /**
     * Create an instance of {@link MeterStatus }
     * 
     */
    public MeterStatus createMeterStatus() {
        return new MeterStatus();
    }

    /**
     * Create an instance of {@link SampleRate }
     * 
     */
    public SampleRate createSampleRate() {
        return new SampleRate();
    }

    /**
     * Create an instance of {@link MspLTDeviceCode }
     * 
     */
    public MspLTDeviceCode createMspLTDeviceCode() {
        return new MspLTDeviceCode();
    }

    /**
     * Create an instance of {@link MeterReading }
     * 
     */
    public MeterReading createMeterReading() {
        return new MeterReading();
    }

    /**
     * Create an instance of {@link SupportedReadingType }
     * 
     */
    public SupportedReadingType createSupportedReadingType() {
        return new SupportedReadingType();
    }

    /**
     * Create an instance of {@link LocationTrackingAddress }
     * 
     */
    public LocationTrackingAddress createLocationTrackingAddress() {
        return new LocationTrackingAddress();
    }

    /**
     * Create an instance of {@link OutageAttachmentContainer }
     * 
     */
    public OutageAttachmentContainer createOutageAttachmentContainer() {
        return new OutageAttachmentContainer();
    }

    /**
     * Create an instance of {@link Switch }
     * 
     */
    public Switch createSwitch() {
        return new Switch();
    }

    /**
     * Create an instance of {@link ElectricNameplate }
     * 
     */
    public ElectricNameplate createElectricNameplate() {
        return new ElectricNameplate();
    }

    /**
     * Create an instance of {@link DownGuys }
     * 
     */
    public DownGuys createDownGuys() {
        return new DownGuys();
    }

    /**
     * Create an instance of {@link ChargeItems }
     * 
     */
    public ChargeItems createChargeItems() {
        return new ChargeItems();
    }

    /**
     * Create an instance of {@link ConfigurationGroups }
     * 
     */
    public ConfigurationGroups createConfigurationGroups() {
        return new ConfigurationGroups();
    }

    /**
     * Create an instance of {@link OutagePriorityLocations }
     * 
     */
    public OutagePriorityLocations createOutagePriorityLocations() {
        return new OutagePriorityLocations();
    }

    /**
     * Create an instance of {@link PricingPeriod }
     * 
     */
    public PricingPeriod createPricingPeriod() {
        return new PricingPeriod();
    }

    /**
     * Create an instance of {@link LoadCycleTierStructure }
     * 
     */
    public LoadCycleTierStructure createLoadCycleTierStructure() {
        return new LoadCycleTierStructure();
    }

    /**
     * Create an instance of {@link Module }
     * 
     */
    public Module createModule() {
        return new Module();
    }

    /**
     * Create an instance of {@link ConductorItem }
     * 
     */
    public ConductorItem createConductorItem() {
        return new ConductorItem();
    }

    /**
     * Create an instance of {@link Profiles }
     * 
     */
    public Profiles createProfiles() {
        return new Profiles();
    }

    /**
     * Create an instance of {@link WorkTypeRef }
     * 
     */
    public WorkTypeRef createWorkTypeRef() {
        return new WorkTypeRef();
    }

    /**
     * Create an instance of {@link TransformerEntries }
     * 
     */
    public TransformerEntries createTransformerEntries() {
        return new TransformerEntries();
    }

    /**
     * Create an instance of {@link MaterialManagementAssembly }
     * 
     */
    public MaterialManagementAssembly createMaterialManagementAssembly() {
        return new MaterialManagementAssembly();
    }

    /**
     * Create an instance of {@link OutageDetectionLog }
     * 
     */
    public OutageDetectionLog createOutageDetectionLog() {
        return new OutageDetectionLog();
    }

    /**
     * Create an instance of {@link CDState }
     * 
     */
    public CDState createCDState() {
        return new CDState();
    }

    /**
     * Create an instance of {@link RecurringPaymentConfiguration }
     * 
     */
    public RecurringPaymentConfiguration createRecurringPaymentConfiguration() {
        return new RecurringPaymentConfiguration();
    }

    /**
     * Create an instance of {@link ReceivedLoadManagementDevices }
     * 
     */
    public ReceivedLoadManagementDevices createReceivedLoadManagementDevices() {
        return new ReceivedLoadManagementDevices();
    }

    /**
     * Create an instance of {@link GuyRefs }
     * 
     */
    public GuyRefs createGuyRefs() {
        return new GuyRefs();
    }

    /**
     * Create an instance of {@link ExpirationTime }
     * 
     */
    public ExpirationTime createExpirationTime() {
        return new ExpirationTime();
    }

    /**
     * Create an instance of {@link EventMonitoringItems }
     * 
     */
    public EventMonitoringItems createEventMonitoringItems() {
        return new EventMonitoringItems();
    }

    /**
     * Create an instance of {@link CustomersAttachedToDevice }
     * 
     */
    public CustomersAttachedToDevice createCustomersAttachedToDevice() {
        return new CustomersAttachedToDevice();
    }

    /**
     * Create an instance of {@link Cuts }
     * 
     */
    public Cuts createCuts() {
        return new Cuts();
    }

    /**
     * Create an instance of {@link PANRegistration }
     * 
     */
    public PANRegistration createPANRegistration() {
        return new PANRegistration();
    }

    /**
     * Create an instance of {@link Guys }
     * 
     */
    public Guys createGuys() {
        return new Guys();
    }

    /**
     * Create an instance of {@link ScheduleRequests }
     * 
     */
    public ScheduleRequests createScheduleRequests() {
        return new ScheduleRequests();
    }

    /**
     * Create an instance of {@link StrategyChoices }
     * 
     */
    public StrategyChoices createStrategyChoices() {
        return new StrategyChoices();
    }

    /**
     * Create an instance of {@link WindingPair }
     * 
     */
    public WindingPair createWindingPair() {
        return new WindingPair();
    }

    /**
     * Create an instance of {@link GasConnectivityModels }
     * 
     */
    public GasConnectivityModels createGasConnectivityModels() {
        return new GasConnectivityModels();
    }

    /**
     * Create an instance of {@link PANGroupID }
     * 
     */
    public PANGroupID createPANGroupID() {
        return new PANGroupID();
    }

    /**
     * Create an instance of {@link ReceivedGasMeters }
     * 
     */
    public ReceivedGasMeters createReceivedGasMeters() {
        return new ReceivedGasMeters();
    }

    /**
     * Create an instance of {@link ReadingTypeChoice }
     * 
     */
    public ReadingTypeChoice createReadingTypeChoice() {
        return new ReadingTypeChoice();
    }

    /**
     * Create an instance of {@link GenericLineFeature }
     * 
     */
    public GenericLineFeature createGenericLineFeature() {
        return new GenericLineFeature();
    }

    /**
     * Create an instance of {@link DemandCharges }
     * 
     */
    public DemandCharges createDemandCharges() {
        return new DemandCharges();
    }

    /**
     * Create an instance of {@link EndDeviceRefOption }
     * 
     */
    public EndDeviceRefOption createEndDeviceRefOption() {
        return new EndDeviceRefOption();
    }

    /**
     * Create an instance of {@link PremisesDisplayGroup }
     * 
     */
    public PremisesDisplayGroup createPremisesDisplayGroup() {
        return new PremisesDisplayGroup();
    }

    /**
     * Create an instance of {@link SwitchingDevice }
     * 
     */
    public SwitchingDevice createSwitchingDevice() {
        return new SwitchingDevice();
    }

    /**
     * Create an instance of {@link OutageRemarks }
     * 
     */
    public OutageRemarks createOutageRemarks() {
        return new OutageRemarks();
    }

    /**
     * Create an instance of {@link PropaneMeters }
     * 
     */
    public PropaneMeters createPropaneMeters() {
        return new PropaneMeters();
    }

    /**
     * Create an instance of {@link Cut }
     * 
     */
    public Cut createCut() {
        return new Cut();
    }

    /**
     * Create an instance of {@link SwitchingDeviceList }
     * 
     */
    public SwitchingDeviceList createSwitchingDeviceList() {
        return new SwitchingDeviceList();
    }

    /**
     * Create an instance of {@link Meters }
     * 
     */
    public Meters createMeters() {
        return new Meters();
    }

    /**
     * Create an instance of {@link GasLocationFields }
     * 
     */
    public GasLocationFields createGasLocationFields() {
        return new GasLocationFields();
    }

    /**
     * Create an instance of {@link CPR }
     * 
     */
    public CPR createCPR() {
        return new CPR();
    }

    /**
     * Create an instance of {@link EndDeviceEvent }
     * 
     */
    public EndDeviceEvent createEndDeviceEvent() {
        return new EndDeviceEvent();
    }

    /**
     * Create an instance of {@link ThermostatHoldType }
     * 
     */
    public ThermostatHoldType createThermostatHoldType() {
        return new ThermostatHoldType();
    }

    /**
     * Create an instance of {@link SwitchingStep }
     * 
     */
    public SwitchingStep createSwitchingStep() {
        return new SwitchingStep();
    }

    /**
     * Create an instance of {@link OutageStatusReferable }
     * 
     */
    public OutageStatusReferable createOutageStatusReferable() {
        return new OutageStatusReferable();
    }

    /**
     * Create an instance of {@link Sectionalizers }
     * 
     */
    public Sectionalizers createSectionalizers() {
        return new Sectionalizers();
    }

    /**
     * Create an instance of {@link ConnectDisconnectList }
     * 
     */
    public ConnectDisconnectList createConnectDisconnectList() {
        return new ConnectDisconnectList();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link AssociatedDate }
     * 
     */
    public AssociatedDate createAssociatedDate() {
        return new AssociatedDate();
    }

    /**
     * Create an instance of {@link ParentMeters }
     * 
     */
    public ParentMeters createParentMeters() {
        return new ParentMeters();
    }

    /**
     * Create an instance of {@link PCBTests }
     * 
     */
    public PCBTests createPCBTests() {
        return new PCBTests();
    }

    /**
     * Create an instance of {@link AccountsReceivable }
     * 
     */
    public AccountsReceivable createAccountsReceivable() {
        return new AccountsReceivable();
    }

    /**
     * Create an instance of {@link MeterConnectivity }
     * 
     */
    public MeterConnectivity createMeterConnectivity() {
        return new MeterConnectivity();
    }

    /**
     * Create an instance of {@link CapacitorPhaseUnits }
     * 
     */
    public CapacitorPhaseUnits createCapacitorPhaseUnits() {
        return new CapacitorPhaseUnits();
    }

    /**
     * Create an instance of {@link CableOutages }
     * 
     */
    public CableOutages createCableOutages() {
        return new CableOutages();
    }

    /**
     * Create an instance of {@link DesignReference }
     * 
     */
    public DesignReference createDesignReference() {
        return new DesignReference();
    }

    /**
     * Create an instance of {@link AssociatedDevices }
     * 
     */
    public AssociatedDevices createAssociatedDevices() {
        return new AssociatedDevices();
    }

    /**
     * Create an instance of {@link GenericPointFeatures }
     * 
     */
    public GenericPointFeatures createGenericPointFeatures() {
        return new GenericPointFeatures();
    }

    /**
     * Create an instance of {@link ReceivedCDDevices }
     * 
     */
    public ReceivedCDDevices createReceivedCDDevices() {
        return new ReceivedCDDevices();
    }

    /**
     * Create an instance of {@link LoadManagementEvent }
     * 
     */
    public LoadManagementEvent createLoadManagementEvent() {
        return new LoadManagementEvent();
    }

    /**
     * Create an instance of {@link RegulatorEntries }
     * 
     */
    public RegulatorEntries createRegulatorEntries() {
        return new RegulatorEntries();
    }

    /**
     * Create an instance of {@link ControlledItems }
     * 
     */
    public ControlledItems createControlledItems() {
        return new ControlledItems();
    }

    /**
     * Create an instance of {@link RegulatorEntry }
     * 
     */
    public RegulatorEntry createRegulatorEntry() {
        return new RegulatorEntry();
    }

    /**
     * Create an instance of {@link OutageReason }
     * 
     */
    public OutageReason createOutageReason() {
        return new OutageReason();
    }

    /**
     * Create an instance of {@link LocationHazard }
     * 
     */
    public LocationHazard createLocationHazard() {
        return new LocationHazard();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link ReadingScheduleResult }
     * 
     */
    public ReadingScheduleResult createReadingScheduleResult() {
        return new ReadingScheduleResult();
    }

    /**
     * Create an instance of {@link TransformerWindings }
     * 
     */
    public TransformerWindings createTransformerWindings() {
        return new TransformerWindings();
    }

    /**
     * Create an instance of {@link BlockList }
     * 
     */
    public BlockList createBlockList() {
        return new BlockList();
    }

    /**
     * Create an instance of {@link WorkItemRelationships }
     * 
     */
    public WorkItemRelationships createWorkItemRelationships() {
        return new WorkItemRelationships();
    }

    /**
     * Create an instance of {@link MeterExchange }
     * 
     */
    public MeterExchange createMeterExchange() {
        return new MeterExchange();
    }

    /**
     * Create an instance of {@link CPRAdjustmentList }
     * 
     */
    public CPRAdjustmentList createCPRAdjustmentList() {
        return new CPRAdjustmentList();
    }

    /**
     * Create an instance of {@link TroubleCode }
     * 
     */
    public TroubleCode createTroubleCode() {
        return new TroubleCode();
    }

    /**
     * Create an instance of {@link GasMeterExchange }
     * 
     */
    public GasMeterExchange createGasMeterExchange() {
        return new GasMeterExchange();
    }

    /**
     * Create an instance of {@link WorkItemRef }
     * 
     */
    public WorkItemRef createWorkItemRef() {
        return new WorkItemRef();
    }

    /**
     * Create an instance of {@link ThermostatSchedule }
     * 
     */
    public ThermostatSchedule createThermostatSchedule() {
        return new ThermostatSchedule();
    }

    /**
     * Create an instance of {@link LocationOutageStatusReferable }
     * 
     */
    public LocationOutageStatusReferable createLocationOutageStatusReferable() {
        return new LocationOutageStatusReferable();
    }

    /**
     * Create an instance of {@link LaborComponents }
     * 
     */
    public LaborComponents createLaborComponents() {
        return new LaborComponents();
    }

    /**
     * Create an instance of {@link DemandResetEvent }
     * 
     */
    public DemandResetEvent createDemandResetEvent() {
        return new DemandResetEvent();
    }

    /**
     * Create an instance of {@link CapacitorBankSwitchesReferable }
     * 
     */
    public CapacitorBankSwitchesReferable createCapacitorBankSwitchesReferable() {
        return new CapacitorBankSwitchesReferable();
    }

    /**
     * Create an instance of {@link ScheduledItem }
     * 
     */
    public ScheduledItem createScheduledItem() {
        return new ScheduledItem();
    }

    /**
     * Create an instance of {@link Stations }
     * 
     */
    public Stations createStations() {
        return new Stations();
    }

    /**
     * Create an instance of {@link InductionMachineImpedances }
     * 
     */
    public InductionMachineImpedances createInductionMachineImpedances() {
        return new InductionMachineImpedances();
    }

    /**
     * Create an instance of {@link LineImpedances }
     * 
     */
    public LineImpedances createLineImpedances() {
        return new LineImpedances();
    }

    /**
     * Create an instance of {@link AssemblySource }
     * 
     */
    public AssemblySource createAssemblySource() {
        return new AssemblySource();
    }

    /**
     * Create an instance of {@link MeterInstallationHistory }
     * 
     */
    public MeterInstallationHistory createMeterInstallationHistory() {
        return new MeterInstallationHistory();
    }

    /**
     * Create an instance of {@link GasConnectivityModel }
     * 
     */
    public GasConnectivityModel createGasConnectivityModel() {
        return new GasConnectivityModel();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link OutageDurationEvent }
     * 
     */
    public OutageDurationEvent createOutageDurationEvent() {
        return new OutageDurationEvent();
    }

    /**
     * Create an instance of {@link Reclosers }
     * 
     */
    public Reclosers createReclosers() {
        return new Reclosers();
    }

    /**
     * Create an instance of {@link ShortCircuitAnalysisResult }
     * 
     */
    public ShortCircuitAnalysisResult createShortCircuitAnalysisResult() {
        return new ShortCircuitAnalysisResult();
    }

    /**
     * Create an instance of {@link LoadManagementDevices }
     * 
     */
    public LoadManagementDevices createLoadManagementDevices() {
        return new LoadManagementDevices();
    }

    /**
     * Create an instance of {@link AverageCost }
     * 
     */
    public AverageCost createAverageCost() {
        return new AverageCost();
    }

    /**
     * Create an instance of {@link ChargeableDevice }
     * 
     */
    public ChargeableDevice createChargeableDevice() {
        return new ChargeableDevice();
    }

    /**
     * Create an instance of {@link EndDeviceEvents }
     * 
     */
    public EndDeviceEvents createEndDeviceEvents() {
        return new EndDeviceEvents();
    }

    /**
     * Create an instance of {@link SchedulingResult }
     * 
     */
    public SchedulingResult createSchedulingResult() {
        return new SchedulingResult();
    }

    /**
     * Create an instance of {@link ConfigurationStatusItems }
     * 
     */
    public ConfigurationStatusItems createConfigurationStatusItems() {
        return new ConfigurationStatusItems();
    }

    /**
     * Create an instance of {@link ThermostatCurrentConfiguration }
     * 
     */
    public ThermostatCurrentConfiguration createThermostatCurrentConfiguration() {
        return new ThermostatCurrentConfiguration();
    }

    /**
     * Create an instance of {@link ServiceAgreement }
     * 
     */
    public ServiceAgreement createServiceAgreement() {
        return new ServiceAgreement();
    }

    /**
     * Create an instance of {@link InstrumentTransformers }
     * 
     */
    public InstrumentTransformers createInstrumentTransformers() {
        return new InstrumentTransformers();
    }

    /**
     * Create an instance of {@link Transformers }
     * 
     */
    public Transformers createTransformers() {
        return new Transformers();
    }

    /**
     * Create an instance of {@link CabinetContentsItems }
     * 
     */
    public CabinetContentsItems createCabinetContentsItems() {
        return new CabinetContentsItems();
    }

    /**
     * Create an instance of {@link Ch }
     * 
     */
    public Ch createCh() {
        return new Ch();
    }

    /**
     * Create an instance of {@link StreetLocation }
     * 
     */
    public StreetLocation createStreetLocation() {
        return new StreetLocation();
    }

    /**
     * Create an instance of {@link DeletedOutages }
     * 
     */
    public DeletedOutages createDeletedOutages() {
        return new DeletedOutages();
    }

    /**
     * Create an instance of {@link WorkItemSummary }
     * 
     */
    public WorkItemSummary createWorkItemSummary() {
        return new WorkItemSummary();
    }

    /**
     * Create an instance of {@link ReadingTypeCodeItem }
     * 
     */
    public ReadingTypeCodeItem createReadingTypeCodeItem() {
        return new ReadingTypeCodeItem();
    }

    /**
     * Create an instance of {@link ViewParameters }
     * 
     */
    public ViewParameters createViewParameters() {
        return new ViewParameters();
    }

    /**
     * Create an instance of {@link TrafficLight }
     * 
     */
    public TrafficLight createTrafficLight() {
        return new TrafficLight();
    }

    /**
     * Create an instance of {@link GMLLocations }
     * 
     */
    public GMLLocations createGMLLocations() {
        return new GMLLocations();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link GenericAnnotationFeature }
     * 
     */
    public GenericAnnotationFeature createGenericAnnotationFeature() {
        return new GenericAnnotationFeature();
    }

    /**
     * Create an instance of {@link OutageRemarkReferable }
     * 
     */
    public OutageRemarkReferable createOutageRemarkReferable() {
        return new OutageRemarkReferable();
    }

    /**
     * Create an instance of {@link CapacitorBank }
     * 
     */
    public CapacitorBank createCapacitorBank() {
        return new CapacitorBank();
    }

    /**
     * Create an instance of {@link ConductorEntry }
     * 
     */
    public ConductorEntry createConductorEntry() {
        return new ConductorEntry();
    }

    /**
     * Create an instance of {@link ReceivedElectricMeters }
     * 
     */
    public ReceivedElectricMeters createReceivedElectricMeters() {
        return new ReceivedElectricMeters();
    }

    /**
     * Create an instance of {@link ObjectDeletionRequest }
     * 
     */
    public ObjectDeletionRequest createObjectDeletionRequest() {
        return new ObjectDeletionRequest();
    }

    /**
     * Create an instance of {@link SynchronousMachineEntries }
     * 
     */
    public SynchronousMachineEntries createSynchronousMachineEntries() {
        return new SynchronousMachineEntries();
    }

    /**
     * Create an instance of {@link SetPoints }
     * 
     */
    public SetPoints createSetPoints() {
        return new SetPoints();
    }

    /**
     * Create an instance of {@link SwitchingSchedules }
     * 
     */
    public SwitchingSchedules createSwitchingSchedules() {
        return new SwitchingSchedules();
    }

    /**
     * Create an instance of {@link OtherServicePoint }
     * 
     */
    public OtherServicePoint createOtherServicePoint() {
        return new OtherServicePoint();
    }

    /**
     * Create an instance of {@link Recloser }
     * 
     */
    public Recloser createRecloser() {
        return new Recloser();
    }

    /**
     * Create an instance of {@link CPPSchedule }
     * 
     */
    public CPPSchedule createCPPSchedule() {
        return new CPPSchedule();
    }

    /**
     * Create an instance of {@link ChargeableDevicesReferable }
     * 
     */
    public ChargeableDevicesReferable createChargeableDevicesReferable() {
        return new ChargeableDevicesReferable();
    }

    /**
     * Create an instance of {@link CheckOption }
     * 
     */
    public CheckOption createCheckOption() {
        return new CheckOption();
    }

    /**
     * Create an instance of {@link FuseEntries }
     * 
     */
    public FuseEntries createFuseEntries() {
        return new FuseEntries();
    }

    /**
     * Create an instance of {@link AssetsReferable }
     * 
     */
    public AssetsReferable createAssetsReferable() {
        return new AssetsReferable();
    }

    /**
     * Create an instance of {@link OutageReportingCodes }
     * 
     */
    public OutageReportingCodes createOutageReportingCodes() {
        return new OutageReportingCodes();
    }

    /**
     * Create an instance of {@link ElectricServicePoint }
     * 
     */
    public ElectricServicePoint createElectricServicePoint() {
        return new ElectricServicePoint();
    }

    /**
     * Create an instance of {@link CumulativeDemand }
     * 
     */
    public CumulativeDemand createCumulativeDemand() {
        return new CumulativeDemand();
    }

    /**
     * Create an instance of {@link Measurements }
     * 
     */
    public Measurements createMeasurements() {
        return new Measurements();
    }

    /**
     * Create an instance of {@link PANDeviceRefs }
     * 
     */
    public PANDeviceRefs createPANDeviceRefs() {
        return new PANDeviceRefs();
    }

    /**
     * Create an instance of {@link InductionMachine }
     * 
     */
    public InductionMachine createInductionMachine() {
        return new InductionMachine();
    }

    /**
     * Create an instance of {@link AlternateContact }
     * 
     */
    public AlternateContact createAlternateContact() {
        return new AlternateContact();
    }

    /**
     * Create an instance of {@link OvercurrentDeviceBanks }
     * 
     */
    public OvercurrentDeviceBanks createOvercurrentDeviceBanks() {
        return new OvercurrentDeviceBanks();
    }

    /**
     * Create an instance of {@link AssociatedMetersList }
     * 
     */
    public AssociatedMetersList createAssociatedMetersList() {
        return new AssociatedMetersList();
    }

    /**
     * Create an instance of {@link Registers }
     * 
     */
    public Registers createRegisters() {
        return new Registers();
    }

    /**
     * Create an instance of {@link ContentReference }
     * 
     */
    public ContentReference createContentReference() {
        return new ContentReference();
    }

    /**
     * Create an instance of {@link AssociatedMeters }
     * 
     */
    public AssociatedMeters createAssociatedMeters() {
        return new AssociatedMeters();
    }

    /**
     * Create an instance of {@link AssetLocationHistoryItem }
     * 
     */
    public AssetLocationHistoryItem createAssetLocationHistoryItem() {
        return new AssetLocationHistoryItem();
    }

    /**
     * Create an instance of {@link SwitchingDeviceBank }
     * 
     */
    public SwitchingDeviceBank createSwitchingDeviceBank() {
        return new SwitchingDeviceBank();
    }

    /**
     * Create an instance of {@link OriginalOutage }
     * 
     */
    public OriginalOutage createOriginalOutage() {
        return new OriginalOutage();
    }

    /**
     * Create an instance of {@link UsagePointPriorities }
     * 
     */
    public UsagePointPriorities createUsagePointPriorities() {
        return new UsagePointPriorities();
    }

    /**
     * Create an instance of {@link PANInterfaceID }
     * 
     */
    public PANInterfaceID createPANInterfaceID() {
        return new PANInterfaceID();
    }

    /**
     * Create an instance of {@link AuthorizedCheckData }
     * 
     */
    public AuthorizedCheckData createAuthorizedCheckData() {
        return new AuthorizedCheckData();
    }

    /**
     * Create an instance of {@link MeterTypeGroup }
     * 
     */
    public MeterTypeGroup createMeterTypeGroup() {
        return new MeterTypeGroup();
    }

    /**
     * Create an instance of {@link CPRAdjustment }
     * 
     */
    public CPRAdjustment createCPRAdjustment() {
        return new CPRAdjustment();
    }

    /**
     * Create an instance of {@link PANSecurityToken }
     * 
     */
    public PANSecurityToken createPANSecurityToken() {
        return new PANSecurityToken();
    }

    /**
     * Create an instance of {@link LoadManagementDeviceRelays }
     * 
     */
    public LoadManagementDeviceRelays createLoadManagementDeviceRelays() {
        return new LoadManagementDeviceRelays();
    }

    /**
     * Create an instance of {@link AllowableTransactionTypes }
     * 
     */
    public AllowableTransactionTypes createAllowableTransactionTypes() {
        return new AllowableTransactionTypes();
    }

    /**
     * Create an instance of {@link Conduits }
     * 
     */
    public Conduits createConduits() {
        return new Conduits();
    }

    /**
     * Create an instance of {@link JointUse }
     * 
     */
    public JointUse createJointUse() {
        return new JointUse();
    }

    /**
     * Create an instance of {@link AffectedMeter }
     * 
     */
    public AffectedMeter createAffectedMeter() {
        return new AffectedMeter();
    }

    /**
     * Create an instance of {@link AttachmentUnlinkContainer }
     * 
     */
    public AttachmentUnlinkContainer createAttachmentUnlinkContainer() {
        return new AttachmentUnlinkContainer();
    }

    /**
     * Create an instance of {@link ReadingType }
     * 
     */
    public ReadingType createReadingType() {
        return new ReadingType();
    }

    /**
     * Create an instance of {@link ServiceOrder }
     * 
     */
    public ServiceOrder createServiceOrder() {
        return new ServiceOrder();
    }

    /**
     * Create an instance of {@link OutageReasonCodeList }
     * 
     */
    public OutageReasonCodeList createOutageReasonCodeList() {
        return new OutageReasonCodeList();
    }

    /**
     * Create an instance of {@link ResponsiblePerson }
     * 
     */
    public ResponsiblePerson createResponsiblePerson() {
        return new ResponsiblePerson();
    }

    /**
     * Create an instance of {@link ThermostatScheduleTime }
     * 
     */
    public ThermostatScheduleTime createThermostatScheduleTime() {
        return new ThermostatScheduleTime();
    }

    /**
     * Create an instance of {@link PANAddressingGroup }
     * 
     */
    public PANAddressingGroup createPANAddressingGroup() {
        return new PANAddressingGroup();
    }

    /**
     * Create an instance of {@link ElectricMeterExchanges }
     * 
     */
    public ElectricMeterExchanges createElectricMeterExchanges() {
        return new ElectricMeterExchanges();
    }

    /**
     * Create an instance of {@link AdjustmentItems }
     * 
     */
    public AdjustmentItems createAdjustmentItems() {
        return new AdjustmentItems();
    }

    /**
     * Create an instance of {@link OutageRef }
     * 
     */
    public OutageRef createOutageRef() {
        return new OutageRef();
    }

    /**
     * Create an instance of {@link OutageHistoryEvent }
     * 
     */
    public OutageHistoryEvent createOutageHistoryEvent() {
        return new OutageHistoryEvent();
    }

    /**
     * Create an instance of {@link ThermostatScheduleDay }
     * 
     */
    public ThermostatScheduleDay createThermostatScheduleDay() {
        return new ThermostatScheduleDay();
    }

    /**
     * Create an instance of {@link ECheckPayments }
     * 
     */
    public ECheckPayments createECheckPayments() {
        return new ECheckPayments();
    }

    /**
     * Create an instance of {@link OtherMeterExchange }
     * 
     */
    public OtherMeterExchange createOtherMeterExchange() {
        return new OtherMeterExchange();
    }

    /**
     * Create an instance of {@link ParameterDefs }
     * 
     */
    public ParameterDefs createParameterDefs() {
        return new ParameterDefs();
    }

    /**
     * Create an instance of {@link UsageItems }
     * 
     */
    public UsageItems createUsageItems() {
        return new UsageItems();
    }

    /**
     * Create an instance of {@link J1939TroubleCode }
     * 
     */
    public J1939TroubleCode createJ1939TroubleCode() {
        return new J1939TroubleCode();
    }

    /**
     * Create an instance of {@link OtherCode }
     * 
     */
    public OtherCode createOtherCode() {
        return new OtherCode();
    }

    /**
     * Create an instance of {@link Lead }
     * 
     */
    public Lead createLead() {
        return new Lead();
    }

    /**
     * Create an instance of {@link ReceivableType }
     * 
     */
    public ReceivableType createReceivableType() {
        return new ReceivableType();
    }

    /**
     * Create an instance of {@link WorkLocation }
     * 
     */
    public WorkLocation createWorkLocation() {
        return new WorkLocation();
    }

    /**
     * Create an instance of {@link AverageConsumption }
     * 
     */
    public AverageConsumption createAverageConsumption() {
        return new AverageConsumption();
    }

    /**
     * Create an instance of {@link ViewRequest }
     * 
     */
    public ViewRequest createViewRequest() {
        return new ViewRequest();
    }

    /**
     * Create an instance of {@link SupplementalNotes }
     * 
     */
    public SupplementalNotes createSupplementalNotes() {
        return new SupplementalNotes();
    }

    /**
     * Create an instance of {@link MixedMeterGroups }
     * 
     */
    public MixedMeterGroups createMixedMeterGroups() {
        return new MixedMeterGroups();
    }

    /**
     * Create an instance of {@link ConfigurationGroup }
     * 
     */
    public ConfigurationGroup createConfigurationGroup() {
        return new ConfigurationGroup();
    }

    /**
     * Create an instance of {@link CurrentValue }
     * 
     */
    public CurrentValue createCurrentValue() {
        return new CurrentValue();
    }

    /**
     * Create an instance of {@link PowerLimitationValue }
     * 
     */
    public PowerLimitationValue createPowerLimitationValue() {
        return new PowerLimitationValue();
    }

    /**
     * Create an instance of {@link PricingPeriods }
     * 
     */
    public PricingPeriods createPricingPeriods() {
        return new PricingPeriods();
    }

    /**
     * Create an instance of {@link Jumpers }
     * 
     */
    public Jumpers createJumpers() {
        return new Jumpers();
    }

    /**
     * Create an instance of {@link BufferedObjectRefs }
     * 
     */
    public BufferedObjectRefs createBufferedObjectRefs() {
        return new BufferedObjectRefs();
    }

    /**
     * Create an instance of {@link PeriodicSchedule }
     * 
     */
    public PeriodicSchedule createPeriodicSchedule() {
        return new PeriodicSchedule();
    }

    /**
     * Create an instance of {@link InternetOutage }
     * 
     */
    public InternetOutage createInternetOutage() {
        return new InternetOutage();
    }

    /**
     * Create an instance of {@link ServiceCharacteristics }
     * 
     */
    public ServiceCharacteristics createServiceCharacteristics() {
        return new ServiceCharacteristics();
    }

    /**
     * Create an instance of {@link Blocks }
     * 
     */
    public Blocks createBlocks() {
        return new Blocks();
    }

    /**
     * Create an instance of {@link PayableItems }
     * 
     */
    public PayableItems createPayableItems() {
        return new PayableItems();
    }

    /**
     * Create an instance of {@link ReadingTypeCodeItems }
     * 
     */
    public ReadingTypeCodeItems createReadingTypeCodeItems() {
        return new ReadingTypeCodeItems();
    }

    /**
     * Create an instance of {@link MeterGroups }
     * 
     */
    public MeterGroups createMeterGroups() {
        return new MeterGroups();
    }

    /**
     * Create an instance of {@link CDCustomers }
     * 
     */
    public CDCustomers createCDCustomers() {
        return new CDCustomers();
    }

    /**
     * Create an instance of {@link DomainMember }
     * 
     */
    public DomainMember createDomainMember() {
        return new DomainMember();
    }

    /**
     * Create an instance of {@link OutageWorkUpdate }
     * 
     */
    public OutageWorkUpdate createOutageWorkUpdate() {
        return new OutageWorkUpdate();
    }

    /**
     * Create an instance of {@link ConductorEntries }
     * 
     */
    public ConductorEntries createConductorEntries() {
        return new ConductorEntries();
    }

    /**
     * Create an instance of {@link ConductorSize }
     * 
     */
    public ConductorSize createConductorSize() {
        return new ConductorSize();
    }

    /**
     * Create an instance of {@link WaterConnectivityModels }
     * 
     */
    public WaterConnectivityModels createWaterConnectivityModels() {
        return new WaterConnectivityModels();
    }

    /**
     * Create an instance of {@link EndDeviceEventReset }
     * 
     */
    public EndDeviceEventReset createEndDeviceEventReset() {
        return new EndDeviceEventReset();
    }

    /**
     * Create an instance of {@link FormattedBlockTemplate }
     * 
     */
    public FormattedBlockTemplate createFormattedBlockTemplate() {
        return new FormattedBlockTemplate();
    }

    /**
     * Create an instance of {@link ACLineSegment }
     * 
     */
    public ACLineSegment createACLineSegment() {
        return new ACLineSegment();
    }

    /**
     * Create an instance of {@link TelecomOutages }
     * 
     */
    public TelecomOutages createTelecomOutages() {
        return new TelecomOutages();
    }

    /**
     * Create an instance of {@link WorkItemDeletions }
     * 
     */
    public WorkItemDeletions createWorkItemDeletions() {
        return new WorkItemDeletions();
    }

    /**
     * Create an instance of {@link GasMeterExchanges }
     * 
     */
    public GasMeterExchanges createGasMeterExchanges() {
        return new GasMeterExchanges();
    }

    /**
     * Create an instance of {@link Regulators }
     * 
     */
    public Regulators createRegulators() {
        return new Regulators();
    }

    /**
     * Create an instance of {@link MeterBases }
     * 
     */
    public MeterBases createMeterBases() {
        return new MeterBases();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link SwitchingOrderEvent }
     * 
     */
    public SwitchingOrderEvent createSwitchingOrderEvent() {
        return new SwitchingOrderEvent();
    }

    /**
     * Create an instance of {@link SupplementalNote }
     * 
     */
    public SupplementalNote createSupplementalNote() {
        return new SupplementalNote();
    }

    /**
     * Create an instance of {@link AbilityRefs }
     * 
     */
    public AbilityRefs createAbilityRefs() {
        return new AbilityRefs();
    }

    /**
     * Create an instance of {@link CapacitorPhaseUnit }
     * 
     */
    public CapacitorPhaseUnit createCapacitorPhaseUnit() {
        return new CapacitorPhaseUnit();
    }

    /**
     * Create an instance of {@link Design }
     * 
     */
    public Design createDesign() {
        return new Design();
    }

    /**
     * Create an instance of {@link ElectricConnectivityModels }
     * 
     */
    public ElectricConnectivityModels createElectricConnectivityModels() {
        return new ElectricConnectivityModels();
    }

    /**
     * Create an instance of {@link DemandCharge }
     * 
     */
    public DemandCharge createDemandCharge() {
        return new DemandCharge();
    }

    /**
     * Create an instance of {@link ResultingOutages }
     * 
     */
    public ResultingOutages createResultingOutages() {
        return new ResultingOutages();
    }

    /**
     * Create an instance of {@link WorkOrderAccountingFields }
     * 
     */
    public WorkOrderAccountingFields createWorkOrderAccountingFields() {
        return new WorkOrderAccountingFields();
    }

    /**
     * Create an instance of {@link EndDeviceEventTypeItem }
     * 
     */
    public EndDeviceEventTypeItem createEndDeviceEventTypeItem() {
        return new EndDeviceEventTypeItem();
    }

    /**
     * Create an instance of {@link TransformerEntry }
     * 
     */
    public TransformerEntry createTransformerEntry() {
        return new TransformerEntry();
    }

    /**
     * Create an instance of {@link PropaneServicePoints }
     * 
     */
    public PropaneServicePoints createPropaneServicePoints() {
        return new PropaneServicePoints();
    }

    /**
     * Create an instance of {@link MeterSeal }
     * 
     */
    public MeterSeal createMeterSeal() {
        return new MeterSeal();
    }

    /**
     * Create an instance of {@link WorkItemDeletionRequest }
     * 
     */
    public WorkItemDeletionRequest createWorkItemDeletionRequest() {
        return new WorkItemDeletionRequest();
    }

    /**
     * Create an instance of {@link ElectricMeteringPoint }
     * 
     */
    public ElectricMeteringPoint createElectricMeteringPoint() {
        return new ElectricMeteringPoint();
    }

    /**
     * Create an instance of {@link MeterGroup }
     * 
     */
    public MeterGroup createMeterGroup() {
        return new MeterGroup();
    }

    /**
     * Create an instance of {@link SecurityLights }
     * 
     */
    public SecurityLights createSecurityLights() {
        return new SecurityLights();
    }

    /**
     * Create an instance of {@link CustomerCallStatus }
     * 
     */
    public CustomerCallStatus createCustomerCallStatus() {
        return new CustomerCallStatus();
    }

    /**
     * Create an instance of {@link Chs }
     * 
     */
    public Chs createChs() {
        return new Chs();
    }

    /**
     * Create an instance of {@link WaterNameplate }
     * 
     */
    public WaterNameplate createWaterNameplate() {
        return new WaterNameplate();
    }

    /**
     * Create an instance of {@link PriceTiers }
     * 
     */
    public PriceTiers createPriceTiers() {
        return new PriceTiers();
    }

    /**
     * Create an instance of {@link DateTimeRequest }
     * 
     */
    public DateTimeRequest createDateTimeRequest() {
        return new DateTimeRequest();
    }

    /**
     * Create an instance of {@link FailedDevices }
     * 
     */
    public FailedDevices createFailedDevices() {
        return new FailedDevices();
    }

    /**
     * Create an instance of {@link ReadingSchedule }
     * 
     */
    public ReadingSchedule createReadingSchedule() {
        return new ReadingSchedule();
    }

    /**
     * Create an instance of {@link TriggeringEvent }
     * 
     */
    public TriggeringEvent createTriggeringEvent() {
        return new TriggeringEvent();
    }

    /**
     * Create an instance of {@link PpmStatus }
     * 
     */
    public PpmStatus createPpmStatus() {
        return new PpmStatus();
    }

    /**
     * Create an instance of {@link PowerSystemDevice }
     * 
     */
    public PowerSystemDevice createPowerSystemDevice() {
        return new PowerSystemDevice();
    }

    /**
     * Create an instance of {@link SectionDrop }
     * 
     */
    public SectionDrop createSectionDrop() {
        return new SectionDrop();
    }

    /**
     * Create an instance of {@link ElectricServicePoints }
     * 
     */
    public ElectricServicePoints createElectricServicePoints() {
        return new ElectricServicePoints();
    }

    /**
     * Create an instance of {@link OtherNameplate }
     * 
     */
    public OtherNameplate createOtherNameplate() {
        return new OtherNameplate();
    }

    /**
     * Create an instance of {@link AggregatedGroups }
     * 
     */
    public AggregatedGroups createAggregatedGroups() {
        return new AggregatedGroups();
    }

    /**
     * Create an instance of {@link SpatialFeaturesContainer }
     * 
     */
    public SpatialFeaturesContainer createSpatialFeaturesContainer() {
        return new SpatialFeaturesContainer();
    }

    /**
     * Create an instance of {@link SecondaryConductorEntry }
     * 
     */
    public SecondaryConductorEntry createSecondaryConductorEntry() {
        return new SecondaryConductorEntry();
    }

    /**
     * Create an instance of {@link MaterialComponent }
     * 
     */
    public MaterialComponent createMaterialComponent() {
        return new MaterialComponent();
    }

    /**
     * Create an instance of {@link CardIDChoice }
     * 
     */
    public CardIDChoice createCardIDChoice() {
        return new CardIDChoice();
    }

    /**
     * Create an instance of {@link ElectricMeterGroups }
     * 
     */
    public ElectricMeterGroups createElectricMeterGroups() {
        return new ElectricMeterGroups();
    }

    /**
     * Create an instance of {@link SpatialFeaturesReferable }
     * 
     */
    public SpatialFeaturesReferable createSpatialFeaturesReferable() {
        return new SpatialFeaturesReferable();
    }

    /**
     * Create an instance of {@link LoadManagementDeviceRelay }
     * 
     */
    public LoadManagementDeviceRelay createLoadManagementDeviceRelay() {
        return new LoadManagementDeviceRelay();
    }

    /**
     * Create an instance of {@link PaymentExtensions }
     * 
     */
    public PaymentExtensions createPaymentExtensions() {
        return new PaymentExtensions();
    }

    /**
     * Create an instance of {@link Circuits }
     * 
     */
    public Circuits createCircuits() {
        return new Circuits();
    }

    /**
     * Create an instance of {@link OvercurrentDeviceBank }
     * 
     */
    public OvercurrentDeviceBank createOvercurrentDeviceBank() {
        return new OvercurrentDeviceBank();
    }

    /**
     * Create an instance of {@link SwitchOnValue }
     * 
     */
    public SwitchOnValue createSwitchOnValue() {
        return new SwitchOnValue();
    }

    /**
     * Create an instance of {@link Tender }
     * 
     */
    public Tender createTender() {
        return new Tender();
    }

    /**
     * Create an instance of {@link GasPressure }
     * 
     */
    public GasPressure createGasPressure() {
        return new GasPressure();
    }

    /**
     * Create an instance of {@link ElectricLocationFields }
     * 
     */
    public ElectricLocationFields createElectricLocationFields() {
        return new ElectricLocationFields();
    }

    /**
     * Create an instance of {@link ReplacementMeter }
     * 
     */
    public ReplacementMeter createReplacementMeter() {
        return new ReplacementMeter();
    }

    /**
     * Create an instance of {@link MeasurementItems }
     * 
     */
    public MeasurementItems createMeasurementItems() {
        return new MeasurementItems();
    }

    /**
     * Create an instance of {@link CoincidentalValue }
     * 
     */
    public CoincidentalValue createCoincidentalValue() {
        return new CoincidentalValue();
    }

    /**
     * Create an instance of {@link WarehouseLocations }
     * 
     */
    public WarehouseLocations createWarehouseLocations() {
        return new WarehouseLocations();
    }

    /**
     * Create an instance of {@link Assemblies }
     * 
     */
    public Assemblies createAssemblies() {
        return new Assemblies();
    }

    /**
     * Create an instance of {@link ExternalRequest }
     * 
     */
    public ExternalRequest createExternalRequest() {
        return new ExternalRequest();
    }

    /**
     * Create an instance of {@link CashPayment }
     * 
     */
    public CashPayment createCashPayment() {
        return new CashPayment();
    }

    /**
     * Create an instance of {@link PANGroupIDs }
     * 
     */
    public PANGroupIDs createPANGroupIDs() {
        return new PANGroupIDs();
    }

    /**
     * Create an instance of {@link RateComponent }
     * 
     */
    public RateComponent createRateComponent() {
        return new RateComponent();
    }

    /**
     * Create an instance of {@link LocationContact }
     * 
     */
    public LocationContact createLocationContact() {
        return new LocationContact();
    }

    /**
     * Create an instance of {@link AccumulatedValue }
     * 
     */
    public AccumulatedValue createAccumulatedValue() {
        return new AccumulatedValue();
    }

    /**
     * Create an instance of {@link ViewParameter }
     * 
     */
    public ViewParameter createViewParameter() {
        return new ViewParameter();
    }

    /**
     * Create an instance of {@link PropaneLocationFields }
     * 
     */
    public PropaneLocationFields createPropaneLocationFields() {
        return new PropaneLocationFields();
    }

    /**
     * Create an instance of {@link GasServicePoint }
     * 
     */
    public GasServicePoint createGasServicePoint() {
        return new GasServicePoint();
    }

    /**
     * Create an instance of {@link Riser }
     * 
     */
    public Riser createRiser() {
        return new Riser();
    }

    /**
     * Create an instance of {@link PremisesObjectList }
     * 
     */
    public PremisesObjectList createPremisesObjectList() {
        return new PremisesObjectList();
    }

    /**
     * Create an instance of {@link WorkProgressItems }
     * 
     */
    public WorkProgressItems createWorkProgressItems() {
        return new WorkProgressItems();
    }

    /**
     * Create an instance of {@link PpmLocation }
     * 
     */
    public PpmLocation createPpmLocation() {
        return new PpmLocation();
    }

    /**
     * Create an instance of {@link ReturnedCatalogEntries }
     * 
     */
    public ReturnedCatalogEntries createReturnedCatalogEntries() {
        return new ReturnedCatalogEntries();
    }

    /**
     * Create an instance of {@link WorkType }
     * 
     */
    public WorkType createWorkType() {
        return new WorkType();
    }

    /**
     * Create an instance of {@link OvercurrentDevices }
     * 
     */
    public OvercurrentDevices createOvercurrentDevices() {
        return new OvercurrentDevices();
    }

    /**
     * Create an instance of {@link ResourceComposition }
     * 
     */
    public ResourceComposition createResourceComposition() {
        return new ResourceComposition();
    }

    /**
     * Create an instance of {@link ReadingQualityCodeEntry }
     * 
     */
    public ReadingQualityCodeEntry createReadingQualityCodeEntry() {
        return new ReadingQualityCodeEntry();
    }

    /**
     * Create an instance of {@link WorkScheduleChange }
     * 
     */
    public WorkScheduleChange createWorkScheduleChange() {
        return new WorkScheduleChange();
    }

    /**
     * Create an instance of {@link Skills }
     * 
     */
    public Skills createSkills() {
        return new Skills();
    }

    /**
     * Create an instance of {@link RegistrationStatus }
     * 
     */
    public RegistrationStatus createRegistrationStatus() {
        return new RegistrationStatus();
    }

    /**
     * Create an instance of {@link ConstructionItems }
     * 
     */
    public ConstructionItems createConstructionItems() {
        return new ConstructionItems();
    }

    /**
     * Create an instance of {@link PointSubscriptionList }
     * 
     */
    public PointSubscriptionList createPointSubscriptionList() {
        return new PointSubscriptionList();
    }

    /**
     * Create an instance of {@link InductionMachineEntry }
     * 
     */
    public InductionMachineEntry createInductionMachineEntry() {
        return new InductionMachineEntry();
    }

    /**
     * Create an instance of {@link WorkOrderUpdate }
     * 
     */
    public WorkOrderUpdate createWorkOrderUpdate() {
        return new WorkOrderUpdate();
    }

    /**
     * Create an instance of {@link PremisesDisplayBillingMessages }
     * 
     */
    public PremisesDisplayBillingMessages createPremisesDisplayBillingMessages() {
        return new PremisesDisplayBillingMessages();
    }

    /**
     * Create an instance of {@link MergedOutage }
     * 
     */
    public MergedOutage createMergedOutage() {
        return new MergedOutage();
    }

    /**
     * Create an instance of {@link PhaseItems }
     * 
     */
    public PhaseItems createPhaseItems() {
        return new PhaseItems();
    }

    /**
     * Create an instance of {@link SynchronousMachineImpedances }
     * 
     */
    public SynchronousMachineImpedances createSynchronousMachineImpedances() {
        return new SynchronousMachineImpedances();
    }

    /**
     * Create an instance of {@link IntervalChannel }
     * 
     */
    public IntervalChannel createIntervalChannel() {
        return new IntervalChannel();
    }

    /**
     * Create an instance of {@link Jumper }
     * 
     */
    public Jumper createJumper() {
        return new Jumper();
    }

    /**
     * Create an instance of {@link RequiredObjectTypes }
     * 
     */
    public RequiredObjectTypes createRequiredObjectTypes() {
        return new RequiredObjectTypes();
    }

    /**
     * Create an instance of {@link WaterServicePoint }
     * 
     */
    public WaterServicePoint createWaterServicePoint() {
        return new WaterServicePoint();
    }

    /**
     * Create an instance of {@link PaymentMode }
     * 
     */
    public PaymentMode createPaymentMode() {
        return new PaymentMode();
    }

    /**
     * Create an instance of {@link TimeToCall }
     * 
     */
    public TimeToCall createTimeToCall() {
        return new TimeToCall();
    }

    /**
     * Create an instance of {@link CumulativeDrop }
     * 
     */
    public CumulativeDrop createCumulativeDrop() {
        return new CumulativeDrop();
    }

    /**
     * Create an instance of {@link AssetHistoryEventsReferable }
     * 
     */
    public AssetHistoryEventsReferable createAssetHistoryEventsReferable() {
        return new AssetHistoryEventsReferable();
    }

    /**
     * Create an instance of {@link Elbow }
     * 
     */
    public Elbow createElbow() {
        return new Elbow();
    }

    /**
     * Create an instance of {@link ValueList }
     * 
     */
    public ValueList createValueList() {
        return new ValueList();
    }

    /**
     * Create an instance of {@link LineConstructionEntries }
     * 
     */
    public LineConstructionEntries createLineConstructionEntries() {
        return new LineConstructionEntries();
    }

    /**
     * Create an instance of {@link WorkStatusDetail }
     * 
     */
    public WorkStatusDetail createWorkStatusDetail() {
        return new WorkStatusDetail();
    }

    /**
     * Create an instance of {@link ResourceMemberRef }
     * 
     */
    public ResourceMemberRef createResourceMemberRef() {
        return new ResourceMemberRef();
    }

    /**
     * Create an instance of {@link PayableItemsList }
     * 
     */
    public PayableItemsList createPayableItemsList() {
        return new PayableItemsList();
    }

    /**
     * Create an instance of {@link WorkOrderSelection }
     * 
     */
    public WorkOrderSelection createWorkOrderSelection() {
        return new WorkOrderSelection();
    }

    /**
     * Create an instance of {@link MeterHistoryEvent }
     * 
     */
    public MeterHistoryEvent createMeterHistoryEvent() {
        return new MeterHistoryEvent();
    }

    /**
     * Create an instance of {@link BreakerEntry }
     * 
     */
    public BreakerEntry createBreakerEntry() {
        return new BreakerEntry();
    }

    /**
     * Create an instance of {@link LineEnvironmentalAttributesEntries }
     * 
     */
    public LineEnvironmentalAttributesEntries createLineEnvironmentalAttributesEntries() {
        return new LineEnvironmentalAttributesEntries();
    }

    /**
     * Create an instance of {@link ROWAttributes }
     * 
     */
    public ROWAttributes createROWAttributes() {
        return new ROWAttributes();
    }

    /**
     * Create an instance of {@link IdentifierChoice }
     * 
     */
    public IdentifierChoice createIdentifierChoice() {
        return new IdentifierChoice();
    }

    /**
     * Create an instance of {@link GasFlow }
     * 
     */
    public GasFlow createGasFlow() {
        return new GasFlow();
    }

    /**
     * Create an instance of {@link CreatedContainer }
     * 
     */
    public CreatedContainer createCreatedContainer() {
        return new CreatedContainer();
    }

    /**
     * Create an instance of {@link ReadingValue }
     * 
     */
    public ReadingValue createReadingValue() {
        return new ReadingValue();
    }

    /**
     * Create an instance of {@link AlternateContacts }
     * 
     */
    public AlternateContacts createAlternateContacts() {
        return new AlternateContacts();
    }

    /**
     * Create an instance of {@link Fuse }
     * 
     */
    public Fuse createFuse() {
        return new Fuse();
    }

    /**
     * Create an instance of {@link WorkUnassignment }
     * 
     */
    public WorkUnassignment createWorkUnassignment() {
        return new WorkUnassignment();
    }

    /**
     * Create an instance of {@link ServicePriorities }
     * 
     */
    public ServicePriorities createServicePriorities() {
        return new ServicePriorities();
    }

    /**
     * Create an instance of {@link LaborItemList }
     * 
     */
    public LaborItemList createLaborItemList() {
        return new LaborItemList();
    }

    /**
     * Create an instance of {@link WorkItemRefs }
     * 
     */
    public WorkItemRefs createWorkItemRefs() {
        return new WorkItemRefs();
    }

    /**
     * Create an instance of {@link CPRs }
     * 
     */
    public CPRs createCPRs() {
        return new CPRs();
    }

    /**
     * Create an instance of {@link GasMeterGroups }
     * 
     */
    public GasMeterGroups createGasMeterGroups() {
        return new GasMeterGroups();
    }

    /**
     * Create an instance of {@link BackSpans }
     * 
     */
    public BackSpans createBackSpans() {
        return new BackSpans();
    }

    /**
     * Create an instance of {@link AssetDetails }
     * 
     */
    public AssetDetails createAssetDetails() {
        return new AssetDetails();
    }

    /**
     * Create an instance of {@link LocationReferences }
     * 
     */
    public LocationReferences createLocationReferences() {
        return new LocationReferences();
    }

    /**
     * Create an instance of {@link ServiceAction }
     * 
     */
    public ServiceAction createServiceAction() {
        return new ServiceAction();
    }

    /**
     * Create an instance of {@link DisplayFormat }
     * 
     */
    public DisplayFormat createDisplayFormat() {
        return new DisplayFormat();
    }

    /**
     * Create an instance of {@link ScheduleConstraints }
     * 
     */
    public ScheduleConstraints createScheduleConstraints() {
        return new ScheduleConstraints();
    }

    /**
     * Create an instance of {@link Fuses }
     * 
     */
    public Fuses createFuses() {
        return new Fuses();
    }

    /**
     * Create an instance of {@link RequiredAbilityItem }
     * 
     */
    public RequiredAbilityItem createRequiredAbilityItem() {
        return new RequiredAbilityItem();
    }

    /**
     * Create an instance of {@link OutageRefReferable }
     * 
     */
    public OutageRefReferable createOutageRefReferable() {
        return new OutageRefReferable();
    }

    /**
     * Create an instance of {@link WarehouseLocation }
     * 
     */
    public WarehouseLocation createWarehouseLocation() {
        return new WarehouseLocation();
    }

    /**
     * Create an instance of {@link GenericPolygonFeature }
     * 
     */
    public GenericPolygonFeature createGenericPolygonFeature() {
        return new GenericPolygonFeature();
    }

    /**
     * Create an instance of {@link MeasurementDevices }
     * 
     */
    public MeasurementDevices createMeasurementDevices() {
        return new MeasurementDevices();
    }

    /**
     * Create an instance of {@link WindingAttributes }
     * 
     */
    public WindingAttributes createWindingAttributes() {
        return new WindingAttributes();
    }

    /**
     * Create an instance of {@link AssetLocationHistoryItems }
     * 
     */
    public AssetLocationHistoryItems createAssetLocationHistoryItems() {
        return new AssetLocationHistoryItems();
    }

    /**
     * Create an instance of {@link ElectricMeterExchange }
     * 
     */
    public ElectricMeterExchange createElectricMeterExchange() {
        return new ElectricMeterExchange();
    }

    /**
     * Create an instance of {@link WorkOrders }
     * 
     */
    public WorkOrders createWorkOrders() {
        return new WorkOrders();
    }

    /**
     * Create an instance of {@link Conduit }
     * 
     */
    public Conduit createConduit() {
        return new Conduit();
    }

    /**
     * Create an instance of {@link ClearanceTag }
     * 
     */
    public ClearanceTag createClearanceTag() {
        return new ClearanceTag();
    }

    /**
     * Create an instance of {@link DaysOfWeek }
     * 
     */
    public DaysOfWeek createDaysOfWeek() {
        return new DaysOfWeek();
    }

    /**
     * Create an instance of {@link AssetRequestFields }
     * 
     */
    public AssetRequestFields createAssetRequestFields() {
        return new AssetRequestFields();
    }

    /**
     * Create an instance of {@link PredictedDeviceStatus }
     * 
     */
    public PredictedDeviceStatus createPredictedDeviceStatus() {
        return new PredictedDeviceStatus();
    }

    /**
     * Create an instance of {@link PricingEventStatus }
     * 
     */
    public PricingEventStatus createPricingEventStatus() {
        return new PricingEventStatus();
    }

    /**
     * Create an instance of {@link AdjustmentItem }
     * 
     */
    public AdjustmentItem createAdjustmentItem() {
        return new AdjustmentItem();
    }

    /**
     * Create an instance of {@link WorkItemRelationship }
     * 
     */
    public WorkItemRelationship createWorkItemRelationship() {
        return new WorkItemRelationship();
    }

    /**
     * Create an instance of {@link ChannelList }
     * 
     */
    public ChannelList createChannelList() {
        return new ChannelList();
    }

    /**
     * Create an instance of {@link BillingStatusItem }
     * 
     */
    public BillingStatusItem createBillingStatusItem() {
        return new BillingStatusItem();
    }

    /**
     * Create an instance of {@link CPRAllocation }
     * 
     */
    public CPRAllocation createCPRAllocation() {
        return new CPRAllocation();
    }

    /**
     * Create an instance of {@link ReceivedGasMeter }
     * 
     */
    public ReceivedGasMeter createReceivedGasMeter() {
        return new ReceivedGasMeter();
    }

    /**
     * Create an instance of {@link OutageCustomer }
     * 
     */
    public OutageCustomer createOutageCustomer() {
        return new OutageCustomer();
    }

    /**
     * Create an instance of {@link Feeder }
     * 
     */
    public Feeder createFeeder() {
        return new Feeder();
    }

    /**
     * Create an instance of {@link Worker }
     * 
     */
    public Worker createWorker() {
        return new Worker();
    }

    /**
     * Create an instance of {@link WorkOrderReference }
     * 
     */
    public WorkOrderReference createWorkOrderReference() {
        return new WorkOrderReference();
    }

    /**
     * Create an instance of {@link Meter }
     * 
     */
    public Meter createMeter() {
        return new Meter();
    }

    /**
     * Create an instance of {@link ACLineSegments }
     * 
     */
    public ACLineSegments createACLineSegments() {
        return new ACLineSegments();
    }

    /**
     * Create an instance of {@link ConduitContentsRef }
     * 
     */
    public ConduitContentsRef createConduitContentsRef() {
        return new ConduitContentsRef();
    }

    /**
     * Create an instance of {@link TemperatureTierStructure }
     * 
     */
    public TemperatureTierStructure createTemperatureTierStructure() {
        return new TemperatureTierStructure();
    }

    /**
     * Create an instance of {@link DRProgram }
     * 
     */
    public DRProgram createDRProgram() {
        return new DRProgram();
    }

    /**
     * Create an instance of {@link SwitchEntry }
     * 
     */
    public SwitchEntry createSwitchEntry() {
        return new SwitchEntry();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link WorkProgresses }
     * 
     */
    public WorkProgresses createWorkProgresses() {
        return new WorkProgresses();
    }

    /**
     * Create an instance of {@link AccountDeposits }
     * 
     */
    public AccountDeposits createAccountDeposits() {
        return new AccountDeposits();
    }

    /**
     * Create an instance of {@link SpanGuys }
     * 
     */
    public SpanGuys createSpanGuys() {
        return new SpanGuys();
    }

    /**
     * Create an instance of {@link ReceivedPropaneMeter }
     * 
     */
    public ReceivedPropaneMeter createReceivedPropaneMeter() {
        return new ReceivedPropaneMeter();
    }

    /**
     * Create an instance of {@link LocationPriority }
     * 
     */
    public LocationPriority createLocationPriority() {
        return new LocationPriority();
    }

    /**
     * Create an instance of {@link WorkSchedulingItems }
     * 
     */
    public WorkSchedulingItems createWorkSchedulingItems() {
        return new WorkSchedulingItems();
    }

    /**
     * Create an instance of {@link RegulatorBank }
     * 
     */
    public RegulatorBank createRegulatorBank() {
        return new RegulatorBank();
    }

    /**
     * Create an instance of {@link CommunicationsAddress }
     * 
     */
    public CommunicationsAddress createCommunicationsAddress() {
        return new CommunicationsAddress();
    }

    /**
     * Create an instance of {@link SpatialDetails }
     * 
     */
    public SpatialDetails createSpatialDetails() {
        return new SpatialDetails();
    }

    /**
     * Create an instance of {@link AuthorizedCCData }
     * 
     */
    public AuthorizedCCData createAuthorizedCCData() {
        return new AuthorizedCCData();
    }

    /**
     * Create an instance of {@link BillingAccountLoad }
     * 
     */
    public BillingAccountLoad createBillingAccountLoad() {
        return new BillingAccountLoad();
    }

    /**
     * Create an instance of {@link LoadManagementDevice }
     * 
     */
    public LoadManagementDevice createLoadManagementDevice() {
        return new LoadManagementDevice();
    }

    /**
     * Create an instance of {@link SectionalizerEntries }
     * 
     */
    public SectionalizerEntries createSectionalizerEntries() {
        return new SectionalizerEntries();
    }

    /**
     * Create an instance of {@link OutageElementStatuses }
     * 
     */
    public OutageElementStatuses createOutageElementStatuses() {
        return new OutageElementStatuses();
    }

    /**
     * Create an instance of {@link ElectricOutage }
     * 
     */
    public ElectricOutage createElectricOutage() {
        return new ElectricOutage();
    }

    /**
     * Create an instance of {@link DemandResponseEvent }
     * 
     */
    public DemandResponseEvent createDemandResponseEvent() {
        return new DemandResponseEvent();
    }

    /**
     * Create an instance of {@link LoadMixEntry }
     * 
     */
    public LoadMixEntry createLoadMixEntry() {
        return new LoadMixEntry();
    }

    /**
     * Create an instance of {@link CapacitorBanks }
     * 
     */
    public CapacitorBanks createCapacitorBanks() {
        return new CapacitorBanks();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link PossibleWorkPriorities }
     * 
     */
    public PossibleWorkPriorities createPossibleWorkPriorities() {
        return new PossibleWorkPriorities();
    }

    /**
     * Create an instance of {@link AccountDeposit }
     * 
     */
    public AccountDeposit createAccountDeposit() {
        return new AccountDeposit();
    }

    /**
     * Create an instance of {@link DREventDeviceStatus }
     * 
     */
    public DREventDeviceStatus createDREventDeviceStatus() {
        return new DREventDeviceStatus();
    }

    /**
     * Create an instance of {@link FixedChargeCodes }
     * 
     */
    public FixedChargeCodes createFixedChargeCodes() {
        return new FixedChargeCodes();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link ElectricLocationFieldsReferable }
     * 
     */
    public ElectricLocationFieldsReferable createElectricLocationFieldsReferable() {
        return new ElectricLocationFieldsReferable();
    }

    /**
     * Create an instance of {@link UnitIDs }
     * 
     */
    public UnitIDs createUnitIDs() {
        return new UnitIDs();
    }

    /**
     * Create an instance of {@link SubUnit }
     * 
     */
    public SubUnit createSubUnit() {
        return new SubUnit();
    }

    /**
     * Create an instance of {@link LoadProfiles }
     * 
     */
    public LoadProfiles createLoadProfiles() {
        return new LoadProfiles();
    }

    /**
     * Create an instance of {@link BackSpan }
     * 
     */
    public BackSpan createBackSpan() {
        return new BackSpan();
    }

    /**
     * Create an instance of {@link StreetLights }
     * 
     */
    public StreetLights createStreetLights() {
        return new StreetLights();
    }

    /**
     * Create an instance of {@link SectionalizerImpedances }
     * 
     */
    public SectionalizerImpedances createSectionalizerImpedances() {
        return new SectionalizerImpedances();
    }

    /**
     * Create an instance of {@link Variants }
     * 
     */
    public Variants createVariants() {
        return new Variants();
    }

    /**
     * Create an instance of {@link ROWAttributesEntries }
     * 
     */
    public ROWAttributesEntries createROWAttributesEntries() {
        return new ROWAttributesEntries();
    }

    /**
     * Create an instance of {@link ConstituentUnits }
     * 
     */
    public ConstituentUnits createConstituentUnits() {
        return new ConstituentUnits();
    }

    /**
     * Create an instance of {@link TransponderIDRange }
     * 
     */
    public TransponderIDRange createTransponderIDRange() {
        return new TransponderIDRange();
    }

    /**
     * Create an instance of {@link Conductor }
     * 
     */
    public Conductor createConductor() {
        return new Conductor();
    }

    /**
     * Create an instance of {@link WorkScheduleDetail }
     * 
     */
    public WorkScheduleDetail createWorkScheduleDetail() {
        return new WorkScheduleDetail();
    }

    /**
     * Create an instance of {@link MaterialComponents }
     * 
     */
    public MaterialComponents createMaterialComponents() {
        return new MaterialComponents();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link ReceivedWaterMeter }
     * 
     */
    public ReceivedWaterMeter createReceivedWaterMeter() {
        return new ReceivedWaterMeter();
    }

    /**
     * Create an instance of {@link OutageDetectionDevices }
     * 
     */
    public OutageDetectionDevices createOutageDetectionDevices() {
        return new OutageDetectionDevices();
    }

    /**
     * Create an instance of {@link JointUseList }
     * 
     */
    public JointUseList createJointUseList() {
        return new JointUseList();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link MaterialAttributesEntries }
     * 
     */
    public MaterialAttributesEntries createMaterialAttributesEntries() {
        return new MaterialAttributesEntries();
    }

    /**
     * Create an instance of {@link CapacitorBankSwitches }
     * 
     */
    public CapacitorBankSwitches createCapacitorBankSwitches() {
        return new CapacitorBankSwitches();
    }

    /**
     * Create an instance of {@link RetryBehavior }
     * 
     */
    public RetryBehavior createRetryBehavior() {
        return new RetryBehavior();
    }

    /**
     * Create an instance of {@link Variant }
     * 
     */
    public Variant createVariant() {
        return new Variant();
    }

    /**
     * Create an instance of {@link EndDeviceEventList }
     * 
     */
    public EndDeviceEventList createEndDeviceEventList() {
        return new EndDeviceEventList();
    }

    /**
     * Create an instance of {@link WorkSchedule }
     * 
     */
    public WorkSchedule createWorkSchedule() {
        return new WorkSchedule();
    }

    /**
     * Create an instance of {@link SkillIDs }
     * 
     */
    public SkillIDs createSkillIDs() {
        return new SkillIDs();
    }

    /**
     * Create an instance of {@link BufferedPoint }
     * 
     */
    public BufferedPoint createBufferedPoint() {
        return new BufferedPoint();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link WorkProgress }
     * 
     */
    public WorkProgress createWorkProgress() {
        return new WorkProgress();
    }

    /**
     * Create an instance of {@link ResponseContainer }
     * 
     */
    public ResponseContainer createResponseContainer() {
        return new ResponseContainer();
    }

    /**
     * Create an instance of {@link Districts }
     * 
     */
    public Districts createDistricts() {
        return new Districts();
    }

    /**
     * Create an instance of {@link SecondaryJunctionBox }
     * 
     */
    public SecondaryJunctionBox createSecondaryJunctionBox() {
        return new SecondaryJunctionBox();
    }

    /**
     * Create an instance of {@link OutageReasonItems }
     * 
     */
    public OutageReasonItems createOutageReasonItems() {
        return new OutageReasonItems();
    }

    /**
     * Create an instance of {@link WorkPriority }
     * 
     */
    public WorkPriority createWorkPriority() {
        return new WorkPriority();
    }

    /**
     * Create an instance of {@link GasOutage }
     * 
     */
    public GasOutage createGasOutage() {
        return new GasOutage();
    }

    /**
     * Create an instance of {@link LocationTrackingPosition }
     * 
     */
    public LocationTrackingPosition createLocationTrackingPosition() {
        return new LocationTrackingPosition();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ObjectRefChange }
     * 
     */
    public ObjectRefChange createObjectRefChange() {
        return new ObjectRefChange();
    }

    /**
     * Create an instance of {@link MeterConfigurationStatus }
     * 
     */
    public MeterConfigurationStatus createMeterConfigurationStatus() {
        return new MeterConfigurationStatus();
    }

    /**
     * Create an instance of {@link CycleTiers }
     * 
     */
    public CycleTiers createCycleTiers() {
        return new CycleTiers();
    }

    /**
     * Create an instance of {@link LocationInformationReferable }
     * 
     */
    public LocationInformationReferable createLocationInformationReferable() {
        return new LocationInformationReferable();
    }

    /**
     * Create an instance of {@link PremisesDisplayBillingMessage }
     * 
     */
    public PremisesDisplayBillingMessage createPremisesDisplayBillingMessage() {
        return new PremisesDisplayBillingMessage();
    }

    /**
     * Create an instance of {@link ConfigurationStatusItem }
     * 
     */
    public ConfigurationStatusItem createConfigurationStatusItem() {
        return new ConfigurationStatusItem();
    }

    /**
     * Create an instance of {@link ReadingObject }
     * 
     */
    public ReadingObject createReadingObject() {
        return new ReadingObject();
    }

    /**
     * Create an instance of {@link PANDeviceGroup }
     * 
     */
    public PANDeviceGroup createPANDeviceGroup() {
        return new PANDeviceGroup();
    }

    /**
     * Create an instance of {@link SwitchingSchedule }
     * 
     */
    public SwitchingSchedule createSwitchingSchedule() {
        return new SwitchingSchedule();
    }

    /**
     * Create an instance of {@link ReadingTypeCodeOption }
     * 
     */
    public ReadingTypeCodeOption createReadingTypeCodeOption() {
        return new ReadingTypeCodeOption();
    }

    /**
     * Create an instance of {@link BufferedObjectCollection }
     * 
     */
    public BufferedObjectCollection createBufferedObjectCollection() {
        return new BufferedObjectCollection();
    }

    /**
     * Create an instance of {@link WaterLocationFields }
     * 
     */
    public WaterLocationFields createWaterLocationFields() {
        return new WaterLocationFields();
    }

    /**
     * Create an instance of {@link RequestedNumber }
     * 
     */
    public RequestedNumber createRequestedNumber() {
        return new RequestedNumber();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link Bin }
     * 
     */
    public Bin createBin() {
        return new Bin();
    }

    /**
     * Create an instance of {@link MeasurementDevice }
     * 
     */
    public MeasurementDevice createMeasurementDevice() {
        return new MeasurementDevice();
    }

    /**
     * Create an instance of {@link MaterialAttributes }
     * 
     */
    public MaterialAttributes createMaterialAttributes() {
        return new MaterialAttributes();
    }

    /**
     * Create an instance of {@link SectionalizerEntry }
     * 
     */
    public SectionalizerEntry createSectionalizerEntry() {
        return new SectionalizerEntry();
    }

    /**
     * Create an instance of {@link Charge }
     * 
     */
    public Charge createCharge() {
        return new Charge();
    }

    /**
     * Create an instance of {@link OtherServicePoints }
     * 
     */
    public OtherServicePoints createOtherServicePoints() {
        return new OtherServicePoints();
    }

    /**
     * Create an instance of {@link WaterMeters }
     * 
     */
    public WaterMeters createWaterMeters() {
        return new WaterMeters();
    }

    /**
     * Create an instance of {@link ECheckPayment }
     * 
     */
    public ECheckPayment createECheckPayment() {
        return new ECheckPayment();
    }

    /**
     * Create an instance of {@link Workers }
     * 
     */
    public Workers createWorkers() {
        return new Workers();
    }

    /**
     * Create an instance of {@link EndDeviceRefOptions }
     * 
     */
    public EndDeviceRefOptions createEndDeviceRefOptions() {
        return new EndDeviceRefOptions();
    }

    /**
     * Create an instance of {@link AlertCodes }
     * 
     */
    public AlertCodes createAlertCodes() {
        return new AlertCodes();
    }

    /**
     * Create an instance of {@link MsgLine }
     * 
     */
    public MsgLine createMsgLine() {
        return new MsgLine();
    }

    /**
     * Create an instance of {@link LoadSection }
     * 
     */
    public LoadSection createLoadSection() {
        return new LoadSection();
    }

    /**
     * Create an instance of {@link CPRAdjustments }
     * 
     */
    public CPRAdjustments createCPRAdjustments() {
        return new CPRAdjustments();
    }

    /**
     * Create an instance of {@link OutageCustomers }
     * 
     */
    public OutageCustomers createOutageCustomers() {
        return new OutageCustomers();
    }

    /**
     * Create an instance of {@link Breaker }
     * 
     */
    public Breaker createBreaker() {
        return new Breaker();
    }

    /**
     * Create an instance of {@link Bays }
     * 
     */
    public Bays createBays() {
        return new Bays();
    }

    /**
     * Create an instance of {@link SwitchOffValue }
     * 
     */
    public SwitchOffValue createSwitchOffValue() {
        return new SwitchOffValue();
    }

    /**
     * Create an instance of {@link PCBTest }
     * 
     */
    public PCBTest createPCBTest() {
        return new PCBTest();
    }

    /**
     * Create an instance of {@link OtherLocationFields }
     * 
     */
    public OtherLocationFields createOtherLocationFields() {
        return new OtherLocationFields();
    }

    /**
     * Create an instance of {@link AssemblyAccountingFields }
     * 
     */
    public AssemblyAccountingFields createAssemblyAccountingFields() {
        return new AssemblyAccountingFields();
    }

    /**
     * Create an instance of {@link ConvenienceFeeItems }
     * 
     */
    public ConvenienceFeeItems createConvenienceFeeItems() {
        return new ConvenienceFeeItems();
    }

    /**
     * Create an instance of {@link GenericPolygonFeatures }
     * 
     */
    public GenericPolygonFeatures createGenericPolygonFeatures() {
        return new GenericPolygonFeatures();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link PhaseItem }
     * 
     */
    public PhaseItem createPhaseItem() {
        return new PhaseItem();
    }

    /**
     * Create an instance of {@link PremisesServices }
     * 
     */
    public PremisesServices createPremisesServices() {
        return new PremisesServices();
    }

    /**
     * Create an instance of {@link RateComponents }
     * 
     */
    public RateComponents createRateComponents() {
        return new RateComponents();
    }

    /**
     * Create an instance of {@link TapeShieldCableEntries }
     * 
     */
    public TapeShieldCableEntries createTapeShieldCableEntries() {
        return new TapeShieldCableEntries();
    }

    /**
     * Create an instance of {@link DRProgramEnrollmentIDs }
     * 
     */
    public DRProgramEnrollmentIDs createDRProgramEnrollmentIDs() {
        return new DRProgramEnrollmentIDs();
    }

    /**
     * Create an instance of {@link MeterExchanges }
     * 
     */
    public MeterExchanges createMeterExchanges() {
        return new MeterExchanges();
    }

    /**
     * Create an instance of {@link CPRAllocations }
     * 
     */
    public CPRAllocations createCPRAllocations() {
        return new CPRAllocations();
    }

    /**
     * Create an instance of {@link AbsoluteSchedule }
     * 
     */
    public AbsoluteSchedule createAbsoluteSchedule() {
        return new AbsoluteSchedule();
    }

    /**
     * Create an instance of {@link UsageItem }
     * 
     */
    public UsageItem createUsageItem() {
        return new UsageItem();
    }

    /**
     * Create an instance of {@link AssociatedDates }
     * 
     */
    public AssociatedDates createAssociatedDates() {
        return new AssociatedDates();
    }

    /**
     * Create an instance of {@link PaymentTransaction }
     * 
     */
    public PaymentTransaction createPaymentTransaction() {
        return new PaymentTransaction();
    }

    /**
     * Create an instance of {@link WorkSchedulingItem }
     * 
     */
    public WorkSchedulingItem createWorkSchedulingItem() {
        return new WorkSchedulingItem();
    }

    /**
     * Create an instance of {@link ReceivedModules }
     * 
     */
    public ReceivedModules createReceivedModules() {
        return new ReceivedModules();
    }

    /**
     * Create an instance of {@link ThermostatScheduleDays }
     * 
     */
    public ThermostatScheduleDays createThermostatScheduleDays() {
        return new ThermostatScheduleDays();
    }

    /**
     * Create an instance of {@link IntegerDuration }
     * 
     */
    public IntegerDuration createIntegerDuration() {
        return new IntegerDuration();
    }

    /**
     * Create an instance of {@link SynchronousMachine }
     * 
     */
    public SynchronousMachine createSynchronousMachine() {
        return new SynchronousMachine();
    }

    /**
     * Create an instance of {@link ThermostatConfiguration }
     * 
     */
    public ThermostatConfiguration createThermostatConfiguration() {
        return new ThermostatConfiguration();
    }

    /**
     * Create an instance of {@link AssignmentDetails }
     * 
     */
    public AssignmentDetails createAssignmentDetails() {
        return new AssignmentDetails();
    }

    /**
     * Create an instance of {@link Bins }
     * 
     */
    public Bins createBins() {
        return new Bins();
    }

    /**
     * Create an instance of {@link CTs }
     * 
     */
    public CTs createCTs() {
        return new CTs();
    }

    /**
     * Create an instance of {@link GasServicePoints }
     * 
     */
    public GasServicePoints createGasServicePoints() {
        return new GasServicePoints();
    }

    /**
     * Create an instance of {@link SecondaryJunctionBoxes }
     * 
     */
    public SecondaryJunctionBoxes createSecondaryJunctionBoxes() {
        return new SecondaryJunctionBoxes();
    }

    /**
     * Create an instance of {@link LocationTrackingDeviceRef }
     * 
     */
    public LocationTrackingDeviceRef createLocationTrackingDeviceRef() {
        return new LocationTrackingDeviceRef();
    }

    /**
     * Create an instance of {@link AlertCode }
     * 
     */
    public AlertCode createAlertCode() {
        return new AlertCode();
    }

    /**
     * Create an instance of {@link Ability }
     * 
     */
    public Ability createAbility() {
        return new Ability();
    }

    /**
     * Create an instance of {@link OutageRefs }
     * 
     */
    public OutageRefs createOutageRefs() {
        return new OutageRefs();
    }

    /**
     * Create an instance of {@link AggregatedGroup }
     * 
     */
    public AggregatedGroup createAggregatedGroup() {
        return new AggregatedGroup();
    }

    /**
     * Create an instance of {@link SecondaryConductorEntries }
     * 
     */
    public SecondaryConductorEntries createSecondaryConductorEntries() {
        return new SecondaryConductorEntries();
    }

    /**
     * Create an instance of {@link TemperatureTiers }
     * 
     */
    public TemperatureTiers createTemperatureTiers() {
        return new TemperatureTiers();
    }

    /**
     * Create an instance of {@link FuseEntry }
     * 
     */
    public FuseEntry createFuseEntry() {
        return new FuseEntry();
    }

    /**
     * Create an instance of {@link WorkItemAttachmentContainer }
     * 
     */
    public WorkItemAttachmentContainer createWorkItemAttachmentContainer() {
        return new WorkItemAttachmentContainer();
    }

    /**
     * Create an instance of {@link AdditionalAssignments }
     * 
     */
    public AdditionalAssignments createAdditionalAssignments() {
        return new AdditionalAssignments();
    }

    /**
     * Create an instance of {@link LoggedOutageDetectionEvents }
     * 
     */
    public LoggedOutageDetectionEvents createLoggedOutageDetectionEvents() {
        return new LoggedOutageDetectionEvents();
    }

    /**
     * Create an instance of {@link ExistingMeter }
     * 
     */
    public ExistingMeter createExistingMeter() {
        return new ExistingMeter();
    }

    /**
     * Create an instance of {@link CT }
     * 
     */
    public CT createCT() {
        return new CT();
    }

    /**
     * Create an instance of {@link ContentReferences }
     * 
     */
    public ContentReferences createContentReferences() {
        return new ContentReferences();
    }

    /**
     * Create an instance of {@link RemainingBalance }
     * 
     */
    public RemainingBalance createRemainingBalance() {
        return new RemainingBalance();
    }

    /**
     * Create an instance of {@link ConstituentUnit }
     * 
     */
    public ConstituentUnit createConstituentUnit() {
        return new ConstituentUnit();
    }

    /**
     * Create an instance of {@link MaterialItem }
     * 
     */
    public MaterialItem createMaterialItem() {
        return new MaterialItem();
    }

    /**
     * Create an instance of {@link BillingDetail }
     * 
     */
    public BillingDetail createBillingDetail() {
        return new BillingDetail();
    }

    /**
     * Create an instance of {@link RecloserImpedances }
     * 
     */
    public RecloserImpedances createRecloserImpedances() {
        return new RecloserImpedances();
    }

    /**
     * Create an instance of {@link OtherCodes }
     * 
     */
    public OtherCodes createOtherCodes() {
        return new OtherCodes();
    }

    /**
     * Create an instance of {@link BankRatings }
     * 
     */
    public BankRatings createBankRatings() {
        return new BankRatings();
    }

    /**
     * Create an instance of {@link LocationTrackingDevice }
     * 
     */
    public LocationTrackingDevice createLocationTrackingDevice() {
        return new LocationTrackingDevice();
    }

    /**
     * Create an instance of {@link IntervalData }
     * 
     */
    public IntervalData createIntervalData() {
        return new IntervalData();
    }

    /**
     * Create an instance of {@link SupportedReadingTypes }
     * 
     */
    public SupportedReadingTypes createSupportedReadingTypes() {
        return new SupportedReadingTypes();
    }

    /**
     * Create an instance of {@link PpmTransaction }
     * 
     */
    public PpmTransaction createPpmTransaction() {
        return new PpmTransaction();
    }

    /**
     * Create an instance of {@link ExceptionDays }
     * 
     */
    public ExceptionDays createExceptionDays() {
        return new ExceptionDays();
    }

    /**
     * Create an instance of {@link LoadFlowResult }
     * 
     */
    public LoadFlowResult createLoadFlowResult() {
        return new LoadFlowResult();
    }

    /**
     * Create an instance of {@link ConsumptionTier }
     * 
     */
    public ConsumptionTier createConsumptionTier() {
        return new ConsumptionTier();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link PickList }
     * 
     */
    public PickList createPickList() {
        return new PickList();
    }

    /**
     * Create an instance of {@link GasMeters }
     * 
     */
    public GasMeters createGasMeters() {
        return new GasMeters();
    }

    /**
     * Create an instance of {@link VoltageLevels }
     * 
     */
    public VoltageLevels createVoltageLevels() {
        return new VoltageLevels();
    }

    /**
     * Create an instance of {@link OtherMeter }
     * 
     */
    public OtherMeter createOtherMeter() {
        return new OtherMeter();
    }

    /**
     * Create an instance of {@link ElectricOutages }
     * 
     */
    public ElectricOutages createElectricOutages() {
        return new ElectricOutages();
    }

    /**
     * Create an instance of {@link CapabilityAction }
     * 
     */
    public CapabilityAction createCapabilityAction() {
        return new CapabilityAction();
    }

    /**
     * Create an instance of {@link ExceptionDay }
     * 
     */
    public ExceptionDay createExceptionDay() {
        return new ExceptionDay();
    }

    /**
     * Create an instance of {@link Pole }
     * 
     */
    public Pole createPole() {
        return new Pole();
    }

    /**
     * Create an instance of {@link ReceivedPremisesDisplays }
     * 
     */
    public ReceivedPremisesDisplays createReceivedPremisesDisplays() {
        return new ReceivedPremisesDisplays();
    }

    /**
     * Create an instance of {@link AuthorizationAction }
     * 
     */
    public AuthorizationAction createAuthorizationAction() {
        return new AuthorizationAction();
    }

    /**
     * Create an instance of {@link WaterOutage }
     * 
     */
    public WaterOutage createWaterOutage() {
        return new WaterOutage();
    }

    /**
     * Create an instance of {@link WaterMeterExchange }
     * 
     */
    public WaterMeterExchange createWaterMeterExchange() {
        return new WaterMeterExchange();
    }

    /**
     * Create an instance of {@link ConnectDisconnectEvent }
     * 
     */
    public ConnectDisconnectEvent createConnectDisconnectEvent() {
        return new ConnectDisconnectEvent();
    }

    /**
     * Create an instance of {@link DomainNameChange }
     * 
     */
    public DomainNameChange createDomainNameChange() {
        return new DomainNameChange();
    }

    /**
     * Create an instance of {@link ElectricalRatings }
     * 
     */
    public ElectricalRatings createElectricalRatings() {
        return new ElectricalRatings();
    }

    /**
     * Create an instance of {@link ElectricMeters }
     * 
     */
    public ElectricMeters createElectricMeters() {
        return new ElectricMeters();
    }

    /**
     * Create an instance of {@link ThresholdMonitoringItems }
     * 
     */
    public ThresholdMonitoringItems createThresholdMonitoringItems() {
        return new ThresholdMonitoringItems();
    }

    /**
     * Create an instance of {@link ElectricMeter }
     * 
     */
    public ElectricMeter createElectricMeter() {
        return new ElectricMeter();
    }

    /**
     * Create an instance of {@link PropaneMeterExchange }
     * 
     */
    public PropaneMeterExchange createPropaneMeterExchange() {
        return new PropaneMeterExchange();
    }

    /**
     * Create an instance of {@link WorkOrderReferences }
     * 
     */
    public WorkOrderReferences createWorkOrderReferences() {
        return new WorkOrderReferences();
    }

    /**
     * Create an instance of {@link ConsumptionItem }
     * 
     */
    public ConsumptionItem createConsumptionItem() {
        return new ConsumptionItem();
    }

    /**
     * Create an instance of {@link OutageDetails }
     * 
     */
    public OutageDetails createOutageDetails() {
        return new OutageDetails();
    }

    /**
     * Create an instance of {@link WorkItems }
     * 
     */
    public WorkItems createWorkItems() {
        return new WorkItems();
    }

    /**
     * Create an instance of {@link PowerSystemDevices }
     * 
     */
    public PowerSystemDevices createPowerSystemDevices() {
        return new PowerSystemDevices();
    }

    /**
     * Create an instance of {@link EquipmentCatalogRefs }
     * 
     */
    public EquipmentCatalogRefs createEquipmentCatalogRefs() {
        return new EquipmentCatalogRefs();
    }

    /**
     * Create an instance of {@link PredictedElement }
     * 
     */
    public PredictedElement createPredictedElement() {
        return new PredictedElement();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link MeterIDs }
     * 
     */
    public MeterIDs createMeterIDs() {
        return new MeterIDs();
    }

    /**
     * Create an instance of {@link HighlightDisplayObject }
     * 
     */
    public HighlightDisplayObject createHighlightDisplayObject() {
        return new HighlightDisplayObject();
    }

    /**
     * Create an instance of {@link TotalUsage }
     * 
     */
    public TotalUsage createTotalUsage() {
        return new TotalUsage();
    }

    /**
     * Create an instance of {@link Capacitor }
     * 
     */
    public Capacitor createCapacitor() {
        return new Capacitor();
    }

    /**
     * Create an instance of {@link Outages }
     * 
     */
    public Outages createOutages() {
        return new Outages();
    }

    /**
     * Create an instance of {@link ResourceSchedules }
     * 
     */
    public ResourceSchedules createResourceSchedules() {
        return new ResourceSchedules();
    }

    /**
     * Create an instance of {@link AssetRef }
     * 
     */
    public AssetRef createAssetRef() {
        return new AssetRef();
    }

    /**
     * Create an instance of {@link PayableItem }
     * 
     */
    public PayableItem createPayableItem() {
        return new PayableItem();
    }

    /**
     * Create an instance of {@link DREventDeviceStatuses }
     * 
     */
    public DREventDeviceStatuses createDREventDeviceStatuses() {
        return new DREventDeviceStatuses();
    }

    /**
     * Create an instance of {@link SyntaxItem }
     * 
     */
    public SyntaxItem createSyntaxItem() {
        return new SyntaxItem();
    }

    /**
     * Create an instance of {@link PANInterfaceIDs }
     * 
     */
    public PANInterfaceIDs createPANInterfaceIDs() {
        return new PANInterfaceIDs();
    }

    /**
     * Create an instance of {@link Anchors }
     * 
     */
    public Anchors createAnchors() {
        return new Anchors();
    }

    /**
     * Create an instance of {@link AssetHistoryEvents }
     * 
     */
    public AssetHistoryEvents createAssetHistoryEvents() {
        return new AssetHistoryEvents();
    }

    /**
     * Create an instance of {@link OtherMeters }
     * 
     */
    public OtherMeters createOtherMeters() {
        return new OtherMeters();
    }

    /**
     * Create an instance of {@link OutageSplit }
     * 
     */
    public OutageSplit createOutageSplit() {
        return new OutageSplit();
    }

    /**
     * Create an instance of {@link EquivalentSource }
     * 
     */
    public EquivalentSource createEquivalentSource() {
        return new EquivalentSource();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link CheckIDChoice }
     * 
     */
    public CheckIDChoice createCheckIDChoice() {
        return new CheckIDChoice();
    }

    /**
     * Create an instance of {@link ServicePriority }
     * 
     */
    public ServicePriority createServicePriority() {
        return new ServicePriority();
    }

    /**
     * Create an instance of {@link WorkItemDeletion }
     * 
     */
    public WorkItemDeletion createWorkItemDeletion() {
        return new WorkItemDeletion();
    }

    /**
     * Create an instance of {@link AssetLocationReferable }
     * 
     */
    public AssetLocationReferable createAssetLocationReferable() {
        return new AssetLocationReferable();
    }

    /**
     * Create an instance of {@link MeterGroupIDs }
     * 
     */
    public MeterGroupIDs createMeterGroupIDs() {
        return new MeterGroupIDs();
    }

    /**
     * Create an instance of {@link Poles }
     * 
     */
    public Poles createPoles() {
        return new Poles();
    }

    /**
     * Create an instance of {@link CimACLineSegmentClasses }
     * 
     */
    public CimACLineSegmentClasses createCimACLineSegmentClasses() {
        return new CimACLineSegmentClasses();
    }

    /**
     * Create an instance of {@link WaterMeterExchanges }
     * 
     */
    public WaterMeterExchanges createWaterMeterExchanges() {
        return new WaterMeterExchanges();
    }

    /**
     * Create an instance of {@link PaymentContainer }
     * 
     */
    public PaymentContainer createPaymentContainer() {
        return new PaymentContainer();
    }

    /**
     * Create an instance of {@link IntervalProfile }
     * 
     */
    public IntervalProfile createIntervalProfile() {
        return new IntervalProfile();
    }

    /**
     * Create an instance of {@link LocationNotes }
     * 
     */
    public LocationNotes createLocationNotes() {
        return new LocationNotes();
    }

    /**
     * Create an instance of {@link ResourceRef }
     * 
     */
    public ResourceRef createResourceRef() {
        return new ResourceRef();
    }

    /**
     * Create an instance of {@link SwitchImpedances }
     * 
     */
    public SwitchImpedances createSwitchImpedances() {
        return new SwitchImpedances();
    }

    /**
     * Create an instance of {@link WaterOutages }
     * 
     */
    public WaterOutages createWaterOutages() {
        return new WaterOutages();
    }

    /**
     * Create an instance of {@link TemperatureTier }
     * 
     */
    public TemperatureTier createTemperatureTier() {
        return new TemperatureTier();
    }

    /**
     * Create an instance of {@link SystemFrequency }
     * 
     */
    public SystemFrequency createSystemFrequency() {
        return new SystemFrequency();
    }

    /**
     * Create an instance of {@link ReadingValues }
     * 
     */
    public ReadingValues createReadingValues() {
        return new ReadingValues();
    }

    /**
     * Create an instance of {@link LineEnvironmentalAttributes }
     * 
     */
    public LineEnvironmentalAttributes createLineEnvironmentalAttributes() {
        return new LineEnvironmentalAttributes();
    }

    /**
     * Create an instance of {@link AssetHistoryEvent }
     * 
     */
    public AssetHistoryEvent createAssetHistoryEvent() {
        return new AssetHistoryEvent();
    }

    /**
     * Create an instance of {@link ValSyntax }
     * 
     */
    public ValSyntax createValSyntax() {
        return new ValSyntax();
    }

    /**
     * Create an instance of {@link CalculatedCurrentBillReadings }
     * 
     */
    public CalculatedCurrentBillReadings createCalculatedCurrentBillReadings() {
        return new CalculatedCurrentBillReadings();
    }

    /**
     * Create an instance of {@link Substations }
     * 
     */
    public Substations createSubstations() {
        return new Substations();
    }

    /**
     * Create an instance of {@link PANCommission }
     * 
     */
    public PANCommission createPANCommission() {
        return new PANCommission();
    }

    /**
     * Create an instance of {@link PremisesDisplays }
     * 
     */
    public PremisesDisplays createPremisesDisplays() {
        return new PremisesDisplays();
    }

    /**
     * Create an instance of {@link ConcentricNeutralCableEntries }
     * 
     */
    public ConcentricNeutralCableEntries createConcentricNeutralCableEntries() {
        return new ConcentricNeutralCableEntries();
    }

    /**
     * Create an instance of {@link SystemState }
     * 
     */
    public SystemState createSystemState() {
        return new SystemState();
    }

    /**
     * Create an instance of {@link CDDevices }
     * 
     */
    public CDDevices createCDDevices() {
        return new CDDevices();
    }

    /**
     * Create an instance of {@link MeterTypeGroups }
     * 
     */
    public MeterTypeGroups createMeterTypeGroups() {
        return new MeterTypeGroups();
    }

    /**
     * Create an instance of {@link OutageReasonItem }
     * 
     */
    public OutageReasonItem createOutageReasonItem() {
        return new OutageReasonItem();
    }

    /**
     * Create an instance of {@link ReadingQualityCodeList }
     * 
     */
    public ReadingQualityCodeList createReadingQualityCodeList() {
        return new ReadingQualityCodeList();
    }

    /**
     * Create an instance of {@link PT }
     * 
     */
    public PT createPT() {
        return new PT();
    }

    /**
     * Create an instance of {@link RecloserEntry }
     * 
     */
    public RecloserEntry createRecloserEntry() {
        return new RecloserEntry();
    }

    /**
     * Create an instance of {@link SpatialFeatures }
     * 
     */
    public SpatialFeatures createSpatialFeatures() {
        return new SpatialFeatures();
    }

    /**
     * Create an instance of {@link DRProgramEnrollment }
     * 
     */
    public DRProgramEnrollment createDRProgramEnrollment() {
        return new DRProgramEnrollment();
    }

    /**
     * Create an instance of {@link CapabilityActionCode }
     * 
     */
    public CapabilityActionCode createCapabilityActionCode() {
        return new CapabilityActionCode();
    }

    /**
     * Create an instance of {@link LMDeviceExchange }
     * 
     */
    public LMDeviceExchange createLMDeviceExchange() {
        return new LMDeviceExchange();
    }

    /**
     * Create an instance of {@link DemandResponseParameters }
     * 
     */
    public DemandResponseParameters createDemandResponseParameters() {
        return new DemandResponseParameters();
    }

    /**
     * Create an instance of {@link OutageHistoryEvents }
     * 
     */
    public OutageHistoryEvents createOutageHistoryEvents() {
        return new OutageHistoryEvents();
    }

    /**
     * Create an instance of {@link PremisesDisplayMessageConfirmation }
     * 
     */
    public PremisesDisplayMessageConfirmation createPremisesDisplayMessageConfirmation() {
        return new PremisesDisplayMessageConfirmation();
    }

    /**
     * Create an instance of {@link ConsumptionTiers }
     * 
     */
    public ConsumptionTiers createConsumptionTiers() {
        return new ConsumptionTiers();
    }

    /**
     * Create an instance of {@link SupportedNotification }
     * 
     */
    public SupportedNotification createSupportedNotification() {
        return new SupportedNotification();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link RecloserEntries }
     * 
     */
    public RecloserEntries createRecloserEntries() {
        return new RecloserEntries();
    }

    /**
     * Create an instance of {@link WorkHistory }
     * 
     */
    public WorkHistory createWorkHistory() {
        return new WorkHistory();
    }

    /**
     * Create an instance of {@link AttachmentContainer }
     * 
     */
    public AttachmentContainer createAttachmentContainer() {
        return new AttachmentContainer();
    }

    /**
     * Create an instance of {@link ConduitContentsRefs }
     * 
     */
    public ConduitContentsRefs createConduitContentsRefs() {
        return new ConduitContentsRefs();
    }

    /**
     * Create an instance of {@link CatalogEntries }
     * 
     */
    public CatalogEntries createCatalogEntries() {
        return new CatalogEntries();
    }

    /**
     * Create an instance of {@link LocationTrackingEvent }
     * 
     */
    public LocationTrackingEvent createLocationTrackingEvent() {
        return new LocationTrackingEvent();
    }

    /**
     * Create an instance of {@link TOUSchedule }
     * 
     */
    public TOUSchedule createTOUSchedule() {
        return new TOUSchedule();
    }

    /**
     * Create an instance of {@link WorkHistoryEvents }
     * 
     */
    public WorkHistoryEvents createWorkHistoryEvents() {
        return new WorkHistoryEvents();
    }

    /**
     * Create an instance of {@link TOUReading }
     * 
     */
    public TOUReading createTOUReading() {
        return new TOUReading();
    }

    /**
     * Create an instance of {@link StationAssemblyDetails }
     * 
     */
    public StationAssemblyDetails createStationAssemblyDetails() {
        return new StationAssemblyDetails();
    }

    /**
     * Create an instance of {@link CapabilityActionCodes }
     * 
     */
    public CapabilityActionCodes createCapabilityActionCodes() {
        return new CapabilityActionCodes();
    }

    /**
     * Create an instance of {@link Regulator }
     * 
     */
    public Regulator createRegulator() {
        return new Regulator();
    }

    /**
     * Create an instance of {@link ConfigurationAction }
     * 
     */
    public ConfigurationAction createConfigurationAction() {
        return new ConfigurationAction();
    }

    /**
     * Create an instance of {@link TransformerBanks }
     * 
     */
    public TransformerBanks createTransformerBanks() {
        return new TransformerBanks();
    }

    /**
     * Create an instance of {@link PropaneMeter }
     * 
     */
    public PropaneMeter createPropaneMeter() {
        return new PropaneMeter();
    }

    /**
     * Create an instance of {@link PremisesIDs }
     * 
     */
    public PremisesIDs createPremisesIDs() {
        return new PremisesIDs();
    }

    /**
     * Create an instance of {@link TunnelCommandContent }
     * 
     */
    public TunnelCommandContent createTunnelCommandContent() {
        return new TunnelCommandContent();
    }

    /**
     * Create an instance of {@link PickListItem }
     * 
     */
    public PickListItem createPickListItem() {
        return new PickListItem();
    }

    /**
     * Create an instance of {@link CoincidentMeterReadingSet }
     * 
     */
    public CoincidentMeterReadingSet createCoincidentMeterReadingSet() {
        return new CoincidentMeterReadingSet();
    }

    /**
     * Create an instance of {@link ProfileObject }
     * 
     */
    public ProfileObject createProfileObject() {
        return new ProfileObject();
    }

    /**
     * Create an instance of {@link PropaneMeterGroups }
     * 
     */
    public PropaneMeterGroups createPropaneMeterGroups() {
        return new PropaneMeterGroups();
    }

    /**
     * Create an instance of {@link TOUSchedules }
     * 
     */
    public TOUSchedules createTOUSchedules() {
        return new TOUSchedules();
    }

    /**
     * Create an instance of {@link ParameterDef }
     * 
     */
    public ParameterDef createParameterDef() {
        return new ParameterDef();
    }

    /**
     * Create an instance of {@link AccumulatedEventStatuses }
     * 
     */
    public AccumulatedEventStatuses createAccumulatedEventStatuses() {
        return new AccumulatedEventStatuses();
    }

    /**
     * Create an instance of {@link ServiceDropEntries }
     * 
     */
    public ServiceDropEntries createServiceDropEntries() {
        return new ServiceDropEntries();
    }

    /**
     * Create an instance of {@link ResourceEffectivePeriod }
     * 
     */
    public ResourceEffectivePeriod createResourceEffectivePeriod() {
        return new ResourceEffectivePeriod();
    }

    /**
     * Create an instance of {@link EndReading }
     * 
     */
    public EndReading createEndReading() {
        return new EndReading();
    }

    /**
     * Create an instance of {@link PremisesDisplayExchange }
     * 
     */
    public PremisesDisplayExchange createPremisesDisplayExchange() {
        return new PremisesDisplayExchange();
    }

    /**
     * Create an instance of {@link CIMObjectList }
     * 
     */
    public CIMObjectList createCIMObjectList() {
        return new CIMObjectList();
    }

    /**
     * Create an instance of {@link CIMLoadCharacteristics }
     * 
     */
    public CIMLoadCharacteristics createCIMLoadCharacteristics() {
        return new CIMLoadCharacteristics();
    }

    /**
     * Create an instance of {@link PaymentTransactions }
     * 
     */
    public PaymentTransactions createPaymentTransactions() {
        return new PaymentTransactions();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link ResourceRefs }
     * 
     */
    public ResourceRefs createResourceRefs() {
        return new ResourceRefs();
    }

    /**
     * Create an instance of {@link CableOutage }
     * 
     */
    public CableOutage createCableOutage() {
        return new CableOutage();
    }

    /**
     * Create an instance of {@link PremisesDisplayMessage }
     * 
     */
    public PremisesDisplayMessage createPremisesDisplayMessage() {
        return new PremisesDisplayMessage();
    }

    /**
     * Create an instance of {@link GenericLineFeatures }
     * 
     */
    public GenericLineFeatures createGenericLineFeatures() {
        return new GenericLineFeatures();
    }

    /**
     * Create an instance of {@link CapacitorBankSwitch }
     * 
     */
    public CapacitorBankSwitch createCapacitorBankSwitch() {
        return new CapacitorBankSwitch();
    }

    /**
     * Create an instance of {@link ResourceGroup }
     * 
     */
    public ResourceGroup createResourceGroup() {
        return new ResourceGroup();
    }

    /**
     * Create an instance of {@link TransformerBank }
     * 
     */
    public TransformerBank createTransformerBank() {
        return new TransformerBank();
    }

    /**
     * Create an instance of {@link LoadSections }
     * 
     */
    public LoadSections createLoadSections() {
        return new LoadSections();
    }

    /**
     * Create an instance of {@link Charges }
     * 
     */
    public Charges createCharges() {
        return new Charges();
    }

    /**
     * Create an instance of {@link ChangedContainer }
     * 
     */
    public ChangedContainer createChangedContainer() {
        return new ChangedContainer();
    }

    /**
     * Create an instance of {@link GuyWireSize }
     * 
     */
    public GuyWireSize createGuyWireSize() {
        return new GuyWireSize();
    }

    /**
     * Create an instance of {@link ThresholdMonitoringItem }
     * 
     */
    public ThresholdMonitoringItem createThresholdMonitoringItem() {
        return new ThresholdMonitoringItem();
    }

    /**
     * Create an instance of {@link PTs }
     * 
     */
    public PTs createPTs() {
        return new PTs();
    }

    /**
     * Create an instance of {@link MeterBase }
     * 
     */
    public MeterBase createMeterBase() {
        return new MeterBase();
    }

    /**
     * Create an instance of {@link PhaseStatusItems }
     * 
     */
    public PhaseStatusItems createPhaseStatusItems() {
        return new PhaseStatusItems();
    }

    /**
     * Create an instance of {@link PossibleWorkStatuses }
     * 
     */
    public PossibleWorkStatuses createPossibleWorkStatuses() {
        return new PossibleWorkStatuses();
    }

    /**
     * Create an instance of {@link CheckData }
     * 
     */
    public CheckData createCheckData() {
        return new CheckData();
    }

    /**
     * Create an instance of {@link InductionMachineEntries }
     * 
     */
    public InductionMachineEntries createInductionMachineEntries() {
        return new InductionMachineEntries();
    }

    /**
     * Create an instance of {@link ScadaPoints }
     * 
     */
    public ScadaPoints createScadaPoints() {
        return new ScadaPoints();
    }

    /**
     * Create an instance of {@link CallBackList }
     * 
     */
    public CallBackList createCallBackList() {
        return new CallBackList();
    }

    /**
     * Create an instance of {@link BreakerEntries }
     * 
     */
    public BreakerEntries createBreakerEntries() {
        return new BreakerEntries();
    }

    /**
     * Create an instance of {@link EventMonitoringItem }
     * 
     */
    public EventMonitoringItem createEventMonitoringItem() {
        return new EventMonitoringItem();
    }

    /**
     * Create an instance of {@link Sectionalizer }
     * 
     */
    public Sectionalizer createSectionalizer() {
        return new Sectionalizer();
    }

    /**
     * Create an instance of {@link SubstationLoadControlStatus }
     * 
     */
    public SubstationLoadControlStatus createSubstationLoadControlStatus() {
        return new SubstationLoadControlStatus();
    }

    /**
     * Create an instance of {@link ResourceGroups }
     * 
     */
    public ResourceGroups createResourceGroups() {
        return new ResourceGroups();
    }

    /**
     * Create an instance of {@link MsgLines }
     * 
     */
    public MsgLines createMsgLines() {
        return new MsgLines();
    }

    /**
     * Create an instance of {@link ServicePointStatusReferable }
     * 
     */
    public ServicePointStatusReferable createServicePointStatusReferable() {
        return new ServicePointStatusReferable();
    }

    /**
     * Create an instance of {@link AssetContainer }
     * 
     */
    public AssetContainer createAssetContainer() {
        return new AssetContainer();
    }

    /**
     * Create an instance of {@link OutageDetectionDevice }
     * 
     */
    public OutageDetectionDevice createOutageDetectionDevice() {
        return new OutageDetectionDevice();
    }

    /**
     * Create an instance of {@link Channels }
     * 
     */
    public Channels createChannels() {
        return new Channels();
    }

    /**
     * Create an instance of {@link OutageDetectionEvent }
     * 
     */
    public OutageDetectionEvent createOutageDetectionEvent() {
        return new OutageDetectionEvent();
    }

    /**
     * Create an instance of {@link ConductorItems }
     * 
     */
    public ConductorItems createConductorItems() {
        return new ConductorItems();
    }

    /**
     * Create an instance of {@link SurgeArrestor }
     * 
     */
    public SurgeArrestor createSurgeArrestor() {
        return new SurgeArrestor();
    }

    /**
     * Create an instance of {@link UsageDetails }
     * 
     */
    public UsageDetails createUsageDetails() {
        return new UsageDetails();
    }

    /**
     * Create an instance of {@link ResourceMember }
     * 
     */
    public ResourceMember createResourceMember() {
        return new ResourceMember();
    }

    /**
     * Create an instance of {@link PropaneNameplate }
     * 
     */
    public PropaneNameplate createPropaneNameplate() {
        return new PropaneNameplate();
    }

    /**
     * Create an instance of {@link CDDeviceExchange }
     * 
     */
    public CDDeviceExchange createCDDeviceExchange() {
        return new CDDeviceExchange();
    }

    /**
     * Create an instance of {@link CircuitElementAndDistance }
     * 
     */
    public CircuitElementAndDistance createCircuitElementAndDistance() {
        return new CircuitElementAndDistance();
    }

    /**
     * Create an instance of {@link PriceTier }
     * 
     */
    public PriceTier createPriceTier() {
        return new PriceTier();
    }

    /**
     * Create an instance of {@link ChannelBlock }
     * 
     */
    public ChannelBlock createChannelBlock() {
        return new ChannelBlock();
    }

    /**
     * Create an instance of {@link MeterStatuses }
     * 
     */
    public MeterStatuses createMeterStatuses() {
        return new MeterStatuses();
    }

    /**
     * Create an instance of {@link PriceBin }
     * 
     */
    public PriceBin createPriceBin() {
        return new PriceBin();
    }

    /**
     * Create an instance of {@link FakeNodeSection }
     * 
     */
    public FakeNodeSection createFakeNodeSection() {
        return new FakeNodeSection();
    }

    /**
     * Create an instance of {@link CPPSchedules }
     * 
     */
    public CPPSchedules createCPPSchedules() {
        return new CPPSchedules();
    }

    /**
     * Create an instance of {@link PremisesDisplay }
     * 
     */
    public PremisesDisplay createPremisesDisplay() {
        return new PremisesDisplay();
    }

    /**
     * Create an instance of {@link PickListItems }
     * 
     */
    public PickListItems createPickListItems() {
        return new PickListItems();
    }

    /**
     * Create an instance of {@link ReadingTypes }
     * 
     */
    public ReadingTypes createReadingTypes() {
        return new ReadingTypes();
    }

    /**
     * Create an instance of {@link Abilities }
     * 
     */
    public Abilities createAbilities() {
        return new Abilities();
    }

    /**
     * Create an instance of {@link SynchronousMachines }
     * 
     */
    public SynchronousMachines createSynchronousMachines() {
        return new SynchronousMachines();
    }

    /**
     * Create an instance of {@link OutageContact }
     * 
     */
    public OutageContact createOutageContact() {
        return new OutageContact();
    }

    /**
     * Create an instance of {@link WaterConnectivityModel }
     * 
     */
    public WaterConnectivityModel createWaterConnectivityModel() {
        return new WaterConnectivityModel();
    }

    /**
     * Create an instance of {@link Skill }
     * 
     */
    public Skill createSkill() {
        return new Skill();
    }

    /**
     * Create an instance of {@link CircuitElementStatus }
     * 
     */
    public CircuitElementStatus createCircuitElementStatus() {
        return new CircuitElementStatus();
    }

    /**
     * Create an instance of {@link PremisesDisplayMessageStatus }
     * 
     */
    public PremisesDisplayMessageStatus createPremisesDisplayMessageStatus() {
        return new PremisesDisplayMessageStatus();
    }

    /**
     * Create an instance of {@link AssetRequestField }
     * 
     */
    public AssetRequestField createAssetRequestField() {
        return new AssetRequestField();
    }

    /**
     * Create an instance of {@link ElectricConnectivityModel }
     * 
     */
    public ElectricConnectivityModel createElectricConnectivityModel() {
        return new ElectricConnectivityModel();
    }

    /**
     * Create an instance of {@link DB }
     * 
     */
    public DB createDB() {
        return new DB();
    }

    /**
     * Create an instance of {@link Constraints }
     * 
     */
    public Constraints createConstraints() {
        return new Constraints();
    }

    /**
     * Create an instance of {@link LocationNote }
     * 
     */
    public LocationNote createLocationNote() {
        return new LocationNote();
    }

    /**
     * Create an instance of {@link MeterSeals }
     * 
     */
    public MeterSeals createMeterSeals() {
        return new MeterSeals();
    }

    /**
     * Create an instance of {@link ContentModelGroup }
     * 
     */
    public ContentModelGroup createContentModelGroup() {
        return new ContentModelGroup();
    }

    /**
     * Create an instance of {@link InductionMachines }
     * 
     */
    public InductionMachines createInductionMachines() {
        return new InductionMachines();
    }

    /**
     * Create an instance of {@link SubMeters }
     * 
     */
    public SubMeters createSubMeters() {
        return new SubMeters();
    }

    /**
     * Create an instance of {@link Strategy }
     * 
     */
    public Strategy createStrategy() {
        return new Strategy();
    }

    /**
     * Create an instance of {@link EndDeviceEventType }
     * 
     */
    public EndDeviceEventType createEndDeviceEventType() {
        return new EndDeviceEventType();
    }

    /**
     * Create an instance of {@link ClearanceInstance }
     * 
     */
    public ClearanceInstance createClearanceInstance() {
        return new ClearanceInstance();
    }

    /**
     * Create an instance of {@link PANDeviceID }
     * 
     */
    public PANDeviceID createPANDeviceID() {
        return new PANDeviceID();
    }

    /**
     * Create an instance of {@link Anchor }
     * 
     */
    public Anchor createAnchor() {
        return new Anchor();
    }

    /**
     * Create an instance of {@link ServiceVoltage }
     * 
     */
    public ServiceVoltage createServiceVoltage() {
        return new ServiceVoltage();
    }

    /**
     * Create an instance of {@link CertificateAuthorizations }
     * 
     */
    public CertificateAuthorizations createCertificateAuthorizations() {
        return new CertificateAuthorizations();
    }

    /**
     * Create an instance of {@link ServiceCurrent }
     * 
     */
    public ServiceCurrent createServiceCurrent() {
        return new ServiceCurrent();
    }

    /**
     * Create an instance of {@link AssociatedAssets }
     * 
     */
    public AssociatedAssets createAssociatedAssets() {
        return new AssociatedAssets();
    }

    /**
     * Create an instance of {@link ConcentricNeutralCableEntry }
     * 
     */
    public ConcentricNeutralCableEntry createConcentricNeutralCableEntry() {
        return new ConcentricNeutralCableEntry();
    }

    /**
     * Create an instance of {@link AssignmentDetailItem }
     * 
     */
    public AssignmentDetailItem createAssignmentDetailItem() {
        return new AssignmentDetailItem();
    }

    /**
     * Create an instance of {@link AssetLocation }
     * 
     */
    public AssetLocation createAssetLocation() {
        return new AssetLocation();
    }

    /**
     * Create an instance of {@link ObjectRefs }
     * 
     */
    public ObjectRefs createObjectRefs() {
        return new ObjectRefs();
    }

    /**
     * Create an instance of {@link SwitchingOrderEvents }
     * 
     */
    public SwitchingOrderEvents createSwitchingOrderEvents() {
        return new SwitchingOrderEvents();
    }

    /**
     * Create an instance of {@link PremisesDisplayCapabilitySetting }
     * 
     */
    public PremisesDisplayCapabilitySetting createPremisesDisplayCapabilitySetting() {
        return new PremisesDisplayCapabilitySetting();
    }

    /**
     * Create an instance of {@link OutageMerge }
     * 
     */
    public OutageMerge createOutageMerge() {
        return new OutageMerge();
    }

    /**
     * Create an instance of {@link Capacitors }
     * 
     */
    public Capacitors createCapacitors() {
        return new Capacitors();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link EndDeviceEventTypeOption }
     * 
     */
    public EndDeviceEventTypeOption createEndDeviceEventTypeOption() {
        return new EndDeviceEventTypeOption();
    }

    /**
     * Create an instance of {@link OutageReportingCode }
     * 
     */
    public OutageReportingCode createOutageReportingCode() {
        return new OutageReportingCode();
    }

    /**
     * Create an instance of {@link MethodNames }
     * 
     */
    public MethodNames createMethodNames() {
        return new MethodNames();
    }

    /**
     * Create an instance of {@link PremisesDisplayMessages }
     * 
     */
    public PremisesDisplayMessages createPremisesDisplayMessages() {
        return new PremisesDisplayMessages();
    }

    /**
     * Create an instance of {@link SurgeArrestors }
     * 
     */
    public SurgeArrestors createSurgeArrestors() {
        return new SurgeArrestors();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link PremisesService }
     * 
     */
    public PremisesService createPremisesService() {
        return new PremisesService();
    }

    /**
     * Create an instance of {@link OutageWork }
     * 
     */
    public OutageWork createOutageWork() {
        return new OutageWork();
    }

    /**
     * Create an instance of {@link DayOfWeek }
     * 
     */
    public DayOfWeek createDayOfWeek() {
        return new DayOfWeek();
    }

    /**
     * Create an instance of {@link TRSQ }
     * 
     */
    public TRSQ createTRSQ() {
        return new TRSQ();
    }

    /**
     * Create an instance of {@link LaborCategory }
     * 
     */
    public LaborCategory createLaborCategory() {
        return new LaborCategory();
    }

    /**
     * Create an instance of {@link ConfigurationGroupIDs }
     * 
     */
    public ConfigurationGroupIDs createConfigurationGroupIDs() {
        return new ConfigurationGroupIDs();
    }

    /**
     * Create an instance of {@link TrafficLights }
     * 
     */
    public TrafficLights createTrafficLights() {
        return new TrafficLights();
    }

    /**
     * Create an instance of {@link RegistrationInfo }
     * 
     */
    public RegistrationInfo createRegistrationInfo() {
        return new RegistrationInfo();
    }

    /**
     * Create an instance of {@link BilledUsage }
     * 
     */
    public BilledUsage createBilledUsage() {
        return new BilledUsage();
    }

    /**
     * Create an instance of {@link TransformerRatio }
     * 
     */
    public TransformerRatio createTransformerRatio() {
        return new TransformerRatio();
    }

    /**
     * Create an instance of {@link CDCustomer }
     * 
     */
    public CDCustomer createCDCustomer() {
        return new CDCustomer();
    }

    /**
     * Create an instance of {@link ACHPayments }
     * 
     */
    public ACHPayments createACHPayments() {
        return new ACHPayments();
    }

    /**
     * Create an instance of {@link Usage }
     * 
     */
    public Usage createUsage() {
        return new Usage();
    }

    /**
     * Create an instance of {@link OutagePriorityLocation }
     * 
     */
    public OutagePriorityLocation createOutagePriorityLocation() {
        return new OutagePriorityLocation();
    }

    /**
     * Create an instance of {@link OtherOutage }
     * 
     */
    public OtherOutage createOtherOutage() {
        return new OtherOutage();
    }

    /**
     * Create an instance of {@link CustomersAffectedByOutage }
     * 
     */
    public CustomersAffectedByOutage createCustomersAffectedByOutage() {
        return new CustomersAffectedByOutage();
    }

    /**
     * Create an instance of {@link LocationInformation }
     * 
     */
    public LocationInformation createLocationInformation() {
        return new LocationInformation();
    }

    /**
     * Create an instance of {@link Circuit }
     * 
     */
    public Circuit createCircuit() {
        return new Circuit();
    }

    /**
     * Create an instance of {@link WaterMeter }
     * 
     */
    public WaterMeter createWaterMeter() {
        return new WaterMeter();
    }

    /**
     * Create an instance of {@link Thermostat }
     * 
     */
    public Thermostat createThermostat() {
        return new Thermostat();
    }

    /**
     * Create an instance of {@link OutageReasonList }
     * 
     */
    public OutageReasonList createOutageReasonList() {
        return new OutageReasonList();
    }

    /**
     * Create an instance of {@link Parcel }
     * 
     */
    public Parcel createParcel() {
        return new Parcel();
    }

    /**
     * Create an instance of {@link SpanGuy }
     * 
     */
    public SpanGuy createSpanGuy() {
        return new SpanGuy();
    }

    /**
     * Create an instance of {@link OutageRemark }
     * 
     */
    public OutageRemark createOutageRemark() {
        return new OutageRemark();
    }

    /**
     * Create an instance of {@link ClearanceInstanceRequest }
     * 
     */
    public ClearanceInstanceRequest createClearanceInstanceRequest() {
        return new ClearanceInstanceRequest();
    }

    /**
     * Create an instance of {@link SwitchEntries }
     * 
     */
    public SwitchEntries createSwitchEntries() {
        return new SwitchEntries();
    }

    /**
     * Create an instance of {@link ConfiguredReadingTypes }
     * 
     */
    public ConfiguredReadingTypes createConfiguredReadingTypes() {
        return new ConfiguredReadingTypes();
    }

    /**
     * Create an instance of {@link RelatedOrganizations }
     * 
     */
    public RelatedOrganizations createRelatedOrganizations() {
        return new RelatedOrganizations();
    }

    /**
     * Create an instance of {@link Elbows }
     * 
     */
    public Elbows createElbows() {
        return new Elbows();
    }

    /**
     * Create an instance of {@link ClearanceTags }
     * 
     */
    public ClearanceTags createClearanceTags() {
        return new ClearanceTags();
    }

    /**
     * Create an instance of {@link ZsmImpedanceEntry }
     * 
     */
    public ZsmImpedanceEntry createZsmImpedanceEntry() {
        return new ZsmImpedanceEntry();
    }

    /**
     * Create an instance of {@link CreditCardOption }
     * 
     */
    public CreditCardOption createCreditCardOption() {
        return new CreditCardOption();
    }

    /**
     * Create an instance of {@link Substation }
     * 
     */
    public Substation createSubstation() {
        return new Substation();
    }

    /**
     * Create an instance of {@link AffectedMeters }
     * 
     */
    public AffectedMeters createAffectedMeters() {
        return new AffectedMeters();
    }

    /**
     * Create an instance of {@link InternetOutages }
     * 
     */
    public InternetOutages createInternetOutages() {
        return new InternetOutages();
    }

    /**
     * Create an instance of {@link Days }
     * 
     */
    public Days createDays() {
        return new Days();
    }

    /**
     * Create an instance of {@link ResourceMembers }
     * 
     */
    public ResourceMembers createResourceMembers() {
        return new ResourceMembers();
    }

    /**
     * Create an instance of {@link WaterMeterGroups }
     * 
     */
    public WaterMeterGroups createWaterMeterGroups() {
        return new WaterMeterGroups();
    }

    /**
     * Create an instance of {@link ClosedLoopStrategy }
     * 
     */
    public ClosedLoopStrategy createClosedLoopStrategy() {
        return new ClosedLoopStrategy();
    }

    /**
     * Create an instance of {@link CDStateChange }
     * 
     */
    public CDStateChange createCDStateChange() {
        return new CDStateChange();
    }

    /**
     * Create an instance of {@link Accounts }
     * 
     */
    public Accounts createAccounts() {
        return new Accounts();
    }

    /**
     * Create an instance of {@link Tariff }
     * 
     */
    public Tariff createTariff() {
        return new Tariff();
    }

    /**
     * Create an instance of {@link CustomerCall }
     * 
     */
    public CustomerCall createCustomerCall() {
        return new CustomerCall();
    }

    /**
     * Create an instance of {@link OrganizationAssociation }
     * 
     */
    public OrganizationAssociation createOrganizationAssociation() {
        return new OrganizationAssociation();
    }

    /**
     * Create an instance of {@link RestoredOutage }
     * 
     */
    public RestoredOutage createRestoredOutage() {
        return new RestoredOutage();
    }

    /**
     * Create an instance of {@link DownGuy }
     * 
     */
    public DownGuy createDownGuy() {
        return new DownGuy();
    }

    /**
     * Create an instance of {@link Assets }
     * 
     */
    public Assets createAssets() {
        return new Assets();
    }

    /**
     * Create an instance of {@link WaterServicePoints }
     * 
     */
    public WaterServicePoints createWaterServicePoints() {
        return new WaterServicePoints();
    }

    /**
     * Create an instance of {@link CapabilityActions }
     * 
     */
    public CapabilityActions createCapabilityActions() {
        return new CapabilityActions();
    }

    /**
     * Create an instance of {@link PpmMeterExchange }
     * 
     */
    public PpmMeterExchange createPpmMeterExchange() {
        return new PpmMeterExchange();
    }

    /**
     * Create an instance of {@link LineConstructionEntry }
     * 
     */
    public LineConstructionEntry createLineConstructionEntry() {
        return new LineConstructionEntry();
    }

    /**
     * Create an instance of {@link ConvenienceFeeItem }
     * 
     */
    public ConvenienceFeeItem createConvenienceFeeItem() {
        return new ConvenienceFeeItem();
    }

    /**
     * Create an instance of {@link ServiceLocation }
     * 
     */
    public ServiceLocation createServiceLocation() {
        return new ServiceLocation();
    }

    /**
     * Create an instance of {@link Risers }
     * 
     */
    public Risers createRisers() {
        return new Risers();
    }

    /**
     * Create an instance of {@link OtherIdentificationFields }
     * 
     */
    public OtherIdentificationFields createOtherIdentificationFields() {
        return new OtherIdentificationFields();
    }

    /**
     * Create an instance of {@link RequestingPerson }
     * 
     */
    public RequestingPerson createRequestingPerson() {
        return new RequestingPerson();
    }

    /**
     * Create an instance of {@link TotalUsages }
     * 
     */
    public TotalUsages createTotalUsages() {
        return new TotalUsages();
    }

    /**
     * Create an instance of {@link UsageOtherPeriod }
     * 
     */
    public UsageOtherPeriod createUsageOtherPeriod() {
        return new UsageOtherPeriod();
    }

    /**
     * Create an instance of {@link SwitchingStepWork }
     * 
     */
    public SwitchingStepWork createSwitchingStepWork() {
        return new SwitchingStepWork();
    }

    /**
     * Create an instance of {@link ConditionValue }
     * 
     */
    public ConditionValue createConditionValue() {
        return new ConditionValue();
    }

    /**
     * Create an instance of {@link DREventStatusOptions }
     * 
     */
    public DREventStatusOptions createDREventStatusOptions() {
        return new DREventStatusOptions();
    }

    /**
     * Create an instance of {@link CreditCardPayments }
     * 
     */
    public CreditCardPayments createCreditCardPayments() {
        return new CreditCardPayments();
    }

    /**
     * Create an instance of {@link OutageAttachments }
     * 
     */
    public OutageAttachments createOutageAttachments() {
        return new OutageAttachments();
    }

    /**
     * Create an instance of {@link SubUnits }
     * 
     */
    public SubUnits createSubUnits() {
        return new SubUnits();
    }

    /**
     * Create an instance of {@link ServicePointStatus }
     * 
     */
    public ServicePointStatus createServicePointStatus() {
        return new ServicePointStatus();
    }

    /**
     * Create an instance of {@link CallBackInformation }
     * 
     */
    public CallBackInformation createCallBackInformation() {
        return new CallBackInformation();
    }

    /**
     * Create an instance of {@link AssetRequest }
     * 
     */
    public AssetRequest createAssetRequest() {
        return new AssetRequest();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public Geometry createGeometry() {
        return new Geometry();
    }

    /**
     * Create an instance of {@link DemandResponseEventStatus }
     * 
     */
    public DemandResponseEventStatus createDemandResponseEventStatus() {
        return new DemandResponseEventStatus();
    }

    /**
     * Create an instance of {@link ReceivedElectricMeter }
     * 
     */
    public ReceivedElectricMeter createReceivedElectricMeter() {
        return new ReceivedElectricMeter();
    }

    /**
     * Create an instance of {@link Feeders }
     * 
     */
    public Feeders createFeeders() {
        return new Feeders();
    }

    /**
     * Create an instance of {@link DiscardedOutage }
     * 
     */
    public DiscardedOutage createDiscardedOutage() {
        return new DiscardedOutage();
    }

    /**
     * Create an instance of {@link ServiceLocations }
     * 
     */
    public ServiceLocations createServiceLocations() {
        return new ServiceLocations();
    }

    /**
     * Create an instance of {@link ReceivedPropaneMeters }
     * 
     */
    public ReceivedPropaneMeters createReceivedPropaneMeters() {
        return new ReceivedPropaneMeters();
    }

    /**
     * Create an instance of {@link UsageOtherPeriods }
     * 
     */
    public UsageOtherPeriods createUsageOtherPeriods() {
        return new UsageOtherPeriods();
    }

    /**
     * Create an instance of {@link CreditCardPayment }
     * 
     */
    public CreditCardPayment createCreditCardPayment() {
        return new CreditCardPayment();
    }

    /**
     * Create an instance of {@link WorkProgressItem }
     * 
     */
    public WorkProgressItem createWorkProgressItem() {
        return new WorkProgressItem();
    }

    /**
     * Create an instance of {@link GasNameplate }
     * 
     */
    public GasNameplate createGasNameplate() {
        return new GasNameplate();
    }

    /**
     * Create an instance of {@link IntervalBlock }
     * 
     */
    public IntervalBlock createIntervalBlock() {
        return new IntervalBlock();
    }

    /**
     * Create an instance of {@link SwitchingSteps }
     * 
     */
    public SwitchingSteps createSwitchingSteps() {
        return new SwitchingSteps();
    }

    /**
     * Create an instance of {@link OtherOutages }
     * 
     */
    public OtherOutages createOtherOutages() {
        return new OtherOutages();
    }

    /**
     * Create an instance of {@link ViewDefinition }
     * 
     */
    public ViewDefinition createViewDefinition() {
        return new ViewDefinition();
    }

    /**
     * Create an instance of {@link GasMeter }
     * 
     */
    public GasMeter createGasMeter() {
        return new GasMeter();
    }

    /**
     * Create an instance of {@link ThermostatConfigurationReferable }
     * 
     */
    public ThermostatConfigurationReferable createThermostatConfigurationReferable() {
        return new ThermostatConfigurationReferable();
    }

    /**
     * Create an instance of {@link ApplicationPoints }
     * 
     */
    public ApplicationPoints createApplicationPoints() {
        return new ApplicationPoints();
    }

    /**
     * Create an instance of {@link PowerFactorManagementEvent }
     * 
     */
    public PowerFactorManagementEvent createPowerFactorManagementEvent() {
        return new PowerFactorManagementEvent();
    }

    /**
     * Create an instance of {@link ReadingList }
     * 
     */
    public ReadingList createReadingList() {
        return new ReadingList();
    }

    /**
     * Create an instance of {@link Switches }
     * 
     */
    public Switches createSwitches() {
        return new Switches();
    }

    /**
     * Create an instance of {@link PowerMonitors }
     * 
     */
    public PowerMonitors createPowerMonitors() {
        return new PowerMonitors();
    }

    /**
     * Create an instance of {@link ClearanceInstanceIDs }
     * 
     */
    public ClearanceInstanceIDs createClearanceInstanceIDs() {
        return new ClearanceInstanceIDs();
    }

    /**
     * Create an instance of {@link ChargeItem }
     * 
     */
    public ChargeItem createChargeItem() {
        return new ChargeItem();
    }

    /**
     * Create an instance of {@link LocationTrackingEvents }
     * 
     */
    public LocationTrackingEvents createLocationTrackingEvents() {
        return new LocationTrackingEvents();
    }

    /**
     * Create an instance of {@link Winding }
     * 
     */
    public Winding createWinding() {
        return new Winding();
    }

    /**
     * Create an instance of {@link LoggedOutageDetectionEvent }
     * 
     */
    public LoggedOutageDetectionEvent createLoggedOutageDetectionEvent() {
        return new LoggedOutageDetectionEvent();
    }

    /**
     * Create an instance of {@link OtherMeterExchanges }
     * 
     */
    public OtherMeterExchanges createOtherMeterExchanges() {
        return new OtherMeterExchanges();
    }

    /**
     * Create an instance of {@link PowerMonitor }
     * 
     */
    public PowerMonitor createPowerMonitor() {
        return new PowerMonitor();
    }

    /**
     * Create an instance of {@link ThermostatScheduleConfirmation }
     * 
     */
    public ThermostatScheduleConfirmation createThermostatScheduleConfirmation() {
        return new ThermostatScheduleConfirmation();
    }

    /**
     * Create an instance of {@link SwitchingDeviceBanks }
     * 
     */
    public SwitchingDeviceBanks createSwitchingDeviceBanks() {
        return new SwitchingDeviceBanks();
    }

    /**
     * Create an instance of {@link OvercurrentDevice }
     * 
     */
    public OvercurrentDevice createOvercurrentDevice() {
        return new OvercurrentDevice();
    }

    /**
     * Create an instance of {@link TelecomOutage }
     * 
     */
    public TelecomOutage createTelecomOutage() {
        return new TelecomOutage();
    }

    /**
     * Create an instance of {@link EquipmentItem }
     * 
     */
    public EquipmentItem createEquipmentItem() {
        return new EquipmentItem();
    }

    /**
     * Create an instance of {@link PricingEvent }
     * 
     */
    public PricingEvent createPricingEvent() {
        return new PricingEvent();
    }

    /**
     * Create an instance of {@link Transformer }
     * 
     */
    public Transformer createTransformer() {
        return new Transformer();
    }

    /**
     * Create an instance of {@link DeviceList }
     * 
     */
    public DeviceList createDeviceList() {
        return new DeviceList();
    }

    /**
     * Create an instance of {@link LoadMixEntries }
     * 
     */
    public LoadMixEntries createLoadMixEntries() {
        return new LoadMixEntries();
    }

    /**
     * Create an instance of {@link DisplayUsage }
     * 
     */
    public DisplayUsage createDisplayUsage() {
        return new DisplayUsage();
    }

    /**
     * Create an instance of {@link SecurityLight }
     * 
     */
    public SecurityLight createSecurityLight() {
        return new SecurityLight();
    }

    /**
     * Create an instance of {@link LTDeviceRefs }
     * 
     */
    public LTDeviceRefs createLTDeviceRefs() {
        return new LTDeviceRefs();
    }

    /**
     * Create an instance of {@link PaymentExtension }
     * 
     */
    public PaymentExtension createPaymentExtension() {
        return new PaymentExtension();
    }

    /**
     * Create an instance of {@link OutageAttachment }
     * 
     */
    public OutageAttachment createOutageAttachment() {
        return new OutageAttachment();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link PpmMeterExchanges }
     * 
     */
    public PpmMeterExchanges createPpmMeterExchanges() {
        return new PpmMeterExchanges();
    }

    /**
     * Create an instance of {@link EndDeviceEventTypeList }
     * 
     */
    public EndDeviceEventTypeList createEndDeviceEventTypeList() {
        return new EndDeviceEventTypeList();
    }

    /**
     * Create an instance of {@link MaterialEntries }
     * 
     */
    public MaterialEntries createMaterialEntries() {
        return new MaterialEntries();
    }

    /**
     * Create an instance of {@link PANDeviceRef }
     * 
     */
    public PANDeviceRef createPANDeviceRef() {
        return new PANDeviceRef();
    }

    /**
     * Create an instance of {@link TOUReadings }
     * 
     */
    public TOUReadings createTOUReadings() {
        return new TOUReadings();
    }

    /**
     * Create an instance of {@link DeviceClasses }
     * 
     */
    public DeviceClasses createDeviceClasses() {
        return new DeviceClasses();
    }

    /**
     * Create an instance of {@link StreetLight }
     * 
     */
    public StreetLight createStreetLight() {
        return new StreetLight();
    }

    /**
     * Create an instance of {@link LaborItems }
     * 
     */
    public LaborItems createLaborItems() {
        return new LaborItems();
    }

    /**
     * Create an instance of {@link LTDeviceCodes }
     * 
     */
    public LTDeviceCodes createLTDeviceCodes() {
        return new LTDeviceCodes();
    }

    /**
     * Create an instance of {@link ScadaControl }
     * 
     */
    public ScadaControl createScadaControl() {
        return new ScadaControl();
    }

    /**
     * Create an instance of {@link FlowDemand }
     * 
     */
    public FlowDemand createFlowDemand() {
        return new FlowDemand();
    }

    /**
     * Create an instance of {@link GenericAnnotationFeatures }
     * 
     */
    public GenericAnnotationFeatures createGenericAnnotationFeatures() {
        return new GenericAnnotationFeatures();
    }

    /**
     * Create an instance of {@link EndReadings }
     * 
     */
    public EndReadings createEndReadings() {
        return new EndReadings();
    }

    /**
     * Create an instance of {@link OtherSpatialFeatures }
     * 
     */
    public OtherSpatialFeatures createOtherSpatialFeatures() {
        return new OtherSpatialFeatures();
    }

    /**
     * Create an instance of {@link OutageReasonReferable }
     * 
     */
    public OutageReasonReferable createOutageReasonReferable() {
        return new OutageReasonReferable();
    }

    /**
     * Create an instance of {@link ChargeableDevices }
     * 
     */
    public ChargeableDevices createChargeableDevices() {
        return new ChargeableDevices();
    }

    /**
     * Create an instance of {@link ControlledItem }
     * 
     */
    public ControlledItem createControlledItem() {
        return new ControlledItem();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link DesignSubmission }
     * 
     */
    public DesignSubmission createDesignSubmission() {
        return new DesignSubmission();
    }

    /**
     * Create an instance of {@link CommodityUsage }
     * 
     */
    public CommodityUsage createCommodityUsage() {
        return new CommodityUsage();
    }

    /**
     * Create an instance of {@link WorkHistoryReferable }
     * 
     */
    public WorkHistoryReferable createWorkHistoryReferable() {
        return new WorkHistoryReferable();
    }

    /**
     * Create an instance of {@link PriceBins }
     * 
     */
    public PriceBins createPriceBins() {
        return new PriceBins();
    }

    /**
     * Create an instance of {@link CDEnabledItem }
     * 
     */
    public CDEnabledItem createCDEnabledItem() {
        return new CDEnabledItem();
    }

    /**
     * Create an instance of {@link PrimaryCabinet }
     * 
     */
    public PrimaryCabinet createPrimaryCabinet() {
        return new PrimaryCabinet();
    }

    /**
     * Create an instance of {@link BufferedObjectRef }
     * 
     */
    public BufferedObjectRef createBufferedObjectRef() {
        return new BufferedObjectRef();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link ScadaAnalog }
     * 
     */
    public ScadaAnalog createScadaAnalog() {
        return new ScadaAnalog();
    }

    /**
     * Create an instance of {@link ServicePoints }
     * 
     */
    public ServicePoints createServicePoints() {
        return new ServicePoints();
    }

    /**
     * Create an instance of {@link PhaseStatusItem }
     * 
     */
    public PhaseStatusItem createPhaseStatusItem() {
        return new PhaseStatusItem();
    }

    /**
     * Create an instance of {@link WorkHistoryEvent }
     * 
     */
    public WorkHistoryEvent createWorkHistoryEvent() {
        return new WorkHistoryEvent();
    }

    /**
     * Create an instance of {@link WorkRequest }
     * 
     */
    public WorkRequest createWorkRequest() {
        return new WorkRequest();
    }

    /**
     * Create an instance of {@link CircuitElement }
     * 
     */
    public CircuitElement createCircuitElement() {
        return new CircuitElement();
    }

    /**
     * Create an instance of {@link ServiceHazards }
     * 
     */
    public ServiceHazards createServiceHazards() {
        return new ServiceHazards();
    }

    /**
     * Create an instance of {@link CustomerHazard }
     * 
     */
    public CustomerHazard createCustomerHazard() {
        return new CustomerHazard();
    }

    /**
     * Create an instance of {@link OutageDetectionLogs }
     * 
     */
    public OutageDetectionLogs createOutageDetectionLogs() {
        return new OutageDetectionLogs();
    }

    /**
     * Create an instance of {@link WorkStatus }
     * 
     */
    public WorkStatus createWorkStatus() {
        return new WorkStatus();
    }

    /**
     * Create an instance of {@link CashPayments }
     * 
     */
    public CashPayments createCashPayments() {
        return new CashPayments();
    }

    /**
     * Create an instance of {@link Parcels }
     * 
     */
    public Parcels createParcels() {
        return new Parcels();
    }

    /**
     * Create an instance of {@link WorkItem }
     * 
     */
    public WorkItem createWorkItem() {
        return new WorkItem();
    }

    /**
     * Create an instance of {@link SupportedNotificationList }
     * 
     */
    public SupportedNotificationList createSupportedNotificationList() {
        return new SupportedNotificationList();
    }

    /**
     * Create an instance of {@link UsagePointHazards }
     * 
     */
    public UsagePointHazards createUsagePointHazards() {
        return new UsagePointHazards();
    }

    /**
     * Create an instance of {@link TroubleCodes }
     * 
     */
    public TroubleCodes createTroubleCodes() {
        return new TroubleCodes();
    }

    /**
     * Create an instance of {@link ServiceDropEntry }
     * 
     */
    public ServiceDropEntry createServiceDropEntry() {
        return new ServiceDropEntry();
    }

    /**
     * Create an instance of {@link HistoryComment }
     * 
     */
    public HistoryComment createHistoryComment() {
        return new HistoryComment();
    }

    /**
     * Create an instance of {@link TapeShieldCableEntry }
     * 
     */
    public TapeShieldCableEntry createTapeShieldCableEntry() {
        return new TapeShieldCableEntry();
    }

    /**
     * Create an instance of {@link LinkedTransformer }
     * 
     */
    public LinkedTransformer createLinkedTransformer() {
        return new LinkedTransformer();
    }

    /**
     * Create an instance of {@link ODBIITroubleCode }
     * 
     */
    public ODBIITroubleCode createODBIITroubleCode() {
        return new ODBIITroubleCode();
    }

    /**
     * Create an instance of {@link OutagePhaseStatuses }
     * 
     */
    public OutagePhaseStatuses createOutagePhaseStatuses() {
        return new OutagePhaseStatuses();
    }

    /**
     * Create an instance of {@link DateTimeRequests }
     * 
     */
    public DateTimeRequests createDateTimeRequests() {
        return new DateTimeRequests();
    }

    /**
     * Create an instance of {@link LocationDetails }
     * 
     */
    public LocationDetails createLocationDetails() {
        return new LocationDetails();
    }

    /**
     * Create an instance of {@link ResourceCompositionHistory }
     * 
     */
    public ResourceCompositionHistory createResourceCompositionHistory() {
        return new ResourceCompositionHistory();
    }

    /**
     * Create an instance of {@link TimePoint }
     * 
     */
    public TimePoint createTimePoint() {
        return new TimePoint();
    }

    /**
     * Create an instance of {@link CustomerHazards }
     * 
     */
    public CustomerHazards createCustomerHazards() {
        return new CustomerHazards();
    }

    /**
     * Create an instance of {@link Assembly }
     * 
     */
    public Assembly createAssembly() {
        return new Assembly();
    }

    /**
     * Create an instance of {@link ZsmImpedanceEntries }
     * 
     */
    public ZsmImpedanceEntries createZsmImpedanceEntries() {
        return new ZsmImpedanceEntries();
    }

    /**
     * Create an instance of {@link LocationTrackingLog }
     * 
     */
    public LocationTrackingLog createLocationTrackingLog() {
        return new LocationTrackingLog();
    }

    /**
     * Create an instance of {@link ControlParameters }
     * 
     */
    public ControlParameters createControlParameters() {
        return new ControlParameters();
    }

    /**
     * Create an instance of {@link AcctsReceivable }
     * 
     */
    public AcctsReceivable createAcctsReceivable() {
        return new AcctsReceivable();
    }

    /**
     * Create an instance of {@link DeletedContainer }
     * 
     */
    public DeletedContainer createDeletedContainer() {
        return new DeletedContainer();
    }

    /**
     * Create an instance of {@link ThresholdNotificationItem }
     * 
     */
    public ThresholdNotificationItem createThresholdNotificationItem() {
        return new ThresholdNotificationItem();
    }

    /**
     * Create an instance of {@link AccountPriorities }
     * 
     */
    public AccountPriorities createAccountPriorities() {
        return new AccountPriorities();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "clockBackward", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusClockBackward(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusClockBackward_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "manuallyModified", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusManuallyModified(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusManuallyModified_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "longInterval", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusLongInterval(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusLongInterval_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "clockForward", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusClockForward(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusClockForward_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "overflow", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusOverflow(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusOverflow_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "invalid", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusInvalid(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusInvalid_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "configChanged", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusConfigChanged(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusConfigChanged_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "manuallyEntered", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusManuallyEntered(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusManuallyEntered_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "DSTinEffect", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusDSTinEffect(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusDSTinEffect_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "testData", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusTestData(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusTestData_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "recorderStopped", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusRecorderStopped(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusRecorderStopped_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0", name = "partialInterval", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusPartialInterval(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusPartialInterval_QNAME, Boolean.class, BlockStatus.class, value);
    }

}
