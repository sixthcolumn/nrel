
package org.multispeak.version_3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.multispeak.version_3 package. 
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

    private final static QName _MspConnectivityPointParentSectionID_QNAME = new QName("http://www.multispeak.org/Version_3.0", "parentSectionID");
    private final static QName _MspConnectivityPointSectionID_QNAME = new QName("http://www.multispeak.org/Version_3.0", "sectionID");
    private final static QName _MspConnectivityPointToNodeID_QNAME = new QName("http://www.multispeak.org/Version_3.0", "toNodeID");
    private final static QName _MspConnectivityPointFromNodeID_QNAME = new QName("http://www.multispeak.org/Version_3.0", "fromNodeID");
    private final static QName _MultiSpeakMsgHeader_QNAME = new QName("http://www.multispeak.org/Version_3.0", "MultiSpeakMsgHeader");
    private final static QName _StatusManuallyModified_QNAME = new QName("http://www.multispeak.org/Version_3.0", "manuallyModified");
    private final static QName _StatusClockBackward_QNAME = new QName("http://www.multispeak.org/Version_3.0", "clockBackward");
    private final static QName _StatusClockForward_QNAME = new QName("http://www.multispeak.org/Version_3.0", "clockForward");
    private final static QName _StatusLongInterval_QNAME = new QName("http://www.multispeak.org/Version_3.0", "longInterval");
    private final static QName _StatusOverflow_QNAME = new QName("http://www.multispeak.org/Version_3.0", "overflow");
    private final static QName _StatusInvalid_QNAME = new QName("http://www.multispeak.org/Version_3.0", "invalid");
    private final static QName _StatusConfigChanged_QNAME = new QName("http://www.multispeak.org/Version_3.0", "configChanged");
    private final static QName _StatusManuallyEntered_QNAME = new QName("http://www.multispeak.org/Version_3.0", "manuallyEntered");
    private final static QName _StatusDSTinEffect_QNAME = new QName("http://www.multispeak.org/Version_3.0", "DSTinEffect");
    private final static QName _StatusTestData_QNAME = new QName("http://www.multispeak.org/Version_3.0", "testData");
    private final static QName _StatusRecorderStopped_QNAME = new QName("http://www.multispeak.org/Version_3.0", "recorderStopped");
    private final static QName _StatusPartialInterval_QNAME = new QName("http://www.multispeak.org/Version_3.0", "partialInterval");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.multispeak.version_3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PingURL }
     * 
     */
    public PingURL createPingURL() {
        return new PingURL();
    }

    /**
     * Create an instance of {@link ArrayOfMaterialComponent }
     * 
     */
    public ArrayOfMaterialComponent createArrayOfMaterialComponent() {
        return new ArrayOfMaterialComponent();
    }

    /**
     * Create an instance of {@link AffectedMeters }
     * 
     */
    public AffectedMeters createAffectedMeters() {
        return new AffectedMeters();
    }

    /**
     * Create an instance of {@link ArrayOfGenericAnnotationFeature }
     * 
     */
    public ArrayOfGenericAnnotationFeature createArrayOfGenericAnnotationFeature() {
        return new ArrayOfGenericAnnotationFeature();
    }

    /**
     * Create an instance of {@link ExtensionsList }
     * 
     */
    public ExtensionsList createExtensionsList() {
        return new ExtensionsList();
    }

    /**
     * Create an instance of {@link GetModifiedCircuitElements }
     * 
     */
    public GetModifiedCircuitElements createGetModifiedCircuitElements() {
        return new GetModifiedCircuitElements();
    }

    /**
     * Create an instance of {@link AffectedMeter }
     * 
     */
    public AffectedMeter createAffectedMeter() {
        return new AffectedMeter();
    }

    /**
     * Create an instance of {@link GenericPointFeature }
     * 
     */
    public GenericPointFeature createGenericPointFeature() {
        return new GenericPointFeature();
    }

    /**
     * Create an instance of {@link ArrayOfMeterReading }
     * 
     */
    public ArrayOfMeterReading createArrayOfMeterReading() {
        return new ArrayOfMeterReading();
    }

    /**
     * Create an instance of {@link GetDomainNamesResponse }
     * 
     */
    public GetDomainNamesResponse createGetDomainNamesResponse() {
        return new GetDomainNamesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStation }
     * 
     */
    public ArrayOfStation createArrayOfStation() {
        return new ArrayOfStation();
    }

    /**
     * Create an instance of {@link CapacitorBank }
     * 
     */
    public CapacitorBank createCapacitorBank() {
        return new CapacitorBank();
    }

    /**
     * Create an instance of {@link MeterReadReadingValues }
     * 
     */
    public MeterReadReadingValues createMeterReadReadingValues() {
        return new MeterReadReadingValues();
    }

    /**
     * Create an instance of {@link GetSiblingMeterConnectivity }
     * 
     */
    public GetSiblingMeterConnectivity createGetSiblingMeterConnectivity() {
        return new GetSiblingMeterConnectivity();
    }

    /**
     * Create an instance of {@link GetSubstationNames }
     * 
     */
    public GetSubstationNames createGetSubstationNames() {
        return new GetSubstationNames();
    }

    /**
     * Create an instance of {@link PrimaryCabinet }
     * 
     */
    public PrimaryCabinet createPrimaryCabinet() {
        return new PrimaryCabinet();
    }

    /**
     * Create an instance of {@link UtilityInfo }
     * 
     */
    public UtilityInfo createUtilityInfo() {
        return new UtilityInfo();
    }

    /**
     * Create an instance of {@link GetOutageEventStatusResponse }
     * 
     */
    public GetOutageEventStatusResponse createGetOutageEventStatusResponse() {
        return new GetOutageEventStatusResponse();
    }

    /**
     * Create an instance of {@link CallBackList }
     * 
     */
    public CallBackList createCallBackList() {
        return new CallBackList();
    }

    /**
     * Create an instance of {@link ArrayOfConductor }
     * 
     */
    public ArrayOfConductor createArrayOfConductor() {
        return new ArrayOfConductor();
    }

    /**
     * Create an instance of {@link OutageEvent }
     * 
     */
    public OutageEvent createOutageEvent() {
        return new OutageEvent();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link MaterialManagementAssembly }
     * 
     */
    public MaterialManagementAssembly createMaterialManagementAssembly() {
        return new MaterialManagementAssembly();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link ArrayOfUsageInstance }
     * 
     */
    public ArrayOfUsageInstance createArrayOfUsageInstance() {
        return new ArrayOfUsageInstance();
    }

    /**
     * Create an instance of {@link CabinetContentsList }
     * 
     */
    public CabinetContentsList createCabinetContentsList() {
        return new CabinetContentsList();
    }

    /**
     * Create an instance of {@link GetDownlineMeterConnectivity }
     * 
     */
    public GetDownlineMeterConnectivity createGetDownlineMeterConnectivity() {
        return new GetDownlineMeterConnectivity();
    }

    /**
     * Create an instance of {@link PowerSystemDevice }
     * 
     */
    public PowerSystemDevice createPowerSystemDevice() {
        return new PowerSystemDevice();
    }

    /**
     * Create an instance of {@link PowerFactorManagementEvent }
     * 
     */
    public PowerFactorManagementEvent createPowerFactorManagementEvent() {
        return new PowerFactorManagementEvent();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link Truck }
     * 
     */
    public Truck createTruck() {
        return new Truck();
    }

    /**
     * Create an instance of {@link UsageInstance }
     * 
     */
    public UsageInstance createUsageInstance() {
        return new UsageInstance();
    }

    /**
     * Create an instance of {@link MeterRead }
     * 
     */
    public MeterRead createMeterRead() {
        return new MeterRead();
    }

    /**
     * Create an instance of {@link ArrayOfMeasurementType }
     * 
     */
    public ArrayOfMeasurementType createArrayOfMeasurementType() {
        return new ArrayOfMeasurementType();
    }

    /**
     * Create an instance of {@link MeterConnectivity }
     * 
     */
    public MeterConnectivity createMeterConnectivity() {
        return new MeterConnectivity();
    }

    /**
     * Create an instance of {@link LoadManagementEvent }
     * 
     */
    public LoadManagementEvent createLoadManagementEvent() {
        return new LoadManagementEvent();
    }

    /**
     * Create an instance of {@link Usage }
     * 
     */
    public Usage createUsage() {
        return new Usage();
    }

    /**
     * Create an instance of {@link Regulator }
     * 
     */
    public Regulator createRegulator() {
        return new Regulator();
    }

    /**
     * Create an instance of {@link TransformerRatio }
     * 
     */
    public TransformerRatio createTransformerRatio() {
        return new TransformerRatio();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ProfileObject }
     * 
     */
    public ProfileObject createProfileObject() {
        return new ProfileObject();
    }

    /**
     * Create an instance of {@link CustomerCall }
     * 
     */
    public CustomerCall createCustomerCall() {
        return new CustomerCall();
    }

    /**
     * Create an instance of {@link OutageDetectionDevice }
     * 
     */
    public OutageDetectionDevice createOutageDetectionDevice() {
        return new OutageDetectionDevice();
    }

    /**
     * Create an instance of {@link ODDeviceChangedNotificationResponse }
     * 
     */
    public ODDeviceChangedNotificationResponse createODDeviceChangedNotificationResponse() {
        return new ODDeviceChangedNotificationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCDCustomer }
     * 
     */
    public ArrayOfCDCustomer createArrayOfCDCustomer() {
        return new ArrayOfCDCustomer();
    }

    /**
     * Create an instance of {@link ErrorObject }
     * 
     */
    public ErrorObject createErrorObject() {
        return new ErrorObject();
    }

    /**
     * Create an instance of {@link CoordType }
     * 
     */
    public CoordType createCoordType() {
        return new CoordType();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link ScadaStatus }
     * 
     */
    public ScadaStatus createScadaStatus() {
        return new ScadaStatus();
    }

    /**
     * Create an instance of {@link BillingAccountLoad }
     * 
     */
    public BillingAccountLoad createBillingAccountLoad() {
        return new BillingAccountLoad();
    }

    /**
     * Create an instance of {@link SwitchDeviceBank }
     * 
     */
    public SwitchDeviceBank createSwitchDeviceBank() {
        return new SwitchDeviceBank();
    }

    /**
     * Create an instance of {@link GetSiblingMeterConnectivityResponse }
     * 
     */
    public GetSiblingMeterConnectivityResponse createGetSiblingMeterConnectivityResponse() {
        return new GetSiblingMeterConnectivityResponse();
    }

    /**
     * Create an instance of {@link ScadaPoint }
     * 
     */
    public ScadaPoint createScadaPoint() {
        return new ScadaPoint();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link ArrayOfGenericPointFeature }
     * 
     */
    public ArrayOfGenericPointFeature createArrayOfGenericPointFeature() {
        return new ArrayOfGenericPointFeature();
    }

    /**
     * Create an instance of {@link WorkOrderSelection }
     * 
     */
    public WorkOrderSelection createWorkOrderSelection() {
        return new WorkOrderSelection();
    }

    /**
     * Create an instance of {@link ArrayOfEmployee }
     * 
     */
    public ArrayOfEmployee createArrayOfEmployee() {
        return new ArrayOfEmployee();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link CustomersAttachedToDevice }
     * 
     */
    public CustomersAttachedToDevice createCustomersAttachedToDevice() {
        return new CustomersAttachedToDevice();
    }

    /**
     * Create an instance of {@link ScadaAnalog }
     * 
     */
    public ScadaAnalog createScadaAnalog() {
        return new ScadaAnalog();
    }

    /**
     * Create an instance of {@link ArrayOfOutageCustomer }
     * 
     */
    public ArrayOfOutageCustomer createArrayOfOutageCustomer() {
        return new ArrayOfOutageCustomer();
    }

    /**
     * Create an instance of {@link OutageCustomerTimeToCall }
     * 
     */
    public OutageCustomerTimeToCall createOutageCustomerTimeToCall() {
        return new OutageCustomerTimeToCall();
    }

    /**
     * Create an instance of {@link LoadSection }
     * 
     */
    public LoadSection createLoadSection() {
        return new LoadSection();
    }

    /**
     * Create an instance of {@link ArrayOfChannel }
     * 
     */
    public ArrayOfChannel createArrayOfChannel() {
        return new ArrayOfChannel();
    }

    /**
     * Create an instance of {@link MspLoadGroup }
     * 
     */
    public MspLoadGroup createMspLoadGroup() {
        return new MspLoadGroup();
    }

    /**
     * Create an instance of {@link BackgroundGraphics }
     * 
     */
    public BackgroundGraphics createBackgroundGraphics() {
        return new BackgroundGraphics();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link GetMethodsResponse }
     * 
     */
    public GetMethodsResponse createGetMethodsResponse() {
        return new GetMethodsResponse();
    }

    /**
     * Create an instance of {@link GetOutageEventStatus }
     * 
     */
    public GetOutageEventStatus createGetOutageEventStatus() {
        return new GetOutageEventStatus();
    }

    /**
     * Create an instance of {@link MeasurementType }
     * 
     */
    public MeasurementType createMeasurementType() {
        return new MeasurementType();
    }

    /**
     * Create an instance of {@link ArrayOfSource }
     * 
     */
    public ArrayOfSource createArrayOfSource() {
        return new ArrayOfSource();
    }

    /**
     * Create an instance of {@link JobWorked }
     * 
     */
    public JobWorked createJobWorked() {
        return new JobWorked();
    }

    /**
     * Create an instance of {@link ArrayOfTruck }
     * 
     */
    public ArrayOfTruck createArrayOfTruck() {
        return new ArrayOfTruck();
    }

    /**
     * Create an instance of {@link BackSpan }
     * 
     */
    public BackSpan createBackSpan() {
        return new BackSpan();
    }

    /**
     * Create an instance of {@link ArrayOfOutageDetectionDevice }
     * 
     */
    public ArrayOfOutageDetectionDevice createArrayOfOutageDetectionDevice() {
        return new ArrayOfOutageDetectionDevice();
    }

    /**
     * Create an instance of {@link GetDownlineCircuitElements }
     * 
     */
    public GetDownlineCircuitElements createGetDownlineCircuitElements() {
        return new GetDownlineCircuitElements();
    }

    /**
     * Create an instance of {@link Capacitor }
     * 
     */
    public Capacitor createCapacitor() {
        return new Capacitor();
    }

    /**
     * Create an instance of {@link MspSwitchingDevice }
     * 
     */
    public MspSwitchingDevice createMspSwitchingDevice() {
        return new MspSwitchingDevice();
    }

    /**
     * Create an instance of {@link SecondaryJunctionBox }
     * 
     */
    public SecondaryJunctionBox createSecondaryJunctionBox() {
        return new SecondaryJunctionBox();
    }

    /**
     * Create an instance of {@link Pole }
     * 
     */
    public Pole createPole() {
        return new Pole();
    }

    /**
     * Create an instance of {@link PickList }
     * 
     */
    public PickList createPickList() {
        return new PickList();
    }

    /**
     * Create an instance of {@link OhSecondaryLine }
     * 
     */
    public OhSecondaryLine createOhSecondaryLine() {
        return new OhSecondaryLine();
    }

    /**
     * Create an instance of {@link DomainMember }
     * 
     */
    public DomainMember createDomainMember() {
        return new DomainMember();
    }

    /**
     * Create an instance of {@link ArrayOfCPR }
     * 
     */
    public ArrayOfCPR createArrayOfCPR() {
        return new ArrayOfCPR();
    }

    /**
     * Create an instance of {@link ArrayOfMeterConnectivity }
     * 
     */
    public ArrayOfMeterConnectivity createArrayOfMeterConnectivity() {
        return new ArrayOfMeterConnectivity();
    }

    /**
     * Create an instance of {@link TransformerBank }
     * 
     */
    public TransformerBank createTransformerBank() {
        return new TransformerBank();
    }

    /**
     * Create an instance of {@link CustomersAffectedByOutage }
     * 
     */
    public CustomersAffectedByOutage createCustomersAffectedByOutage() {
        return new CustomersAffectedByOutage();
    }

    /**
     * Create an instance of {@link ODEventNotificationResponse }
     * 
     */
    public ODEventNotificationResponse createODEventNotificationResponse() {
        return new ODEventNotificationResponse();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link ArrayOfCircuitElement }
     * 
     */
    public ArrayOfCircuitElement createArrayOfCircuitElement() {
        return new ArrayOfCircuitElement();
    }

    /**
     * Create an instance of {@link ODDeviceChangedNotification }
     * 
     */
    public ODDeviceChangedNotification createODDeviceChangedNotification() {
        return new ODDeviceChangedNotification();
    }

    /**
     * Create an instance of {@link Sectionalizer }
     * 
     */
    public Sectionalizer createSectionalizer() {
        return new Sectionalizer();
    }

    /**
     * Create an instance of {@link GetOutageEventStatusByOutageLocationResponse }
     * 
     */
    public GetOutageEventStatusByOutageLocationResponse createGetOutageEventStatusByOutageLocationResponse() {
        return new GetOutageEventStatusByOutageLocationResponse();
    }

    /**
     * Create an instance of {@link TestInstance }
     * 
     */
    public TestInstance createTestInstance() {
        return new TestInstance();
    }

    /**
     * Create an instance of {@link ObjectRef }
     * 
     */
    public ObjectRef createObjectRef() {
        return new ObjectRef();
    }

    /**
     * Create an instance of {@link ConnectDisconnectList }
     * 
     */
    public ConnectDisconnectList createConnectDisconnectList() {
        return new ConnectDisconnectList();
    }

    /**
     * Create an instance of {@link ArrayOfProfileType }
     * 
     */
    public ArrayOfProfileType createArrayOfProfileType() {
        return new ArrayOfProfileType();
    }

    /**
     * Create an instance of {@link ScadaPoints }
     * 
     */
    public ScadaPoints createScadaPoints() {
        return new ScadaPoints();
    }

    /**
     * Create an instance of {@link GetChildCircuitElementsResponse }
     * 
     */
    public GetChildCircuitElementsResponse createGetChildCircuitElementsResponse() {
        return new GetChildCircuitElementsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEvent }
     * 
     */
    public ArrayOfEvent createArrayOfEvent() {
        return new ArrayOfEvent();
    }

    /**
     * Create an instance of {@link Timesheet }
     * 
     */
    public Timesheet createTimesheet() {
        return new Timesheet();
    }

    /**
     * Create an instance of {@link ServiceLocation }
     * 
     */
    public ServiceLocation createServiceLocation() {
        return new ServiceLocation();
    }

    /**
     * Create an instance of {@link LinkedTransformerUnitList }
     * 
     */
    public LinkedTransformerUnitList createLinkedTransformerUnitList() {
        return new LinkedTransformerUnitList();
    }

    /**
     * Create an instance of {@link OhPrimaryLine }
     * 
     */
    public OhPrimaryLine createOhPrimaryLine() {
        return new OhPrimaryLine();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeTimeRecord }
     * 
     */
    public ArrayOfEmployeeTimeRecord createArrayOfEmployeeTimeRecord() {
        return new ArrayOfEmployeeTimeRecord();
    }

    /**
     * Create an instance of {@link Assembly }
     * 
     */
    public Assembly createAssembly() {
        return new Assembly();
    }

    /**
     * Create an instance of {@link GetOutageEventStatusByOutageLocation }
     * 
     */
    public GetOutageEventStatusByOutageLocation createGetOutageEventStatusByOutageLocation() {
        return new GetOutageEventStatusByOutageLocation();
    }

    /**
     * Create an instance of {@link LoadManagementDevice }
     * 
     */
    public LoadManagementDevice createLoadManagementDevice() {
        return new LoadManagementDevice();
    }

    /**
     * Create an instance of {@link FakeNodeSection }
     * 
     */
    public FakeNodeSection createFakeNodeSection() {
        return new FakeNodeSection();
    }

    /**
     * Create an instance of {@link GetUplineCircuitElementsResponse }
     * 
     */
    public GetUplineCircuitElementsResponse createGetUplineCircuitElementsResponse() {
        return new GetUplineCircuitElementsResponse();
    }

    /**
     * Create an instance of {@link PowerMonitor }
     * 
     */
    public PowerMonitor createPowerMonitor() {
        return new PowerMonitor();
    }

    /**
     * Create an instance of {@link Generator }
     * 
     */
    public Generator createGenerator() {
        return new Generator();
    }

    /**
     * Create an instance of {@link GetUplineMeterConnectivity }
     * 
     */
    public GetUplineMeterConnectivity createGetUplineMeterConnectivity() {
        return new GetUplineMeterConnectivity();
    }

    /**
     * Create an instance of {@link SpatialFeatureGroup }
     * 
     */
    public SpatialFeatureGroup createSpatialFeatureGroup() {
        return new SpatialFeatureGroup();
    }

    /**
     * Create an instance of {@link GetDownlineMeterConnectivityResponse }
     * 
     */
    public GetDownlineMeterConnectivityResponse createGetDownlineMeterConnectivityResponse() {
        return new GetDownlineMeterConnectivityResponse();
    }

    /**
     * Create an instance of {@link ConnectDisconnectEvent }
     * 
     */
    public ConnectDisconnectEvent createConnectDisconnectEvent() {
        return new ConnectDisconnectEvent();
    }

    /**
     * Create an instance of {@link WarehouseLocation }
     * 
     */
    public WarehouseLocation createWarehouseLocation() {
        return new WarehouseLocation();
    }

    /**
     * Create an instance of {@link NodeIdentifier }
     * 
     */
    public NodeIdentifier createNodeIdentifier() {
        return new NodeIdentifier();
    }

    /**
     * Create an instance of {@link WorkTicket }
     * 
     */
    public WorkTicket createWorkTicket() {
        return new WorkTicket();
    }

    /**
     * Create an instance of {@link GetAllCircuitElements }
     * 
     */
    public GetAllCircuitElements createGetAllCircuitElements() {
        return new GetAllCircuitElements();
    }

    /**
     * Create an instance of {@link GetActiveOutages }
     * 
     */
    public GetActiveOutages createGetActiveOutages() {
        return new GetActiveOutages();
    }

    /**
     * Create an instance of {@link ArrayOfErrorObject }
     * 
     */
    public ArrayOfErrorObject createArrayOfErrorObject() {
        return new ArrayOfErrorObject();
    }

    /**
     * Create an instance of {@link CoincidentalValue }
     * 
     */
    public CoincidentalValue createCoincidentalValue() {
        return new CoincidentalValue();
    }

    /**
     * Create an instance of {@link GetSubstationNamesResponse }
     * 
     */
    public GetSubstationNamesResponse createGetSubstationNamesResponse() {
        return new GetSubstationNamesResponse();
    }

    /**
     * Create an instance of {@link PhysicalObjectList }
     * 
     */
    public PhysicalObjectList createPhysicalObjectList() {
        return new PhysicalObjectList();
    }

    /**
     * Create an instance of {@link MultiSpeakMsgHeader }
     * 
     */
    public MultiSpeakMsgHeader createMultiSpeakMsgHeader() {
        return new MultiSpeakMsgHeader();
    }

    /**
     * Create an instance of {@link MaterialComponent }
     * 
     */
    public MaterialComponent createMaterialComponent() {
        return new MaterialComponent();
    }

    /**
     * Create an instance of {@link MspSwitchDeviceList }
     * 
     */
    public MspSwitchDeviceList createMspSwitchDeviceList() {
        return new MspSwitchDeviceList();
    }

    /**
     * Create an instance of {@link ArrayOfChannelBlock }
     * 
     */
    public ArrayOfChannelBlock createArrayOfChannelBlock() {
        return new ArrayOfChannelBlock();
    }

    /**
     * Create an instance of {@link Summation }
     * 
     */
    public Summation createSummation() {
        return new Summation();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link GetDownlineCircuitElementsResponse }
     * 
     */
    public GetDownlineCircuitElementsResponse createGetDownlineCircuitElementsResponse() {
        return new GetDownlineCircuitElementsResponse();
    }

    /**
     * Create an instance of {@link GetDomainMembers }
     * 
     */
    public GetDomainMembers createGetDomainMembers() {
        return new GetDomainMembers();
    }

    /**
     * Create an instance of {@link AssemblyList }
     * 
     */
    public AssemblyList createAssemblyList() {
        return new AssemblyList();
    }

    /**
     * Create an instance of {@link MeterReading }
     * 
     */
    public MeterReading createMeterReading() {
        return new MeterReading();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link TOUReading }
     * 
     */
    public TOUReading createTOUReading() {
        return new TOUReading();
    }

    /**
     * Create an instance of {@link GraphicSymbol }
     * 
     */
    public GraphicSymbol createGraphicSymbol() {
        return new GraphicSymbol();
    }

    /**
     * Create an instance of {@link StreetLight }
     * 
     */
    public StreetLight createStreetLight() {
        return new StreetLight();
    }

    /**
     * Create an instance of {@link Extensions }
     * 
     */
    public Extensions createExtensions() {
        return new Extensions();
    }

    /**
     * Create an instance of {@link MaterialItem }
     * 
     */
    public MaterialItem createMaterialItem() {
        return new MaterialItem();
    }

    /**
     * Create an instance of {@link ArrayOfScadaPoint }
     * 
     */
    public ArrayOfScadaPoint createArrayOfScadaPoint() {
        return new ArrayOfScadaPoint();
    }

    /**
     * Create an instance of {@link MessageList }
     * 
     */
    public MessageList createMessageList() {
        return new MessageList();
    }

    /**
     * Create an instance of {@link GetActiveOutagesResponse }
     * 
     */
    public GetActiveOutagesResponse createGetActiveOutagesResponse() {
        return new GetActiveOutagesResponse();
    }

    /**
     * Create an instance of {@link FeederObject }
     * 
     */
    public FeederObject createFeederObject() {
        return new FeederObject();
    }

    /**
     * Create an instance of {@link ArrayOfCapacitor }
     * 
     */
    public ArrayOfCapacitor createArrayOfCapacitor() {
        return new ArrayOfCapacitor();
    }

    /**
     * Create an instance of {@link LaborComponent }
     * 
     */
    public LaborComponent createLaborComponent() {
        return new LaborComponent();
    }

    /**
     * Create an instance of {@link FlowDemand }
     * 
     */
    public FlowDemand createFlowDemand() {
        return new FlowDemand();
    }

    /**
     * Create an instance of {@link ArrayOfGraphicSymbol }
     * 
     */
    public ArrayOfGraphicSymbol createArrayOfGraphicSymbol() {
        return new ArrayOfGraphicSymbol();
    }

    /**
     * Create an instance of {@link GetModifiedCircuitElementsResponse }
     * 
     */
    public GetModifiedCircuitElementsResponse createGetModifiedCircuitElementsResponse() {
        return new GetModifiedCircuitElementsResponse();
    }

    /**
     * Create an instance of {@link PcbTestList }
     * 
     */
    public PcbTestList createPcbTestList() {
        return new PcbTestList();
    }

    /**
     * Create an instance of {@link ArrayOfJobWorked }
     * 
     */
    public ArrayOfJobWorked createArrayOfJobWorked() {
        return new ArrayOfJobWorked();
    }

    /**
     * Create an instance of {@link GpsLocation }
     * 
     */
    public GpsLocation createGpsLocation() {
        return new GpsLocation();
    }

    /**
     * Create an instance of {@link PickListItem }
     * 
     */
    public PickListItem createPickListItem() {
        return new PickListItem();
    }

    /**
     * Create an instance of {@link OutageCustomer }
     * 
     */
    public OutageCustomer createOutageCustomer() {
        return new OutageCustomer();
    }

    /**
     * Create an instance of {@link ArrayOfAllocatedLoad }
     * 
     */
    public ArrayOfAllocatedLoad createArrayOfAllocatedLoad() {
        return new ArrayOfAllocatedLoad();
    }

    /**
     * Create an instance of {@link Conductor }
     * 
     */
    public Conductor createConductor() {
        return new Conductor();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link ArrayOfTransformer }
     * 
     */
    public ArrayOfTransformer createArrayOfTransformer() {
        return new ArrayOfTransformer();
    }

    /**
     * Create an instance of {@link CPR }
     * 
     */
    public CPR createCPR() {
        return new CPR();
    }

    /**
     * Create an instance of {@link LinkedTransformer }
     * 
     */
    public LinkedTransformer createLinkedTransformer() {
        return new LinkedTransformer();
    }

    /**
     * Create an instance of {@link ArrayOfRegulator }
     * 
     */
    public ArrayOfRegulator createArrayOfRegulator() {
        return new ArrayOfRegulator();
    }

    /**
     * Create an instance of {@link CumDemand }
     * 
     */
    public CumDemand createCumDemand() {
        return new CumDemand();
    }

    /**
     * Create an instance of {@link MeterReadTOUReadings }
     * 
     */
    public MeterReadTOUReadings createMeterReadTOUReadings() {
        return new MeterReadTOUReadings();
    }

    /**
     * Create an instance of {@link GetDomainNames }
     * 
     */
    public GetDomainNames createGetDomainNames() {
        return new GetDomainNames();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link Recloser }
     * 
     */
    public Recloser createRecloser() {
        return new Recloser();
    }

    /**
     * Create an instance of {@link Riser }
     * 
     */
    public Riser createRiser() {
        return new Riser();
    }

    /**
     * Create an instance of {@link ArrayOfEquipment }
     * 
     */
    public ArrayOfEquipment createArrayOfEquipment() {
        return new ArrayOfEquipment();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JointUse }
     * 
     */
    public JointUse createJointUse() {
        return new JointUse();
    }

    /**
     * Create an instance of {@link RegulatorBank }
     * 
     */
    public RegulatorBank createRegulatorBank() {
        return new RegulatorBank();
    }

    /**
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link DisplayFormat }
     * 
     */
    public DisplayFormat createDisplayFormat() {
        return new DisplayFormat();
    }

    /**
     * Create an instance of {@link Registers }
     * 
     */
    public Registers createRegisters() {
        return new Registers();
    }

    /**
     * Create an instance of {@link ArrayOfGenericLineFeature }
     * 
     */
    public ArrayOfGenericLineFeature createArrayOfGenericLineFeature() {
        return new ArrayOfGenericLineFeature();
    }

    /**
     * Create an instance of {@link CrewActionEvent }
     * 
     */
    public CrewActionEvent createCrewActionEvent() {
        return new CrewActionEvent();
    }

    /**
     * Create an instance of {@link Nameplate }
     * 
     */
    public Nameplate createNameplate() {
        return new Nameplate();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link ODEventNotification }
     * 
     */
    public ODEventNotification createODEventNotification() {
        return new ODEventNotification();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     * 
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link OutageLocation }
     * 
     */
    public OutageLocation createOutageLocation() {
        return new OutageLocation();
    }

    /**
     * Create an instance of {@link GenericAnnotationFeature }
     * 
     */
    public GenericAnnotationFeature createGenericAnnotationFeature() {
        return new GenericAnnotationFeature();
    }

    /**
     * Create an instance of {@link ArrayOfLaborComponent }
     * 
     */
    public ArrayOfLaborComponent createArrayOfLaborComponent() {
        return new ArrayOfLaborComponent();
    }

    /**
     * Create an instance of {@link Fuse }
     * 
     */
    public Fuse createFuse() {
        return new Fuse();
    }

    /**
     * Create an instance of {@link ArrayOfBackSpan }
     * 
     */
    public ArrayOfBackSpan createArrayOfBackSpan() {
        return new ArrayOfBackSpan();
    }

    /**
     * Create an instance of {@link PingURLResponse }
     * 
     */
    public PingURLResponse createPingURLResponse() {
        return new PingURLResponse();
    }

    /**
     * Create an instance of {@link GetParentCircuitElements }
     * 
     */
    public GetParentCircuitElements createGetParentCircuitElements() {
        return new GetParentCircuitElements();
    }

    /**
     * Create an instance of {@link ComplexNum }
     * 
     */
    public ComplexNum createComplexNum() {
        return new ComplexNum();
    }

    /**
     * Create an instance of {@link GetAllCircuitElementsResponse }
     * 
     */
    public GetAllCircuitElementsResponse createGetAllCircuitElementsResponse() {
        return new GetAllCircuitElementsResponse();
    }

    /**
     * Create an instance of {@link ChannelBlock }
     * 
     */
    public ChannelBlock createChannelBlock() {
        return new ChannelBlock();
    }

    /**
     * Create an instance of {@link CircuitElement }
     * 
     */
    public CircuitElement createCircuitElement() {
        return new CircuitElement();
    }

    /**
     * Create an instance of {@link CDCustomer }
     * 
     */
    public CDCustomer createCDCustomer() {
        return new CDCustomer();
    }

    /**
     * Create an instance of {@link GetDomainMembersResponse }
     * 
     */
    public GetDomainMembersResponse createGetDomainMembersResponse() {
        return new GetDomainMembersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWarehouseLocation }
     * 
     */
    public ArrayOfWarehouseLocation createArrayOfWarehouseLocation() {
        return new ArrayOfWarehouseLocation();
    }

    /**
     * Create an instance of {@link Meter }
     * 
     */
    public Meter createMeter() {
        return new Meter();
    }

    /**
     * Create an instance of {@link OutageEventStatus }
     * 
     */
    public OutageEventStatus createOutageEventStatus() {
        return new OutageEventStatus();
    }

    /**
     * Create an instance of {@link GetChildCircuitElements }
     * 
     */
    public GetChildCircuitElements createGetChildCircuitElements() {
        return new GetChildCircuitElements();
    }

    /**
     * Create an instance of {@link GetParentCircuitElementsResponse }
     * 
     */
    public GetParentCircuitElementsResponse createGetParentCircuitElementsResponse() {
        return new GetParentCircuitElementsResponse();
    }

    /**
     * Create an instance of {@link OvercurrentDeviceBank }
     * 
     */
    public OvercurrentDeviceBank createOvercurrentDeviceBank() {
        return new OvercurrentDeviceBank();
    }

    /**
     * Create an instance of {@link ReadingValue }
     * 
     */
    public ReadingValue createReadingValue() {
        return new ReadingValue();
    }

    /**
     * Create an instance of {@link HistoryLog }
     * 
     */
    public HistoryLog createHistoryLog() {
        return new HistoryLog();
    }

    /**
     * Create an instance of {@link Network }
     * 
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link LineStringType }
     * 
     */
    public LineStringType createLineStringType() {
        return new LineStringType();
    }

    /**
     * Create an instance of {@link ShortCircuitAnalysisResult }
     * 
     */
    public ShortCircuitAnalysisResult createShortCircuitAnalysisResult() {
        return new ShortCircuitAnalysisResult();
    }

    /**
     * Create an instance of {@link Substation }
     * 
     */
    public Substation createSubstation() {
        return new Substation();
    }

    /**
     * Create an instance of {@link GetUplineCircuitElements }
     * 
     */
    public GetUplineCircuitElements createGetUplineCircuitElements() {
        return new GetUplineCircuitElements();
    }

    /**
     * Create an instance of {@link UgSecondaryLine }
     * 
     */
    public UgSecondaryLine createUgSecondaryLine() {
        return new UgSecondaryLine();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link ReadingObject }
     * 
     */
    public ReadingObject createReadingObject() {
        return new ReadingObject();
    }

    /**
     * Create an instance of {@link EaLoc }
     * 
     */
    public EaLoc createEaLoc() {
        return new EaLoc();
    }

    /**
     * Create an instance of {@link MeasurementDevice }
     * 
     */
    public MeasurementDevice createMeasurementDevice() {
        return new MeasurementDevice();
    }

    /**
     * Create an instance of {@link GenericLineFeature }
     * 
     */
    public GenericLineFeature createGenericLineFeature() {
        return new GenericLineFeature();
    }

    /**
     * Create an instance of {@link LaborCategory }
     * 
     */
    public LaborCategory createLaborCategory() {
        return new LaborCategory();
    }

    /**
     * Create an instance of {@link Transformer }
     * 
     */
    public Transformer createTransformer() {
        return new Transformer();
    }

    /**
     * Create an instance of {@link EmployeeTimeRecord }
     * 
     */
    public EmployeeTimeRecord createEmployeeTimeRecord() {
        return new EmployeeTimeRecord();
    }

    /**
     * Create an instance of {@link ArrayOfOutageDetectionEvent }
     * 
     */
    public ArrayOfOutageDetectionEvent createArrayOfOutageDetectionEvent() {
        return new ArrayOfOutageDetectionEvent();
    }

    /**
     * Create an instance of {@link LoadFlowResult }
     * 
     */
    public LoadFlowResult createLoadFlowResult() {
        return new LoadFlowResult();
    }

    /**
     * Create an instance of {@link ArrayOfDomainMember }
     * 
     */
    public ArrayOfDomainMember createArrayOfDomainMember() {
        return new ArrayOfDomainMember();
    }

    /**
     * Create an instance of {@link UgPrimaryLine }
     * 
     */
    public UgPrimaryLine createUgPrimaryLine() {
        return new UgPrimaryLine();
    }

    /**
     * Create an instance of {@link OutageDetectionEvent }
     * 
     */
    public OutageDetectionEvent createOutageDetectionEvent() {
        return new OutageDetectionEvent();
    }

    /**
     * Create an instance of {@link Breaker }
     * 
     */
    public Breaker createBreaker() {
        return new Breaker();
    }

    /**
     * Create an instance of {@link GetUplineMeterConnectivityResponse }
     * 
     */
    public GetUplineMeterConnectivityResponse createGetUplineMeterConnectivityResponse() {
        return new GetUplineMeterConnectivityResponse();
    }

    /**
     * Create an instance of {@link AllocatedLoad }
     * 
     */
    public AllocatedLoad createAllocatedLoad() {
        return new AllocatedLoad();
    }

    /**
     * Create an instance of {@link ArrayOfFeederObject }
     * 
     */
    public ArrayOfFeederObject createArrayOfFeederObject() {
        return new ArrayOfFeederObject();
    }

    /**
     * Create an instance of {@link Motor }
     * 
     */
    public Motor createMotor() {
        return new Motor();
    }

    /**
     * Create an instance of {@link ArrayOfJointUse }
     * 
     */
    public ArrayOfJointUse createArrayOfJointUse() {
        return new ArrayOfJointUse();
    }

    /**
     * Create an instance of {@link GetMethods }
     * 
     */
    public GetMethods createGetMethods() {
        return new GetMethods();
    }

    /**
     * Create an instance of {@link MspOverCurrentDeviceList }
     * 
     */
    public MspOverCurrentDeviceList createMspOverCurrentDeviceList() {
        return new MspOverCurrentDeviceList();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "parentSectionID", scope = MspConnectivityPoint.class)
    public JAXBElement<ObjectRef> createMspConnectivityPointParentSectionID(ObjectRef value) {
        return new JAXBElement<ObjectRef>(_MspConnectivityPointParentSectionID_QNAME, ObjectRef.class, MspConnectivityPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "sectionID", scope = MspConnectivityPoint.class)
    public JAXBElement<String> createMspConnectivityPointSectionID(String value) {
        return new JAXBElement<String>(_MspConnectivityPointSectionID_QNAME, String.class, MspConnectivityPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "toNodeID", scope = MspConnectivityPoint.class)
    public JAXBElement<NodeIdentifier> createMspConnectivityPointToNodeID(NodeIdentifier value) {
        return new JAXBElement<NodeIdentifier>(_MspConnectivityPointToNodeID_QNAME, NodeIdentifier.class, MspConnectivityPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "fromNodeID", scope = MspConnectivityPoint.class)
    public JAXBElement<NodeIdentifier> createMspConnectivityPointFromNodeID(NodeIdentifier value) {
        return new JAXBElement<NodeIdentifier>(_MspConnectivityPointFromNodeID_QNAME, NodeIdentifier.class, MspConnectivityPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSpeakMsgHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "MultiSpeakMsgHeader")
    public JAXBElement<MultiSpeakMsgHeader> createMultiSpeakMsgHeader(MultiSpeakMsgHeader value) {
        return new JAXBElement<MultiSpeakMsgHeader>(_MultiSpeakMsgHeader_QNAME, MultiSpeakMsgHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "manuallyModified", scope = Status.class)
    public JAXBElement<Boolean> createStatusManuallyModified(Boolean value) {
        return new JAXBElement<Boolean>(_StatusManuallyModified_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "clockBackward", scope = Status.class)
    public JAXBElement<Boolean> createStatusClockBackward(Boolean value) {
        return new JAXBElement<Boolean>(_StatusClockBackward_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "clockForward", scope = Status.class)
    public JAXBElement<Boolean> createStatusClockForward(Boolean value) {
        return new JAXBElement<Boolean>(_StatusClockForward_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "longInterval", scope = Status.class)
    public JAXBElement<Boolean> createStatusLongInterval(Boolean value) {
        return new JAXBElement<Boolean>(_StatusLongInterval_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "overflow", scope = Status.class)
    public JAXBElement<Boolean> createStatusOverflow(Boolean value) {
        return new JAXBElement<Boolean>(_StatusOverflow_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "invalid", scope = Status.class)
    public JAXBElement<Boolean> createStatusInvalid(Boolean value) {
        return new JAXBElement<Boolean>(_StatusInvalid_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "configChanged", scope = Status.class)
    public JAXBElement<Boolean> createStatusConfigChanged(Boolean value) {
        return new JAXBElement<Boolean>(_StatusConfigChanged_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "manuallyEntered", scope = Status.class)
    public JAXBElement<Boolean> createStatusManuallyEntered(Boolean value) {
        return new JAXBElement<Boolean>(_StatusManuallyEntered_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "DSTinEffect", scope = Status.class)
    public JAXBElement<Boolean> createStatusDSTinEffect(Boolean value) {
        return new JAXBElement<Boolean>(_StatusDSTinEffect_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "testData", scope = Status.class)
    public JAXBElement<Boolean> createStatusTestData(Boolean value) {
        return new JAXBElement<Boolean>(_StatusTestData_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "recorderStopped", scope = Status.class)
    public JAXBElement<Boolean> createStatusRecorderStopped(Boolean value) {
        return new JAXBElement<Boolean>(_StatusRecorderStopped_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "partialInterval", scope = Status.class)
    public JAXBElement<Boolean> createStatusPartialInterval(Boolean value) {
        return new JAXBElement<Boolean>(_StatusPartialInterval_QNAME, Boolean.class, Status.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "parentSectionID", scope = MspConnectivityLine.class)
    public JAXBElement<ObjectRef> createMspConnectivityLineParentSectionID(ObjectRef value) {
        return new JAXBElement<ObjectRef>(_MspConnectivityPointParentSectionID_QNAME, ObjectRef.class, MspConnectivityLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "sectionID", scope = MspConnectivityLine.class)
    public JAXBElement<String> createMspConnectivityLineSectionID(String value) {
        return new JAXBElement<String>(_MspConnectivityPointSectionID_QNAME, String.class, MspConnectivityLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "toNodeID", scope = MspConnectivityLine.class)
    public JAXBElement<NodeIdentifier> createMspConnectivityLineToNodeID(NodeIdentifier value) {
        return new JAXBElement<NodeIdentifier>(_MspConnectivityPointToNodeID_QNAME, NodeIdentifier.class, MspConnectivityLine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/Version_3.0", name = "fromNodeID", scope = MspConnectivityLine.class)
    public JAXBElement<NodeIdentifier> createMspConnectivityLineFromNodeID(NodeIdentifier value) {
        return new JAXBElement<NodeIdentifier>(_MspConnectivityPointFromNodeID_QNAME, NodeIdentifier.class, MspConnectivityLine.class, value);
    }

}
