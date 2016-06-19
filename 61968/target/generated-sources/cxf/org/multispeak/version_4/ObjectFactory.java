
package org.multispeak.version_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.multispeak.version_4 package. 
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

    private final static QName _MultiSpeakMsgHeader_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "MultiSpeakMsgHeader");
    private final static QName _BlockStatusConfigChanged_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "configChanged");
    private final static QName _BlockStatusManuallyEntered_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "manuallyEntered");
    private final static QName _BlockStatusRecorderStopped_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "recorderStopped");
    private final static QName _BlockStatusPartialInterval_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "partialInterval");
    private final static QName _BlockStatusTestData_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "testData");
    private final static QName _BlockStatusDSTinEffect_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "DSTinEffect");
    private final static QName _BlockStatusClockForward_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "clockForward");
    private final static QName _BlockStatusLongInterval_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "longInterval");
    private final static QName _BlockStatusClockBackward_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "clockBackward");
    private final static QName _BlockStatusManuallyModified_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "manuallyModified");
    private final static QName _BlockStatusInvalid_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "invalid");
    private final static QName _BlockStatusOverflow_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "overflow");
    private final static QName _EndDeviceShipmentReceivedLoadManagementDevices_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedLoadManagementDevices");
    private final static QName _EndDeviceShipmentReceivedElectricMeters_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedElectricMeters");
    private final static QName _EndDeviceShipmentReceivedCDDevices_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedCDDevices");
    private final static QName _EndDeviceShipmentReceivedPropaneMeters_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedPropaneMeters");
    private final static QName _EndDeviceShipmentUtility_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "utility");
    private final static QName _EndDeviceShipmentReceivedGasMeters_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedGasMeters");
    private final static QName _EndDeviceShipmentReceivedWaterMeters_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedWaterMeters");
    private final static QName _EndDeviceShipmentManufacturer_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "manufacturer");
    private final static QName _EndDeviceShipmentPoReferenceNumber_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "poReferenceNumber");
    private final static QName _EndDeviceShipmentTransponderIDRange_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "transponderIDRange");
    private final static QName _EndDeviceShipmentReceivedDate_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedDate");
    private final static QName _EndDeviceShipmentShippingTicketNumber_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "shippingTicketNumber");
    private final static QName _EndDeviceShipmentRecipient_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "recipient");
    private final static QName _EndDeviceShipmentShippedToAddress_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "shippedToAddress");
    private final static QName _EndDeviceShipmentReceivedModules_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "receivedModules");
    private final static QName _EndDeviceShipmentShippedDate_QNAME = new QName("http://www.multispeak.org/Version_4.1_Release", "shippedDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.multispeak.version_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OhSecondaryLine }
     * 
     */
    public OhSecondaryLine createOhSecondaryLine() {
        return new OhSecondaryLine();
    }

    /**
     * Create an instance of {@link ArrayOfPpmBalanceAdjustment }
     * 
     */
    public ArrayOfPpmBalanceAdjustment createArrayOfPpmBalanceAdjustment() {
        return new ArrayOfPpmBalanceAdjustment();
    }

    /**
     * Create an instance of {@link ArrayOfObjectRef3 }
     * 
     */
    public ArrayOfObjectRef3 createArrayOfObjectRef3() {
        return new ArrayOfObjectRef3();
    }

    /**
     * Create an instance of {@link Module }
     * 
     */
    public Module createModule() {
        return new Module();
    }

    /**
     * Create an instance of {@link CommitPaymentTransactionResponse }
     * 
     */
    public CommitPaymentTransactionResponse createCommitPaymentTransactionResponse() {
        return new CommitPaymentTransactionResponse();
    }

    /**
     * Create an instance of {@link GasMeter }
     * 
     */
    public GasMeter createGasMeter() {
        return new GasMeter();
    }

    /**
     * Create an instance of {@link DeviceList }
     * 
     */
    public DeviceList createDeviceList() {
        return new DeviceList();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetPPMPayments }
     * 
     */
    public GetPPMPayments createGetPPMPayments() {
        return new GetPPMPayments();
    }

    /**
     * Create an instance of {@link HistoryLogChangedNotification }
     * 
     */
    public HistoryLogChangedNotification createHistoryLogChangedNotification() {
        return new HistoryLogChangedNotification();
    }

    /**
     * Create an instance of {@link LoadProfileChangedNotificationResponse }
     * 
     */
    public LoadProfileChangedNotificationResponse createLoadProfileChangedNotificationResponse() {
        return new LoadProfileChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link SwitchImpedances }
     * 
     */
    public SwitchImpedances createSwitchImpedances() {
        return new SwitchImpedances();
    }

    /**
     * Create an instance of {@link CommitPaymentTransaction }
     * 
     */
    public CommitPaymentTransaction createCommitPaymentTransaction() {
        return new CommitPaymentTransaction();
    }

    /**
     * Create an instance of {@link TaskListNotification }
     * 
     */
    public TaskListNotification createTaskListNotification() {
        return new TaskListNotification();
    }

    /**
     * Create an instance of {@link SwitchingDeviceBank }
     * 
     */
    public SwitchingDeviceBank createSwitchingDeviceBank() {
        return new SwitchingDeviceBank();
    }

    /**
     * Create an instance of {@link GpsPoint }
     * 
     */
    public GpsPoint createGpsPoint() {
        return new GpsPoint();
    }

    /**
     * Create an instance of {@link ArrayOfGenericPolygonFeature }
     * 
     */
    public ArrayOfGenericPolygonFeature createArrayOfGenericPolygonFeature() {
        return new ArrayOfGenericPolygonFeature();
    }

    /**
     * Create an instance of {@link GetAllMetersResponse }
     * 
     */
    public GetAllMetersResponse createGetAllMetersResponse() {
        return new GetAllMetersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSwitchingStep }
     * 
     */
    public ArrayOfSwitchingStep createArrayOfSwitchingStep() {
        return new ArrayOfSwitchingStep();
    }

    /**
     * Create an instance of {@link CDCustomer }
     * 
     */
    public CDCustomer createCDCustomer() {
        return new CDCustomer();
    }

    /**
     * Create an instance of {@link Resistance }
     * 
     */
    public Resistance createResistance() {
        return new Resistance();
    }

    /**
     * Create an instance of {@link ArrayOfBillingAccountLoad }
     * 
     */
    public ArrayOfBillingAccountLoad createArrayOfBillingAccountLoad() {
        return new ArrayOfBillingAccountLoad();
    }

    /**
     * Create an instance of {@link AsLeft }
     * 
     */
    public AsLeft createAsLeft() {
        return new AsLeft();
    }

    /**
     * Create an instance of {@link GetModifiedCustomers }
     * 
     */
    public GetModifiedCustomers createGetModifiedCustomers() {
        return new GetModifiedCustomers();
    }

    /**
     * Create an instance of {@link ModifyCBDataForPole }
     * 
     */
    public ModifyCBDataForPole createModifyCBDataForPole() {
        return new ModifyCBDataForPole();
    }

    /**
     * Create an instance of {@link OutageReasonCodeList }
     * 
     */
    public OutageReasonCodeList createOutageReasonCodeList() {
        return new OutageReasonCodeList();
    }

    /**
     * Create an instance of {@link GetNextNumberResponse }
     * 
     */
    public GetNextNumberResponse createGetNextNumberResponse() {
        return new GetNextNumberResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConsumptionItem }
     * 
     */
    public ArrayOfConsumptionItem createArrayOfConsumptionItem() {
        return new ArrayOfConsumptionItem();
    }

    /**
     * Create an instance of {@link Premise }
     * 
     */
    public Premise createPremise() {
        return new Premise();
    }

    /**
     * Create an instance of {@link GetMetersByHomePhone }
     * 
     */
    public GetMetersByHomePhone createGetMetersByHomePhone() {
        return new GetMetersByHomePhone();
    }

    /**
     * Create an instance of {@link GetServiceLocationByLoadGroupResponse }
     * 
     */
    public GetServiceLocationByLoadGroupResponse createGetServiceLocationByLoadGroupResponse() {
        return new GetServiceLocationByLoadGroupResponse();
    }

    /**
     * Create an instance of {@link GetAllServiceLocationsByServiceTypeResponse }
     * 
     */
    public GetAllServiceLocationsByServiceTypeResponse createGetAllServiceLocationsByServiceTypeResponse() {
        return new GetAllServiceLocationsByServiceTypeResponse();
    }

    /**
     * Create an instance of {@link PpmLocation }
     * 
     */
    public PpmLocation createPpmLocation() {
        return new PpmLocation();
    }

    /**
     * Create an instance of {@link DomainNamesChangedNotification }
     * 
     */
    public DomainNamesChangedNotification createDomainNamesChangedNotification() {
        return new DomainNamesChangedNotification();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link Elbow }
     * 
     */
    public Elbow createElbow() {
        return new Elbow();
    }

    /**
     * Create an instance of {@link GetDomainMembers }
     * 
     */
    public GetDomainMembers createGetDomainMembers() {
        return new GetDomainMembers();
    }

    /**
     * Create an instance of {@link TransformerEntry }
     * 
     */
    public TransformerEntry createTransformerEntry() {
        return new TransformerEntry();
    }

    /**
     * Create an instance of {@link GetCustomerByMeterIDResponse }
     * 
     */
    public GetCustomerByMeterIDResponse createGetCustomerByMeterIDResponse() {
        return new GetCustomerByMeterIDResponse();
    }

    /**
     * Create an instance of {@link SynchronousMachineImpedances }
     * 
     */
    public SynchronousMachineImpedances createSynchronousMachineImpedances() {
        return new SynchronousMachineImpedances();
    }

    /**
     * Create an instance of {@link SecurityLight }
     * 
     */
    public SecurityLight createSecurityLight() {
        return new SecurityLight();
    }

    /**
     * Create an instance of {@link CDStatesChangedNotificationResponse }
     * 
     */
    public CDStatesChangedNotificationResponse createCDStatesChangedNotificationResponse() {
        return new CDStatesChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGasMeterExchange }
     * 
     */
    public ArrayOfGasMeterExchange createArrayOfGasMeterExchange() {
        return new ArrayOfGasMeterExchange();
    }

    /**
     * Create an instance of {@link TrafficLight }
     * 
     */
    public TrafficLight createTrafficLight() {
        return new TrafficLight();
    }

    /**
     * Create an instance of {@link GetAllCustomersByServiceType }
     * 
     */
    public GetAllCustomersByServiceType createGetAllCustomersByServiceType() {
        return new GetAllCustomersByServiceType();
    }

    /**
     * Create an instance of {@link GetCustomerByCustomerIDResponse }
     * 
     */
    public GetCustomerByCustomerIDResponse createGetCustomerByCustomerIDResponse() {
        return new GetCustomerByCustomerIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfGuy }
     * 
     */
    public ArrayOfGuy createArrayOfGuy() {
        return new ArrayOfGuy();
    }

    /**
     * Create an instance of {@link GetConvenienceFees }
     * 
     */
    public GetConvenienceFees createGetConvenienceFees() {
        return new GetConvenienceFees();
    }

    /**
     * Create an instance of {@link ArrayOfScadaPoint }
     * 
     */
    public ArrayOfScadaPoint createArrayOfScadaPoint() {
        return new ArrayOfScadaPoint();
    }

    /**
     * Create an instance of {@link MeterHistoryEvent }
     * 
     */
    public MeterHistoryEvent createMeterHistoryEvent() {
        return new MeterHistoryEvent();
    }

    /**
     * Create an instance of {@link GetMetersByAMRTypeResponse }
     * 
     */
    public GetMetersByAMRTypeResponse createGetMetersByAMRTypeResponse() {
        return new GetMetersByAMRTypeResponse();
    }

    /**
     * Create an instance of {@link WorkStatus }
     * 
     */
    public WorkStatus createWorkStatus() {
        return new WorkStatus();
    }

    /**
     * Create an instance of {@link LaborComponent }
     * 
     */
    public LaborComponent createLaborComponent() {
        return new LaborComponent();
    }

    /**
     * Create an instance of {@link ArrayOfMeterReading1 }
     * 
     */
    public ArrayOfMeterReading1 createArrayOfMeterReading1() {
        return new ArrayOfMeterReading1();
    }

    /**
     * Create an instance of {@link CheckInfo }
     * 
     */
    public CheckInfo createCheckInfo() {
        return new CheckInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAccount }
     * 
     */
    public ArrayOfAccount createArrayOfAccount() {
        return new ArrayOfAccount();
    }

    /**
     * Create an instance of {@link UsageInstance }
     * 
     */
    public UsageInstance createUsageInstance() {
        return new UsageInstance();
    }

    /**
     * Create an instance of {@link PowerMonitor }
     * 
     */
    public PowerMonitor createPowerMonitor() {
        return new PowerMonitor();
    }

    /**
     * Create an instance of {@link Riser }
     * 
     */
    public Riser createRiser() {
        return new Riser();
    }

    /**
     * Create an instance of {@link ArrayOfReadingScheduleResult }
     * 
     */
    public ArrayOfReadingScheduleResult createArrayOfReadingScheduleResult() {
        return new ArrayOfReadingScheduleResult();
    }

    /**
     * Create an instance of {@link GetGasMetersByAccountNumber }
     * 
     */
    public GetGasMetersByAccountNumber createGetGasMetersByAccountNumber() {
        return new GetGasMetersByAccountNumber();
    }

    /**
     * Create an instance of {@link InHomeDisplayExchangeNotificationResponse }
     * 
     */
    public InHomeDisplayExchangeNotificationResponse createInHomeDisplayExchangeNotificationResponse() {
        return new InHomeDisplayExchangeNotificationResponse();
    }

    /**
     * Create an instance of {@link GetServiceLocationByServiceStatus }
     * 
     */
    public GetServiceLocationByServiceStatus createGetServiceLocationByServiceStatus() {
        return new GetServiceLocationByServiceStatus();
    }

    /**
     * Create an instance of {@link Registers }
     * 
     */
    public Registers createRegisters() {
        return new Registers();
    }

    /**
     * Create an instance of {@link ArrayOfJointUse }
     * 
     */
    public ArrayOfJointUse createArrayOfJointUse() {
        return new ArrayOfJointUse();
    }

    /**
     * Create an instance of {@link CapacitorBank }
     * 
     */
    public CapacitorBank createCapacitorBank() {
        return new CapacitorBank();
    }

    /**
     * Create an instance of {@link WeightPerLength }
     * 
     */
    public WeightPerLength createWeightPerLength() {
        return new WeightPerLength();
    }

    /**
     * Create an instance of {@link ArrayOfSwitchingOrder }
     * 
     */
    public ArrayOfSwitchingOrder createArrayOfSwitchingOrder() {
        return new ArrayOfSwitchingOrder();
    }

    /**
     * Create an instance of {@link MeterInstalledNotificationResponse }
     * 
     */
    public MeterInstalledNotificationResponse createMeterInstalledNotificationResponse() {
        return new MeterInstalledNotificationResponse();
    }

    /**
     * Create an instance of {@link OutageDetectionLog }
     * 
     */
    public OutageDetectionLog createOutageDetectionLog() {
        return new OutageDetectionLog();
    }

    /**
     * Create an instance of {@link GetMeterGroupNames }
     * 
     */
    public GetMeterGroupNames createGetMeterGroupNames() {
        return new GetMeterGroupNames();
    }

    /**
     * Create an instance of {@link CustomersAffectedByOutage }
     * 
     */
    public CustomersAffectedByOutage createCustomersAffectedByOutage() {
        return new CustomersAffectedByOutage();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentTransactionList }
     * 
     */
    public ArrayOfPaymentTransactionList createArrayOfPaymentTransactionList() {
        return new ArrayOfPaymentTransactionList();
    }

    /**
     * Create an instance of {@link PremiseService }
     * 
     */
    public PremiseService createPremiseService() {
        return new PremiseService();
    }

    /**
     * Create an instance of {@link GetServiceLocationByAccountNumber }
     * 
     */
    public GetServiceLocationByAccountNumber createGetServiceLocationByAccountNumber() {
        return new GetServiceLocationByAccountNumber();
    }

    /**
     * Create an instance of {@link OhTransmissionLine }
     * 
     */
    public OhTransmissionLine createOhTransmissionLine() {
        return new OhTransmissionLine();
    }

    /**
     * Create an instance of {@link ROWAttributes }
     * 
     */
    public ROWAttributes createROWAttributes() {
        return new ROWAttributes();
    }

    /**
     * Create an instance of {@link ArrayOfString11 }
     * 
     */
    public ArrayOfString11 createArrayOfString11() {
        return new ArrayOfString11();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Summation }
     * 
     */
    public Summation createSummation() {
        return new Summation();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link WorkTask }
     * 
     */
    public WorkTask createWorkTask() {
        return new WorkTask();
    }

    /**
     * Create an instance of {@link Telemetry }
     * 
     */
    public Telemetry createTelemetry() {
        return new Telemetry();
    }

    /**
     * Create an instance of {@link TransformerRatio }
     * 
     */
    public TransformerRatio createTransformerRatio() {
        return new TransformerRatio();
    }

    /**
     * Create an instance of {@link AssetFields }
     * 
     */
    public AssetFields createAssetFields() {
        return new AssetFields();
    }

    /**
     * Create an instance of {@link GetMeterHistoryByMeterIDResponse }
     * 
     */
    public GetMeterHistoryByMeterIDResponse createGetMeterHistoryByMeterIDResponse() {
        return new GetMeterHistoryByMeterIDResponse();
    }

    /**
     * Create an instance of {@link RequestedNumber }
     * 
     */
    public RequestedNumber createRequestedNumber() {
        return new RequestedNumber();
    }

    /**
     * Create an instance of {@link VoltageAlarmItem }
     * 
     */
    public VoltageAlarmItem createVoltageAlarmItem() {
        return new VoltageAlarmItem();
    }

    /**
     * Create an instance of {@link CDDevice }
     * 
     */
    public CDDevice createCDDevice() {
        return new CDDevice();
    }

    /**
     * Create an instance of {@link GetAllPropaneMeters }
     * 
     */
    public GetAllPropaneMeters createGetAllPropaneMeters() {
        return new GetAllPropaneMeters();
    }

    /**
     * Create an instance of {@link GetUsageByMeterID }
     * 
     */
    public GetUsageByMeterID createGetUsageByMeterID() {
        return new GetUsageByMeterID();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link SwitchEntry }
     * 
     */
    public SwitchEntry createSwitchEntry() {
        return new SwitchEntry();
    }

    /**
     * Create an instance of {@link GetMetersByCustomerNameResponse }
     * 
     */
    public GetMetersByCustomerNameResponse createGetMetersByCustomerNameResponse() {
        return new GetMetersByCustomerNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTestInstance }
     * 
     */
    public ArrayOfTestInstance createArrayOfTestInstance() {
        return new ArrayOfTestInstance();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link JointUse }
     * 
     */
    public JointUse createJointUse() {
        return new JointUse();
    }

    /**
     * Create an instance of {@link LineImpedances }
     * 
     */
    public LineImpedances createLineImpedances() {
        return new LineImpedances();
    }

    /**
     * Create an instance of {@link StreetLocation }
     * 
     */
    public StreetLocation createStreetLocation() {
        return new StreetLocation();
    }

    /**
     * Create an instance of {@link BackgroundGraphics }
     * 
     */
    public BackgroundGraphics createBackgroundGraphics() {
        return new BackgroundGraphics();
    }

    /**
     * Create an instance of {@link GetWaterMetersByAccountNumber }
     * 
     */
    public GetWaterMetersByAccountNumber createGetWaterMetersByAccountNumber() {
        return new GetWaterMetersByAccountNumber();
    }

    /**
     * Create an instance of {@link OutageEvent }
     * 
     */
    public OutageEvent createOutageEvent() {
        return new OutageEvent();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link ArrayOfString4 }
     * 
     */
    public ArrayOfString4 createArrayOfString4() {
        return new ArrayOfString4();
    }

    /**
     * Create an instance of {@link ArrayOfOtherContactItem }
     * 
     */
    public ArrayOfOtherContactItem createArrayOfOtherContactItem() {
        return new ArrayOfOtherContactItem();
    }

    /**
     * Create an instance of {@link OtherService }
     * 
     */
    public OtherService createOtherService() {
        return new OtherService();
    }

    /**
     * Create an instance of {@link ModifyCBDataForServiceLocationsResponse }
     * 
     */
    public ModifyCBDataForServiceLocationsResponse createModifyCBDataForServiceLocationsResponse() {
        return new ModifyCBDataForServiceLocationsResponse();
    }

    /**
     * Create an instance of {@link PowerSystemDevice }
     * 
     */
    public PowerSystemDevice createPowerSystemDevice() {
        return new PowerSystemDevice();
    }

    /**
     * Create an instance of {@link CumDemand }
     * 
     */
    public CumDemand createCumDemand() {
        return new CumDemand();
    }

    /**
     * Create an instance of {@link ConsumptionItem }
     * 
     */
    public ConsumptionItem createConsumptionItem() {
        return new ConsumptionItem();
    }

    /**
     * Create an instance of {@link Ch }
     * 
     */
    public Ch createCh() {
        return new Ch();
    }

    /**
     * Create an instance of {@link ArrayOfCustomer }
     * 
     */
    public ArrayOfCustomer createArrayOfCustomer() {
        return new ArrayOfCustomer();
    }

    /**
     * Create an instance of {@link TelephoneNumber }
     * 
     */
    public TelephoneNumber createTelephoneNumber() {
        return new TelephoneNumber();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

    /**
     * Create an instance of {@link GetModifiedServiceLocations }
     * 
     */
    public GetModifiedServiceLocations createGetModifiedServiceLocations() {
        return new GetModifiedServiceLocations();
    }

    /**
     * Create an instance of {@link ArrayOfPropaneMeter1 }
     * 
     */
    public ArrayOfPropaneMeter1 createArrayOfPropaneMeter1() {
        return new ArrayOfPropaneMeter1();
    }

    /**
     * Create an instance of {@link CDStateNotification }
     * 
     */
    public CDStateNotification createCDStateNotification() {
        return new CDStateNotification();
    }

    /**
     * Create an instance of {@link GetTransformerBankByBankIDFromCBResponse }
     * 
     */
    public GetTransformerBankByBankIDFromCBResponse createGetTransformerBankByBankIDFromCBResponse() {
        return new GetTransformerBankByBankIDFromCBResponse();
    }

    /**
     * Create an instance of {@link ExistingMeter }
     * 
     */
    public ExistingMeter createExistingMeter() {
        return new ExistingMeter();
    }

    /**
     * Create an instance of {@link ArrayOfServiceLocation }
     * 
     */
    public ArrayOfServiceLocation createArrayOfServiceLocation() {
        return new ArrayOfServiceLocation();
    }

    /**
     * Create an instance of {@link ArrayOfLoadSection }
     * 
     */
    public ArrayOfLoadSection createArrayOfLoadSection() {
        return new ArrayOfLoadSection();
    }

    /**
     * Create an instance of {@link DomainNamesChangedNotificationResponse }
     * 
     */
    public DomainNamesChangedNotificationResponse createDomainNamesChangedNotificationResponse() {
        return new DomainNamesChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link UgPrimaryLine }
     * 
     */
    public UgPrimaryLine createUgPrimaryLine() {
        return new UgPrimaryLine();
    }

    /**
     * Create an instance of {@link GetMeterBaseByObjectIDResponse }
     * 
     */
    public GetMeterBaseByObjectIDResponse createGetMeterBaseByObjectIDResponse() {
        return new GetMeterBaseByObjectIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSyntaxItem }
     * 
     */
    public ArrayOfSyntaxItem createArrayOfSyntaxItem() {
        return new ArrayOfSyntaxItem();
    }

    /**
     * Create an instance of {@link AssociatedMeters }
     * 
     */
    public AssociatedMeters createAssociatedMeters() {
        return new AssociatedMeters();
    }

    /**
     * Create an instance of {@link PickList }
     * 
     */
    public PickList createPickList() {
        return new PickList();
    }

    /**
     * Create an instance of {@link ArrayOfVehicle }
     * 
     */
    public ArrayOfVehicle createArrayOfVehicle() {
        return new ArrayOfVehicle();
    }

    /**
     * Create an instance of {@link ArrayOfGenericLineFeature }
     * 
     */
    public ArrayOfGenericLineFeature createArrayOfGenericLineFeature() {
        return new ArrayOfGenericLineFeature();
    }

    /**
     * Create an instance of {@link GetRegistrationInfoByID }
     * 
     */
    public GetRegistrationInfoByID createGetRegistrationInfoByID() {
        return new GetRegistrationInfoByID();
    }

    /**
     * Create an instance of {@link MaintenanceDataSet }
     * 
     */
    public MaintenanceDataSet createMaintenanceDataSet() {
        return new MaintenanceDataSet();
    }

    /**
     * Create an instance of {@link MaterialManagementAssembly }
     * 
     */
    public MaterialManagementAssembly createMaterialManagementAssembly() {
        return new MaterialManagementAssembly();
    }

    /**
     * Create an instance of {@link AsFound }
     * 
     */
    public AsFound createAsFound() {
        return new AsFound();
    }

    /**
     * Create an instance of {@link DetailedAddressFields }
     * 
     */
    public DetailedAddressFields createDetailedAddressFields() {
        return new DetailedAddressFields();
    }

    /**
     * Create an instance of {@link ArrayOfAnalogValue }
     * 
     */
    public ArrayOfAnalogValue createArrayOfAnalogValue() {
        return new ArrayOfAnalogValue();
    }

    /**
     * Create an instance of {@link ObservationDefinition }
     * 
     */
    public ObservationDefinition createObservationDefinition() {
        return new ObservationDefinition();
    }

    /**
     * Create an instance of {@link GasMeterExchange }
     * 
     */
    public GasMeterExchange createGasMeterExchange() {
        return new GasMeterExchange();
    }

    /**
     * Create an instance of {@link ReadingType }
     * 
     */
    public ReadingType createReadingType() {
        return new ReadingType();
    }

    /**
     * Create an instance of {@link EventInstance }
     * 
     */
    public EventInstance createEventInstance() {
        return new EventInstance();
    }

    /**
     * Create an instance of {@link IntervalBlock }
     * 
     */
    public IntervalBlock createIntervalBlock() {
        return new IntervalBlock();
    }

    /**
     * Create an instance of {@link MeterEventNotification }
     * 
     */
    public MeterEventNotification createMeterEventNotification() {
        return new MeterEventNotification();
    }

    /**
     * Create an instance of {@link ArrayOfMeterBaseExchange }
     * 
     */
    public ArrayOfMeterBaseExchange createArrayOfMeterBaseExchange() {
        return new ArrayOfMeterBaseExchange();
    }

    /**
     * Create an instance of {@link ArrayOfRegulator }
     * 
     */
    public ArrayOfRegulator createArrayOfRegulator() {
        return new ArrayOfRegulator();
    }

    /**
     * Create an instance of {@link WorkLocation }
     * 
     */
    public WorkLocation createWorkLocation() {
        return new WorkLocation();
    }

    /**
     * Create an instance of {@link GetServiceLocationByServiceType }
     * 
     */
    public GetServiceLocationByServiceType createGetServiceLocationByServiceType() {
        return new GetServiceLocationByServiceType();
    }

    /**
     * Create an instance of {@link EndDeviceShipmentNotification }
     * 
     */
    public EndDeviceShipmentNotification createEndDeviceShipmentNotification() {
        return new EndDeviceShipmentNotification();
    }

    /**
     * Create an instance of {@link ObjectRef }
     * 
     */
    public ObjectRef createObjectRef() {
        return new ObjectRef();
    }

    /**
     * Create an instance of {@link ArrayOfString12 }
     * 
     */
    public ArrayOfString12 createArrayOfString12() {
        return new ArrayOfString12();
    }

    /**
     * Create an instance of {@link SwitchingOrder }
     * 
     */
    public SwitchingOrder createSwitchingOrder() {
        return new SwitchingOrder();
    }

    /**
     * Create an instance of {@link ReturnGeneratedNumber }
     * 
     */
    public ReturnGeneratedNumber createReturnGeneratedNumber() {
        return new ReturnGeneratedNumber();
    }

    /**
     * Create an instance of {@link PaymentTransaction }
     * 
     */
    public PaymentTransaction createPaymentTransaction() {
        return new PaymentTransaction();
    }

    /**
     * Create an instance of {@link CDDeviceExchangeNotificationResponse }
     * 
     */
    public CDDeviceExchangeNotificationResponse createCDDeviceExchangeNotificationResponse() {
        return new CDDeviceExchangeNotificationResponse();
    }

    /**
     * Create an instance of {@link Usage }
     * 
     */
    public Usage createUsage() {
        return new Usage();
    }

    /**
     * Create an instance of {@link GetServiceLocationByCustomerID }
     * 
     */
    public GetServiceLocationByCustomerID createGetServiceLocationByCustomerID() {
        return new GetServiceLocationByCustomerID();
    }

    /**
     * Create an instance of {@link ArrayOfCapacitor }
     * 
     */
    public ArrayOfCapacitor createArrayOfCapacitor() {
        return new ArrayOfCapacitor();
    }

    /**
     * Create an instance of {@link Pole }
     * 
     */
    public Pole createPole() {
        return new Pole();
    }

    /**
     * Create an instance of {@link GetModifiedCustomersResponse }
     * 
     */
    public GetModifiedCustomersResponse createGetModifiedCustomersResponse() {
        return new GetModifiedCustomersResponse();
    }

    /**
     * Create an instance of {@link GetAllSecurityLightsResponse }
     * 
     */
    public GetAllSecurityLightsResponse createGetAllSecurityLightsResponse() {
        return new GetAllSecurityLightsResponse();
    }

    /**
     * Create an instance of {@link ServiceLocation }
     * 
     */
    public ServiceLocation createServiceLocation() {
        return new ServiceLocation();
    }

    /**
     * Create an instance of {@link WorkList }
     * 
     */
    public WorkList createWorkList() {
        return new WorkList();
    }

    /**
     * Create an instance of {@link ZigBeeCancelMessage }
     * 
     */
    public ZigBeeCancelMessage createZigBeeCancelMessage() {
        return new ZigBeeCancelMessage();
    }

    /**
     * Create an instance of {@link GetPayableItemsListResponse }
     * 
     */
    public GetPayableItemsListResponse createGetPayableItemsListResponse() {
        return new GetPayableItemsListResponse();
    }

    /**
     * Create an instance of {@link ZigBeeDisplayMessage }
     * 
     */
    public ZigBeeDisplayMessage createZigBeeDisplayMessage() {
        return new ZigBeeDisplayMessage();
    }

    /**
     * Create an instance of {@link Weight }
     * 
     */
    public Weight createWeight() {
        return new Weight();
    }

    /**
     * Create an instance of {@link IntervalDataNotificationResponse }
     * 
     */
    public IntervalDataNotificationResponse createIntervalDataNotificationResponse() {
        return new IntervalDataNotificationResponse();
    }

    /**
     * Create an instance of {@link FormattedBlockNotificationResponse }
     * 
     */
    public FormattedBlockNotificationResponse createFormattedBlockNotificationResponse() {
        return new FormattedBlockNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLMDeviceExchange }
     * 
     */
    public ArrayOfLMDeviceExchange createArrayOfLMDeviceExchange() {
        return new ArrayOfLMDeviceExchange();
    }

    /**
     * Create an instance of {@link GetRegistrationInfoByIDResponse }
     * 
     */
    public GetRegistrationInfoByIDResponse createGetRegistrationInfoByIDResponse() {
        return new GetRegistrationInfoByIDResponse();
    }

    /**
     * Create an instance of {@link CDStateChangedNotification }
     * 
     */
    public CDStateChangedNotification createCDStateChangedNotification() {
        return new CDStateChangedNotification();
    }

    /**
     * Create an instance of {@link OtherNameplate }
     * 
     */
    public OtherNameplate createOtherNameplate() {
        return new OtherNameplate();
    }

    /**
     * Create an instance of {@link ArrayOfServiceOrder }
     * 
     */
    public ArrayOfServiceOrder createArrayOfServiceOrder() {
        return new ArrayOfServiceOrder();
    }

    /**
     * Create an instance of {@link Voltage }
     * 
     */
    public Voltage createVoltage() {
        return new Voltage();
    }

    /**
     * Create an instance of {@link ReplacementMeter }
     * 
     */
    public ReplacementMeter createReplacementMeter() {
        return new ReplacementMeter();
    }

    /**
     * Create an instance of {@link ArrayOfChannelBlock }
     * 
     */
    public ArrayOfChannelBlock createArrayOfChannelBlock() {
        return new ArrayOfChannelBlock();
    }

    /**
     * Create an instance of {@link Height }
     * 
     */
    public Height createHeight() {
        return new Height();
    }

    /**
     * Create an instance of {@link EaEquipID }
     * 
     */
    public EaEquipID createEaEquipID() {
        return new EaEquipID();
    }

    /**
     * Create an instance of {@link ArrayOfIntervalProfile }
     * 
     */
    public ArrayOfIntervalProfile createArrayOfIntervalProfile() {
        return new ArrayOfIntervalProfile();
    }

    /**
     * Create an instance of {@link GetServiceOrderByServiceOrderID }
     * 
     */
    public GetServiceOrderByServiceOrderID createGetServiceOrderByServiceOrderID() {
        return new GetServiceOrderByServiceOrderID();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEndReading }
     * 
     */
    public ArrayOfEndReading createArrayOfEndReading() {
        return new ArrayOfEndReading();
    }

    /**
     * Create an instance of {@link GetPublishMethods }
     * 
     */
    public GetPublishMethods createGetPublishMethods() {
        return new GetPublishMethods();
    }

    /**
     * Create an instance of {@link ComplexImpedanceWithLeakage }
     * 
     */
    public ComplexImpedanceWithLeakage createComplexImpedanceWithLeakage() {
        return new ComplexImpedanceWithLeakage();
    }

    /**
     * Create an instance of {@link LaborCategory }
     * 
     */
    public LaborCategory createLaborCategory() {
        return new LaborCategory();
    }

    /**
     * Create an instance of {@link SpanGuy }
     * 
     */
    public SpanGuy createSpanGuy() {
        return new SpanGuy();
    }

    /**
     * Create an instance of {@link MeterTestNotificationResponse }
     * 
     */
    public MeterTestNotificationResponse createMeterTestNotificationResponse() {
        return new MeterTestNotificationResponse();
    }

    /**
     * Create an instance of {@link ModifyCBDataForTransformerBankResponse }
     * 
     */
    public ModifyCBDataForTransformerBankResponse createModifyCBDataForTransformerBankResponse() {
        return new ModifyCBDataForTransformerBankResponse();
    }

    /**
     * Create an instance of {@link Unassignment }
     * 
     */
    public Unassignment createUnassignment() {
        return new Unassignment();
    }

    /**
     * Create an instance of {@link GraphicSymbol }
     * 
     */
    public GraphicSymbol createGraphicSymbol() {
        return new GraphicSymbol();
    }

    /**
     * Create an instance of {@link MeterBaseInstalledNotificationResponse }
     * 
     */
    public MeterBaseInstalledNotificationResponse createMeterBaseInstalledNotificationResponse() {
        return new MeterBaseInstalledNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCPR }
     * 
     */
    public ArrayOfCPR createArrayOfCPR() {
        return new ArrayOfCPR();
    }

    /**
     * Create an instance of {@link MaterialAttributes }
     * 
     */
    public MaterialAttributes createMaterialAttributes() {
        return new MaterialAttributes();
    }

    /**
     * Create an instance of {@link ArrayOfSkill }
     * 
     */
    public ArrayOfSkill createArrayOfSkill() {
        return new ArrayOfSkill();
    }

    /**
     * Create an instance of {@link WaterLocationFields }
     * 
     */
    public WaterLocationFields createWaterLocationFields() {
        return new WaterLocationFields();
    }

    /**
     * Create an instance of {@link BackSpan }
     * 
     */
    public BackSpan createBackSpan() {
        return new BackSpan();
    }

    /**
     * Create an instance of {@link SynchronousMachineEntry }
     * 
     */
    public SynchronousMachineEntry createSynchronousMachineEntry() {
        return new SynchronousMachineEntry();
    }

    /**
     * Create an instance of {@link ArrayOfOtherService }
     * 
     */
    public ArrayOfOtherService createArrayOfOtherService() {
        return new ArrayOfOtherService();
    }

    /**
     * Create an instance of {@link GetAllMeters }
     * 
     */
    public GetAllMeters createGetAllMeters() {
        return new GetAllMeters();
    }

    /**
     * Create an instance of {@link ServiceID }
     * 
     */
    public ServiceID createServiceID() {
        return new ServiceID();
    }

    /**
     * Create an instance of {@link Impedance }
     * 
     */
    public Impedance createImpedance() {
        return new Impedance();
    }

    /**
     * Create an instance of {@link Timesheet }
     * 
     */
    public Timesheet createTimesheet() {
        return new Timesheet();
    }

    /**
     * Create an instance of {@link GetTransformerBankByUnitIDFromCB }
     * 
     */
    public GetTransformerBankByUnitIDFromCB createGetTransformerBankByUnitIDFromCB() {
        return new GetTransformerBankByUnitIDFromCB();
    }

    /**
     * Create an instance of {@link PaymentTransactionList }
     * 
     */
    public PaymentTransactionList createPaymentTransactionList() {
        return new PaymentTransactionList();
    }

    /**
     * Create an instance of {@link ElectricMeterExchange }
     * 
     */
    public ElectricMeterExchange createElectricMeterExchange() {
        return new ElectricMeterExchange();
    }

    /**
     * Create an instance of {@link MeterInstalledNotification }
     * 
     */
    public MeterInstalledNotification createMeterInstalledNotification() {
        return new MeterInstalledNotification();
    }

    /**
     * Create an instance of {@link GetNextNumber }
     * 
     */
    public GetNextNumber createGetNextNumber() {
        return new GetNextNumber();
    }

    /**
     * Create an instance of {@link TestInstance }
     * 
     */
    public TestInstance createTestInstance() {
        return new TestInstance();
    }

    /**
     * Create an instance of {@link Lead }
     * 
     */
    public Lead createLead() {
        return new Lead();
    }

    /**
     * Create an instance of {@link PropaneMeters }
     * 
     */
    public PropaneMeters createPropaneMeters() {
        return new PropaneMeters();
    }

    /**
     * Create an instance of {@link CDStateChange }
     * 
     */
    public CDStateChange createCDStateChange() {
        return new CDStateChange();
    }

    /**
     * Create an instance of {@link ElectricNameplate }
     * 
     */
    public ElectricNameplate createElectricNameplate() {
        return new ElectricNameplate();
    }

    /**
     * Create an instance of {@link EMailAddress }
     * 
     */
    public EMailAddress createEMailAddress() {
        return new EMailAddress();
    }

    /**
     * Create an instance of {@link InHomeDisplayGroup }
     * 
     */
    public InHomeDisplayGroup createInHomeDisplayGroup() {
        return new InHomeDisplayGroup();
    }

    /**
     * Create an instance of {@link Thickness }
     * 
     */
    public Thickness createThickness() {
        return new Thickness();
    }

    /**
     * Create an instance of {@link ThermalCoefficientOfResistance }
     * 
     */
    public ThermalCoefficientOfResistance createThermalCoefficientOfResistance() {
        return new ThermalCoefficientOfResistance();
    }

    /**
     * Create an instance of {@link GetAccountByMeterIDAndServiceType }
     * 
     */
    public GetAccountByMeterIDAndServiceType createGetAccountByMeterIDAndServiceType() {
        return new GetAccountByMeterIDAndServiceType();
    }

    /**
     * Create an instance of {@link GetChargeableDevicesByAccountNumberResponse }
     * 
     */
    public GetChargeableDevicesByAccountNumberResponse createGetChargeableDevicesByAccountNumberResponse() {
        return new GetChargeableDevicesByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link FakeNodeSection }
     * 
     */
    public FakeNodeSection createFakeNodeSection() {
        return new FakeNodeSection();
    }

    /**
     * Create an instance of {@link ArrayOfPickListItem }
     * 
     */
    public ArrayOfPickListItem createArrayOfPickListItem() {
        return new ArrayOfPickListItem();
    }

    /**
     * Create an instance of {@link GetMetersByAccountNumberAndServiceType }
     * 
     */
    public GetMetersByAccountNumberAndServiceType createGetMetersByAccountNumberAndServiceType() {
        return new GetMetersByAccountNumberAndServiceType();
    }

    /**
     * Create an instance of {@link ArrayOfItemMaintained }
     * 
     */
    public ArrayOfItemMaintained createArrayOfItemMaintained() {
        return new ArrayOfItemMaintained();
    }

    /**
     * Create an instance of {@link ArrayOfPropaneService }
     * 
     */
    public ArrayOfPropaneService createArrayOfPropaneService() {
        return new ArrayOfPropaneService();
    }

    /**
     * Create an instance of {@link ConcentricNeutralCableEntry }
     * 
     */
    public ConcentricNeutralCableEntry createConcentricNeutralCableEntry() {
        return new ConcentricNeutralCableEntry();
    }

    /**
     * Create an instance of {@link MultiSpeakMsgHeader }
     * 
     */
    public MultiSpeakMsgHeader createMultiSpeakMsgHeader() {
        return new MultiSpeakMsgHeader();
    }

    /**
     * Create an instance of {@link GetAllConnectDisconnectEventsByReasonCodeResponse }
     * 
     */
    public GetAllConnectDisconnectEventsByReasonCodeResponse createGetAllConnectDisconnectEventsByReasonCodeResponse() {
        return new GetAllConnectDisconnectEventsByReasonCodeResponse();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link GetPropaneMetersByAccountNumberResponse }
     * 
     */
    public GetPropaneMetersByAccountNumberResponse createGetPropaneMetersByAccountNumberResponse() {
        return new GetPropaneMetersByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link GetModifiedTransformerBanksFromCBResponse }
     * 
     */
    public GetModifiedTransformerBanksFromCBResponse createGetModifiedTransformerBanksFromCBResponse() {
        return new GetModifiedTransformerBanksFromCBResponse();
    }

    /**
     * Create an instance of {@link GetMetersByAMRType }
     * 
     */
    public GetMetersByAMRType createGetMetersByAMRType() {
        return new GetMetersByAMRType();
    }

    /**
     * Create an instance of {@link ModifyCBDataForMeters }
     * 
     */
    public ModifyCBDataForMeters createModifyCBDataForMeters() {
        return new ModifyCBDataForMeters();
    }

    /**
     * Create an instance of {@link ArrayOfConnectDisconnectEvent }
     * 
     */
    public ArrayOfConnectDisconnectEvent createArrayOfConnectDisconnectEvent() {
        return new ArrayOfConnectDisconnectEvent();
    }

    /**
     * Create an instance of {@link OutageAttachment }
     * 
     */
    public OutageAttachment createOutageAttachment() {
        return new OutageAttachment();
    }

    /**
     * Create an instance of {@link GetModifiedTransformerBanksFromCB }
     * 
     */
    public GetModifiedTransformerBanksFromCB createGetModifiedTransformerBanksFromCB() {
        return new GetModifiedTransformerBanksFromCB();
    }

    /**
     * Create an instance of {@link MeterGroups }
     * 
     */
    public MeterGroups createMeterGroups() {
        return new MeterGroups();
    }

    /**
     * Create an instance of {@link ArrayOfServiceLocation1 }
     * 
     */
    public ArrayOfServiceLocation1 createArrayOfServiceLocation1() {
        return new ArrayOfServiceLocation1();
    }

    /**
     * Create an instance of {@link ArrayOfGraphicSymbol }
     * 
     */
    public ArrayOfGraphicSymbol createArrayOfGraphicSymbol() {
        return new ArrayOfGraphicSymbol();
    }

    /**
     * Create an instance of {@link GetAccountByMeterIDAndServiceTypeResponse }
     * 
     */
    public GetAccountByMeterIDAndServiceTypeResponse createGetAccountByMeterIDAndServiceTypeResponse() {
        return new GetAccountByMeterIDAndServiceTypeResponse();
    }

    /**
     * Create an instance of {@link GetTransformerBankByUnitIDFromCBResponse }
     * 
     */
    public GetTransformerBankByUnitIDFromCBResponse createGetTransformerBankByUnitIDFromCBResponse() {
        return new GetTransformerBankByUnitIDFromCBResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link MeterConnectivityNotificationResponse }
     * 
     */
    public MeterConnectivityNotificationResponse createMeterConnectivityNotificationResponse() {
        return new MeterConnectivityNotificationResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByName }
     * 
     */
    public GetCustomerByName createGetCustomerByName() {
        return new GetCustomerByName();
    }

    /**
     * Create an instance of {@link ArrayOfAcctsReceivable }
     * 
     */
    public ArrayOfAcctsReceivable createArrayOfAcctsReceivable() {
        return new ArrayOfAcctsReceivable();
    }

    /**
     * Create an instance of {@link ModifyCBDataForServiceLocations }
     * 
     */
    public ModifyCBDataForServiceLocations createModifyCBDataForServiceLocations() {
        return new ModifyCBDataForServiceLocations();
    }

    /**
     * Create an instance of {@link GetMetersBySearchString }
     * 
     */
    public GetMetersBySearchString createGetMetersBySearchString() {
        return new GetMetersBySearchString();
    }

    /**
     * Create an instance of {@link ArrayOfResource }
     * 
     */
    public ArrayOfResource createArrayOfResource() {
        return new ArrayOfResource();
    }

    /**
     * Create an instance of {@link ArrayOfWorkRequest }
     * 
     */
    public ArrayOfWorkRequest createArrayOfWorkRequest() {
        return new ArrayOfWorkRequest();
    }

    /**
     * Create an instance of {@link ProfileObject }
     * 
     */
    public ProfileObject createProfileObject() {
        return new ProfileObject();
    }

    /**
     * Create an instance of {@link PhysicalObjectList }
     * 
     */
    public PhysicalObjectList createPhysicalObjectList() {
        return new PhysicalObjectList();
    }

    /**
     * Create an instance of {@link HistoryComment }
     * 
     */
    public HistoryComment createHistoryComment() {
        return new HistoryComment();
    }

    /**
     * Create an instance of {@link SectionDrop }
     * 
     */
    public SectionDrop createSectionDrop() {
        return new SectionDrop();
    }

    /**
     * Create an instance of {@link JobWorked }
     * 
     */
    public JobWorked createJobWorked() {
        return new JobWorked();
    }

    /**
     * Create an instance of {@link GetUsageByServiceLocationID }
     * 
     */
    public GetUsageByServiceLocationID createGetUsageByServiceLocationID() {
        return new GetUsageByServiceLocationID();
    }

    /**
     * Create an instance of {@link ArrayOfMeterConnectivity }
     * 
     */
    public ArrayOfMeterConnectivity createArrayOfMeterConnectivity() {
        return new ArrayOfMeterConnectivity();
    }

    /**
     * Create an instance of {@link IntegerDuration }
     * 
     */
    public IntegerDuration createIntegerDuration() {
        return new IntegerDuration();
    }

    /**
     * Create an instance of {@link ArrayOfWorkTask1 }
     * 
     */
    public ArrayOfWorkTask1 createArrayOfWorkTask1() {
        return new ArrayOfWorkTask1();
    }

    /**
     * Create an instance of {@link Recloser }
     * 
     */
    public Recloser createRecloser() {
        return new Recloser();
    }

    /**
     * Create an instance of {@link TransformerBankChangedNotificationResponse }
     * 
     */
    public TransformerBankChangedNotificationResponse createTransformerBankChangedNotificationResponse() {
        return new TransformerBankChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link GetBillingData }
     * 
     */
    public GetBillingData createGetBillingData() {
        return new GetBillingData();
    }

    /**
     * Create an instance of {@link EndDeviceShipment }
     * 
     */
    public EndDeviceShipment createEndDeviceShipment() {
        return new EndDeviceShipment();
    }

    /**
     * Create an instance of {@link GetMetersByAccountNumberAndServiceTypeResponse }
     * 
     */
    public GetMetersByAccountNumberAndServiceTypeResponse createGetMetersByAccountNumberAndServiceTypeResponse() {
        return new GetMetersByAccountNumberAndServiceTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLoggedOutageDetectionEvent }
     * 
     */
    public ArrayOfLoggedOutageDetectionEvent createArrayOfLoggedOutageDetectionEvent() {
        return new ArrayOfLoggedOutageDetectionEvent();
    }

    /**
     * Create an instance of {@link ArrayOfDomainMember }
     * 
     */
    public ArrayOfDomainMember createArrayOfDomainMember() {
        return new ArrayOfDomainMember();
    }

    /**
     * Create an instance of {@link ArrayOfWinding }
     * 
     */
    public ArrayOfWinding createArrayOfWinding() {
        return new ArrayOfWinding();
    }

    /**
     * Create an instance of {@link GetCustomerByMeterID }
     * 
     */
    public GetCustomerByMeterID createGetCustomerByMeterID() {
        return new GetCustomerByMeterID();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link GetAccountByServiceLocationIDAndServiceType }
     * 
     */
    public GetAccountByServiceLocationIDAndServiceType createGetAccountByServiceLocationIDAndServiceType() {
        return new GetAccountByServiceLocationIDAndServiceType();
    }

    /**
     * Create an instance of {@link GetMeterByCustomerIDResponse }
     * 
     */
    public GetMeterByCustomerIDResponse createGetMeterByCustomerIDResponse() {
        return new GetMeterByCustomerIDResponse();
    }

    /**
     * Create an instance of {@link GetPoleByPoleNumberFromCBResponse }
     * 
     */
    public GetPoleByPoleNumberFromCBResponse createGetPoleByPoleNumberFromCBResponse() {
        return new GetPoleByPoleNumberFromCBResponse();
    }

    /**
     * Create an instance of {@link GetMeterGroupNamesResponse }
     * 
     */
    public GetMeterGroupNamesResponse createGetMeterGroupNamesResponse() {
        return new GetMeterGroupNamesResponse();
    }

    /**
     * Create an instance of {@link ServiceLocationNetworkChangedNotificationResponse }
     * 
     */
    public ServiceLocationNetworkChangedNotificationResponse createServiceLocationNetworkChangedNotificationResponse() {
        return new ServiceLocationNetworkChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link BreakerEntry }
     * 
     */
    public BreakerEntry createBreakerEntry() {
        return new BreakerEntry();
    }

    /**
     * Create an instance of {@link GetAccountsByCustomerIDResponse }
     * 
     */
    public GetAccountsByCustomerIDResponse createGetAccountsByCustomerIDResponse() {
        return new GetAccountsByCustomerIDResponse();
    }

    /**
     * Create an instance of {@link MultiPartIdentifier }
     * 
     */
    public MultiPartIdentifier createMultiPartIdentifier() {
        return new MultiPartIdentifier();
    }

    /**
     * Create an instance of {@link LineConstructionEntry }
     * 
     */
    public LineConstructionEntry createLineConstructionEntry() {
        return new LineConstructionEntry();
    }

    /**
     * Create an instance of {@link ArrayOfGasService }
     * 
     */
    public ArrayOfGasService createArrayOfGasService() {
        return new ArrayOfGasService();
    }

    /**
     * Create an instance of {@link ConfigurationGroup }
     * 
     */
    public ConfigurationGroup createConfigurationGroup() {
        return new ConfigurationGroup();
    }

    /**
     * Create an instance of {@link MsgLine }
     * 
     */
    public MsgLine createMsgLine() {
        return new MsgLine();
    }

    /**
     * Create an instance of {@link ArrayOfGenericPointFeature }
     * 
     */
    public ArrayOfGenericPointFeature createArrayOfGenericPointFeature() {
        return new ArrayOfGenericPointFeature();
    }

    /**
     * Create an instance of {@link Frequency }
     * 
     */
    public Frequency createFrequency() {
        return new Frequency();
    }

    /**
     * Create an instance of {@link FuseEntry }
     * 
     */
    public FuseEntry createFuseEntry() {
        return new FuseEntry();
    }

    /**
     * Create an instance of {@link GetServiceLocationByPhaseCode }
     * 
     */
    public GetServiceLocationByPhaseCode createGetServiceLocationByPhaseCode() {
        return new GetServiceLocationByPhaseCode();
    }

    /**
     * Create an instance of {@link GenericPolygonFeature }
     * 
     */
    public GenericPolygonFeature createGenericPolygonFeature() {
        return new GenericPolygonFeature();
    }

    /**
     * Create an instance of {@link ArrayOfServiceOrder1 }
     * 
     */
    public ArrayOfServiceOrder1 createArrayOfServiceOrder1() {
        return new ArrayOfServiceOrder1();
    }

    /**
     * Create an instance of {@link PingURLResponse }
     * 
     */
    public PingURLResponse createPingURLResponse() {
        return new PingURLResponse();
    }

    /**
     * Create an instance of {@link MeterBaseExchange }
     * 
     */
    public MeterBaseExchange createMeterBaseExchange() {
        return new MeterBaseExchange();
    }

    /**
     * Create an instance of {@link PropaneNameplate }
     * 
     */
    public PropaneNameplate createPropaneNameplate() {
        return new PropaneNameplate();
    }

    /**
     * Create an instance of {@link ArrayOfControlItem }
     * 
     */
    public ArrayOfControlItem createArrayOfControlItem() {
        return new ArrayOfControlItem();
    }

    /**
     * Create an instance of {@link GetAllGasMetersResponse }
     * 
     */
    public GetAllGasMetersResponse createGetAllGasMetersResponse() {
        return new GetAllGasMetersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProfileObject }
     * 
     */
    public ArrayOfProfileObject createArrayOfProfileObject() {
        return new ArrayOfProfileObject();
    }

    /**
     * Create an instance of {@link ArrayOfEquipmentStatus }
     * 
     */
    public ArrayOfEquipmentStatus createArrayOfEquipmentStatus() {
        return new ArrayOfEquipmentStatus();
    }

    /**
     * Create an instance of {@link MeasurementDevice }
     * 
     */
    public MeasurementDevice createMeasurementDevice() {
        return new MeasurementDevice();
    }

    /**
     * Create an instance of {@link ArrayOfReceivedGasMeter }
     * 
     */
    public ArrayOfReceivedGasMeter createArrayOfReceivedGasMeter() {
        return new ArrayOfReceivedGasMeter();
    }

    /**
     * Create an instance of {@link ArrayOfSource }
     * 
     */
    public ArrayOfSource createArrayOfSource() {
        return new ArrayOfSource();
    }

    /**
     * Create an instance of {@link GetPoleByPoleNumberFromCB }
     * 
     */
    public GetPoleByPoleNumberFromCB createGetPoleByPoleNumberFromCB() {
        return new GetPoleByPoleNumberFromCB();
    }

    /**
     * Create an instance of {@link Speed }
     * 
     */
    public Speed createSpeed() {
        return new Speed();
    }

    /**
     * Create an instance of {@link ExtendPaymentResponse }
     * 
     */
    public ExtendPaymentResponse createExtendPaymentResponse() {
        return new ExtendPaymentResponse();
    }

    /**
     * Create an instance of {@link ReadingChangedNotificationResponse }
     * 
     */
    public ReadingChangedNotificationResponse createReadingChangedNotificationResponse() {
        return new ReadingChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link ModifyCBDataForUsage }
     * 
     */
    public ModifyCBDataForUsage createModifyCBDataForUsage() {
        return new ModifyCBDataForUsage();
    }

    /**
     * Create an instance of {@link CDStatesNotification }
     * 
     */
    public CDStatesNotification createCDStatesNotification() {
        return new CDStatesNotification();
    }

    /**
     * Create an instance of {@link ArrayOfScheduleRequest }
     * 
     */
    public ArrayOfScheduleRequest createArrayOfScheduleRequest() {
        return new ArrayOfScheduleRequest();
    }

    /**
     * Create an instance of {@link GetAllConnectDisconnectEventsByReasonCode }
     * 
     */
    public GetAllConnectDisconnectEventsByReasonCode createGetAllConnectDisconnectEventsByReasonCode() {
        return new GetAllConnectDisconnectEventsByReasonCode();
    }

    /**
     * Create an instance of {@link MeterExchangeNotificationResponse }
     * 
     */
    public MeterExchangeNotificationResponse createMeterExchangeNotificationResponse() {
        return new MeterExchangeNotificationResponse();
    }

    /**
     * Create an instance of {@link OutageLocation }
     * 
     */
    public OutageLocation createOutageLocation() {
        return new OutageLocation();
    }

    /**
     * Create an instance of {@link GetIHDGroupMembers }
     * 
     */
    public GetIHDGroupMembers createGetIHDGroupMembers() {
        return new GetIHDGroupMembers();
    }

    /**
     * Create an instance of {@link HistoryLog }
     * 
     */
    public HistoryLog createHistoryLog() {
        return new HistoryLog();
    }

    /**
     * Create an instance of {@link ArrayOfPremiseService }
     * 
     */
    public ArrayOfPremiseService createArrayOfPremiseService() {
        return new ArrayOfPremiseService();
    }

    /**
     * Create an instance of {@link GPS }
     * 
     */
    public GPS createGPS() {
        return new GPS();
    }

    /**
     * Create an instance of {@link BreakerImpedances }
     * 
     */
    public BreakerImpedances createBreakerImpedances() {
        return new BreakerImpedances();
    }

    /**
     * Create an instance of {@link ArrayOfClearance }
     * 
     */
    public ArrayOfClearance createArrayOfClearance() {
        return new ArrayOfClearance();
    }

    /**
     * Create an instance of {@link OutageDetectionDevice }
     * 
     */
    public OutageDetectionDevice createOutageDetectionDevice() {
        return new OutageDetectionDevice();
    }

    /**
     * Create an instance of {@link ArrayOfString6 }
     * 
     */
    public ArrayOfString6 createArrayOfString6() {
        return new ArrayOfString6();
    }

    /**
     * Create an instance of {@link UgTransmissionLine }
     * 
     */
    public UgTransmissionLine createUgTransmissionLine() {
        return new UgTransmissionLine();
    }

    /**
     * Create an instance of {@link StatusOfService }
     * 
     */
    public StatusOfService createStatusOfService() {
        return new StatusOfService();
    }

    /**
     * Create an instance of {@link ElectricMeters }
     * 
     */
    public ElectricMeters createElectricMeters() {
        return new ElectricMeters();
    }

    /**
     * Create an instance of {@link ZigBeeCancelLoadControlEvent }
     * 
     */
    public ZigBeeCancelLoadControlEvent createZigBeeCancelLoadControlEvent() {
        return new ZigBeeCancelLoadControlEvent();
    }

    /**
     * Create an instance of {@link GetUsageByAccountNumberResponse }
     * 
     */
    public GetUsageByAccountNumberResponse createGetUsageByAccountNumberResponse() {
        return new GetUsageByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link CustomerCall }
     * 
     */
    public CustomerCall createCustomerCall() {
        return new CustomerCall();
    }

    /**
     * Create an instance of {@link SwitchingSchedule }
     * 
     */
    public SwitchingSchedule createSwitchingSchedule() {
        return new SwitchingSchedule();
    }

    /**
     * Create an instance of {@link CDStateNotificationResponse }
     * 
     */
    public CDStateNotificationResponse createCDStateNotificationResponse() {
        return new CDStateNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link ReadingSchedule }
     * 
     */
    public ReadingSchedule createReadingSchedule() {
        return new ReadingSchedule();
    }

    /**
     * Create an instance of {@link GetModifiedMeters }
     * 
     */
    public GetModifiedMeters createGetModifiedMeters() {
        return new GetModifiedMeters();
    }

    /**
     * Create an instance of {@link GetServiceLocationByGridLocationResponse }
     * 
     */
    public GetServiceLocationByGridLocationResponse createGetServiceLocationByGridLocationResponse() {
        return new GetServiceLocationByGridLocationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCDDeviceExchange }
     * 
     */
    public ArrayOfCDDeviceExchange createArrayOfCDDeviceExchange() {
        return new ArrayOfCDDeviceExchange();
    }

    /**
     * Create an instance of {@link ArrayOfTransformer }
     * 
     */
    public ArrayOfTransformer createArrayOfTransformer() {
        return new ArrayOfTransformer();
    }

    /**
     * Create an instance of {@link ArrayOfExtensionsItem }
     * 
     */
    public ArrayOfExtensionsItem createArrayOfExtensionsItem() {
        return new ArrayOfExtensionsItem();
    }

    /**
     * Create an instance of {@link PpmTransaction }
     * 
     */
    public PpmTransaction createPpmTransaction() {
        return new PpmTransaction();
    }

    /**
     * Create an instance of {@link OutageReportingCode }
     * 
     */
    public OutageReportingCode createOutageReportingCode() {
        return new OutageReportingCode();
    }

    /**
     * Create an instance of {@link ArrayOfPremise }
     * 
     */
    public ArrayOfPremise createArrayOfPremise() {
        return new ArrayOfPremise();
    }

    /**
     * Create an instance of {@link PingURL }
     * 
     */
    public PingURL createPingURL() {
        return new PingURL();
    }

    /**
     * Create an instance of {@link GetAllTransformerBanksFromCB }
     * 
     */
    public GetAllTransformerBanksFromCB createGetAllTransformerBanksFromCB() {
        return new GetAllTransformerBanksFromCB();
    }

    /**
     * Create an instance of {@link LineEnvironmentalAttributes }
     * 
     */
    public LineEnvironmentalAttributes createLineEnvironmentalAttributes() {
        return new LineEnvironmentalAttributes();
    }

    /**
     * Create an instance of {@link DemandResponseEvent }
     * 
     */
    public DemandResponseEvent createDemandResponseEvent() {
        return new DemandResponseEvent();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link WaterMeterExchange }
     * 
     */
    public WaterMeterExchange createWaterMeterExchange() {
        return new WaterMeterExchange();
    }

    /**
     * Create an instance of {@link GasNameplate }
     * 
     */
    public GasNameplate createGasNameplate() {
        return new GasNameplate();
    }

    /**
     * Create an instance of {@link ScheduleRequest }
     * 
     */
    public ScheduleRequest createScheduleRequest() {
        return new ScheduleRequest();
    }

    /**
     * Create an instance of {@link GetUsageByMonthResponse }
     * 
     */
    public GetUsageByMonthResponse createGetUsageByMonthResponse() {
        return new GetUsageByMonthResponse();
    }

    /**
     * Create an instance of {@link GroupAssignment }
     * 
     */
    public GroupAssignment createGroupAssignment() {
        return new GroupAssignment();
    }

    /**
     * Create an instance of {@link GetMethods }
     * 
     */
    public GetMethods createGetMethods() {
        return new GetMethods();
    }

    /**
     * Create an instance of {@link CashPayment }
     * 
     */
    public CashPayment createCashPayment() {
        return new CashPayment();
    }

    /**
     * Create an instance of {@link GetAllCustomersByServiceTypeResponse }
     * 
     */
    public GetAllCustomersByServiceTypeResponse createGetAllCustomersByServiceTypeResponse() {
        return new GetAllCustomersByServiceTypeResponse();
    }

    /**
     * Create an instance of {@link GetServiceLocationByAccountNumberResponse }
     * 
     */
    public GetServiceLocationByAccountNumberResponse createGetServiceLocationByAccountNumberResponse() {
        return new GetServiceLocationByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link ReturnGeneratedNumberResponse }
     * 
     */
    public ReturnGeneratedNumberResponse createReturnGeneratedNumberResponse() {
        return new ReturnGeneratedNumberResponse();
    }

    /**
     * Create an instance of {@link InductionMachineEntry }
     * 
     */
    public InductionMachineEntry createInductionMachineEntry() {
        return new InductionMachineEntry();
    }

    /**
     * Create an instance of {@link IntervalDataNotification }
     * 
     */
    public IntervalDataNotification createIntervalDataNotification() {
        return new IntervalDataNotification();
    }

    /**
     * Create an instance of {@link EndReading }
     * 
     */
    public EndReading createEndReading() {
        return new EndReading();
    }

    /**
     * Create an instance of {@link GetProject }
     * 
     */
    public GetProject createGetProject() {
        return new GetProject();
    }

    /**
     * Create an instance of {@link GetModifiedPolesFromCB }
     * 
     */
    public GetModifiedPolesFromCB createGetModifiedPolesFromCB() {
        return new GetModifiedPolesFromCB();
    }

    /**
     * Create an instance of {@link ZigBeePublishPrice }
     * 
     */
    public ZigBeePublishPrice createZigBeePublishPrice() {
        return new ZigBeePublishPrice();
    }

    /**
     * Create an instance of {@link OtherLocationFields }
     * 
     */
    public OtherLocationFields createOtherLocationFields() {
        return new OtherLocationFields();
    }

    /**
     * Create an instance of {@link ArrayOfMeterTest }
     * 
     */
    public ArrayOfMeterTest createArrayOfMeterTest() {
        return new ArrayOfMeterTest();
    }

    /**
     * Create an instance of {@link IntervalChannel }
     * 
     */
    public IntervalChannel createIntervalChannel() {
        return new IntervalChannel();
    }

    /**
     * Create an instance of {@link ModifyCBDataForSecurityLightResponse }
     * 
     */
    public ModifyCBDataForSecurityLightResponse createModifyCBDataForSecurityLightResponse() {
        return new ModifyCBDataForSecurityLightResponse();
    }

    /**
     * Create an instance of {@link GetServiceLocationIDByAccountNumberResponse }
     * 
     */
    public GetServiceLocationIDByAccountNumberResponse createGetServiceLocationIDByAccountNumberResponse() {
        return new GetServiceLocationIDByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link SwitchingDevice }
     * 
     */
    public SwitchingDevice createSwitchingDevice() {
        return new SwitchingDevice();
    }

    /**
     * Create an instance of {@link GetBillingDetail }
     * 
     */
    public GetBillingDetail createGetBillingDetail() {
        return new GetBillingDetail();
    }

    /**
     * Create an instance of {@link GetServiceLocationIDByAccountNumber }
     * 
     */
    public GetServiceLocationIDByAccountNumber createGetServiceLocationIDByAccountNumber() {
        return new GetServiceLocationIDByAccountNumber();
    }

    /**
     * Create an instance of {@link ArrayOfLaborComponent }
     * 
     */
    public ArrayOfLaborComponent createArrayOfLaborComponent() {
        return new ArrayOfLaborComponent();
    }

    /**
     * Create an instance of {@link ArrayOfUsageInstance }
     * 
     */
    public ArrayOfUsageInstance createArrayOfUsageInstance() {
        return new ArrayOfUsageInstance();
    }

    /**
     * Create an instance of {@link ArrayOfUsageItem }
     * 
     */
    public ArrayOfUsageItem createArrayOfUsageItem() {
        return new ArrayOfUsageItem();
    }

    /**
     * Create an instance of {@link Skill }
     * 
     */
    public Skill createSkill() {
        return new Skill();
    }

    /**
     * Create an instance of {@link GMLPolygon }
     * 
     */
    public GMLPolygon createGMLPolygon() {
        return new GMLPolygon();
    }

    /**
     * Create an instance of {@link Susceptance }
     * 
     */
    public Susceptance createSusceptance() {
        return new Susceptance();
    }

    /**
     * Create an instance of {@link TimePoint }
     * 
     */
    public TimePoint createTimePoint() {
        return new TimePoint();
    }

    /**
     * Create an instance of {@link Cut }
     * 
     */
    public Cut createCut() {
        return new Cut();
    }

    /**
     * Create an instance of {@link ArrayOfAnchor }
     * 
     */
    public ArrayOfAnchor createArrayOfAnchor() {
        return new ArrayOfAnchor();
    }

    /**
     * Create an instance of {@link ArrayOfWaterMeter }
     * 
     */
    public ArrayOfWaterMeter createArrayOfWaterMeter() {
        return new ArrayOfWaterMeter();
    }

    /**
     * Create an instance of {@link DomainMembersChangedNotificationResponse }
     * 
     */
    public DomainMembersChangedNotificationResponse createDomainMembersChangedNotificationResponse() {
        return new DomainMembersChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link ControlItem }
     * 
     */
    public ControlItem createControlItem() {
        return new ControlItem();
    }

    /**
     * Create an instance of {@link OutageReasonContainer }
     * 
     */
    public OutageReasonContainer createOutageReasonContainer() {
        return new OutageReasonContainer();
    }

    /**
     * Create an instance of {@link GetServiceLocationByShutOffDateResponse }
     * 
     */
    public GetServiceLocationByShutOffDateResponse createGetServiceLocationByShutOffDateResponse() {
        return new GetServiceLocationByShutOffDateResponse();
    }

    /**
     * Create an instance of {@link GetModifiedMetersResponse }
     * 
     */
    public GetModifiedMetersResponse createGetModifiedMetersResponse() {
        return new GetModifiedMetersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAssessment }
     * 
     */
    public ArrayOfAssessment createArrayOfAssessment() {
        return new ArrayOfAssessment();
    }

    /**
     * Create an instance of {@link ArrayOfGMLLine }
     * 
     */
    public ArrayOfGMLLine createArrayOfGMLLine() {
        return new ArrayOfGMLLine();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link HistoryLogChangedNotificationResponse }
     * 
     */
    public HistoryLogChangedNotificationResponse createHistoryLogChangedNotificationResponse() {
        return new HistoryLogChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link CIMLoadCharacteristics }
     * 
     */
    public CIMLoadCharacteristics createCIMLoadCharacteristics() {
        return new CIMLoadCharacteristics();
    }

    /**
     * Create an instance of {@link ArrayOfSecurityLight }
     * 
     */
    public ArrayOfSecurityLight createArrayOfSecurityLight() {
        return new ArrayOfSecurityLight();
    }

    /**
     * Create an instance of {@link BankRatings }
     * 
     */
    public BankRatings createBankRatings() {
        return new BankRatings();
    }

    /**
     * Create an instance of {@link WaterMeter }
     * 
     */
    public WaterMeter createWaterMeter() {
        return new WaterMeter();
    }

    /**
     * Create an instance of {@link ArrayOfModule }
     * 
     */
    public ArrayOfModule createArrayOfModule() {
        return new ArrayOfModule();
    }

    /**
     * Create an instance of {@link GetServiceLocationByLoadGroup }
     * 
     */
    public GetServiceLocationByLoadGroup createGetServiceLocationByLoadGroup() {
        return new GetServiceLocationByLoadGroup();
    }

    /**
     * Create an instance of {@link GetMeterGroupMembers }
     * 
     */
    public GetMeterGroupMembers createGetMeterGroupMembers() {
        return new GetMeterGroupMembers();
    }

    /**
     * Create an instance of {@link ReadingStatusCode }
     * 
     */
    public ReadingStatusCode createReadingStatusCode() {
        return new ReadingStatusCode();
    }

    /**
     * Create an instance of {@link FormattedBlockNotification }
     * 
     */
    public FormattedBlockNotification createFormattedBlockNotification() {
        return new FormattedBlockNotification();
    }

    /**
     * Create an instance of {@link TapeShieldCableEntry }
     * 
     */
    public TapeShieldCableEntry createTapeShieldCableEntry() {
        return new TapeShieldCableEntry();
    }

    /**
     * Create an instance of {@link ConnectDisconnectList }
     * 
     */
    public ConnectDisconnectList createConnectDisconnectList() {
        return new ConnectDisconnectList();
    }

    /**
     * Create an instance of {@link ArrayOfChannel }
     * 
     */
    public ArrayOfChannel createArrayOfChannel() {
        return new ArrayOfChannel();
    }

    /**
     * Create an instance of {@link ArrayOfObjectRef2 }
     * 
     */
    public ArrayOfObjectRef2 createArrayOfObjectRef2() {
        return new ArrayOfObjectRef2();
    }

    /**
     * Create an instance of {@link LMDeviceInstalledNotification }
     * 
     */
    public LMDeviceInstalledNotification createLMDeviceInstalledNotification() {
        return new LMDeviceInstalledNotification();
    }

    /**
     * Create an instance of {@link GetServiceLocationByShutOffDate }
     * 
     */
    public GetServiceLocationByShutOffDate createGetServiceLocationByShutOffDate() {
        return new GetServiceLocationByShutOffDate();
    }

    /**
     * Create an instance of {@link ArrayOfCDDevice }
     * 
     */
    public ArrayOfCDDevice createArrayOfCDDevice() {
        return new ArrayOfCDDevice();
    }

    /**
     * Create an instance of {@link Extensions }
     * 
     */
    public Extensions createExtensions() {
        return new Extensions();
    }

    /**
     * Create an instance of {@link ArrayOfElectricMeterExchange }
     * 
     */
    public ArrayOfElectricMeterExchange createArrayOfElectricMeterExchange() {
        return new ArrayOfElectricMeterExchange();
    }

    /**
     * Create an instance of {@link CreditCardPayment }
     * 
     */
    public CreditCardPayment createCreditCardPayment() {
        return new CreditCardPayment();
    }

    /**
     * Create an instance of {@link WorkSchedule }
     * 
     */
    public WorkSchedule createWorkSchedule() {
        return new WorkSchedule();
    }

    /**
     * Create an instance of {@link GetGasMetersByAccountNumberResponse }
     * 
     */
    public GetGasMetersByAccountNumberResponse createGetGasMetersByAccountNumberResponse() {
        return new GetGasMetersByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link BilledUsage }
     * 
     */
    public BilledUsage createBilledUsage() {
        return new BilledUsage();
    }

    /**
     * Create an instance of {@link NodeIdentifier }
     * 
     */
    public NodeIdentifier createNodeIdentifier() {
        return new NodeIdentifier();
    }

    /**
     * Create an instance of {@link TestedElectricMeter }
     * 
     */
    public TestedElectricMeter createTestedElectricMeter() {
        return new TestedElectricMeter();
    }

    /**
     * Create an instance of {@link Inspection }
     * 
     */
    public Inspection createInspection() {
        return new Inspection();
    }

    /**
     * Create an instance of {@link RegisterForServiceResponse }
     * 
     */
    public RegisterForServiceResponse createRegisterForServiceResponse() {
        return new RegisterForServiceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSecurityLight1 }
     * 
     */
    public ArrayOfSecurityLight1 createArrayOfSecurityLight1() {
        return new ArrayOfSecurityLight1();
    }

    /**
     * Create an instance of {@link ArrayOfAffectedMeter }
     * 
     */
    public ArrayOfAffectedMeter createArrayOfAffectedMeter() {
        return new ArrayOfAffectedMeter();
    }

    /**
     * Create an instance of {@link GetUsageByMeterIDResponse }
     * 
     */
    public GetUsageByMeterIDResponse createGetUsageByMeterIDResponse() {
        return new GetUsageByMeterIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOutageReasonItem }
     * 
     */
    public ArrayOfOutageReasonItem createArrayOfOutageReasonItem() {
        return new ArrayOfOutageReasonItem();
    }

    /**
     * Create an instance of {@link ArrayOfString13 }
     * 
     */
    public ArrayOfString13 createArrayOfString13() {
        return new ArrayOfString13();
    }

    /**
     * Create an instance of {@link ArrayOfWaterService }
     * 
     */
    public ArrayOfWaterService createArrayOfWaterService() {
        return new ArrayOfWaterService();
    }

    /**
     * Create an instance of {@link ArrayOfJobWorked }
     * 
     */
    public ArrayOfJobWorked createArrayOfJobWorked() {
        return new ArrayOfJobWorked();
    }

    /**
     * Create an instance of {@link ArrayOfUsageOtherPeriod }
     * 
     */
    public ArrayOfUsageOtherPeriod createArrayOfUsageOtherPeriod() {
        return new ArrayOfUsageOtherPeriod();
    }

    /**
     * Create an instance of {@link AdjustmentItem }
     * 
     */
    public AdjustmentItem createAdjustmentItem() {
        return new AdjustmentItem();
    }

    /**
     * Create an instance of {@link ArrayOfConfiguredReadingType }
     * 
     */
    public ArrayOfConfiguredReadingType createArrayOfConfiguredReadingType() {
        return new ArrayOfConfiguredReadingType();
    }

    /**
     * Create an instance of {@link GetBillingAccountLoadDataByMonthResponse }
     * 
     */
    public GetBillingAccountLoadDataByMonthResponse createGetBillingAccountLoadDataByMonthResponse() {
        return new GetBillingAccountLoadDataByMonthResponse();
    }

    /**
     * Create an instance of {@link SubstationLoadControlStatus }
     * 
     */
    public SubstationLoadControlStatus createSubstationLoadControlStatus() {
        return new SubstationLoadControlStatus();
    }

    /**
     * Create an instance of {@link OvercurrentDevice }
     * 
     */
    public OvercurrentDevice createOvercurrentDevice() {
        return new OvercurrentDevice();
    }

    /**
     * Create an instance of {@link PrimaryCabinet }
     * 
     */
    public PrimaryCabinet createPrimaryCabinet() {
        return new PrimaryCabinet();
    }

    /**
     * Create an instance of {@link ArrayOfCrewActionEvent }
     * 
     */
    public ArrayOfCrewActionEvent createArrayOfCrewActionEvent() {
        return new ArrayOfCrewActionEvent();
    }

    /**
     * Create an instance of {@link SecondaryConductorEntry }
     * 
     */
    public SecondaryConductorEntry createSecondaryConductorEntry() {
        return new SecondaryConductorEntry();
    }

    /**
     * Create an instance of {@link ConductorItem }
     * 
     */
    public ConductorItem createConductorItem() {
        return new ConductorItem();
    }

    /**
     * Create an instance of {@link GetCustomerByCustomerID }
     * 
     */
    public GetCustomerByCustomerID createGetCustomerByCustomerID() {
        return new GetCustomerByCustomerID();
    }

    /**
     * Create an instance of {@link ReceivedElectricMeter }
     * 
     */
    public ReceivedElectricMeter createReceivedElectricMeter() {
        return new ReceivedElectricMeter();
    }

    /**
     * Create an instance of {@link GetIHDGroupNamesByInHomeDisplayIDResponse }
     * 
     */
    public GetIHDGroupNamesByInHomeDisplayIDResponse createGetIHDGroupNamesByInHomeDisplayIDResponse() {
        return new GetIHDGroupNamesByInHomeDisplayIDResponse();
    }

    /**
     * Create an instance of {@link GetServiceOrdersByServiceLocationResponse }
     * 
     */
    public GetServiceOrdersByServiceLocationResponse createGetServiceOrdersByServiceLocationResponse() {
        return new GetServiceOrdersByServiceLocationResponse();
    }

    /**
     * Create an instance of {@link GetBillingDetailResponse }
     * 
     */
    public GetBillingDetailResponse createGetBillingDetailResponse() {
        return new GetBillingDetailResponse();
    }

    /**
     * Create an instance of {@link MeterConnectivityNotification }
     * 
     */
    public MeterConnectivityNotification createMeterConnectivityNotification() {
        return new MeterConnectivityNotification();
    }

    /**
     * Create an instance of {@link ArrayOfInHomeDisplayMessage }
     * 
     */
    public ArrayOfInHomeDisplayMessage createArrayOfInHomeDisplayMessage() {
        return new ArrayOfInHomeDisplayMessage();
    }

    /**
     * Create an instance of {@link PickListItem }
     * 
     */
    public PickListItem createPickListItem() {
        return new PickListItem();
    }

    /**
     * Create an instance of {@link GetMeterByServiceLocationID }
     * 
     */
    public GetMeterByServiceLocationID createGetMeterByServiceLocationID() {
        return new GetMeterByServiceLocationID();
    }

    /**
     * Create an instance of {@link RegisterForService }
     * 
     */
    public RegisterForService createRegisterForService() {
        return new RegisterForService();
    }

    /**
     * Create an instance of {@link MeterBaseInstalledNotification }
     * 
     */
    public MeterBaseInstalledNotification createMeterBaseInstalledNotification() {
        return new MeterBaseInstalledNotification();
    }

    /**
     * Create an instance of {@link GPSLocation }
     * 
     */
    public GPSLocation createGPSLocation() {
        return new GPSLocation();
    }

    /**
     * Create an instance of {@link ArrayOfMeterBase }
     * 
     */
    public ArrayOfMeterBase createArrayOfMeterBase() {
        return new ArrayOfMeterBase();
    }

    /**
     * Create an instance of {@link GetAllOtherMetersResponse }
     * 
     */
    public GetAllOtherMetersResponse createGetAllOtherMetersResponse() {
        return new GetAllOtherMetersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWaterMeterExchange }
     * 
     */
    public ArrayOfWaterMeterExchange createArrayOfWaterMeterExchange() {
        return new ArrayOfWaterMeterExchange();
    }

    /**
     * Create an instance of {@link GetAllWaterMeters }
     * 
     */
    public GetAllWaterMeters createGetAllWaterMeters() {
        return new GetAllWaterMeters();
    }

    /**
     * Create an instance of {@link CircuitElement }
     * 
     */
    public CircuitElement createCircuitElement() {
        return new CircuitElement();
    }

    /**
     * Create an instance of {@link ShortCircuitAnalysisResult }
     * 
     */
    public ShortCircuitAnalysisResult createShortCircuitAnalysisResult() {
        return new ShortCircuitAnalysisResult();
    }

    /**
     * Create an instance of {@link ArrayOfObjectRef1 }
     * 
     */
    public ArrayOfObjectRef1 createArrayOfObjectRef1() {
        return new ArrayOfObjectRef1();
    }

    /**
     * Create an instance of {@link PayableItem }
     * 
     */
    public PayableItem createPayableItem() {
        return new PayableItem();
    }

    /**
     * Create an instance of {@link WaterMeters }
     * 
     */
    public WaterMeters createWaterMeters() {
        return new WaterMeters();
    }

    /**
     * Create an instance of {@link OutageDurationEvent }
     * 
     */
    public OutageDurationEvent createOutageDurationEvent() {
        return new OutageDurationEvent();
    }

    /**
     * Create an instance of {@link ExtensionsList }
     * 
     */
    public ExtensionsList createExtensionsList() {
        return new ExtensionsList();
    }

    /**
     * Create an instance of {@link ElectricService }
     * 
     */
    public ElectricService createElectricService() {
        return new ElectricService();
    }

    /**
     * Create an instance of {@link LocationFields }
     * 
     */
    public LocationFields createLocationFields() {
        return new LocationFields();
    }

    /**
     * Create an instance of {@link GMLLocation }
     * 
     */
    public GMLLocation createGMLLocation() {
        return new GMLLocation();
    }

    /**
     * Create an instance of {@link Circuit }
     * 
     */
    public Circuit createCircuit() {
        return new Circuit();
    }

    /**
     * Create an instance of {@link GetElectricMetersByAccountNumber }
     * 
     */
    public GetElectricMetersByAccountNumber createGetElectricMetersByAccountNumber() {
        return new GetElectricMetersByAccountNumber();
    }

    /**
     * Create an instance of {@link GetServiceLocationByServiceTypeResponse }
     * 
     */
    public GetServiceLocationByServiceTypeResponse createGetServiceLocationByServiceTypeResponse() {
        return new GetServiceLocationByServiceTypeResponse();
    }

    /**
     * Create an instance of {@link ModifyCBDataForCustomer }
     * 
     */
    public ModifyCBDataForCustomer createModifyCBDataForCustomer() {
        return new ModifyCBDataForCustomer();
    }

    /**
     * Create an instance of {@link SyntaxItem }
     * 
     */
    public SyntaxItem createSyntaxItem() {
        return new SyntaxItem();
    }

    /**
     * Create an instance of {@link ObservedValue }
     * 
     */
    public ObservedValue createObservedValue() {
        return new ObservedValue();
    }

    /**
     * Create an instance of {@link ChannelBlock }
     * 
     */
    public ChannelBlock createChannelBlock() {
        return new ChannelBlock();
    }

    /**
     * Create an instance of {@link GetAllMetersByAccountNumber }
     * 
     */
    public GetAllMetersByAccountNumber createGetAllMetersByAccountNumber() {
        return new GetAllMetersByAccountNumber();
    }

    /**
     * Create an instance of {@link ConnectDisconnectEvent }
     * 
     */
    public ConnectDisconnectEvent createConnectDisconnectEvent() {
        return new ConnectDisconnectEvent();
    }

    /**
     * Create an instance of {@link InHomeDisplayBillingMessage }
     * 
     */
    public InHomeDisplayBillingMessage createInHomeDisplayBillingMessage() {
        return new InHomeDisplayBillingMessage();
    }

    /**
     * Create an instance of {@link Reactance }
     * 
     */
    public Reactance createReactance() {
        return new Reactance();
    }

    /**
     * Create an instance of {@link InHomeDisplayExchange }
     * 
     */
    public InHomeDisplayExchange createInHomeDisplayExchange() {
        return new InHomeDisplayExchange();
    }

    /**
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link InductionMachineImpedances }
     * 
     */
    public InductionMachineImpedances createInductionMachineImpedances() {
        return new InductionMachineImpedances();
    }

    /**
     * Create an instance of {@link ArrayOfString3 }
     * 
     */
    public ArrayOfString3 createArrayOfString3() {
        return new ArrayOfString3();
    }

    /**
     * Create an instance of {@link UsageOtherPeriod }
     * 
     */
    public UsageOtherPeriod createUsageOtherPeriod() {
        return new UsageOtherPeriod();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link ArrayOfInHomeDisplayExchange }
     * 
     */
    public ArrayOfInHomeDisplayExchange createArrayOfInHomeDisplayExchange() {
        return new ArrayOfInHomeDisplayExchange();
    }

    /**
     * Create an instance of {@link Design }
     * 
     */
    public Design createDesign() {
        return new Design();
    }

    /**
     * Create an instance of {@link OutageReasonItem }
     * 
     */
    public OutageReasonItem createOutageReasonItem() {
        return new OutageReasonItem();
    }

    /**
     * Create an instance of {@link CrewActionEvent }
     * 
     */
    public CrewActionEvent createCrewActionEvent() {
        return new CrewActionEvent();
    }

    /**
     * Create an instance of {@link MeterGroup }
     * 
     */
    public MeterGroup createMeterGroup() {
        return new MeterGroup();
    }

    /**
     * Create an instance of {@link GetAllStreetLights }
     * 
     */
    public GetAllStreetLights createGetAllStreetLights() {
        return new GetAllStreetLights();
    }

    /**
     * Create an instance of {@link PhaseItem }
     * 
     */
    public PhaseItem createPhaseItem() {
        return new PhaseItem();
    }

    /**
     * Create an instance of {@link WorkRequest }
     * 
     */
    public WorkRequest createWorkRequest() {
        return new WorkRequest();
    }

    /**
     * Create an instance of {@link AffectedMeter }
     * 
     */
    public AffectedMeter createAffectedMeter() {
        return new AffectedMeter();
    }

    /**
     * Create an instance of {@link GetModifiedServiceLocationsResponse }
     * 
     */
    public GetModifiedServiceLocationsResponse createGetModifiedServiceLocationsResponse() {
        return new GetModifiedServiceLocationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString17 }
     * 
     */
    public ArrayOfString17 createArrayOfString17() {
        return new ArrayOfString17();
    }

    /**
     * Create an instance of {@link TransponderIDRange }
     * 
     */
    public TransponderIDRange createTransponderIDRange() {
        return new TransponderIDRange();
    }

    /**
     * Create an instance of {@link ArrayOfBackSpan }
     * 
     */
    public ArrayOfBackSpan createArrayOfBackSpan() {
        return new ArrayOfBackSpan();
    }

    /**
     * Create an instance of {@link ArrayOfCrew }
     * 
     */
    public ArrayOfCrew createArrayOfCrew() {
        return new ArrayOfCrew();
    }

    /**
     * Create an instance of {@link ArrayOfString10 }
     * 
     */
    public ArrayOfString10 createArrayOfString10() {
        return new ArrayOfString10();
    }

    /**
     * Create an instance of {@link GetMeterHistoryByMeterID }
     * 
     */
    public GetMeterHistoryByMeterID createGetMeterHistoryByMeterID() {
        return new GetMeterHistoryByMeterID();
    }

    /**
     * Create an instance of {@link PeriodicSchedule }
     * 
     */
    public PeriodicSchedule createPeriodicSchedule() {
        return new PeriodicSchedule();
    }

    /**
     * Create an instance of {@link ArrayOfMeterReading }
     * 
     */
    public ArrayOfMeterReading createArrayOfMeterReading() {
        return new ArrayOfMeterReading();
    }

    /**
     * Create an instance of {@link ArrayOfInHomeDisplayBillingMessage }
     * 
     */
    public ArrayOfInHomeDisplayBillingMessage createArrayOfInHomeDisplayBillingMessage() {
        return new ArrayOfInHomeDisplayBillingMessage();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link EquivalentSource }
     * 
     */
    public EquivalentSource createEquivalentSource() {
        return new EquivalentSource();
    }

    /**
     * Create an instance of {@link GetServiceLocationByServiceStatusResponse }
     * 
     */
    public GetServiceLocationByServiceStatusResponse createGetServiceLocationByServiceStatusResponse() {
        return new GetServiceLocationByServiceStatusResponse();
    }

    /**
     * Create an instance of {@link SectionalizerImpedances }
     * 
     */
    public SectionalizerImpedances createSectionalizerImpedances() {
        return new SectionalizerImpedances();
    }

    /**
     * Create an instance of {@link LMDeviceExchange }
     * 
     */
    public LMDeviceExchange createLMDeviceExchange() {
        return new LMDeviceExchange();
    }

    /**
     * Create an instance of {@link MeterID }
     * 
     */
    public MeterID createMeterID() {
        return new MeterID();
    }

    /**
     * Create an instance of {@link ArrayOfMaintenanceOrder }
     * 
     */
    public ArrayOfMaintenanceOrder createArrayOfMaintenanceOrder() {
        return new ArrayOfMaintenanceOrder();
    }

    /**
     * Create an instance of {@link TransformerBankChangedNotification }
     * 
     */
    public TransformerBankChangedNotification createTransformerBankChangedNotification() {
        return new TransformerBankChangedNotification();
    }

    /**
     * Create an instance of {@link GetServiceLocationIDByHomePhoneResponse }
     * 
     */
    public GetServiceLocationIDByHomePhoneResponse createGetServiceLocationIDByHomePhoneResponse() {
        return new GetServiceLocationIDByHomePhoneResponse();
    }

    /**
     * Create an instance of {@link ModifyCBDataForUsageResponse }
     * 
     */
    public ModifyCBDataForUsageResponse createModifyCBDataForUsageResponse() {
        return new ModifyCBDataForUsageResponse();
    }

    /**
     * Create an instance of {@link ScadaPoint }
     * 
     */
    public ScadaPoint createScadaPoint() {
        return new ScadaPoint();
    }

    /**
     * Create an instance of {@link MeterExchanges }
     * 
     */
    public MeterExchanges createMeterExchanges() {
        return new MeterExchanges();
    }

    /**
     * Create an instance of {@link GetDomainNames }
     * 
     */
    public GetDomainNames createGetDomainNames() {
        return new GetDomainNames();
    }

    /**
     * Create an instance of {@link ArrayOfReadingValue }
     * 
     */
    public ArrayOfReadingValue createArrayOfReadingValue() {
        return new ArrayOfReadingValue();
    }

    /**
     * Create an instance of {@link ArrayOfAssociatedMeters }
     * 
     */
    public ArrayOfAssociatedMeters createArrayOfAssociatedMeters() {
        return new ArrayOfAssociatedMeters();
    }

    /**
     * Create an instance of {@link GetAccountsByCustomerID }
     * 
     */
    public GetAccountsByCustomerID createGetAccountsByCustomerID() {
        return new GetAccountsByCustomerID();
    }

    /**
     * Create an instance of {@link PowerFactorManagementEvent }
     * 
     */
    public PowerFactorManagementEvent createPowerFactorManagementEvent() {
        return new PowerFactorManagementEvent();
    }

    /**
     * Create an instance of {@link Impedances }
     * 
     */
    public Impedances createImpedances() {
        return new Impedances();
    }

    /**
     * Create an instance of {@link ArrayOfStation }
     * 
     */
    public ArrayOfStation createArrayOfStation() {
        return new ArrayOfStation();
    }

    /**
     * Create an instance of {@link ArrayOfPropaneMeterExchange }
     * 
     */
    public ArrayOfPropaneMeterExchange createArrayOfPropaneMeterExchange() {
        return new ArrayOfPropaneMeterExchange();
    }

    /**
     * Create an instance of {@link ReceivedWaterMeter }
     * 
     */
    public ReceivedWaterMeter createReceivedWaterMeter() {
        return new ReceivedWaterMeter();
    }

    /**
     * Create an instance of {@link ArrayOfErrorObject }
     * 
     */
    public ArrayOfErrorObject createArrayOfErrorObject() {
        return new ArrayOfErrorObject();
    }

    /**
     * Create an instance of {@link LMDeviceInstalledNotificationResponse }
     * 
     */
    public LMDeviceInstalledNotificationResponse createLMDeviceInstalledNotificationResponse() {
        return new LMDeviceInstalledNotificationResponse();
    }

    /**
     * Create an instance of {@link GetAllMetersByAccountNumberResponse }
     * 
     */
    public GetAllMetersByAccountNumberResponse createGetAllMetersByAccountNumberResponse() {
        return new GetAllMetersByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link PropaneService }
     * 
     */
    public PropaneService createPropaneService() {
        return new PropaneService();
    }

    /**
     * Create an instance of {@link ArrayOfString19 }
     * 
     */
    public ArrayOfString19 createArrayOfString19() {
        return new ArrayOfString19();
    }

    /**
     * Create an instance of {@link GetMeterByMeterIDResponse }
     * 
     */
    public GetMeterByMeterIDResponse createGetMeterByMeterIDResponse() {
        return new GetMeterByMeterIDResponse();
    }

    /**
     * Create an instance of {@link GetServiceLocationByPhaseCodeResponse }
     * 
     */
    public GetServiceLocationByPhaseCodeResponse createGetServiceLocationByPhaseCodeResponse() {
        return new GetServiceLocationByPhaseCodeResponse();
    }

    /**
     * Create an instance of {@link AssignmentNotification }
     * 
     */
    public AssignmentNotification createAssignmentNotification() {
        return new AssignmentNotification();
    }

    /**
     * Create an instance of {@link Regulator }
     * 
     */
    public Regulator createRegulator() {
        return new Regulator();
    }

    /**
     * Create an instance of {@link IntervalProfile }
     * 
     */
    public IntervalProfile createIntervalProfile() {
        return new IntervalProfile();
    }

    /**
     * Create an instance of {@link WorkTicket }
     * 
     */
    public WorkTicket createWorkTicket() {
        return new WorkTicket();
    }

    /**
     * Create an instance of {@link ArrayOfHistoryLog }
     * 
     */
    public ArrayOfHistoryLog createArrayOfHistoryLog() {
        return new ArrayOfHistoryLog();
    }

    /**
     * Create an instance of {@link ReadingScheduleResult }
     * 
     */
    public ReadingScheduleResult createReadingScheduleResult() {
        return new ReadingScheduleResult();
    }

    /**
     * Create an instance of {@link ArrayOfMeterHistoryEvent }
     * 
     */
    public ArrayOfMeterHistoryEvent createArrayOfMeterHistoryEvent() {
        return new ArrayOfMeterHistoryEvent();
    }

    /**
     * Create an instance of {@link Capacitor }
     * 
     */
    public Capacitor createCapacitor() {
        return new Capacitor();
    }

    /**
     * Create an instance of {@link GenericPointFeature }
     * 
     */
    public GenericPointFeature createGenericPointFeature() {
        return new GenericPointFeature();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link AchPayment }
     * 
     */
    public AchPayment createAchPayment() {
        return new AchPayment();
    }

    /**
     * Create an instance of {@link VoltageAlarm }
     * 
     */
    public VoltageAlarm createVoltageAlarm() {
        return new VoltageAlarm();
    }

    /**
     * Create an instance of {@link GetMetersByCustomerName }
     * 
     */
    public GetMetersByCustomerName createGetMetersByCustomerName() {
        return new GetMetersByCustomerName();
    }

    /**
     * Create an instance of {@link BlinkAlarm }
     * 
     */
    public BlinkAlarm createBlinkAlarm() {
        return new BlinkAlarm();
    }

    /**
     * Create an instance of {@link Guy }
     * 
     */
    public Guy createGuy() {
        return new Guy();
    }

    /**
     * Create an instance of {@link ModifyCBDataForStreetLight }
     * 
     */
    public ModifyCBDataForStreetLight createModifyCBDataForStreetLight() {
        return new ModifyCBDataForStreetLight();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link LoadMixEntry }
     * 
     */
    public LoadMixEntry createLoadMixEntry() {
        return new LoadMixEntry();
    }

    /**
     * Create an instance of {@link ArrayOfWarehouseLocation }
     * 
     */
    public ArrayOfWarehouseLocation createArrayOfWarehouseLocation() {
        return new ArrayOfWarehouseLocation();
    }

    /**
     * Create an instance of {@link Angle }
     * 
     */
    public Angle createAngle() {
        return new Angle();
    }

    /**
     * Create an instance of {@link ArrayOfAttachment }
     * 
     */
    public ArrayOfAttachment createArrayOfAttachment() {
        return new ArrayOfAttachment();
    }

    /**
     * Create an instance of {@link AccumulatedValue }
     * 
     */
    public AccumulatedValue createAccumulatedValue() {
        return new AccumulatedValue();
    }

    /**
     * Create an instance of {@link GetAllServiceLocationsResponse }
     * 
     */
    public GetAllServiceLocationsResponse createGetAllServiceLocationsResponse() {
        return new GetAllServiceLocationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIntervalChannel }
     * 
     */
    public ArrayOfIntervalChannel createArrayOfIntervalChannel() {
        return new ArrayOfIntervalChannel();
    }

    /**
     * Create an instance of {@link GetCustomerByDBANameResponse }
     * 
     */
    public GetCustomerByDBANameResponse createGetCustomerByDBANameResponse() {
        return new GetCustomerByDBANameResponse();
    }

    /**
     * Create an instance of {@link BlockStatus }
     * 
     */
    public BlockStatus createBlockStatus() {
        return new BlockStatus();
    }

    /**
     * Create an instance of {@link ArrayOfAddressItem }
     * 
     */
    public ArrayOfAddressItem createArrayOfAddressItem() {
        return new ArrayOfAddressItem();
    }

    /**
     * Create an instance of {@link ArrayOfGMLPolygon }
     * 
     */
    public ArrayOfGMLPolygon createArrayOfGMLPolygon() {
        return new ArrayOfGMLPolygon();
    }

    /**
     * Create an instance of {@link GetAllOtherMeters }
     * 
     */
    public GetAllOtherMeters createGetAllOtherMeters() {
        return new GetAllOtherMeters();
    }

    /**
     * Create an instance of {@link ArrayOfTestedElectricMeter }
     * 
     */
    public ArrayOfTestedElectricMeter createArrayOfTestedElectricMeter() {
        return new ArrayOfTestedElectricMeter();
    }

    /**
     * Create an instance of {@link ServiceLocationNetworkChangedNotification }
     * 
     */
    public ServiceLocationNetworkChangedNotification createServiceLocationNetworkChangedNotification() {
        return new ServiceLocationNetworkChangedNotification();
    }

    /**
     * Create an instance of {@link GetCustomerByNameResponse }
     * 
     */
    public GetCustomerByNameResponse createGetCustomerByNameResponse() {
        return new GetCustomerByNameResponse();
    }

    /**
     * Create an instance of {@link RegulatorBank }
     * 
     */
    public RegulatorBank createRegulatorBank() {
        return new RegulatorBank();
    }

    /**
     * Create an instance of {@link ArrayOfAssignment }
     * 
     */
    public ArrayOfAssignment createArrayOfAssignment() {
        return new ArrayOfAssignment();
    }

    /**
     * Create an instance of {@link GMLLine }
     * 
     */
    public GMLLine createGMLLine() {
        return new GMLLine();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link GetDomainNamesResponse }
     * 
     */
    public GetDomainNamesResponse createGetDomainNamesResponse() {
        return new GetDomainNamesResponse();
    }

    /**
     * Create an instance of {@link PpmMeterExchange }
     * 
     */
    public PpmMeterExchange createPpmMeterExchange() {
        return new PpmMeterExchange();
    }

    /**
     * Create an instance of {@link PoleChangedNotification }
     * 
     */
    public PoleChangedNotification createPoleChangedNotification() {
        return new PoleChangedNotification();
    }

    /**
     * Create an instance of {@link MeterReading }
     * 
     */
    public MeterReading createMeterReading() {
        return new MeterReading();
    }

    /**
     * Create an instance of {@link ArrayOfPhoneNumber }
     * 
     */
    public ArrayOfPhoneNumber createArrayOfPhoneNumber() {
        return new ArrayOfPhoneNumber();
    }

    /**
     * Create an instance of {@link GetMeterByMeterID }
     * 
     */
    public GetMeterByMeterID createGetMeterByMeterID() {
        return new GetMeterByMeterID();
    }

    /**
     * Create an instance of {@link ArrayOfOtherMeter }
     * 
     */
    public ArrayOfOtherMeter createArrayOfOtherMeter() {
        return new ArrayOfOtherMeter();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link MeterBase }
     * 
     */
    public MeterBase createMeterBase() {
        return new MeterBase();
    }

    /**
     * Create an instance of {@link GetIHDGroupNames }
     * 
     */
    public GetIHDGroupNames createGetIHDGroupNames() {
        return new GetIHDGroupNames();
    }

    /**
     * Create an instance of {@link GetMethodsResponse }
     * 
     */
    public GetMethodsResponse createGetMethodsResponse() {
        return new GetMethodsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBillingDetail }
     * 
     */
    public ArrayOfBillingDetail createArrayOfBillingDetail() {
        return new ArrayOfBillingDetail();
    }

    /**
     * Create an instance of {@link RequestPaymentExtensionResponse }
     * 
     */
    public RequestPaymentExtensionResponse createRequestPaymentExtensionResponse() {
        return new RequestPaymentExtensionResponse();
    }

    /**
     * Create an instance of {@link Current }
     * 
     */
    public Current createCurrent() {
        return new Current();
    }

    /**
     * Create an instance of {@link OtherMeterExchange }
     * 
     */
    public OtherMeterExchange createOtherMeterExchange() {
        return new OtherMeterExchange();
    }

    /**
     * Create an instance of {@link InitiateWorkRequest }
     * 
     */
    public InitiateWorkRequest createInitiateWorkRequest() {
        return new InitiateWorkRequest();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link FormattedBlock }
     * 
     */
    public FormattedBlock createFormattedBlock() {
        return new FormattedBlock();
    }

    /**
     * Create an instance of {@link ArrayOfSwitchingSchedule }
     * 
     */
    public ArrayOfSwitchingSchedule createArrayOfSwitchingSchedule() {
        return new ArrayOfSwitchingSchedule();
    }

    /**
     * Create an instance of {@link RealPower }
     * 
     */
    public RealPower createRealPower() {
        return new RealPower();
    }

    /**
     * Create an instance of {@link ErrorObject }
     * 
     */
    public ErrorObject createErrorObject() {
        return new ErrorObject();
    }

    /**
     * Create an instance of {@link WaterNameplate }
     * 
     */
    public WaterNameplate createWaterNameplate() {
        return new WaterNameplate();
    }

    /**
     * Create an instance of {@link ArrayOfConductorItem }
     * 
     */
    public ArrayOfConductorItem createArrayOfConductorItem() {
        return new ArrayOfConductorItem();
    }

    /**
     * Create an instance of {@link ModifyCBDataForPoleResponse }
     * 
     */
    public ModifyCBDataForPoleResponse createModifyCBDataForPoleResponse() {
        return new ModifyCBDataForPoleResponse();
    }

    /**
     * Create an instance of {@link MaterialItem }
     * 
     */
    public MaterialItem createMaterialItem() {
        return new MaterialItem();
    }

    /**
     * Create an instance of {@link ArrayOfDesign }
     * 
     */
    public ArrayOfDesign createArrayOfDesign() {
        return new ArrayOfDesign();
    }

    /**
     * Create an instance of {@link StreetLight }
     * 
     */
    public StreetLight createStreetLight() {
        return new StreetLight();
    }

    /**
     * Create an instance of {@link GetAllWaterMetersResponse }
     * 
     */
    public GetAllWaterMetersResponse createGetAllWaterMetersResponse() {
        return new GetAllWaterMetersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString8 }
     * 
     */
    public ArrayOfString8 createArrayOfString8() {
        return new ArrayOfString8();
    }

    /**
     * Create an instance of {@link Assignment }
     * 
     */
    public Assignment createAssignment() {
        return new Assignment();
    }

    /**
     * Create an instance of {@link GetAllElectricMeters }
     * 
     */
    public GetAllElectricMeters createGetAllElectricMeters() {
        return new GetAllElectricMeters();
    }

    /**
     * Create an instance of {@link ArrayOfOtherMeterExchange }
     * 
     */
    public ArrayOfOtherMeterExchange createArrayOfOtherMeterExchange() {
        return new ArrayOfOtherMeterExchange();
    }

    /**
     * Create an instance of {@link BillingAccountLoad }
     * 
     */
    public BillingAccountLoad createBillingAccountLoad() {
        return new BillingAccountLoad();
    }

    /**
     * Create an instance of {@link LoadProfileChangedNotification }
     * 
     */
    public LoadProfileChangedNotification createLoadProfileChangedNotification() {
        return new LoadProfileChangedNotification();
    }

    /**
     * Create an instance of {@link GPSMetadata }
     * 
     */
    public GPSMetadata createGPSMetadata() {
        return new GPSMetadata();
    }

    /**
     * Create an instance of {@link GasPressure }
     * 
     */
    public GasPressure createGasPressure() {
        return new GasPressure();
    }

    /**
     * Create an instance of {@link GetServiceLocationByServiceLocationIDResponse }
     * 
     */
    public GetServiceLocationByServiceLocationIDResponse createGetServiceLocationByServiceLocationIDResponse() {
        return new GetServiceLocationByServiceLocationIDResponse();
    }

    /**
     * Create an instance of {@link PayableItemList }
     * 
     */
    public PayableItemList createPayableItemList() {
        return new PayableItemList();
    }

    /**
     * Create an instance of {@link GasFlow }
     * 
     */
    public GasFlow createGasFlow() {
        return new GasFlow();
    }

    /**
     * Create an instance of {@link GetMetersByFacilityIDResponse }
     * 
     */
    public GetMetersByFacilityIDResponse createGetMetersByFacilityIDResponse() {
        return new GetMetersByFacilityIDResponse();
    }

    /**
     * Create an instance of {@link Switch }
     * 
     */
    public Switch createSwitch() {
        return new Switch();
    }

    /**
     * Create an instance of {@link LMDeviceExchangeNotification }
     * 
     */
    public LMDeviceExchangeNotification createLMDeviceExchangeNotification() {
        return new LMDeviceExchangeNotification();
    }

    /**
     * Create an instance of {@link ResistancePerUnitLength }
     * 
     */
    public ResistancePerUnitLength createResistancePerUnitLength() {
        return new ResistancePerUnitLength();
    }

    /**
     * Create an instance of {@link ArrayOfGasMeter }
     * 
     */
    public ArrayOfGasMeter createArrayOfGasMeter() {
        return new ArrayOfGasMeter();
    }

    /**
     * Create an instance of {@link ArrayOfStatusOfService }
     * 
     */
    public ArrayOfStatusOfService createArrayOfStatusOfService() {
        return new ArrayOfStatusOfService();
    }

    /**
     * Create an instance of {@link GetTransformerBankByBankIDFromCB }
     * 
     */
    public GetTransformerBankByBankIDFromCB createGetTransformerBankByBankIDFromCB() {
        return new GetTransformerBankByBankIDFromCB();
    }

    /**
     * Create an instance of {@link InHomeDisplayMessage }
     * 
     */
    public InHomeDisplayMessage createInHomeDisplayMessage() {
        return new InHomeDisplayMessage();
    }

    /**
     * Create an instance of {@link GetMetersByEALocationResponse }
     * 
     */
    public GetMetersByEALocationResponse createGetMetersByEALocationResponse() {
        return new GetMetersByEALocationResponse();
    }

    /**
     * Create an instance of {@link InitiateWorkRequestResponse }
     * 
     */
    public InitiateWorkRequestResponse createInitiateWorkRequestResponse() {
        return new InitiateWorkRequestResponse();
    }

    /**
     * Create an instance of {@link AVLAddress }
     * 
     */
    public AVLAddress createAVLAddress() {
        return new AVLAddress();
    }

    /**
     * Create an instance of {@link GetPPMCustomerResponse }
     * 
     */
    public GetPPMCustomerResponse createGetPPMCustomerResponse() {
        return new GetPPMCustomerResponse();
    }

    /**
     * Create an instance of {@link AllocatedLoad }
     * 
     */
    public AllocatedLoad createAllocatedLoad() {
        return new AllocatedLoad();
    }

    /**
     * Create an instance of {@link ArrayOfBay }
     * 
     */
    public ArrayOfBay createArrayOfBay() {
        return new ArrayOfBay();
    }

    /**
     * Create an instance of {@link Strategy }
     * 
     */
    public Strategy createStrategy() {
        return new Strategy();
    }

    /**
     * Create an instance of {@link GetIHDGroupNamesByInHomeDisplayID }
     * 
     */
    public GetIHDGroupNamesByInHomeDisplayID createGetIHDGroupNamesByInHomeDisplayID() {
        return new GetIHDGroupNamesByInHomeDisplayID();
    }

    /**
     * Create an instance of {@link ArrayOfString16 }
     * 
     */
    public ArrayOfString16 createArrayOfString16() {
        return new ArrayOfString16();
    }

    /**
     * Create an instance of {@link AcctsReceivable }
     * 
     */
    public AcctsReceivable createAcctsReceivable() {
        return new AcctsReceivable();
    }

    /**
     * Create an instance of {@link ArrayOfOutageAttachment }
     * 
     */
    public ArrayOfOutageAttachment createArrayOfOutageAttachment() {
        return new ArrayOfOutageAttachment();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link PropaneLocationFields }
     * 
     */
    public PropaneLocationFields createPropaneLocationFields() {
        return new PropaneLocationFields();
    }

    /**
     * Create an instance of {@link InstrumentTransformers }
     * 
     */
    public InstrumentTransformers createInstrumentTransformers() {
        return new InstrumentTransformers();
    }

    /**
     * Create an instance of {@link ArrayOfEquipment }
     * 
     */
    public ArrayOfEquipment createArrayOfEquipment() {
        return new ArrayOfEquipment();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeTimeRecord }
     * 
     */
    public ArrayOfEmployeeTimeRecord createArrayOfEmployeeTimeRecord() {
        return new ArrayOfEmployeeTimeRecord();
    }

    /**
     * Create an instance of {@link PowerLimitationValue }
     * 
     */
    public PowerLimitationValue createPowerLimitationValue() {
        return new PowerLimitationValue();
    }

    /**
     * Create an instance of {@link WindingPair }
     * 
     */
    public WindingPair createWindingPair() {
        return new WindingPair();
    }

    /**
     * Create an instance of {@link ModifyCBDataForSecurityLight }
     * 
     */
    public ModifyCBDataForSecurityLight createModifyCBDataForSecurityLight() {
        return new ModifyCBDataForSecurityLight();
    }

    /**
     * Create an instance of {@link UsageMonitoringNotificationResponse }
     * 
     */
    public UsageMonitoringNotificationResponse createUsageMonitoringNotificationResponse() {
        return new UsageMonitoringNotificationResponse();
    }

    /**
     * Create an instance of {@link SectionalizerEntry }
     * 
     */
    public SectionalizerEntry createSectionalizerEntry() {
        return new SectionalizerEntry();
    }

    /**
     * Create an instance of {@link RequestRegistrationIDResponse }
     * 
     */
    public RequestRegistrationIDResponse createRequestRegistrationIDResponse() {
        return new RequestRegistrationIDResponse();
    }

    /**
     * Create an instance of {@link GetBillingAccountLoadDataByMonth }
     * 
     */
    public GetBillingAccountLoadDataByMonth createGetBillingAccountLoadDataByMonth() {
        return new GetBillingAccountLoadDataByMonth();
    }

    /**
     * Create an instance of {@link ArrayOfStreetLight }
     * 
     */
    public ArrayOfStreetLight createArrayOfStreetLight() {
        return new ArrayOfStreetLight();
    }

    /**
     * Create an instance of {@link GasMeters }
     * 
     */
    public GasMeters createGasMeters() {
        return new GasMeters();
    }

    /**
     * Create an instance of {@link BillingDetail }
     * 
     */
    public BillingDetail createBillingDetail() {
        return new BillingDetail();
    }

    /**
     * Create an instance of {@link Length }
     * 
     */
    public Length createLength() {
        return new Length();
    }

    /**
     * Create an instance of {@link ArrayOfTransformerWinding }
     * 
     */
    public ArrayOfTransformerWinding createArrayOfTransformerWinding() {
        return new ArrayOfTransformerWinding();
    }

    /**
     * Create an instance of {@link GetPPMPaymentsResponse }
     * 
     */
    public GetPPMPaymentsResponse createGetPPMPaymentsResponse() {
        return new GetPPMPaymentsResponse();
    }

    /**
     * Create an instance of {@link ModifyCBDataForCustomerResponse }
     * 
     */
    public ModifyCBDataForCustomerResponse createModifyCBDataForCustomerResponse() {
        return new ModifyCBDataForCustomerResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLoadManagementDevice1 }
     * 
     */
    public ArrayOfLoadManagementDevice1 createArrayOfLoadManagementDevice1() {
        return new ArrayOfLoadManagementDevice1();
    }

    /**
     * Create an instance of {@link ArrayOfWorkOrder }
     * 
     */
    public ArrayOfWorkOrder createArrayOfWorkOrder() {
        return new ArrayOfWorkOrder();
    }

    /**
     * Create an instance of {@link InHomeDisplay }
     * 
     */
    public InHomeDisplay createInHomeDisplay() {
        return new InHomeDisplay();
    }

    /**
     * Create an instance of {@link GetAllServiceLocations }
     * 
     */
    public GetAllServiceLocations createGetAllServiceLocations() {
        return new GetAllServiceLocations();
    }

    /**
     * Create an instance of {@link ArrayOfChargeableDevice }
     * 
     */
    public ArrayOfChargeableDevice createArrayOfChargeableDevice() {
        return new ArrayOfChargeableDevice();
    }

    /**
     * Create an instance of {@link ArrayOfMessage }
     * 
     */
    public ArrayOfMessage createArrayOfMessage() {
        return new ArrayOfMessage();
    }

    /**
     * Create an instance of {@link MeterEventList }
     * 
     */
    public MeterEventList createMeterEventList() {
        return new MeterEventList();
    }

    /**
     * Create an instance of {@link MeterReadingC1219 }
     * 
     */
    public MeterReadingC1219 createMeterReadingC1219() {
        return new MeterReadingC1219();
    }

    /**
     * Create an instance of {@link ReceivedGasMeter }
     * 
     */
    public ReceivedGasMeter createReceivedGasMeter() {
        return new ReceivedGasMeter();
    }

    /**
     * Create an instance of {@link GetAllStreetLightsResponse }
     * 
     */
    public GetAllStreetLightsResponse createGetAllStreetLightsResponse() {
        return new GetAllStreetLightsResponse();
    }

    /**
     * Create an instance of {@link BillingData }
     * 
     */
    public BillingData createBillingData() {
        return new BillingData();
    }

    /**
     * Create an instance of {@link GetAllMetersByServiceTypeResponse }
     * 
     */
    public GetAllMetersByServiceTypeResponse createGetAllMetersByServiceTypeResponse() {
        return new GetAllMetersByServiceTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUsage }
     * 
     */
    public ArrayOfUsage createArrayOfUsage() {
        return new ArrayOfUsage();
    }

    /**
     * Create an instance of {@link GetChargeableDevicesByAccountNumber }
     * 
     */
    public GetChargeableDevicesByAccountNumber createGetChargeableDevicesByAccountNumber() {
        return new GetChargeableDevicesByAccountNumber();
    }

    /**
     * Create an instance of {@link GetElectricMetersByAccountNumberResponse }
     * 
     */
    public GetElectricMetersByAccountNumberResponse createGetElectricMetersByAccountNumberResponse() {
        return new GetElectricMetersByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPhaseItem }
     * 
     */
    public ArrayOfPhaseItem createArrayOfPhaseItem() {
        return new ArrayOfPhaseItem();
    }

    /**
     * Create an instance of {@link GetAllMetersByServiceType }
     * 
     */
    public GetAllMetersByServiceType createGetAllMetersByServiceType() {
        return new GetAllMetersByServiceType();
    }

    /**
     * Create an instance of {@link ReadingValue }
     * 
     */
    public ReadingValue createReadingValue() {
        return new ReadingValue();
    }

    /**
     * Create an instance of {@link GetServiceLocationIDByMeter }
     * 
     */
    public GetServiceLocationIDByMeter createGetServiceLocationIDByMeter() {
        return new GetServiceLocationIDByMeter();
    }

    /**
     * Create an instance of {@link ScadaPoints }
     * 
     */
    public ScadaPoints createScadaPoints() {
        return new ScadaPoints();
    }

    /**
     * Create an instance of {@link ArrayOfOvercurrentDevice }
     * 
     */
    public ArrayOfOvercurrentDevice createArrayOfOvercurrentDevice() {
        return new ArrayOfOvercurrentDevice();
    }

    /**
     * Create an instance of {@link GetMetersByFacilityID }
     * 
     */
    public GetMetersByFacilityID createGetMetersByFacilityID() {
        return new GetMetersByFacilityID();
    }

    /**
     * Create an instance of {@link ReadingObject }
     * 
     */
    public ReadingObject createReadingObject() {
        return new ReadingObject();
    }

    /**
     * Create an instance of {@link GetProjectResponse }
     * 
     */
    public GetProjectResponse createGetProjectResponse() {
        return new GetProjectResponse();
    }

    /**
     * Create an instance of {@link Fuse }
     * 
     */
    public Fuse createFuse() {
        return new Fuse();
    }

    /**
     * Create an instance of {@link ArrayOfProfileType }
     * 
     */
    public ArrayOfProfileType createArrayOfProfileType() {
        return new ArrayOfProfileType();
    }

    /**
     * Create an instance of {@link WaterService }
     * 
     */
    public WaterService createWaterService() {
        return new WaterService();
    }

    /**
     * Create an instance of {@link FeederObject }
     * 
     */
    public FeederObject createFeederObject() {
        return new FeederObject();
    }

    /**
     * Create an instance of {@link ArrayOfAccount1 }
     * 
     */
    public ArrayOfAccount1 createArrayOfAccount1() {
        return new ArrayOfAccount1();
    }

    /**
     * Create an instance of {@link ArrayOfVoltageLevel }
     * 
     */
    public ArrayOfVoltageLevel createArrayOfVoltageLevel() {
        return new ArrayOfVoltageLevel();
    }

    /**
     * Create an instance of {@link RegulatorEntry }
     * 
     */
    public RegulatorEntry createRegulatorEntry() {
        return new RegulatorEntry();
    }

    /**
     * Create an instance of {@link GetMetersByHomePhoneResponse }
     * 
     */
    public GetMetersByHomePhoneResponse createGetMetersByHomePhoneResponse() {
        return new GetMetersByHomePhoneResponse();
    }

    /**
     * Create an instance of {@link EmployeeTimeRecord }
     * 
     */
    public EmployeeTimeRecord createEmployeeTimeRecord() {
        return new EmployeeTimeRecord();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link ArrayOfMeterID }
     * 
     */
    public ArrayOfMeterID createArrayOfMeterID() {
        return new ArrayOfMeterID();
    }

    /**
     * Create an instance of {@link ContentReference }
     * 
     */
    public ContentReference createContentReference() {
        return new ContentReference();
    }

    /**
     * Create an instance of {@link ServiceOrder }
     * 
     */
    public ServiceOrder createServiceOrder() {
        return new ServiceOrder();
    }

    /**
     * Create an instance of {@link OtherContactItem }
     * 
     */
    public OtherContactItem createOtherContactItem() {
        return new OtherContactItem();
    }

    /**
     * Create an instance of {@link ScadaStatus }
     * 
     */
    public ScadaStatus createScadaStatus() {
        return new ScadaStatus();
    }

    /**
     * Create an instance of {@link ArrayOfTimePoint }
     * 
     */
    public ArrayOfTimePoint createArrayOfTimePoint() {
        return new ArrayOfTimePoint();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link EquipmentStatus }
     * 
     */
    public EquipmentStatus createEquipmentStatus() {
        return new EquipmentStatus();
    }

    /**
     * Create an instance of {@link OutageDetectionEvent }
     * 
     */
    public OutageDetectionEvent createOutageDetectionEvent() {
        return new OutageDetectionEvent();
    }

    /**
     * Create an instance of {@link WarehouseLocation }
     * 
     */
    public WarehouseLocation createWarehouseLocation() {
        return new WarehouseLocation();
    }

    /**
     * Create an instance of {@link ArrayOfWorker }
     * 
     */
    public ArrayOfWorker createArrayOfWorker() {
        return new ArrayOfWorker();
    }

    /**
     * Create an instance of {@link GetServiceLocationByServiceLocationID }
     * 
     */
    public GetServiceLocationByServiceLocationID createGetServiceLocationByServiceLocationID() {
        return new GetServiceLocationByServiceLocationID();
    }

    /**
     * Create an instance of {@link EaLoc }
     * 
     */
    public EaLoc createEaLoc() {
        return new EaLoc();
    }

    /**
     * Create an instance of {@link LMDeviceExchangeNotificationResponse }
     * 
     */
    public LMDeviceExchangeNotificationResponse createLMDeviceExchangeNotificationResponse() {
        return new LMDeviceExchangeNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInHomeDisplay1 }
     * 
     */
    public ArrayOfInHomeDisplay1 createArrayOfInHomeDisplay1() {
        return new ArrayOfInHomeDisplay1();
    }

    /**
     * Create an instance of {@link InHomeDisplayInstalledNotification }
     * 
     */
    public InHomeDisplayInstalledNotification createInHomeDisplayInstalledNotification() {
        return new InHomeDisplayInstalledNotification();
    }

    /**
     * Create an instance of {@link SynchronousMachine }
     * 
     */
    public SynchronousMachine createSynchronousMachine() {
        return new SynchronousMachine();
    }

    /**
     * Create an instance of {@link ArrayOfTransformerBank }
     * 
     */
    public ArrayOfTransformerBank createArrayOfTransformerBank() {
        return new ArrayOfTransformerBank();
    }

    /**
     * Create an instance of {@link MeterExchangeNotification }
     * 
     */
    public MeterExchangeNotification createMeterExchangeNotification() {
        return new MeterExchangeNotification();
    }

    /**
     * Create an instance of {@link ArrayOfString7 }
     * 
     */
    public ArrayOfString7 createArrayOfString7() {
        return new ArrayOfString7();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link ArrayOfEvent }
     * 
     */
    public ArrayOfEvent createArrayOfEvent() {
        return new ArrayOfEvent();
    }

    /**
     * Create an instance of {@link ArrayOfObjectRef }
     * 
     */
    public ArrayOfObjectRef createArrayOfObjectRef() {
        return new ArrayOfObjectRef();
    }

    /**
     * Create an instance of {@link WriteAccountHistoryComments }
     * 
     */
    public WriteAccountHistoryComments createWriteAccountHistoryComments() {
        return new WriteAccountHistoryComments();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ArrayOfReceivedWaterMeter }
     * 
     */
    public ArrayOfReceivedWaterMeter createArrayOfReceivedWaterMeter() {
        return new ArrayOfReceivedWaterMeter();
    }

    /**
     * Create an instance of {@link UtilityInfo }
     * 
     */
    public UtilityInfo createUtilityInfo() {
        return new UtilityInfo();
    }

    /**
     * Create an instance of {@link OvercurrentDeviceBank }
     * 
     */
    public OvercurrentDeviceBank createOvercurrentDeviceBank() {
        return new OvercurrentDeviceBank();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link EndDeviceShipmentNotificationResponse }
     * 
     */
    public EndDeviceShipmentNotificationResponse createEndDeviceShipmentNotificationResponse() {
        return new EndDeviceShipmentNotificationResponse();
    }

    /**
     * Create an instance of {@link DisplayFormat }
     * 
     */
    public DisplayFormat createDisplayFormat() {
        return new DisplayFormat();
    }

    /**
     * Create an instance of {@link ArrayOfReceivedPropaneMeter }
     * 
     */
    public ArrayOfReceivedPropaneMeter createArrayOfReceivedPropaneMeter() {
        return new ArrayOfReceivedPropaneMeter();
    }

    /**
     * Create an instance of {@link ExtendPayment }
     * 
     */
    public ExtendPayment createExtendPayment() {
        return new ExtendPayment();
    }

    /**
     * Create an instance of {@link ArrayOfEventInstance }
     * 
     */
    public ArrayOfEventInstance createArrayOfEventInstance() {
        return new ArrayOfEventInstance();
    }

    /**
     * Create an instance of {@link LoadManagementEvent }
     * 
     */
    public LoadManagementEvent createLoadManagementEvent() {
        return new LoadManagementEvent();
    }

    /**
     * Create an instance of {@link RequestPaymentExtension }
     * 
     */
    public RequestPaymentExtension createRequestPaymentExtension() {
        return new RequestPaymentExtension();
    }

    /**
     * Create an instance of {@link ArrayOfPole }
     * 
     */
    public ArrayOfPole createArrayOfPole() {
        return new ArrayOfPole();
    }

    /**
     * Create an instance of {@link Seconds }
     * 
     */
    public Seconds createSeconds() {
        return new Seconds();
    }

    /**
     * Create an instance of {@link ChargeableDeviceList }
     * 
     */
    public ChargeableDeviceList createChargeableDeviceList() {
        return new ChargeableDeviceList();
    }

    /**
     * Create an instance of {@link ScheduleModification }
     * 
     */
    public ScheduleModification createScheduleModification() {
        return new ScheduleModification();
    }

    /**
     * Create an instance of {@link ExtValue }
     * 
     */
    public ExtValue createExtValue() {
        return new ExtValue();
    }

    /**
     * Create an instance of {@link ArrayOfWorkTask }
     * 
     */
    public ArrayOfWorkTask createArrayOfWorkTask() {
        return new ArrayOfWorkTask();
    }

    /**
     * Create an instance of {@link ItemMaintained }
     * 
     */
    public ItemMaintained createItemMaintained() {
        return new ItemMaintained();
    }

    /**
     * Create an instance of {@link ScadaAnalog }
     * 
     */
    public ScadaAnalog createScadaAnalog() {
        return new ScadaAnalog();
    }

    /**
     * Create an instance of {@link ApparentPower }
     * 
     */
    public ApparentPower createApparentPower() {
        return new ApparentPower();
    }

    /**
     * Create an instance of {@link ArrayOfObjectRef4 }
     * 
     */
    public ArrayOfObjectRef4 createArrayOfObjectRef4() {
        return new ArrayOfObjectRef4();
    }

    /**
     * Create an instance of {@link GetPPMBalanceAdjustments }
     * 
     */
    public GetPPMBalanceAdjustments createGetPPMBalanceAdjustments() {
        return new GetPPMBalanceAdjustments();
    }

    /**
     * Create an instance of {@link UsageItem }
     * 
     */
    public UsageItem createUsageItem() {
        return new UsageItem();
    }

    /**
     * Create an instance of {@link GetServiceLocationByGridLocation }
     * 
     */
    public GetServiceLocationByGridLocation createGetServiceLocationByGridLocation() {
        return new GetServiceLocationByGridLocation();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link ArrayOfDomainNameChange }
     * 
     */
    public ArrayOfDomainNameChange createArrayOfDomainNameChange() {
        return new ArrayOfDomainNameChange();
    }

    /**
     * Create an instance of {@link MeterConditions }
     * 
     */
    public MeterConditions createMeterConditions() {
        return new MeterConditions();
    }

    /**
     * Create an instance of {@link ModifyCBDataForTransformerBank }
     * 
     */
    public ModifyCBDataForTransformerBank createModifyCBDataForTransformerBank() {
        return new ModifyCBDataForTransformerBank();
    }

    /**
     * Create an instance of {@link GetUsageByMonth }
     * 
     */
    public GetUsageByMonth createGetUsageByMonth() {
        return new GetUsageByMonth();
    }

    /**
     * Create an instance of {@link InHomeDisplayInstalledNotificationResponse }
     * 
     */
    public InHomeDisplayInstalledNotificationResponse createInHomeDisplayInstalledNotificationResponse() {
        return new InHomeDisplayInstalledNotificationResponse();
    }

    /**
     * Create an instance of {@link GenericAnnotationFeature }
     * 
     */
    public GenericAnnotationFeature createGenericAnnotationFeature() {
        return new GenericAnnotationFeature();
    }

    /**
     * Create an instance of {@link ArrayOfMeasurement }
     * 
     */
    public ArrayOfMeasurement createArrayOfMeasurement() {
        return new ArrayOfMeasurement();
    }

    /**
     * Create an instance of {@link RecloserImpedances }
     * 
     */
    public RecloserImpedances createRecloserImpedances() {
        return new RecloserImpedances();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public Geometry createGeometry() {
        return new Geometry();
    }

    /**
     * Create an instance of {@link LoadFlowResult }
     * 
     */
    public LoadFlowResult createLoadFlowResult() {
        return new LoadFlowResult();
    }

    /**
     * Create an instance of {@link GetPublishMethodsResponse }
     * 
     */
    public GetPublishMethodsResponse createGetPublishMethodsResponse() {
        return new GetPublishMethodsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfElectricMeter1 }
     * 
     */
    public ArrayOfElectricMeter1 createArrayOfElectricMeter1() {
        return new ArrayOfElectricMeter1();
    }

    /**
     * Create an instance of {@link GetMeterByCustomerID }
     * 
     */
    public GetMeterByCustomerID createGetMeterByCustomerID() {
        return new GetMeterByCustomerID();
    }

    /**
     * Create an instance of {@link ArrayOfMaterialComponent }
     * 
     */
    public ArrayOfMaterialComponent createArrayOfMaterialComponent() {
        return new ArrayOfMaterialComponent();
    }

    /**
     * Create an instance of {@link PpmBalanceAdjustment }
     * 
     */
    public PpmBalanceAdjustment createPpmBalanceAdjustment() {
        return new PpmBalanceAdjustment();
    }

    /**
     * Create an instance of {@link GetAllElectricMetersResponse }
     * 
     */
    public GetAllElectricMetersResponse createGetAllElectricMetersResponse() {
        return new GetAllElectricMetersResponse();
    }

    /**
     * Create an instance of {@link SwitchingOrderChangedNotificationResponse }
     * 
     */
    public SwitchingOrderChangedNotificationResponse createSwitchingOrderChangedNotificationResponse() {
        return new SwitchingOrderChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link GetBilledUsage }
     * 
     */
    public GetBilledUsage createGetBilledUsage() {
        return new GetBilledUsage();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link ArrayOfLoadManagementDevice }
     * 
     */
    public ArrayOfLoadManagementDevice createArrayOfLoadManagementDevice() {
        return new ArrayOfLoadManagementDevice();
    }

    /**
     * Create an instance of {@link GetAccountByServiceLocationIDAndServiceTypeResponse }
     * 
     */
    public GetAccountByServiceLocationIDAndServiceTypeResponse createGetAccountByServiceLocationIDAndServiceTypeResponse() {
        return new GetAccountByServiceLocationIDAndServiceTypeResponse();
    }

    /**
     * Create an instance of {@link GetMeterGroupNamesByMeterIDResponse }
     * 
     */
    public GetMeterGroupNamesByMeterIDResponse createGetMeterGroupNamesByMeterIDResponse() {
        return new GetMeterGroupNamesByMeterIDResponse();
    }

    /**
     * Create an instance of {@link FlowDemand }
     * 
     */
    public FlowDemand createFlowDemand() {
        return new FlowDemand();
    }

    /**
     * Create an instance of {@link ArrayOfObservation }
     * 
     */
    public ArrayOfObservation createArrayOfObservation() {
        return new ArrayOfObservation();
    }

    /**
     * Create an instance of {@link ZigBeeLoadControlEvent }
     * 
     */
    public ZigBeeLoadControlEvent createZigBeeLoadControlEvent() {
        return new ZigBeeLoadControlEvent();
    }

    /**
     * Create an instance of {@link ArrayOfMeterID1 }
     * 
     */
    public ArrayOfMeterID1 createArrayOfMeterID1() {
        return new ArrayOfMeterID1();
    }

    /**
     * Create an instance of {@link ArrayOfString14 }
     * 
     */
    public ArrayOfString14 createArrayOfString14() {
        return new ArrayOfString14();
    }

    /**
     * Create an instance of {@link MeasurementItems }
     * 
     */
    public MeasurementItems createMeasurementItems() {
        return new MeasurementItems();
    }

    /**
     * Create an instance of {@link LoggedOutageDetectionEvent }
     * 
     */
    public LoggedOutageDetectionEvent createLoggedOutageDetectionEvent() {
        return new LoggedOutageDetectionEvent();
    }

    /**
     * Create an instance of {@link UgSecondaryLine }
     * 
     */
    public UgSecondaryLine createUgSecondaryLine() {
        return new UgSecondaryLine();
    }

    /**
     * Create an instance of {@link TransformerBank }
     * 
     */
    public TransformerBank createTransformerBank() {
        return new TransformerBank();
    }

    /**
     * Create an instance of {@link ArrayOfCDStateChange }
     * 
     */
    public ArrayOfCDStateChange createArrayOfCDStateChange() {
        return new ArrayOfCDStateChange();
    }

    /**
     * Create an instance of {@link GetAllSecurityLights }
     * 
     */
    public GetAllSecurityLights createGetAllSecurityLights() {
        return new GetAllSecurityLights();
    }

    /**
     * Create an instance of {@link OtherIdentificationFields }
     * 
     */
    public OtherIdentificationFields createOtherIdentificationFields() {
        return new OtherIdentificationFields();
    }

    /**
     * Create an instance of {@link ArrayOfGenericAnnotationFeature }
     * 
     */
    public ArrayOfGenericAnnotationFeature createArrayOfGenericAnnotationFeature() {
        return new ArrayOfGenericAnnotationFeature();
    }

    /**
     * Create an instance of {@link WorkOrderSelection }
     * 
     */
    public WorkOrderSelection createWorkOrderSelection() {
        return new WorkOrderSelection();
    }

    /**
     * Create an instance of {@link MaintenanceOrder }
     * 
     */
    public MaintenanceOrder createMaintenanceOrder() {
        return new MaintenanceOrder();
    }

    /**
     * Create an instance of {@link ComplexImpedance }
     * 
     */
    public ComplexImpedance createComplexImpedance() {
        return new ComplexImpedance();
    }

    /**
     * Create an instance of {@link CircuitElementStatus }
     * 
     */
    public CircuitElementStatus createCircuitElementStatus() {
        return new CircuitElementStatus();
    }

    /**
     * Create an instance of {@link CPR }
     * 
     */
    public CPR createCPR() {
        return new CPR();
    }

    /**
     * Create an instance of {@link CDDeviceInstalledNotification }
     * 
     */
    public CDDeviceInstalledNotification createCDDeviceInstalledNotification() {
        return new CDDeviceInstalledNotification();
    }

    /**
     * Create an instance of {@link Tender }
     * 
     */
    public Tender createTender() {
        return new Tender();
    }

    /**
     * Create an instance of {@link ArrayOfAllocatedLoad }
     * 
     */
    public ArrayOfAllocatedLoad createArrayOfAllocatedLoad() {
        return new ArrayOfAllocatedLoad();
    }

    /**
     * Create an instance of {@link Jumper }
     * 
     */
    public Jumper createJumper() {
        return new Jumper();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link GetServiceLocationByCustomerIDResponse }
     * 
     */
    public GetServiceLocationByCustomerIDResponse createGetServiceLocationByCustomerIDResponse() {
        return new GetServiceLocationByCustomerIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOutageCustomer }
     * 
     */
    public ArrayOfOutageCustomer createArrayOfOutageCustomer() {
        return new ArrayOfOutageCustomer();
    }

    /**
     * Create an instance of {@link ArrayOfMsgLine }
     * 
     */
    public ArrayOfMsgLine createArrayOfMsgLine() {
        return new ArrayOfMsgLine();
    }

    /**
     * Create an instance of {@link ArrayOfPropaneMeter }
     * 
     */
    public ArrayOfPropaneMeter createArrayOfPropaneMeter() {
        return new ArrayOfPropaneMeter();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link GetAllPolesFromCBResponse }
     * 
     */
    public GetAllPolesFromCBResponse createGetAllPolesFromCBResponse() {
        return new GetAllPolesFromCBResponse();
    }

    /**
     * Create an instance of {@link GetMeterBaseByObjectID }
     * 
     */
    public GetMeterBaseByObjectID createGetMeterBaseByObjectID() {
        return new GetMeterBaseByObjectID();
    }

    /**
     * Create an instance of {@link ArrayOfString18 }
     * 
     */
    public ArrayOfString18 createArrayOfString18() {
        return new ArrayOfString18();
    }

    /**
     * Create an instance of {@link ArrayOfMeterGroup }
     * 
     */
    public ArrayOfMeterGroup createArrayOfMeterGroup() {
        return new ArrayOfMeterGroup();
    }

    /**
     * Create an instance of {@link DomainNameChange }
     * 
     */
    public DomainNameChange createDomainNameChange() {
        return new DomainNameChange();
    }

    /**
     * Create an instance of {@link Assessment }
     * 
     */
    public Assessment createAssessment() {
        return new Assessment();
    }

    /**
     * Create an instance of {@link GetServiceOrderByServiceOrderIDResponse }
     * 
     */
    public GetServiceOrderByServiceOrderIDResponse createGetServiceOrderByServiceOrderIDResponse() {
        return new GetServiceOrderByServiceOrderIDResponse();
    }

    /**
     * Create an instance of {@link PoleChangedNotificationResponse }
     * 
     */
    public PoleChangedNotificationResponse createPoleChangedNotificationResponse() {
        return new PoleChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAVLState }
     * 
     */
    public ArrayOfAVLState createArrayOfAVLState() {
        return new ArrayOfAVLState();
    }

    /**
     * Create an instance of {@link GetIHDGroupMembersResponse }
     * 
     */
    public GetIHDGroupMembersResponse createGetIHDGroupMembersResponse() {
        return new GetIHDGroupMembersResponse();
    }

    /**
     * Create an instance of {@link GetServiceLocationIDByHomePhone }
     * 
     */
    public GetServiceLocationIDByHomePhone createGetServiceLocationIDByHomePhone() {
        return new GetServiceLocationIDByHomePhone();
    }

    /**
     * Create an instance of {@link Resistivity }
     * 
     */
    public Resistivity createResistivity() {
        return new Resistivity();
    }

    /**
     * Create an instance of {@link IntervalData }
     * 
     */
    public IntervalData createIntervalData() {
        return new IntervalData();
    }

    /**
     * Create an instance of {@link DesignIdentifier }
     * 
     */
    public DesignIdentifier createDesignIdentifier() {
        return new DesignIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfReadingType }
     * 
     */
    public ArrayOfReadingType createArrayOfReadingType() {
        return new ArrayOfReadingType();
    }

    /**
     * Create an instance of {@link GetBillingDataResponse }
     * 
     */
    public GetBillingDataResponse createGetBillingDataResponse() {
        return new GetBillingDataResponse();
    }

    /**
     * Create an instance of {@link FormattedBlockTemplate }
     * 
     */
    public FormattedBlockTemplate createFormattedBlockTemplate() {
        return new FormattedBlockTemplate();
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link ArrayOfHistoryComment }
     * 
     */
    public ArrayOfHistoryComment createArrayOfHistoryComment() {
        return new ArrayOfHistoryComment();
    }

    /**
     * Create an instance of {@link AssessmentLocation }
     * 
     */
    public AssessmentLocation createAssessmentLocation() {
        return new AssessmentLocation();
    }

    /**
     * Create an instance of {@link CallBackList }
     * 
     */
    public CallBackList createCallBackList() {
        return new CallBackList();
    }

    /**
     * Create an instance of {@link ArrayOfElectricService }
     * 
     */
    public ArrayOfElectricService createArrayOfElectricService() {
        return new ArrayOfElectricService();
    }

    /**
     * Create an instance of {@link ReadingScheduleResultNotification }
     * 
     */
    public ReadingScheduleResultNotification createReadingScheduleResultNotification() {
        return new ReadingScheduleResultNotification();
    }

    /**
     * Create an instance of {@link Breaker }
     * 
     */
    public Breaker createBreaker() {
        return new Breaker();
    }

    /**
     * Create an instance of {@link GetAllGasMeters }
     * 
     */
    public GetAllGasMeters createGetAllGasMeters() {
        return new GetAllGasMeters();
    }

    /**
     * Create an instance of {@link ArrayOfString5 }
     * 
     */
    public ArrayOfString5 createArrayOfString5() {
        return new ArrayOfString5();
    }

    /**
     * Create an instance of {@link GetCustomerByHomePhoneResponse }
     * 
     */
    public GetCustomerByHomePhoneResponse createGetCustomerByHomePhoneResponse() {
        return new GetCustomerByHomePhoneResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEMailAddress }
     * 
     */
    public ArrayOfEMailAddress createArrayOfEMailAddress() {
        return new ArrayOfEMailAddress();
    }

    /**
     * Create an instance of {@link GenericLineFeature }
     * 
     */
    public GenericLineFeature createGenericLineFeature() {
        return new GenericLineFeature();
    }

    /**
     * Create an instance of {@link ArrayOfString9 }
     * 
     */
    public ArrayOfString9 createArrayOfString9() {
        return new ArrayOfString9();
    }

    /**
     * Create an instance of {@link GetCustomerByHomePhone }
     * 
     */
    public GetCustomerByHomePhone createGetCustomerByHomePhone() {
        return new GetCustomerByHomePhone();
    }

    /**
     * Create an instance of {@link GetMetersBySearchStringResponse }
     * 
     */
    public GetMetersBySearchStringResponse createGetMetersBySearchStringResponse() {
        return new GetMetersBySearchStringResponse();
    }

    /**
     * Create an instance of {@link CDDeviceExchange }
     * 
     */
    public CDDeviceExchange createCDDeviceExchange() {
        return new CDDeviceExchange();
    }

    /**
     * Create an instance of {@link LoadManagementDevice }
     * 
     */
    public LoadManagementDevice createLoadManagementDevice() {
        return new LoadManagementDevice();
    }

    /**
     * Create an instance of {@link ComplexVoltage }
     * 
     */
    public ComplexVoltage createComplexVoltage() {
        return new ComplexVoltage();
    }

    /**
     * Create an instance of {@link Observation }
     * 
     */
    public Observation createObservation() {
        return new Observation();
    }

    /**
     * Create an instance of {@link GetConvenienceFeesResponse }
     * 
     */
    public GetConvenienceFeesResponse createGetConvenienceFeesResponse() {
        return new GetConvenienceFeesResponse();
    }

    /**
     * Create an instance of {@link GetModifiedPolesFromCBResponse }
     * 
     */
    public GetModifiedPolesFromCBResponse createGetModifiedPolesFromCBResponse() {
        return new GetModifiedPolesFromCBResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCH }
     * 
     */
    public ArrayOfCH createArrayOfCH() {
        return new ArrayOfCH();
    }

    /**
     * Create an instance of {@link CustomersAttachedToDevice }
     * 
     */
    public CustomersAttachedToDevice createCustomersAttachedToDevice() {
        return new CustomersAttachedToDevice();
    }

    /**
     * Create an instance of {@link DomainMembersChangedNotification }
     * 
     */
    public DomainMembersChangedNotification createDomainMembersChangedNotification() {
        return new DomainMembersChangedNotification();
    }

    /**
     * Create an instance of {@link GetServiceOrdersByStatusResponse }
     * 
     */
    public GetServiceOrdersByStatusResponse createGetServiceOrdersByStatusResponse() {
        return new GetServiceOrdersByStatusResponse();
    }

    /**
     * Create an instance of {@link GetMetersBySiteID }
     * 
     */
    public GetMetersBySiteID createGetMetersBySiteID() {
        return new GetMetersBySiteID();
    }

    /**
     * Create an instance of {@link ArrayOfTaskListItem }
     * 
     */
    public ArrayOfTaskListItem createArrayOfTaskListItem() {
        return new ArrayOfTaskListItem();
    }

    /**
     * Create an instance of {@link MeterTestNotification }
     * 
     */
    public MeterTestNotification createMeterTestNotification() {
        return new MeterTestNotification();
    }

    /**
     * Create an instance of {@link CumulativeDrop }
     * 
     */
    public CumulativeDrop createCumulativeDrop() {
        return new CumulativeDrop();
    }

    /**
     * Create an instance of {@link MeterConnectivity }
     * 
     */
    public MeterConnectivity createMeterConnectivity() {
        return new MeterConnectivity();
    }

    /**
     * Create an instance of {@link ElectricLocationFields }
     * 
     */
    public ElectricLocationFields createElectricLocationFields() {
        return new ElectricLocationFields();
    }

    /**
     * Create an instance of {@link TaskListItem }
     * 
     */
    public TaskListItem createTaskListItem() {
        return new TaskListItem();
    }

    /**
     * Create an instance of {@link ArrayOfString15 }
     * 
     */
    public ArrayOfString15 createArrayOfString15() {
        return new ArrayOfString15();
    }

    /**
     * Create an instance of {@link ChargeableDevice }
     * 
     */
    public ChargeableDevice createChargeableDevice() {
        return new ChargeableDevice();
    }

    /**
     * Create an instance of {@link GetIHDGroupNamesResponse }
     * 
     */
    public GetIHDGroupNamesResponse createGetIHDGroupNamesResponse() {
        return new GetIHDGroupNamesResponse();
    }

    /**
     * Create an instance of {@link ConductorSize }
     * 
     */
    public ConductorSize createConductorSize() {
        return new ConductorSize();
    }

    /**
     * Create an instance of {@link RequestRegistrationID }
     * 
     */
    public RequestRegistrationID createRequestRegistrationID() {
        return new RequestRegistrationID();
    }

    /**
     * Create an instance of {@link GetMeterByServiceLocationIDResponse }
     * 
     */
    public GetMeterByServiceLocationIDResponse createGetMeterByServiceLocationIDResponse() {
        return new GetMeterByServiceLocationIDResponse();
    }

    /**
     * Create an instance of {@link Transformer }
     * 
     */
    public Transformer createTransformer() {
        return new Transformer();
    }

    /**
     * Create an instance of {@link GetServiceLocationByMeterID }
     * 
     */
    public GetServiceLocationByMeterID createGetServiceLocationByMeterID() {
        return new GetServiceLocationByMeterID();
    }

    /**
     * Create an instance of {@link Network }
     * 
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link ArrayOfGasMeter1 }
     * 
     */
    public ArrayOfGasMeter1 createArrayOfGasMeter1() {
        return new ArrayOfGasMeter1();
    }

    /**
     * Create an instance of {@link ArrayOfCDCustomer }
     * 
     */
    public ArrayOfCDCustomer createArrayOfCDCustomer() {
        return new ArrayOfCDCustomer();
    }

    /**
     * Create an instance of {@link GetAllPolesFromCB }
     * 
     */
    public GetAllPolesFromCB createGetAllPolesFromCB() {
        return new GetAllPolesFromCB();
    }

    /**
     * Create an instance of {@link AddressItem }
     * 
     */
    public AddressItem createAddressItem() {
        return new AddressItem();
    }

    /**
     * Create an instance of {@link UsageMonitoringNotification }
     * 
     */
    public UsageMonitoringNotification createUsageMonitoringNotification() {
        return new UsageMonitoringNotification();
    }

    /**
     * Create an instance of {@link LoadSection }
     * 
     */
    public LoadSection createLoadSection() {
        return new LoadSection();
    }

    /**
     * Create an instance of {@link ArrayOfOutageReportingCode }
     * 
     */
    public ArrayOfOutageReportingCode createArrayOfOutageReportingCode() {
        return new ArrayOfOutageReportingCode();
    }

    /**
     * Create an instance of {@link OutageCustomer }
     * 
     */
    public OutageCustomer createOutageCustomer() {
        return new OutageCustomer();
    }

    /**
     * Create an instance of {@link SecondaryJunctionBox }
     * 
     */
    public SecondaryJunctionBox createSecondaryJunctionBox() {
        return new SecondaryJunctionBox();
    }

    /**
     * Create an instance of {@link ChargeItem }
     * 
     */
    public ChargeItem createChargeItem() {
        return new ChargeItem();
    }

    /**
     * Create an instance of {@link CDDeviceExchangeNotification }
     * 
     */
    public CDDeviceExchangeNotification createCDDeviceExchangeNotification() {
        return new CDDeviceExchangeNotification();
    }

    /**
     * Create an instance of {@link RegistrationInfo }
     * 
     */
    public RegistrationInfo createRegistrationInfo() {
        return new RegistrationInfo();
    }

    /**
     * Create an instance of {@link CDDeviceInstalledNotificationResponse }
     * 
     */
    public CDDeviceInstalledNotificationResponse createCDDeviceInstalledNotificationResponse() {
        return new CDDeviceInstalledNotificationResponse();
    }

    /**
     * Create an instance of {@link GetServiceLocationIDByMeterResponse }
     * 
     */
    public GetServiceLocationIDByMeterResponse createGetServiceLocationIDByMeterResponse() {
        return new GetServiceLocationIDByMeterResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link MeterTest }
     * 
     */
    public MeterTest createMeterTest() {
        return new MeterTest();
    }

    /**
     * Create an instance of {@link ConductorEntry }
     * 
     */
    public ConductorEntry createConductorEntry() {
        return new ConductorEntry();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link PaymentExtension }
     * 
     */
    public PaymentExtension createPaymentExtension() {
        return new PaymentExtension();
    }

    /**
     * Create an instance of {@link ArrayOfFeederObject }
     * 
     */
    public ArrayOfFeederObject createArrayOfFeederObject() {
        return new ArrayOfFeederObject();
    }

    /**
     * Create an instance of {@link Assembly }
     * 
     */
    public Assembly createAssembly() {
        return new Assembly();
    }

    /**
     * Create an instance of {@link CimTimePoints }
     * 
     */
    public CimTimePoints createCimTimePoints() {
        return new CimTimePoints();
    }

    /**
     * Create an instance of {@link ConfiguredReadingType }
     * 
     */
    public ConfiguredReadingType createConfiguredReadingType() {
        return new ConfiguredReadingType();
    }

    /**
     * Create an instance of {@link Anchor }
     * 
     */
    public Anchor createAnchor() {
        return new Anchor();
    }

    /**
     * Create an instance of {@link MeterBaseExchangeNotification }
     * 
     */
    public MeterBaseExchangeNotification createMeterBaseExchangeNotification() {
        return new MeterBaseExchangeNotification();
    }

    /**
     * Create an instance of {@link GetServiceOrdersByServiceLocation }
     * 
     */
    public GetServiceOrdersByServiceLocation createGetServiceOrdersByServiceLocation() {
        return new GetServiceOrdersByServiceLocation();
    }

    /**
     * Create an instance of {@link PropaneMeter }
     * 
     */
    public PropaneMeter createPropaneMeter() {
        return new PropaneMeter();
    }

    /**
     * Create an instance of {@link ArrayOfCircuit }
     * 
     */
    public ArrayOfCircuit createArrayOfCircuit() {
        return new ArrayOfCircuit();
    }

    /**
     * Create an instance of {@link Worker }
     * 
     */
    public Worker createWorker() {
        return new Worker();
    }

    /**
     * Create an instance of {@link ProcessPaymentTransactionResponse }
     * 
     */
    public ProcessPaymentTransactionResponse createProcessPaymentTransactionResponse() {
        return new ProcessPaymentTransactionResponse();
    }

    /**
     * Create an instance of {@link GetPPMBalanceAdjustmentsResponse }
     * 
     */
    public GetPPMBalanceAdjustmentsResponse createGetPPMBalanceAdjustmentsResponse() {
        return new GetPPMBalanceAdjustmentsResponse();
    }

    /**
     * Create an instance of {@link GetMetersBySiteIDResponse }
     * 
     */
    public GetMetersBySiteIDResponse createGetMetersBySiteIDResponse() {
        return new GetMetersBySiteIDResponse();
    }

    /**
     * Create an instance of {@link AVLLog }
     * 
     */
    public AVLLog createAVLLog() {
        return new AVLLog();
    }

    /**
     * Create an instance of {@link ArrayOfVoltageAlarmItem }
     * 
     */
    public ArrayOfVoltageAlarmItem createArrayOfVoltageAlarmItem() {
        return new ArrayOfVoltageAlarmItem();
    }

    /**
     * Create an instance of {@link ECheckPayment }
     * 
     */
    public ECheckPayment createECheckPayment() {
        return new ECheckPayment();
    }

    /**
     * Create an instance of {@link AVLPosition }
     * 
     */
    public AVLPosition createAVLPosition() {
        return new AVLPosition();
    }

    /**
     * Create an instance of {@link TaskListNotificationResponse }
     * 
     */
    public TaskListNotificationResponse createTaskListNotificationResponse() {
        return new TaskListNotificationResponse();
    }

    /**
     * Create an instance of {@link CapacitancePerUnitLength }
     * 
     */
    public CapacitancePerUnitLength createCapacitancePerUnitLength() {
        return new CapacitancePerUnitLength();
    }

    /**
     * Create an instance of {@link ArrayOfAdjustmentItem }
     * 
     */
    public ArrayOfAdjustmentItem createArrayOfAdjustmentItem() {
        return new ArrayOfAdjustmentItem();
    }

    /**
     * Create an instance of {@link OutageReason }
     * 
     */
    public OutageReason createOutageReason() {
        return new OutageReason();
    }

    /**
     * Create an instance of {@link OtherMeter }
     * 
     */
    public OtherMeter createOtherMeter() {
        return new OtherMeter();
    }

    /**
     * Create an instance of {@link MaterialComponent }
     * 
     */
    public MaterialComponent createMaterialComponent() {
        return new MaterialComponent();
    }

    /**
     * Create an instance of {@link GetAllTransformerBanksFromCBResponse }
     * 
     */
    public GetAllTransformerBanksFromCBResponse createGetAllTransformerBanksFromCBResponse() {
        return new GetAllTransformerBanksFromCBResponse();
    }

    /**
     * Create an instance of {@link AVLState }
     * 
     */
    public AVLState createAVLState() {
        return new AVLState();
    }

    /**
     * Create an instance of {@link Odometer }
     * 
     */
    public Odometer createOdometer() {
        return new Odometer();
    }

    /**
     * Create an instance of {@link Constraints }
     * 
     */
    public Constraints createConstraints() {
        return new Constraints();
    }

    /**
     * Create an instance of {@link ModifyCBDataForStreetLightResponse }
     * 
     */
    public ModifyCBDataForStreetLightResponse createModifyCBDataForStreetLightResponse() {
        return new ModifyCBDataForStreetLightResponse();
    }

    /**
     * Create an instance of {@link Load }
     * 
     */
    public Load createLoad() {
        return new Load();
    }

    /**
     * Create an instance of {@link GetAllPropaneMetersResponse }
     * 
     */
    public GetAllPropaneMetersResponse createGetAllPropaneMetersResponse() {
        return new GetAllPropaneMetersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWindingPair }
     * 
     */
    public ArrayOfWindingPair createArrayOfWindingPair() {
        return new ArrayOfWindingPair();
    }

    /**
     * Create an instance of {@link Meters }
     * 
     */
    public Meters createMeters() {
        return new Meters();
    }

    /**
     * Create an instance of {@link GasService }
     * 
     */
    public GasService createGasService() {
        return new GasService();
    }

    /**
     * Create an instance of {@link GetBilledUsageResponse }
     * 
     */
    public GetBilledUsageResponse createGetBilledUsageResponse() {
        return new GetBilledUsageResponse();
    }

    /**
     * Create an instance of {@link WriteAccountHistoryCommentsResponse }
     * 
     */
    public WriteAccountHistoryCommentsResponse createWriteAccountHistoryCommentsResponse() {
        return new WriteAccountHistoryCommentsResponse();
    }

    /**
     * Create an instance of {@link ReadingScheduleResultNotificationResponse }
     * 
     */
    public ReadingScheduleResultNotificationResponse createReadingScheduleResultNotificationResponse() {
        return new ReadingScheduleResultNotificationResponse();
    }

    /**
     * Create an instance of {@link GetMeterGroupNamesByMeterID }
     * 
     */
    public GetMeterGroupNamesByMeterID createGetMeterGroupNamesByMeterID() {
        return new GetMeterGroupNamesByMeterID();
    }

    /**
     * Create an instance of {@link Temperature }
     * 
     */
    public Temperature createTemperature() {
        return new Temperature();
    }

    /**
     * Create an instance of {@link UnregisterForServiceResponse }
     * 
     */
    public UnregisterForServiceResponse createUnregisterForServiceResponse() {
        return new UnregisterForServiceResponse();
    }

    /**
     * Create an instance of {@link AssetHistoryEvent }
     * 
     */
    public AssetHistoryEvent createAssetHistoryEvent() {
        return new AssetHistoryEvent();
    }

    /**
     * Create an instance of {@link Capability }
     * 
     */
    public Capability createCapability() {
        return new Capability();
    }

    /**
     * Create an instance of {@link PropaneMeterExchange }
     * 
     */
    public PropaneMeterExchange createPropaneMeterExchange() {
        return new PropaneMeterExchange();
    }

    /**
     * Create an instance of {@link CDStateChangedNotificationResponse }
     * 
     */
    public CDStateChangedNotificationResponse createCDStateChangedNotificationResponse() {
        return new CDStateChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link GetWaterMetersByAccountNumberResponse }
     * 
     */
    public GetWaterMetersByAccountNumberResponse createGetWaterMetersByAccountNumberResponse() {
        return new GetWaterMetersByAccountNumberResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByDBAName }
     * 
     */
    public GetCustomerByDBAName createGetCustomerByDBAName() {
        return new GetCustomerByDBAName();
    }

    /**
     * Create an instance of {@link ElectricMeter }
     * 
     */
    public ElectricMeter createElectricMeter() {
        return new ElectricMeter();
    }

    /**
     * Create an instance of {@link Substation }
     * 
     */
    public Substation createSubstation() {
        return new Substation();
    }

    /**
     * Create an instance of {@link TimeToCall }
     * 
     */
    public TimeToCall createTimeToCall() {
        return new TimeToCall();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link Clearance }
     * 
     */
    public Clearance createClearance() {
        return new Clearance();
    }

    /**
     * Create an instance of {@link Winding }
     * 
     */
    public Winding createWinding() {
        return new Winding();
    }

    /**
     * Create an instance of {@link AssignmentNotificationResponse }
     * 
     */
    public AssignmentNotificationResponse createAssignmentNotificationResponse() {
        return new AssignmentNotificationResponse();
    }

    /**
     * Create an instance of {@link TaskAggregation }
     * 
     */
    public TaskAggregation createTaskAggregation() {
        return new TaskAggregation();
    }

    /**
     * Create an instance of {@link ArrayOfSwitchingDevice }
     * 
     */
    public ArrayOfSwitchingDevice createArrayOfSwitchingDevice() {
        return new ArrayOfSwitchingDevice();
    }

    /**
     * Create an instance of {@link SwitchingStep }
     * 
     */
    public SwitchingStep createSwitchingStep() {
        return new SwitchingStep();
    }

    /**
     * Create an instance of {@link GetServiceOrdersByStatus }
     * 
     */
    public GetServiceOrdersByStatus createGetServiceOrdersByStatus() {
        return new GetServiceOrdersByStatus();
    }

    /**
     * Create an instance of {@link GetPPMCustomer }
     * 
     */
    public GetPPMCustomer createGetPPMCustomer() {
        return new GetPPMCustomer();
    }

    /**
     * Create an instance of {@link ArrayOfReceivedElectricMeter }
     * 
     */
    public ArrayOfReceivedElectricMeter createArrayOfReceivedElectricMeter() {
        return new ArrayOfReceivedElectricMeter();
    }

    /**
     * Create an instance of {@link ArrayOfBillingData }
     * 
     */
    public ArrayOfBillingData createArrayOfBillingData() {
        return new ArrayOfBillingData();
    }

    /**
     * Create an instance of {@link ArrayOfWaterMeter1 }
     * 
     */
    public ArrayOfWaterMeter1 createArrayOfWaterMeter1() {
        return new ArrayOfWaterMeter1();
    }

    /**
     * Create an instance of {@link MeterBaseExchangeNotificationResponse }
     * 
     */
    public MeterBaseExchangeNotificationResponse createMeterBaseExchangeNotificationResponse() {
        return new MeterBaseExchangeNotificationResponse();
    }

    /**
     * Create an instance of {@link CIMObjectList }
     * 
     */
    public CIMObjectList createCIMObjectList() {
        return new CIMObjectList();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link Sectionalizer }
     * 
     */
    public Sectionalizer createSectionalizer() {
        return new Sectionalizer();
    }

    /**
     * Create an instance of {@link ModifyCBDataForMetersResponse }
     * 
     */
    public ModifyCBDataForMetersResponse createModifyCBDataForMetersResponse() {
        return new ModifyCBDataForMetersResponse();
    }

    /**
     * Create an instance of {@link OutageEventStatus }
     * 
     */
    public OutageEventStatus createOutageEventStatus() {
        return new OutageEventStatus();
    }

    /**
     * Create an instance of {@link GetPayableItemsList }
     * 
     */
    public GetPayableItemsList createGetPayableItemsList() {
        return new GetPayableItemsList();
    }

    /**
     * Create an instance of {@link CDStatesChangedNotification }
     * 
     */
    public CDStatesChangedNotification createCDStatesChangedNotification() {
        return new CDStatesChangedNotification();
    }

    /**
     * Create an instance of {@link ArrayOfCDDevice1 }
     * 
     */
    public ArrayOfCDDevice1 createArrayOfCDDevice1() {
        return new ArrayOfCDDevice1();
    }

    /**
     * Create an instance of {@link ZsmImpedanceEntry }
     * 
     */
    public ZsmImpedanceEntry createZsmImpedanceEntry() {
        return new ZsmImpedanceEntry();
    }

    /**
     * Create an instance of {@link ReactivePower }
     * 
     */
    public ReactivePower createReactivePower() {
        return new ReactivePower();
    }

    /**
     * Create an instance of {@link GetMetersByEALocation }
     * 
     */
    public GetMetersByEALocation createGetMetersByEALocation() {
        return new GetMetersByEALocation();
    }

    /**
     * Create an instance of {@link MeterEvent }
     * 
     */
    public MeterEvent createMeterEvent() {
        return new MeterEvent();
    }

    /**
     * Create an instance of {@link ReceivedPropaneMeter }
     * 
     */
    public ReceivedPropaneMeter createReceivedPropaneMeter() {
        return new ReceivedPropaneMeter();
    }

    /**
     * Create an instance of {@link Parcel }
     * 
     */
    public Parcel createParcel() {
        return new Parcel();
    }

    /**
     * Create an instance of {@link SpatialFeatureGroup }
     * 
     */
    public SpatialFeatureGroup createSpatialFeatureGroup() {
        return new SpatialFeatureGroup();
    }

    /**
     * Create an instance of {@link ConvenienceFeeList }
     * 
     */
    public ConvenienceFeeList createConvenienceFeeList() {
        return new ConvenienceFeeList();
    }

    /**
     * Create an instance of {@link GetUsageByServiceLocationIDResponse }
     * 
     */
    public GetUsageByServiceLocationIDResponse createGetUsageByServiceLocationIDResponse() {
        return new GetUsageByServiceLocationIDResponse();
    }

    /**
     * Create an instance of {@link GetDomainMembersResponse }
     * 
     */
    public GetDomainMembersResponse createGetDomainMembersResponse() {
        return new GetDomainMembersResponse();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link ArrayOfCDState }
     * 
     */
    public ArrayOfCDState createArrayOfCDState() {
        return new ArrayOfCDState();
    }

    /**
     * Create an instance of {@link Conductance }
     * 
     */
    public Conductance createConductance() {
        return new Conductance();
    }

    /**
     * Create an instance of {@link GetPropaneMetersByAccountNumber }
     * 
     */
    public GetPropaneMetersByAccountNumber createGetPropaneMetersByAccountNumber() {
        return new GetPropaneMetersByAccountNumber();
    }

    /**
     * Create an instance of {@link ServiceDropEntry }
     * 
     */
    public ServiceDropEntry createServiceDropEntry() {
        return new ServiceDropEntry();
    }

    /**
     * Create an instance of {@link MeterEventNotificationResponse }
     * 
     */
    public MeterEventNotificationResponse createMeterEventNotificationResponse() {
        return new MeterEventNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAssembly }
     * 
     */
    public ArrayOfAssembly createArrayOfAssembly() {
        return new ArrayOfAssembly();
    }

    /**
     * Create an instance of {@link GasLocationFields }
     * 
     */
    public GasLocationFields createGasLocationFields() {
        return new GasLocationFields();
    }

    /**
     * Create an instance of {@link CDState }
     * 
     */
    public CDState createCDState() {
        return new CDState();
    }

    /**
     * Create an instance of {@link SwitchingOrderChangedNotification }
     * 
     */
    public SwitchingOrderChangedNotification createSwitchingOrderChangedNotification() {
        return new SwitchingOrderChangedNotification();
    }

    /**
     * Create an instance of {@link GetUsageByAccountNumber }
     * 
     */
    public GetUsageByAccountNumber createGetUsageByAccountNumber() {
        return new GetUsageByAccountNumber();
    }

    /**
     * Create an instance of {@link ReadingChangedNotification }
     * 
     */
    public ReadingChangedNotification createReadingChangedNotification() {
        return new ReadingChangedNotification();
    }

    /**
     * Create an instance of {@link DB }
     * 
     */
    public DB createDB() {
        return new DB();
    }

    /**
     * Create an instance of {@link ProcessPaymentTransaction }
     * 
     */
    public ProcessPaymentTransaction createProcessPaymentTransaction() {
        return new ProcessPaymentTransaction();
    }

    /**
     * Create an instance of {@link InHomeDisplayExchangeNotification }
     * 
     */
    public InHomeDisplayExchangeNotification createInHomeDisplayExchangeNotification() {
        return new InHomeDisplayExchangeNotification();
    }

    /**
     * Create an instance of {@link UnregisterForService }
     * 
     */
    public UnregisterForService createUnregisterForService() {
        return new UnregisterForService();
    }

    /**
     * Create an instance of {@link OhPrimaryLine }
     * 
     */
    public OhPrimaryLine createOhPrimaryLine() {
        return new OhPrimaryLine();
    }

    /**
     * Create an instance of {@link DomainMember }
     * 
     */
    public DomainMember createDomainMember() {
        return new DomainMember();
    }

    /**
     * Create an instance of {@link GetMeterGroupMembersResponse }
     * 
     */
    public GetMeterGroupMembersResponse createGetMeterGroupMembersResponse() {
        return new GetMeterGroupMembersResponse();
    }

    /**
     * Create an instance of {@link PaymentExtensionList }
     * 
     */
    public PaymentExtensionList createPaymentExtensionList() {
        return new PaymentExtensionList();
    }

    /**
     * Create an instance of {@link InductionMachine }
     * 
     */
    public InductionMachine createInductionMachine() {
        return new InductionMachine();
    }

    /**
     * Create an instance of {@link CDStatesNotificationResponse }
     * 
     */
    public CDStatesNotificationResponse createCDStatesNotificationResponse() {
        return new CDStatesNotificationResponse();
    }

    /**
     * Create an instance of {@link GetAllServiceLocationsByServiceType }
     * 
     */
    public GetAllServiceLocationsByServiceType createGetAllServiceLocationsByServiceType() {
        return new GetAllServiceLocationsByServiceType();
    }

    /**
     * Create an instance of {@link GetServiceLocationByMeterIDResponse }
     * 
     */
    public GetServiceLocationByMeterIDResponse createGetServiceLocationByMeterIDResponse() {
        return new GetServiceLocationByMeterIDResponse();
    }

    /**
     * Create an instance of {@link ReadingTypeCode }
     * 
     */
    public ReadingTypeCode createReadingTypeCode() {
        return new ReadingTypeCode();
    }

    /**
     * Create an instance of {@link ConvenienceFeeItem }
     * 
     */
    public ConvenienceFeeItem createConvenienceFeeItem() {
        return new ConvenienceFeeItem();
    }

    /**
     * Create an instance of {@link ArrayOfChargeItem }
     * 
     */
    public ArrayOfChargeItem createArrayOfChargeItem() {
        return new ArrayOfChargeItem();
    }

    /**
     * Create an instance of {@link ArrayOfInHomeDisplay }
     * 
     */
    public ArrayOfInHomeDisplay createArrayOfInHomeDisplay() {
        return new ArrayOfInHomeDisplay();
    }

    /**
     * Create an instance of {@link ArrayOfElectricMeter }
     * 
     */
    public ArrayOfElectricMeter createArrayOfElectricMeter() {
        return new ArrayOfElectricMeter();
    }

    /**
     * Create an instance of {@link CoincidentalValue }
     * 
     */
    public CoincidentalValue createCoincidentalValue() {
        return new CoincidentalValue();
    }

    /**
     * Create an instance of {@link RecloserEntry }
     * 
     */
    public RecloserEntry createRecloserEntry() {
        return new RecloserEntry();
    }

    /**
     * Create an instance of {@link ArrayOfIntervalBlock }
     * 
     */
    public ArrayOfIntervalBlock createArrayOfIntervalBlock() {
        return new ArrayOfIntervalBlock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSpeakMsgHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "MultiSpeakMsgHeader")
    public JAXBElement<MultiSpeakMsgHeader> createMultiSpeakMsgHeader(MultiSpeakMsgHeader value) {
        return new JAXBElement<MultiSpeakMsgHeader>(_MultiSpeakMsgHeader_QNAME, MultiSpeakMsgHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "configChanged", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusConfigChanged(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusConfigChanged_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "manuallyEntered", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusManuallyEntered(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusManuallyEntered_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "recorderStopped", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusRecorderStopped(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusRecorderStopped_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "partialInterval", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusPartialInterval(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusPartialInterval_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "testData", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusTestData(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusTestData_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "DSTinEffect", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusDSTinEffect(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusDSTinEffect_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "clockForward", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusClockForward(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusClockForward_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "longInterval", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusLongInterval(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusLongInterval_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "clockBackward", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusClockBackward(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusClockBackward_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "manuallyModified", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusManuallyModified(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusManuallyModified_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "invalid", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusInvalid(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusInvalid_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "overflow", scope = BlockStatus.class)
    public JAXBElement<Boolean> createBlockStatusOverflow(Boolean value) {
        return new JAXBElement<Boolean>(_BlockStatusOverflow_QNAME, Boolean.class, BlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoadManagementDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedLoadManagementDevices", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfLoadManagementDevice> createEndDeviceShipmentReceivedLoadManagementDevices(ArrayOfLoadManagementDevice value) {
        return new JAXBElement<ArrayOfLoadManagementDevice>(_EndDeviceShipmentReceivedLoadManagementDevices_QNAME, ArrayOfLoadManagementDevice.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReceivedElectricMeter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedElectricMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfReceivedElectricMeter> createEndDeviceShipmentReceivedElectricMeters(ArrayOfReceivedElectricMeter value) {
        return new JAXBElement<ArrayOfReceivedElectricMeter>(_EndDeviceShipmentReceivedElectricMeters_QNAME, ArrayOfReceivedElectricMeter.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCDDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedCDDevices", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfCDDevice> createEndDeviceShipmentReceivedCDDevices(ArrayOfCDDevice value) {
        return new JAXBElement<ArrayOfCDDevice>(_EndDeviceShipmentReceivedCDDevices_QNAME, ArrayOfCDDevice.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReceivedPropaneMeter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedPropaneMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfReceivedPropaneMeter> createEndDeviceShipmentReceivedPropaneMeters(ArrayOfReceivedPropaneMeter value) {
        return new JAXBElement<ArrayOfReceivedPropaneMeter>(_EndDeviceShipmentReceivedPropaneMeters_QNAME, ArrayOfReceivedPropaneMeter.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "utility", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentUtility(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentUtility_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReceivedGasMeter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedGasMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfReceivedGasMeter> createEndDeviceShipmentReceivedGasMeters(ArrayOfReceivedGasMeter value) {
        return new JAXBElement<ArrayOfReceivedGasMeter>(_EndDeviceShipmentReceivedGasMeters_QNAME, ArrayOfReceivedGasMeter.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReceivedWaterMeter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedWaterMeters", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfReceivedWaterMeter> createEndDeviceShipmentReceivedWaterMeters(ArrayOfReceivedWaterMeter value) {
        return new JAXBElement<ArrayOfReceivedWaterMeter>(_EndDeviceShipmentReceivedWaterMeters_QNAME, ArrayOfReceivedWaterMeter.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "manufacturer", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentManufacturer(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentManufacturer_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "poReferenceNumber", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentPoReferenceNumber(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentPoReferenceNumber_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransponderIDRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "transponderIDRange", scope = EndDeviceShipment.class)
    public JAXBElement<TransponderIDRange> createEndDeviceShipmentTransponderIDRange(TransponderIDRange value) {
        return new JAXBElement<TransponderIDRange>(_EndDeviceShipmentTransponderIDRange_QNAME, TransponderIDRange.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedDate", scope = EndDeviceShipment.class)
    public JAXBElement<XMLGregorianCalendar> createEndDeviceShipmentReceivedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDeviceShipmentReceivedDate_QNAME, XMLGregorianCalendar.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "shippingTicketNumber", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentShippingTicketNumber(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentShippingTicketNumber_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "recipient", scope = EndDeviceShipment.class)
    public JAXBElement<String> createEndDeviceShipmentRecipient(String value) {
        return new JAXBElement<String>(_EndDeviceShipmentRecipient_QNAME, String.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "shippedToAddress", scope = EndDeviceShipment.class)
    public JAXBElement<Address> createEndDeviceShipmentShippedToAddress(Address value) {
        return new JAXBElement<Address>(_EndDeviceShipmentShippedToAddress_QNAME, Address.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "receivedModules", scope = EndDeviceShipment.class)
    public JAXBElement<ArrayOfModule> createEndDeviceShipmentReceivedModules(ArrayOfModule value) {
        return new JAXBElement<ArrayOfModule>(_EndDeviceShipmentReceivedModules_QNAME, ArrayOfModule.class, EndDeviceShipment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_4.1_Release", name = "shippedDate", scope = EndDeviceShipment.class)
    public JAXBElement<XMLGregorianCalendar> createEndDeviceShipmentShippedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDeviceShipmentShippedDate_QNAME, XMLGregorianCalendar.class, EndDeviceShipment.class, value);
    }

}
